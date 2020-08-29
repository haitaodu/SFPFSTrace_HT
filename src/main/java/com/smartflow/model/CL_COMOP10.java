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
    private String DB13_DBX944_0;
    private String DB13_DBX944_1;
    private String DB1_DBX57_0;
    private String DB1_DBX57_1;
    private String M10_1;
    private String M526_0;
    private String M526_1;
    private String M526_2;
    private String M526_3;
    private String M526_4;
    private String M526_5;
    private String M526_6;
    private String M526_7;
    private String M527_0;
    private String M527_1;
    private String M527_2;
    private String M52_0;
    private String M52_1;
    private String M52_2;
    private BigDecimal MW600;
    private BigDecimal MW602;
    private BigDecimal MW604;
    private String DB13_DBX676_0;
    private String DB13_DBX718_0;
    private String IS_OK;

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

    public String getDB13_DBX944_0() {
        return DB13_DBX944_0;
    }

    public void setDB13_DBX944_0(String DB13_DBX944_0) {
        this.DB13_DBX944_0 = DB13_DBX944_0;
    }

    public String getDB13_DBX944_1() {
        return DB13_DBX944_1;
    }

    public void setDB13_DBX944_1(String DB13_DBX944_1) {
        this.DB13_DBX944_1 = DB13_DBX944_1;
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

    public String getM10_1() {
        return M10_1;
    }

    public void setM10_1(String m10_1) {
        M10_1 = m10_1;
    }

    public String getM526_0() {
        return M526_0;
    }

    public void setM526_0(String m526_0) {
        M526_0 = m526_0;
    }

    public String getM526_1() {
        return M526_1;
    }

    public void setM526_1(String m526_1) {
        M526_1 = m526_1;
    }

    public String getM526_2() {
        return M526_2;
    }

    public void setM526_2(String m526_2) {
        M526_2 = m526_2;
    }

    public String getM526_3() {
        return M526_3;
    }

    public void setM526_3(String m526_3) {
        M526_3 = m526_3;
    }

    public String getM526_4() {
        return M526_4;
    }

    public void setM526_4(String m526_4) {
        M526_4 = m526_4;
    }

    public String getM526_5() {
        return M526_5;
    }

    public void setM526_5(String m526_5) {
        M526_5 = m526_5;
    }

    public String getM526_6() {
        return M526_6;
    }

    public void setM526_6(String m526_6) {
        M526_6 = m526_6;
    }

    public String getM526_7() {
        return M526_7;
    }

    public void setM526_7(String m526_7) {
        M526_7 = m526_7;
    }

    public String getM527_0() {
        return M527_0;
    }

    public void setM527_0(String m527_0) {
        M527_0 = m527_0;
    }

    public String getM527_1() {
        return M527_1;
    }

    public void setM527_1(String m527_1) {
        M527_1 = m527_1;
    }

    public String getM527_2() {
        return M527_2;
    }

    public void setM527_2(String m527_2) {
        M527_2 = m527_2;
    }

    public String getM52_0() {
        return M52_0;
    }

    public void setM52_0(String m52_0) {
        M52_0 = m52_0;
    }

    public String getM52_1() {
        return M52_1;
    }

    public void setM52_1(String m52_1) {
        M52_1 = m52_1;
    }

    public String getM52_2() {
        return M52_2;
    }

    public void setM52_2(String m52_2) {
        M52_2 = m52_2;
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
}
