package com.smartflow.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VMPartProcessRecordRow {
	private String PartSerialNumber; // 部件序列号   
	private String Position;// 部件位号   
	private String StationNumber; // 工站号  
	private String StationName;  // 工站名     
	private String RepairStationNumber;  // 维修站号      
	private String WorkOrder; // 工单号        
	private String PartPartNumber; // 部件料号       
	private Date PartProcessCompleteDateTime;// 部件加工时间   
	private Date UploadingDateTime;// 部件上传时间     
	private BigDecimal CycleTime; // 节拍时间   
	private String PartState;// 部件状态 
	private String OperatorNumber;    // 员工号     
	private String OperatorName;    // 员工名      
	private String ContainerNumber;   // 容器号
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
	@JsonProperty("PartProcessCompleteDateTime")
	public Date getPartProcessCompleteDateTime() {
		return PartProcessCompleteDateTime;
	}
	public void setPartProcessCompleteDateTime(Date partProcessCompleteDateTime) {
		PartProcessCompleteDateTime = partProcessCompleteDateTime;
	}
	@JsonProperty("UploadingDateTime")
	public Date getUploadingDateTime() {
		return UploadingDateTime;
	}
	public void setUploadingDateTime(Date uploadingDateTime) {
		UploadingDateTime = uploadingDateTime;
	}
	@JsonProperty("CycleTime")
	public BigDecimal getCycleTime() {
		return CycleTime;
	}
	public void setCycleTime(BigDecimal cycleTime) {
		CycleTime = cycleTime;
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
	@JsonProperty("ContainerNumber")
	public String getContainerNumber() {
		return ContainerNumber;
	}
	public void setContainerNumber(String containerNumber) {
		ContainerNumber = containerNumber;
	}


}
