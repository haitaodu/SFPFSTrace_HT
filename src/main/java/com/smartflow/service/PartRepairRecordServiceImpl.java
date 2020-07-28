package com.smartflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartflow.dao.PartRepairRecordDao;
import com.smartflow.dto.VMPartRepairRecordInput;
import com.smartflow.model.PartFailureDataRecord;
import com.smartflow.model.PartRepairQualityCheckRecord;
import com.smartflow.model.PartRepairRecord;
import com.smartflow.model.PartSerialNumber;

@Service
public class PartRepairRecordServiceImpl implements PartRepairRecordService {

	@Autowired
	PartRepairRecordDao partRepairRecordDao;
	
	@Override
	public List<PartSerialNumber> getPartSerialNumberBySerialNumber(VMPartRepairRecordInput vmPartRepairRecordInput) {
		return partRepairRecordDao.getPartSerialNumberBySerialNumber(vmPartRepairRecordInput);
	}

	@Override
	public List<PartRepairRecord> getPartRepairRecordBySerialNumber(VMPartRepairRecordInput vmPartRepairRecordInput) {
		return partRepairRecordDao.getPartRepairRecordBySerialNumber(vmPartRepairRecordInput);
	}
	
	@Override
	public PartRepairRecord getPartRepairRecordById(Integer id) {
		return partRepairRecordDao.getPartRepairRecordById(id);
	}

	@Override
	public Integer getTotalCountFromPartRepairRecordBySerialNumber(VMPartRepairRecordInput vmPartRepairRecordInput) {
		return partRepairRecordDao.getTotalCountFromPartRepairRecordBySerialNumber(vmPartRepairRecordInput);
	}

	@Override
	public Integer getTotalCountFromPartRepairRecordById(Integer id) {
		return partRepairRecordDao.getTotalCountFromPartRepairRecordById(id);
	}

	@Override
	public PartRepairQualityCheckRecord getPartRepairQualityCheckRecordByPartRepairRecordId(
			Integer partRepairRecordId) {		
		return partRepairRecordDao.getPartRepairQualityCheckRecordByPartRepairRecordId(partRepairRecordId);
	}

	@Override
	public List<PartFailureDataRecord> getPartFailureDataRecordByPartRepairRecordId(Integer partRepairRecordId) {
		return partRepairRecordDao.getPartFailureDataRecordByPartRepairRecordId(partRepairRecordId);
	}

	@Override
	public Integer getTotalCountFromPartFailureDataRecordByPartRepairRecordId(Integer partRepairRecordId) {
		return partRepairRecordDao.getTotalCountFromPartFailureDataRecordByPartRepairRecordId(partRepairRecordId);
	}

}
