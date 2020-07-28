package com.smartflow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Table(name="trace.FailureSlip")
public class FailureSlip {
	private Integer Id;
//    private Integer PartProcessRecordId;
    private String Content;
   
    private PartProcessRecord PartProcessRecord;
    @Id
    @GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
//	public Integer getPartProcessRecordId() {
//		return PartProcessRecordId;
//	}
//	public void setPartProcessRecordId(Integer partProcessRecordId) {
//		PartProcessRecordId = partProcessRecordId;
//	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	@ManyToOne
    @JoinColumn(name="PartProcessRecordId")
	public PartProcessRecord getPartProcessRecord() {
		return PartProcessRecord;
	}
	public void setPartProcessRecord(PartProcessRecord partProcessRecord) {
		PartProcessRecord = partProcessRecord;
	}
    
}
