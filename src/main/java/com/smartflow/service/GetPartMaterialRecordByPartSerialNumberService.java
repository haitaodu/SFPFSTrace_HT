package com.smartflow.service;

import com.smartflow.util.MaterialRecordOutput;

/**
 * @author haita
 */
public interface GetPartMaterialRecordByPartSerialNumberService {

	/**
	 * 根据物料号深度优先遍历所有的物料记录信息
	 * @param serialNumber 物料号
	 * @return 返回物料输出信息列表
	 */
	public MaterialRecordOutput getPartMaterialRecordById(String serialNumber);
		/**
		 * 初始化数据
		 */
		public void init();
}
