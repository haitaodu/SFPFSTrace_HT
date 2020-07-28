package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="core.CL_IMOP67")
public class CL_IMOP67 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private BigDecimal DB14_DBD12;
    private BigDecimal DB14_DBD16;
    private BigDecimal DB14_DBD20;
    private BigDecimal DB14_DBD24;
    private BigDecimal DB14_DBD28;
    private BigDecimal DB14_DBD32;
    private String DB14_DBD36;
    private BigDecimal DB14_DBD4;
    private BigDecimal DB14_DBD8;
    private BigDecimal DB14_DBW168;
    private BigDecimal DB14_DBW170;
    private String DB14_DBX0_0;
    private String DB14_DBX0_1;

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

    public BigDecimal getDB14_DBD12() {
        return DB14_DBD12;
    }

    public void setDB14_DBD12(BigDecimal DB14_DBD12) {
        this.DB14_DBD12 = DB14_DBD12;
    }

    public BigDecimal getDB14_DBD16() {
        return DB14_DBD16;
    }

    public void setDB14_DBD16(BigDecimal DB14_DBD16) {
        this.DB14_DBD16 = DB14_DBD16;
    }

    public BigDecimal getDB14_DBD20() {
        return DB14_DBD20;
    }

    public void setDB14_DBD20(BigDecimal DB14_DBD20) {
        this.DB14_DBD20 = DB14_DBD20;
    }

    public BigDecimal getDB14_DBD24() {
        return DB14_DBD24;
    }

    public void setDB14_DBD24(BigDecimal DB14_DBD24) {
        this.DB14_DBD24 = DB14_DBD24;
    }

    public BigDecimal getDB14_DBD28() {
        return DB14_DBD28;
    }

    public void setDB14_DBD28(BigDecimal DB14_DBD28) {
        this.DB14_DBD28 = DB14_DBD28;
    }

    public BigDecimal getDB14_DBD32() {
        return DB14_DBD32;
    }

    public void setDB14_DBD32(BigDecimal DB14_DBD32) {
        this.DB14_DBD32 = DB14_DBD32;
    }

    public String getDB14_DBD36() {
        return DB14_DBD36;
    }

    public void setDB14_DBD36(String DB14_DBD36) {
        this.DB14_DBD36 = DB14_DBD36;
    }

    public BigDecimal getDB14_DBD4() {
        return DB14_DBD4;
    }

    public void setDB14_DBD4(BigDecimal DB14_DBD4) {
        this.DB14_DBD4 = DB14_DBD4;
    }

    public BigDecimal getDB14_DBD8() {
        return DB14_DBD8;
    }

    public void setDB14_DBD8(BigDecimal DB14_DBD8) {
        this.DB14_DBD8 = DB14_DBD8;
    }

    public BigDecimal getDB14_DBW168() {
        return DB14_DBW168;
    }

    public void setDB14_DBW168(BigDecimal DB14_DBW168) {
        this.DB14_DBW168 = DB14_DBW168;
    }

    public BigDecimal getDB14_DBW170() {
        return DB14_DBW170;
    }

    public void setDB14_DBW170(BigDecimal DB14_DBW170) {
        this.DB14_DBW170 = DB14_DBW170;
    }

    public String getDB14_DBX0_0() {
        return DB14_DBX0_0;
    }

    public void setDB14_DBX0_0(String DB14_DBX0_0) {
        this.DB14_DBX0_0 = DB14_DBX0_0;
    }

    public String getDB14_DBX0_1() {
        return DB14_DBX0_1;
    }

    public void setDB14_DBX0_1(String DB14_DBX0_1) {
        this.DB14_DBX0_1 = DB14_DBX0_1;
    }
}
