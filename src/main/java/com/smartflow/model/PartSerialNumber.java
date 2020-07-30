package com.smartflow.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="core.PartSerialNumber")
public class PartSerialNumber {
	private Integer Id;
	private String MasterSerialNumber;
	private String SerialNumber;
	private String Position;
	private Date CreationDateTime;
	private Integer State;
	private Material Material;	
	
	private WorkOrder WorkOrder;
	private Set<PackingInformation> PackingInformations = new HashSet<>();  
	private Set<PartFailureDataRecord> PartFailureDataRecords = new HashSet<>();	  
	private Set<PartMaterialRecord> PartMaterialRecords = new HashSet<>();	  
//	private Set<PartMergeRecord> PartMergeRecords = new HashSet<>();	    
	private Set<PartProcessRecord> PartProcessRecords = new HashSet<>();
	@Id
	@GeneratedValue
	@JsonProperty("Id")
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@JsonProperty("MasterSerialNumber")
	public String getMasterSerialNumber() {
		return MasterSerialNumber;
	}
	public void setMasterSerialNumber(String masterSerialNumber) {
		MasterSerialNumber = masterSerialNumber;
	}
	@JsonProperty("SerialNumber")
	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	@JsonProperty("Position")
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	@JsonProperty("CreationDataTime")
	public Date getCreationDateTime() {
		return CreationDateTime;
	}
	public void setCreationDateTime(Date creationDateTime) {
		CreationDateTime = creationDateTime;
	}
	@JsonProperty("State")
	public Integer getState() {
		return State;
	}
	public void setState(Integer state) {
		State = state;
	}
	@JsonProperty("Material")
	@ManyToOne
	@JoinColumn(name="MaterialId")
	public Material getMaterial() {
		return Material;
	}
	public void setMaterial(Material material) {
		Material = material;
	}
	@JsonProperty("WorkOrder")
	@ManyToOne
	@JoinColumn(name="WorkOrderId")
	public WorkOrder getWorkOrder() {
		return WorkOrder;
	}
	public void setWorkOrder(WorkOrder workOrder) {
		WorkOrder = workOrder;
	}
//	mappedBy="partSerialNumber"
	@JsonIgnore
	@OneToMany(targetEntity=PackingInformation.class,fetch=FetchType.EAGER)
	@JoinColumn(name="PartSerialNumberId")
	public Set<PackingInformation> getPackingInformations() {
		return PackingInformations;
	}
	public void setPackingInformations(Set<PackingInformation> packingInformations) {
		PackingInformations = packingInformations;
	}
	@JsonIgnore
	@OneToMany(targetEntity=PartFailureDataRecord.class,fetch=FetchType.LAZY)
	@JoinColumn(name="PartSerialNumberId")
	public Set<PartFailureDataRecord> getPartFailureDataRecords() {
		return PartFailureDataRecords;
	}
	public void setPartFailureDataRecords(Set<PartFailureDataRecord> partFailureDataRecords) {
		PartFailureDataRecords = partFailureDataRecords;
	}
	@JsonIgnore
	@OneToMany(targetEntity=PartMaterialRecord.class,fetch=FetchType.LAZY)
	@JoinColumn(name="PartSerialNumberId")
	public Set<PartMaterialRecord> getPartMaterialRecords() {
		return PartMaterialRecords;
	}
	public void setPartMaterialRecords(Set<PartMaterialRecord> partMaterialRecords) {
		PartMaterialRecords = partMaterialRecords;
	}
//	@JsonIgnore
//	@OneToMany(targetEntity=PartMergeRecord.class,fetch=FetchType.LAZY)
//	@JoinColumn(name="MasterPartSerialNumberId")
//	public Set<PartMergeRecord> getPartMergeRecords() {
//		return PartMergeRecords;
//	}
//	public void setPartMergeRecords(Set<PartMergeRecord> partMergeRecords) {
//		PartMergeRecords = partMergeRecords;
//	}
	@JsonIgnore
	@OneToMany(targetEntity=PartProcessRecord.class,fetch=FetchType.EAGER)
	@JoinColumn(name="PartSerialNumberId")
	public Set<PartProcessRecord> getPartProcessRecords() {
		return PartProcessRecords;
	}
	public void setPartProcessRecords(Set<PartProcessRecord> partProcessRecords) {
		PartProcessRecords = partProcessRecords;
	}

}
