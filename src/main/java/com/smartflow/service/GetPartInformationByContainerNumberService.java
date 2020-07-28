package com.smartflow.service;

import java.util.List;

import com.smartflow.util.PartInformation;

public interface GetPartInformationByContainerNumberService {


	public List<PartInformation> getPartInformationByContainerNumber(int pageSize,int PageNumber,String ContainerNumber);
	
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
	 *
	 * @return 返回全局变量即深度优先遍历所得的数据集
	 */
	public List<PartInformation> getPartInformation(String containerNumber);

	/**
	 * 初始化基础数据
	 */
	public  void init();
}
