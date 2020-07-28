package com.smartflow.dao;

import java.util.List;

import com.smartflow.dto.VMPartRepairRecordInput;
import com.smartflow.model.PartFailureDataRecord;
import com.smartflow.model.PartRepairQualityCheckRecord;
import com.smartflow.model.PartRepairRecord;
import com.smartflow.model.PartSerialNumber;

public interface PartRepairRecordDao {

	/**
	 * 根据序列编号查询工件
	 * @param vmPartRepairRecordInput
	 * @return
	 */
	public List<PartSerialNumber> getPartSerialNumberBySerialNumber(VMPartRepairRecordInput vmPartRepairRecordInput);
	
	/**
	 * 根据工件序列号查询工件维修记录总条数
	 * @param vmPartRepairRecordInput
	 * @return
	 */
	public Integer getTotalCountFromPartRepairRecordBySerialNumber(VMPartRepairRecordInput vmPartRepairRecordInput);
	
	/**
	 * 根据工件序列号查询工件维修记录
	 * @param vmPartRepairRecordInput
	 * @return
	 */
	public List<PartRepairRecord> getPartRepairRecordBySerialNumber(VMPartRepairRecordInput vmPartRepairRecordInput);
	
	/**
	 * 根据工件维修记录id查询工件维修记录总条数
	 * @param id
	 * @return
	 */
	public Integer getTotalCountFromPartRepairRecordById(Integer id);
	
	/**
	 * 根据工件维修记录id查询工件维修记录详情
	 * @param id
	 * @return
	 */
	public PartRepairRecord getPartRepairRecordById(Integer id);
	
	/**
	 * 根据工件维修记录id查询工件维修质量判定记录
	 * @param partRepairRecordId 工件维修记录id
	 * @return
	 */
	public PartRepairQualityCheckRecord getPartRepairQualityCheckRecordByPartRepairRecordId(Integer partRepairRecordId);

	/**
	 * 根据工件维修记录id查询工件维修失效记录总条数
	 * @param partRepairRecordId
	 * @return
	 */
	public Integer getTotalCountFromPartFailureDataRecordByPartRepairRecordId(Integer partRepairRecordId);
	
	/**
	 * 根据工件维修记录id查询工件维修失效记录
	 * @param partRepairRecordId
	 * @return
	 */
	public List<PartFailureDataRecord> getPartFailureDataRecordByPartRepairRecordId(Integer partRepairRecordId);
}
