package com.smartflow.dao;

import java.util.List;
import java.util.Map;

public interface StationDao {

	/**
	 * 查询工站下拉列表
	 * @return
	 */
	public List<Map<String, Object>> getStation();
} 
