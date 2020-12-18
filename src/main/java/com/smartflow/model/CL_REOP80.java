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
    private String IS_OK;
    private BigDecimal MES_CUT1_ANGLE1;
    private BigDecimal MES_CUT1_ANGLE2;
    private BigDecimal MES_CUT1_WEIGHT;
    private BigDecimal MES_CUT_NUM;
    private BigDecimal MES_RESULT;
    private String MES_SCAN;
    private BigDecimal MES_UAMP_INI_VALUE;
    private BigDecimal MES_UAMP_RES_VALUE;
    private BigDecimal MES_UPHA_INI_DEGREE;
    private BigDecimal MES_UPHA_RES_DEGREE;

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
}
