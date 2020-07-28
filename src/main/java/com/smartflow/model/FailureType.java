package com.smartflow.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
@Table(name="core.FailureType")
public class FailureType {
	private Integer Id;
	private String FailureCode;
	private String Name;
	private String Description;
	private Set<FailureType_Station> FailureType_Stations = new HashSet<>();
	private Set<PartFailureDataRecord> PartFailureDataRecords = new HashSet<>();
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFailureCode() {
		return FailureCode;
	}
	public void setFailureCode(String failureCode) {
		FailureCode = failureCode;
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
	@OneToMany(targetEntity=FailureType_Station.class,fetch=FetchType.LAZY)
	@JoinColumn(name="FailureTypeId")
	public Set<FailureType_Station> getFailureType_Stations() {
		return FailureType_Stations;
	}
	public void setFailureType_Stations(Set<FailureType_Station> failureType_Stations) {
		FailureType_Stations = failureType_Stations;
	}
	@JsonIgnore
	@OneToMany(targetEntity=PartFailureDataRecord.class,fetch=FetchType.LAZY)
	@JoinColumn(name="FailureTypeId")
	public Set<PartFailureDataRecord> getPartFailureDataRecords() {
		return PartFailureDataRecords;
	}
	public void setPartFailureDataRecords(Set<PartFailureDataRecord> partFailureDataRecords) {
		PartFailureDataRecords = partFailureDataRecords;
	}

}
