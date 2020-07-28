package com.smartflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartflow.dao.PartSerialNumberDao;
import com.smartflow.dto.VMPartProcessRecordInput;
import com.smartflow.model.PartSerialNumber;
import com.smartflow.model.SerialNumber;
import com.smartflow.model.SlavePartSerialNumber;
import com.smartflow.util.SerialDataByWorkOrder;
@Service
public class PartSerialNumberServiceImpl implements PartSerialNumberService {

	@Autowired
	PartSerialNumberDao partSerialNumberDao;

	@Override
	public Integer getTotalCountFromPartSerialNumberBySerialNumber(VMPartProcessRecordInput vmPartProcessRecordInput) {
		return partSerialNumberDao.getTotalCountFromPartSerialNumberBySerialNumber(vmPartProcessRecordInput);
	}	
	@Override
	public List<PartSerialNumber> getPartSerialNumberBySerialNumber(VMPartProcessRecordInput vmPartProcessRecordInput) {
		return partSerialNumberDao.getPartSerialNumberBySerialNumber(vmPartProcessRecordInput);
	}

	@Override
	public List<PartSerialNumber> getPartSerialNumberBySerialNumberDesc(VMPartProcessRecordInput vmPartProcessRecordInput) {
		return partSerialNumberDao.getPartSerialNumberBySerialNumberDesc(vmPartProcessRecordInput);
	}

	@Override
	public List<SerialDataByWorkOrder> getPartSerialNumberByWorkOrder(int pageIndex, int pageSize,
			String workOrderNumber) {
		// TODO Auto-generated method stub
		return partSerialNumberDao.getPartSerialNumberByWorkOrder(pageIndex, pageSize, workOrderNumber)
				;
	}

	@Override
	public int countByWorkOrder(int pageIndex, int pageSize, String workOrderNumber) {
		// TODO Auto-generated method stub
		return partSerialNumberDao.countByWorkOrder(pageIndex, pageSize, workOrderNumber);
	}

	@Override
	public List<SerialNumber> getPartSerialNumberByListId(List<Integer> idList) {
		// TODO Auto-generated method stub
		return partSerialNumberDao.getPartSerialNumberByListId(idList);
	}

	@Override
	public SlavePartSerialNumber getPartSerialNumberByParentSerialNumberId(int MasterPartSerialNumberId) {
		// TODO Auto-generated method stub
		return partSerialNumberDao.getPartSerialNumberByParentSerialNumberId(MasterPartSerialNumberId);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		partSerialNumberDao.init();
	}

	@Override
	public SerialNumber getPartSerialNumberById(Integer id) {
		// TODO Auto-generated method stub
		return partSerialNumberDao.getPartSerialNumberById(id);
	}
	@Override
	public List<Integer> getProdcutBySlaveId(Integer id) {
		// TODO Auto-generated method stub
		return partSerialNumberDao.getProdcutBySlaveId(id);
	}	

}
