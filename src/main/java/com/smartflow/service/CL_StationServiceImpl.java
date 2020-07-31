package com.smartflow.service;

import com.smartflow.dao.CL_StationDao;
import com.smartflow.dto.TableHeaderDTO;
import com.smartflow.dto.VMTracePartByStationInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author haita
 */
@Service
public class CL_StationServiceImpl implements CL_StationService {
    final
    CL_StationDao cl_stationDao;

    @Autowired
    public CL_StationServiceImpl(CL_StationDao cl_stationDao) {
        this.cl_stationDao = cl_stationDao;
    }

    @Override
    public String getLinkTableNameByStationId(Integer stationId) {
        return cl_stationDao.getLinkTableNameByStationId(stationId);
    }

    @Override
    public List<Map<String,Object>> getCLStationDeviceListByLinkTableName(String linkTableName, VMTracePartByStationInput vmTracePartByStationInput) {
        return cl_stationDao.getCLStationDeviceListByLinkTableName(linkTableName, vmTracePartByStationInput);
    }

    @Override
    public Integer getTotalCountCLStationDeviceListByLinkTableName(String linkTableName, VMTracePartByStationInput vmTracePartByStationInput) {
        return cl_stationDao.getTotalCountCLStationDeviceListByLinkTableName(linkTableName, vmTracePartByStationInput);
    }

    @Transactional
    @Override
    public void addCLStationDevice(String entityName,Object object) {
        cl_stationDao.addCLStationDevice(entityName, object);
    }

    @Override
    public List<TableHeaderDTO> getHeaderListByLinkTableName(String linkTableName) {
        return cl_stationDao.getHeaderListByLinkTableName(linkTableName);
    }
}
