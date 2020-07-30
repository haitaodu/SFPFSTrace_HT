package com.smartflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartflow.dao.GetPartInformationByContainerNumber;
import com.smartflow.util.PartInformation;
@Service
public class GetPartInformationByContainerNumberServiceImpl implements GetPartInformationByContainerNumberService{
@Autowired
GetPartInformationByContainerNumber getPartInformation;

	@Override
	public List<PartInformation> getPartInformationByContainerNumber(int pageSize, int PageNumber,
			String ContainerNumber) {
		// TODO Auto-generated method stub
		return getPartInformation.getPartInformationByContainerNumber(pageSize, PageNumber, ContainerNumber);
	}
	@Override
	public int getRowCountInChosenContainerNumber(String ContainerNumber) {
		// TODO Auto-generated method stub
		return getPartInformation.getRowCountInChosenContainerNumber(ContainerNumber);
	}

	@Override
	public void getPartMaterialRecordByContainerNumber(int containerNumberId) {
		getPartInformation.getPartMaterialRecordByContainerNumber(containerNumberId);
	}

	@Override
	public List<PartInformation> getPartInformation(String containerNumber) {
		return getPartInformation.getPartInformation(containerNumber);
	}

	@Override
	public void init() {
		getPartInformation.init();
	}

}
