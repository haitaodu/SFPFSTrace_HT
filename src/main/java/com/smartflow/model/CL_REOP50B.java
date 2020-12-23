package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_REOP50B")
public class CL_REOP50B {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String AUTO_TIME;
    private String COMMS_COND;
    private String COOLANT_COND;
    private String CRFUNC;
    private String CTRAVEL;
    private String CUT_TIME;
    private String ESTOP;
    private String ELECTRIC_COND;
    private BigDecimal FACT;
    private String FOVR;
    private String HYDRA_COND;
    private String LINE;
    private String LOGIC_COND;
    private String LUBRICATION_COND;
    private String MOTION_COND;
    private String PALLET_NUM;
    private BigDecimal PART_COUNT_ACT;
    private String PROGRAM;
    private BigDecimal SLOAD;
    private String SLOAD_COND;
    private String SOVR;
    private String SPINDLE_COND;
    private String SRPM;
    private BigDecimal STEMP;
    private String SYSTEM_COND;
    private String TOOL_NUMBER;
    private String TOTAL_AUTO_CUT_TIME;
    private String TOTAL_TIME;
    private BigDecimal XABS;
    private BigDecimal XFRT;
    private BigDecimal XLOAD;
    private BigDecimal XPOS;
    private String XTRAVEL;
    private String ZTRAVEL;

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

    public String getAUTO_TIME() {
        return AUTO_TIME;
    }

    public void setAUTO_TIME(String AUTO_TIME) {
        this.AUTO_TIME = AUTO_TIME;
    }

    public String getCOMMS_COND() {
        return COMMS_COND;
    }

    public void setCOMMS_COND(String COMMS_COND) {
        this.COMMS_COND = COMMS_COND;
    }

    public String getCOOLANT_COND() {
        return COOLANT_COND;
    }

    public void setCOOLANT_COND(String COOLANT_COND) {
        this.COOLANT_COND = COOLANT_COND;
    }

    public String getCRFUNC() {
        return CRFUNC;
    }

    public void setCRFUNC(String CRFUNC) {
        this.CRFUNC = CRFUNC;
    }

    public String getCTRAVEL() {
        return CTRAVEL;
    }

    public void setCTRAVEL(String CTRAVEL) {
        this.CTRAVEL = CTRAVEL;
    }

    public String getCUT_TIME() {
        return CUT_TIME;
    }

    public void setCUT_TIME(String CUT_TIME) {
        this.CUT_TIME = CUT_TIME;
    }

    public String getESTOP() {
        return ESTOP;
    }

    public void setESTOP(String ESTOP) {
        this.ESTOP = ESTOP;
    }

    public String getELECTRIC_COND() {
        return ELECTRIC_COND;
    }

    public void setELECTRIC_COND(String ELECTRIC_COND) {
        this.ELECTRIC_COND = ELECTRIC_COND;
    }

    public BigDecimal getFACT() {
        return FACT;
    }

    public void setFACT(BigDecimal FACT) {
        this.FACT = FACT;
    }

    public String getFOVR() {
        return FOVR;
    }

    public void setFOVR(String FOVR) {
        this.FOVR = FOVR;
    }

    public String getHYDRA_COND() {
        return HYDRA_COND;
    }

    public void setHYDRA_COND(String HYDRA_COND) {
        this.HYDRA_COND = HYDRA_COND;
    }

    public String getLINE() {
        return LINE;
    }

    public void setLINE(String LINE) {
        this.LINE = LINE;
    }

    public String getLOGIC_COND() {
        return LOGIC_COND;
    }

    public void setLOGIC_COND(String LOGIC_COND) {
        this.LOGIC_COND = LOGIC_COND;
    }

    public String getLUBRICATION_COND() {
        return LUBRICATION_COND;
    }

    public void setLUBRICATION_COND(String LUBRICATION_COND) {
        this.LUBRICATION_COND = LUBRICATION_COND;
    }

