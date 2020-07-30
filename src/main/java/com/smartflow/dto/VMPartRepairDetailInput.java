package com.smartflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VMPartRepairDetailInput {

	private Integer RepairRecordId;
	@JsonProperty("RepairRecordId")
	public Integer getRepairRecordId() {
		return RepairRecordId;
	}
	public void setRepairRecordId(Integer repairRecordId) {
		RepairRecordId = repairRecordId;
	}
	

}
