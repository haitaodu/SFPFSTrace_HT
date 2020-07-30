package com.smartflow.service;

import java.util.List;
import java.util.Map;

public interface StationService {
	/**
	 * 查询工站下拉列表
	 * @return
	 */
	public List<Map<String, Object>> getStation();
}
