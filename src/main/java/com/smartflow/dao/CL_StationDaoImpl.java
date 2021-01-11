package com.smartflow.dao;

import com.smartflow.dto.*;
import com.smartflow.model.CurrentActivedWorkOrderInformation;
import com.smartflow.model.WorkOrder;
import org.apache.poi.util.StringUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author haita
 */

@Repository
public class CL_StationDaoImpl implements CL_StationDao {
    private final
    HibernateTemplate hibernateTemplate;
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    public CL_StationDaoImpl(HibernateTemplate hibernateTemplate, SessionFactory sessionFactory) {
        this.hibernateTemplate = hibernateTemplate;
        this.sessionFactory = sessionFactory;
    }
    final
    SessionFactory sessionFactory;

    @Override
    public String getLinkTableNameByStationId(Integer stationId) {
        String hql = "select LINK_TABLE_NAME from CL_STATION where STATION_CODE = (select stationNumber from Station where Id = "+stationId+")";
        Session session = hibernateTemplate.getSessionFactory().openSession();
        try {
            Query query = session.createQuery(hql);
            return query.uniqueResult() == null ? null : query.uniqueResult().toString();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public List<Map<String,Object>> getCLStationDeviceListByLinkTableName(String linkTableName, VMTracePartByStationInput vmTracePartByStationInput) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        try {
            Query query = session.createSQLQuery("select * from core."+linkTableName+ " where CREATE_DATE between :StartDateTime and :EndDateTime order by CREATE_DATE desc");
            query= parseToQuery(query,vmTracePartByStationInput);
            query.setFirstResult((vmTracePartByStationInput.getPageIndex() - 1) * vmTracePartByStationInput.getPageSize());
            query.setMaxResults(vmTracePartByStationInput.getPageSize());
            return query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public Integer getTotalCountCLStationDeviceListByLinkTableName(String linkTableName, VMTracePartByStationInput vmTracePartByStationInput) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Query query = session.createSQLQuery("select count(*) from core."+linkTableName+ " where CREATE_DATE between :StartDateTime and :EndDateTime");
            query=parseToQuery(query,vmTracePartByStationInput);
            return query.uniqueResult() == null ? 0 : Integer.parseInt(query.uniqueResult().toString());
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public Integer getTotalCountCLStationDeviceListByCondition(String linkTableName, VMTracePartBySerialNumberOrWorkOrderInput vmTracePartBySerialNumberOrWorkOrderInput, String flag) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "select count(*) from core."+linkTableName+ " where 1=1 ";//CREATE_DATE between :StartDateTime and :EndDateTime
        try {
            if(!StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getStartDateTime())){
                sql += " and CREATE_DATE >= :StartDateTime";
            }
            if(!StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getEndDateTime())){
                sql += " and CREATE_DATE <= :EndDateTime";
            }
            if(!StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber())){
                if(flag.equals("like")){
                    sql += " and SerialNumber like :SerialNumber ";
                }else if(flag.equals("=")){
                    if(!linkTableName.equals("CL_TCOP10")){
                        sql += " and SerialNumber = :SerialNumber ";
                    }else {
                        sql += " and (DB9_DBX1006_0 like :serialNumber or  DB9_DBX922_0 like :serialNumber or DB9_DBX964_0 like :serialNumber or DB9_DBX1048_0 like :serialNumber)";
                    }
                }
            }
            if(vmTracePartBySerialNumberOrWorkOrderInput.getWorkOrderId() != null){
                sql += " and WorkOrderId = " + vmTracePartBySerialNumberOrWorkOrderInput.getWorkOrderId();
            }
            if(vmTracePartBySerialNumberOrWorkOrderInput.getIS_OK() != null){
                sql += " and IS_OK = :IS_OK ";
            }
            Query query = session.createSQLQuery(sql);
            VMTracePartByStationInput vmTracePartByStationInput = new VMTracePartByStationInput();
            vmTracePartByStationInput.setStartDateTime(vmTracePartBySerialNumberOrWorkOrderInput.getStartDateTime());
            vmTracePartByStationInput.setEndDateTime(vmTracePartBySerialNumberOrWorkOrderInput.getEndDateTime());
            query=parseToQuery(query,vmTracePartByStationInput);
            if(!StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber())) {
                if(flag.equals("like")){
                query.setParameter("SerialNumber", "%"+vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber()+"%");
            }else if(flag.equals("=")){
                if(!linkTableName.equals("CL_TCOP10")) {
                    query.setParameter("SerialNumber", vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber());
                }else{
                    query.setParameter("serialNumber", "%"+vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber()+"%");
                }
            }
            }
            if(vmTracePartBySerialNumberOrWorkOrderInput.getIS_OK() != null){
                query.setParameter("IS_OK", vmTracePartBySerialNumberOrWorkOrderInput.getIS_OK());
            }
            return query.uniqueResult() == null ? 0 : Integer.parseInt(query.uniqueResult().toString());
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public List<Map<String, Object>> getCLStationDeviceListByCondition(String linkTableName, VMTracePartBySerialNumberOrWorkOrderInput vmTracePartBySerialNumberOrWorkOrderInput, String flag) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        String sql = "select * from core."+linkTableName+ " where 1=1 ";//CREATE_DATE between :StartDateTime and :EndDateTime
        try {
            if(!StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getStartDateTime())){
                sql += " and CREATE_DATE >= :StartDateTime";
            }
            if(!StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getEndDateTime())){
                sql += " and CREATE_DATE <= :EndDateTime";
            }
            if(!StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber())){
                if(flag.equals("like")){
                    sql += " and SerialNumber like :SerialNumber ";
                }else if(flag.equals("=")){
                    if(!linkTableName.equals("CL_TCOP10")){
                        sql += " and SerialNumber = :SerialNumber ";
                    }else {
                        sql += " and (DB9_DBX1006_0 like :serialNumber or  DB9_DBX922_0 like :serialNumber or DB9_DBX964_0 like :serialNumber or DB9_DBX1048_0 like :serialNumber)";
                    }
                }

            }
            if(vmTracePartBySerialNumberOrWorkOrderInput.getWorkOrderId() != null){
                sql += " and WorkOrderId = " + vmTracePartBySerialNumberOrWorkOrderInput.getWorkOrderId();
            }
            if(vmTracePartBySerialNumberOrWorkOrderInput.getIS_OK() != null){
                sql += " and IS_OK = :IS_OK ";
            }
            sql += " order by CREATE_DATE desc";
            Query query = session.createSQLQuery(sql);
            VMTracePartByStationInput vmTracePartByStationInput = new VMTracePartByStationInput();
            vmTracePartByStationInput.setStartDateTime(vmTracePartBySerialNumberOrWorkOrderInput.getStartDateTime());
            vmTracePartByStationInput.setEndDateTime(vmTracePartBySerialNumberOrWorkOrderInput.getEndDateTime());
            query = parseToQuery(query, vmTracePartByStationInput);
            if(!StringUtils.isEmpty(vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber())) {
                if(flag.equals("like")){
                    query.setParameter("SerialNumber", "%"+vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber()+"%");
                }else if(flag.equals("=")){
                    if(!linkTableName.equals("CL_TCOP10")) {
                        query.setParameter("SerialNumber", vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber());
                    }else{
                        query.setParameter("serialNumber", "%"+vmTracePartBySerialNumberOrWorkOrderInput.getSerialNumber()+"%");
                    }
                }
            }
            if(vmTracePartBySerialNumberOrWorkOrderInput.getIS_OK() != null){
                query.setParameter("IS_OK", vmTracePartBySerialNumberOrWorkOrderInput.getIS_OK());
            }
            query.setFirstResult((vmTracePartBySerialNumberOrWorkOrderInput.getPageIndex() - 1) * vmTracePartBySerialNumberOrWorkOrderInput.getPageSize());
            query.setMaxResults(vmTracePartBySerialNumberOrWorkOrderInput.getPageSize());
            return query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    @Transactional
    @Override
    public void addCLStationDevice(String entityName, Object entity) {
try {
    hibernateTemplate.save(entityName, entity);
}
catch (Exception e)
{
    System.out.println(e.getStackTrace());
}
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<TableHeaderDTO> getHeaderListByLinkTableName(String linkTableName) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createSQLQuery
                ("select cast(a.name as varchar(50))as dataIndex," +
                        "cast(b.value as varchar(50)) as title " +
                        "from SysColumns a left join sys.extended_properties b " +
                        "on a.id = b.major_id where" +
                        " b.minor_id=a.colid and a.id = Object_Id('core."+linkTableName+"')");
        try {
            return query.setResultTransformer
                    (Transformers.aliasToBean(TableHeaderDTO.class)).list();
        }
        catch (Exception e)
        {
            logger.info(e.getCause().getMessage());
            return new ArrayList<>();
        }
        finally {
            session.close();
        }

    }


    private Query parseToQuery(Query query,VMTracePartByStationInput vmTracePartByStationInput) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String StartDateTime = vmTracePartByStationInput.getStartDateTime();
        Date startDateTime = null;
        if (!StringUtils.isEmpty(StartDateTime)) {
            startDateTime = format.parse(StartDateTime);
            query.setParameter("StartDateTime", startDateTime);
        }
        String EndDateTime = vmTracePartByStationInput.getEndDateTime();
        if (!StringUtils.isEmpty(EndDateTime)) {
            Date endDateTime = format.parse(EndDateTime);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(endDateTime);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            System.out.println(calendar.getTime());
            query.setParameter("EndDateTime", calendar.getTime());
        }
        return query;
    }




    @Override
    public Integer getCurrentActivedWorkOrder() {
        String hql = "from CurrentActivedWorkOrderInformation order by Id desc";
        Session session = sessionFactory.openSession();
        try{
            Query query = session.createQuery(hql);
            query.setFirstResult(0);
            query.setMaxResults(1);
            CurrentActivedWorkOrderInformation currentActivedWorkOrderInformation = query.uniqueResult() == null ? null : (CurrentActivedWorkOrderInformation)query.uniqueResult();
            if(currentActivedWorkOrderInformation != null){
                return currentActivedWorkOrderInformation.getWorkOrder().getId();
            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public String getWorkOrderNumberByWorkOrderId(Integer workOrderId) {
        WorkOrder workOrder = hibernateTemplate.get(WorkOrder.class, workOrderId);
        return workOrder == null ? null : workOrder.getWorkOrderNumber();
    }

    @Override
    public List<Map<String, Object>> getCLStationDeviceListByLinkTableName(String linkTableName) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        try {
            Query query = session.createSQLQuery("select top 1 * from core."+linkTableName+ " order by CREATE_DATE desc");
            return query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public void updateStateByUUIDList(UpdateStateByUUIDListInputDTO updateStateByUUIDListInputDTO, String linkTableName) {
        Session session = sessionFactory.openSession();
        try{
            Query query = session.createSQLQuery("update core."+ linkTableName + " set state = :state where UUID in :UUIDList");
            query.setParameter("state", updateStateByUUIDListInputDTO.getButtonValue());
            query.setParameterList("UUIDList", updateStateByUUIDListInputDTO.getUUIDList());
            query.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Integer getTotalCountCLStationListByCondition(String linkTableName, GetCompletedQuantityInputDTO getCompletedQuantityInputDTO) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        String sql = "select count(*) from core."+linkTableName+ " where 1=1 ";//CREATE_DATE between :StartDateTime and :EndDateTime
        try {
            if(!StringUtils.isEmpty(getCompletedQuantityInputDTO.getStartDateTime())){
                sql += " and CREATE_DATE >= :StartDateTime";
            }
            if(!StringUtils.isEmpty(getCompletedQuantityInputDTO.getEndDateTime())){
                sql += " and CREATE_DATE <= :EndDateTime";
            }
            Query query = session.createSQLQuery(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Date startDateTime = null;
            if (!StringUtils.isEmpty(getCompletedQuantityInputDTO.getStartDateTime())) {
               startDateTime = sdf.parse(getCompletedQuantityInputDTO.getStartDateTime());
                query.setParameter("StartDateTime", startDateTime);
            }
//            String EndDateTime = getCompletedQuantityInputDTO.getEndDateTime();
            if (!StringUtils.isEmpty(getCompletedQuantityInputDTO.getEndDateTime())) {
                Date endDateTime = sdf.parse(getCompletedQuantityInputDTO.getEndDateTime());
//                Calendar calendar = Calendar.getInstance();
//                calendar.setTime(endDateTime);
//                calendar.add(Calendar.DAY_OF_MONTH, 1);
//                System.out.println(calendar.getTime());
                query.setParameter("EndDateTime", endDateTime);
            }
            return query.uniqueResult() == null ? 0 : Integer.parseInt(query.uniqueResult().toString());
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public List<Map<String, Object>> getStationTestResultBySerialNumberAndLinkTableName(String cellNumber, String serialNumber, List<StationLinkTableNameDTO> linkTableNameList) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        List<Map<String,Object>> mapList = new ArrayList<>();
        try {
            for (StationLinkTableNameDTO stationLinkTableNameDTO:linkTableNameList) {
                Map<String,Object> map = new HashMap<>();
                String sql = "select top 1 IS_OK from core."+stationLinkTableNameDTO.getLinkTableName()+ " where 1=1 and SerialNumber = '"+serialNumber+"' order by CREATE_DATE desc";//CREATE_DATE between :StartDateTime and :EndDateTime
                Query query = session.createSQLQuery(sql);
                map.put(cellNumber + "Station", stationLinkTableNameDTO.getStationNumber());
                map.put(cellNumber + "TestResult", query.uniqueResult() == null ? "NO" : (query.uniqueResult().toString().trim().equals("0") ? "NG" : "OK"));
                mapList.add(map);
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
        return mapList;
    }

    @Override
    public CellSerialNumberDTO getCellSerialNumberDTOFromTCOP10(String cellNumber, String serialNumber) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        List<Map<String,Object>> mapList = new ArrayList<>();
        try {
            //TUSerialNumber
//           IM  IMSerialNumber 泵轮条码 DB9_DBX1006_0
//           PD PDSerialNumber 闭锁条码  DB9_DBX922_0
//           RE RESerialNumber 导轮条码  DB9_DBX964_0
//           FC FCSerialNumber 罩轮条码  DB9_DBX1048_0
            String sql = "select DB9_DBX1006_0 IMSerialNumber,DB9_DBX922_0 PDSerialNumber,DB9_DBX964_0 RESerialNumber,DB9_DBX1048_0 FCSerialNumber from core.CL_TCOP10 where ";
            if(cellNumber.equals("IM")){//泵轮条码
                sql += " DB9_DBX1006_0 like '"+ serialNumber +"%'";
            }else if(cellNumber.equals("PD")){
                sql += " DB9_DBX922_0 like '"+ serialNumber +"%'";
            }else if(cellNumber.equals("RE")){
                sql += " DB9_DBX964_0 like '"+ serialNumber +"%'";
            }else if(cellNumber.equals("FC")){
                sql += " DB9_DBX1048_0 like '"+ serialNumber +"%'";
            }
            Query query = session.createSQLQuery(sql);
            List<CellSerialNumberDTO> cellSerialNumberDTOList = query.setResultTransformer(Transformers.aliasToBean(CellSerialNumberDTO.class)).list();
            if(!CollectionUtils.isEmpty(cellSerialNumberDTOList)){
                return cellSerialNumberDTOList.get(0);
            }else{
                return null;
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public CellSerialNumberDTO getTUOrPDSerialNumberFromCOMOP10(CellSerialNumberDTO cellSerialNumberDTO, String cellNumber) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        List<Map<String,Object>> mapList = new ArrayList<>();
        try {
            //TUSerialNumber
//           IM  IMSerialNumber 泵轮条码 DB9_DBX1006_0
//           PD PDSerialNumber 闭锁条码  DB9_DBX922_0
//           RE RESerialNumber 导轮条码  DB9_DBX964_0
//           FC FCSerialNumber 罩轮条码  DB9_DBX1048_0
            String sql = "select DB13_DBX718_0 PDSerialNumber,SerialNumber TUSerialNumber from core.CL_COMOP10 where ";
            if(cellNumber.equals("TU")){//涡轮条码
                sql += " SerialNumber = '"+ cellSerialNumberDTO.getTUSerialNumber() +"'";
            }else {
                sql += " DB13_DBX718_0 like '"+ cellSerialNumberDTO.getPDSerialNumber() +"%'";
            }
            Query query = session.createSQLQuery(sql);
            List<CellSerialNumberDTO> cellSerialNumberDTOList = query.setResultTransformer(Transformers.aliasToBean(CellSerialNumberDTO.class)).list();
            if(!CollectionUtils.isEmpty(cellSerialNumberDTOList)){
                return cellSerialNumberDTOList.get(0);
            }else{
                return null;
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }
}
