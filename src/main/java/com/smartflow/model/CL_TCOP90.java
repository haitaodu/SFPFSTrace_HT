package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_TCOP90")
public class CL_TCOP90 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String DB500_DB332;
    private String DB500_DB642;
    private String DB500_DB682;
    private String DB500_DB76;
    private String DB500_DB986;
    private BigDecimal DB500_DBD32;
    private BigDecimal DB500_DBD36;
    private BigDecimal DB500_DBD40;
    private BigDecimal DB500_DBD44;
    private BigDecimal DB500_DBD48;
    private BigDecimal DB500_DBD52;
    private BigDecimal DB500_DBD56;
    private BigDecimal DB500_DBD588;
    private BigDecimal DB500_DBD592;
    private BigDecimal DB500_DBD596;
    private BigDecimal DB500_DBD60;
    private BigDecimal DB500_DBD600;
    private BigDecimal DB500_DBD604;
    private BigDecimal DB500_DBD608;
    private BigDecimal DB500_DBD612;
    private BigDecimal DB500_DBD616;
    private BigDecimal DB500_DBD938;
    private BigDecimal DB500_DBD942;
    private BigDecimal DB500_DBD946;
    private BigDecimal DB500_DBD950;
    private BigDecimal DB500_DBD954;
    private BigDecimal DB500_DBW958;
    private BigDecimal DB500_DBW960;
    private BigDecimal DB500_DBW1028;
    private BigDecimal DB500_DBW1030;

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

    public String getDB500_DB332() {
        return DB500_DB332;
    }

    public void setDB500_DB332(String DB500_DB332) {
        this.DB500_DB332 = DB500_DB332;
    }

    public String getDB500_DB642() {
        return DB500_DB642;
    }

    public void setDB500_DB642(String DB500_DB642) {
        this.DB500_DB642 = DB500_DB642;
    }

    public String getDB500_DB682() {
        return DB500_DB682;
    }

    public void setDB500_DB682(String DB500_DB682) {
        this.DB500_DB682 = DB500_DB682;
    }

    public String getDB500_DB76() {
        return DB500_DB76;
    }

    public void setDB500_DB76(String DB500_DB76) {
        this.DB500_DB76 = DB500_DB76;
    }

    public String getDB500_DB986() {
        return DB500_DB986;
    }

    public void setDB500_DB986(String DB500_DB986) {
        this.DB500_DB986 = DB500_DB986;
    }

    public BigDecimal getDB500_DBD32() {
        return DB500_DBD32;
    }

    public void setDB500_DBD32(BigDecimal DB500_DBD32) {
        this.DB500_DBD32 = DB500_DBD32;
    }

    public BigDecimal getDB500_DBD36() {
        return DB500_DBD36;
    }

    public void setDB500_DBD36(BigDecimal DB500_DBD36) {
        this.DB500_DBD36 = DB500_DBD36;
    }

    public BigDecimal getDB500_DBD40() {
        return DB500_DBD40;
    }

    public void setDB500_DBD40(BigDecimal DB500_DBD40) {
        this.DB500_DBD40 = DB500_DBD40;
    }

    public BigDecimal getDB500_DBD44() {
        return DB500_DBD44;
    }

    public void setDB500_DBD44(BigDecimal DB500_DBD44) {
        this.DB500_DBD44 = DB500_DBD44;
    }

    public BigDecimal getDB500_DBD48() {
        return DB500_DBD48;
    }

    public void setDB500_DBD48(BigDecimal DB500_DBD48) {
        this.DB500_DBD48 = DB500_DBD48;
    }

    public BigDecimal getDB500_DBD52() {
        return DB500_DBD52;
    }

    public void setDB500_DBD52(BigDecimal DB500_DBD52) {
        this.DB500_DBD52 = DB500_DBD52;
    }

    public BigDecimal getDB500_DBD56() {
        return DB500_DBD56;
    }

    public void setDB500_DBD56(BigDecimal DB500_DBD56) {
        this.DB500_DBD56 = DB500_DBD56;
    }

    public BigDecimal getDB500_DBD588() {
        return DB500_DBD588;
    }

    public void setDB500_DBD588(BigDecimal DB500_DBD588) {
        this.DB500_DBD588 = DB500_DBD588;
    }

    public BigDecimal getDB500_DBD592() {
        return DB500_DBD592;
    }

    public void setDB500_DBD592(BigDecimal DB500_DBD592) {
        this.DB500_DBD592 = DB500_DBD592;
    }

    public BigDecimal getDB500_DBD596() {
        return DB500_DBD596;
    }

    public void setDB500_DBD596(BigDecimal DB500_DBD596) {
        this.DB500_DBD596 = DB500_DBD596;
    }

    public BigDecimal getDB500_DBD60() {
        return DB500_DBD60;
    }

    public void setDB500_DBD60(BigDecimal DB500_DBD60) {
        this.DB500_DBD60 = DB500_DBD60;
    }

    public BigDecimal getDB500_DBD600() {
        return DB500_DBD600;
    }

    public void setDB500_DBD600(BigDecimal DB500_DBD600) {
        this.DB500_DBD600 = DB500_DBD600;
    }

    public BigDecimal getDB500_DBD604() {
        return DB500_DBD604;
    }

    public void setDB500_DBD604(BigDecimal DB500_DBD604) {
        this.DB500_DBD604 = DB500_DBD604;
    }

    public BigDecimal getDB500_DBD608() {
        return DB500_DBD608;
    }

    public void setDB500_DBD608(BigDecimal DB500_DBD608) {
        this.DB500_DBD608 = DB500_DBD608;
    }

    public BigDecimal getDB500_DBD612() {
        return DB500_DBD612;
    }

    public void setDB500_DBD612(BigDecimal DB500_DBD612) {
        this.DB500_DBD612 = DB500_DBD612;
    }

    public BigDecimal getDB500_DBD616() {
        return DB500_DBD616;
    }

    public void setDB500_DBD616(BigDecimal DB500_DBD616) {
        this.DB500_DBD616 = DB500_DBD616;
    }

    public BigDecimal getDB500_DBD938() {
        return DB500_DBD938;
    }

    public void setDB500_DBD938(BigDecimal DB500_DBD938) {
        this.DB500_DBD938 = DB500_DBD938;
    }

    public BigDecimal getDB500_DBD942() {
        return DB500_DBD942;
    }

    public void setDB500_DBD942(BigDecimal DB500_DBD942) {
        this.DB500_DBD942 = DB500_DBD942;
    }

    public BigDecimal getDB500_DBD946() {
        return DB500_DBD946;
    }

    public void setDB500_DBD946(BigDecimal DB500_DBD946) {
        this.DB500_DBD946 = DB500_DBD946;
    }

    public BigDecimal getDB500_DBD950() {
        return DB500_DBD950;
    }

    public void setDB500_DBD950(BigDecimal DB500_DBD950) {
        this.DB500_DBD950 = DB500_DBD950;
    }

    public BigDecimal getDB500_DBD954() {
        return DB500_DBD954;
    }

    public void setDB500_DBD954(BigDecimal DB500_DBD954) {
        this.DB500_DBD954 = DB500_DBD954;
    }

    public BigDecimal getDB500_DBW958() {
        return DB500_DBW958;
    }

    public void setDB500_DBW958(BigDecimal DB500_DBW958) {
        this.DB500_DBW958 = DB500_DBW958;
    }

    public BigDecimal getDB500_DBW960() {
        return DB500_DBW960;
    }

    public void setDB500_DBW960(BigDecimal DB500_DBW960) {
        this.DB500_DBW960 = DB500_DBW960;
    }

    public BigDecimal getDB500_DBW1028() {
        return DB500_DBW1028;
    }

    public void setDB500_DBW1028(BigDecimal DB500_DBW1028) {
        this.DB500_DBW1028 = DB500_DBW1028;
    }

    public BigDecimal getDB500_DBW1030() {
        return DB500_DBW1030;
    }

    public void setDB500_DBW1030(BigDecimal DB500_DBW1030) {
        this.DB500_DBW1030 = DB500_DBW1030;
    }
}
