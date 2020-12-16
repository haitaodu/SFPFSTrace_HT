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
 * @date ：Created in 2020/8/24 14:27
 */

@Entity
@Table(name = "core.CL_PDOP30")
public class CL_PDOP30 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_SYNCH;
    private BigDecimal DB167_DBD0;
    private BigDecimal DB167_DBD12;
    private BigDecimal DB167_DBD16;
    private Integer DB167_DBD20;
    private Integer DB167_DBD24;
    private String DB167_DBD28;
    private String DB167_DBD284;
    private String DB167_DBD326;
    private BigDecimal DB167_DBD4;
    private BigDecimal DB167_DBD8;
    private String IS_OK;

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

    public String getIS_SYNCH() {
        return IS_SYNCH;
    }

    public void setIS_SYNCH(String IS_SYNCH) {
        this.IS_SYNCH = IS_SYNCH;
    }

    public BigDecimal getDB167_DBD0() {
        return DB167_DBD0;
    }

    public void setDB167_DBD0(BigDecimal DB167_DBD0) {
        this.DB167_DBD0 = DB167_DBD0;
    }

    public BigDecimal getDB167_DBD12() {
        return DB167_DBD12;
    }

    public void setDB167_DBD12(BigDecimal DB167_DBD12) {
        this.DB167_DBD12 = DB167_DBD12;
    }

    public BigDecimal getDB167_DBD16() {
        return DB167_DBD16;
    }

    public void setDB167_DBD16(BigDecimal DB167_DBD16) {
        this.DB167_DBD16 = DB167_DBD16;
    }

    public Integer getDB167_DBD20() {
        return DB167_DBD20;
    }

    public void setDB167_DBD20(Integer DB167_DBD20) {
        this.DB167_DBD20 = DB167_DBD20;
    }

    public Integer getDB167_DBD24() {
        return DB167_DBD24;
    }

    public void setDB167_DBD24(Integer DB167_DBD24) {
        this.DB167_DBD24 = DB167_DBD24;
    }

    public String getDB167_DBD28() {
        return DB167_DBD28;
    }

    public void setDB167_DBD28(String DB167_DBD28) {
        this.DB167_DBD28 = DB167_DBD28;
    }

    public String getDB167_DBD284() {
        return DB167_DBD284;
    }

    public void setDB167_DBD284(String DB167_DBD284) {
        this.DB167_DBD284 = DB167_DBD284;
    }

    public String getDB167_DBD326() {
        return DB167_DBD326;
    }

    public void setDB167_DBD326(String DB167_DBD326) {
        this.DB167_DBD326 = DB167_DBD326;
    }



    public BigDecimal getDB167_DBD4() {
        return DB167_DBD4;
    }

    public void setDB167_DBD4(BigDecimal DB167_DBD4) {
        this.DB167_DBD4 = DB167_DBD4;
    }

    public BigDecimal getDB167_DBD8() {
        return DB167_DBD8;
    }

    public void setDB167_DBD8(BigDecimal DB167_DBD8) {
        this.DB167_DBD8 = DB167_DBD8;
    }


    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }
}
