package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/7/13 13:43
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_IMOP045", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_IMOP045 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String DB100_DBD0_40;
    private String DB100_DBD40_40;
    private String DB100_DBX80_0;
    private String DB100_DBX80_1;
    private String DB100_DBX80_2;
    private String DB100_DBX80_3;
    private String DB100_DBX80_4;
    private String DB100_DBX80_5;
    private String DB100_DBX80_6;
    private BigDecimal DB100_REAL82;
    private BigDecimal DB100_REAL86;

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getIS_SYNCH() {
        return IS_SYNCH;
    }

    public void setIS_SYNCH(String IS_SYNCH) {
        this.IS_SYNCH = IS_SYNCH;
    }

    public String getDB100_DBD0_40() {
        return DB100_DBD0_40;
    }

    public void setDB100_DBD0_40(String DB100_DBD0_40) {
        this.DB100_DBD0_40 = DB100_DBD0_40;
    }

    public String getDB100_DBD40_40() {
        return DB100_DBD40_40;
    }

    public void setDB100_DBD40_40(String DB100_DBD40_40) {
        this.DB100_DBD40_40 = DB100_DBD40_40;
    }

    public String getDB100_DBX80_0() {
        return DB100_DBX80_0;
    }

    public void setDB100_DBX80_0(String DB100_DBX80_0) {
        this.DB100_DBX80_0 = DB100_DBX80_0;
    }

    public String getDB100_DBX80_1() {
        return DB100_DBX80_1;
    }

    public void setDB100_DBX80_1(String DB100_DBX80_1) {
        this.DB100_DBX80_1 = DB100_DBX80_1;
    }

    public String getDB100_DBX80_2() {
        return DB100_DBX80_2;
    }

    public void setDB100_DBX80_2(String DB100_DBX80_2) {
        this.DB100_DBX80_2 = DB100_DBX80_2;
    }

    public String getDB100_DBX80_3() {
        return DB100_DBX80_3;
    }

    public void setDB100_DBX80_3(String DB100_DBX80_3) {
        this.DB100_DBX80_3 = DB100_DBX80_3;
    }

    public String getDB100_DBX80_4() {
        return DB100_DBX80_4;
    }

    public void setDB100_DBX80_4(String DB100_DBX80_4) {
        this.DB100_DBX80_4 = DB100_DBX80_4;
    }

    public String getDB100_DBX80_5() {
        return DB100_DBX80_5;
    }

    public void setDB100_DBX80_5(String DB100_DBX80_5) {
        this.DB100_DBX80_5 = DB100_DBX80_5;
    }

    public String getDB100_DBX80_6() {
        return DB100_DBX80_6;
    }

    public void setDB100_DBX80_6(String DB100_DBX80_6) {
        this.DB100_DBX80_6 = DB100_DBX80_6;
    }

    public BigDecimal getDB100_REAL82() {
        return DB100_REAL82;
    }

    public void setDB100_REAL82(BigDecimal DB100_REAL82) {
        this.DB100_REAL82 = DB100_REAL82;
    }

    public BigDecimal getDB100_REAL86() {
        return DB100_REAL86;
    }

    public void setDB100_REAL86(BigDecimal DB100_REAL86) {
        this.DB100_REAL86 = DB100_REAL86;
    }
}
