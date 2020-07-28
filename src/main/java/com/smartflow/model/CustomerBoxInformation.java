package com.smartflow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="core.CustomerBoxInformation")
public class CustomerBoxInformation {
	private Integer Id;
//    private Integer ContainerId;
    private String CustomerBoxNumber;
    private Date LinkDateTimed;
//    private Integer CreatorId;
//    private Integer ProductDeliveryRequestFormItemId;
    private ProductDeliveryRequestFormItem ProductDeliveryRequestFormItem;
    private Integer MaterialOtherMovementFormItemId;
    private Container Container;
    private User User;
    @Id
    @GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCustomerBoxNumber() {
		return CustomerBoxNumber;
	}
	public void setCustomerBoxNumber(String customerBoxNumber) {
		CustomerBoxNumber = customerBoxNumber;
	}
	public Date getLinkDateTimed() {
		return LinkDateTimed;
	}
	public void setLinkDateTimed(Date linkDateTimed) {
		LinkDateTimed = linkDateTimed;
	}
	@ManyToOne
	@JoinColumn(name="ProductDeliveryRequestFormItemId")
	public ProductDeliveryRequestFormItem getProductDeliveryRequestFormItem() {
		return ProductDeliveryRequestFormItem;
	}
	public void setProductDeliveryRequestFormItem(ProductDeliveryRequestFormItem productDeliveryRequestFormItem) {
		ProductDeliveryRequestFormItem = productDeliveryRequestFormItem;
	}
	public Integer getMaterialOtherMovementFormItemId() {
		return MaterialOtherMovementFormItemId;
	}
	public void setMaterialOtherMovementFormItemId(Integer materialOtherMovementFormItemId) {
		MaterialOtherMovementFormItemId = materialOtherMovementFormItemId;
	}
	@ManyToOne
	@JoinColumn(name="ContainerId")
	public Container getContainer() {
		return Container;
	}
	public void setContainer(Container container) {
		Container = container;
	}
	@ManyToOne
	@JoinColumn(name="CreatorId")
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
    
    
}
