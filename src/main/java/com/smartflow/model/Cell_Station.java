package com.smartflow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="core.Cell_Station")
public class Cell_Station {
	private Integer Id;
	private Integer CellId;
	private Integer StationId;
	private Date EditDateTime;
	private Integer EditorId;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getCellId() {
		return CellId;
	}
	public void setCellId(Integer cellId) {
		CellId = cellId;
	}
	public Integer getStationId() {
		return StationId;
	}
	public void setStationId(Integer stationId) {
		StationId = stationId;
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
	
}
