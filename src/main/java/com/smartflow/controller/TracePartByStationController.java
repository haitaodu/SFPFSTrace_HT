package com.smartflow.controller;

import com.smartflow.common.stationenum.FilterModeEnum;
import com.smartflow.dto.TableHeaderDTO;
import com.smartflow.dto.VMTracePartByStationInput;
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
import org.springframework.web.bind.annotation.*;

import java.util.*;
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

	@Autowired
	VirtualSerialNumberService virtualSerialNumberService;

	@Autowired
	public TracePartByStationController(CL_StationService clstationService,  StationService stationService) {
		this.clstationService = clstationService;
		this.stationService = stationService;
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
						}
					}
					headerList = clstationService.getHeaderListByLinkTableName(linkTableName);
					Integer rowCount = clstationService.getTotalCountCLStationDeviceListByLinkTableName
							(linkTableName, vmTracePartByStationInput);
//					String[] dataIndexList = filterList.stream().map(h -> h.getDataIndex()).toArray(String[] :: new);//.collect(Collectors.toList());
//					Arrays.sort(StationUtil.getTargetSortString(dataIndexList), StationUtil.ChsLogicCmp);
//					filterList.stream().forEach(System.out::println);
//					System.out.println("==============================================");
//					filterList.stream().skip(1).skip(2).forEach(System.out::println);

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
