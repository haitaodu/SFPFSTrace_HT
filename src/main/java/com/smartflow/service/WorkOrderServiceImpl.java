package com.smartflow.service;

import com.smartflow.dao.WorkOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class WorkOrderServiceImpl implements WorkOrderService {
    @Autowired
    WorkOrderDao workOrderDao;
    @Override
    public List<Map<String, Object>> getWorkOrderInit() {
        return workOrderDao.getWorkOrderInit();
    }
}
