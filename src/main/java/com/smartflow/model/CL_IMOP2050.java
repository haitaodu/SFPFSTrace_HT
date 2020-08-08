package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:24
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_IMOP2050", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_IMOP2050 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String uuid;
    private Date createDate;
    private String machineTool;
    private String isSynch;
    private String db9Db120;
    private String db9Dbx3705;

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
    @Column(name = "DB9_DB120", nullable = true, length = 4000)
    public String getDb9Db120() {
        return db9Db120;
    }

    public void setDb9Db120(String db9Db120) {
        this.db9Db120 = db9Db120;
    }

    @Basic
    @Column(name = "DB9_DBX370_5", nullable = true, length = 2)
    public String getDb9Dbx3705() {
        return db9Dbx3705;
    }

    public void setDb9Dbx3705(String db9Dbx3705) {
        this.db9Dbx3705 = db9Dbx3705;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CL_IMOP2050 that = (CL_IMOP2050) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(machineTool, that.machineTool) &&
                Objects.equals(isSynch, that.isSynch) &&
                Objects.equals(db9Db120, that.db9Db120) &&
                Objects.equals(db9Dbx3705, that.db9Dbx3705);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, createDate, machineTool, isSynch, db9Db120, db9Dbx3705);
    }
}
