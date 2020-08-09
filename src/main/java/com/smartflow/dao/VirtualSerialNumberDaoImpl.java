package com.smartflow.dao;

import com.smartflow.model.VirtualSerialNumber;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VirtualSerialNumberDaoImpl implements VirtualSerialNumberDao {
    @Autowired
    HibernateTemplate hibernateTemplate;
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public void addVirtualSerialNumber(VirtualSerialNumber virtualSerialNumber) {
        hibernateTemplate.save(virtualSerialNumber);
    }

    @Override
    public void updateVirtualSerialNumber(VirtualSerialNumber virtualSerialNumber) {
        hibernateTemplate.update(virtualSerialNumber);
    }

    @Override
    public VirtualSerialNumber getVirtualSerialNumberByCell(String cell) {
        Session session = sessionFactory.openSession();
        String hql = "from VirtualSerialNumber where serialNumber like '%"+cell+"%' and State = 1 order by CreationDateTime desc";//"+cell+"%'
        try{
            Query query = session.createQuery(hql);
            query.setFirstResult(0);
            query.setMaxResults(1);
            return query.list() == null ? null : (VirtualSerialNumber)query.list().get(0);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public String getSerialNumberById(Integer Id) {
        VirtualSerialNumber virtualSerialNumber = hibernateTemplate.get(VirtualSerialNumber.class,Id);
        if(virtualSerialNumber != null){
            return virtualSerialNumber.getSerialNumber();
        }
        return null;
    }

    @Override
    public String getLastStationSerialNumber(String lastStationName, Integer workOrderId) {
        String hql = "select SerialNumber from "+lastStationName+" where workOrderId = "+workOrderId;
        Session session = sessionFactory.openSession();
        try{
            Query query = session.createQuery(hql);
            return query.uniqueResult() == null ? null : query.uniqueResult().toString();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
