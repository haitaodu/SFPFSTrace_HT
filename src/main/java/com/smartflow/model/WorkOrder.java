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
@Table(name="core.WorkOrder")
public class WorkOrder {
	public Integer Id;
	public String WorkOrderNumber;
	public BOMHead BomHead;
	public Integer ProcessId;
	public Integer UnitId;
	public Integer LineId;
	public Integer ShiftId;
	public BigDecimal PlannedQuantity;
	public BigDecimal ActualBuiltQuantity;
	public Date PlannedStartDateTime;
	public Date PlannedFinishDateTime;
	public Date ActualStartDateTime;
	public Date ActualFinishedDateTime;
	public String Comment;
	public Date CreationDateTime;
	public Integer CreatorId;
	public Date EditDateTime;
	public Integer EditorId;
	public Integer State;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public String getWorkOrderNumber() {
		return WorkOrderNumber;
	}
	@ManyToOne
	@JoinColumn(name="BOMHeadId")
	public BOMHead getBomHead() {
		return BomHead;
	}
	public void setBomHead(BOMHead bomHead) {
		BomHead = bomHead;
	}
	public Integer getProcessId() {
		return ProcessId;
	}	
	public Integer getUnitId() {
		return UnitId;
	}
	public Integer getLineId() {
		return LineId;
	}
	public Integer getShiftId() {
		return ShiftId;
	}
	public BigDecimal getPlannedQuantity() {
		return PlannedQuantity;
	}
	public BigDecimal getActualBuiltQuantity() {
		return ActualBuiltQuantity;
	}
	public Date getPlannedStartDateTime() {
		return PlannedStartDateTime;
	}
	public Date getPlannedFinishDateTime() {
		return PlannedFinishDateTime;
	}
	public Date getActualStartDateTime() {
		return ActualStartDateTime;
	}
	public Date getActualFinishedDateTime() {
		return ActualFinishedDateTime;
	}
	public String getComment() {
		return Comment;
	}
	public Date getCreationDateTime() {
		return CreationDateTime;
	}
	public Integer getCreatorId() {
		return CreatorId;
	}
	public Date getEditDateTime() {
		return EditDateTime;
	}
	public Integer getEditorId() {
		return EditorId;
	}
	public Integer getState() {
		return State;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public void setWorkOrderNumber(String workOrderNumber) {
		WorkOrderNumber = workOrderNumber;
	}
	public void setProcessId(Integer processId) {
		ProcessId = processId;
	}
	public void setUnitId(Integer unitId) {
		UnitId = unitId;
	}
	public void setLineId(Integer lineId) {
		LineId = lineId;
	}
	public void setShiftId(Integer shiftId) {
		ShiftId = shiftId;
	}
	public void setPlannedQuantity(BigDecimal plannedQuantity) {
		PlannedQuantity = plannedQuantity;
	}
	public void setActualBuiltQuantity(BigDecimal actualBuiltQuantity) {
		ActualBuiltQuantity = actualBuiltQuantity;
	}
	public void setPlannedStartDateTime(Date plannedStartDateTime) {
		PlannedStartDateTime = plannedStartDateTime;
	}
	public void setPlannedFinishDateTime(Date plannedFinishDateTime) {
		PlannedFinishDateTime = plannedFinishDateTime;
	}
	public void setActualStartDateTime(Date actualStartDateTime) {
		ActualStartDateTime = actualStartDateTime;
	}
	public void setActualFinishedDateTime(Date actualFinishedDateTime) {
		ActualFinishedDateTime = actualFinishedDateTime;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public void setCreationDateTime(Date creationDateTime) {
		CreationDateTime = creationDateTime;
	}
	public void setCreatorId(Integer creatorId) {
		CreatorId = creatorId;
	}
	public void setEditDateTime(Date editDateTime) {
		EditDateTime = editDateTime;
	}
	public void setEditorId(Integer editorId) {
		EditorId = editorId;
	}
	public void setState(Integer state) {
		State = state;
	}

}
