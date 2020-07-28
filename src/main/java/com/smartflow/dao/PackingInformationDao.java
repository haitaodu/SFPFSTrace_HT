package com.smartflow.dao;

import java.util.List;

import com.smartflow.dto.VMPartInformationOfFinishGoodBoxInput;
import com.smartflow.model.PackingInformation;

public interface PackingInformationDao {

	/**
	 * 根据成品箱号查询序列号
	 * @param containerNumber
	 * @return
	 */
	public List<PackingInformation> getPackingInformationList(VMPartInformationOfFinishGoodBoxInput vmPartInformationOfFinishGoodBoxInput);

	/**
	 * 根据成品箱号查询序列号的总条数
	 * @param vmPartInformationOfFinishGoodBoxInput
	 * @return
	 */
	public Integer getRowCountOfPackingInformationList(VMPartInformationOfFinishGoodBoxInput vmPartInformationOfFinishGoodBoxInput);
}
