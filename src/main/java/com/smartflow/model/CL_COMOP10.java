package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_COMOP10")
public class CL_COMOP10 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private BigDecimal DB13_DBD932;
    private BigDecimal DB13_DBD936;
    private BigDecimal DB13_DBD940;
    private String DB1_DBX57_0;
    private String DB1_DBX57_1;
    private BigDecimal MW600;
    private BigDecimal MW602;
    private BigDecimal MW604;
    private String DB13_DBX676_0;
    private String DB13_DBX718_0;
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

    public BigDecimal getDB13_DBD932() {
        return DB13_DBD932;
    }

    public void setDB13_DBD932(BigDecimal DB13_DBD932) {
        this.DB13_DBD932 = DB13_DBD932;
    }

    public BigDecimal getDB13_DBD936() {
        return DB13_DBD936;
    }

    public void setDB13_DBD936(BigDecimal DB13_DBD936) {
        this.DB13_DBD936 = DB13_DBD936;
    }

    public BigDecimal getDB13_DBD940() {
        return DB13_DBD940;
    }

    public void setDB13_DBD940(BigDecimal DB13_DBD940) {
        this.DB13_DBD940 = DB13_DBD940;
    }

    public String getDB1_DBX57_0() {
        return DB1_DBX57_0;
    }

    public void setDB1_DBX57_0(String DB1_DBX57_0) {
        this.DB1_DBX57_0 = DB1_DBX57_0;
    }

    public String getDB1_DBX57_1() {
        return DB1_DBX57_1;
    }

    public void setDB1_DBX57_1(String DB1_DBX57_1) {
        this.DB1_DBX57_1 = DB1_DBX57_1;
    }

    public BigDecimal getMW600() {
        return MW600;
    }

    public void setMW600(BigDecimal MW600) {
        this.MW600 = MW600;
    }

    public BigDecimal getMW602() {
        return MW602;
    }

    public void setMW602(BigDecimal MW602) {
        this.MW602 = MW602;
    }

    public BigDecimal getMW604() {
        return MW604;
    }

    public void setMW604(BigDecimal MW604) {
        this.MW604 = MW604;
    }

    public String getDB13_DBX676_0() {
        return DB13_DBX676_0;
    }

    public void setDB13_DBX676_0(String DB13_DBX676_0) {
        this.DB13_DBX676_0 = DB13_DBX676_0;
    }

    public String getDB13_DBX718_0() {
        return DB13_DBX718_0;
    }

    public void setDB13_DBX718_0(String DB13_DBX718_0) {
        this.DB13_DBX718_0 = DB13_DBX718_0;
    }

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }
}
