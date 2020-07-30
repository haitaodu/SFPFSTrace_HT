package com.smartflow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="wms.ProductDeliveryRequestForm")
public class ProductDeliveryRequestForm {
	private Integer Id;
//	private Integer FormId;
	private WMSForm WMSForm;
	private String PurchaseOrderNumber;
	private Integer CustomerId;
	private Integer DeliveryAreaId;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@ManyToOne
	@JoinColumn(name="FormId")
	public WMSForm getWMSForm() {
		return WMSForm;
	}
	public void setWMSForm(WMSForm wMSForm) {
		WMSForm = wMSForm;
	}
	public String getPurchaseOrderNumber() {
		return PurchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		PurchaseOrderNumber = purchaseOrderNumber;
	}
	public Integer getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}
	public Integer getDeliveryAreaId() {
		return DeliveryAreaId;
	}
	public void setDeliveryAreaId(Integer deliveryAreaId) {
		DeliveryAreaId = deliveryAreaId;
	}
	
}
