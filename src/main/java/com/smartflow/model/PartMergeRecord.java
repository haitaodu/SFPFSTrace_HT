package com.smartflow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="trace.PartMergeRecord")
public class PartMergeRecord {
	public Integer Id;
	public Integer MasterPartSerialNumberId;
	public Integer SlavePartSerialNumberId;
	public Integer MergeStationId;
	public Date MergeDateTime;
	public Integer OperatorId;
	public Integer Layer;

//	public PartSerialNumber MasterPartSerialNumber;
//	public PartSerialNumber SlavePartSerialNumber;
//	public Station Station;
//	public User User;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getMasterPartSerialNumberId() {
		return MasterPartSerialNumberId;
	}
	public void setMasterPartSerialNumberId(Integer masterPartSerialNumberId) {
		MasterPartSerialNumberId = masterPartSerialNumberId;
	}
	public Integer getSlavePartSerialNumberId() {
		return SlavePartSerialNumberId;
	}
	public void setSlavePartSerialNumberId(Integer slavePartSerialNumberId) {
		SlavePartSerialNumberId = slavePartSerialNumberId;
	}
	public Integer getMergeStationId() {
		return MergeStationId;
	}
	public void setMergeStationId(Integer mergeStationId) {
		MergeStationId = mergeStationId;
	}
	public Date getMergeDateTime() {
		return MergeDateTime;
	}
	public void setMergeDateTime(Date mergeDateTime) {
		MergeDateTime = mergeDateTime;
	}
	public Integer getOperatorId() {
		return OperatorId;
	}
	public void setOperatorId(Integer operatorId) {
		OperatorId = operatorId;
	}
	public Integer getLayer() {
		return Layer;
	}
	public void setLayer(Integer layer) {
		Layer = layer;
	}
//	@ManyToOne
//	@JoinColumn(name="MasterPartSerialNumberId")
//	public PartSerialNumber getMasterPartSerialNumber() {
//		return MasterPartSerialNumber;
//	}
//	public void setMasterPartSerialNumber(PartSerialNumber masterPartSerialNumber) {
//		MasterPartSerialNumber = masterPartSerialNumber;
//	}
//	@ManyToOne
//	@JoinColumn(name="SlavePartSerialNumberId")
//	public PartSerialNumber getSlavePartSerialNumber() {
//		return SlavePartSerialNumber;
//	}
//	public void setSlavePartSerialNumber(PartSerialNumber slavePartSerialNumber) {
//		SlavePartSerialNumber = slavePartSerialNumber;
//	}
	
}
