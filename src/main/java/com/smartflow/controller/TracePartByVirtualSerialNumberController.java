package com.smartflow.controller;

import com.smartflow.common.stationenum.FilterModeEnum;
import com.smartflow.dto.TableHeaderDTO;
import com.smartflow.dto.UpdateStateByUUIDListInputDTO;
import com.smartflow.dto.VMTracePartBySerialNumberOrWorkOrderInput;
import com.smartflow.dto.VMTracePartByStationOutput;
import com.smartflow.service.CL_StationService;
import com.smartflow.service.StationService;
import com.smartflow.service.VirtualSerialNumberService;
import com.smartflow.service.WorkOrderService;
import com.smartflow.util.ComparatorUtil;
import com.smartflow.util.StationUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/TracePartByVirtualSerialNumber")
public class TracePartByVirtualSerialNumberController extends BaseController{
    private static final Logger logger = Logger.getLogger(TracePartByVirtualSerialNumberController.class);
    @Autowired
    CL_StationService clstationService;

    @Autowired
    StationService stationService;

    @Autowired
    WorkOrderService workOrderService;

    @Autowired
    VirtualSerialNumberService virtualSerialNumberService;

    /**
     * 获取工站下拉列表
     * @return 返回初始化的下拉列表
     */
    @CrossOrigin(origins="*",maxAge=3600)
    @GetMapping(value="/GetStationAndWorkOrderInit")
    public Map<String, Object> getStation(){
        Map<String,Object> json = new HashMap<>();
        try{
            Map<String,Object> map = new HashMap<>();
            List<Map<String, Object>> stationList = stationService.getStationListInFrontOfMarkingMachine();
            List<Map<String,Object>> workOrderList = workOrderService.getWorkOrderInit();
            map.put("StationList", stationList);
            map.put("WorkOrderList", workOrderList);
            json = this.setJson(200, "初始化成功", map);
        }catch(Exception e){
            json = this.setJson(0, "查询失败："+e.getMessage(), -1);
            logger.error(e.getCause());
        }
        return json;
    }
    /**
     * 通过序列号（或者工单）、开始时间、结束时间查询工件相关信息
     * @param vmTracePartBySerialNumberOrWorkOrderInput 前端给出的数据模型
     * @return 返回工站序列号
     */
    @CrossOrigin(origins="*",maxAge=3600)
    @PostMapping(value="/TracePartByVirtualSerialNumber")
    public Map<String, Object> tracePartBySerialNumberOrWorkOrder(@RequestBody VMTracePartBySerialNumberOrWorkOrderInput vmTracePartBySerialNumberOrWorkOrderInput){
        Map<String, Object> json = new HashMap<>();
        VMTracePartByStationOutput vmTracePartByStationOutput = new VMTracePartByStationOutput();
        List<TableHeaderDTO> headerList;
        try {
            if (vmTracePartBySerialNumberOrWorkOrderInput.getPageIndex() == null) {
                vmTracePartBySerialNumberOrWorkOrderInput.setPageIndex(1);
            }
            if (StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getStationId())) {
                json = this.setJson(0, "工站不能为空！", -1);
                return json;
            }else{
                String linkTableName = clstationService.getLinkTableNameByStationId(vmTracePartBySerialNumberOrWorkOrderInput.getStationId());
                if (linkTableName == null) {
                    json = this.setJson(0, "工站没有关联的表！", -1);
                    return json;
                } else {
                    List<Map<String, Object>> dataList = clstationService.getCLStationDeviceListByCondition(linkTableName, vmTracePartBySerialNumberOrWorkOrderInput, "like");
                    if (!CollectionUtils.isEmpty(dataList)) {
                        for (Map<String, Object> map : dataList) {
                            Integer workOrderId = map.get("WorkOrderId") == null ? null : Integer.parseInt(map.get("WorkOrderId").toString());
                            if (workOrderId != null) {
                                String workOrderNumber = clstationService.getWorkOrderNumberByWorkOrderId(workOrderId);
                                map.put("WorkOrderId", workOrderNumber);
                            }
                            map.put("IS_OK", map.get("IS_OK") == null ? null : Integer.parseInt(map.get("IS_OK").toString().trim()) == 0 ? "NG" : "OK");//(1=OK,2=NG) 0NG，1OK
                        }
                    }
                    DecimalFormat df = new DecimalFormat("##.####");//保留四位小数（默认四舍五入）
                    dataList.stream().filter(map ->{
                        for (Map.Entry<String,Object> entry: map.entrySet()){
                            map.put(entry.getKey(),StringUtils.isEmpty(entry.getValue()) ? null : (entry.getValue() instanceof Double ? df.format(entry.getValue(), new StringBuffer(), new FieldPosition(NumberFormat.FRACTION_FIELD)) : entry.getValue()));
                        }
                        return true;
                    }).collect(Collectors.toList());
                    headerList = clstationService.getHeaderListByLinkTableName(linkTableName);
                    Integer rowCount = clstationService.getTotalCountCLStationDeviceListByCondition(linkTableName, vmTracePartBySerialNumberOrWorkOrderInput, "like");

                    List<TableHeaderDTO> filterList = TableHeaderDTO.filterHeaders(headerList, StationUtil.getFilterStartsWithCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.startsWith);
                    filterList = TableHeaderDTO.filterHeaders(filterList, StationUtil.getFilterEqualsCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.equals);

                    //字段排序（忽略产品条码、工单、创建时间）
                    filterList = filterList.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).filter(h -> !h.getDataIndex().equals("CREATE_DATE")).collect(Collectors.toList());

                    Collections.sort(filterList, new ComparatorUtil());//.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).collect(Collectors.toList())
                    if(linkTableName.equals("CL_TUOP25") || linkTableName.equals("CL_TUOP80")){
                        Collections.rotate(filterList, 8);//从list后面往前数，移动倒数第八个位置移到第一个
                    }
                    TableHeaderDTO tableHeaderDTO1 = new TableHeaderDTO("产品条码", "SerialNumber");
                    TableHeaderDTO tableHeaderDTO2 = new TableHeaderDTO("工单", "WorkOrderId");
                    TableHeaderDTO tableHeaderDTO4 = new TableHeaderDTO("测试结果", "IS_OK");
                    TableHeaderDTO tableHeaderDTO3 = new TableHeaderDTO("创建时间", "CREATE_DATE");
                    TableHeaderDTO tableHeaderDTO5 = new TableHeaderDTO("状态", "state");
                    filterList.add(0, tableHeaderDTO1);
                    filterList.add(1, tableHeaderDTO2);
                    filterList.add(2, tableHeaderDTO4);
                    filterList.add(3,tableHeaderDTO3);
                    filterList.add(tableHeaderDTO5);
                    vmTracePartByStationOutput.setHeaderList(filterList);
                    vmTracePartByStationOutput.setDataList(dataList == null ? new ArrayList<>() : dataList);
                    vmTracePartByStationOutput.setTotal(rowCount);
                    json = this.setJson(200, "查询成功", vmTracePartByStationOutput);
                }
            }
        }catch(Exception e){
            json = this.setJson(0, "查询失败："+e.getMessage(), -1);
            logger.error(e.getCause());
        }
        return json;
    }

    /**
     * 状态一键置0或1
     * @param updateStateByUUIDListInputDTO
     * @return
     */
    @CrossOrigin(origins="*",maxAge=3600)
    @PostMapping(value="/UpdateStateByUUIDList")
    public Map<String, Object> updateStateByUUIDList(@RequestBody UpdateStateByUUIDListInputDTO updateStateByUUIDListInputDTO){
        Map<String,Object> json = new HashMap<>();
        try{
            clstationService.updateStateByUUIDList(updateStateByUUIDListInputDTO);
            json = this.setJson(200, "状态一键置"+updateStateByUUIDListInputDTO.getButtonValue()+"成功", 0);
        }catch (Exception e){
            e.printStackTrace();
            json = this.setJson(0, "状态一键置"+updateStateByUUIDListInputDTO.getButtonValue()+"失败："+e.getMessage(), -1);
        }
        return json;
    }
}
