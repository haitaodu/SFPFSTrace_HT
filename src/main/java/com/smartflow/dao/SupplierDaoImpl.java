package com.smartflow.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.smartflow.model.SupplierModel;
@Repository
public class SupplierDaoImpl implements SupplierDao{
@Autowired
HibernateTemplate hibernate;

	@Override
	public SupplierModel getSupplierModelById(int id) {
		// TODO Auto-generated method stub
		return hibernate.get(SupplierModel.class, id);
	}

}
