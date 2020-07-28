package com.smartflow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="core.BOMHead")
public class BOMHead {
	private Integer Id;
    private Material Material;
	private Date ValidBegin;
	private Date ValidEnd;
	private Date EditDateTime;
	private Integer EditorId;
	private Integer State;
	private Integer FactoryId;
	private Integer CreatorId;
	private Date CreationDateTime;
	private Integer Version;
	private String ERPBOMVersion;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}	
	public Date getValidBegin() {
		return ValidBegin;
	}
	@ManyToOne
	@JoinColumn(name="MaterialId")
	public Material getMaterial() {
		return Material;
	}
	public void setMaterial(Material material) {
		Material = material;
	}
	public void setValidBegin(Date validBegin) {
		ValidBegin = validBegin;
	}
	
	public Date getValidEnd() {
		return ValidEnd;
	}
	public void setValidEnd(Date validEnd) {
		ValidEnd = validEnd;
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
	public Integer getFactoryId() {
		return FactoryId;
	}
	public void setFactoryId(Integer factoryId) {
		FactoryId = factoryId;
	}
	public Integer getCreatorId() {
		return CreatorId;
	}
	public void setCreatorId(Integer creatorId) {
		CreatorId = creatorId;
	}
	public Date getCreationDateTime() {
		return CreationDateTime;
	}
	public void setCreationDateTime(Date creationDateTime) {
		CreationDateTime = creationDateTime;
	}
	public Integer getVersion() {
		return Version;
	}
	public void setVersion(Integer version) {
		Version = version;
	}
	public String getERPBOMVersion() {
		return ERPBOMVersion;
	}
	public void setERPBOMVersion(String eRPBOMVersion) {
		ERPBOMVersion = eRPBOMVersion;
	}
	
	
}
