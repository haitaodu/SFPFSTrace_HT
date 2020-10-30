package com.smartflow.dao;

import com.smartflow.view.StationList;

import java.util.List;
import java.util.Map;

public interface StationDao {

	/**
	 * 查询工站下拉列表
	 * @return
	 */
	public List<Map<String, Object>> getStation();

	/**
	 *
	 * @param workOrderId 工单Id
	 * @param cellId 岛区Id
	 * @return 返回工站信息列表
	 */
	public List<StationList> getStationList(long workOrderId, int cellId);



	public int getCellByWorkOrderId(long workOrderId,String stationNumber);
} 
