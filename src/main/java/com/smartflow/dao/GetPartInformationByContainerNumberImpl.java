package com.smartflow.dao;

import com.smartflow.model.Container;
import com.smartflow.model.PartMaterialRecord;
import com.smartflow.model.PartSerialNumber;
import com.smartflow.util.PartInformation;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GetPartInformationByContainerNumberImpl implements GetPartInformationByContainerNumber {
    @Autowired
    HibernateTemplate hibernate;
    @Autowired
    PartSerialNumberDao partSerialNumberDao;
    private List<PartInformation> partInformationList = new ArrayList<>();

    private String star = "";

    @Override
    public List<PartInformation> getPartInformationByContainerNumber(int pageSize, int PageNumber,
                                                                     String ContainerNumber) {
        // TODO Auto-generated method stub
        Session session = hibernate.getSessionFactory().openSession();
        String hql = "FROM PartMaterialRecord WHERE MaterialContainerId IN (SELECT id FROM Container WHERE ContainerNumber=:ContainerNumber)";
        Query query = session.createQuery(hql);
        query.setFirstResult((PageNumber - 1) * pageSize);
        query.setMaxResults(pageSize);
        query.setParameter("ContainerNumber", ContainerNumber);
        @SuppressWarnings({"unused", "unchecked"})
        List<PartMaterialRecord> partMaterialRecords = query.list();
        List<PartInformation> partInformations = new ArrayList<>();
        session.close();

        for (PartMaterialRecord partMaterialRecord : partMaterialRecords) {
            /*
             * 一个Slave对应很多个Master
             */
            List<Integer> masterSerialNumbers = partSerialNumberDao.getProdcutBySlaveId(partMaterialRecord.getPartSerialNumber().getId());
            for (Integer masterSerialNumber : masterSerialNumbers) {
String state=null;
if (partMaterialRecord.getPartSerialNumber().getState()==1)
{
    state="正常";
}
else
{
    state="锁定";
}
                partInformations.add(new PartInformation(partMaterialRecord.getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getCustomerMaterialNumber(),
                        partMaterialRecord.getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getDescription(),
                        partMaterialRecord.getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getMaterialNumber(),
                        partMaterialRecord.getPartSerialNumber().getSerialNumber(), state,
                        hibernate.get(PartSerialNumber.class, masterSerialNumber).getMasterSerialNumber(), "*"));
            }
        }
        return partInformations;
    }

    @Override
    public int getRowCountInChosenContainerNumber(String ContainerNumber) {
        // TODO Auto-generated method stub
        Session session = hibernate.getSessionFactory().openSession();
        String hql = "SELECT COUNT(*) FROM PartMaterialRecord WHERE MaterialContainerId IN (SELECT id FROM Container WHERE ContainerNumber=:ContainerNumber)";
        Query query = session.createQuery(hql);
        query.setParameter("ContainerNumber", ContainerNumber);
        Integer count = Integer.valueOf(query.uniqueResult().toString());
        session.close();
        return count;
    }

    @Override
    public void getPartMaterialRecordByContainerNumber(int containerNumberId) {

        List<PartMaterialRecord> partMaterialRecords = (List<PartMaterialRecord>) hibernate.findByNamedParam("FROM PartMaterialRecord WHERE MaterialContainerId=:materialContainerId", "materialContainerId", containerNumberId);
        if (partMaterialRecords.size() == 0) {

            return;
        }
        for (PartMaterialRecord partMaterialRecord : partMaterialRecords) {

            if(partMaterialRecord.getPartSerialNumber().getSerialNumber().equals(hibernate.get(Container.class,containerNumberId).getContainerNumber()))
            {
                continue;
            }
            String state=null;
            if (partMaterialRecord.getPartSerialNumber().getState()==1)
            {
                state="正常";
            }
            else
            {
                state="锁定";
            }
            partInformationList.add(new PartInformation(partMaterialRecord.getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getCustomerMaterialNumber(),
                    partMaterialRecord.getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getDescription(),
                    partMaterialRecord.getPartSerialNumber().getWorkOrder().getBomHead().getMaterial().getMaterialNumber(),
                    partMaterialRecord.getPartSerialNumber().getSerialNumber(), state,
                    partMaterialRecord.getPartSerialNumber().getMasterSerialNumber(), star + Integer.toString(star.length() + 1)));



            List<Container> containers = (List<Container>) hibernate.findByNamedParam("FROM Container WHERE ContainerNumber=:containerNumber", "containerNumber", partMaterialRecord.getPartSerialNumber().getSerialNumber());
            if (containers.size() == 0) {
                continue;
            }
            Container container = containers.get(0);
            star = star + "●";
            getPartMaterialRecordByContainerNumber(container.getId());
            //	getPartMaterialRecordByContainerNumber(partMaterialRecord.getPartSerialNumber().getSerialNumber());

            star = star.substring(0, star.length() - 1);

        }

    }

    @Override
    public List<PartInformation> getPartInformation(String containerNumber) {
        try {


            List<Container> containers = (List<Container>) hibernate.findByNamedParam("FROM Container WHERE ContainerNumber=:containerNumber", "containerNumber", containerNumber);
            if (containers.size() == 0

            ) {
                return partInformationList;
            }

            Container container = containers.get(0);
            getPartMaterialRecordByContainerNumber(container.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return partInformationList;
        }

    }

    @Override
    public void init() {
        partInformationList = new ArrayList<>();

        star = "";
    }

}
