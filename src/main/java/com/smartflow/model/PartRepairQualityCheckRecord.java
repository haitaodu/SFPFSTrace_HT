package com.smartflow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="trace.PartRepairQualityCheckRecord")
public class PartRepairQualityCheckRecord {
	private Integer Id;
//	private Integer CreatorId;
	private User User;
	private Date CreationDateTime;
	private Integer SequenceNumber;
	private Integer PartRepairRecordId;
	private Integer CheckState;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@ManyToOne
	@JoinColumn(name="CreatorId")
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
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
	public Integer getPartRepairRecordId() {
		return PartRepairRecordId;
	}
	public void setPartRepairRecordId(Integer partRepairRecordId) {
		PartRepairRecordId = partRepairRecordId;
	}
	public Integer getCheckState() {
		return CheckState;
	}
	public void setCheckState(Integer checkState) {
		CheckState = checkState;
	}
	
}
