package com.smartflow.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartflow.dao.StationDao;

@Service
public class StationServiceImpl implements StationService {

	@Autowired
	StationDao stationDao;
	
	@Override
	public List<Map<String, Object>> getStation() {
		return stationDao.getStation();
	}
}
