package com.smartflow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Table(name="core.PackingInformation")
public class PackingInformation {
	private Integer Id;
	private Container Container;
	private PartSerialNumber PartSerialNumber;
	private Date PackingDateTime;
	private User User;
    @Id
    @GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
	@JoinColumn(name="PartSerialNumberId")
	public PartSerialNumber getPartSerialNumber() {
		return PartSerialNumber;
	}
	public void setPartSerialNumber(PartSerialNumber partSerialNumber) {
		PartSerialNumber = partSerialNumber;
	}
	public Date getPackingDateTime() {
		return PackingDateTime;
	}
	public void setPackingDateTime(Date packingDateTime) {
		PackingDateTime = packingDateTime;
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
