package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_REOP40")
public class CL_REOP40 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String DB11_BYTE132;
    private BigDecimal DB11_INT130;
    private BigDecimal DB11_REAL10;
    private BigDecimal DB11_REAL100;
    private BigDecimal DB11_REAL104;
    private BigDecimal DB11_REAL108;
    private BigDecimal DB11_REAL114;
    private BigDecimal DB11_REAL118;
    private BigDecimal DB11_REAL122;
    private BigDecimal DB11_REAL126;
    private BigDecimal DB11_REAL14;
    private BigDecimal DB11_REAL24;
    private BigDecimal DB11_REAL28;
    private BigDecimal DB11_REAL32;
    private BigDecimal DB11_REAL36;
    private BigDecimal DB11_REAL40;
    private BigDecimal DB11_REAL44;
    private BigDecimal DB11_REAL48;
    private BigDecimal DB11_REAL52;
    private BigDecimal DB11_REAL56;
    private BigDecimal DB11_REAL60;
    private BigDecimal DB11_REAL64;
    private BigDecimal DB11_REAL68;
    private BigDecimal DB11_REAL72;
    private BigDecimal DB11_REAL76;
    private BigDecimal DB11_REAL80;
    private BigDecimal DB11_REAL84;
    private BigDecimal DB11_REAL88;
    private BigDecimal DB11_REAL92;
    private BigDecimal DB11_REAL96;
    private String DB11_X134_0;
    private String DB11_X134_1;

    private String DB15_CHAR48_40;
    private String DB15_INT0_22;

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }

    public String getDB11_X134_0() {
        return DB11_X134_0;
    }

    public void setDB11_X134_0(String DB11_X134_0) {
        this.DB11_X134_0 = DB11_X134_0;
    }

    public String getDB11_X134_1() {
        return DB11_X134_1;
    }

    public void setDB11_X134_1(String DB11_X134_1) {
        this.DB11_X134_1 = DB11_X134_1;
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



    public String getDB11_BYTE132() {
        return DB11_BYTE132;
    }

    public void setDB11_BYTE132(String DB11_BYTE132) {
        this.DB11_BYTE132 = DB11_BYTE132;
    }

    public BigDecimal getDB11_INT130() {
        return DB11_INT130;
    }

    public void setDB11_INT130(BigDecimal DB11_INT130) {
        this.DB11_INT130 = DB11_INT130;
    }

    public BigDecimal getDB11_REAL10() {
        return DB11_REAL10;
    }

    public void setDB11_REAL10(BigDecimal DB11_REAL10) {
        this.DB11_REAL10 = DB11_REAL10;
    }

    public BigDecimal getDB11_REAL100() {
        return DB11_REAL100;
    }

    public void setDB11_REAL100(BigDecimal DB11_REAL100) {
        this.DB11_REAL100 = DB11_REAL100;
    }

    public BigDecimal getDB11_REAL104() {
        return DB11_REAL104;
    }

    public void setDB11_REAL104(BigDecimal DB11_REAL104) {
        this.DB11_REAL104 = DB11_REAL104;
    }

    public BigDecimal getDB11_REAL108() {
        return DB11_REAL108;
    }

    public void setDB11_REAL108(BigDecimal DB11_REAL108) {
        this.DB11_REAL108 = DB11_REAL108;
    }

    public BigDecimal getDB11_REAL114() {
        return DB11_REAL114;
    }

    public void setDB11_REAL114(BigDecimal DB11_REAL114) {
        this.DB11_REAL114 = DB11_REAL114;
    }

    public BigDecimal getDB11_REAL118() {
        return DB11_REAL118;
    }

    public void setDB11_REAL118(BigDecimal DB11_REAL118) {
        this.DB11_REAL118 = DB11_REAL118;
    }

    public BigDecimal getDB11_REAL122() {
        return DB11_REAL122;
    }

    public void setDB11_REAL122(BigDecimal DB11_REAL122) {
        this.DB11_REAL122 = DB11_REAL122;
    }

    public BigDecimal getDB11_REAL126() {
        return DB11_REAL126;
    }

    public void setDB11_REAL126(BigDecimal DB11_REAL126) {
        this.DB11_REAL126 = DB11_REAL126;
    }

    public BigDecimal getDB11_REAL14() {
        return DB11_REAL14;
    }

    public void setDB11_REAL14(BigDecimal DB11_REAL14) {
        this.DB11_REAL14 = DB11_REAL14;
    }

    public BigDecimal getDB11_REAL24() {
        return DB11_REAL24;
    }

    public void setDB11_REAL24(BigDecimal DB11_REAL24) {
        this.DB11_REAL24 = DB11_REAL24;
    }

    public BigDecimal getDB11_REAL28() {
        return DB11_REAL28;
    }

    public void setDB11_REAL28(BigDecimal DB11_REAL28) {
        this.DB11_REAL28 = DB11_REAL28;
    }

    public BigDecimal getDB11_REAL32() {
        return DB11_REAL32;
    }

    public void setDB11_REAL32(BigDecimal DB11_REAL32) {
        this.DB11_REAL32 = DB11_REAL32;
    }

    public BigDecimal getDB11_REAL36() {
        return DB11_REAL36;
    }

    public void setDB11_REAL36(BigDecimal DB11_REAL36) {
        this.DB11_REAL36 = DB11_REAL36;
    }

    public BigDecimal getDB11_REAL40() {
        return DB11_REAL40;
    }

    public void setDB11_REAL40(BigDecimal DB11_REAL40) {
        this.DB11_REAL40 = DB11_REAL40;
    }

    public BigDecimal getDB11_REAL44() {
        return DB11_REAL44;
    }

    public void setDB11_REAL44(BigDecimal DB11_REAL44) {
        this.DB11_REAL44 = DB11_REAL44;
    }

    public BigDecimal getDB11_REAL48() {
        return DB11_REAL48;
    }

    public void setDB11_REAL48(BigDecimal DB11_REAL48) {
        this.DB11_REAL48 = DB11_REAL48;
    }

    public BigDecimal getDB11_REAL52() {
        return DB11_REAL52;
    }

    public void setDB11_REAL52(BigDecimal DB11_REAL52) {
        this.DB11_REAL52 = DB11_REAL52;
    }

    public BigDecimal getDB11_REAL56() {
        return DB11_REAL56;
    }

    public void setDB11_REAL56(BigDecimal DB11_REAL56) {
        this.DB11_REAL56 = DB11_REAL56;
    }

    public BigDecimal getDB11_REAL60() {
        return DB11_REAL60;
    }

    public void setDB11_REAL60(BigDecimal DB11_REAL60) {
        this.DB11_REAL60 = DB11_REAL60;
    }

    public BigDecimal getDB11_REAL64() {
        return DB11_REAL64;
    }

    public void setDB11_REAL64(BigDecimal DB11_REAL64) {
        this.DB11_REAL64 = DB11_REAL64;
    }

    public BigDecimal getDB11_REAL68() {
        return DB11_REAL68;
    }

    public void setDB11_REAL68(BigDecimal DB11_REAL68) {
        this.DB11_REAL68 = DB11_REAL68;
    }

    public BigDecimal getDB11_REAL72() {
        return DB11_REAL72;
    }

    public void setDB11_REAL72(BigDecimal DB11_REAL72) {
        this.DB11_REAL72 = DB11_REAL72;
    }

    public BigDecimal getDB11_REAL76() {
        return DB11_REAL76;
    }

    public void setDB11_REAL76(BigDecimal DB11_REAL76) {
        this.DB11_REAL76 = DB11_REAL76;
    }

    public BigDecimal getDB11_REAL80() {
        return DB11_REAL80;
    }

    public void setDB11_REAL80(BigDecimal DB11_REAL80) {
        this.DB11_REAL80 = DB11_REAL80;
    }

    public BigDecimal getDB11_REAL84() {
        return DB11_REAL84;
    }

    public void setDB11_REAL84(BigDecimal DB11_REAL84) {
        this.DB11_REAL84 = DB11_REAL84;
    }

    public BigDecimal getDB11_REAL88() {
        return DB11_REAL88;
    }

    public void setDB11_REAL88(BigDecimal DB11_REAL88) {
        this.DB11_REAL88 = DB11_REAL88;
    }

    public BigDecimal getDB11_REAL92() {
        return DB11_REAL92;
    }

    public void setDB11_REAL92(BigDecimal DB11_REAL92) {
        this.DB11_REAL92 = DB11_REAL92;
    }

    public BigDecimal getDB11_REAL96() {
        return DB11_REAL96;
    }

    public void setDB11_REAL96(BigDecimal DB11_REAL96) {
        this.DB11_REAL96 = DB11_REAL96;
    }



    public String getDB15_CHAR48_40() {
        return DB15_CHAR48_40;
    }

    public void setDB15_CHAR48_40(String DB15_CHAR48_40) {
        this.DB15_CHAR48_40 = DB15_CHAR48_40;
    }

    public String getDB15_INT0_22() {
        return DB15_INT0_22;
    }

    public void setDB15_INT0_22(String DB15_INT0_22) {
        this.DB15_INT0_22 = DB15_INT0_22;
    }


}
