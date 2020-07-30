package com.smartflow.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.smartflow.dto.VMPartProcessRecordInput;
import com.smartflow.model.PartMaterialRecord;
import com.smartflow.model.PartMergeRecord;
import com.smartflow.model.PartSerialNumber;
import com.smartflow.model.SerialNumber;
import com.smartflow.model.SlavePartSerialNumber;
import com.smartflow.util.SerialDataByWorkOrder;
@Repository
public class PartSerialNumberDaoImpl implements PartSerialNumberDao {

	List<Integer> partSerialNumbers=new ArrayList<>();


	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public Integer getTotalCountFromPartSerialNumberBySerialNumber(VMPartProcessRecordInput vmPartProcessRecordInput) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "select count(*) from PartSerialNumber where serialNumber = :SerialNumber ";
		try{
			Query query = session.createQuery(hql);
			//		String sql = "select * from core.PartSerialNumber where SerialNumber = :SerialNumber ";
			if (Integer.parseInt(vmPartProcessRecordInput.getRecordType())==2) {
				//			sql += "and Id in(select PartSerialNumberId from trace.PartProcessRecord where ProcessStepId in(select Id from core.ProcessStep where IsMandatory = 1))";
				hql += "and id in (select partSerialNumber from PartProcessRecord where processStep in (select id from ProcessStep where isMandatory = true)) ";
			}
			//		Query query = session.createSQLQuery(sql);		
			query.setString("SerialNumber", vmPartProcessRecordInput.getPartSerialNumber());
			if (query.uniqueResult()!=null) {
				return Integer.parseInt(query.uniqueResult().toString());
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
	}

	@Override
	public List<PartSerialNumber> getPartSerialNumberBySerialNumber(VMPartProcessRecordInput vmPartProcessRecordInput) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "from PartSerialNumber where serialNumber = :SerialNumber ";
		try{
			Query query = session.createQuery(hql);
			//		String sql = "select * from core.PartSerialNumber where SerialNumber = :SerialNumber ";
			if (Integer.parseInt(vmPartProcessRecordInput.getRecordType())==2) {
				//			sql += "and Id in(select PartSerialNumberId from trace.PartProcessRecord where ProcessStepId in(select Id from core.ProcessStep where IsMandatory = 1))";
				hql += "and id in (select partSerialNumber from PartProcessRecord where processStep in (select id from ProcessStep where isMandatory = true)) ";
			}
			//		Query query = session.createSQLQuery(sql);		
			query.setString("SerialNumber", vmPartProcessRecordInput.getPartSerialNumber());
	//		query.setFirstResult((vmPartProcessRecordInput.getPageIndex()-1)*vmPartProcessRecordInput.getPageSize());
	//		query.setMaxResults(vmPartProcessRecordInput.getPageSize());
			return query.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
	}

	@Override
	public List<PartSerialNumber> getPartSerialNumberBySerialNumberDesc(VMPartProcessRecordInput vmPartProcessRecordInput) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "from PartSerialNumber where serialNumber = :SerialNumber ";
		try{
			Query query = session.createQuery(hql);
			//		String sql = "select * from core.PartSerialNumber where SerialNumber = :SerialNumber ";
			if (Integer.parseInt(vmPartProcessRecordInput.getRecordType())==2) {
				//			sql += "and Id in(select PartSerialNumberId from trace.PartProcessRecord where ProcessStepId in(select Id from core.ProcessStep where IsMandatory = 1)) ";
				hql += "and id in (select partSerialNumber from PartProcessRecord where processStep in (select id from ProcessStep where isMandatory = true)) ";
			}
			hql += "order by CreationDateTime desc";
			//		sql += "order by CreationDateTime desc";
			//		Query query = session.createSQLQuery(sql);		
			query.setString("SerialNumber", vmPartProcessRecordInput.getPartSerialNumber());	
	//		query.setFirstResult((vmPartProcessRecordInput.getPageIndex()-1)*vmPartProcessRecordInput.getPageSize());
	//		query.setMaxResults(vmPartProcessRecordInput.getPageSize());
			return query.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
	}

	@Override
	public List<SerialDataByWorkOrder> getPartSerialNumberByWorkOrder(int pageIndex, int pageSize,
			String workOrderNumber) {
		// TODO Auto-generated method stub
		Session session=hibernateTemplate.getSessionFactory().openSession();
		String hql="FROM PartSerialNumber WHERE WorkOrderId IN (SELECT id FROM WorkOrder WHERE 	WorkOrderNumber LIKE '%"+workOrderNumber+"%')";
		List<SerialDataByWorkOrder> list=new ArrayList<>();
		try{
			Query query=session.createQuery(hql);
			query.setFirstResult((pageIndex-1)*pageSize);
			query.setMaxResults(pageSize);
			@SuppressWarnings("unchecked")	
			List<PartSerialNumber> partSerialNumbers=query.list();
			for (PartSerialNumber partSerialNumber : partSerialNumbers) {
				String state=null;
				if (partSerialNumber.getState()==0) {
					state="不正常";
				}
				else if (partSerialNumber.getState()==1) {
					state="正常";
				}
				else if (partSerialNumber.getState()==-1) {
					state="锁定";
				}
				list.add(new SerialDataByWorkOrder(partSerialNumber.getSerialNumber(), state, workOrderNumber, partSerialNumber.getWorkOrder().getBomHead().getMaterial().getMaterialNumber(), partSerialNumber.getWorkOrder().getBomHead().getMaterial().getCustomerMaterialNumber(), partSerialNumber.getWorkOrder().getBomHead().getMaterial().getDescription()));
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
	}

	@Override
	public int countByWorkOrder(int pageIndex, int pageSize, String workOrderNumber) {
		// TODO Auto-generated method stub
		Session session=hibernateTemplate.getSessionFactory().openSession();
		String hql="SELECT COUNT(*) FROM PartSerialNumber WHERE WorkOrderId IN (SELECT id FROM WorkOrder WHERE 	WorkOrderNumber LIKE '%"+workOrderNumber+"%')";
		List<SerialDataByWorkOrder> list=new ArrayList<>();
		try{
			Query query=session.createQuery(hql);
			int n=Integer.valueOf(query.uniqueResult().toString());
			return n;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			session.close();
		}
	}

	@Override
	public SlavePartSerialNumber getPartSerialNumberByParentSerialNumberId(int MasterPartSerialNumberId) { 
		// TODO Auto-generated method stub
		SerialNumber serialNumber=hibernateTemplate.get(SerialNumber.class, MasterPartSerialNumberId);
		SlavePartSerialNumber slavePartSerialNumber=new SlavePartSerialNumber();
		List<SlavePartSerialNumber> lists=new ArrayList<>();
		slavePartSerialNumber.setCreationDateTime(serialNumber.getCreationDateTime());
		slavePartSerialNumber.setId(MasterPartSerialNumberId);
		slavePartSerialNumber.setMasterSerialNumber(serialNumber.getMasterSerialNumber());
		slavePartSerialNumber.setMaterialId(serialNumber.getMaterialId());
		slavePartSerialNumber.setPosition(serialNumber.getPosition());
		slavePartSerialNumber.setSerialNumber(serialNumber.getSerialNumber());
		slavePartSerialNumber.setState(serialNumber.getState());
		slavePartSerialNumber.setWorkOrderId(serialNumber.getWorkOrderId());
		Session session=hibernateTemplate.getSessionFactory().openSession();
		String hql="SELECT slavePartSerialNumberId FROM PartMergeRecord "
				+ "WHERE masterPartSerialNumberId =:masterPartSerialNumberId)";
		try{
			Query query=session.createQuery(hql);
			query.setParameter("masterPartSerialNumberId", MasterPartSerialNumberId);
			@SuppressWarnings("unchecked")
			List<Integer> list=query.list();	
			if (list.isEmpty()) {
	
			}
			else {
				for (Integer integer : list) {			
					lists.add(getPartSerialNumberByParentSerialNumberId(integer));
				}
			}
			slavePartSerialNumber.setSlavePartSerialNumberList(lists);
			return slavePartSerialNumber;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
	}

	@Override
	public List<SerialNumber> getPartSerialNumberByListId(List<Integer> idList) {
		// TODO Auto-generated method stub
		List<SerialNumber> partSerialNumberlist=new ArrayList<>();
		for (Integer id : idList) {
			partSerialNumberlist.add(hibernateTemplate.get(SerialNumber.class, id));
		}

		return partSerialNumberlist;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		partSerialNumbers=new ArrayList<>();
	}

	@Override
	public SerialNumber getPartSerialNumberById(Integer id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(SerialNumber.class, id);
	}

	@Override
	public List<Integer> getProdcutBySlaveId(Integer id) {
		// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<PartMergeRecord> partMergeRecords=(List<PartMergeRecord>) hibernateTemplate.findByNamedParam("FROM PartMergeRecord WHERE SlavePartSerialNumberId=:SlavePartSerialNumberId","SlavePartSerialNumberId", id);
	/*
	 * @autor TaoHai
	 * @Change 将一个子零件对应一个母零件，改为一个子零件对应多个母零件
	if (partMergeRecords.size()!=0) {
		PartMergeRecord partMergeRecord=partMergeRecords.get(0);
		id=getProdcutBySlaveId(partMergeRecord.getMasterPartSerialNumberId());
	}
	*/
	List<Integer> masterPartSerialNumberIds=new ArrayList<>();
	for (PartMergeRecord partMergeRecord : partMergeRecords) {
		masterPartSerialNumberIds.add(partMergeRecord.getMasterPartSerialNumberId());
	}
		return masterPartSerialNumberIds;
	}

	
	

}



