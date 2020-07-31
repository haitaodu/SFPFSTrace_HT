package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_MAZAK_008")
public class CL_MAZAK_008 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String AUTO_TIME;
    private String AVAIL;
    private BigDecimal CABS;
    private String CAXISSTATE;
    private BigDecimal CFRT;
    private BigDecimal CLOAD;
    private String COMMS_COND;
    private String CONCENTRATION;
    private String COOLANT_COND;
    private BigDecimal COOLTEMP;
    private BigDecimal CPOS;
    private String CRFUNC;
    private String CTRAVEL;
    private String CUT_TIME;
    private String D1_ASSET_CHG;
    private String D1_ASSET_REM;
    private String DOORSTATE;
    private String ELECTRIC_COND;
    private String ESTOP;
    private String EXECUTION;
    private BigDecimal FACT;
    private String FOVR;
    private String FRAPIDOVR;
    private String FUNCTIONALMODE;
    private String HYDRA_COND;
    private String LINE;
    private String LOGIC_COND;
    private String LUBRICATION_COND;
    private String MODE2;
    private String MOTION_COND;
    private String PALLET_NUM;
    private BigDecimal PART_COUNT_ACT;
    private String PATH_SYSTEM;
    private String PEDIT_MODE;
    private String PEDIT_NAME;
    private String PNEU_COND;
    private String PROGRAM;
    private String PROGRAM_CMT;
    private String SEQUENCE_NUM;
    private String SERVO_COND;
    private BigDecimal SLOAD;
    private String SLOAD_COND;
    private String SOVR;
    private String SPINDLE_COND;
    private String SRPM;
    private BigDecimal STEMP;
    private String STEMP_COND;
    private String SUBPROGRAM;
    private String SUBPROGRAM_CMT;
    private String SYSTEM_COND;
    private String TOOL_GROUP;
    private String TOOL_NUMBER;
    private String TOOL_SUFFIX;
    private String TOTAL_AUTO_CUT_TIME;
    private String TOTAL_TIME;
    private String UNIT_NUM;
    private BigDecimal XABS;
    private String XAXISSTATE;
    private BigDecimal XFRT;
    private BigDecimal XLOAD;
    private BigDecimal XPOS;
    private String XTRAVEL;
    private BigDecimal ZABS;
    private String ZAXISSTATE;
    private BigDecimal ZFRT;
    private BigDecimal ZLOAD;
    private BigDecimal ZPOS;
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

    public String getAUTO_TIME() {
        return AUTO_TIME;
    }

    public void setAUTO_TIME(String AUTO_TIME) {
        this.AUTO_TIME = AUTO_TIME;
    }

    public String getAVAIL() {
        return AVAIL;
    }

    public void setAVAIL(String AVAIL) {
        this.AVAIL = AVAIL;
    }

    public BigDecimal getCABS() {
        return CABS;
    }

    public void setCABS(BigDecimal CABS) {
        this.CABS = CABS;
    }

    public String getCAXISSTATE() {
        return CAXISSTATE;
    }

    public void setCAXISSTATE(String CAXISSTATE) {
        this.CAXISSTATE = CAXISSTATE;
    }

    public BigDecimal getCFRT() {
        return CFRT;
    }

    public void setCFRT(BigDecimal CFRT) {
        this.CFRT = CFRT;
    }

    public BigDecimal getCLOAD() {
        return CLOAD;
    }

    public void setCLOAD(BigDecimal CLOAD) {
        this.CLOAD = CLOAD;
    }

    public String getCOMMS_COND() {
        return COMMS_COND;
    }

    public void setCOMMS_COND(String COMMS_COND) {
        this.COMMS_COND = COMMS_COND;
    }

    public String getCONCENTRATION() {
        return CONCENTRATION;
    }

    public void setCONCENTRATION(String CONCENTRATION) {
        this.CONCENTRATION = CONCENTRATION;
    }

    public String getCOOLANT_COND() {
        return COOLANT_COND;
    }

    public void setCOOLANT_COND(String COOLANT_COND) {
        this.COOLANT_COND = COOLANT_COND;
    }

    public BigDecimal getCOOLTEMP() {
        return COOLTEMP;
    }

    public void setCOOLTEMP(BigDecimal COOLTEMP) {
        this.COOLTEMP = COOLTEMP;
    }

    public BigDecimal getCPOS() {
        return CPOS;
    }

    public void setCPOS(BigDecimal CPOS) {
        this.CPOS = CPOS;
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

    public String getD1_ASSET_CHG() {
        return D1_ASSET_CHG;
    }

    public void setD1_ASSET_CHG(String d1_ASSET_CHG) {
        D1_ASSET_CHG = d1_ASSET_CHG;
    }

    public String getD1_ASSET_REM() {
        return D1_ASSET_REM;
    }

    public void setD1_ASSET_REM(String d1_ASSET_REM) {
        D1_ASSET_REM = d1_ASSET_REM;
    }

    public String getDOORSTATE() {
        return DOORSTATE;
    }

    public void setDOORSTATE(String DOORSTATE) {
        this.DOORSTATE = DOORSTATE;
    }

    public String getELECTRIC_COND() {
        return ELECTRIC_COND;
    }

    public void setELECTRIC_COND(String ELECTRIC_COND) {
        this.ELECTRIC_COND = ELECTRIC_COND;
    }

    public String getESTOP() {
        return ESTOP;
    }

    public void setESTOP(String ESTOP) {
        this.ESTOP = ESTOP;
    }

    public String getEXECUTION() {
        return EXECUTION;
    }

    public void setEXECUTION(String EXECUTION) {
        this.EXECUTION = EXECUTION;
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

    public String getFRAPIDOVR() {
        return FRAPIDOVR;
    }

    public void setFRAPIDOVR(String FRAPIDOVR) {
        this.FRAPIDOVR = FRAPIDOVR;
    }

    public String getFUNCTIONALMODE() {
        return FUNCTIONALMODE;
    }

    public void setFUNCTIONALMODE(String FUNCTIONALMODE) {
        this.FUNCTIONALMODE = FUNCTIONALMODE;
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

    public String getMODE2() {
        return MODE2;
    }

    public void setMODE2(String MODE2) {
        this.MODE2 = MODE2;
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

    public String getPATH_SYSTEM() {
        return PATH_SYSTEM;
    }

    public void setPATH_SYSTEM(String PATH_SYSTEM) {
        this.PATH_SYSTEM = PATH_SYSTEM;
    }

    public String getPEDIT_MODE() {
        return PEDIT_MODE;
    }

    public void setPEDIT_MODE(String PEDIT_MODE) {
        this.PEDIT_MODE = PEDIT_MODE;
    }

    public String getPEDIT_NAME() {
        return PEDIT_NAME;
    }

    public void setPEDIT_NAME(String PEDIT_NAME) {
        this.PEDIT_NAME = PEDIT_NAME;
    }

    public String getPNEU_COND() {
        return PNEU_COND;
    }

    public void setPNEU_COND(String PNEU_COND) {
        this.PNEU_COND = PNEU_COND;
    }

    public String getPROGRAM() {
        return PROGRAM;
    }

    public void setPROGRAM(String PROGRAM) {
        this.PROGRAM = PROGRAM;
    }

    public String getPROGRAM_CMT() {
        return PROGRAM_CMT;
    }

    public void setPROGRAM_CMT(String PROGRAM_CMT) {
        this.PROGRAM_CMT = PROGRAM_CMT;
    }

    public String getSEQUENCE_NUM() {
        return SEQUENCE_NUM;
    }

    public void setSEQUENCE_NUM(String SEQUENCE_NUM) {
        this.SEQUENCE_NUM = SEQUENCE_NUM;
    }

    public String getSERVO_COND() {
        return SERVO_COND;
    }

    public void setSERVO_COND(String SERVO_COND) {
        this.SERVO_COND = SERVO_COND;
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

    public String getSTEMP_COND() {
        return STEMP_COND;
    }

    public void setSTEMP_COND(String STEMP_COND) {
        this.STEMP_COND = STEMP_COND;
    }

    public String getSUBPROGRAM() {
        return SUBPROGRAM;
    }

    public void setSUBPROGRAM(String SUBPROGRAM) {
        this.SUBPROGRAM = SUBPROGRAM;
    }

    public String getSUBPROGRAM_CMT() {
        return SUBPROGRAM_CMT;
    }

    public void setSUBPROGRAM_CMT(String SUBPROGRAM_CMT) {
        this.SUBPROGRAM_CMT = SUBPROGRAM_CMT;
    }

    public String getSYSTEM_COND() {
        return SYSTEM_COND;
    }

    public void setSYSTEM_COND(String SYSTEM_COND) {
        this.SYSTEM_COND = SYSTEM_COND;
    }

    public String getTOOL_GROUP() {
        return TOOL_GROUP;
    }

    public void setTOOL_GROUP(String TOOL_GROUP) {
        this.TOOL_GROUP = TOOL_GROUP;
    }

    public String getTOOL_NUMBER() {
        return TOOL_NUMBER;
    }

    public void setTOOL_NUMBER(String TOOL_NUMBER) {
        this.TOOL_NUMBER = TOOL_NUMBER;
    }

    public String getTOOL_SUFFIX() {
        return TOOL_SUFFIX;
    }

    public void setTOOL_SUFFIX(String TOOL_SUFFIX) {
        this.TOOL_SUFFIX = TOOL_SUFFIX;
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

    public String getUNIT_NUM() {
        return UNIT_NUM;
    }

    public void setUNIT_NUM(String UNIT_NUM) {
        this.UNIT_NUM = UNIT_NUM;
    }

    public BigDecimal getXABS() {
        return XABS;
    }

    public void setXABS(BigDecimal XABS) {
        this.XABS = XABS;
    }

    public String getXAXISSTATE() {
        return XAXISSTATE;
    }

    public void setXAXISSTATE(String XAXISSTATE) {
        this.XAXISSTATE = XAXISSTATE;
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

    public BigDecimal getZABS() {
        return ZABS;
    }

    public void setZABS(BigDecimal ZABS) {
        this.ZABS = ZABS;
    }

    public String getZAXISSTATE() {
        return ZAXISSTATE;
    }

    public void setZAXISSTATE(String ZAXISSTATE) {
        this.ZAXISSTATE = ZAXISSTATE;
    }

    public BigDecimal getZFRT() {
        return ZFRT;
    }

    public void setZFRT(BigDecimal ZFRT) {
        this.ZFRT = ZFRT;
    }

    public BigDecimal getZLOAD() {
        return ZLOAD;
    }

    public void setZLOAD(BigDecimal ZLOAD) {
        this.ZLOAD = ZLOAD;
    }

    public BigDecimal getZPOS() {
        return ZPOS;
    }

    public void setZPOS(BigDecimal ZPOS) {
        this.ZPOS = ZPOS;
    }

    public String getZTRAVEL() {
        return ZTRAVEL;
    }

    public void setZTRAVEL(String ZTRAVEL) {
        this.ZTRAVEL = ZTRAVEL;
    }
}
