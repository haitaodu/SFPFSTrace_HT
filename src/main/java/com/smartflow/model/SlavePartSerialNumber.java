package com.smartflow.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SlavePartSerialNumber {
	private Integer Id;	
	private String  MasterSerialNumber;
	private String SerialNumber;
	private String Position;
	private Integer WorkOrderId;
	private Date CreationDateTime;
	private Integer State;
	private Integer MaterialId;
	private List<SlavePartSerialNumber> SlavePartSerialNumberList;
	@JsonProperty("Id")
	public Integer getId() {
		return Id;
	}
	@JsonProperty("MasterSerialNumbe")
	public String getMasterSerialNumber() {
		return MasterSerialNumber;
	}
	@JsonProperty("SerialNumber")
	public String getSerialNumber() {
		return SerialNumber;
	}
	@JsonProperty("Position")
	public String getPosition() {
		return Position;
	}
	@JsonProperty("WorkOrderId")
	public Integer getWorkOrderId() {
		return WorkOrderId;
	}
	@JsonProperty("CreationDateTime")
	public Date getCreationDateTime() {
		return CreationDateTime;
	}
	@JsonProperty("State")
	public Integer getState() {
		return State;
	}
	@JsonProperty("MaterialId")
	public Integer getMaterialId() {
		return MaterialId;
	}
	@JsonProperty("SlavePartSerialNumberList")
	public List<SlavePartSerialNumber> getSlavePartSerialNumberList() {
		return SlavePartSerialNumberList;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public void setMasterSerialNumber(String masterSerialNumber) {
		MasterSerialNumber = masterSerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public void setWorkOrderId(Integer workOrderId) {
		WorkOrderId = workOrderId;
	}
	public void setCreationDateTime(Date creationDateTime) {
		CreationDateTime = creationDateTime;
	}
	public void setState(Integer state) {
		State = state;
	}
	public void setMaterialId(Integer materialId) {
		MaterialId = materialId;
	}
	public void setSlavePartSerialNumberList(List<SlavePartSerialNumber> slavePartSerialNumberList) {
		SlavePartSerialNumberList = slavePartSerialNumberList;
	}
	public SlavePartSerialNumber(Integer id, String masterSerialNumber, String serialNumber, String position,
			Integer workOrderId, Date creationDateTime, Integer state, Integer materialId,
			List<SlavePartSerialNumber> slavePartSerialNumberList) {
		super();
		Id = id;
		MasterSerialNumber = masterSerialNumber;
		SerialNumber = serialNumber;
		Position = position;
		WorkOrderId = workOrderId;
		CreationDateTime = creationDateTime;
		State = state;
		MaterialId = materialId;
		SlavePartSerialNumberList = slavePartSerialNumberList;
	}
	public SlavePartSerialNumber() {};
}
