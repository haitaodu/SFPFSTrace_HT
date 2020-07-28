package com.smartflow.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.smartflow.dto.VMPartRepairRecordInput;
import com.smartflow.model.PartFailureDataRecord;
import com.smartflow.model.PartRepairQualityCheckRecord;
import com.smartflow.model.PartRepairRecord;
import com.smartflow.model.PartSerialNumber;
import com.smartflow.model.Station;
@Repository
public class PartRepairRecordDaoImpl implements PartRepairRecordDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public List<PartSerialNumber> getPartSerialNumberBySerialNumber(VMPartRepairRecordInput vmPartRepairRecordInput) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "from PartSerialNumber where serialNumber = :serialNumber ";
		try{
			Query query = session.createQuery(hql);
			query.setString("serialNumber", vmPartRepairRecordInput.getPartSerialNumber());
			return query.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
		
	}
	
	@Override
	public Integer getTotalCountFromPartRepairRecordBySerialNumber(VMPartRepairRecordInput vmPartRepairRecordInput) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "select count(*) from PartRepairRecord where partFailureDataRecord in (select id from PartFailureDataRecord where partSerialNumber in (select id from PartSerialNumber where serialNumber = :serialNumber))";
		try{
			Query query = session.createQuery(hql);
			query.setString("serialNumber", vmPartRepairRecordInput.getPartSerialNumber());
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
	public List<PartRepairRecord> getPartRepairRecordBySerialNumber(VMPartRepairRecordInput vmPartRepairRecordInput) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		//String hql = "from PartRepairRecord where partFailureDataRecord in (select id from PartFailureDataRecord where partSerialNumber in (select id from PartSerialNumber where serialNumber = :serialNumber))";
		String sql = "select s.Id,s.CreatorId,s.CreationDateTime,s.SequenceNumber,s.PartFailureDataRecordId,s.RepairState,s.RepairActionId,s.RepairQuality,s.RepairStationId from (select *,ROW_NUMBER() over (partition by SequenceNumber order by Id) as group_index from trace.PartRepairRecord "
				+ "where PartFailureDataRecordId in (select Id from trace.PartFailureDataRecord "
				+ "where PartSerialNumberId in (select Id from core.PartSerialNumber "
				+ "where SerialNumber = :serialNumber))) s where s.group_index = 1;";
		try{
			Query query = session.createSQLQuery(sql).addEntity(PartRepairRecord.class);
			query.setString("serialNumber", vmPartRepairRecordInput.getPartSerialNumber());
			return query.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}

	}
	
	@Override
	public Integer getTotalCountFromPartRepairRecordById(Integer id) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "select count(*) from PartRepairRecord where id = "+id;
		try{
			Query query = session.createQuery(hql);
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
	public PartRepairRecord getPartRepairRecordById(Integer id) {
		return hibernateTemplate.get(PartRepairRecord.class, id);
	}

	@Override
	public PartRepairQualityCheckRecord getPartRepairQualityCheckRecordByPartRepairRecordId(
			Integer partRepairRecordId) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "from PartRepairQualityCheckRecord where PartRepairRecordId = "+partRepairRecordId+" order by CreationDateTime desc";
		try{
			Query query = session.createQuery(hql);
			query.setFirstResult(0);
			query.setMaxResults(1);
			if (query.uniqueResult()!=null) {
				return (PartRepairQualityCheckRecord) query.uniqueResult();
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
	public List<PartFailureDataRecord> getPartFailureDataRecordByPartRepairRecordId(Integer partRepairRecordId) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "select pf from PartFailureDataRecord pf,PartRepairRecord pr where pf.id = pr.partFailureDataRecord and pf.partSerialNumber = (select partSerialNumber from PartFailureDataRecord where id = (select partFailureDataRecord from PartRepairRecord where id = "+partRepairRecordId+")) and pr.sequenceNumber = (select sequenceNumber from PartRepairRecord where id = "+partRepairRecordId+")";
		try{
			Query query = session.createQuery(hql);
			return query.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
	}

	@Override
	public Integer getTotalCountFromPartFailureDataRecordByPartRepairRecordId(Integer partRepairRecordId) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "select count(*) from PartFailureDataRecord pf,PartRepairRecord pr where pf.id = pr.partFailureDataRecord and pf.partSerialNumber = (select partSerialNumber from PartFailureDataRecord where id = (select partFailureDataRecord from PartRepairRecord where id = "+partRepairRecordId+")) and pr.sequenceNumber = (select sequenceNumber from PartRepairRecord where id = "+partRepairRecordId+")";
		try{
			Query query = session.createQuery(hql);
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

}
