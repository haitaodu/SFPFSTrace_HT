package com.smartflow.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.smartflow.common.stationenum.StationNameIm;
import com.smartflow.dao.CL_StationDao;
import com.smartflow.dto.TableHeaderDTO;
import com.smartflow.dto.VMTracePartBySerialNumberOrWorkOrderInput;
import com.smartflow.dto.VMTracePartByStationInput;
import com.smartflow.model.CL_REOP10A;
import com.smartflow.model.CL_REOP10B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

@Service
public class CL_StationServiceImpl implements CL_StationService {
    private final
    HibernateTemplate hibernateTemplate;

    private final
    CL_StationDao cl_stationDao;

    @Autowired
    public CL_StationServiceImpl(CL_StationDao cl_stationDao, HibernateTemplate hibernateTemplate) {
        this.cl_stationDao = cl_stationDao;
        this.hibernateTemplate = hibernateTemplate;
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

    @Override
    public Integer getTotalCountCLStationDeviceListByCondition(String linkTableName, VMTracePartBySerialNumberOrWorkOrderInput vmTracePartBySerialNumberOrWorkOrderInput) {
        return cl_stationDao.getTotalCountCLStationDeviceListByCondition(linkTableName, vmTracePartBySerialNumberOrWorkOrderInput);
    }

    @Override
    public List<Map<String, Object>> getCLStationDeviceListByCondition(String linkTableName, VMTracePartBySerialNumberOrWorkOrderInput vmTracePartBySerialNumberOrWorkOrderInput) {
        return cl_stationDao.getCLStationDeviceListByCondition(linkTableName, vmTracePartBySerialNumberOrWorkOrderInput);
    }

    @Transactional
    @Override
    public void addCLStationDevice(String entityName,Object object) {
        System.out.println(object.toString());
        cl_stationDao.addCLStationDevice(entityName, object);
    }

    @Override
    public List<TableHeaderDTO> getHeaderListByLinkTableName(String linkTableName) {
        return cl_stationDao.getHeaderListByLinkTableName(linkTableName);
    }

    @Override
    public Integer getCurrentActivedWorkOrder() {
        return cl_stationDao.getCurrentActivedWorkOrder();
    }

    @Override
    public String getWorkOrderNumberByWorkOrderId(Integer workOrderId) {
        return cl_stationDao.getWorkOrderNumberByWorkOrderId(workOrderId);
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void reWriteSerialNumber(String serialNumber,String tableName) {
        try {

            if ("CL_REOP15".equals(tableName)) {
               setSerialNumber(serialNumber,getReWriteTable());
            }
            if ("CL_TUOP50".equals(tableName))
            {
                setSerialNumber(serialNumber, "CL_TUOP20");
                setSerialNumber(serialNumber, "CL_TUOP25");
                setSerialNumber(serialNumber, "CL_TUOP30");
                setSerialNumber(serialNumber, "CL_TUOP45");

            }
            if ("CL_IMOP45".equals(tableName))
            {
                for (StationNameIm stationNameIm:StationNameIm.values())
                {
                    setSerialNumber(serialNumber, stationNameIm.getName());
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void setSerialNumber(String serialNumber,String tableName) throws ClassNotFoundException {
        try {
            List<?> stationList = hibernateTemplate.find
                    ("from "+tableName +
                            " where state=0 order by CREATE_DATE ");
            if (!stationList.isEmpty()) {
                Object station = stationList.get(0);
                String jsonString=JSONObject.toJSONString(station);
                JSONObject jsonObject=JSONObject.parseObject(jsonString);
                jsonObject.put("SerialNumber",serialNumber);
                jsonObject.put("state",1);
                //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                //jsonObject.put("CREATE_DATE",sdf.format(jsonObject.get("cREATE_DATE")));
                Class<?> classEntity=Class.forName
                        ("com.smartflow.model."+tableName);
                hibernateTemplate.merge
                        (JSON.parseObject(jsonObject.toString(),
                                classEntity));
                System.out.println("覆盖后时间"+JSON.parseObject(jsonObject.toString(),
                        classEntity));
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            throw  e;
        }
    }

    @SuppressWarnings("unchecked")
    private String getReWriteTable()
    {
        List<CL_REOP10A> station01= (List<CL_REOP10A>)hibernateTemplate.find
                ("from  CL_REOP10A where state=0 order by CREATE_DATE ");
        List<CL_REOP10B> station02=(List<CL_REOP10B>)hibernateTemplate.find
                ("from  CL_REOP10B where state=0 order by CREATE_DATE ");

        if (!station01.isEmpty()&&!station02.isEmpty())
        {
            return getLinkTableByCreateTime(station01.get(0),station02.get(0));
        }
        else {
            return station01.isEmpty()?"CL_REOP10B":"CL_REOP10A";
        }

    }

    private String getLinkTableByCreateTime(CL_REOP10A doosan005, CL_REOP10B doosan006 )
    {
        if (doosan005.getCREATE_DATE().after(doosan006.getCREATE_DATE()))
        {
            return "CL_REOP10B";
        }
        else {
            return "CL_REOP10A";
        }
    }
}
