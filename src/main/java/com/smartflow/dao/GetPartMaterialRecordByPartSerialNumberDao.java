package com.smartflow.dao;

import com.smartflow.util.MaterialRecordOutput;

/**
 * @author haita
 */
public interface GetPartMaterialRecordByPartSerialNumberDao {
	/**
	 * 根据序列号查找物料记录显示给前端
	 * @param serialNumber 物料记录
	 * @return 返回物料记录
	 */
	public MaterialRecordOutput getPartMaterialRecordById(String serialNumber);
	/*
	 * 初始化物料记录子列表
	 */
	public void init();
	/*
	 * @author DU
	 * eg:对递归调用的法则进行重构，加入依据ContainerId的递归排序分类进行排序的分类判断,用于补充
	 */
	public void getPartMaterialRecordByContainerId(int id);
}
