package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:20
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_FCOP5070", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_FCOP5070 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String uuid;
    private Date createDate;
    private String machineTool;
    private String isSynch;
    private String serialNumber;
    private Long workOrderId;
    private String db9Db120;
    private String db9Db160;
    private String db9Dbx3705;
    private String db9Dbx3706;

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
    @Column(name = "DB9_DB120", nullable = true, length = 4000)
    public String getDb9Db120() {
        return db9Db120;
    }

    public void setDb9Db120(String db9Db120) {
        this.db9Db120 = db9Db120;
    }

    @Basic
    @Column(name = "DB9_DB160", nullable = true, length = 4000)
    public String getDb9Db160() {
        return db9Db160;
    }

    public void setDb9Db160(String db9Db160) {
        this.db9Db160 = db9Db160;
    }

    @Basic
    @Column(name = "DB9_DBX370_5", nullable = true, length = 2)
    public String getDb9Dbx3705() {
        return db9Dbx3705;
    }

    public void setDb9Dbx3705(String db9Dbx3705) {
        this.db9Dbx3705 = db9Dbx3705;
    }

    @Basic
    @Column(name = "DB9_DBX370_6", nullable = true, length = 2)
    public String getDb9Dbx3706() {
        return db9Dbx3706;
    }

    public void setDb9Dbx3706(String db9Dbx3706) {
        this.db9Dbx3706 = db9Dbx3706;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CL_FCOP5070 that = (CL_FCOP5070) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(machineTool, that.machineTool) &&
                Objects.equals(isSynch, that.isSynch) &&
                Objects.equals(serialNumber, that.serialNumber) &&
                Objects.equals(workOrderId, that.workOrderId) &&
                Objects.equals(db9Db120, that.db9Db120) &&
                Objects.equals(db9Db160, that.db9Db160) &&
                Objects.equals(db9Dbx3705, that.db9Dbx3705) &&
                Objects.equals(db9Dbx3706, that.db9Dbx3706);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, createDate, machineTool, isSynch, serialNumber, workOrderId, db9Db120, db9Db160, db9Dbx3705, db9Dbx3706);
    }
}
