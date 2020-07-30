package com.smartflow.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartInformation {
	private String CustomerPartNumber;
	private String PartDescription;
	private String PartPartNumber;
	private String PartSerialNumber;
	private String PartState;
	private String MasterSerialNumber;
	private String Level;
	public PartInformation(String customerPartNumber, String partDescription, String partPartNumber,
			String partSerialNumber, String partState,String masterSerialNumber,String level) {
		super();
		CustomerPartNumber = customerPartNumber;
		PartDescription = partDescription;
		PartPartNumber = partPartNumber;
		PartSerialNumber = partSerialNumber;
		PartState = partState;
		MasterSerialNumber=masterSerialNumber;
		Level=level;
	}
	public PartInformation() {};
	@JsonProperty("CustomerPartNumber")
	public String getCustomerPartNumber() {
		return CustomerPartNumber;
	}
	@JsonProperty("PartDescription")
	public String getPartDescription() {
		return PartDescription;
	}
	@JsonProperty("PartPartNumber")
	public String getPartPartNumber() {
		return PartPartNumber;
	}
	@JsonProperty("PartSerialNumber")
	public String getPartSerialNumber() {
		return PartSerialNumber;
	}
	@JsonProperty("PartState")
	public String getPartState() {
		return PartState;
	}
	public void setCustomerPartNumber(String customerPartNumber) {
		CustomerPartNumber = customerPartNumber;
	}
	public void setPartDescription(String partDescription) {
		PartDescription = partDescription;
	}
	public void setPartPartNumber(String partPartNumber) {
		PartPartNumber = partPartNumber;
	}
	public void setPartSerialNumber(String partSerialNumber) {
		PartSerialNumber = partSerialNumber;
	}
	public void setPartState(String partState) {
		PartState = partState;
	}
	@JsonProperty("MasterSerialNumber")
	public String getMasterSerialNumber() {
		return MasterSerialNumber;
	}
	public void setMasterSerialNumber(String masterSerialNumber) {
		MasterSerialNumber = masterSerialNumber;
	}
	@JsonProperty("Level")
	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}
}
