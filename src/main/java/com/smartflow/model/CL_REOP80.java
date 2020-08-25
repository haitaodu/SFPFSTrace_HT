package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_REOP80")
public class CL_REOP80 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private BigDecimal MES_CUT1_ANGLE1;
    private BigDecimal MES_CUT1_ANGLE2;
    private BigDecimal MES_CUT1_WEIGHT;
    private BigDecimal MES_CUT_NUM;
    private String MES_EM16600_0;
    private String MES_EM16600_1;
    private String MES_EM16600_10;
    private String MES_EM16600_11;
    private String MES_EM16600_12;
    private String MES_EM16600_13;
    private String MES_EM16600_14;
    private String MES_EM16600_15;
    private String MES_EM16600_2;
    private String MES_EM16600_3;
    private String MES_EM16600_4;
    private String MES_EM16600_5;
    private String MES_EM16600_6;
    private String MES_EM16600_7;
    private String MES_EM16600_9;
    private String MES_EM16601_0;
    private String MES_EM16601_1;
    private String MES_EM16601_10;
    private String MES_EM16601_11;
    private String MES_EM16601_12;
    private String MES_EM16601_2;
    private String MES_EM16601_3;
    private String MES_EM16601_4;
    private String MES_EM16601_5;
    private String MES_EM16601_6;
    private String MES_EM16601_7;
    private String MES_EM16601_8;
    private String MES_EM16601_9;
    private String MES_EM16602_0;
    private String MES_EM16602_1;
    private String MES_EM16602_2;
    private String MES_EM16602_3;
    private String MES_EM16602_4;
    private String MES_EM16602_5;
    private String MES_EM16602_6;
    private String MES_EM16602_7;
    private String MES_EM16602_8;
    private String MES_EM16602_9;
    private String MES_EM16603_0;
    private String MES_EM16603_2;
    private String MES_EM16603_3;
    private String MES_EM16603_4;
    private String MES_EM16603_5;
    private String MES_EM16603_6;
    private String MES_EM16603_7;
    private String MES_EM16603_8;
    private String MES_EM16603_9;
    private String MES_EM16604_0;
    private String MES_EM16604_1;
    private String MES_EM16604_10;
    private String MES_EM16604_2;
    private String MES_EM16604_3;
    private String MES_EM16604_4;
    private String MES_EM16604_5;
    private String MES_EM16604_6;
    private String MES_EM16604_7;
    private String MES_EM16604_8;
    private String MES_EM16604_9;
    private String MES_EM16605_0;
    private String MES_EM16605_1;
    private String MES_EM16605_2;
    private String MES_EM16605_3;
    private String MES_EM16605_4;
    private String MES_EM16605_5;
    private String MES_EM16605_6;
    private String MES_EM16605_7;
    private String MES_EM16605_8;
    private String MES_EM16606_0;
    private String MES_EM16606_1;
    private String MES_EM16606_2;
    private String MES_EM16606_3;
    private String MES_EM16606_4;
    private String MES_EM16606_5;
    private String MES_EM16606_6;
    private String MES_EM16606_7;
    private String MES_EM16607_0;
    private String MES_EM16607_1;
    private String MES_EM16607_10;
    private String MES_EM16607_11;
    private String MES_EM16607_12;
    private String MES_EM16607_13;
    private String MES_EM16607_14;
    private String MES_EM16607_2;
    private String MES_EM16607_3;
    private String MES_EM16607_4;
    private String MES_EM16607_5;
    private String MES_EM16607_6;
    private String MES_EM16607_7;
    private String MES_EM16607_8;
    private String MES_EM16607_9;
    private String MES_EM16610_0;
    private String MES_EM16610_1;
    private String MES_EM16610_10;
    private String MES_EM16610_2;
    private String MES_EM16610_3;
    private String MES_EM16610_4;
    private String MES_EM16610_5;
    private String MES_EM16610_6;
    private String MES_EM16610_7;
    private String MES_EM16610_8;
    private String MES_EM16610_9;
    private String MES_EM16611_0;
    private String MES_EM16611_1;
    private String MES_EM16611_2;
    private String MES_EM16611_3;
    private String MES_EM16611_4;
    private String MES_EM16611_5;
    private String MES_EM16611_6;
    private String MES_EM16611_7;
    private String MES_EM16611_8;
    private String MES_EM16611_9;
    private String MES_EM16612_0;
    private String MES_EM16612_1;
    private String MES_EM16612_10;
    private String MES_EM16612_2;
    private String MES_EM16612_3;
    private String MES_EM16612_4;
    private String MES_EM16612_5;
    private String MES_EM16612_6;
    private String MES_EM16612_7;
    private String MES_EM16612_8;
    private String MES_EM16612_9;
    private String MES_EM16613_0;
    private String MES_EM16613_1;
    private String MES_EM16613_2;
    private String MES_EM16613_3;
    private String MES_EM16613_4;
    private String MES_EM16613_5;
    private String MES_EM16613_6;
    private String MES_EM16613_7;
    private String MES_EM16700_0;
    private String MES_EM16700_1;
    private String MES_EM16700_2;
    private String MES_EM16700_3;
    private String MES_EM16700_4;
    private String MES_EM16700_5;
    private String MES_EM16700_6;
    private String MES_EM16700_7;
    private String MES_EM16700_8;
    private String MES_EM16700_9;
    private String MES_EM16702_0;
    private String MES_EM16702_1;
    private String MES_EM16702_2;
    private String MES_EM16702_3;
    private String MES_EM16702_4;
    private String MES_EM16702_5;
    private String MES_EM16702_8;
    private String MES_EM16702_9;
    private BigDecimal MES_ERR;
    private BigDecimal MES_MODE;
    private String MES_READ;
    private BigDecimal MES_RESULT;
    private String MES_SCAN;
    private BigDecimal MES_STATUS;
    private BigDecimal MES_STATUS_RUN;
    private BigDecimal MES_UAMP_INI_VALUE;
    private BigDecimal MES_UAMP_RES_VALUE;
    private BigDecimal MES_UPHA_INI_DEGREE;
    private BigDecimal MES_UPHA_RES_DEGREE;
    private String MES_SCAN_1;
    private String MES_SCAN_2;
    private String MES_SCAN_3;
    private String MES_SCAN_4;
    private String MES_SCAN_5;
    private String MES_SCAN_6;
    private String MES_SCAN_7;
    private String MES_SCAN_8;
    private String MES_SCAN_9;
    private String MES_SCAN_10;
    private String MES_SCAN_11;
    private String MES_SCAN_12;
    private String MES_SCAN_13;
    private String MES_SCAN_14;
    private String MES_SCAN_15;
    private String MES_SCAN_16;
    private String MES_SCAN_17;
    private String MES_SCAN_18;
    private String MES_SCAN_19;
    private String MES_SCAN_20;

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

    public BigDecimal getMES_CUT1_ANGLE1() {
        return MES_CUT1_ANGLE1;
    }

    public void setMES_CUT1_ANGLE1(BigDecimal MES_CUT1_ANGLE1) {
        this.MES_CUT1_ANGLE1 = MES_CUT1_ANGLE1;
    }

    public BigDecimal getMES_CUT1_ANGLE2() {
        return MES_CUT1_ANGLE2;
    }

    public void setMES_CUT1_ANGLE2(BigDecimal MES_CUT1_ANGLE2) {
        this.MES_CUT1_ANGLE2 = MES_CUT1_ANGLE2;
    }

    public BigDecimal getMES_CUT1_WEIGHT() {
        return MES_CUT1_WEIGHT;
    }

    public void setMES_CUT1_WEIGHT(BigDecimal MES_CUT1_WEIGHT) {
        this.MES_CUT1_WEIGHT = MES_CUT1_WEIGHT;
    }

    public BigDecimal getMES_CUT_NUM() {
        return MES_CUT_NUM;
    }

    public void setMES_CUT_NUM(BigDecimal MES_CUT_NUM) {
        this.MES_CUT_NUM = MES_CUT_NUM;
    }

    public String getMES_EM16600_0() {
        return MES_EM16600_0;
    }

    public void setMES_EM16600_0(String MES_EM16600_0) {
        this.MES_EM16600_0 = MES_EM16600_0;
    }

    public String getMES_EM16600_1() {
        return MES_EM16600_1;
    }

    public void setMES_EM16600_1(String MES_EM16600_1) {
        this.MES_EM16600_1 = MES_EM16600_1;
    }

    public String getMES_EM16600_10() {
        return MES_EM16600_10;
    }

    public void setMES_EM16600_10(String MES_EM16600_10) {
        this.MES_EM16600_10 = MES_EM16600_10;
    }

    public String getMES_EM16600_11() {
        return MES_EM16600_11;
    }

    public void setMES_EM16600_11(String MES_EM16600_11) {
        this.MES_EM16600_11 = MES_EM16600_11;
    }

    public String getMES_EM16600_12() {
        return MES_EM16600_12;
    }

    public void setMES_EM16600_12(String MES_EM16600_12) {
        this.MES_EM16600_12 = MES_EM16600_12;
    }

    public String getMES_EM16600_13() {
        return MES_EM16600_13;
    }

    public void setMES_EM16600_13(String MES_EM16600_13) {
        this.MES_EM16600_13 = MES_EM16600_13;
    }

    public String getMES_EM16600_14() {
        return MES_EM16600_14;
    }

    public void setMES_EM16600_14(String MES_EM16600_14) {
        this.MES_EM16600_14 = MES_EM16600_14;
    }

    public String getMES_EM16600_15() {
        return MES_EM16600_15;
    }

    public void setMES_EM16600_15(String MES_EM16600_15) {
        this.MES_EM16600_15 = MES_EM16600_15;
    }

    public String getMES_EM16600_2() {
        return MES_EM16600_2;
    }

    public void setMES_EM16600_2(String MES_EM16600_2) {
        this.MES_EM16600_2 = MES_EM16600_2;
    }

    public String getMES_EM16600_3() {
        return MES_EM16600_3;
    }

    public void setMES_EM16600_3(String MES_EM16600_3) {
        this.MES_EM16600_3 = MES_EM16600_3;
    }

    public String getMES_EM16600_4() {
        return MES_EM16600_4;
    }

    public void setMES_EM16600_4(String MES_EM16600_4) {
        this.MES_EM16600_4 = MES_EM16600_4;
    }

    public String getMES_EM16600_5() {
        return MES_EM16600_5;
    }

    public void setMES_EM16600_5(String MES_EM16600_5) {
        this.MES_EM16600_5 = MES_EM16600_5;
    }

    public String getMES_EM16600_6() {
        return MES_EM16600_6;
    }

    public void setMES_EM16600_6(String MES_EM16600_6) {
        this.MES_EM16600_6 = MES_EM16600_6;
    }

    public String getMES_EM16600_7() {
        return MES_EM16600_7;
    }

    public void setMES_EM16600_7(String MES_EM16600_7) {
        this.MES_EM16600_7 = MES_EM16600_7;
    }

    public String getMES_EM16600_9() {
        return MES_EM16600_9;
    }

    public void setMES_EM16600_9(String MES_EM16600_9) {
        this.MES_EM16600_9 = MES_EM16600_9;
    }

    public String getMES_EM16601_0() {
        return MES_EM16601_0;
    }

    public void setMES_EM16601_0(String MES_EM16601_0) {
        this.MES_EM16601_0 = MES_EM16601_0;
    }

    public String getMES_EM16601_1() {
        return MES_EM16601_1;
    }

    public void setMES_EM16601_1(String MES_EM16601_1) {
        this.MES_EM16601_1 = MES_EM16601_1;
    }

    public String getMES_EM16601_10() {
        return MES_EM16601_10;
    }

    public void setMES_EM16601_10(String MES_EM16601_10) {
        this.MES_EM16601_10 = MES_EM16601_10;
    }

    public String getMES_EM16601_11() {
        return MES_EM16601_11;
    }

    public void setMES_EM16601_11(String MES_EM16601_11) {
        this.MES_EM16601_11 = MES_EM16601_11;
    }

    public String getMES_EM16601_12() {
        return MES_EM16601_12;
    }

    public void setMES_EM16601_12(String MES_EM16601_12) {
        this.MES_EM16601_12 = MES_EM16601_12;
    }

    public String getMES_EM16601_2() {
        return MES_EM16601_2;
    }

    public void setMES_EM16601_2(String MES_EM16601_2) {
        this.MES_EM16601_2 = MES_EM16601_2;
    }

    public String getMES_EM16601_3() {
        return MES_EM16601_3;
    }

    public void setMES_EM16601_3(String MES_EM16601_3) {
        this.MES_EM16601_3 = MES_EM16601_3;
    }

    public String getMES_EM16601_4() {
        return MES_EM16601_4;
    }

    public void setMES_EM16601_4(String MES_EM16601_4) {
        this.MES_EM16601_4 = MES_EM16601_4;
    }

    public String getMES_EM16601_5() {
        return MES_EM16601_5;
    }

    public void setMES_EM16601_5(String MES_EM16601_5) {
        this.MES_EM16601_5 = MES_EM16601_5;
    }

    public String getMES_EM16601_6() {
        return MES_EM16601_6;
    }

    public void setMES_EM16601_6(String MES_EM16601_6) {
        this.MES_EM16601_6 = MES_EM16601_6;
    }

    public String getMES_EM16601_7() {
        return MES_EM16601_7;
    }

    public void setMES_EM16601_7(String MES_EM16601_7) {
        this.MES_EM16601_7 = MES_EM16601_7;
    }

    public String getMES_EM16601_8() {
        return MES_EM16601_8;
    }

    public void setMES_EM16601_8(String MES_EM16601_8) {
        this.MES_EM16601_8 = MES_EM16601_8;
    }

    public String getMES_EM16601_9() {
        return MES_EM16601_9;
    }

    public void setMES_EM16601_9(String MES_EM16601_9) {
        this.MES_EM16601_9 = MES_EM16601_9;
    }

    public String getMES_EM16602_0() {
        return MES_EM16602_0;
    }

    public void setMES_EM16602_0(String MES_EM16602_0) {
        this.MES_EM16602_0 = MES_EM16602_0;
    }

    public String getMES_EM16602_1() {
        return MES_EM16602_1;
    }

    public void setMES_EM16602_1(String MES_EM16602_1) {
        this.MES_EM16602_1 = MES_EM16602_1;
    }

    public String getMES_EM16602_2() {
        return MES_EM16602_2;
    }

    public void setMES_EM16602_2(String MES_EM16602_2) {
        this.MES_EM16602_2 = MES_EM16602_2;
    }

    public String getMES_EM16602_3() {
        return MES_EM16602_3;
    }

    public void setMES_EM16602_3(String MES_EM16602_3) {
        this.MES_EM16602_3 = MES_EM16602_3;
    }

    public String getMES_EM16602_4() {
        return MES_EM16602_4;
    }

    public void setMES_EM16602_4(String MES_EM16602_4) {
        this.MES_EM16602_4 = MES_EM16602_4;
    }

    public String getMES_EM16602_5() {
        return MES_EM16602_5;
    }

    public void setMES_EM16602_5(String MES_EM16602_5) {
        this.MES_EM16602_5 = MES_EM16602_5;
    }

    public String getMES_EM16602_6() {
        return MES_EM16602_6;
    }

    public void setMES_EM16602_6(String MES_EM16602_6) {
        this.MES_EM16602_6 = MES_EM16602_6;
    }

    public String getMES_EM16602_7() {
        return MES_EM16602_7;
    }

    public void setMES_EM16602_7(String MES_EM16602_7) {
        this.MES_EM16602_7 = MES_EM16602_7;
    }

    public String getMES_EM16602_8() {
        return MES_EM16602_8;
    }

    public void setMES_EM16602_8(String MES_EM16602_8) {
        this.MES_EM16602_8 = MES_EM16602_8;
    }

    public String getMES_EM16602_9() {
        return MES_EM16602_9;
    }

    public void setMES_EM16602_9(String MES_EM16602_9) {
        this.MES_EM16602_9 = MES_EM16602_9;
    }

    public String getMES_EM16603_0() {
        return MES_EM16603_0;
    }

    public void setMES_EM16603_0(String MES_EM16603_0) {
        this.MES_EM16603_0 = MES_EM16603_0;
    }

    public String getMES_EM16603_2() {
        return MES_EM16603_2;
    }

    public void setMES_EM16603_2(String MES_EM16603_2) {
        this.MES_EM16603_2 = MES_EM16603_2;
    }

    public String getMES_EM16603_3() {
        return MES_EM16603_3;
    }

    public void setMES_EM16603_3(String MES_EM16603_3) {
        this.MES_EM16603_3 = MES_EM16603_3;
    }

    public String getMES_EM16603_4() {
        return MES_EM16603_4;
    }

    public void setMES_EM16603_4(String MES_EM16603_4) {
        this.MES_EM16603_4 = MES_EM16603_4;
    }

    public String getMES_EM16603_5() {
        return MES_EM16603_5;
    }

    public void setMES_EM16603_5(String MES_EM16603_5) {
        this.MES_EM16603_5 = MES_EM16603_5;
    }

    public String getMES_EM16603_6() {
        return MES_EM16603_6;
    }

    public void setMES_EM16603_6(String MES_EM16603_6) {
        this.MES_EM16603_6 = MES_EM16603_6;
    }

    public String getMES_EM16603_7() {
        return MES_EM16603_7;
    }

    public void setMES_EM16603_7(String MES_EM16603_7) {
        this.MES_EM16603_7 = MES_EM16603_7;
    }

    public String getMES_EM16603_8() {
        return MES_EM16603_8;
    }

    public void setMES_EM16603_8(String MES_EM16603_8) {
        this.MES_EM16603_8 = MES_EM16603_8;
    }

    public String getMES_EM16603_9() {
        return MES_EM16603_9;
    }

    public void setMES_EM16603_9(String MES_EM16603_9) {
        this.MES_EM16603_9 = MES_EM16603_9;
    }

    public String getMES_EM16604_0() {
        return MES_EM16604_0;
    }

    public void setMES_EM16604_0(String MES_EM16604_0) {
        this.MES_EM16604_0 = MES_EM16604_0;
    }

    public String getMES_EM16604_1() {
        return MES_EM16604_1;
    }

    public void setMES_EM16604_1(String MES_EM16604_1) {
        this.MES_EM16604_1 = MES_EM16604_1;
    }

    public String getMES_EM16604_10() {
        return MES_EM16604_10;
    }

    public void setMES_EM16604_10(String MES_EM16604_10) {
        this.MES_EM16604_10 = MES_EM16604_10;
    }

    public String getMES_EM16604_2() {
        return MES_EM16604_2;
    }

    public void setMES_EM16604_2(String MES_EM16604_2) {
        this.MES_EM16604_2 = MES_EM16604_2;
    }

    public String getMES_EM16604_3() {
        return MES_EM16604_3;
    }

    public void setMES_EM16604_3(String MES_EM16604_3) {
        this.MES_EM16604_3 = MES_EM16604_3;
    }

    public String getMES_EM16604_4() {
        return MES_EM16604_4;
    }

    public void setMES_EM16604_4(String MES_EM16604_4) {
        this.MES_EM16604_4 = MES_EM16604_4;
    }

    public String getMES_EM16604_5() {
        return MES_EM16604_5;
    }

    public void setMES_EM16604_5(String MES_EM16604_5) {
        this.MES_EM16604_5 = MES_EM16604_5;
    }

    public String getMES_EM16604_6() {
        return MES_EM16604_6;
    }

    public void setMES_EM16604_6(String MES_EM16604_6) {
        this.MES_EM16604_6 = MES_EM16604_6;
    }

    public String getMES_EM16604_7() {
        return MES_EM16604_7;
    }

    public void setMES_EM16604_7(String MES_EM16604_7) {
        this.MES_EM16604_7 = MES_EM16604_7;
    }

    public String getMES_EM16604_8() {
        return MES_EM16604_8;
    }

    public void setMES_EM16604_8(String MES_EM16604_8) {
        this.MES_EM16604_8 = MES_EM16604_8;
    }

    public String getMES_EM16604_9() {
        return MES_EM16604_9;
    }

    public void setMES_EM16604_9(String MES_EM16604_9) {
        this.MES_EM16604_9 = MES_EM16604_9;
    }

    public String getMES_EM16605_0() {
        return MES_EM16605_0;
    }

    public void setMES_EM16605_0(String MES_EM16605_0) {
        this.MES_EM16605_0 = MES_EM16605_0;
    }

    public String getMES_EM16605_1() {
        return MES_EM16605_1;
    }

    public void setMES_EM16605_1(String MES_EM16605_1) {
        this.MES_EM16605_1 = MES_EM16605_1;
    }

    public String getMES_EM16605_2() {
        return MES_EM16605_2;
    }

    public void setMES_EM16605_2(String MES_EM16605_2) {
        this.MES_EM16605_2 = MES_EM16605_2;
    }

    public String getMES_EM16605_3() {
        return MES_EM16605_3;
    }

    public void setMES_EM16605_3(String MES_EM16605_3) {
        this.MES_EM16605_3 = MES_EM16605_3;
    }

    public String getMES_EM16605_4() {
        return MES_EM16605_4;
    }

    public void setMES_EM16605_4(String MES_EM16605_4) {
        this.MES_EM16605_4 = MES_EM16605_4;
    }

    public String getMES_EM16605_5() {
        return MES_EM16605_5;
    }

    public void setMES_EM16605_5(String MES_EM16605_5) {
        this.MES_EM16605_5 = MES_EM16605_5;
    }

    public String getMES_EM16605_6() {
        return MES_EM16605_6;
    }

    public void setMES_EM16605_6(String MES_EM16605_6) {
        this.MES_EM16605_6 = MES_EM16605_6;
    }

    public String getMES_EM16605_7() {
        return MES_EM16605_7;
    }

    public void setMES_EM16605_7(String MES_EM16605_7) {
        this.MES_EM16605_7 = MES_EM16605_7;
    }

    public String getMES_EM16605_8() {
        return MES_EM16605_8;
    }

    public void setMES_EM16605_8(String MES_EM16605_8) {
        this.MES_EM16605_8 = MES_EM16605_8;
    }

    public String getMES_EM16606_0() {
        return MES_EM16606_0;
    }

    public void setMES_EM16606_0(String MES_EM16606_0) {
        this.MES_EM16606_0 = MES_EM16606_0;
    }

    public String getMES_EM16606_1() {
        return MES_EM16606_1;
    }

    public void setMES_EM16606_1(String MES_EM16606_1) {
        this.MES_EM16606_1 = MES_EM16606_1;
    }

    public String getMES_EM16606_2() {
        return MES_EM16606_2;
    }

    public void setMES_EM16606_2(String MES_EM16606_2) {
        this.MES_EM16606_2 = MES_EM16606_2;
    }

    public String getMES_EM16606_3() {
        return MES_EM16606_3;
    }

    public void setMES_EM16606_3(String MES_EM16606_3) {
        this.MES_EM16606_3 = MES_EM16606_3;
    }

    public String getMES_EM16606_4() {
        return MES_EM16606_4;
    }

    public void setMES_EM16606_4(String MES_EM16606_4) {
        this.MES_EM16606_4 = MES_EM16606_4;
    }

    public String getMES_EM16606_5() {
        return MES_EM16606_5;
    }

    public void setMES_EM16606_5(String MES_EM16606_5) {
        this.MES_EM16606_5 = MES_EM16606_5;
    }

    public String getMES_EM16606_6() {
        return MES_EM16606_6;
    }

    public void setMES_EM16606_6(String MES_EM16606_6) {
        this.MES_EM16606_6 = MES_EM16606_6;
    }

    public String getMES_EM16606_7() {
        return MES_EM16606_7;
    }

    public void setMES_EM16606_7(String MES_EM16606_7) {
        this.MES_EM16606_7 = MES_EM16606_7;
    }

    public String getMES_EM16607_0() {
        return MES_EM16607_0;
    }

    public void setMES_EM16607_0(String MES_EM16607_0) {
        this.MES_EM16607_0 = MES_EM16607_0;
    }

    public String getMES_EM16607_1() {
        return MES_EM16607_1;
    }

    public void setMES_EM16607_1(String MES_EM16607_1) {
        this.MES_EM16607_1 = MES_EM16607_1;
    }

    public String getMES_EM16607_10() {
        return MES_EM16607_10;
    }

    public void setMES_EM16607_10(String MES_EM16607_10) {
        this.MES_EM16607_10 = MES_EM16607_10;
    }

    public String getMES_EM16607_11() {
        return MES_EM16607_11;
    }

    public void setMES_EM16607_11(String MES_EM16607_11) {
        this.MES_EM16607_11 = MES_EM16607_11;
    }

    public String getMES_EM16607_12() {
        return MES_EM16607_12;
    }

    public void setMES_EM16607_12(String MES_EM16607_12) {
        this.MES_EM16607_12 = MES_EM16607_12;
    }

    public String getMES_EM16607_13() {
        return MES_EM16607_13;
    }

    public void setMES_EM16607_13(String MES_EM16607_13) {
        this.MES_EM16607_13 = MES_EM16607_13;
    }

    public String getMES_EM16607_14() {
        return MES_EM16607_14;
    }

    public void setMES_EM16607_14(String MES_EM16607_14) {
        this.MES_EM16607_14 = MES_EM16607_14;
    }

    public String getMES_EM16607_2() {
        return MES_EM16607_2;
    }

    public void setMES_EM16607_2(String MES_EM16607_2) {
        this.MES_EM16607_2 = MES_EM16607_2;
    }

    public String getMES_EM16607_3() {
        return MES_EM16607_3;
    }

    public void setMES_EM16607_3(String MES_EM16607_3) {
        this.MES_EM16607_3 = MES_EM16607_3;
    }

    public String getMES_EM16607_4() {
        return MES_EM16607_4;
    }

    public void setMES_EM16607_4(String MES_EM16607_4) {
        this.MES_EM16607_4 = MES_EM16607_4;
    }

    public String getMES_EM16607_5() {
        return MES_EM16607_5;
    }

    public void setMES_EM16607_5(String MES_EM16607_5) {
        this.MES_EM16607_5 = MES_EM16607_5;
    }

    public String getMES_EM16607_6() {
        return MES_EM16607_6;
    }

    public void setMES_EM16607_6(String MES_EM16607_6) {
        this.MES_EM16607_6 = MES_EM16607_6;
    }

    public String getMES_EM16607_7() {
        return MES_EM16607_7;
    }

    public void setMES_EM16607_7(String MES_EM16607_7) {
        this.MES_EM16607_7 = MES_EM16607_7;
    }

    public String getMES_EM16607_8() {
        return MES_EM16607_8;
    }

    public void setMES_EM16607_8(String MES_EM16607_8) {
        this.MES_EM16607_8 = MES_EM16607_8;
    }

    public String getMES_EM16607_9() {
        return MES_EM16607_9;
    }

    public void setMES_EM16607_9(String MES_EM16607_9) {
        this.MES_EM16607_9 = MES_EM16607_9;
    }

    public String getMES_EM16610_0() {
        return MES_EM16610_0;
    }

    public void setMES_EM16610_0(String MES_EM16610_0) {
        this.MES_EM16610_0 = MES_EM16610_0;
    }

    public String getMES_EM16610_1() {
        return MES_EM16610_1;
    }

    public void setMES_EM16610_1(String MES_EM16610_1) {
        this.MES_EM16610_1 = MES_EM16610_1;
    }

    public String getMES_EM16610_10() {
        return MES_EM16610_10;
    }

    public void setMES_EM16610_10(String MES_EM16610_10) {
        this.MES_EM16610_10 = MES_EM16610_10;
    }

    public String getMES_EM16610_2() {
        return MES_EM16610_2;
    }

    public void setMES_EM16610_2(String MES_EM16610_2) {
        this.MES_EM16610_2 = MES_EM16610_2;
    }

    public String getMES_EM16610_3() {
        return MES_EM16610_3;
    }

    public void setMES_EM16610_3(String MES_EM16610_3) {
        this.MES_EM16610_3 = MES_EM16610_3;
    }

    public String getMES_EM16610_4() {
        return MES_EM16610_4;
    }

    public void setMES_EM16610_4(String MES_EM16610_4) {
        this.MES_EM16610_4 = MES_EM16610_4;
    }

    public String getMES_EM16610_5() {
        return MES_EM16610_5;
    }

    public void setMES_EM16610_5(String MES_EM16610_5) {
        this.MES_EM16610_5 = MES_EM16610_5;
    }

    public String getMES_EM16610_6() {
        return MES_EM16610_6;
    }

    public void setMES_EM16610_6(String MES_EM16610_6) {
        this.MES_EM16610_6 = MES_EM16610_6;
    }

    public String getMES_EM16610_7() {
        return MES_EM16610_7;
    }

    public void setMES_EM16610_7(String MES_EM16610_7) {
        this.MES_EM16610_7 = MES_EM16610_7;
    }

    public String getMES_EM16610_8() {
        return MES_EM16610_8;
    }

    public void setMES_EM16610_8(String MES_EM16610_8) {
        this.MES_EM16610_8 = MES_EM16610_8;
    }

    public String getMES_EM16610_9() {
        return MES_EM16610_9;
    }

    public void setMES_EM16610_9(String MES_EM16610_9) {
        this.MES_EM16610_9 = MES_EM16610_9;
    }

    public String getMES_EM16611_0() {
        return MES_EM16611_0;
    }

    public void setMES_EM16611_0(String MES_EM16611_0) {
        this.MES_EM16611_0 = MES_EM16611_0;
    }

    public String getMES_EM16611_1() {
        return MES_EM16611_1;
    }

    public void setMES_EM16611_1(String MES_EM16611_1) {
        this.MES_EM16611_1 = MES_EM16611_1;
    }

    public String getMES_EM16611_2() {
        return MES_EM16611_2;
    }

    public void setMES_EM16611_2(String MES_EM16611_2) {
        this.MES_EM16611_2 = MES_EM16611_2;
    }

    public String getMES_EM16611_3() {
        return MES_EM16611_3;
    }

    public void setMES_EM16611_3(String MES_EM16611_3) {
        this.MES_EM16611_3 = MES_EM16611_3;
    }

    public String getMES_EM16611_4() {
        return MES_EM16611_4;
    }

    public void setMES_EM16611_4(String MES_EM16611_4) {
        this.MES_EM16611_4 = MES_EM16611_4;
    }

    public String getMES_EM16611_5() {
        return MES_EM16611_5;
    }

    public void setMES_EM16611_5(String MES_EM16611_5) {
        this.MES_EM16611_5 = MES_EM16611_5;
    }

    public String getMES_EM16611_6() {
        return MES_EM16611_6;
    }

    public void setMES_EM16611_6(String MES_EM16611_6) {
        this.MES_EM16611_6 = MES_EM16611_6;
    }

    public String getMES_EM16611_7() {
        return MES_EM16611_7;
    }

    public void setMES_EM16611_7(String MES_EM16611_7) {
        this.MES_EM16611_7 = MES_EM16611_7;
    }

    public String getMES_EM16611_8() {
        return MES_EM16611_8;
    }

    public void setMES_EM16611_8(String MES_EM16611_8) {
        this.MES_EM16611_8 = MES_EM16611_8;
    }

    public String getMES_EM16611_9() {
        return MES_EM16611_9;
    }

    public void setMES_EM16611_9(String MES_EM16611_9) {
        this.MES_EM16611_9 = MES_EM16611_9;
    }

    public String getMES_EM16612_0() {
        return MES_EM16612_0;
    }

    public void setMES_EM16612_0(String MES_EM16612_0) {
        this.MES_EM16612_0 = MES_EM16612_0;
    }

    public String getMES_EM16612_1() {
        return MES_EM16612_1;
    }

    public void setMES_EM16612_1(String MES_EM16612_1) {
        this.MES_EM16612_1 = MES_EM16612_1;
    }

    public String getMES_EM16612_10() {
        return MES_EM16612_10;
    }

    public void setMES_EM16612_10(String MES_EM16612_10) {
        this.MES_EM16612_10 = MES_EM16612_10;
    }

    public String getMES_EM16612_2() {
        return MES_EM16612_2;
    }

    public void setMES_EM16612_2(String MES_EM16612_2) {
        this.MES_EM16612_2 = MES_EM16612_2;
    }

    public String getMES_EM16612_3() {
        return MES_EM16612_3;
    }

    public void setMES_EM16612_3(String MES_EM16612_3) {
        this.MES_EM16612_3 = MES_EM16612_3;
    }

    public String getMES_EM16612_4() {
        return MES_EM16612_4;
    }

    public void setMES_EM16612_4(String MES_EM16612_4) {
        this.MES_EM16612_4 = MES_EM16612_4;
    }

    public String getMES_EM16612_5() {
        return MES_EM16612_5;
    }

    public void setMES_EM16612_5(String MES_EM16612_5) {
        this.MES_EM16612_5 = MES_EM16612_5;
    }

    public String getMES_EM16612_6() {
        return MES_EM16612_6;
    }

    public void setMES_EM16612_6(String MES_EM16612_6) {
        this.MES_EM16612_6 = MES_EM16612_6;
    }

    public String getMES_EM16612_7() {
        return MES_EM16612_7;
    }

    public void setMES_EM16612_7(String MES_EM16612_7) {
        this.MES_EM16612_7 = MES_EM16612_7;
    }

    public String getMES_EM16612_8() {
        return MES_EM16612_8;
    }

    public void setMES_EM16612_8(String MES_EM16612_8) {
        this.MES_EM16612_8 = MES_EM16612_8;
    }

    public String getMES_EM16612_9() {
        return MES_EM16612_9;
    }

    public void setMES_EM16612_9(String MES_EM16612_9) {
        this.MES_EM16612_9 = MES_EM16612_9;
    }

    public String getMES_EM16613_0() {
        return MES_EM16613_0;
    }

    public void setMES_EM16613_0(String MES_EM16613_0) {
        this.MES_EM16613_0 = MES_EM16613_0;
    }

    public String getMES_EM16613_1() {
        return MES_EM16613_1;
    }

    public void setMES_EM16613_1(String MES_EM16613_1) {
        this.MES_EM16613_1 = MES_EM16613_1;
    }

    public String getMES_EM16613_2() {
        return MES_EM16613_2;
    }

    public void setMES_EM16613_2(String MES_EM16613_2) {
        this.MES_EM16613_2 = MES_EM16613_2;
    }

    public String getMES_EM16613_3() {
        return MES_EM16613_3;
    }

    public void setMES_EM16613_3(String MES_EM16613_3) {
        this.MES_EM16613_3 = MES_EM16613_3;
    }

    public String getMES_EM16613_4() {
        return MES_EM16613_4;
    }

    public void setMES_EM16613_4(String MES_EM16613_4) {
        this.MES_EM16613_4 = MES_EM16613_4;
    }

    public String getMES_EM16613_5() {
        return MES_EM16613_5;
    }

    public void setMES_EM16613_5(String MES_EM16613_5) {
        this.MES_EM16613_5 = MES_EM16613_5;
    }

    public String getMES_EM16613_6() {
        return MES_EM16613_6;
    }

    public void setMES_EM16613_6(String MES_EM16613_6) {
        this.MES_EM16613_6 = MES_EM16613_6;
    }

    public String getMES_EM16613_7() {
        return MES_EM16613_7;
    }

    public void setMES_EM16613_7(String MES_EM16613_7) {
        this.MES_EM16613_7 = MES_EM16613_7;
    }

    public String getMES_EM16700_0() {
        return MES_EM16700_0;
    }

    public void setMES_EM16700_0(String MES_EM16700_0) {
        this.MES_EM16700_0 = MES_EM16700_0;
    }

    public String getMES_EM16700_1() {
        return MES_EM16700_1;
    }

    public void setMES_EM16700_1(String MES_EM16700_1) {
        this.MES_EM16700_1 = MES_EM16700_1;
    }

    public String getMES_EM16700_2() {
        return MES_EM16700_2;
    }

    public void setMES_EM16700_2(String MES_EM16700_2) {
        this.MES_EM16700_2 = MES_EM16700_2;
    }

    public String getMES_EM16700_3() {
        return MES_EM16700_3;
    }

    public void setMES_EM16700_3(String MES_EM16700_3) {
        this.MES_EM16700_3 = MES_EM16700_3;
    }

    public String getMES_EM16700_4() {
        return MES_EM16700_4;
    }

    public void setMES_EM16700_4(String MES_EM16700_4) {
        this.MES_EM16700_4 = MES_EM16700_4;
    }

    public String getMES_EM16700_5() {
        return MES_EM16700_5;
    }

    public void setMES_EM16700_5(String MES_EM16700_5) {
        this.MES_EM16700_5 = MES_EM16700_5;
    }

    public String getMES_EM16700_6() {
        return MES_EM16700_6;
    }

    public void setMES_EM16700_6(String MES_EM16700_6) {
        this.MES_EM16700_6 = MES_EM16700_6;
    }

    public String getMES_EM16700_7() {
        return MES_EM16700_7;
    }

    public void setMES_EM16700_7(String MES_EM16700_7) {
        this.MES_EM16700_7 = MES_EM16700_7;
    }

    public String getMES_EM16700_8() {
        return MES_EM16700_8;
    }

    public void setMES_EM16700_8(String MES_EM16700_8) {
        this.MES_EM16700_8 = MES_EM16700_8;
    }

    public String getMES_EM16700_9() {
        return MES_EM16700_9;
    }

    public void setMES_EM16700_9(String MES_EM16700_9) {
        this.MES_EM16700_9 = MES_EM16700_9;
    }

    public String getMES_EM16702_0() {
        return MES_EM16702_0;
    }

    public void setMES_EM16702_0(String MES_EM16702_0) {
        this.MES_EM16702_0 = MES_EM16702_0;
    }

    public String getMES_EM16702_1() {
        return MES_EM16702_1;
    }

    public void setMES_EM16702_1(String MES_EM16702_1) {
        this.MES_EM16702_1 = MES_EM16702_1;
    }

    public String getMES_EM16702_2() {
        return MES_EM16702_2;
    }

    public void setMES_EM16702_2(String MES_EM16702_2) {
        this.MES_EM16702_2 = MES_EM16702_2;
    }

    public String getMES_EM16702_3() {
        return MES_EM16702_3;
    }

    public void setMES_EM16702_3(String MES_EM16702_3) {
        this.MES_EM16702_3 = MES_EM16702_3;
    }

    public String getMES_EM16702_4() {
        return MES_EM16702_4;
    }

    public void setMES_EM16702_4(String MES_EM16702_4) {
        this.MES_EM16702_4 = MES_EM16702_4;
    }

    public String getMES_EM16702_5() {
        return MES_EM16702_5;
    }

    public void setMES_EM16702_5(String MES_EM16702_5) {
        this.MES_EM16702_5 = MES_EM16702_5;
    }

    public String getMES_EM16702_8() {
        return MES_EM16702_8;
    }

    public void setMES_EM16702_8(String MES_EM16702_8) {
        this.MES_EM16702_8 = MES_EM16702_8;
    }

    public String getMES_EM16702_9() {
        return MES_EM16702_9;
    }

    public void setMES_EM16702_9(String MES_EM16702_9) {
        this.MES_EM16702_9 = MES_EM16702_9;
    }

    public BigDecimal getMES_ERR() {
        return MES_ERR;
    }

    public void setMES_ERR(BigDecimal MES_ERR) {
        this.MES_ERR = MES_ERR;
    }

    public BigDecimal getMES_MODE() {
        return MES_MODE;
    }

    public void setMES_MODE(BigDecimal MES_MODE) {
        this.MES_MODE = MES_MODE;
    }

    public String getMES_READ() {
        return MES_READ;
    }

    public void setMES_READ(String MES_READ) {
        this.MES_READ = MES_READ;
    }

    public BigDecimal getMES_RESULT() {
        return MES_RESULT;
    }

    public void setMES_RESULT(BigDecimal MES_RESULT) {
        this.MES_RESULT = MES_RESULT;
    }

    public String getMES_SCAN() {
        return MES_SCAN;
    }

    public void setMES_SCAN(String MES_SCAN) {
        this.MES_SCAN = MES_SCAN;
    }

    public BigDecimal getMES_STATUS() {
        return MES_STATUS;
    }

    public void setMES_STATUS(BigDecimal MES_STATUS) {
        this.MES_STATUS = MES_STATUS;
    }

    public BigDecimal getMES_STATUS_RUN() {
        return MES_STATUS_RUN;
    }

    public void setMES_STATUS_RUN(BigDecimal MES_STATUS_RUN) {
        this.MES_STATUS_RUN = MES_STATUS_RUN;
    }

    public BigDecimal getMES_UAMP_INI_VALUE() {
        return MES_UAMP_INI_VALUE;
    }

    public void setMES_UAMP_INI_VALUE(BigDecimal MES_UAMP_INI_VALUE) {
        this.MES_UAMP_INI_VALUE = MES_UAMP_INI_VALUE;
    }

    public BigDecimal getMES_UAMP_RES_VALUE() {
        return MES_UAMP_RES_VALUE;
    }

    public void setMES_UAMP_RES_VALUE(BigDecimal MES_UAMP_RES_VALUE) {
        this.MES_UAMP_RES_VALUE = MES_UAMP_RES_VALUE;
    }

    public BigDecimal getMES_UPHA_INI_DEGREE() {
        return MES_UPHA_INI_DEGREE;
    }

    public void setMES_UPHA_INI_DEGREE(BigDecimal MES_UPHA_INI_DEGREE) {
        this.MES_UPHA_INI_DEGREE = MES_UPHA_INI_DEGREE;
    }

    public BigDecimal getMES_UPHA_RES_DEGREE() {
        return MES_UPHA_RES_DEGREE;
    }

    public void setMES_UPHA_RES_DEGREE(BigDecimal MES_UPHA_RES_DEGREE) {
        this.MES_UPHA_RES_DEGREE = MES_UPHA_RES_DEGREE;
    }

    public String getMES_SCAN_1() {
        return MES_SCAN_1;
    }

    public void setMES_SCAN_1(String MES_SCAN_1) {
        this.MES_SCAN_1 = MES_SCAN_1;
    }

    public String getMES_SCAN_2() {
        return MES_SCAN_2;
    }

    public void setMES_SCAN_2(String MES_SCAN_2) {
        this.MES_SCAN_2 = MES_SCAN_2;
    }

    public String getMES_SCAN_3() {
        return MES_SCAN_3;
    }

    public void setMES_SCAN_3(String MES_SCAN_3) {
        this.MES_SCAN_3 = MES_SCAN_3;
    }

    public String getMES_SCAN_4() {
        return MES_SCAN_4;
    }

    public void setMES_SCAN_4(String MES_SCAN_4) {
        this.MES_SCAN_4 = MES_SCAN_4;
    }

    public String getMES_SCAN_5() {
        return MES_SCAN_5;
    }

    public void setMES_SCAN_5(String MES_SCAN_5) {
        this.MES_SCAN_5 = MES_SCAN_5;
    }

    public String getMES_SCAN_6() {
        return MES_SCAN_6;
    }

    public void setMES_SCAN_6(String MES_SCAN_6) {
        this.MES_SCAN_6 = MES_SCAN_6;
    }

    public String getMES_SCAN_7() {
        return MES_SCAN_7;
    }

    public void setMES_SCAN_7(String MES_SCAN_7) {
        this.MES_SCAN_7 = MES_SCAN_7;
    }

    public String getMES_SCAN_8() {
        return MES_SCAN_8;
    }

    public void setMES_SCAN_8(String MES_SCAN_8) {
        this.MES_SCAN_8 = MES_SCAN_8;
    }

    public String getMES_SCAN_9() {
        return MES_SCAN_9;
    }

    public void setMES_SCAN_9(String MES_SCAN_9) {
        this.MES_SCAN_9 = MES_SCAN_9;
    }

    public String getMES_SCAN_10() {
        return MES_SCAN_10;
    }

    public void setMES_SCAN_10(String MES_SCAN_10) {
        this.MES_SCAN_10 = MES_SCAN_10;
    }

    public String getMES_SCAN_11() {
        return MES_SCAN_11;
    }

    public void setMES_SCAN_11(String MES_SCAN_11) {
        this.MES_SCAN_11 = MES_SCAN_11;
    }

    public String getMES_SCAN_12() {
        return MES_SCAN_12;
    }

    public void setMES_SCAN_12(String MES_SCAN_12) {
        this.MES_SCAN_12 = MES_SCAN_12;
    }

    public String getMES_SCAN_13() {
        return MES_SCAN_13;
    }

    public void setMES_SCAN_13(String MES_SCAN_13) {
        this.MES_SCAN_13 = MES_SCAN_13;
    }

    public String getMES_SCAN_14() {
        return MES_SCAN_14;
    }

    public void setMES_SCAN_14(String MES_SCAN_14) {
        this.MES_SCAN_14 = MES_SCAN_14;
    }

    public String getMES_SCAN_15() {
        return MES_SCAN_15;
    }

    public void setMES_SCAN_15(String MES_SCAN_15) {
        this.MES_SCAN_15 = MES_SCAN_15;
    }

    public String getMES_SCAN_16() {
        return MES_SCAN_16;
    }

    public void setMES_SCAN_16(String MES_SCAN_16) {
        this.MES_SCAN_16 = MES_SCAN_16;
    }

    public String getMES_SCAN_17() {
        return MES_SCAN_17;
    }

    public void setMES_SCAN_17(String MES_SCAN_17) {
        this.MES_SCAN_17 = MES_SCAN_17;
    }

    public String getMES_SCAN_18() {
        return MES_SCAN_18;
    }

    public void setMES_SCAN_18(String MES_SCAN_18) {
        this.MES_SCAN_18 = MES_SCAN_18;
    }

    public String getMES_SCAN_19() {
        return MES_SCAN_19;
    }

    public void setMES_SCAN_19(String MES_SCAN_19) {
        this.MES_SCAN_19 = MES_SCAN_19;
    }

    public String getMES_SCAN_20() {
        return MES_SCAN_20;
    }

    public void setMES_SCAN_20(String MES_SCAN_20) {
        this.MES_SCAN_20 = MES_SCAN_20;
    }
}
