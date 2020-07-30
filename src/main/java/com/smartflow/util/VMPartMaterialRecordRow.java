package com.smartflow.util;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VMPartMaterialRecordRow {
private String Designator;
private String MaterialPartNumber;
private String SupplierMaterialPartNumber;
private String MaterialDescription;
private String Specification;
private String SupplierCode;
private Double ConsumedQuantity;
private String Level;
public VMPartMaterialRecordRow(String designator, String materialPartNumber, String supplierMaterialPartNumber,
		String materialDescription, String specification, String batchNumber, String containerNumber,
		String stationNumber, String stationName, String workOrder, String partPartNumber, Date materialSetupDateTime,
		String operatorCode, String operatorName,String supplierCode,Double consumedQuantity,String level) {
	super();
	Designator = designator;
	MaterialPartNumber = materialPartNumber;
	SupplierMaterialPartNumber = supplierMaterialPartNumber;
	MaterialDescription = materialDescription;
	Specification = specification;
	BatchNumber = batchNumber;
	ContainerNumber = containerNumber;
	StationNumber = stationNumber;
	StationName = stationName;
	WorkOrder = workOrder;
	PartPartNumber = partPartNumber;
	MaterialSetupDateTime = materialSetupDateTime;
	OperatorCode = operatorCode;
	OperatorName = operatorName;
	SupplierCode=supplierCode;
	ConsumedQuantity=consumedQuantity;
	Level=level;
}
public VMPartMaterialRecordRow() {};
private String BatchNumber;
private String ContainerNumber;
private String StationNumber;
private String StationName;
private String WorkOrder;
private String PartPartNumber;
private Date MaterialSetupDateTime;
private String OperatorCode;
private String OperatorName;
@JsonProperty("Designator")
public String getDesignator() {
	return Designator;
}
@JsonProperty("MaterialPartNumber")
public String getMaterialPartNumber() {
	return MaterialPartNumber;
}
@JsonProperty("SupplierMaterialPartNumber")
public String getSupplierMaterialPartNumber() {
	return SupplierMaterialPartNumber;
}
@JsonProperty("MaterialDescription")
public String getMaterialDescription() {
	return MaterialDescription;
}
@JsonProperty("Specification")
public String getSpecification() {
	return Specification;
}
@JsonProperty("BatchNumber")
public String getBatchNumber() {
	return BatchNumber;
}
@JsonProperty("ContainerNumber")
public String getContainerNumber() {
	return ContainerNumber;
}
@JsonProperty("StationNumber")
public String getStationNumber() {
	return StationNumber;
}
@JsonProperty("StationName")
public String getStationName() {
	return StationName;
}
@JsonProperty("WorkOrder")
public String getWorkOrder() {
	return WorkOrder;
}
@JsonProperty("PartPartNumber")
public String getPartPartNumber() {
	return PartPartNumber;
}
@JsonProperty("MaterialSetupDateTime")
public Date getMaterialSetupDateTime() {
	return MaterialSetupDateTime;
}
@JsonProperty("OperatorCode")
public String getOperatorCode() {
	return OperatorCode;
}
@JsonProperty("OperatorName")
public String getOperatorName() {
	return OperatorName;
}
public void setDesignator(String designator) {
	Designator = designator;
}
public void setMaterialPartNumber(String materialPartNumber) {
	MaterialPartNumber = materialPartNumber;
}
public void setSupplierMaterialPartNumber(String supplierMaterialPartNumber) {
	SupplierMaterialPartNumber = supplierMaterialPartNumber;
}
public void setMaterialDescription(String materialDescription) {
	MaterialDescription = materialDescription;
}
public void setSpecification(String specification) {
	Specification = specification;
}
public void setBatchNumber(String batchNumber) {
	BatchNumber = batchNumber;
}
public void setContainerNumber(String containerNumber) {
	ContainerNumber = containerNumber;
}
public void setStationNumber(String stationNumber) {
	StationNumber = stationNumber;
}
public void setStationName(String stationName) {
	StationName = stationName;
}
public void setWorkOrder(String workOrder) {
	WorkOrder = workOrder;
}
public void setPartPartNumber(String partPartNumber) {
	PartPartNumber = partPartNumber;
}
public void setMaterialSetupDateTime(Date materialSetupDateTime) {
	MaterialSetupDateTime = materialSetupDateTime;
}
public void setOperatorCode(String operatorCode) {
	OperatorCode = operatorCode;
}
public void setOperatorName(String operatorName) {
	OperatorName = operatorName;
}
@JsonProperty("SupplierCode")
public String getSupplierCode() {
	return SupplierCode;
}
public void setSupplierCode(String supplierCode) {
	SupplierCode = supplierCode;
}
@JsonProperty("ConsumedQuantity")
public Double getConsumedQuantity() {
	return ConsumedQuantity;
}
public void setConsumedQuantity(Double consumedQuantity) {
	ConsumedQuantity = consumedQuantity;
}
@JsonProperty("Level")
public String getLevel() {
	return Level;
}
public void setLevel(String level) {
	Level = level;
}
}
