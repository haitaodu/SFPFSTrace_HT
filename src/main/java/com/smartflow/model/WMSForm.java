package com.smartflow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="wms.WMSForm")
public class WMSForm {

	private Integer Id;
	private String FormNumber;
	private Integer FormTypeId;
	private Date CreationDateTime;
	private Integer CreatorId;
	private Date EditDateTime;
	private Integer EditorId;
	private Integer State;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFormNumber() {
		return FormNumber;
	}
	public void setFormNumber(String formNumber) {
		FormNumber = formNumber;
	}
	public Integer getFormTypeId() {
		return FormTypeId;
	}
	public void setFormTypeId(Integer formTypeId) {
		FormTypeId = formTypeId;
	}
	public Date getCreationDateTime() {
		return CreationDateTime;
	}
	public void setCreationDateTime(Date creationDateTime) {
		CreationDateTime = creationDateTime;
	}
	public Integer getCreatorId() {
		return CreatorId;
	}
	public void setCreatorId(Integer creatorId) {
		CreatorId = creatorId;
	}
	public Date getEditDateTime() {
		return EditDateTime;
	}
	public void setEditDateTime(Date editDateTime) {
		EditDateTime = editDateTime;
	}
	public Integer getEditorId() {
		return EditorId;
	}
	public void setEditorId(Integer editorId) {
		EditorId = editorId;
	}
	public Integer getState() {
		return State;
	}
	public void setState(Integer state) {
		State = state;
	}
	
}
