package com.smartflow.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.smartflow.view.StationList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartflow.dao.StationDao;
import org.springframework.util.CollectionUtils;

/**
 * @author haita
 */
@Service
public class StationServiceImpl implements StationService {

	private final static int  printStation=13;
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

	@Override
	public List<Map<String, Object>> getStationListInFrontOfMarkingMachine() {
		List<Map<String,Object>> stationList = new ArrayList<>();
		List<Map<String,Object>> markingMachineList = stationDao.getMarkingMachineIdAndCellId();
		if(!CollectionUtils.isEmpty(markingMachineList)){
			for (Map<String,Object> map: markingMachineList) {
				Integer stationId = Integer.parseInt(map.get("Id").toString());
				Integer cellId = Integer.parseInt(map.get("CellId").toString());
				List<Map<String,Object>> markingMachineStationList = stationDao.getStationListInFrontOfMarkingMachineByStationIdAndCellId(stationId, cellId);
				stationList.addAll(markingMachineStationList);
			}
		}
		return stationList;
	}

	@Override
	public Integer getStationIdByStationNumber(String stationNumber) {
		return stationDao.getStationIdByStationNumber(stationNumber);
	}
}
