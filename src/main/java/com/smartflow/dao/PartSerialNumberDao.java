package com.smartflow.dao;

import java.util.List;

import com.smartflow.dto.VMPartProcessRecordInput;
import com.smartflow.model.PartMaterialRecord;
import com.smartflow.model.PartMergeRecord;
import com.smartflow.model.PartSerialNumber;
import com.smartflow.model.SerialNumber;
import com.smartflow.model.SlavePartSerialNumber;
import com.smartflow.util.SerialDataByWorkOrder;



public interface PartSerialNumberDao {
	
	/**
	 * 根据系列编号查询工件序列号的总条数
	 * @param vmPartProcessRecordInput
	 * @return
	 */
	public Integer getTotalCountFromPartSerialNumberBySerialNumber(VMPartProcessRecordInput vmPartProcessRecordInput);
	
	/**
	 * 根据系列编号查询工件序列号
	 * @param vmPartProcessRecordInput
	 * @return
	 */
	public List<PartSerialNumber> getPartSerialNumberBySerialNumber(VMPartProcessRecordInput vmPartProcessRecordInput);
	
	/**
	 * 根据系列编号查询工件序列号倒叙排列
	 * @param vmPartProcessRecordInput
	 * @return
	 */
	public List<PartSerialNumber> getPartSerialNumberBySerialNumberDesc(VMPartProcessRecordInput vmPartProcessRecordInput);
	/*
	 * 根据工单号找出序列号信息
	 */
   public List<SerialDataByWorkOrder> getPartSerialNumberByWorkOrder(int pageIndex,int pageSize,String workOrderNumber);
   /*
    * 根据工单找出总的列数信息
    */
   public int countByWorkOrder(int pageIndex,int pageSize,String workOrderNumber);
   /*
    * 
    * 根据父节点序列号找到以后得节点的序列号
    */
   public SlavePartSerialNumber getPartSerialNumberByParentSerialNumberId(int MasterPartSerialNumberId);
   /*
    * 
    * 根据所查到的PartSerialNumberId数组找出相应的PartSerialNumber数组的信息
    */
   public List<SerialNumber> getPartSerialNumberByListId(List<Integer> idList);
   /*
    * 初始化PartSerialNumberList
    */
   public void init();
   /*
    * 根据Id查找SerialNumber数据
    */
   public SerialNumber getPartSerialNumberById(Integer id);
   /*
    * 根据部分工件找到成品批次号
    */
   public List<Integer> getProdcutBySlaveId(Integer id);

}
