package com.smartflow.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author haita
 */
@RestController
@RequestMapping("/api/TraceMaterialSetupRecord")
public class TraceMaterialSetupRecordController extends BaseController{
	private static Logger logger = Logger.getLogger(TracePartMaterialRecordController.class);
	@CrossOrigin(origins="*",maxAge=3600)
	@PostMapping(value="/GetStationList")
	public Map<String, Object> getStationList()
	{
		Map<String, Object> json=new HashMap<>();
		try {
			Map<String, Object> map=new HashMap<>();
			List<Map<String, Object>> stationList=new ArrayList<>();
			for(Integer i=0;i<=5;i++)
			{
				Map<String, Object> station=new HashMap<>();
				station.put("key", i);
				station.put("label", "station"+i.toString());
				stationList.add(station);
			}
			map.put("StationList", stationList);
			json=this.setJson(200, "查询成功", map);
 		}
		catch (Exception e) {
			json = this.setJson(0, "查询失败："+e.getMessage(), -1);
			logger.error(e);
		}
		return json;
	}
}
