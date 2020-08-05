package com.smartflow.dao;

import com.smartflow.dto.TableHeaderDTO;
import com.smartflow.dto.VMTracePartByStationInput;
import com.smartflow.model.CurrentActivedWorkOrderInformation;
import com.smartflow.model.WorkOrder;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
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
    public CL_StationDaoImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    @Autowired
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
            Query query = session.createSQLQuery("select * from core."+linkTableName+ " where CREATE_DATE between :StartDateTime and :EndDateTime");
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
    public void addCLStationDevice(String entityName, Object entity) {
        hibernateTemplate.save(entityName, entity);
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


//    public Integer getWorkOrderBySerialNumber(String serialNumber) {
//        List<PartSerialNumber> partSerialNumberList =
//                (List<PartSerialNumber>)
//                        hibernateTemplate.findByNamedParam
//                                ("FROM PartSerialNumber WHERE serialNumber=:SerialNumber",
//                                        "SerialNumber", serialNumber);
//        if(!CollectionUtils.isEmpty(partSerialNumberList)){
//            WorkOrder workOrder = partSerialNumberList.get(0).getWorkOrder();
//            if(workOrder != null){
//                return workOrder.getId();
//            }
//        }
//        return null;
//    }


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
}
