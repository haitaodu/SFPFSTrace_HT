package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/7/13 13:43
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_REOP015", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_REOP015 {
    private String uuid;
    private Date createDate;
    private String isSynch;
    private String db100Dbd040;
    private String db100Dbd4040;
    private String db100Dbx800;
    private String db100Dbx801;
    private String db100Dbx802;
    private String db100Dbx803;
    private String db100Dbx804;
    private String db100Dbx805;
    private String db100Dbx806;
    private BigDecimal db100Real82;
    private BigDecimal db100Real86;

    @Id
    @Column(name = "UUID", nullable = false, length = 32)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
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
    @Column(name = "IS_SYNCH", nullable = true, length = 2)
    public String getIsSynch() {
        return isSynch;
    }

    public void setIsSynch(String isSynch) {
        this.isSynch = isSynch;
    }

    @Basic
    @Column(name = "DB100_DBD0_40", nullable = true, length = 4000)
    public String getDb100Dbd040() {
        return db100Dbd040;
    }

    public void setDb100Dbd040(String db100Dbd040) {
        this.db100Dbd040 = db100Dbd040;
    }

    @Basic
    @Column(name = "DB100_DBD40_40", nullable = true, length = 4000)
    public String getDb100Dbd4040() {
        return db100Dbd4040;
    }

    public void setDb100Dbd4040(String db100Dbd4040) {
        this.db100Dbd4040 = db100Dbd4040;
    }

    @Basic
    @Column(name = "DB100_DBX80_0", nullable = true, length = 2)
    public String getDb100Dbx800() {
        return db100Dbx800;
    }

    public void setDb100Dbx800(String db100Dbx800) {
        this.db100Dbx800 = db100Dbx800;
    }

    @Basic
    @Column(name = "DB100_DBX80_1", nullable = true, length = 2)
    public String getDb100Dbx801() {
        return db100Dbx801;
    }

    public void setDb100Dbx801(String db100Dbx801) {
        this.db100Dbx801 = db100Dbx801;
    }

    @Basic
    @Column(name = "DB100_DBX80_2", nullable = true, length = 2)
    public String getDb100Dbx802() {
        return db100Dbx802;
    }

    public void setDb100Dbx802(String db100Dbx802) {
        this.db100Dbx802 = db100Dbx802;
    }

    @Basic
    @Column(name = "DB100_DBX80_3", nullable = true, length = 2)
    public String getDb100Dbx803() {
        return db100Dbx803;
    }

    public void setDb100Dbx803(String db100Dbx803) {
        this.db100Dbx803 = db100Dbx803;
    }

    @Basic
    @Column(name = "DB100_DBX80_4", nullable = true, length = 2)
    public String getDb100Dbx804() {
        return db100Dbx804;
    }

    public void setDb100Dbx804(String db100Dbx804) {
        this.db100Dbx804 = db100Dbx804;
    }

    @Basic
    @Column(name = "DB100_DBX80_5", nullable = true, length = 2)
    public String getDb100Dbx805() {
        return db100Dbx805;
    }

    public void setDb100Dbx805(String db100Dbx805) {
        this.db100Dbx805 = db100Dbx805;
    }

    @Basic
    @Column(name = "DB100_DBX80_6", nullable = true, length = 2)
    public String getDb100Dbx806() {
        return db100Dbx806;
    }

    public void setDb100Dbx806(String db100Dbx806) {
        this.db100Dbx806 = db100Dbx806;
    }

    @Basic
    @Column(name = "DB100_REAL82", nullable = true, precision = 8)
    public BigDecimal getDb100Real82() {
        return db100Real82;
    }

    public void setDb100Real82(BigDecimal db100Real82) {
        this.db100Real82 = db100Real82;
    }

    @Basic
    @Column(name = "DB100_REAL86", nullable = true, precision = 8)
    public BigDecimal getDb100Real86() {
        return db100Real86;
    }

    public void setDb100Real86(BigDecimal db100Real86) {
        this.db100Real86 = db100Real86;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CL_REOP015 that = (CL_REOP015) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(isSynch, that.isSynch) &&
                Objects.equals(db100Dbd040, that.db100Dbd040) &&
                Objects.equals(db100Dbd4040, that.db100Dbd4040) &&
                Objects.equals(db100Dbx800, that.db100Dbx800) &&
                Objects.equals(db100Dbx801, that.db100Dbx801) &&
                Objects.equals(db100Dbx802, that.db100Dbx802) &&
                Objects.equals(db100Dbx803, that.db100Dbx803) &&
                Objects.equals(db100Dbx804, that.db100Dbx804) &&
                Objects.equals(db100Dbx805, that.db100Dbx805) &&
                Objects.equals(db100Dbx806, that.db100Dbx806) &&
                Objects.equals(db100Real82, that.db100Real82) &&
                Objects.equals(db100Real86, that.db100Real86);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, createDate, isSynch, db100Dbd040, db100Dbd4040, db100Dbx800, db100Dbx801, db100Dbx802, db100Dbx803, db100Dbx804, db100Dbx805, db100Dbx806, db100Real82, db100Real86);
    }
}
