package com.smartflow.dao;

import com.smartflow.view.StationList;

import java.util.List;
import java.util.Map;

public interface StationDao {


	/**
	 * 查询工站下拉列表(只保留生产工站、测试工站、打标工站)
	 * @return
	 */
	public List<Map<String, Object>> getStation();

	/**
	 * 获取打标机所在的工站id和岛区id
	 * @return
	 */
	public List<Map<String,Object>> getMarkingMachineIdAndCellId();

	/**
	 * 根据工站Id和线体Id查询打标机前的所有工站
	 * @return
	 */
	public List<Map<String, Object>> getStationListInFrontOfMarkingMachineByStationIdAndCellId(Integer stationId, Integer cellId);

	/**
	 *
	 * @param workOrderId 工单Id
	 * @param cellId 岛区Id
	 * @return 返回工站信息列表
	 */
	public List<StationList> getStationList(long workOrderId, int cellId);



	public int getCellByWorkOrderId(long workOrderId,String stationNumber);
} 
