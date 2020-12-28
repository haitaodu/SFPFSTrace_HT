package com.smartflow.service;

import com.smartflow.dto.StationLinkTableNameDTO;

import java.util.List;
import java.util.Map;

public interface StationService {
	/**
	 * 查询工站下拉列表
	 * @return
	 */
	public List<Map<String, Object>> getStation();

	/**
	 * 查询打标机前几站的列表
	 * @param stationNumer 工站名
	 * @param workOrderId 工单id
	 * @return 返回工站列表
	 */
	public Map<String,Object> getStationList(String stationNumer,long workOrderId);

	/**
	 * 查询打标机前的所有工站
	 * @return
	 */
	public List<Map<String, Object>> getStationListInFrontOfMarkingMachine();

	/**
	 * 根据工站编号查询工站id
	 * @param stationNumber
	 * @return
	 */
	public Integer getStationIdByStationNumber(String stationNumber);

	/**
	 * 根据岛区查询工站关联表
	 * @param cellNumber
	 * @return
	 */
	public List<StationLinkTableNameDTO> getStationLinkTableNameByCell(String cellNumber);


}
