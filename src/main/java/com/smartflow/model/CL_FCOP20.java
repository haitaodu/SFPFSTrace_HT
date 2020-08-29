package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "core.CL_FCOP20")
public class CL_FCOP20 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String ALARM1;
    private String ALARM10;
    private String ALARM11;
    private String ALARM2;
    private String ALARM3;
    private String ALARM4;
    private String ALARM5;
    private String ALARM6;
    private String ALARM7;
    private String ALARM8;
    private String ALARM9;
    private String IS_ALARM;
    private String IS_RUN;
    private String POSI_ABS_;
    private String POSI_ABS_X;
    private String POSI_ABS_Z;
    private String POSI_DIST_;
    private String POSI_DIST_X;
    private String POSI_DIST_Z;
    private String POSI_MACH_;
    private String POSI_MACH_X;
    private String POSI_MACH_Z;
    private String POSI_REL_;
    private String POSI_REL_U;
    private String POSI_REL_W;
    private String TOOL_GROUP_NO;
    private String TOOL_NO;
    private String TOOL_NUM;
    private String TOOL_USE_CT;

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

    public String getALARM1() {
        return ALARM1;
    }

    public void setALARM1(String ALARM1) {
        this.ALARM1 = ALARM1;
    }

    public String getALARM10() {
        return ALARM10;
    }

    public void setALARM10(String ALARM10) {
        this.ALARM10 = ALARM10;
    }

    public String getALARM11() {
        return ALARM11;
    }

    public void setALARM11(String ALARM11) {
        this.ALARM11 = ALARM11;
    }

    public String getALARM2() {
        return ALARM2;
    }

    public void setALARM2(String ALARM2) {
        this.ALARM2 = ALARM2;
    }

    public String getALARM3() {
        return ALARM3;
    }

    public void setALARM3(String ALARM3) {
        this.ALARM3 = ALARM3;
    }

    public String getALARM4() {
        return ALARM4;
    }

    public void setALARM4(String ALARM4) {
        this.ALARM4 = ALARM4;
    }

    public String getALARM5() {
        return ALARM5;
    }

    public void setALARM5(String ALARM5) {
        this.ALARM5 = ALARM5;
    }

    public String getALARM6() {
        return ALARM6;
    }

    public void setALARM6(String ALARM6) {
        this.ALARM6 = ALARM6;
    }

    public String getALARM7() {
        return ALARM7;
    }

    public void setALARM7(String ALARM7) {
        this.ALARM7 = ALARM7;
    }

    public String getALARM8() {
        return ALARM8;
    }

    public void setALARM8(String ALARM8) {
        this.ALARM8 = ALARM8;
    }

    public String getALARM9() {
        return ALARM9;
    }

    public void setALARM9(String ALARM9) {
        this.ALARM9 = ALARM9;
    }

    public String getIS_ALARM() {
        return IS_ALARM;
    }

    public void setIS_ALARM(String IS_ALARM) {
        this.IS_ALARM = IS_ALARM;
    }

    public String getIS_RUN() {
        return IS_RUN;
    }

    public void setIS_RUN(String IS_RUN) {
        this.IS_RUN = IS_RUN;
    }

    public String getPOSI_ABS_() {
        return POSI_ABS_;
    }

    public void setPOSI_ABS_(String POSI_ABS_) {
        this.POSI_ABS_ = POSI_ABS_;
    }

    public String getPOSI_ABS_X() {
        return POSI_ABS_X;
    }

    public void setPOSI_ABS_X(String POSI_ABS_X) {
        this.POSI_ABS_X = POSI_ABS_X;
    }

    public String getPOSI_ABS_Z() {
        return POSI_ABS_Z;
    }

    public void setPOSI_ABS_Z(String POSI_ABS_Z) {
        this.POSI_ABS_Z = POSI_ABS_Z;
    }

    public String getPOSI_DIST_() {
        return POSI_DIST_;
    }

    public void setPOSI_DIST_(String POSI_DIST_) {
        this.POSI_DIST_ = POSI_DIST_;
    }

    public String getPOSI_DIST_X() {
        return POSI_DIST_X;
    }

    public void setPOSI_DIST_X(String POSI_DIST_X) {
        this.POSI_DIST_X = POSI_DIST_X;
    }

    public String getPOSI_DIST_Z() {
        return POSI_DIST_Z;
    }

    public void setPOSI_DIST_Z(String POSI_DIST_Z) {
        this.POSI_DIST_Z = POSI_DIST_Z;
    }

    public String getPOSI_MACH_() {
        return POSI_MACH_;
    }

    public void setPOSI_MACH_(String POSI_MACH_) {
        this.POSI_MACH_ = POSI_MACH_;
    }

    public String getPOSI_MACH_X() {
        return POSI_MACH_X;
    }

    public void setPOSI_MACH_X(String POSI_MACH_X) {
        this.POSI_MACH_X = POSI_MACH_X;
    }

    public String getPOSI_MACH_Z() {
        return POSI_MACH_Z;
    }

    public void setPOSI_MACH_Z(String POSI_MACH_Z) {
        this.POSI_MACH_Z = POSI_MACH_Z;
    }

    public String getPOSI_REL_() {
        return POSI_REL_;
    }

    public void setPOSI_REL_(String POSI_REL_) {
        this.POSI_REL_ = POSI_REL_;
    }

    public String getPOSI_REL_U() {
        return POSI_REL_U;
    }

    public void setPOSI_REL_U(String POSI_REL_U) {
        this.POSI_REL_U = POSI_REL_U;
    }

    public String getPOSI_REL_W() {
        return POSI_REL_W;
    }

    public void setPOSI_REL_W(String POSI_REL_W) {
        this.POSI_REL_W = POSI_REL_W;
    }

    public String getTOOL_GROUP_NO() {
        return TOOL_GROUP_NO;
    }

    public void setTOOL_GROUP_NO(String TOOL_GROUP_NO) {
        this.TOOL_GROUP_NO = TOOL_GROUP_NO;
    }

    public String getTOOL_NO() {
        return TOOL_NO;
    }

    public void setTOOL_NO(String TOOL_NO) {
        this.TOOL_NO = TOOL_NO;
    }

    public String getTOOL_NUM() {
        return TOOL_NUM;
    }

    public void setTOOL_NUM(String TOOL_NUM) {
        this.TOOL_NUM = TOOL_NUM;
    }

    public String getTOOL_USE_CT() {
        return TOOL_USE_CT;
    }

    public void setTOOL_USE_CT(String TOOL_USE_CT) {
        this.TOOL_USE_CT = TOOL_USE_CT;
    }
}
