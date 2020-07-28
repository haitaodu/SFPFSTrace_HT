package com.smartflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VMPartRepairRecordInput {

	private String PartSerialNumber;
	private Integer PageIndex;
	private Integer PageSize;
	@JsonProperty("PartSerialNumber")
	public String getPartSerialNumber() {
		return PartSerialNumber;
	}
	public void setPartSerialNumber(String partSerialNumber) {
		PartSerialNumber = partSerialNumber;
	}
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
	
}
