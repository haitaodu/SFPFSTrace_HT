package com.smartflow.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="core.FailureCause")
public class FailureCause {
	private Integer Id;
	private String FailureCauseCode;
	private String Name;
	private String Description;
	private Set<FailureCause_Station> FailureCause_Station;
	private Set<PartFailureDataRecord> PartFailureDataRecord;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFailureCauseCode() {
		return FailureCauseCode;
	}
	public void setFailureCauseCode(String failureCauseCode) {
		FailureCauseCode = failureCauseCode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@JsonIgnore
	@OneToMany(targetEntity=FailureCause_Station.class,fetch=FetchType.LAZY)
	@JoinColumn(name="FailureCauseId")
	public Set<FailureCause_Station> getFailureCause_Station() {
		return FailureCause_Station;
	}
	public void setFailureCause_Station(Set<FailureCause_Station> failureCause_Station) {
		FailureCause_Station = failureCause_Station;
	}
	@JsonIgnore
	@OneToMany(targetEntity=PartFailureDataRecord.class,fetch=FetchType.LAZY)
	@JoinColumn(name="FailureCauseId")
	public Set<PartFailureDataRecord> getPartFailureDataRecord() {
		return PartFailureDataRecord;
	}
	public void setPartFailureDataRecord(Set<PartFailureDataRecord> partFailureDataRecord) {
		PartFailureDataRecord = partFailureDataRecord;
	}

}
