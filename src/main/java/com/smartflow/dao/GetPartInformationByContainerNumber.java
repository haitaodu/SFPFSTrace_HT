package com.smartflow.dao;

import com.smartflow.util.PartInformation;

import java.util.List;

public interface GetPartInformationByContainerNumber {

	
	public List<PartInformation> getPartInformationByContainerNumber(int pageSize, int PageNumber, String ContainerNumber);
	
	public int getRowCountInChosenContainerNumber(String ContainerNumber);

	/**
	 *
	 * @param containerNumber
	 * @return 返回的参数为PartInformation的集合
	 * @time 2019/6/11
	 * @reason 更改掉带分页的请求和追溯的正向查找相同
	 */

	public void getPartMaterialRecordByContainerNumber(int containerNumberId);


	/**
	 * @param  给定的containerNumber参数
	 * @return 返回全局变量即深度优先遍历所得的数据集
	 * @time 2018/6/12
	 */
	public List<PartInformation> getPartInformation(String containerNumber);

	/**
	 * 初始化数据集
	 */
	public  void init();
}
