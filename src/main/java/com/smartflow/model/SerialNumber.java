package com.smartflow.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="core.PartSerialNumber")
public class SerialNumber {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private Integer Id;
	@Column(name="MasterSerialNumber")
	private String  MasterSerialNumber;
	@Column(name="SerialNumber")
	private String SerialNumber;
	@Column(name="Position")
	private String Position;
	@Column(name="WorkOrderId")
	private Integer WorkOrderId;
	@Column(name="CreationDateTime")
	private Date CreationDateTime;
	@Column(name="State")
	private Integer State;
	public SerialNumber() {};
	public SerialNumber(Integer id, String masterSerialNumber, String serialNumber, String position,
			Integer workOrderId, Date creationDateTime, Integer state, Integer materialId) {
		super();
		Id = id;
		MasterSerialNumber = masterSerialNumber;
		SerialNumber = serialNumber;
		Position = position;
		WorkOrderId = workOrderId;
		CreationDateTime = creationDateTime;
		State = state;
		MaterialId = materialId;
	}
	@JsonProperty("Id")
	public Integer getId() {
		return Id;
	}
	@JsonProperty("MasterSerialNumber")
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
	@Column(name="MaterialId")
	private Integer MaterialId;
	

}
