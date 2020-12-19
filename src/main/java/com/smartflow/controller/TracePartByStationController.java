package com.smartflow.controller;

import com.smartflow.common.stationenum.FilterModeEnum;
import com.smartflow.dto.TableHeaderDTO;
import com.smartflow.dto.VMTracePartByStationInput;
import com.smartflow.dto.VMTracePartByStationOutput;
import com.smartflow.model.CL_TUOP50;
import com.smartflow.service.CL_StationService;
import com.smartflow.service.StationService;
import com.smartflow.service.VirtualSerialNumberService;
import com.smartflow.service.WorkOrderService;
import com.smartflow.util.ComparatorUtil;
import com.smartflow.util.StationUtil;
import lombok.val;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 通过工站追溯工件
 * @author admin
 *
 */
@RestController
@RequestMapping("/api/TracePartByStation")
public class TracePartByStationController extends BaseController{
	private static final Logger logger = Logger.getLogger(TracePartByStationController.class);
	private final
	StationService stationService;
	private Map<String, Object> json = new HashMap<>(7);
    private static final String GET_FALL="查询失败:";
	private static final String GET_SUCESS="查询成功!";
	private static final int  SUCESS_CODE=200;
	private static final int  FALL_CODE=0;
	private final
	CL_StationService clstationService;

	private final
	VirtualSerialNumberService virtualSerialNumberService;

	@Autowired
	public TracePartByStationController(CL_StationService clstationService, StationService stationService, VirtualSerialNumberService virtualSerialNumberService) {
		this.clstationService = clstationService;
		this.stationService = stationService;
		this.virtualSerialNumberService = virtualSerialNumberService;
	}

	/**
	 * 获取工站下拉列表
	 * @return 返回初始化的下拉列表
	 */
	@CrossOrigin(origins="*",maxAge=3600)
	@GetMapping (value="/GetPageInit")
	public Map<String, Object> getStation(){
		try{
			List<Map<String, Object>> stationList = stationService.getStation();
			json = this.setJson(SUCESS_CODE, GET_SUCESS, stationList);
		}catch(Exception e){
			json = this.setJson(FALL_CODE, GET_FALL+e.getMessage(), -1);
			logger.error(e.getCause());
		}
		return json;
	}
	