    public String getMOTION_COND() {
        return MOTION_COND;
    }

    public void setMOTION_COND(String MOTION_COND) {
        this.MOTION_COND = MOTION_COND;
    }

    public String getPALLET_NUM() {
        return PALLET_NUM;
    }

    public void setPALLET_NUM(String PALLET_NUM) {
        this.PALLET_NUM = PALLET_NUM;
    }

    public BigDecimal getPART_COUNT_ACT() {
        return PART_COUNT_ACT;
    }

    public void setPART_COUNT_ACT(BigDecimal PART_COUNT_ACT) {
        this.PART_COUNT_ACT = PART_COUNT_ACT;
    }

    public String getPROGRAM() {
        return PROGRAM;
    }

    public void setPROGRAM(String PROGRAM) {
        this.PROGRAM = PROGRAM;
    }

    public BigDecimal getSLOAD() {
        return SLOAD;
    }

    public void setSLOAD(BigDecimal SLOAD) {
        this.SLOAD = SLOAD;
    }

    public String getSLOAD_COND() {
        return SLOAD_COND;
    }

    public void setSLOAD_COND(String SLOAD_COND) {
        this.SLOAD_COND = SLOAD_COND;
    }

    public String getSOVR() {
        return SOVR;
    }

    public void setSOVR(String SOVR) {
        this.SOVR = SOVR;
    }

    public String getSPINDLE_COND() {
        return SPINDLE_COND;
    }

    public void setSPINDLE_COND(String SPINDLE_COND) {
        this.SPINDLE_COND = SPINDLE_COND;
    }

    public String getSRPM() {
        return SRPM;
    }

    public void setSRPM(String SRPM) {
        this.SRPM = SRPM;
    }

    public BigDecimal getSTEMP() {
        return STEMP;
    }

    public void setSTEMP(BigDecimal STEMP) {
        this.STEMP = STEMP;
    }


    public String getSYSTEM_COND() {
        return SYSTEM_COND;
    }

    public void setSYSTEM_COND(String SYSTEM_COND) {
        this.SYSTEM_COND = SYSTEM_COND;
    }

    public String getTOOL_NUMBER() {
        return TOOL_NUMBER;
    }

    public void setTOOL_NUMBER(String TOOL_NUMBER) {
        this.TOOL_NUMBER = TOOL_NUMBER;
    }

    public String getTOTAL_AUTO_CUT_TIME() {
        return TOTAL_AUTO_CUT_TIME;
    }

    public void setTOTAL_AUTO_CUT_TIME(String TOTAL_AUTO_CUT_TIME) {
        this.TOTAL_AUTO_CUT_TIME = TOTAL_AUTO_CUT_TIME;
    }

    public String getTOTAL_TIME() {
        return TOTAL_TIME;
    }

    public void setTOTAL_TIME(String TOTAL_TIME) {
        this.TOTAL_TIME = TOTAL_TIME;
    }

    public BigDecimal getXABS() {
        return XABS;
    }

    public void setXABS(BigDecimal XABS) {
        this.XABS = XABS;
    }

    public BigDecimal getXFRT() {
        return XFRT;
    }

    public void setXFRT(BigDecimal XFRT) {
        this.XFRT = XFRT;
    }

    public BigDecimal getXLOAD() {
        return XLOAD;
    }

    public void setXLOAD(BigDecimal XLOAD) {
        this.XLOAD = XLOAD;
    }

    public BigDecimal getXPOS() {
        return XPOS;
    }

    public void setXPOS(BigDecimal XPOS) {
        this.XPOS = XPOS;
    }

    public String getXTRAVEL() {
        return XTRAVEL;
    }

    public void setXTRAVEL(String XTRAVEL) {
        this.XTRAVEL = XTRAVEL;
    }

    public String getZTRAVEL() {
        return ZTRAVEL;
    }

    public void setZTRAVEL(String ZTRAVEL) {
        this.ZTRAVEL = ZTRAVEL;
    }
}
