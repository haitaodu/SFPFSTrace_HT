package com.smartflow.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="wms.ProductDeliveryRequestFormItem")
public class ProductDeliveryRequestFormItem {
	private Integer Id;
//	private Integer ProductDeliveryRequestFormId;
	private ProductDeliveryRequestForm ProductDeliveryRequestForm;
	private Integer ItemNumber;
	private Integer MaterialId;
	private BigDecimal RequestQuantity;
	private BigDecimal ScannedQuantity;
	private Date RequiredOnBoardDateTime;
	private Date RequiredShippingDateTime;
	private Integer State;
	private BigDecimal PreparedQuantity;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@ManyToOne
	@JoinColumn(name="ProductDeliveryRequestFormId")
	public ProductDeliveryRequestForm getProductDeliveryRequestForm() {
		return ProductDeliveryRequestForm;
	}
	public void setProductDeliveryRequestForm(ProductDeliveryRequestForm productDeliveryRequestForm) {
		ProductDeliveryRequestForm = productDeliveryRequestForm;
	}
	public Integer getItemNumber() {
		return ItemNumber;
	}
	public void setItemNumber(Integer itemNumber) {
		ItemNumber = itemNumber;
	}
	public Integer getMaterialId() {
		return MaterialId;
	}
	public void setMaterialId(Integer materialId) {
		MaterialId = materialId;
	}
	public BigDecimal getRequestQuantity() {
		return RequestQuantity;
	}
	public void setRequestQuantity(BigDecimal requestQuantity) {
		RequestQuantity = requestQuantity;
	}
	public BigDecimal getScannedQuantity() {
		return ScannedQuantity;
	}
	public void setScannedQuantity(BigDecimal scannedQuantity) {
		ScannedQuantity = scannedQuantity;
	}
	public Date getRequiredOnBoardDateTime() {
		return RequiredOnBoardDateTime;
	}
	public void setRequiredOnBoardDateTime(Date requiredOnBoardDateTime) {
		RequiredOnBoardDateTime = requiredOnBoardDateTime;
	}
	public Date getRequiredShippingDateTime() {
		return RequiredShippingDateTime;
	}
	public void setRequiredShippingDateTime(Date requiredShippingDateTime) {
		RequiredShippingDateTime = requiredShippingDateTime;
	}
	public Integer getState() {
		return State;
	}
	public void setState(Integer state) {
		State = state;
	}
	public BigDecimal getPreparedQuantity() {
		return PreparedQuantity;
	}
	public void setPreparedQuantity(BigDecimal preparedQuantity) {
		PreparedQuantity = preparedQuantity;
	}
	
}
