package com.smartflow.util;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaterialRecordOutput {
	private String WorkOrderNumber;
	private BigDecimal WorkOrderPlannedQuantity;
	private String PartPartNumber;
	private String PartState;
	private String PartDescription;
	private String PartDrawingNumber;
	private String CustomerPartNumber;
	private String ContainerNumber;//包装箱号
	private List<VMPartMaterialRecordRow> PartMaterialRecordRowData;
	private String Level;
	@JsonProperty("WorkOrderNumber")
	public String getWorkOrderNumber() {
		return WorkOrderNumber;
	}
	@JsonProperty("WorkOrderPlannedQuantity")
	public BigDecimal getWorkOrderPlannedQuantity() {
		return WorkOrderPlannedQuantity;
	}
	@JsonProperty("PartPartNumber")
	public String getPartPartNumber() {
		return PartPartNumber;
	}
	@JsonProperty("PartState")
	public String getPartState() {
		return PartState;
	}
	@JsonProperty("PartDescription")
	public String getPartDescription() {
		return PartDescription;
	}
	@JsonProperty("PartDrawingNumber")
	public String getPartDrawingNumber() {
		return PartDrawingNumber;
	}
	@JsonProperty("CustomerPartNumber")
	public String getCustomerPartNumber() {
		return CustomerPartNumber;
	}
	@JsonProperty("ContainerNumber")
	public String getContainerNumber() {
		return ContainerNumber;
	}

	public void setContainerNumber(String containerNumber) {
		ContainerNumber = containerNumber;
	}
	@JsonProperty("PartMaterialRecordRowData")
	public List<VMPartMaterialRecordRow> getPartMaterialRecordRowData() {
		return PartMaterialRecordRowData;
	}
	public void setWorkOrderNumber(String workOrderNumber) {
		WorkOrderNumber = workOrderNumber;
	}
	public void setWorkOrderPlannedQuantity(BigDecimal workOrderPlannedQuantity) {
		WorkOrderPlannedQuantity = workOrderPlannedQuantity;
	}
	public void setPartPartNumber(String partPartNumber) {
		PartPartNumber = partPartNumber;
	}
	public void setPartState(String partState) {
		PartState = partState;
	}
	public void setPartDescription(String partDescription) {
		PartDescription = partDescription;
	}
	public void setPartDrawingNumber(String partDrawingNumber) {
		PartDrawingNumber = partDrawingNumber;
	}
	public void setCustomerPartNumber(String customerPartNumber) {
		CustomerPartNumber = customerPartNumber;
	}
	public void setPartMaterialRecordRowData(List<VMPartMaterialRecordRow> partMaterialRecordRowData) {
		PartMaterialRecordRowData = partMaterialRecordRowData;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
}
