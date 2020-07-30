package com.smartflow.dao;

import com.smartflow.model.Container;
import com.smartflow.util.MaterialContainer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TracePartMaterialRecordImpl implements TracePartMaterialRecord{
	@Autowired
	HibernateTemplate hibernate;
	@Autowired
	MaterialDao materialDao;
	@Autowired
	SupplierDao supplierDao;
	int n=0;
	@Override
	public List<MaterialContainer> getDataForMaterialRecord(String containerNumber, String materialPartNumber,
			String supplierCode, String batchNumber, String supplierMaterialPartNumber, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		Session session=hibernate.getSessionFactory().openSession();
		
		/*
		Map<String, Object> map=new HashMap<>();
		String hString="SELECT NEW MAP(COUNT (*) AS Count,Id AS Id,ContainerNumber AS ContainerNumber,Material AS Material,TotalQuantity AS TotalQuantity,CurrentLocationId AS CurrentLocationId,BatchNumber AS BatchNumber,SupplierId AS SupplierId"
				+ ",ManufacturingDateTime AS ManufacturingDateTime,ExpirationDate AS ExpirationDate, CreationDateTime AS  CreationDateTime,PackingStartDateTime AS PackingStartDateTime"
				+ ",PackingCompleteDateTime AS PackingCompleteDateTime,CreatorId AS CreatorId,PackingUserId AS PackingUserId"
				+ ",MSDLifeReminingTimeInMinute AS MSDLifeReminingTimeInMinute,state AS state) FROM Container WHERE State!=-1";
		*/
		
		
		
		String hql="FROM Container WHERE State!=-1 ";
		if (containerNumber!=null) {
			hql+="AND ContainerNumber  LIKE '%"+containerNumber+"%' ";
		}
		if (materialPartNumber!=null) {
			hql+="AND MaterialId IN (FROM Material WHERE MaterialNumber LIKE '%"+materialPartNumber+"%' ) ";
		}
		if (batchNumber!=null) {
			hql+="AND BatchNumber  LIKE '%"+batchNumber+"%' ";
		}
		if (supplierCode!=null) {
			hql+="AND SupplierId IN (FROM SupplierModel WHERE SupplierCode LIKE '%"+supplierCode+"%' ) ";
		}
		//此处判别为是否是空字符串的目的是避免查不到为null的情况
		if (supplierMaterialPartNumber!=null && !"".equals(supplierMaterialPartNumber)) {
			hql+="AND MaterialId IN (FROM Material WHERE SupplierMaterialNumber LIKE '%"+supplierMaterialPartNumber+"%' ) ";
		}
		try{
			Query query=session.createQuery(hql);
			
			query.setFirstResult((pageIndex-1)*pageSize);
			query.setMaxResults(pageSize);
			
			List<MaterialContainer> materialContainers=new ArrayList<>();
			@SuppressWarnings("unchecked")
			List<Container> containers=query.list();
			for (Container container : containers) {
				String containerState = "";
				if(container.getState() == 1){
					containerState = "正常";
				}else if(container.getState() == 0){
					containerState = "锁定";
				}
				materialContainers.add(new MaterialContainer(container.getContainerNumber(), containerState, container.getMaterial().getMaterialNumber()+(container.getMaterial().getDescription()==""?"":"("+container.getMaterial().getDescription()+")"), container.getMaterial().getSupplierMaterialNumber(), container.getSupplier().getName(),container.getBatchNumber()));
			}
			return materialContainers;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
	}
	@Override
	public int getCountData(String containerNumber, String materialPartNumber, String supplierCode, String batchNumber,
			String supplierMaterialPartNumber, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		Session session=hibernate.getSessionFactory().openSession();
		String hql="SELECT COUNT (*) FROM Container WHERE State!=-1 ";
		if (containerNumber!=null) {
			hql+="AND ContainerNumber  LIKE '%"+containerNumber+"%' ";
		}
		if (materialPartNumber!=null) {
			hql+="AND MaterialId IN (FROM Material WHERE MaterialNumber LIKE '%"+materialPartNumber+"%' ) ";
		}
		if (batchNumber!=null) {
			hql+="AND BatchNumber  LIKE '%"+batchNumber+"%' ";
		}
		if (supplierCode!=null) {
			hql+="AND SupplierId IN (FROM SupplierModel WHERE SupplierCode LIKE '%"+supplierCode+"%' ) ";
		}
		if (supplierMaterialPartNumber!=null) {
			hql+="AND MaterialId IN (FROM Material WHERE SupplierMaterialNumber LIKE '%"+supplierMaterialPartNumber+"%' ) ";
		}
		try{
			Query query=session.createQuery(hql);
			Integer count=Integer.valueOf(query.uniqueResult().toString());
			return count;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			session.close();
		}
	
	}
}
