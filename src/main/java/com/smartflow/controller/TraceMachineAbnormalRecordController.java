package com.smartflow.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/TraceMachineAbnormalRecord")
public class TraceMachineAbnormalRecordController extends BaseController{

	private static Logger logger = Logger.getLogger(TracePartMaterialRecordController.class);
	@CrossOrigin(origins="*",maxAge=3600)
	@RequestMapping(value="/GetStationListForCombox",method=RequestMethod.POST)
	public Map<String, Object> getStationListForCombox()
	{
		Map<String, Object> json=new HashMap<>();
		try {
			Map<String, Object> map=new HashMap<>();
			List<Map<String, Object>> stationList=new ArrayList<>();
			for(Integer i=0;i<=5;i++)
			{
				Map<String, Object> station=new HashMap<>();
				station.put("StationId", i);
				station.put("label", "stationenum"+i.toString());
				stationList.add(station);
			}
			map.put("StationList", stationList);
			json=this.setJson(200, "查询成功", map);
 		}
		catch (Exception e) {
			// TODO: handle exception
			json = this.setJson(0, "查询失败："+e.getMessage(), -1);
			logger.error(e);
			e.printStackTrace();
		}
		return json;
	}
}
