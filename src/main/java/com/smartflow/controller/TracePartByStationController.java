package com.smartflow.controller;

import com.smartflow.dto.TableHeaderDTO;
import com.smartflow.dto.VMTracePartByStationInput;
import com.smartflow.dto.VMTracePartByStationOutput;
import com.smartflow.service.CL_StationService;
import com.smartflow.service.StationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public TracePartByStationController(CL_StationService clstationService,  StationService stationService) {
		this.clstationService = clstationService;
		this.stationService = stationService;
	}

	/**
	 * 获取工站下拉列表
	 * @return 返回初始化的下拉列表
	 */
	@CrossOrigin(origins="*",maxAge=3600)
	@PostMapping(value="/GetPageInit")
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
					headerList = clstationService.getHeaderListByLinkTableName(linkTableName);
					Integer rowCount = clstationService.getTotalCountCLStationDeviceListByLinkTableName
							(linkTableName, vmTracePartByStationInput);
					vmTracePartByStationOutput.setHeaderList(headerList);
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
}
