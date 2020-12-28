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
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
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
                    List<Map<String, Object>> dataList = clstationService.getCLStationDeviceListByCondition(linkTableName, vmTracePartBySerialNumberOrWorkOrderInput, "=");
                    if (!CollectionUtils.isEmpty(dataList)) {
                        for (Map<String, Object> map : dataList) {
//                            String serialNumber = map.get("SerialNumber") == null ? null : virtualSerialNumberService.getSerialNumberById(Integer.parseInt(map.get("SerialNumber").toString()));
//                            map.put("SerialNumber", serialNumber);
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
                    Integer rowCount = clstationService.getTotalCountCLStationDeviceListByCondition(linkTableName, vmTracePartBySerialNumberOrWorkOrderInput, "=");

                    List<TableHeaderDTO> filterList = TableHeaderDTO.filterHeaders(headerList, StationUtil.getFilterStartsWithCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.startsWith);
                    filterList = TableHeaderDTO.filterHeaders(filterList, StationUtil.getFilterEqualsCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.equals);

                    //字段排序（忽略产品条码、工单、创建时间）
                    filterList = filterList.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).filter(h -> !h.getDataIndex().equals("CREATE_DATE")).collect(Collectors.toList());

                    Collections.sort(filterList, new ComparatorUtil());//.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).collect(Collectors.toList())
                    String serialNumberHeader = "产品条码";
                    String serialNumberIndex = "SerialNumber";
                    if(linkTableName.equals("CL_TUOP25") || linkTableName.equals("CL_TUOP80")){
                        Collections.rotate(filterList, 8);//从list后面往前数，移动倒数第八个位置移到第一个
                    }else if(linkTableName.equals("CL_TUOP50")) {
                        for (Map<String, Object> map : dataList) {
                            String pierRivetingInspection = map.get("DB20_DBX56_7") == null ? null : map.get("DB20_DBX56_7").toString();
                            //铆压相机检测:铆钉NG(总产品)
                            String rivetingCameraDetection = map.get("DB20_DBX60_2") == null ? null : map.get("DB20_DBX60_2").toString();
                            if (pierRivetingInspection != null && pierRivetingInspection.equals("1")) {
                                //隐藏整平工位和下料保存
                                map.put("RivetingPressure", map.get("DB1_DBD8"));//墩铆检测:铆压位移
                                map.put("RivetingDisplacement", map.get("DB1_DBD12"));//墩铆检测:铆压压力
                            }else if (rivetingCameraDetection != null && rivetingCameraDetection.equals("1")) {
                                //隐藏整平工位和墩铆检测
                                StationUtil.hidePierRivetingInspection(map);
                                map.put("RivetingPressure", map.get("DB10_DBD1838"));//下料保存:铆压位移
                                map.put("RivetingDisplacement", map.get("DB10_DBD1842"));//下料保存:铆压压力
                            }
                            map.put("LevelingTestResult", map.get("DB20_DBX57_1") == null ? null : (map.get("DB20_DBX57_1").equals("1") ? "NG" : "OK"));//整平工位:整平OK
                            map.put("RivetCamera", map.get("DB20_DBX57_4") == null ? null : (map.get("DB20_DBX57_4").equals("1") ? "NG" : "OK"));//铆钉相机检测:铆钉NG
                            map.put("PierRivetingResults", map.get("DB20_DBX56_7") == null ? null : (map.get("DB20_DBX56_7").equals("1") ? "NG" : "OK"));//墩铆检测:铆钉NG
                            map.put("RivetingCameraDetection", map.get("DB20_DBX60_2") == null ? null : (map.get("DB20_DBX60_2").equals("1") ? "NG" : "OK"));//铆压相机检测:铆钉NG
                            map.put("ReadResults", map.get("M15_6") == null ? null : (map.get("M15_6").equals("1") ? "NG" : "OK"));//铆压相机检测:铆钉NG
//							}
                        }
                        TableHeaderDTO rivetingPressure  = new TableHeaderDTO("铆压压力", "RivetingPressure");
                        TableHeaderDTO rivetingDisplacement  = new TableHeaderDTO("铆压位移", "RivetingDisplacement");
                        TableHeaderDTO levelingStationNG  = new TableHeaderDTO("整平测试结果", "LevelingTestResult");
                        TableHeaderDTO rivetCamera  = new TableHeaderDTO("铆钉相机", "RivetCamera");
                        TableHeaderDTO pierRivetingResults  = new TableHeaderDTO("墩铆结果", "PierRivetingResults");
                        TableHeaderDTO rivetingCameraDetection  = new TableHeaderDTO("铆压相机检测", "RivetingCameraDetection");
                        TableHeaderDTO readResults  = new TableHeaderDTO("读取结果", "ReadResults");
                        filterList.add(rivetingPressure);
                        filterList.add(rivetingDisplacement);
                        filterList.add(levelingStationNG);
                        filterList.add(rivetCamera);
                        filterList.add(pierRivetingResults);
                        filterList.add(rivetingCameraDetection);
                        filterList.add(readResults);
                    }else if(linkTableName.equals("CL_TCOP10")){
                        serialNumberHeader = "泵轮条码";
                        serialNumberIndex = "DB9_DBX1006_0";
                        filterList.clear();
                        TableHeaderDTO serialNumber1  = new TableHeaderDTO("闭锁条码", "DB9_DBX922_0");
                        TableHeaderDTO serialNumber2  = new TableHeaderDTO("导轮条码", "DB9_DBX964_0");
                        TableHeaderDTO serialNumber3  = new TableHeaderDTO("罩轮条码", "DB9_DBX1048_0");
                        TableHeaderDTO batch1 = new TableHeaderDTO("轴承1批次号", "DB9_DBW1568");
                        TableHeaderDTO batch2 = new TableHeaderDTO("轴承2批次号", "DB9_DBW1570");
                        filterList.add(serialNumber1);
                        filterList.add(serialNumber2);
                        filterList.add(serialNumber3);
                        filterList.add(batch1);
                        filterList.add(batch2);
                    }
                    TableHeaderDTO tableHeaderDTO1 = new TableHeaderDTO(serialNumberHeader, serialNumberIndex);
                    TableHeaderDTO tableHeaderDTO2 = new TableHeaderDTO("工单", "WorkOrderId");
                    TableHeaderDTO tableHeaderDTO4 = new TableHeaderDTO("测试结果", "IS_OK");
                    TableHeaderDTO tableHeaderDTO3 = new TableHeaderDTO("创建时间", "CREATE_DATE");
                    filterList.add(0, tableHeaderDTO1);
                    filterList.add(1, tableHeaderDTO2);
                    filterList.add(2, tableHeaderDTO4);
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
                    List<Map<String, Object>> dataList = clstationService.getCLStationDeviceListByCondition(linkTableName, vmTracePartBySerialNumberOrWorkOrderInput, "=");
                    if (!CollectionUtils.isEmpty(dataList)) {
                        for (Map<String, Object> map : dataList) {
                            Integer workOrderId = map.get("WorkOrderId") == null ? null : Integer.parseInt(map.get("WorkOrderId").toString());
                            if (workOrderId != null) {
                                String workOrderNumber = clstationService.getWorkOrderNumberByWorkOrderId(workOrderId);
                                map.put("WorkOrderId", workOrderNumber);
                            }
                            map.put("IS_OK", map.get("IS_OK") == null ? null : Integer.parseInt(map.get("IS_OK").toString().trim()) == 0 ? "NG" : "OK");//(1=OK,2=NG) 0NG，1OK
                            if(map.containsKey("DB100_DBX10_0")){
                                map.put("DB100_DBX10_0", map.get("DB100_DBX10_0") == null ? null : Integer.parseInt(map.get("DB100_DBX10_0").toString().trim()) == 0 ? "OK" : "NG");//0:OK，1:NG
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
                    TableHeaderDTO tableHeaderDTO4 = new TableHeaderDTO("测试结果", "IS_OK");
                    TableHeaderDTO tableHeaderDTO3 = new TableHeaderDTO("创建时间", "CREATE_DATE");
                    filterList.add(0, tableHeaderDTO1);
                    filterList.add(1, tableHeaderDTO2);
                    filterList.add(2, tableHeaderDTO4);
                    filterList.add(3,tableHeaderDTO3);

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

//                    File file = new File(webappPath+"\\"+fileName); //写文件
                    File file = new File(webappPath + File.separator + fileName); //写文件
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
