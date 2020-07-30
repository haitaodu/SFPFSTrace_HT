package com.smartflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartflow.dao.GetPartMaterialRecordByPartSerialNumberDao;
import com.smartflow.util.MaterialRecordOutput;
/**
 * @author haita
 */
@Service
public class GetPartMaterialRecordByPartSerialNumberServiceImpl implements GetPartMaterialRecordByPartSerialNumberService{
@Autowired
GetPartMaterialRecordByPartSerialNumberDao getMaterialRecord;
	@Override
	public MaterialRecordOutput getPartMaterialRecordById(String serialNumber) {
		// TODO Auto-generated method stub
		return getMaterialRecord.getPartMaterialRecordById(serialNumber);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		getMaterialRecord.init();
	}

}
