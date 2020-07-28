package com.smartflow.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name="trace.PartFailureDataRecord")
public class PartFailureDataRecord {
	private Integer Id;
//	private Integer PartSerialNumberId;
	private String SequenceNumber;
//	private Integer FailureTypeId;
//	private Integer FailureCauseId;
	private Integer Layer;
	private String Designator;
	private boolean IsFalseReject;
	private boolean IsCriticalFailure;
	private Date ProductionDateTime;
	private Date BookDateTime;
//	private Integer StationId;
    private FailureCause FailureCause;
    private FailureType FailureType;
    private PartSerialNumber PartSerialNumber;
    private Station Station;
    private PartRepairRecord PartRepairRecord;//PartFailureDataRecord与PartRepairRecord是一对一的关系
	private String ComponentPartNumber;
    @Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
//	public Integer getPartSerialNumberId() {
//		return PartSerialNumberId;
//	}
//	public void setPartSerialNumberId(Integer partSerialNumberId) {
//		PartSerialNumberId = partSerialNumberId;
//	}
	public String getSequenceNumber() {
		return SequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		SequenceNumber = sequenceNumber;
	}
//	public Integer getFailureTypeId() {
//		return FailureTypeId;
//	}
//	public void setFailureTypeId(Integer failureTypeId) {
//		FailureTypeId = failureTypeId;
//	}
//	public Integer getFailureCauseId() {
//		return FailureCauseId;
//	}
//	public void setFailureCauseId(Integer failureCauseId) {
//		FailureCauseId = failureCauseId;
//	}
	public Integer getLayer() {
		return Layer;
	}
	public void setLayer(Integer layer) {
		Layer = layer;
	}
	public String getDesignator() {
		return Designator;
	}
	public void setDesignator(String designator) {
		Designator = designator;
	}
	public boolean isIsFalseReject() {
		return IsFalseReject;
	}
	public void setIsFalseReject(boolean isFalseReject) {
		IsFalseReject = isFalseReject;
	}
	public boolean isIsCriticalFailure() {
		return IsCriticalFailure;
	}
	public void setIsCriticalFailure(boolean isCriticalFailure) {
		IsCriticalFailure = isCriticalFailure;
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
//	public Integer getStationId() {
//		return StationId;
//	}
//	public void setStationId(Integer stationId) {
//		StationId = stationId;
//	}
	@ManyToOne
	@JoinColumn(name="PartSerialNumberId")
	public PartSerialNumber getPartSerialNumber() {
		return PartSerialNumber;
	}
	public void setPartSerialNumber(PartSerialNumber partSerialNumber) {
		PartSerialNumber = partSerialNumber;
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
//	@JsonIgnore
//	@OneToMany(targetEntity=PartRepairRecord.class,fetch=FetchType.LAZY)
//	@JoinColumn(name="PartFailureDataRecordId")
//	public Set<PartRepairRecord> getPartRepairRecords() {
//		return PartRepairRecords;
//	}
//	public void setPartRepairRecords(Set<PartRepairRecord> partRepairRecords) {
//		PartRepairRecords = partRepairRecords;
//	}
	@OneToOne(mappedBy = "partFailureDataRecord",cascade = CascadeType.REMOVE)
	public PartRepairRecord getPartRepairRecord() {
		return PartRepairRecord;
	}
	public void setPartRepairRecord(PartRepairRecord partRepairRecord) {
		PartRepairRecord = partRepairRecord;
	}
	public String getComponentPartNumber() {
		return ComponentPartNumber;
	}
	public void setComponentPartNumber(String componentPartNumber) {
		ComponentPartNumber = componentPartNumber;
	}
}
