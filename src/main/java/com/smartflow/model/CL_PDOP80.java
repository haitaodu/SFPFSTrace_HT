package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_PDOP80")
public class CL_PDOP80 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private BigDecimal DB12_DBD520;
    private BigDecimal DB12_DBD524;
    private BigDecimal DB12_DBW514;
    private BigDecimal DB12_DBW516;
    private BigDecimal DB12_DBW518;
    private BigDecimal DB3_DBD56;
    private BigDecimal DB3_DBD60;

    private String DB4_DBX56_3;
    private String DB4_DBX56_4;
    private String DB4_DBX56_6;
    private String DB4_DBX56_7;
    private String DB4_DBX57_2;
    private String DB4_DBX57_3;

    private BigDecimal DB12_DBW528;
    private BigDecimal DB12_DBD530;
    private BigDecimal DB12_DBD534;
    private String DB12_DBX538_0;

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

    public BigDecimal getDB12_DBD520() {
        return DB12_DBD520;
    }

    public void setDB12_DBD520(BigDecimal DB12_DBD520) {
        this.DB12_DBD520 = DB12_DBD520;
    }

    public BigDecimal getDB12_DBD524() {
        return DB12_DBD524;
    }

    public void setDB12_DBD524(BigDecimal DB12_DBD524) {
        this.DB12_DBD524 = DB12_DBD524;
    }

    public BigDecimal getDB12_DBD530() {
        return DB12_DBD530;
    }

    public void setDB12_DBD530(BigDecimal DB12_DBD530) {
        this.DB12_DBD530 = DB12_DBD530;
    }

    public BigDecimal getDB12_DBD534() {
        return DB12_DBD534;
    }

    public void setDB12_DBD534(BigDecimal DB12_DBD534) {
        this.DB12_DBD534 = DB12_DBD534;
    }

    public BigDecimal getDB12_DBW514() {
        return DB12_DBW514;
    }

    public void setDB12_DBW514(BigDecimal DB12_DBW514) {
        this.DB12_DBW514 = DB12_DBW514;
    }

    public BigDecimal getDB12_DBW516() {
        return DB12_DBW516;
    }

    public void setDB12_DBW516(BigDecimal DB12_DBW516) {
        this.DB12_DBW516 = DB12_DBW516;
    }

    public BigDecimal getDB12_DBW518() {
        return DB12_DBW518;
    }

    public void setDB12_DBW518(BigDecimal DB12_DBW518) {
        this.DB12_DBW518 = DB12_DBW518;
    }

    public BigDecimal getDB12_DBW528() {
        return DB12_DBW528;
    }

    public void setDB12_DBW528(BigDecimal DB12_DBW528) {
        this.DB12_DBW528 = DB12_DBW528;
    }



    public BigDecimal getDB3_DBD56() {
        return DB3_DBD56;
    }

    public void setDB3_DBD56(BigDecimal DB3_DBD56) {
        this.DB3_DBD56 = DB3_DBD56;
    }

    public BigDecimal getDB3_DBD60() {
        return DB3_DBD60;
    }

    public void setDB3_DBD60(BigDecimal DB3_DBD60) {
        this.DB3_DBD60 = DB3_DBD60;
    }


    public String getDB4_DBX56_3() {
        return DB4_DBX56_3;
    }

    public void setDB4_DBX56_3(String DB4_DBX56_3) {
        this.DB4_DBX56_3 = DB4_DBX56_3;
    }

    public String getDB4_DBX56_4() {
        return DB4_DBX56_4;
    }

    public void setDB4_DBX56_4(String DB4_DBX56_4) {
        this.DB4_DBX56_4 = DB4_DBX56_4;
    }

    public String getDB4_DBX56_6() {
        return DB4_DBX56_6;
    }

    public void setDB4_DBX56_6(String DB4_DBX56_6) {
        this.DB4_DBX56_6 = DB4_DBX56_6;
    }

    public String getDB4_DBX56_7() {
        return DB4_DBX56_7;
    }

    public void setDB4_DBX56_7(String DB4_DBX56_7) {
        this.DB4_DBX56_7 = DB4_DBX56_7;
    }

    public String getDB4_DBX57_2() {
        return DB4_DBX57_2;
    }

    public void setDB4_DBX57_2(String DB4_DBX57_2) {
        this.DB4_DBX57_2 = DB4_DBX57_2;
    }

    public String getDB4_DBX57_3() {
        return DB4_DBX57_3;
    }

    public void setDB4_DBX57_3(String DB4_DBX57_3) {
        this.DB4_DBX57_3 = DB4_DBX57_3;
    }

    public String getDB12_DBX538_0() {
        return DB12_DBX538_0;
    }

    public void setDB12_DBX538_0(String DB12_DBX538_0) {
        this.DB12_DBX538_0 = DB12_DBX538_0;
    }
}
