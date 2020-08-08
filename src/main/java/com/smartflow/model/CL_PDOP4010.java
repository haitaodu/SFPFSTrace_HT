package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:28
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_PDOP4010", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_PDOP4010 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String uuid;
    private Date createDate;
    private String machineTool;
    private String isSynch;
    private String serialNumber;
    private Long workOrderId;
    private String db15Db120;
    private String db15Db160;
    private String db15Db360;
    private String db15Db400;
    private String db15Dbx6584;
    private String db15Dbx6585;
    private String db15Dbx6586;
    private String db15Dbx6587;

    @Id
    @Column(name = "UUID", nullable = false, length = 32)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "MACHINE_TOOL", nullable = true, length = 100)
    public String getMachineTool() {
        return machineTool;
    }

    public void setMachineTool(String machineTool) {
        this.machineTool = machineTool;
    }

    @Basic
    @Column(name = "IS_SYNCH", nullable = true, length = 2)
    public String getIsSynch() {
        return isSynch;
    }

    public void setIsSynch(String isSynch) {
        this.isSynch = isSynch;
    }

    @Basic
    @Column(name = "SerialNumber", nullable = true, length = 100)
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Basic
    @Column(name = "WorkOrderId", nullable = true)
    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    @Basic
    @Column(name = "DB15_DB120", nullable = true, length = 4000)
    public String getDb15Db120() {
        return db15Db120;
    }

    public void setDb15Db120(String db15Db120) {
        this.db15Db120 = db15Db120;
    }

    @Basic
    @Column(name = "DB15_DB160", nullable = true, length = 4000)
    public String getDb15Db160() {
        return db15Db160;
    }

    public void setDb15Db160(String db15Db160) {
        this.db15Db160 = db15Db160;
    }

    @Basic
    @Column(name = "DB15_DB360", nullable = true, length = 4000)
    public String getDb15Db360() {
        return db15Db360;
    }

    public void setDb15Db360(String db15Db360) {
        this.db15Db360 = db15Db360;
    }

    @Basic
    @Column(name = "DB15_DB400", nullable = true, length = 4000)
    public String getDb15Db400() {
        return db15Db400;
    }

    public void setDb15Db400(String db15Db400) {
        this.db15Db400 = db15Db400;
    }

    @Basic
    @Column(name = "DB15_DBX658_4", nullable = true, length = 2)
    public String getDb15Dbx6584() {
        return db15Dbx6584;
    }

    public void setDb15Dbx6584(String db15Dbx6584) {
        this.db15Dbx6584 = db15Dbx6584;
    }

    @Basic
    @Column(name = "DB15_DBX658_5", nullable = true, length = 2)
    public String getDb15Dbx6585() {
        return db15Dbx6585;
    }

    public void setDb15Dbx6585(String db15Dbx6585) {
        this.db15Dbx6585 = db15Dbx6585;
    }

    @Basic
    @Column(name = "DB15_DBX658_6", nullable = true, length = 2)
    public String getDb15Dbx6586() {
        return db15Dbx6586;
    }

    public void setDb15Dbx6586(String db15Dbx6586) {
        this.db15Dbx6586 = db15Dbx6586;
    }

    @Basic
    @Column(name = "DB15_DBX658_7", nullable = true, length = 2)
    public String getDb15Dbx6587() {
        return db15Dbx6587;
    }

    public void setDb15Dbx6587(String db15Dbx6587) {
        this.db15Dbx6587 = db15Dbx6587;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CL_PDOP4010 that = (CL_PDOP4010) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(machineTool, that.machineTool) &&
                Objects.equals(isSynch, that.isSynch) &&
                Objects.equals(serialNumber, that.serialNumber) &&
                Objects.equals(workOrderId, that.workOrderId) &&
                Objects.equals(db15Db120, that.db15Db120) &&
                Objects.equals(db15Db160, that.db15Db160) &&
                Objects.equals(db15Db360, that.db15Db360) &&
                Objects.equals(db15Db400, that.db15Db400) &&
                Objects.equals(db15Dbx6584, that.db15Dbx6584) &&
                Objects.equals(db15Dbx6585, that.db15Dbx6585) &&
                Objects.equals(db15Dbx6586, that.db15Dbx6586) &&
                Objects.equals(db15Dbx6587, that.db15Dbx6587);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, createDate, machineTool, isSynch, serialNumber, workOrderId, db15Db120, db15Db160, db15Db360, db15Db400, db15Dbx6584, db15Dbx6585, db15Dbx6586, db15Dbx6587);
    }
}
