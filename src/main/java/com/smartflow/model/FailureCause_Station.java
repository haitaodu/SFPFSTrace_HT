package com.smartflow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="core.FailureCause_Station")
public class FailureCause_Station {
	private Integer Id;
//	private Integer FailureCauseId;
//	private Integer StationId;
	private Date AssignedDateTime;
	private FailureCause FailureCause;
	private Station Station;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
//	public Integer getFailureCauseId() {
//		return FailureCauseId;
//	}
//	public void setFailureCauseId(Integer failureCauseId) {
//		FailureCauseId = failureCauseId;
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
	@JoinColumn(name="FailureCauseId")
	public FailureCause getFailureCause() {
		return FailureCause;
	}
	public void setFailureCause(FailureCause failureCause) {
		FailureCause = failureCause;
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
