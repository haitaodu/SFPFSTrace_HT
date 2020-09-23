package com.smartflow.controller;

import com.smartflow.common.stationenum.FilterModeEnum;
import com.smartflow.dto.TableHeaderDTO;
import com.smartflow.dto.VMTracePartBySerialNumberOrWorkOrderInput;
import com.smartflow.dto.VMTracePartByStationOutput;
import com.smartflow.service.CL_StationService;
import com.smartflow.service.StationService;
import com.smartflow.service.VirtualSerialNumberService;
import com.smartflow.service.WorkOrderService;
import com.smartflow.util.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/TracePartBySerialNumberOrWorkOrder")
public class TracePartBySerialNumberOrWorkOrderController extends BaseController{
    private static final Logger logger = Logger.getLogger(TracePartBySerialNumberOrWorkOrderController.class);
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
    @GetMapping (value="/GetStationAndWorkOrderInit")
    public Map<String, Object> getStation(){
        Map<String,Object> json = new HashMap<>();
        try{
            Map<String,Object> map = new HashMap<>();
            List<Map<String, Object>> stationList = stationService.getStation();
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
    @PostMapping(value="/TracePartBySerialNumberOrWorkOrder")
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
//                if(StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber())) {
//                    if (vmTracePartBySerialNumberOrWorkOrderInput.getWorkOrderId() == null || "".equals(vmTracePartBySerialNumberOrWorkOrderInput.getWorkOrderId().toString())) {
//                        json = this.setJson(0, "工单不能为空！", -1);
//                        return json;
//                    }
//                }
                if (linkTableName == null) {
                    json = this.setJson(0, "工站没有关联的表！", -1);
                    return json;
                } else {
                    List<Map<String, Object>> dataList = clstationService.getCLStationDeviceListByCondition(linkTableName, vmTracePartBySerialNumberOrWorkOrderInput);
                    if (!CollectionUtils.isEmpty(dataList)) {
                        for (Map<String, Object> map : dataList) {
//                            String serialNumber = map.get("SerialNumber") == null ? null : virtualSerialNumberService.getSerialNumberById(Integer.parseInt(map.get("SerialNumber").toString()));
//                            map.put("SerialNumber", serialNumber);
                            Integer workOrderId = map.get("WorkOrderId") == null ? null : Integer.parseInt(map.get("WorkOrderId").toString());
                            if (workOrderId != null) {
                                String workOrderNumber = clstationService.getWorkOrderNumberByWorkOrderId(workOrderId);
                                map.put("WorkOrderId", workOrderNumber);
                            }
                        }
                    }
                    headerList = clstationService.getHeaderListByLinkTableName(linkTableName);
                    Integer rowCount = clstationService.getTotalCountCLStationDeviceListByCondition(linkTableName, vmTracePartBySerialNumberOrWorkOrderInput);

                    List<TableHeaderDTO> filterList = TableHeaderDTO.filterHeaders(headerList, StationUtil.getFilterStartsWithCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.startsWith);
                    filterList = TableHeaderDTO.filterHeaders(filterList, StationUtil.getFilterEqualsCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.equals);

                    //字段排序（忽略产品条码、工单、创建时间）
                    filterList = filterList.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).filter(h -> !h.getDataIndex().equals("CREATE_DATE")).collect(Collectors.toList());

                    Collections.sort(filterList, new ComparatorUtil());//.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).collect(Collectors.toList())
                    TableHeaderDTO tableHeaderDTO1 = new TableHeaderDTO("产品条码", "SerialNumber");
                    TableHeaderDTO tableHeaderDTO2 = new TableHeaderDTO("工单", "WorkOrderId");
                    TableHeaderDTO tableHeaderDTO3 = new TableHeaderDTO("创建时间", "CREATE_DATE");
                    filterList.add(0, tableHeaderDTO1);
                    filterList.add(1, tableHeaderDTO2);
                    filterList.add(tableHeaderDTO3);
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

    @CrossOrigin(origins="*",maxAge=3600)
    @PostMapping(value="/ExportDataToExcel")
    public Map<String,Object> ExportDataToExcel(@RequestBody VMTracePartBySerialNumberOrWorkOrderInput vmTracePartBySerialNumberOrWorkOrderInput, HttpServletRequest request){
        Map<String,Object> json = new HashMap<>();
        List<TableHeaderDTO> headerList;
        try {
            Map<String, Object> fileMap = new HashMap<>();
            if (vmTracePartBySerialNumberOrWorkOrderInput.getPageIndex() == null) {
                vmTracePartBySerialNumberOrWorkOrderInput.setPageIndex(1);
            }
            vmTracePartBySerialNumberOrWorkOrderInput.setPageSize(1000);
            if (StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getStationId())) {
                json = this.setJson(0, "工站不能为空！", -1);
                return json;
            }else{
                String linkTableName = clstationService.getLinkTableNameByStationId(vmTracePartBySerialNumberOrWorkOrderInput.getStationId());//
                if (linkTableName == null) {
                    json = this.setJson(0, "工站没有关联的表！", -1);
                    return json;
                } else {
                    List<Map<String, Object>> dataList = clstationService.getCLStationDeviceListByCondition(linkTableName, vmTracePartBySerialNumberOrWorkOrderInput);
                    if (!CollectionUtils.isEmpty(dataList)) {
                        for (Map<String, Object> map : dataList) {
                            Integer workOrderId = map.get("WorkOrderId") == null ? null : Integer.parseInt(map.get("WorkOrderId").toString());
                            if (workOrderId != null) {
                                String workOrderNumber = clstationService.getWorkOrderNumberByWorkOrderId(workOrderId);
                                map.put("WorkOrderId", workOrderNumber);
                            }
                        }
                    }
                    headerList = clstationService.getHeaderListByLinkTableName(linkTableName);
                    List<TableHeaderDTO> filterList = TableHeaderDTO.filterHeaders(headerList, StationUtil.getFilterStartsWithCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.startsWith);
                    filterList = TableHeaderDTO.filterHeaders(filterList, StationUtil.getFilterEqualsCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.equals);

                    //字段排序（忽略产品条码、工单、创建时间）
                    filterList = filterList.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).filter(h -> !h.getDataIndex().equals("CREATE_DATE")).collect(Collectors.toList());

                    Collections.sort(filterList, new ComparatorUtil());//.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).collect(Collectors.toList())
                    TableHeaderDTO tableHeaderDTO1 = new TableHeaderDTO("产品条码", "SerialNumber");
                    TableHeaderDTO tableHeaderDTO2 = new TableHeaderDTO("工单", "WorkOrderId");
                    TableHeaderDTO tableHeaderDTO3 = new TableHeaderDTO("创建时间", "CREATE_DATE");
                    filterList.add(0, tableHeaderDTO1);
                    filterList.add(1, tableHeaderDTO2);
                    filterList.add(tableHeaderDTO3);

                    List<Map<String,Object>> dataMapList = new ArrayList<>();
                    for (Map<String,Object> dataMap:dataList) {
                        Map<String,Object> map = new LinkedHashMap<>();
                        for (TableHeaderDTO header:filterList) {
                            if(dataMap.containsKey(header.getDataIndex())){
                                map.put(header.getDataIndex(), dataMap.get(header.getDataIndex()));
                            }
                        }
                        dataMapList.add(map);
                    }

                    String webappPath = request.getSession().getServletContext().getRealPath("/upload");
                    String filePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/upload/";
                    String fileName = "工站相关信息.xls";
                    ExportExcelUtil exportExcelUtil = new ExportExcelUtil();

                    File file = new File(webappPath+"\\"+fileName); //写文件

                    //不存在则新增
                    if(!file.getParentFile().exists()){
                        file.getParentFile().mkdirs();
                    }
                    if(!file.exists()){
                        file.createNewFile();
                    }
//                    exportExcelUtil.exportExcel("工站生产信息", filterList.stream().map(h -> h.getTitle()).toArray(String[] :: new), dataList, new FileOutputStream(file), null);
                    ExcelUtil.exportExcel(dataMapList, filterList.stream().map(h -> h.getTitle()).toArray(String[] :: new), webappPath, fileName);
                    fileMap.put("FilePath", filePath+fileName);
                    json = this.setJson(200, "查询成功", fileMap);
                }
            }
        }catch(Exception e){
            json = this.setJson(0, "查询失败："+e.getMessage(), -1);
            logger.error(e.getCause());
        }
        return json;
    }
}
