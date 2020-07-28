package com.smartflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartflow.dao.TracePartMaterialRecord;
import com.smartflow.util.MaterialContainer;
@Service
public class TracePartMaterialRecordServiceImpl implements TracePartMaterialRecordService{
@Autowired
TracePartMaterialRecord tracePartMaterialRecordDao;
	@Override
	public List<MaterialContainer> getDataForMaterialRecord(String containerNumber, String materialPartNumber,
			String supplierCode, String batchNumber, String supplierMaterialPartNumber, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return tracePartMaterialRecordDao.getDataForMaterialRecord(containerNumber, materialPartNumber, supplierCode, batchNumber, supplierMaterialPartNumber, pageIndex, pageSize);
	}
	@Override
	public int getCountData(String containerNumber, String materialPartNumber, String supplierCode, String batchNumber,
			String supplierMaterialPartNumber, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return tracePartMaterialRecordDao.getCountData(containerNumber, materialPartNumber, supplierCode, batchNumber, supplierMaterialPartNumber, pageIndex, pageSize);
	}

}
