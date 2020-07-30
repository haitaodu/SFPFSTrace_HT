package com.smartflow.dao;

import com.smartflow.model.Material;

public interface MaterialDao {
	//根据Id找到相应的物料信息
	public Material getMaterialModelById(int id);

}
