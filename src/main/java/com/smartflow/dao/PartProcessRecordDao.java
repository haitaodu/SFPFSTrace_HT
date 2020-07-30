package com.smartflow.dao;

import java.util.List;

import com.smartflow.dto.VMTracePartByStationInput;
import com.smartflow.model.PartProcessRecord;

public interface PartProcessRecordDao {
	
	/**
	 * 查询工件加工记录总条数
	 * @param vmTracePartByStationInput
	 * @return
	 */
	public Integer getTotalCountFromPartProcessRecordList(VMTracePartByStationInput vmTracePartByStationInput);

	/**
	 * 查询工件加工记录
	 * @param vmTracePartByStationInput
	 * @return
	 */
	public List<PartProcessRecord> getPartProcessRecordList(VMTracePartByStationInput vmTracePartByStationInput); 
}
