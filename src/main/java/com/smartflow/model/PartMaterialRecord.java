package com.smartflow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.smartflow.model.PartSerialNumber;

@Entity
@Table(name="trace.PartMaterialRecord")
public class PartMaterialRecord {
	private int Id;
	private PartSerialNumber PartSerialNumber;
	private Container Container;

	private Station MaterialSetupStation;
	private Date MaterialSetupDateTime;
	private Date MaterialInstallDateTime;
	private User MaterialSetupOperator;
	private String Designator;
	private int Layer;
	private String FeederLocation;
	private Double ConsumedQuantity;
	@ManyToOne
	@JoinColumn(name="MaterialSetupStationId")
	public Station getMaterialSetupStation() {
		return MaterialSetupStation;
	}
	public void setMaterialSetupStation(Station materialSetupStation) {
		MaterialSetupStation = materialSetupStation;
	}
	public Double getConsumedQuantity() {
		return ConsumedQuantity;
	}
	public void setConsumedQuantity(Double consumedQuantity) {
		ConsumedQuantity = consumedQuantity;
	}
	private int ProcessStepId;
	@Id
	@GeneratedValue
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	@JoinColumn(name="MaterialContainerId")
	public Container getContainer() {
		return Container;
	}
	public void setContainer(Container container) {
		Container = container;
	}

	public Date getMaterialSetupDateTime() {
		return MaterialSetupDateTime;
	}
	public void setMaterialSetupDateTime(Date materialSetupDateTime) {
		MaterialSetupDateTime = materialSetupDateTime;
	}
	public Date getMaterialInstallDateTime() {
		return MaterialInstallDateTime;
	}
	public void setMaterialInstallDateTime(Date materialInstallDateTime) {
		MaterialInstallDateTime = materialInstallDateTime;
	}
	
	public String getDesignator() {
		return Designator;
	}
	public void setDesignator(String designator) {
		Designator = designator;
	}
	public int getLayer() {
		return Layer;
	}
	public void setLayer(int layer) {
		Layer = layer;
	}
	public String getFeederLocation() {
		return FeederLocation;
	}
	public void setFeederLocation(String feederLocation) {
		FeederLocation = feederLocation;
	}

	public int getProcessStepId() {
		return ProcessStepId;
	}
	public void setProcessStepId(int processStepId) {
		ProcessStepId = processStepId;
	}
	@ManyToOne
	@JoinColumn(name=" MaterialSetupOperatorId")
	public User getMaterialSetupOperator() {
		return MaterialSetupOperator;
	}
	public void setMaterialSetupOperator(User materialSetupOperator) {
		MaterialSetupOperator = materialSetupOperator;
	}

}
