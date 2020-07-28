package com.smartflow.model;

import java.util.Date;
import java.util.HashSet;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="trace.PartProcessRecord")
public class PartProcessRecord {
	public Integer Id;
//	public Integer ProcessStepId;
//	public Integer PartSerialNumberId;
	public Integer ProcessState;
//	public Integer StationId;
	public Integer Layer;
	public Date ProductionDateTime;
	public Date BookDateTime;
	public Double CycleTime;
	
    public PartSerialNumber PartSerialNumber;
    public ProcessStep ProcessStep;
    public Station Station;
    public Station RepairStation;
    public Set<FailureSlip> FailureSlips = new HashSet<>();

	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
//	public Integer getProcessStepId() {
//		return ProcessStepId;
//	}
//	public void setProcessStepId(Integer processStepId) {
//		ProcessStepId = processStepId;
//	}
//	public Integer getPartSerialNumberId() {
//		return PartSerialNumberId;
//	}
//	public void setPartSerialNumberId(Integer partSerialNumberId) {
//		PartSerialNumberId = partSerialNumberId;
//	}
	public Integer getProcessState() {
		return ProcessState;
	}
	public void setProcessState(Integer processState) {
		ProcessState = processState;
	}
//	public Integer getStationId() {
//		return StationId;
//	}
//	public void setStationId(Integer stationId) {
//		StationId = stationId;
//	}
	public Integer getLayer() {
		return Layer;
	}
	public void setLayer(Integer layer) {
		Layer = layer;
	}
	public Date getProductionDateTime() {
		return ProductionDateTime;
	}
	public void setProductionDateTime(Date productionDateTime) {
		ProductionDateTime = productionDateTime;
	}
	public Date getBookDateTime() {
		return BookDateTime;
	}
	public void setBookDateTime(Date bookDateTime) {
		BookDateTime = bookDateTime;
	}
	
	public Double getCycleTime() {
		return CycleTime;
	}
	public void setCycleTime(Double cycleTime) {
		CycleTime = cycleTime;
	}
	@ManyToOne
	@JoinColumn(name="PartSerialNumberId")
	public PartSerialNumber getPartSerialNumber() {
		return PartSerialNumber;
	}
	public void setPartSerialNumber(PartSerialNumber partSerialNumber) {
		PartSerialNumber = partSerialNumber;
	}
	@ManyToOne
	@JoinColumn(name="ProcessStepId")
	public ProcessStep getProcessStep() {
		return ProcessStep;
	}
	public void setProcessStep(ProcessStep processStep) {
		ProcessStep = processStep;
	}
	@ManyToOne
	@JoinColumn(name="StationId")
	public Station getStation() {
		return Station;
	}
	public void setStation(Station station) {
		Station = station;
	}
	@JsonIgnore
	@OneToMany(targetEntity=FailureSlip.class,cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinColumn(name="PartProcessRecordId")
	public Set<FailureSlip> getFailureSlips() {
		return FailureSlips;
	}
	public void setFailureSlips(Set<FailureSlip> failureSlips) {
		FailureSlips = failureSlips;
	}
	@ManyToOne
	@JoinColumn(name="RepairStationId")
	public Station getRepairStation() {
		return RepairStation;
	}
	public void setRepairStation(Station repairStation) {
		RepairStation = repairStation;
	}
}
