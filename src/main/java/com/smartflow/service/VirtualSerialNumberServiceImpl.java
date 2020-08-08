package com.smartflow.service;

import com.smartflow.dao.VirtualSerialNumberDao;
import com.smartflow.model.VirtualSerialNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VirtualSerialNumberServiceImpl implements VirtualSerialNumberService {
    @Autowired
    VirtualSerialNumberDao virtualSerialNumberDao;
    @Override
    public void addVirtualSerialNumber(VirtualSerialNumber virtualSerialNumber) {
        virtualSerialNumberDao.addVirtualSerialNumber(virtualSerialNumber);
    }

    @Override
    public void updateVirtualSerialNumber(VirtualSerialNumber virtualSerialNumber) {
        virtualSerialNumberDao.updateVirtualSerialNumber(virtualSerialNumber);
    }

    @Override
    public VirtualSerialNumber getVirtualSerialNumberByWorkOrderId(Integer workOrderId) {
        return virtualSerialNumberDao.getVirtualSerialNumberByWorkOrderId(workOrderId);
    }

    @Override
    public String getSerialNumberById(Integer Id) {
        return virtualSerialNumberDao.getSerialNumberById(Id);
    }

    @Override
    public String getLastStationSerialNumber(String lastStationName, Integer workOrderId) {
        return virtualSerialNumberDao.getLastStationSerialNumber(lastStationName, workOrderId);
    }
}
