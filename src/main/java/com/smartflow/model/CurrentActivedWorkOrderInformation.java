package com.smartflow.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="core.CurrentActivedWorkOrderInformation")
public class CurrentActivedWorkOrderInformation {
    
	private Integer Id;
	private WorkOrder WorkOrder;//WorkOrderId
	private Integer StationId;
	private Integer CellId;
	private Integer ProcessStepId;
	private Date ActiveDateTime;
	private Integer ActiveUserId;
    @javax.persistence.Id
    @GeneratedValue
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
    @ManyToOne
    @JoinColumn(name="WorkOrderId")
    public WorkOrder getWorkOrder() {
        return WorkOrder;
    }

    public void setWorkOrder(WorkOrder workOrder) {
        WorkOrder = workOrder;
    }

    public Integer getStationId() {
        return StationId;
    }

    public void setStationId(Integer stationId) {
        StationId = stationId;
    }

    public Integer getCellId() {
        return CellId;
    }

    public void setCellId(Integer cellId) {
        CellId = cellId;
    }

    public Integer getProcessStepId() {
        return ProcessStepId;
    }

    public void setProcessStepId(Integer processStepId) {
        ProcessStepId = processStepId;
    }

    public Date getActiveDateTime() {
        return ActiveDateTime;
    }

    public void setActiveDateTime(Date activeDateTime) {
        ActiveDateTime = activeDateTime;
    }

    public Integer getActiveUserId() {
        return ActiveUserId;
    }

    public void setActiveUserId(Integer activeUserId) {
        ActiveUserId = activeUserId;
    }
}
