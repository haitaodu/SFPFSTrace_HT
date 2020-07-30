package com.smartflow.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.smartflow.util.MaterialRecordOutput;

public class VMFinishGoodBoxPartInformationRow {
	private String PartSerialNumber;
	private String PartState;
	private String FinishGoodSerialNumber;
	private String PartPartNumber;
	private String CustomerMaterialPartNumber;
	private String Description;
	private String FinishGoodBoxNumber;
	private String DeliveryNoteFormNumber;
	private Date PackingDateTime;
	private Date DeliveryDateTime;
	private String OperatorCode;
	private String OperatorName;
	private String DeliveryOperatorCode;
	private String DeliveryOperatorName;
	private MaterialRecordOutput MaterialRecords;
	@JsonProperty("PartSerialNumber")
	public String getPartSerialNumber() {
		return PartSerialNumber;
	}
	public void setPartSerialNumber(String partSerialNumber) {
		PartSerialNumber = partSerialNumber;
	}
	@JsonProperty("PartState")
	public String getPartState() {
		return PartState;
	}
	public void setPartState(String partState) {
		PartState = partState;
	}
	@JsonProperty("FinishGoodSerialNumber")
	public String getFinishGoodSerialNumber() {
		return FinishGoodSerialNumber;
	}
	public void setFinishGoodSerialNumber(String finishGoodSerialNumber) {
		FinishGoodSerialNumber = finishGoodSerialNumber;
	}
	@JsonProperty("PartPartNumber")
	public String getPartPartNumber() {
		return PartPartNumber;
	}
	public void setPartPartNumber(String partPartNumber) {
		PartPartNumber = partPartNumber;
	}
	@JsonProperty("CustomerMaterialPartNumber")
	public String getCustomerMaterialPartNumber() {
		return CustomerMaterialPartNumber;
	}
	public void setCustomerMaterialPartNumber(String customerMaterialPartNumber) {
		CustomerMaterialPartNumber = customerMaterialPartNumber;
	}
	@JsonProperty("Description")
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@JsonProperty("FinishGoodBoxNumber")
	public String getFinishGoodBoxNumber() {
		return FinishGoodBoxNumber;
	}
	public void setFinishGoodBoxNumber(String finishGoodBoxNumber) {
		FinishGoodBoxNumber = finishGoodBoxNumber;
	}
	@JsonProperty("DeliveryNoteFormNumber")
	public String getDeliveryNoteFormNumber() {
		return DeliveryNoteFormNumber;
	}
	public void setDeliveryNoteFormNumber(String deliveryNoteFormNumber) {
		DeliveryNoteFormNumber = deliveryNoteFormNumber;
	}
	@JsonProperty("PackingDateTime")
	public Date getPackingDateTime() {
		return PackingDateTime;
	}
	public void setPackingDateTime(Date packingDateTime) {
		PackingDateTime = packingDateTime;
	}
	@JsonProperty("DeliveryDateTime")
	public Date getDeliveryDateTime() {
		return DeliveryDateTime;
	}
	public void setDeliveryDateTime(Date deliveryDateTime) {
		DeliveryDateTime = deliveryDateTime;
	}
	@JsonProperty("OperatorCode")
	public String getOperatorCode() {
		return OperatorCode;
	}
	public void setOperatorCode(String operatorCode) {
		OperatorCode = operatorCode;
	}
	@JsonProperty("OperatorName")
	public String getOperatorName() {
		return OperatorName;
	}
	public void setOperatorName(String operatorName) {
		OperatorName = operatorName;
	}
	@JsonProperty("DeliveryOperatorCode")
	public String getDeliveryOperatorCode() {
		return DeliveryOperatorCode;
	}
	public void setDeliveryOperatorCode(String deliveryOperatorCode) {
		DeliveryOperatorCode = deliveryOperatorCode;
	}
	@JsonProperty("DeliveryOperatorName")
	public String getDeliveryOperatorName() {
		return DeliveryOperatorName;
	}
	public void setDeliveryOperatorName(String deliveryOperatorName) {
		DeliveryOperatorName = deliveryOperatorName;
	}
	@JsonProperty("MaterialRecords")
	public MaterialRecordOutput getMaterialRecords() {
		return MaterialRecords;
	}
	public void setMaterialRecords(MaterialRecordOutput materialRecords) {
		MaterialRecords = materialRecords;
	}
	
	

}
