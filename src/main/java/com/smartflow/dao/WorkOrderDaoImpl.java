package com.smartflow.dao;

import com.smartflow.model.WorkOrder;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class WorkOrderDaoImpl implements WorkOrderDao {

    @Autowired
    HibernateTemplate hibernateTemplate;
    @Override
    public List<Map<String, Object>> getWorkOrderInit() {
        SessionFactory sessionFactory = hibernateTemplate.getSessionFactory();
        Session session = sessionFactory.openSession();
        String sql = "select Id [key],WorkOrderNumber label from core.WorkOrder where State=0 or State = 10 Order By WorkOrderNumber";
        try{
            Query query = session.createSQLQuery(sql);
            return query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            session.close();
        }
    }
}
