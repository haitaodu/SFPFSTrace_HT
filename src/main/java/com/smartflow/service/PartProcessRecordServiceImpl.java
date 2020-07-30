package com.smartflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartflow.dao.PartProcessRecordDao;
import com.smartflow.dto.VMTracePartByStationInput;
import com.smartflow.model.PartProcessRecord;
@Service
public class PartProcessRecordServiceImpl implements PartProcessRecordService {

	@Autowired
	PartProcessRecordDao partProcessRecordDao;
	
	@Override
	public Integer getTotalCountFromPartProcessRecordList(VMTracePartByStationInput vmTracePartByStationInput) {
		return partProcessRecordDao.getTotalCountFromPartProcessRecordList(vmTracePartByStationInput);
	}
	
	@Override
	public List<PartProcessRecord> getPartProcessRecordList(VMTracePartByStationInput vmTracePartByStationInput) {
		return partProcessRecordDao.getPartProcessRecordList(vmTracePartByStationInput);
	}

}
