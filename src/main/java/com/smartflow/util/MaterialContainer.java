package com.smartflow.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaterialContainer {
	private String ContainerNumber;
    private String ContainerState;
    @JsonProperty("ContainerNumber")
    public String getContainerNumber() {
		return ContainerNumber;
	}
	public void setContainerNumber(String containerNumber) {
		ContainerNumber = containerNumber;
	}
	 @JsonProperty("ContainerState")
	public String getContainerState() {
		return ContainerState;
	}
	public void setContainerState(String containerState) {
		ContainerState = containerState;
	}
	 @JsonProperty("MaterialPartNumber")
	public String getMaterialPartNumber() {
		return MaterialPartNumber;
	}
	public void setMaterialPartNumber(String materialPartNumber) {
		MaterialPartNumber = materialPartNumber;
	}
	 @JsonProperty("SupplierMaterialPartNumber")
	public String getSupplierMaterialPartNumber() {
		return SupplierMaterialPartNumber;
	}
	public void setSupplierMaterialPartNumber(String supplierMaterialPartNumber) {
		SupplierMaterialPartNumber = supplierMaterialPartNumber;
	}
	 @JsonProperty("SupplierName")
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	 @JsonProperty("BatchNumber")
	public String getBatchNumber() {
		return BatchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		BatchNumber = batchNumber;
	}
	public MaterialContainer(String containerNumber, String containerState, String materialPartNumber,
			String supplierMaterialPartNumber, String supplierName, String batchNumber) {
		super();
		ContainerNumber = containerNumber;
		ContainerState = containerState;
		MaterialPartNumber = materialPartNumber;
		SupplierMaterialPartNumber = supplierMaterialPartNumber;
		SupplierName = supplierName;
		BatchNumber = batchNumber;
	}
	public MaterialContainer() {};
	private String MaterialPartNumber;
    private String SupplierMaterialPartNumber;
    private String SupplierName;
    private String BatchNumber;
    
}
