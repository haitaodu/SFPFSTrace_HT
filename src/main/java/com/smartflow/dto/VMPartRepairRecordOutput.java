package com.smartflow.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VMPartRepairRecordOutput {

	//	private String WorkOrderNumber;
	//	private Integer WorkOrderPlannedQuantity;
	//	private String PartPartNumber;
	//	private String PartState;
	//	private String PartDescription;
	//	private String PartDrawingNumber;
	//	private String CustomerPartNumber;
	//	private List<VMPartRepairRecordRow> PartRepairRecordData;
	//	public String getWorkOrderNumber() {
	//		return WorkOrderNumber;
	//	}
	//	public void setWorkOrderNumber(String workOrderNumber) {
	//		WorkOrderNumber = workOrderNumber;
	//	}
	//	public Integer getWorkOrderPlannedQuantity() {
	//		return WorkOrderPlannedQuantity;
	//	}
	//	public void setWorkOrderPlannedQuantity(Integer workOrderPlannedQuantity) {
	//		WorkOrderPlannedQuantity = workOrderPlannedQuantity;
	//	}
	//	public String getPartPartNumber() {
	//		return PartPartNumber;
	//	}
	//	public void setPartPartNumber(String partPartNumber) {
	//		PartPartNumber = partPartNumber;
	//	}
	//	public String getPartState() {
	//		return PartState;
	//	}
	//	public void setPartState(String partState) {
	//		PartState = partState;
	//	}
	//	public String getPartDescription() {
	//		return PartDescription;
	//	}
	//	public void setPartDescription(String partDescription) {
	//		PartDescription = partDescription;
	//	}
	//	public String getPartDrawingNumber() {
	//		return PartDrawingNumber;
	//	}
	//	public void setPartDrawingNumber(String partDrawingNumber) {
	//		PartDrawingNumber = partDrawingNumber;
	//	}
	//	public String getCustomerPartNumber() {
	//		return CustomerPartNumber;
	//	}
	//	public void setCustomerPartNumber(String customerPartNumber) {
	//		CustomerPartNumber = customerPartNumber;
	//	}
	//	public List<VMPartRepairRecordRow> getPartRepairRecordData() {
	//		return PartRepairRecordData;
	//	}
	//	public void setPartRepairRecordData(List<VMPartRepairRecordRow> partRepairRecordData) {
	//		PartRepairRecordData = partRepairRecordData;
	//	}

	private Integer RepairRecordId;
	private String PartSerialNumber;
	private String Position;
	private String StationNumber;
	private String StationName;
	private String RepairStationNumber;
	private String WorkOrder;
	private String PartPartNumber;
	private Date RepairDateTime;
	private Date QuanlityConfirmDateTime;
	private String PartState;
	private String OperatorNumber;
	private String OperatorName;
	private String QualityPersonNumber;
	private String QualityPersonName;
	private String CheckState;
	@JsonProperty("RepairRecordId")
	public Integer getRepairRecordId() {
		return RepairRecordId;
	}
	public void setRepairRecordId(Integer repairRecordId) {
		RepairRecordId = repairRecordId;
	}
	@JsonProperty("PartSerialNumber")
	public String getPartSerialNumber() {
		return PartSerialNumber;
	}
	public void setPartSerialNumber(String partSerialNumber) {
		PartSerialNumber = partSerialNumber;
	}
	@JsonProperty("Position")
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	@JsonProperty("StationNumber")
	public String getStationNumber() {
		return StationNumber;
	}
	public void setStationNumber(String stationNumber) {
		StationNumber = stationNumber;
	}
	@JsonProperty("StationName")
	public String getStationName() {
		return StationName;
	}
	public void setStationName(String stationName) {
		StationName = stationName;
	}
	@JsonProperty("RepairStationNumber")
	public String getRepairStationNumber() {
		return RepairStationNumber;
	}
	public void setRepairStationNumber(String repairStationNumber) {
		RepairStationNumber = repairStationNumber;
	}
	@JsonProperty("WorkOrder")
	public String getWorkOrder() {
		return WorkOrder;
	}
	public void setWorkOrder(String workOrder) {
		WorkOrder = workOrder;
	}
	@JsonProperty("PartPartNumber")
	public String getPartPartNumber() {
		return PartPartNumber;
	}
	public void setPartPartNumber(String partPartNumber) {
		PartPartNumber = partPartNumber;
	}
	@JsonProperty("RepairDateTime")
	public Date getRepairDateTime() {
		return RepairDateTime;
	}
	public void setRepairDateTime(Date repairDateTime) {
		RepairDateTime = repairDateTime;
	}
	@JsonProperty("QuanlityConfirmDateTime")
	public Date getQuanlityConfirmDateTime() {
		return QuanlityConfirmDateTime;
	}
	public void setQuanlityConfirmDateTime(Date quanlityConfirmDateTime) {
		QuanlityConfirmDateTime = quanlityConfirmDateTime;
	}
	@JsonProperty("PartState")
	public String getPartState() {
		return PartState;
	}
	public void setPartState(String partState) {
		PartState = partState;
	}
	@JsonProperty("OperatorNumber")
	public String getOperatorNumber() {
		return OperatorNumber;
	}
	public void setOperatorNumber(String operatorNumber) {
		OperatorNumber = operatorNumber;
	}
	@JsonProperty("OperatorName")
	public String getOperatorName() {
		return OperatorName;
	}
	public void setOperatorName(String operatorName) {
		OperatorName = operatorName;
	}
	@JsonProperty("QualityPersonNumber")
	public String getQualityPersonNumber() {
		return QualityPersonNumber;
	}
	public void setQualityPersonNumber(String qualityPersonNumber) {
		QualityPersonNumber = qualityPersonNumber;
	}
	@JsonProperty("QualityPersonName")
	public String getQualityPersonName() {
		return QualityPersonName;
	}
	public void setQualityPersonName(String qualityPersonName) {
		QualityPersonName = qualityPersonName;
	}
	@JsonProperty("CheckState")
	public String getCheckState() {
		return CheckState;
	}
	public void setCheckState(String checkState) {
		CheckState = checkState;
	}
}
