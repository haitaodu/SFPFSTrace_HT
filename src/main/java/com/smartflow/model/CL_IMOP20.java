package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;



/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:24
 */

@Entity
@Table(name = "core.CL_IMOP20")
public class CL_IMOP20 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private java.util.Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNuMber;
    private Integer WorkOrderId;
    private BigDecimal DB48_DBD12;
    private BigDecimal DB48_DBD16;
    private BigDecimal DB48_DBD20;
    private BigDecimal DB48_DBD24;
    private BigDecimal DB48_DBD28;
    private BigDecimal DB48_DBD32;
    private BigDecimal DB48_DBD344;
    private BigDecimal DB48_DBD348;
    private BigDecimal DB48_DBD352;
    private BigDecimal DB48_DBD356;
    private BigDecimal DB48_DBD36;
    private BigDecimal DB48_DBD360;
    private BigDecimal DB48_DBD4;
    private BigDecimal DB48_DBD40;
    private String DB48_DBD44;
    private BigDecimal DB48_DBD8;
    private String DB48_DBD86;
    private Integer DB48_DBW342;
    private int state;
    private String IS_OK;

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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

    public String getSerialNuMber() {
        return SerialNuMber;
    }

    public void setSerialNuMber(String serialNuMber) {
        SerialNuMber = serialNuMber;
    }

    public Integer getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        WorkOrderId = workOrderId;
    }

    public BigDecimal getDB48_DBD12() {
        return DB48_DBD12;
    }

    public void setDB48_DBD12(BigDecimal DB48_DBD12) {
        this.DB48_DBD12 = DB48_DBD12;
    }

    public BigDecimal getDB48_DBD16() {
        return DB48_DBD16;
    }

    public void setDB48_DBD16(BigDecimal DB48_DBD16) {
        this.DB48_DBD16 = DB48_DBD16;
    }

    public BigDecimal getDB48_DBD20() {
        return DB48_DBD20;
    }

    public void setDB48_DBD20(BigDecimal DB48_DBD20) {
        this.DB48_DBD20 = DB48_DBD20;
    }

    public BigDecimal getDB48_DBD24() {
        return DB48_DBD24;
    }

    public void setDB48_DBD24(BigDecimal DB48_DBD24) {
        this.DB48_DBD24 = DB48_DBD24;
    }

    public BigDecimal getDB48_DBD28() {
        return DB48_DBD28;
    }

    public void setDB48_DBD28(BigDecimal DB48_DBD28) {
        this.DB48_DBD28 = DB48_DBD28;
    }

    public BigDecimal getDB48_DBD32() {
        return DB48_DBD32;
    }

    public void setDB48_DBD32(BigDecimal DB48_DBD32) {
        this.DB48_DBD32 = DB48_DBD32;
    }

    public BigDecimal getDB48_DBD344() {
        return DB48_DBD344;
    }

    public void setDB48_DBD344(BigDecimal DB48_DBD344) {
        this.DB48_DBD344 = DB48_DBD344;
    }

    public BigDecimal getDB48_DBD348() {
        return DB48_DBD348;
    }

    public void setDB48_DBD348(BigDecimal DB48_DBD348) {
        this.DB48_DBD348 = DB48_DBD348;
    }

    public BigDecimal getDB48_DBD352() {
        return DB48_DBD352;
    }

    public void setDB48_DBD352(BigDecimal DB48_DBD352) {
        this.DB48_DBD352 = DB48_DBD352;
    }

    public BigDecimal getDB48_DBD356() {
        return DB48_DBD356;
    }

    public void setDB48_DBD356(BigDecimal DB48_DBD356) {
        this.DB48_DBD356 = DB48_DBD356;
    }

    public BigDecimal getDB48_DBD36() {
        return DB48_DBD36;
    }

    public void setDB48_DBD36(BigDecimal DB48_DBD36) {
        this.DB48_DBD36 = DB48_DBD36;
    }

    public BigDecimal getDB48_DBD360() {
        return DB48_DBD360;
    }

    public void setDB48_DBD360(BigDecimal DB48_DBD360) {
        this.DB48_DBD360 = DB48_DBD360;
    }

    public BigDecimal getDB48_DBD4() {
        return DB48_DBD4;
    }

    public void setDB48_DBD4(BigDecimal DB48_DBD4) {
        this.DB48_DBD4 = DB48_DBD4;
    }

    public BigDecimal getDB48_DBD40() {
        return DB48_DBD40;
    }

    public void setDB48_DBD40(BigDecimal DB48_DBD40) {
        this.DB48_DBD40 = DB48_DBD40;
    }

    public String getDB48_DBD44() {
        return DB48_DBD44;
    }

    public void setDB48_DBD44(String DB48_DBD44) {
        this.DB48_DBD44 = DB48_DBD44;
    }

    public BigDecimal getDB48_DBD8() {
        return DB48_DBD8;
    }

    public void setDB48_DBD8(BigDecimal DB48_DBD8) {
        this.DB48_DBD8 = DB48_DBD8;
    }

    public String getDB48_DBD86() {
        return DB48_DBD86;
    }

    public void setDB48_DBD86(String DB48_DBD86) {
        this.DB48_DBD86 = DB48_DBD86;
    }

    public Integer getDB48_DBW342() {
        return DB48_DBW342;
    }

    public void setDB48_DBW342(Integer DB48_DBW342) {
        this.DB48_DBW342 = DB48_DBW342;
    }

}
