package com.smartflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VMPartInformationOfFinishGoodBoxInput {
	private Integer PageIndex;
	private Integer PageSize;
	private String ContainerNumber;
	@JsonProperty("PageIndex")
	public Integer getPageIndex() {
		return PageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		PageIndex = pageIndex;
	}
	@JsonProperty("PageSize")
	public Integer getPageSize() {
		return PageSize;
	}
	public void setPageSize(Integer pageSize) {
		PageSize = pageSize;
	}
	@JsonProperty("ContainerNumber")
	public String getContainerNumber() {
		return ContainerNumber;
	}
	public void setContainerNumber(String containerNumber) {
		ContainerNumber = containerNumber;
	}
	
}
