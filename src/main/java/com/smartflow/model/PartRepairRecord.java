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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="trace.PartRepairRecord")
public class PartRepairRecord {
	private Integer Id;
//	private Integer CreatorId;
	private Date CreationDateTime;
	private Integer SequenceNumber;
//	private Integer PartFailureDataRecordId;
	private Integer RepairState;
//	private Integer RepairActionId;
	private User User;
	private PartFailureDataRecord PartFailureDataRecord;
	private RepairAction RepairAction;
	private Set<PartRepairQualityCheckRecord> PartRepairQualityCheckRecords = new HashSet<>();
	private Station station;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
//	public Integer getCreatorId() {
//		return CreatorId;
//	}
//	public void setCreatorId(Integer creatorId) {
//		CreatorId = creatorId;
//	}
	public Date getCreationDateTime() {
		return CreationDateTime;
	}
	public void setCreationDateTime(Date creationDateTime) {
		CreationDateTime = creationDateTime;
	}
	public Integer getSequenceNumber() {
		return SequenceNumber;
	}
	public void setSequenceNumber(Integer sequenceNumber) {
		SequenceNumber = sequenceNumber;
	}
//	public Integer getPartFailureDataRecordId() {
//		return PartFailureDataRecordId;
//	}
//	public void setPartFailureDataRecordId(Integer partFailureDataRecordId) {
//		PartFailureDataRecordId = partFailureDataRecordId;
//	}
	public Integer getRepairState() {
		return RepairState;
	}
	public void setRepairState(Integer repairState) {
		RepairState = repairState;
	}
//	public Integer getRepairActionId() {
//		return RepairActionId;
//	}
//	public void setRepairActionId(Integer repairActionId) {
//		RepairActionId = repairActionId;
//	}
	@ManyToOne
	@JoinColumn(name="CreatorId")
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
//	@ManyToOne
//	@JoinColumn(name="PartFailureDataRecordId")
	@OneToOne
	@JoinColumn(name="PartFailureDataRecordId")
	public PartFailureDataRecord getPartFailureDataRecord() {
		return PartFailureDataRecord;
	}
	public void setPartFailureDataRecord(PartFailureDataRecord partFailureDataRecord) {
		PartFailureDataRecord = partFailureDataRecord;
	}
	@ManyToOne
	@JoinColumn(name="RepairActionId")
	public RepairAction getRepairAction() {
		return RepairAction;
	}
	public void setRepairAction(RepairAction repairAction) {
		RepairAction = repairAction;
	}
	@JsonIgnore
	@OneToMany(targetEntity=PartRepairQualityCheckRecord.class,fetch=FetchType.EAGER)
	@JoinColumn(name="PartRepairRecordId")
	public Set<PartRepairQualityCheckRecord> getPartRepairQualityCheckRecords() {
		return PartRepairQualityCheckRecords;
	}
	public void setPartRepairQualityCheckRecords(Set<PartRepairQualityCheckRecord> partRepairQualityCheckRecords) {
		PartRepairQualityCheckRecords = partRepairQualityCheckRecords;
	}
	@ManyToOne
	@JoinColumn(name="RepairStationId")
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
	
	
	
	

}
