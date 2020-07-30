package com.smartflow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="core.RepairAction")
public class RepairAction {
	private Integer Id;
	private String RepairActionCode;
	private String Name;
	private String Description;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getRepairActionCode() {
		return RepairActionCode;
	}
	public void setRepairActionCode(String repairActionCode) {
		RepairActionCode = repairActionCode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}


}

