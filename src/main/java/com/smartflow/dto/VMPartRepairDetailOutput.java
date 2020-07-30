package com.smartflow.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VMPartRepairDetailOutput {

	private Integer RepairRecordId;
	private String MaterialPartNumber;
	private String Designator;
	private String FailureTypeName;
	private String FailureCauseName;
	private String RepairActionName;
	private String NewContainerId;
	private boolean IsRepaired;
	private Date RepairDateTime;
	private Date QualityConfirmDateTime;
	private String RepairState;
	private String MachineOperatorCode;
	private String MachineOperatorName;
	@JsonProperty("RepairRecordId")
	public Integer getRepairRecordId() {
		return RepairRecordId;
	}
	public void setRepairRecordId(Integer repairRecordId) {
		RepairRecordId = repairRecordId;
	}
	@JsonProperty("MaterialPartNumber")
	public String getMaterialPartNumber() {
		return MaterialPartNumber;
	}
	public void setMaterialPartNumber(String materialPartNumber) {
		MaterialPartNumber = materialPartNumber;
	}
	@JsonProperty("Designator")
	public String getDesignator() {
		return Designator;
	}
	public void setDesignator(String designator) {
		Designator = designator;
	}
	@JsonProperty("FailureTypeName")
	public String getFailureTypeName() {
		return FailureTypeName;
	}
	public void setFailureTypeName(String failureTypeName) {
		FailureTypeName = failureTypeName;
	}
	@JsonProperty("FailureCauseName")
	public String getFailureCauseName() {
		return FailureCauseName;
	}
	public void setFailureCauseName(String failureCauseName) {
		FailureCauseName = failureCauseName;
	}
	@JsonProperty("RepairActionName")
	public String getRepairActionName() {
		return RepairActionName;
	}
	public void setRepairActionName(String repairActionName) {
		RepairActionName = repairActionName;
	}
	@JsonProperty("NewContainerId")
	public String getNewContainerId() {
		return NewContainerId;
	}
	public void setNewContainerId(String newContainerId) {
		NewContainerId = newContainerId;
	}
	@JsonProperty("IsRepaired")
	public boolean isIsRepaired() {
		return IsRepaired;
	}
	public void setIsRepaired(boolean isRepaired) {
		IsRepaired = isRepaired;
	}
	@JsonProperty("RepairDateTime")
	public Date getRepairDateTime() {
		return RepairDateTime;
	}
	public void setRepairDateTime(Date repairDateTime) {
		RepairDateTime = repairDateTime;
	}
	@JsonProperty("QualityConfirmDateTime")
	public Date getQualityConfirmDateTime() {
		return QualityConfirmDateTime;
	}
	public void setQualityConfirmDateTime(Date qualityConfirmDateTime) {
		QualityConfirmDateTime = qualityConfirmDateTime;
	}
	@JsonProperty("RepairState")
	public String getRepairState() {
		return RepairState;
	}
	public void setRepairState(String repairState) {
		RepairState = repairState;
	}
	@JsonProperty("MachineOperatorCode")
	public String getMachineOperatorCode() {
		return MachineOperatorCode;
	}
	public void setMachineOperatorCode(String machineOperatorCode) {
		MachineOperatorCode = machineOperatorCode;
	}
	@JsonProperty("MachineOperatorName")
	public String getMachineOperatorName() {
		return MachineOperatorName;
	}
	public void setMachineOperatorName(String machineOperatorName) {
		MachineOperatorName = machineOperatorName;
	}


}
