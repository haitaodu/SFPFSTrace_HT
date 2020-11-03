package com.smartflow.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.smartflow.view.StationList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartflow.dao.StationDao;

/**
 * @author haita
 */
@Service
public class StationServiceImpl implements StationService {

	private final static int  printStation=11;
	private final
	StationDao stationDao;

	@Autowired
	public StationServiceImpl(StationDao stationDao) {
		this.stationDao = stationDao;
	}

	@Override
	public List<Map<String, Object>> getStation() {
		return stationDao.getStation();
	}

	@Override
	public Map<String,Object> getStationList(String stationNumer, long workOrderId) {
		int cellId=stationDao.getCellByWorkOrderId(workOrderId,stationNumer);
		List<StationList> stationLists=stationDao.getStationList(workOrderId,cellId);
		List<String> stationNames=new ArrayList<>();
		Map<String,Object> map= new HashMap<>();
		for (StationList stationList:stationLists
		) {
			if (stationList.getStationType()==printStation)
			{
				String arg=stationList.getStationNumber().replace
						("_","");
				map.put("PrintStation","CL_"+arg);
				break;
			}
			String arg=stationList.getStationNumber().replace("_","");
			stationNames.add("CL_"+arg);

		}
		stationNames.remove("CL_TUOP40");
		map.put("List",stationNames);
		return map;
	}
}
