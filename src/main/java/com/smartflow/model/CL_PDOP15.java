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
 * @date ：Created in 2020/8/6 11:28
 */

@Entity
@Table(name = "CL_PDOP15", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_PDOP15 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private java.util.Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String DB2000_DB12;
    private String DB2000_DB552;
    private BigDecimal DB2000_DB40;
    private BigDecimal DB2000_DBD44;
    private BigDecimal DB2000_DBD48;
    private BigDecimal DB2000_DBD52;
    private BigDecimal DB2000_DBD56;
    private BigDecimal DB2000_DBD60;
    private BigDecimal DB2000_DBD64;
    private BigDecimal DB2000_DBD68;
    private BigDecimal DB2000_DBD72;
    private BigDecimal DB2000_DBD76;
    private BigDecimal DB2000_DBD80;
    private BigDecimal DB2000_DBD84;
    private BigDecimal DB2000_DBW2;

    public String getDB2000_DB12() {
        return DB2000_DB12;
    }

    public void setDB2000_DB12(String DB2000_DB12) {
        this.DB2000_DB12 = DB2000_DB12;
    }

    public BigDecimal getDB2000_DB40() {
        return DB2000_DB40;
    }

    public void setDB2000_DB40(BigDecimal DB2000_DB40) {
        this.DB2000_DB40 = DB2000_DB40;
    }

    public String getDB2000_DB552() {
        return DB2000_DB552;
    }

    public void setDB2000_DB552(String DB2000_DB552) {
        this.DB2000_DB552 = DB2000_DB552;
    }

    public BigDecimal getDB2000_DBD44() {
        return DB2000_DBD44;
    }

    public void setDB2000_DBD44(BigDecimal DB2000_DBD44) {
        this.DB2000_DBD44 = DB2000_DBD44;
    }

    public BigDecimal getDB2000_DBD48() {
        return DB2000_DBD48;
    }

    public void setDB2000_DBD48(BigDecimal DB2000_DBD48) {
        this.DB2000_DBD48 = DB2000_DBD48;
    }

    public BigDecimal getDB2000_DBD52() {
        return DB2000_DBD52;
    }

    public void setDB2000_DBD52(BigDecimal DB2000_DBD52) {
        this.DB2000_DBD52 = DB2000_DBD52;
    }

    public BigDecimal getDB2000_DBD56() {
        return DB2000_DBD56;
    }

    public void setDB2000_DBD56(BigDecimal DB2000_DBD56) {
        this.DB2000_DBD56 = DB2000_DBD56;
    }

    public BigDecimal getDB2000_DBD60() {
        return DB2000_DBD60;
    }

    public void setDB2000_DBD60(BigDecimal DB2000_DBD60) {
        this.DB2000_DBD60 = DB2000_DBD60;
    }

    public BigDecimal getDB2000_DBD64() {
        return DB2000_DBD64;
    }

    public void setDB2000_DBD64(BigDecimal DB2000_DBD64) {
        this.DB2000_DBD64 = DB2000_DBD64;
    }

    public BigDecimal getDB2000_DBD68() {
        return DB2000_DBD68;
    }

    public void setDB2000_DBD68(BigDecimal DB2000_DBD68) {
        this.DB2000_DBD68 = DB2000_DBD68;
    }

    public BigDecimal getDB2000_DBD72() {
        return DB2000_DBD72;
    }

    public void setDB2000_DBD72(BigDecimal DB2000_DBD72) {
        this.DB2000_DBD72 = DB2000_DBD72;
    }

    public BigDecimal getDB2000_DBD76() {
        return DB2000_DBD76;
    }

    public void setDB2000_DBD76(BigDecimal DB2000_DBD76) {
        this.DB2000_DBD76 = DB2000_DBD76;
    }

    public BigDecimal getDB2000_DBD80() {
        return DB2000_DBD80;
    }

    public void setDB2000_DBD80(BigDecimal DB2000_DBD80) {
        this.DB2000_DBD80 = DB2000_DBD80;
    }

    public BigDecimal getDB2000_DBD84() {
        return DB2000_DBD84;
    }

    public void setDB2000_DBD84(BigDecimal DB2000_DBD84) {
        this.DB2000_DBD84 = DB2000_DBD84;
    }

    public BigDecimal getDB2000_DBW2() {
        return DB2000_DBW2;
    }

    public void setDB2000_DBW2(BigDecimal DB2000_DBW2) {
        this.DB2000_DBW2 = DB2000_DBW2;
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

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }


}
