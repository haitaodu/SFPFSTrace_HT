package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_IMOP60")
public class CL_IMOP60 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private BigDecimal DB1670_DBD328;
    private BigDecimal DB1670_DBD60;
    private BigDecimal DB1670_DBW0;
    private BigDecimal DB1670_DBW10;
    private BigDecimal DB1670_DBW12;
    private BigDecimal DB1670_DBW14;
    private BigDecimal DB1670_DBW16;
    private BigDecimal DB1670_DBW18;
    private BigDecimal DB1670_DBW2;
    private BigDecimal DB1670_DBW20;
    private BigDecimal DB1670_DBW22;
    private BigDecimal DB1670_DBW24;
    private BigDecimal DB1670_DBW26;
    private BigDecimal DB1670_DBW28;
    private BigDecimal DB1670_DBW30;
    private BigDecimal DB1670_DBW32;
    private BigDecimal DB1670_DBW34;
    private BigDecimal DB1670_DBW36;
    private BigDecimal DB1670_DBW38;
    private BigDecimal DB1670_DBW4;
    private BigDecimal DB1670_DBW40;
    private BigDecimal DB1670_DBW42;
    private BigDecimal DB1670_DBW44;
    private BigDecimal DB1670_DBW46;
    private BigDecimal DB1670_DBW48;
    private BigDecimal DB1670_DBW50;
    private BigDecimal DB1670_DBW52;
    private BigDecimal DB1670_DBW54;
    private BigDecimal DB1670_DBW56;
    private BigDecimal DB1670_DBW6;
    private BigDecimal DB1670_DBW64;
    private BigDecimal DB1670_DBW68;
    private BigDecimal DB1670_DBW70;
    private BigDecimal DB1670_DBW8;
    private String DB1670_DBX328_0;
    private String DB1670_DBX58_6;
    private String DB1670_DBX58_7;
    private String DB1670_DBX72_0;
    private String IS_OK;

    public String getDB1670_DBX328_0() {
        return DB1670_DBX328_0;
    }

    public void setDB1670_DBX328_0(String DB1670_DBX328_0) {
        this.DB1670_DBX328_0 = DB1670_DBX328_0;
    }

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

    public BigDecimal getDB1670_DBD328() {
        return DB1670_DBD328;
    }

    public void setDB1670_DBD328(BigDecimal DB1670_DBD328) {
        this.DB1670_DBD328 = DB1670_DBD328;
    }

    public BigDecimal getDB1670_DBD60() {
        return DB1670_DBD60;
    }

    public void setDB1670_DBD60(BigDecimal DB1670_DBD60) {
        this.DB1670_DBD60 = DB1670_DBD60;
    }

    public BigDecimal getDB1670_DBW0() {
        return DB1670_DBW0;
    }

    public void setDB1670_DBW0(BigDecimal DB1670_DBW0) {
        this.DB1670_DBW0 = DB1670_DBW0;
    }

    public BigDecimal getDB1670_DBW10() {
        return DB1670_DBW10;
    }

    public void setDB1670_DBW10(BigDecimal DB1670_DBW10) {
        this.DB1670_DBW10 = DB1670_DBW10;
    }

    public BigDecimal getDB1670_DBW12() {
        return DB1670_DBW12;
    }

    public void setDB1670_DBW12(BigDecimal DB1670_DBW12) {
        this.DB1670_DBW12 = DB1670_DBW12;
    }

    public BigDecimal getDB1670_DBW14() {
        return DB1670_DBW14;
    }

    public void setDB1670_DBW14(BigDecimal DB1670_DBW14) {
        this.DB1670_DBW14 = DB1670_DBW14;
    }

    public BigDecimal getDB1670_DBW16() {
        return DB1670_DBW16;
    }

    public void setDB1670_DBW16(BigDecimal DB1670_DBW16) {
        this.DB1670_DBW16 = DB1670_DBW16;
    }

    public BigDecimal getDB1670_DBW18() {
        return DB1670_DBW18;
    }

    public void setDB1670_DBW18(BigDecimal DB1670_DBW18) {
        this.DB1670_DBW18 = DB1670_DBW18;
    }

    public BigDecimal getDB1670_DBW2() {
        return DB1670_DBW2;
    }

    public void setDB1670_DBW2(BigDecimal DB1670_DBW2) {
        this.DB1670_DBW2 = DB1670_DBW2;
    }

    public BigDecimal getDB1670_DBW20() {
        return DB1670_DBW20;
    }

    public void setDB1670_DBW20(BigDecimal DB1670_DBW20) {
        this.DB1670_DBW20 = DB1670_DBW20;
    }

    public BigDecimal getDB1670_DBW22() {
        return DB1670_DBW22;
    }

    public void setDB1670_DBW22(BigDecimal DB1670_DBW22) {
        this.DB1670_DBW22 = DB1670_DBW22;
    }

    public BigDecimal getDB1670_DBW24() {
        return DB1670_DBW24;
    }

    public void setDB1670_DBW24(BigDecimal DB1670_DBW24) {
        this.DB1670_DBW24 = DB1670_DBW24;
    }

    public BigDecimal getDB1670_DBW26() {
        return DB1670_DBW26;
    }

    public void setDB1670_DBW26(BigDecimal DB1670_DBW26) {
        this.DB1670_DBW26 = DB1670_DBW26;
    }

    public BigDecimal getDB1670_DBW28() {
        return DB1670_DBW28;
    }

    public void setDB1670_DBW28(BigDecimal DB1670_DBW28) {
        this.DB1670_DBW28 = DB1670_DBW28;
    }

    public BigDecimal getDB1670_DBW30() {
        return DB1670_DBW30;
    }

    public void setDB1670_DBW30(BigDecimal DB1670_DBW30) {
        this.DB1670_DBW30 = DB1670_DBW30;
    }

    public BigDecimal getDB1670_DBW32() {
        return DB1670_DBW32;
    }

    public void setDB1670_DBW32(BigDecimal DB1670_DBW32) {
        this.DB1670_DBW32 = DB1670_DBW32;
    }

    public BigDecimal getDB1670_DBW34() {
        return DB1670_DBW34;
    }

    public void setDB1670_DBW34(BigDecimal DB1670_DBW34) {
        this.DB1670_DBW34 = DB1670_DBW34;
    }

    public BigDecimal getDB1670_DBW36() {
        return DB1670_DBW36;
    }

    public void setDB1670_DBW36(BigDecimal DB1670_DBW36) {
        this.DB1670_DBW36 = DB1670_DBW36;
    }

    public BigDecimal getDB1670_DBW38() {
        return DB1670_DBW38;
    }

    public void setDB1670_DBW38(BigDecimal DB1670_DBW38) {
        this.DB1670_DBW38 = DB1670_DBW38;
    }

    public BigDecimal getDB1670_DBW4() {
        return DB1670_DBW4;
    }

    public void setDB1670_DBW4(BigDecimal DB1670_DBW4) {
        this.DB1670_DBW4 = DB1670_DBW4;
    }

    public BigDecimal getDB1670_DBW40() {
        return DB1670_DBW40;
    }

    public void setDB1670_DBW40(BigDecimal DB1670_DBW40) {
        this.DB1670_DBW40 = DB1670_DBW40;
    }

    public BigDecimal getDB1670_DBW42() {
        return DB1670_DBW42;
    }

    public void setDB1670_DBW42(BigDecimal DB1670_DBW42) {
        this.DB1670_DBW42 = DB1670_DBW42;
    }

    public BigDecimal getDB1670_DBW44() {
        return DB1670_DBW44;
    }

    public void setDB1670_DBW44(BigDecimal DB1670_DBW44) {
        this.DB1670_DBW44 = DB1670_DBW44;
    }

    public BigDecimal getDB1670_DBW46() {
        return DB1670_DBW46;
    }

    public void setDB1670_DBW46(BigDecimal DB1670_DBW46) {
        this.DB1670_DBW46 = DB1670_DBW46;
    }

    public BigDecimal getDB1670_DBW48() {
        return DB1670_DBW48;
    }

    public void setDB1670_DBW48(BigDecimal DB1670_DBW48) {
        this.DB1670_DBW48 = DB1670_DBW48;
    }

    public BigDecimal getDB1670_DBW50() {
        return DB1670_DBW50;
    }

    public void setDB1670_DBW50(BigDecimal DB1670_DBW50) {
        this.DB1670_DBW50 = DB1670_DBW50;
    }

    public BigDecimal getDB1670_DBW52() {
        return DB1670_DBW52;
    }

    public void setDB1670_DBW52(BigDecimal DB1670_DBW52) {
        this.DB1670_DBW52 = DB1670_DBW52;
    }

    public BigDecimal getDB1670_DBW54() {
        return DB1670_DBW54;
    }

    public void setDB1670_DBW54(BigDecimal DB1670_DBW54) {
        this.DB1670_DBW54 = DB1670_DBW54;
    }

    public BigDecimal getDB1670_DBW56() {
        return DB1670_DBW56;
    }

    public void setDB1670_DBW56(BigDecimal DB1670_DBW56) {
        this.DB1670_DBW56 = DB1670_DBW56;
    }

    public BigDecimal getDB1670_DBW6() {
        return DB1670_DBW6;
    }

    public void setDB1670_DBW6(BigDecimal DB1670_DBW6) {
        this.DB1670_DBW6 = DB1670_DBW6;
    }

    public BigDecimal getDB1670_DBW64() {
        return DB1670_DBW64;
    }

    public void setDB1670_DBW64(BigDecimal DB1670_DBW64) {
        this.DB1670_DBW64 = DB1670_DBW64;
    }

    public BigDecimal getDB1670_DBW68() {
        return DB1670_DBW68;
    }

    public void setDB1670_DBW68(BigDecimal DB1670_DBW68) {
        this.DB1670_DBW68 = DB1670_DBW68;
    }

    public BigDecimal getDB1670_DBW70() {
        return DB1670_DBW70;
    }

    public void setDB1670_DBW70(BigDecimal DB1670_DBW70) {
        this.DB1670_DBW70 = DB1670_DBW70;
    }

    public BigDecimal getDB1670_DBW8() {
        return DB1670_DBW8;
    }

    public void setDB1670_DBW8(BigDecimal DB1670_DBW8) {
        this.DB1670_DBW8 = DB1670_DBW8;
    }


    public String getDB1670_DBX58_6() {
        return DB1670_DBX58_6;
    }

    public void setDB1670_DBX58_6(String DB1670_DBX58_6) {
        this.DB1670_DBX58_6 = DB1670_DBX58_6;
    }

    public String getDB1670_DBX58_7() {
        return DB1670_DBX58_7;
    }

    public void setDB1670_DBX58_7(String DB1670_DBX58_7) {
        this.DB1670_DBX58_7 = DB1670_DBX58_7;
    }


    public String getDB1670_DBX72_0() {
        return DB1670_DBX72_0;
    }

    public void setDB1670_DBX72_0(String DB1670_DBX72_0) {
        this.DB1670_DBX72_0 = DB1670_DBX72_0;
    }




}
