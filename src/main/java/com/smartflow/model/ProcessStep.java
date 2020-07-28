package com.smartflow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="core.ProcessStep")
public class ProcessStep {
	public Integer Secquence;
	public Integer ProcessId;
	public String Description;
	public Integer StationGroupId;
	public boolean IsMandatory;
	public boolean IsNeedSetupCheck;
	public Integer MaximumTestCount;
	public boolean IsBackflush;
	public Integer EditorId;
	public Date EditDateTime;
	public Integer Layer;
	public Integer Id;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}   
	public Integer getSecquence() {
		return Secquence;
	}
	public void setSecquence(Integer secquence) {
		Secquence = secquence;
	}
	public Integer getProcessId() {
		return ProcessId;
	}
	public void setProcessId(Integer processId) {
		ProcessId = processId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Integer getStationGroupId() {
		return StationGroupId;
	}
	public void setStationGroupId(Integer stationGroupId) {
		StationGroupId = stationGroupId;
	}
	public boolean isIsMandatory() {
		return IsMandatory;
	}
	public void setIsMandatory(boolean isMandatory) {
		IsMandatory = isMandatory;
	}
	public boolean isIsNeedSetupCheck() {
		return IsNeedSetupCheck;
	}
	public void setIsNeedSetupCheck(boolean isNeedSetupCheck) {
		IsNeedSetupCheck = isNeedSetupCheck;
	}
	public Integer getMaximumTestCount() {
		return MaximumTestCount;
	}
	public void setMaximumTestCount(Integer maximumTestCount) {
		MaximumTestCount = maximumTestCount;
	}
	public boolean isIsBackflush() {
		return IsBackflush;
	}
	public void setIsBackflush(boolean isBackflush) {
		IsBackflush = isBackflush;
	}
	public Integer getEditorId() {
		return EditorId;
	}
	public void setEditorId(Integer editorId) {
		EditorId = editorId;
	}
	public Date getEditDateTime() {
		return EditDateTime;
	}
	public void setEditDateTime(Date editDateTime) {
		EditDateTime = editDateTime;
	}
	public Integer getLayer() {
		return Layer;
	}
	public void setLayer(Integer layer) {
		Layer = layer;
	} 

}