	/**
	 * 通过选择的站点和时间日期限定查询工件序列号
	 * @param vmTracePartByStationInput 前端给出的数据模式
	 * @return 返回工站序列号
	 */
	@CrossOrigin(origins="*",maxAge=3600)
	@PostMapping(value="/TracePartByStation")
	public Map<String, Object> tracePartByStation(@RequestBody VMTracePartByStationInput vmTracePartByStationInput){

		VMTracePartByStationOutput vmTracePartByStationOutput = new VMTracePartByStationOutput();
		List<TableHeaderDTO> headerList;
		try {
			if (vmTracePartByStationInput.getPageIndex() == null) {
				vmTracePartByStationInput.setPageIndex(1);
			}
			if (vmTracePartByStationInput.getStationId() == null || "".equals(vmTracePartByStationInput.getStationId().toString())) {
				json = this.setJson(FALL_CODE, "工站不能为空！", -1);
				return json;
			} else {
				String linkTableName = clstationService.getLinkTableNameByStationId(vmTracePartByStationInput.getStationId());
				if (linkTableName == null) {
					json = this.setJson(FALL_CODE, "工站没有关联的表！", -1);
					return json;
				} else {
					List<Map<String,Object>> dataList = clstationService.getCLStationDeviceListByLinkTableName(linkTableName, vmTracePartByStationInput);

					if(!CollectionUtils.isEmpty(dataList)){
						for (Map<String,Object> map: dataList) {
							//String serialNumber = map.get("SerialNumber") == null ? null : virtualSerialNumberService.getSerialNumberById(Integer.parseInt(map.get("SerialNumber").toString()));
							map.put("SerialNumber", map.get("SerialNumber"));
							Integer workOrderId = map.get("WorkOrderId") == null ? null : Integer.parseInt(map.get("WorkOrderId").toString());
							if(workOrderId != null){
								String workOrderNumber = clstationService.getWorkOrderNumberByWorkOrderId(workOrderId);
								map.put("WorkOrderId", workOrderNumber);
							}
							map.put("IS_OK", map.get("IS_OK") == null ? null : Integer.parseInt(map.get("IS_OK").toString().trim()) == 0 ? "NG" : "OK");//(1=OK,2=NG) 0NG，1OK
							if(map.containsKey("DB100_DBX10_0")){
								map.put("DB100_DBX10_0", map.get("DB100_DBX10_0") == null ? null : Integer.parseInt(map.get("DB100_DBX10_0").toString().trim()) == 0 ? "OK" : "NG");//0:OK，1:NG
							}
							//map.values().stream().map(value -> StringUtils.isEmpty(value) ? null : (value instanceof Double ? df.format(value, new StringBuffer(), new FieldPosition(NumberFormat.FRACTION_FIELD)) : value)).collect(Collectors.toList());
						}
					}
					DecimalFormat df = new DecimalFormat("##.####");//保留四位小数（默认四舍五入）
					//StringBuffer sb = new StringBuffer();
					//df.setRoundingMode(RoundingMode.UP);// 向上取值设置
					//df.format(value, sb, new FieldPosition(NumberFormat.FRACTION_FIELD));
					dataList.stream().filter(map ->{
						for (Map.Entry<String,Object> entry: map.entrySet()){
							map.put(entry.getKey(),StringUtils.isEmpty(entry.getValue()) ? null : (entry.getValue() instanceof Double ? df.format(entry.getValue(), new StringBuffer(), new FieldPosition(NumberFormat.FRACTION_FIELD)) : entry.getValue()));
						}
						return true;
					}).collect(Collectors.toList());
					headerList = clstationService.getHeaderListByLinkTableName(linkTableName);
					Integer rowCount = clstationService.getTotalCountCLStationDeviceListByLinkTableName
							(linkTableName, vmTracePartByStationInput);
					List<TableHeaderDTO> filterList = TableHeaderDTO.filterHeaders(headerList, StationUtil.getFilterStartsWithCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.startsWith);
                    filterList = TableHeaderDTO.filterHeaders(filterList, StationUtil.getFilterEqualsCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.equals);

                    //字段排序（忽略产品条码、工单、创建时间）
                    filterList = filterList.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).filter(h -> !h.getDataIndex().equals("CREATE_DATE")).collect(Collectors.toList());

					Collections.sort(filterList, new ComparatorUtil());//.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).collect(Collectors.toList())
					if(linkTableName.equals("CL_TUOP25") || linkTableName.equals("CL_TUOP80")){
						Collections.rotate(filterList, 8);//从list后面往前数，移动倒数第八个位置移到第一个
//						TableHeaderDTO tableHeaderDTO5 = new TableHeaderDTO("清水液位", "MD448");
//						filterList.set(3, tableHeaderDTO5);
//						tableHeaderDTO5 = new TableHeaderDTO("污水液位", "MD452");
//						filterList.set(4, tableHeaderDTO5);
//						tableHeaderDTO5 = new TableHeaderDTO("气源压力", "MD456");
//						filterList.set(5, tableHeaderDTO5);
//						tableHeaderDTO5 = new TableHeaderDTO("喷淋压力", "MD460");
//						filterList.set(6, tableHeaderDTO5);
//						tableHeaderDTO5 = new TableHeaderDTO("循环压力", "MD464");
//						filterList.set(7, tableHeaderDTO5);
//						tableHeaderDTO5 = new TableHeaderDTO("清洁度", "MD468");
//						filterList.set(8, tableHeaderDTO5);
//						tableHeaderDTO5 = new TableHeaderDTO("水箱温度", "MD472");
//						filterList.set(9, tableHeaderDTO5);
//						tableHeaderDTO5 = new TableHeaderDTO("烘箱温度", "MD476");
//						filterList.set(10, tableHeaderDTO5);
					}else if(linkTableName.equals("CL_TUOP50")) {
						for (Map<String, Object> map : dataList) {
//							String iS_OK = map.get("IS_OK") == null ? null : map.get("IS_OK").toString().trim();
							//整平工位:整平NG
//							String levelingStationNG = map.get("DB20_DBX57_1") == null ? null : map.get("DB20_DBX57_1").toString();
							//墩铆检测
							String pierRivetingInspection = map.get("DB20_DBX56_7") == null ? null : map.get("DB20_DBX56_7").toString();
							//铆压相机检测:铆钉NG(总产品)
							String rivetingCameraDetection = map.get("DB20_DBX60_2") == null ? null : map.get("DB20_DBX60_2").toString();
//							if (iS_OK.equals("OK")) {//0:OK，1:NG
//								//隐藏整平工位和墩铆检测
//								StationUtil.hideLevelingStationNGData(map);
//								StationUtil.hidePierRivetingInspection(map);
//							}else {
								//select DB20_DBX57_0,DB20_DBX57_1,DB20_DBX56_6,DB20_DBX56_7,DB20_DBX60_1,DB20_DBX60_2 from core.CL_TUOP50 order by CREATE_DATE desc;
								//如果六列都是空或者整平NG是空，墩铆NG是0，相机检测（总产品）NG是0  说明第一道工序整平就已经NG（只显示整平两列数据） // || (levelingStationNG == null && (pierRivetingInspection == null || pierRivetingInspection.equals("0")) && (rivetingCameraDetection == null || rivetingCameraDetection.equals("0")))
//								if ((levelingStationNG != null && levelingStationNG.equals("1"))) {
//									//隐藏墩铆检测和下料保存
//									StationUtil.hidePierRivetingInspection(map);
//									StationUtil.hideBlankingPreservation(map);
//								}else
								if (pierRivetingInspection != null && pierRivetingInspection.equals("1")) {
									//隐藏整平工位和下料保存
									//StationUtil.hideLevelingStationNGData(map);
									//StationUtil.hideBlankingPreservation(map);
									map.put("RivetingPressure", map.get("DB1_DBD8"));//墩铆检测:铆压位移
									map.put("RivetingDisplacement", map.get("DB1_DBD12"));//墩铆检测:铆压压力
								}else if (rivetingCameraDetection != null && rivetingCameraDetection.equals("1")) {
									//隐藏整平工位和墩铆检测
//									StationUtil.hideLevelingStationNGData(map);
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
//						filterList.add(6,rivetingPressure);
//						filterList.add(7,rivetingDisplacement);
//						filterList.add(8,levelingStationNG);
//						filterList.add(9,rivetCamera);
//						filterList.add(10,pierRivetingResults);
//						filterList.add(11,rivetingCameraDetection);
//						filterList.add(12,readResults);
					}
					TableHeaderDTO tableHeaderDTO1 = new TableHeaderDTO("产品条码", "SerialNumber");
					TableHeaderDTO tableHeaderDTO2 = new TableHeaderDTO("工单", "WorkOrderId");
					TableHeaderDTO tableHeaderDTO4 = new TableHeaderDTO("测试结果", "IS_OK");
					TableHeaderDTO tableHeaderDTO3 = new TableHeaderDTO("创建时间", "CREATE_DATE");
				    filterList.add(0, tableHeaderDTO1);
					filterList.add(1, tableHeaderDTO2);
					filterList.add(2, tableHeaderDTO4);
					filterList.add(3,tableHeaderDTO3);

//					List<String> list = filterList.stream().map(f -> f.getDataIndex()).collect(Collectors.toList());
//					for (String s:list) {
//						dataList = dataList.stream().filter(x -> !x.containsKey(s)).collect(Collectors.toList());
//					}
					vmTracePartByStationOutput.setHeaderList(filterList);
					vmTracePartByStationOutput.setDataList(dataList == null ? new ArrayList<>() : dataList);
					vmTracePartByStationOutput.setTotal(rowCount);
					json = this.setJson(SUCESS_CODE, GET_SUCESS, vmTracePartByStationOutput);
				}
			}
		}catch(Exception e){
			json = this.setJson(FALL_CODE, GET_FALL+e.getMessage(), -1);
			logger.error(e.getCause());
		}		
		return json;
	}

    /**
     * 根据工站获取设备相关信息
     * @param stationId
     * @return
     */
    @CrossOrigin(origins="*",maxAge=3600)
    @GetMapping(value="/GetStationInformationByStation/{stationId}")
	public Map<String, Object> getStationInformationByStation(@PathVariable Integer stationId){
	    Map<String,Object> json = new HashMap<>();
        List<Map<String,Object>> dataMapList = new ArrayList<>();
	    try {
            String linkTableName = clstationService.getLinkTableNameByStationId(stationId);
            if (linkTableName == null) {
                json = this.setJson(FALL_CODE, "工站没有关联的表！", -1);
                return json;
            } else {
                List<Map<String, Object>> dataList = clstationService.getCLStationDeviceListByLinkTableName(linkTableName);
                Map<String, Object> map = new HashMap<>();
                if (!CollectionUtils.isEmpty(dataList)) {
                    map = dataList.get(0);
                    Integer workOrderId = map.get("WorkOrderId") == null ? null : Integer.parseInt(map.get("WorkOrderId").toString());
                    if (workOrderId != null) {
                        String workOrderNumber = clstationService.getWorkOrderNumberByWorkOrderId(workOrderId);
                        map.put("WorkOrderId", workOrderNumber);
                    }
                }
                List<TableHeaderDTO> headerList = clstationService.getHeaderListByLinkTableName(linkTableName);
                for (TableHeaderDTO tableHeaderDTO : headerList) {
                    Map<String,Object> dataMap = new HashMap<>();
                    dataMap.put("name", tableHeaderDTO.getTitle());
                    dataMap.put("value", map.get(tableHeaderDTO.getDataIndex()));
                    dataMapList.add(dataMap);
                }

    //        List<TableHeaderDTO> filterList = TableHeaderDTO.filterHeaders(headerList, StationUtil.getFilterStartsWithCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.startsWith);
    //        filterList = TableHeaderDTO.filterHeaders(filterList, StationUtil.getFilterEqualsCondition(), TableHeaderDTO::getDataIndex, FilterModeEnum.equals);

                //字段排序（忽略产品条码、工单、创建时间）
    //        filterList = filterList.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).filter(h -> !h.getDataIndex().equals("CREATE_DATE")).collect(Collectors.toList());

    //        Collections.sort(filterList, new ComparatorUtil());//.stream().filter(h -> !h.getDataIndex().equals("SerialNumber")).filter(h -> !h.getDataIndex().equals("WorkOrderId")).collect(Collectors.toList())
    //        TableHeaderDTO tableHeaderDTO1 = new TableHeaderDTO("产品条码", "SerialNumber");
    //        TableHeaderDTO tableHeaderDTO2 = new TableHeaderDTO("工单", "WorkOrderId");
    //        TableHeaderDTO tableHeaderDTO3 = new TableHeaderDTO("创建时间", "CREATE_DATE");
    //        filterList.add(0, tableHeaderDTO1);
    //        filterList.add(1, tableHeaderDTO2);
    //        filterList.add(tableHeaderDTO3);
                json = this.setJson(SUCESS_CODE, GET_SUCESS, dataMapList);
            }
        }catch(Exception e){
            json = this.setJson(FALL_CODE, GET_FALL+e.getMessage(), -1);
            logger.error(e.getCause());
        }
        return json;
    }
}
