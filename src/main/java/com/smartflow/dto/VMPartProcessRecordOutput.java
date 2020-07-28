package com.smartflow.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VMPartProcessRecordOutput {

	private String WorkOrderNumber; // 工单号      
	private Integer WorkOrderPlannedQuantity; // 工单计划数量   
	private String PartPartNumber;    // 部件料号         
	private String PartState;// 部件状态     
	private String PartDescription;    // 部件描述   
	private String PartDrawingNumber; // 部件图号       
	private String CustomerPartNumber;  // 客户料号   
	private String ContainerNumber;//容器号
//	private List<VMPartProcessRecordRow> PartProcessRecordsData;    // 工艺记录
	@JsonProperty("WorkOrderNumber")
	public String getWorkOrderNumber() {
		return WorkOrderNumber;
	}
	public void setWorkOrderNumber(String workOrderNumber) {
		WorkOrderNumber = workOrderNumber;
	}
	@JsonProperty("WorkOrderPlannedQuantity")
	public Integer getWorkOrderPlannedQuantity() {
		return WorkOrderPlannedQuantity;
	}
	public void setWorkOrderPlannedQuantity(Integer workOrderPlannedQuantity) {
		WorkOrderPlannedQuantity = workOrderPlannedQuantity;
	}
	@JsonProperty("PartPartNumber")
	public String getPartPartNumber() {
		return PartPartNumber;
	}
	public void setPartPartNumber(String partPartNumber) {
		PartPartNumber = partPartNumber;
	}
	@JsonProperty("PartState")
	public String getPartState() {
		return PartState;
	}
	public void setPartState(String partState) {
		PartState = partState;
	}
	@JsonProperty("PartDescription")
	public String getPartDescription() {
		return PartDescription;
	}
	public void setPartDescription(String partDescription) {
		PartDescription = partDescription;
	}
	@JsonProperty("PartDrawingNumber")
	public String getPartDrawingNumber() {
		return PartDrawingNumber;
	}
	public void setPartDrawingNumber(String partDrawingNumber) {
		PartDrawingNumber = partDrawingNumber;
	}
	@JsonProperty("CustomerPartNumber")
	public String getCustomerPartNumber() {
		return CustomerPartNumber;
	}
	public void setCustomerPartNumber(String customerPartNumber) {
		CustomerPartNumber = customerPartNumber;
	}
//	@JsonProperty("PartProcessRecordsData")
//	public List<VMPartProcessRecordRow> getPartProcessRecordsData() {
//		return PartProcessRecordsData;
//	}
//	public void setPartProcessRecordsData(List<VMPartProcessRecordRow> partProcessRecordsData) {
//		PartProcessRecordsData = partProcessRecordsData;
//	}
	@JsonProperty("ContainerNumber")
	public String getContainerNumber() {
		return ContainerNumber;
	}
	public void setContainerNumber(String containerNumber) {
		ContainerNumber = containerNumber;
	}


}
