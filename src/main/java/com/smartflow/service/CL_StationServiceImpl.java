package com.smartflow.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.smartflow.common.stationenum.ParseToArray;
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

import java.util.List;
import java.util.Map;

@Service
public class CL_StationServiceImpl implements CL_StationService {
    private final
    HibernateTemplate hibernateTemplate;

    private final
    CL_StationDao cl_stationDao;

    private final static List<String> tus= ParseToArray.parseTuStation();
    private final static List<String> ims=ParseToArray.parseImStation();
    private final static List<String> res=ParseToArray.parseReStation();


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


    /**
     * 条形码的覆盖业务，涉及TU,RE,IM
     * @param serialNumber 序列码
     * @param tableName 表名
     */
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

    /**
     * 覆盖单个表的业务
     * @param serialNumber 条形码
     * @param tableName 表名
     * @throws ClassNotFoundException 根据表名无法反射到
     */
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

    /**
     * 遇到ng的情况且ng工站属于产生虚拟码的工站
     * @param serialNumber 条形码
     * @param tableName 表名
     * @throws ClassNotFoundException 根据表名无法找到类的情况
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void writeNg(String serialNumber, String tableName){
        try {
            if (res.contains(tableName)) {
                ngWriteRes(serialNumber, tableName);
                return;
            }
            if (tus.contains(tableName)) {
                ngWriteTus(serialNumber, tableName);
                return;
            }
            if (ims.contains(tableName)) {
                ngWriteIms(serialNumber, tableName);
                return;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    /**
     * RE岛区的虚拟工站遇到ng情况，根据ng的工站去覆盖前边的表
     * @param serialNumber 序列码
     * @param tableName 表名
     * @throws ClassNotFoundException 反射无法找到类
     */
    private void ngWriteRes(String serialNumber,String tableName) throws ClassNotFoundException {

            int number=res.indexOf(tableName);
            List<String> reWriteTable=res.subList(0,number);
            for (String table:reWriteTable)
            {
                setSerialNumber(serialNumber,table);
            }

    }


    /**
     * TU虚拟岛区遇到ng的情况，覆盖前边的条码
     * @param serialNumber 条形码
     * @param tableName 表名
     * @throws ClassNotFoundException 无法找到类
     */
    private void ngWriteTus(String serialNumber,String tableName) throws ClassNotFoundException {
        int number=tus.indexOf(tableName);
        List<String> tuWriteTable=tus.subList(0,number);
        for (String table:tuWriteTable)
        {
            setSerialNumber(serialNumber,table);
        }
    }

    /**
     * IM虚拟岛区遇到ng情况，覆盖前边的条码
     * @param serialNumber 条形码
     * @param tableName 表名
     * @throws ClassNotFoundException 通过反射无法找到类
     */
    private void ngWriteIms(String serialNumber,String tableName) throws ClassNotFoundException {
        int number=ims.indexOf(tableName);
        List<String> imWriteTable=ims.subList(0,number);
        for (String table:imWriteTable)
        {
            setSerialNumber(serialNumber,table);
        }
    }

    /**
     * Re岛区的特殊处理 reop10A和reop10B只会有一个工站有工件
     * 根据时间去判断
     * @return 返回应该覆盖的工站名
     */
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

    /**
     * 返回REOP10A,REOP10B的时间最晚的表
     * @param doosan005 REOP10A
     * @param doosan006 REOP10B
     * @return 返回表
     */
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
