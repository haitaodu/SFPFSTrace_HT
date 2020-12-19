package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_TCOP10")
public class CL_TCOP10 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String DB407_DBX60_3;
    private String DB407_DBX60_4;
    private String DB407_DBX60_5;
    private String DB407_DBX60_6;
    private String DB407_DBX60_7;
    private String DB407_DBX61_0;
    private BigDecimal DB9_DBW1560;
    private BigDecimal DB9_DBW1562;
    private BigDecimal DB9_DBW1564;
    private BigDecimal DB9_DBW1566;
    private String DB9_DBX586_0;
    private String DB9_DBX628_0;
    private String DB9_DBX670_0;
    private String DB9_DBX712_0;
    private String DB9_DBX754_0;
    private String DB9_DBX796_0;
    private String DB9_DBX838_0;
    private String DB9_DBX880_0;
    private Integer DB9_DBW1568;
    private Integer DB9_DBW1570;
    private String DB9_DBX922_0;
    private String DB9_DBX964_0;
    private String DB9_DBX1006_0;
    private String DB9_DBX1048_0;

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

    public String getDB407_DBX60_3() {
        return DB407_DBX60_3;
    }

    public void setDB407_DBX60_3(String DB407_DBX60_3) {
        this.DB407_DBX60_3 = DB407_DBX60_3;
    }

    public String getDB407_DBX60_4() {
        return DB407_DBX60_4;
    }

    public void setDB407_DBX60_4(String DB407_DBX60_4) {
        this.DB407_DBX60_4 = DB407_DBX60_4;
    }

    public String getDB407_DBX60_5() {
        return DB407_DBX60_5;
    }

    public void setDB407_DBX60_5(String DB407_DBX60_5) {
        this.DB407_DBX60_5 = DB407_DBX60_5;
    }

    public String getDB407_DBX60_6() {
        return DB407_DBX60_6;
    }

    public void setDB407_DBX60_6(String DB407_DBX60_6) {
        this.DB407_DBX60_6 = DB407_DBX60_6;
    }

    public String getDB407_DBX60_7() {
        return DB407_DBX60_7;
    }

    public void setDB407_DBX60_7(String DB407_DBX60_7) {
        this.DB407_DBX60_7 = DB407_DBX60_7;
    }

    public String getDB407_DBX61_0() {
        return DB407_DBX61_0;
    }

    public void setDB407_DBX61_0(String DB407_DBX61_0) {
        this.DB407_DBX61_0 = DB407_DBX61_0;
    }

    public BigDecimal getDB9_DBW1560() {
        return DB9_DBW1560;
    }

    public void setDB9_DBW1560(BigDecimal DB9_DBW1560) {
        this.DB9_DBW1560 = DB9_DBW1560;
    }

    public BigDecimal getDB9_DBW1562() {
        return DB9_DBW1562;
    }

    public void setDB9_DBW1562(BigDecimal DB9_DBW1562) {
        this.DB9_DBW1562 = DB9_DBW1562;
    }

    public BigDecimal getDB9_DBW1564() {
        return DB9_DBW1564;
    }

    public void setDB9_DBW1564(BigDecimal DB9_DBW1564) {
        this.DB9_DBW1564 = DB9_DBW1564;
    }

    public BigDecimal getDB9_DBW1566() {
        return DB9_DBW1566;
    }

    public void setDB9_DBW1566(BigDecimal DB9_DBW1566) {
        this.DB9_DBW1566 = DB9_DBW1566;
    }

    public String getDB9_DBX586_0() {
        return DB9_DBX586_0;
    }

    public void setDB9_DBX586_0(String DB9_DBX586_0) {
        this.DB9_DBX586_0 = DB9_DBX586_0;
    }

    public String getDB9_DBX628_0() {
        return DB9_DBX628_0;
    }

    public void setDB9_DBX628_0(String DB9_DBX628_0) {
        this.DB9_DBX628_0 = DB9_DBX628_0;
    }

    public String getDB9_DBX670_0() {
        return DB9_DBX670_0;
    }

    public void setDB9_DBX670_0(String DB9_DBX670_0) {
        this.DB9_DBX670_0 = DB9_DBX670_0;
    }

    public String getDB9_DBX712_0() {
        return DB9_DBX712_0;
    }

    public void setDB9_DBX712_0(String DB9_DBX712_0) {
        this.DB9_DBX712_0 = DB9_DBX712_0;
    }

    public String getDB9_DBX754_0() {
        return DB9_DBX754_0;
    }

    public void setDB9_DBX754_0(String DB9_DBX754_0) {
        this.DB9_DBX754_0 = DB9_DBX754_0;
    }

    public String getDB9_DBX796_0() {
        return DB9_DBX796_0;
    }

    public void setDB9_DBX796_0(String DB9_DBX796_0) {
        this.DB9_DBX796_0 = DB9_DBX796_0;
    }

    public String getDB9_DBX838_0() {
        return DB9_DBX838_0;
    }

    public void setDB9_DBX838_0(String DB9_DBX838_0) {
        this.DB9_DBX838_0 = DB9_DBX838_0;
    }

    public String getDB9_DBX880_0() {
        return DB9_DBX880_0;
    }

    public void setDB9_DBX880_0(String DB9_DBX880_0) {
        this.DB9_DBX880_0 = DB9_DBX880_0;
    }

    public Integer getDB9_DBW1568() {
        return DB9_DBW1568;
    }

    public void setDB9_DBW1568(Integer DB9_DBW1568) {
        this.DB9_DBW1568 = DB9_DBW1568;
    }

    public Integer getDB9_DBW1570() {
        return DB9_DBW1570;
    }

    public void setDB9_DBW1570(Integer DB9_DBW1570) {
        this.DB9_DBW1570 = DB9_DBW1570;
    }

    public String getDB9_DBX922_0() {
        return DB9_DBX922_0;
    }

    public void setDB9_DBX922_0(String DB9_DBX922_0) {
        this.DB9_DBX922_0 = DB9_DBX922_0;
    }

    public String getDB9_DBX964_0() {
        return DB9_DBX964_0;
    }

    public void setDB9_DBX964_0(String DB9_DBX964_0) {
        this.DB9_DBX964_0 = DB9_DBX964_0;
    }

    public String getDB9_DBX1006_0() {
        return DB9_DBX1006_0;
    }

    public void setDB9_DBX1006_0(String DB9_DBX1006_0) {
        this.DB9_DBX1006_0 = DB9_DBX1006_0;
    }

    public String getDB9_DBX1048_0() {
        return DB9_DBX1048_0;
    }

    public void setDB9_DBX1048_0(String DB9_DBX1048_0) {
        this.DB9_DBX1048_0 = DB9_DBX1048_0;
    }
}
