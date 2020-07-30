package com.smartflow.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.smartflow.model.Material;
@Repository
public class MaterialDaoImpl implements MaterialDao{
@Autowired
HibernateTemplate hibernate;
	@Override
	public Material getMaterialModelById(int id) {
		// TODO Auto-generated method stub
		return hibernate.get(Material.class, id);
	}

}
