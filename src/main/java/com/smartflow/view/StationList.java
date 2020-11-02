package com.smartflow.view;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/10/29 15:46
 */

@Entity
public class StationList {
    @Id
    @GeneratedValue
    private String stationNumber;
    private String description;
    private int stationState;
    private int cellId;
    private String parentProcessNumber;
    private long workerId;
    private int cellState;
    private int processStepId;
    private int stationType;

    @Basic
    @Column(name = "StationNumber", nullable = false, length = 50)
    public String getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(String stationNumber) {
        this.stationNumber = stationNumber;
    }

    @Basic
    @Column(name = "Description", nullable = false, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "StationState", nullable = false)
    public int getStationState() {
        return stationState;
    }

    public void setStationState(int stationState) {
        this.stationState = stationState;
    }

    @Basic
    @Column(name = "CellId", nullable = false)
    public int getCellId() {
        return cellId;
    }

    public void setCellId(int cellId) {
        this.cellId = cellId;
    }

    @Basic
    @Column(name = "ParentProcessNumber", nullable = true, length = 50)
    public String getParentProcessNumber() {
        return parentProcessNumber;
    }

    public void setParentProcessNumber(String parentProcessNumber) {
        this.parentProcessNumber = parentProcessNumber;
    }

    @Basic
    @Column(name = "WorkerId", nullable = false)
    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    @Basic
    @Column(name = "CellState", nullable = false)
    public int getCellState() {
        return cellState;
    }

    public void setCellState(int cellState) {
        this.cellState = cellState;
    }

    @Basic
    @Column(name = "ProcessStepId", nullable = false)
    public int getProcessStepId() {
        return processStepId;
    }

    public void setProcessStepId(int processStepId) {
        this.processStepId = processStepId;
    }

    @Basic
    @Column(name = "StationType", nullable = false)
    public int getStationType() {
        return stationType;
    }

    public void setStationType(int stationType) {
        this.stationType = stationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationList that = (StationList) o;
        return stationState == that.stationState &&
                cellId == that.cellId &&
                workerId == that.workerId &&
                cellState == that.cellState &&
                processStepId == that.processStepId &&
                stationType == that.stationType &&
                Objects.equals(stationNumber, that.stationNumber) &&
                Objects.equals(description, that.description) &&
                Objects.equals(parentProcessNumber, that.parentProcessNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stationNumber, description, stationState, cellId, parentProcessNumber, workerId, cellState, processStepId, stationType);
    }
}
