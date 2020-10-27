package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "core.CL_TUOP40")
public class CL_TUOP40 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private BigDecimal DB2_DBD40;
    private BigDecimal DB2_DBD44;
    private BigDecimal DB2_DBD48;
    private BigDecimal DB2_DBW0;
    private BigDecimal DB2_DBW12;
    private BigDecimal DB2_DBW16;
    private BigDecimal DB2_DBW2;
    private BigDecimal DB2_DBW20;
    private BigDecimal DB2_DBW4;
    private BigDecimal DB2_DBW52;
    private BigDecimal DB2_DBW54;
    private BigDecimal DB2_DBW56;
    private BigDecimal DB2_DBW58;
    private BigDecimal DB2_DBW6;
    private BigDecimal DB2_DBW60;
    private BigDecimal DB2_DBW62;
    private BigDecimal DB2_DBW8;

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }

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

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public Integer getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        WorkOrderId = workOrderId;
    }
    public BigDecimal getDB2_DBD40() {
        return DB2_DBD40;
    }

    public void setDB2_DBD40(BigDecimal DB2_DBD40) {
        this.DB2_DBD40 = DB2_DBD40;
    }

    public BigDecimal getDB2_DBD44() {
        return DB2_DBD44;
    }

    public void setDB2_DBD44(BigDecimal DB2_DBD44) {
        this.DB2_DBD44 = DB2_DBD44;
    }

    public BigDecimal getDB2_DBD48() {
        return DB2_DBD48;
    }

    public void setDB2_DBD48(BigDecimal DB2_DBD48) {
        this.DB2_DBD48 = DB2_DBD48;
    }

    public BigDecimal getDB2_DBW0() {
        return DB2_DBW0;
    }

    public void setDB2_DBW0(BigDecimal DB2_DBW0) {
        this.DB2_DBW0 = DB2_DBW0;
    }

    public BigDecimal getDB2_DBW12() {
        return DB2_DBW12;
    }

    public void setDB2_DBW12(BigDecimal DB2_DBW12) {
        this.DB2_DBW12 = DB2_DBW12;
    }

    public BigDecimal getDB2_DBW16() {
        return DB2_DBW16;
    }

    public void setDB2_DBW16(BigDecimal DB2_DBW16) {
        this.DB2_DBW16 = DB2_DBW16;
    }

    public BigDecimal getDB2_DBW2() {
        return DB2_DBW2;
    }

    public void setDB2_DBW2(BigDecimal DB2_DBW2) {
        this.DB2_DBW2 = DB2_DBW2;
    }

    public BigDecimal getDB2_DBW20() {
        return DB2_DBW20;
    }

    public void setDB2_DBW20(BigDecimal DB2_DBW20) {
        this.DB2_DBW20 = DB2_DBW20;
    }


    public BigDecimal getDB2_DBW4() {
        return DB2_DBW4;
    }

    public void setDB2_DBW4(BigDecimal DB2_DBW4) {
        this.DB2_DBW4 = DB2_DBW4;
    }

    public BigDecimal getDB2_DBW52() {
        return DB2_DBW52;
    }

    public void setDB2_DBW52(BigDecimal DB2_DBW52) {
        this.DB2_DBW52 = DB2_DBW52;
    }

    public BigDecimal getDB2_DBW54() {
        return DB2_DBW54;
    }

    public void setDB2_DBW54(BigDecimal DB2_DBW54) {
        this.DB2_DBW54 = DB2_DBW54;
    }

    public BigDecimal getDB2_DBW56() {
        return DB2_DBW56;
    }

    public void setDB2_DBW56(BigDecimal DB2_DBW56) {
        this.DB2_DBW56 = DB2_DBW56;
    }

    public BigDecimal getDB2_DBW58() {
        return DB2_DBW58;
    }

    public void setDB2_DBW58(BigDecimal DB2_DBW58) {
        this.DB2_DBW58 = DB2_DBW58;
    }

    public BigDecimal getDB2_DBW6() {
        return DB2_DBW6;
    }

    public void setDB2_DBW6(BigDecimal DB2_DBW6) {
        this.DB2_DBW6 = DB2_DBW6;
    }

    public BigDecimal getDB2_DBW60() {
        return DB2_DBW60;
    }

    public void setDB2_DBW60(BigDecimal DB2_DBW60) {
        this.DB2_DBW60 = DB2_DBW60;
    }

    public BigDecimal getDB2_DBW62() {
        return DB2_DBW62;
    }

    public void setDB2_DBW62(BigDecimal DB2_DBW62) {
        this.DB2_DBW62 = DB2_DBW62;
    }

    public BigDecimal getDB2_DBW8() {
        return DB2_DBW8;
    }

    public void setDB2_DBW8(BigDecimal DB2_DBW8) {
        this.DB2_DBW8 = DB2_DBW8;
    }
}
