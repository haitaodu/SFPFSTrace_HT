package com.smartflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartflow.dao.PackingInformationDao;
import com.smartflow.dto.VMPartInformationOfFinishGoodBoxInput;
import com.smartflow.model.PackingInformation;
@Service
public class PackingInformationServiceImpl implements PackingInformationService {

	@Autowired
	PackingInformationDao packingInformationDao;
	@Override
	public List<PackingInformation> getPackingInformationList(VMPartInformationOfFinishGoodBoxInput vmPartInformationOfFinishGoodBoxInput) {
		return packingInformationDao.getPackingInformationList(vmPartInformationOfFinishGoodBoxInput);
	}
	@Override
	public Integer getRowCountOfPackingInformationList(
			VMPartInformationOfFinishGoodBoxInput vmPartInformationOfFinishGoodBoxInput) {
		return packingInformationDao.getRowCountOfPackingInformationList(vmPartInformationOfFinishGoodBoxInput);
	}

}
