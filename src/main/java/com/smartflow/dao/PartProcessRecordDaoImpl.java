package com.smartflow.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.smartflow.dto.VMTracePartByStationInput;
import com.smartflow.model.PartProcessRecord;
@Repository
public class PartProcessRecordDaoImpl implements PartProcessRecordDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public Integer getTotalCountFromPartProcessRecordList(VMTracePartByStationInput vmTracePartByStationInput) {
		String hql = "select count(*) from PartProcessRecord p where p.station = :Station and p.bookDateTime between :StartDateTime and :EndDateTime ";
		Session session = hibernateTemplate.getSessionFactory().openSession();
		try{
			Query query = session.createQuery(hql);
			query.setInteger("Station", vmTracePartByStationInput.getStationId());		
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");//注意格式化的表达式
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {
				String StartDateTime = vmTracePartByStationInput.getStartDateTime();
				if (StartDateTime!=null && !"".equals(StartDateTime)) {
					Date startDateTime = format.parse(StartDateTime);
					query.setDate("StartDateTime", startDateTime);	
				}
				String EndDateTime = vmTracePartByStationInput.getEndDateTime();
				if (EndDateTime!=null && !"".equals(EndDateTime)) {			
					Date endDateTime = format.parse(EndDateTime);	
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(endDateTime);
					calendar.add(Calendar.DAY_OF_MONTH, 1);
					System.out.println(calendar.getTime());
					query.setDate("EndDateTime", calendar.getTime());								
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}		
			if (query.uniqueResult()!=null) {
				return Integer.parseInt(query.uniqueResult().toString());
			}else {
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
	public List<PartProcessRecord> getPartProcessRecordList(VMTracePartByStationInput vmTracePartByStationInput) {
		String hql = "from PartProcessRecord p where p.station = :Station and p.bookDateTime between :StartDateTime and :EndDateTime order by p.bookDateTime desc ";
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		query.setInteger("Station", vmTracePartByStationInput.getStationId());		
		//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");//注意格式化的表达式
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try{
			try {
				String StartDateTime = vmTracePartByStationInput.getStartDateTime();
				Date startDateTime = null;
				if (StartDateTime!=null && !"".equals(StartDateTime)) {
					startDateTime = format.parse(StartDateTime);
					query.setDate("StartDateTime", startDateTime);	
				}
				String EndDateTime = vmTracePartByStationInput.getEndDateTime();
				if (EndDateTime!=null && !"".equals(EndDateTime)) {			
					Date endDateTime = format.parse(EndDateTime);	
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(endDateTime);
					calendar.add(Calendar.DAY_OF_MONTH, 1);
					System.out.println(calendar.getTime());
					query.setDate("EndDateTime", calendar.getTime());								
				}				
			} catch (ParseException e) {
				e.printStackTrace();
			}		
			query.setFirstResult((vmTracePartByStationInput.getPageIndex()-1)*vmTracePartByStationInput.getPageSize());
			query.setMaxResults(vmTracePartByStationInput.getPageSize());
			return query.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}	
	}

}
