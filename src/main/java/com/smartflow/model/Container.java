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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="core.Container")
public class Container {
	private Integer Id;
	private String ContainerNumber;
	private Material Material;
	private Double TotalQuantity;
	private Integer CurrentLocationId;
	private String BatchNumber;
	private SupplierModel Supplier;
	private Date ManufacturingDateTime;
	private Date ExpirationDate;
	private Date CreationDateTime;
	private Date PackingStartDateTime;
	private Date PackingCompleteDateTime;
	private Integer CreatorId;
	private Integer PackingUserId;
	private Double MSDLifeReminingTimeInMinute;
	private Integer State;	
	private Set<CustomerBoxInformation> CustomerBoxInformations = new HashSet<>();
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}	
	public String getContainerNumber() {
		return ContainerNumber;
	}
	public void setContainerNumber(String containerNumber) {
		ContainerNumber = containerNumber;
	}
	public Double getTotalQuantity() {
		return TotalQuantity;
	}
	public void setTotalQuantity(Double totalQuantity) {
		TotalQuantity = totalQuantity;
	}
	public Integer getCurrentLocationId() {
		return CurrentLocationId;
	}
	public void setCurrentLocationId(Integer currentLocationId) {
		CurrentLocationId = currentLocationId;
	}
	public String getBatchNumber() {
		return BatchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		BatchNumber = batchNumber;
	}
	@ManyToOne
	@JoinColumn(name="SupplierId")
	public SupplierModel getSupplier() {
		return Supplier;
	}
	public void setSupplier(SupplierModel supplier) {
		Supplier = supplier;
	}
	public Date getManufacturingDateTime() {
		return ManufacturingDateTime;
	}
	public void setManufacturingDateTime(Date manufacturingDateTime) {
		ManufacturingDateTime = manufacturingDateTime;
	}
	public Date getExpirationDate() {
		return ExpirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		ExpirationDate = expirationDate;
	}
	public Date getCreationDateTime() {
		return CreationDateTime;
	}
	public void setCreationDateTime(Date creationDateTime) {
		CreationDateTime = creationDateTime;
	}
	public Date getPackingStartDateTime() {
		return PackingStartDateTime;
	}
	public void setPackingStartDateTime(Date packingStartDateTime) {
		PackingStartDateTime = packingStartDateTime;
	}
	public Date getPackingCompleteDateTime() {
		return PackingCompleteDateTime;
	}
	public void setPackingCompleteDateTime(Date packingCompleteDateTime) {
		PackingCompleteDateTime = packingCompleteDateTime;
	}
	public Integer getCreatorId() {
		return CreatorId;
	}
	public void setCreatorId(Integer creatorId) {
		CreatorId = creatorId;
	}
	public Integer getPackingUserId() {
		return PackingUserId;
	}
	public void setPackingUserId(Integer packingUserId) {
		PackingUserId = packingUserId;
	}
	public Double getMSDLifeReminingTimeInMinute() {
		return MSDLifeReminingTimeInMinute;
	}
	public void setMSDLifeReminingTimeInMinute(Double mSDLifeReminingTimeInMinute) {
		MSDLifeReminingTimeInMinute = mSDLifeReminingTimeInMinute;
	}
	public Integer getState() {
		return State;
	}
	public void setState(Integer state) {
		State = state;
	}
	@ManyToOne
	@JoinColumn(name="MaterialId")
	public Material getMaterial() {
		return Material;
	}
	public void setMaterial(Material material) {
		Material = material;
	}

	
	@JsonIgnore
	@OneToMany(targetEntity=CustomerBoxInformation.class,fetch=FetchType.LAZY)
	@JoinColumn(name="ContainerId")
	public Set<CustomerBoxInformation> getCustomerBoxInformations() {
		return CustomerBoxInformations;
	}
	public void setCustomerBoxInformations(Set<CustomerBoxInformation> customerBoxInformations) {
		CustomerBoxInformations = customerBoxInformations;
	}

	

}
