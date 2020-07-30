package com.smartflow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="core.FailureType_Station")
public class FailureType_Station {
	private Integer Id;
//    private Integer FailureTypeId;
//    private Integer StationId;
    private Date AssignedDateTime;
    private FailureType FailureType;
    private Station Station;
    @Id
    @GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
//	public Integer getFailureTypeId() {
//		return FailureTypeId;
//	}
//	public void setFailureTypeId(Integer failureTypeId) {
//		FailureTypeId = failureTypeId;
//	}
//	public Integer getStationId() {
//		return StationId;
//	}
//	public void setStationId(Integer stationId) {
//		StationId = stationId;
//	}
	public Date getAssignedDateTime() {
		return AssignedDateTime;
	}
	public void setAssignedDateTime(Date assignedDateTime) {
		AssignedDateTime = assignedDateTime;
	}
	@ManyToOne
	@JoinColumn(name="FailureTypeId")
	public FailureType getFailureType() {
		return FailureType;
	}
	public void setFailureType(FailureType failureType) {
		FailureType = failureType;
	}
	@ManyToOne
	@JoinColumn(name="StationId")
	public Station getStation() {
		return Station;
	}
	public void setStation(Station station) {
		Station = station;
	}


    
}
