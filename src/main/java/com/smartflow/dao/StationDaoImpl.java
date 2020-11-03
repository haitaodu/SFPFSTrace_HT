package com.smartflow.dao;

import java.util.List;
import java.util.Map;

import com.smartflow.view.StationList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StationDaoImpl implements StationDao{

	private final
	HibernateTemplate hibernateTemplate;

	@Autowired
	public StationDaoImpl(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> getStation() {
		SessionFactory sessionFactory = hibernateTemplate.getSessionFactory();
		Session session = sessionFactory.openSession();
		String sql = "select Id [key],CONCAT(StationNumber,'|'+Name) label from core.Station where State=1 Order By StationNumber";
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

	@Override
	public List<Map<String, Object>> getMarkingMachineIdAndCellId() {
		SessionFactory sessionFactory = hibernateTemplate.getSessionFactory();
		Session session = sessionFactory.openSession();
		String sql = "select distinct s.Id,s.StationNumber,s.Name,s.StationType,g.CellId from core.Station s inner join core.Station_StationGroup sg on s.Id = sg.StationtId inner join core.StationGroup g on g.Id = sg.StationGroupId where s.StationType = 11";
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



	@Override
	public List<Map<String, Object>> getStationListInFrontOfMarkingMachineByStationIdAndCellId(Integer stationId, Integer cellId){
		SessionFactory sessionFactory = hibernateTemplate.getSessionFactory();
		Session session = sessionFactory.openSession();
		String sql = "select s.Id [key],CONCAT(s.StationNumber,'|'+s.Name) label from core.Station s inner join core.Station_StationGroup sg on s.Id = sg.StationtId inner join core.StationGroup g on g.Id = sg.StationGroupId where s.State <> 5 and s.State = 1 and g.State = 1 and s.Id <= :stationId and g.CellId = :cellId";
		try{
			Query query = session.createSQLQuery(sql);
			query.setParameter("stationId", stationId);
			query.setParameter("cellId", cellId);
			return query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StationList> getStationList(long workOrderId, int cellId) {
		String hql="from StationList where workerId=:workOrderId " +
				"and cellId=:cellId order by  processStepId";
		String[] paramName= new String[]{"workOrderId","cellId"};
		Object[] value=new Object[]{workOrderId,cellId};
		return (List<StationList>)hibernateTemplate.findByNamedParam
				(hql, paramName,value);
	}



	@SuppressWarnings("unchecked")
	@Override
	public int getCellByWorkOrderId(long workOrderId, String stationNumber) {
		String hql="from StationList where workerId=:workOrderId " +
				"and stationNumber=:stationNumber";
		String[] paramName= new String[]{"workOrderId","stationNumber"};
		Object[] value=new Object[]{workOrderId,parseToStationName(stationNumber)};
		List<StationList> stationLists= (List<StationList>)hibernateTemplate.findByNamedParam
				(hql, paramName,value);
		if (stationLists.isEmpty()) {
			return 0;
		} else {
			return stationLists.get(0).getCellId();
		}
	}

	private String parseToStationName(String stationNumber)
	{
	String args=stationNumber.substring(3,stationNumber.length());
	String split=args.substring(0,2);
	String staion=split+"_"+args.substring(2,args.length());
	return staion;
	}
}
