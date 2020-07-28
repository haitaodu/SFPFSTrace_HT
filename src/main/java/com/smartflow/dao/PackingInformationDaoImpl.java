package com.smartflow.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.smartflow.dto.VMPartInformationOfFinishGoodBoxInput;
import com.smartflow.model.PackingInformation;
@Repository
public class PackingInformationDaoImpl implements PackingInformationDao{


	@Autowired
	HibernateTemplate hibernateTemplate;
	@Override
	public List<PackingInformation> getPackingInformationList(VMPartInformationOfFinishGoodBoxInput vmPartInformationOfFinishGoodBoxInput) {
//		String hql = "from PackingInformation where Container in (select id from Container where ContainerNumber = ?)";
//		return (List<PackingInformation>) hibernateTemplate.find(hql, containerNumber);
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "from PackingInformation where container in (select id from Container where containerNumber = :containerNumber)";
		try{
			Query query = session.createQuery(hql);	
			query.setString("containerNumber", vmPartInformationOfFinishGoodBoxInput.getContainerNumber());
			query.setFirstResult((vmPartInformationOfFinishGoodBoxInput.getPageIndex()-1)*vmPartInformationOfFinishGoodBoxInput.getPageSize());
			query.setMaxResults(vmPartInformationOfFinishGoodBoxInput.getPageSize());
			return query.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
	}
	@Override
	public Integer getRowCountOfPackingInformationList(
			VMPartInformationOfFinishGoodBoxInput vmPartInformationOfFinishGoodBoxInput) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		String hql = "select count(*) from PackingInformation where container in (select id from Container where containerNumber = :containerNumber)";
		try{
			Query query = session.createQuery(hql);
			query.setString("containerNumber", vmPartInformationOfFinishGoodBoxInput.getContainerNumber());
			System.out.println(query.uniqueResult().toString());
			if (query.uniqueResult()==null) {
				return null;
			}else{
				return Integer.parseInt(query.uniqueResult().toString());
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}		
	}


}
