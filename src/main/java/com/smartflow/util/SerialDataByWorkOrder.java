package com.smartflow.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mchange.util.impl.StringEnumerationHelperBase;

public class SerialDataByWorkOrder {
	private String SerialNumber;
	private String State;
	private String WorkerOrder;
	private String MaterialNumber;
	private String CustomerMaterialNumber;
	private String Description;
	@JsonProperty("SerialNumber")
	public String getSerialNumber() {
		return SerialNumber;
	}
	@JsonProperty("State")
	public String getState() {
		return State;
	}
	public SerialDataByWorkOrder(String serialNumber, String state, String workerOrder, String materialNumber,
			String customerMaterialNumber, String description) {
		super();
		SerialNumber = serialNumber;
		State = state;
		WorkerOrder = workerOrder;
		MaterialNumber = materialNumber;
		CustomerMaterialNumber = customerMaterialNumber;
		Description = description;
	}
	@JsonProperty("WorkerOrder")
	public String getWorkerOrder() {
		return WorkerOrder;
	}
	@JsonProperty("MaterialNumber")
	public String getMaterialNumber() {
		return MaterialNumber;
	}
	@JsonProperty("CustomerMaterialNumber")
	public String getCustomerMaterialNumber() {
		return CustomerMaterialNumber;
	}
	@JsonProperty("Description")
	public String getDescription() {
		return Description;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public void setState(String state) {
		State = state;
	}
	public void setWorkerOrder(String workerOrder) {
		WorkerOrder = workerOrder;
	}
	public void setMaterialNumber(String materialNumber) {
		MaterialNumber = materialNumber;
	}
	public void setCustomerMaterialNumber(String customerMaterialNumber) {
		CustomerMaterialNumber = customerMaterialNumber;
	}
	public void setDescription(String description) {
		Description = description;
	}
	

}
