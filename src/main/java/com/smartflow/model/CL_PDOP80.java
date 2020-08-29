package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_PDOP80")
public class CL_PDOP80 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private BigDecimal DB12_DBD520;
    private BigDecimal DB12_DBD524;
    private BigDecimal DB12_DBD530;
    private BigDecimal DB12_DBD534;
    private BigDecimal DB12_DBW514;
    private BigDecimal DB12_DBW516;
    private BigDecimal DB12_DBW518;
    private BigDecimal DB12_DBW528;
    private String DB12_DBX580_0;
    private String DB12_DBX580_1;
    private BigDecimal DB3_DBD56;
    private BigDecimal DB3_DBD60;
    private String DB3_DBX5_3;
    private String DB4_DBX56_3;
    private String DB4_DBX56_4;
    private String DB4_DBX56_6;
    private String DB4_DBX56_7;
    private String DB4_DBX57_2;
    private String DB4_DBX57_3;
    private String M105_0;
    private String M105_1;
    private String M105_2;
    private String M300_0;
    private String M300_1;
    private String M300_2;
    private String M300_3;
    private String M300_4;
    private String M300_5;
    private String M300_6;
    private String M300_7;
    private String M316_0;
    private String M316_1;
    private String M316_2;
    private String M316_3;
    private String M316_4;
    private String DB12_DBX538_0;

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

    public BigDecimal getDB12_DBD520() {
        return DB12_DBD520;
    }

    public void setDB12_DBD520(BigDecimal DB12_DBD520) {
        this.DB12_DBD520 = DB12_DBD520;
    }

    public BigDecimal getDB12_DBD524() {
        return DB12_DBD524;
    }

    public void setDB12_DBD524(BigDecimal DB12_DBD524) {
        this.DB12_DBD524 = DB12_DBD524;
    }

    public BigDecimal getDB12_DBD530() {
        return DB12_DBD530;
    }

    public void setDB12_DBD530(BigDecimal DB12_DBD530) {
        this.DB12_DBD530 = DB12_DBD530;
    }

    public BigDecimal getDB12_DBD534() {
        return DB12_DBD534;
    }

    public void setDB12_DBD534(BigDecimal DB12_DBD534) {
        this.DB12_DBD534 = DB12_DBD534;
    }

    public BigDecimal getDB12_DBW514() {
        return DB12_DBW514;
    }

    public void setDB12_DBW514(BigDecimal DB12_DBW514) {
        this.DB12_DBW514 = DB12_DBW514;
    }

    public BigDecimal getDB12_DBW516() {
        return DB12_DBW516;
    }

    public void setDB12_DBW516(BigDecimal DB12_DBW516) {
        this.DB12_DBW516 = DB12_DBW516;
    }

    public BigDecimal getDB12_DBW518() {
        return DB12_DBW518;
    }

    public void setDB12_DBW518(BigDecimal DB12_DBW518) {
        this.DB12_DBW518 = DB12_DBW518;
    }

    public BigDecimal getDB12_DBW528() {
        return DB12_DBW528;
    }

    public void setDB12_DBW528(BigDecimal DB12_DBW528) {
        this.DB12_DBW528 = DB12_DBW528;
    }

    public String getDB12_DBX580_0() {
        return DB12_DBX580_0;
    }

    public void setDB12_DBX580_0(String DB12_DBX580_0) {
        this.DB12_DBX580_0 = DB12_DBX580_0;
    }

    public String getDB12_DBX580_1() {
        return DB12_DBX580_1;
    }

    public void setDB12_DBX580_1(String DB12_DBX580_1) {
        this.DB12_DBX580_1 = DB12_DBX580_1;
    }

    public BigDecimal getDB3_DBD56() {
        return DB3_DBD56;
    }

    public void setDB3_DBD56(BigDecimal DB3_DBD56) {
        this.DB3_DBD56 = DB3_DBD56;
    }

    public BigDecimal getDB3_DBD60() {
        return DB3_DBD60;
    }

    public void setDB3_DBD60(BigDecimal DB3_DBD60) {
        this.DB3_DBD60 = DB3_DBD60;
    }

    public String getDB3_DBX5_3() {
        return DB3_DBX5_3;
    }

    public void setDB3_DBX5_3(String DB3_DBX5_3) {
        this.DB3_DBX5_3 = DB3_DBX5_3;
    }

    public String getDB4_DBX56_3() {
        return DB4_DBX56_3;
    }

    public void setDB4_DBX56_3(String DB4_DBX56_3) {
        this.DB4_DBX56_3 = DB4_DBX56_3;
    }

    public String getDB4_DBX56_4() {
        return DB4_DBX56_4;
    }

    public void setDB4_DBX56_4(String DB4_DBX56_4) {
        this.DB4_DBX56_4 = DB4_DBX56_4;
    }

    public String getDB4_DBX56_6() {
        return DB4_DBX56_6;
    }

    public void setDB4_DBX56_6(String DB4_DBX56_6) {
        this.DB4_DBX56_6 = DB4_DBX56_6;
    }

    public String getDB4_DBX56_7() {
        return DB4_DBX56_7;
    }

    public void setDB4_DBX56_7(String DB4_DBX56_7) {
        this.DB4_DBX56_7 = DB4_DBX56_7;
    }

    public String getDB4_DBX57_2() {
        return DB4_DBX57_2;
    }

    public void setDB4_DBX57_2(String DB4_DBX57_2) {
        this.DB4_DBX57_2 = DB4_DBX57_2;
    }

    public String getDB4_DBX57_3() {
        return DB4_DBX57_3;
    }

    public void setDB4_DBX57_3(String DB4_DBX57_3) {
        this.DB4_DBX57_3 = DB4_DBX57_3;
    }

    public String getM105_0() {
        return M105_0;
    }

    public void setM105_0(String m105_0) {
        M105_0 = m105_0;
    }

    public String getM105_1() {
        return M105_1;
    }

    public void setM105_1(String m105_1) {
        M105_1 = m105_1;
    }

    public String getM105_2() {
        return M105_2;
    }

    public void setM105_2(String m105_2) {
        M105_2 = m105_2;
    }

    public String getM300_0() {
        return M300_0;
    }

    public void setM300_0(String m300_0) {
        M300_0 = m300_0;
    }

    public String getM300_1() {
        return M300_1;
    }

    public void setM300_1(String m300_1) {
        M300_1 = m300_1;
    }

    public String getM300_2() {
        return M300_2;
    }

    public void setM300_2(String m300_2) {
        M300_2 = m300_2;
    }

    public String getM300_3() {
        return M300_3;
    }

    public void setM300_3(String m300_3) {
        M300_3 = m300_3;
    }

    public String getM300_4() {
        return M300_4;
    }

    public void setM300_4(String m300_4) {
        M300_4 = m300_4;
    }

    public String getM300_5() {
        return M300_5;
    }

    public void setM300_5(String m300_5) {
        M300_5 = m300_5;
    }

    public String getM300_6() {
        return M300_6;
    }

    public void setM300_6(String m300_6) {
        M300_6 = m300_6;
    }

    public String getM300_7() {
        return M300_7;
    }

    public void setM300_7(String m300_7) {
        M300_7 = m300_7;
    }

    public String getM316_0() {
        return M316_0;
    }

    public void setM316_0(String m316_0) {
        M316_0 = m316_0;
    }

    public String getM316_1() {
        return M316_1;
    }

    public void setM316_1(String m316_1) {
        M316_1 = m316_1;
    }

    public String getM316_2() {
        return M316_2;
    }

    public void setM316_2(String m316_2) {
        M316_2 = m316_2;
    }

    public String getM316_3() {
        return M316_3;
    }

    public void setM316_3(String m316_3) {
        M316_3 = m316_3;
    }

    public String getM316_4() {
        return M316_4;
    }

    public void setM316_4(String m316_4) {
        M316_4 = m316_4;
    }

    public String getDB12_DBX538_0() {
        return DB12_DBX538_0;
    }

    public void setDB12_DBX538_0(String DB12_DBX538_0) {
        this.DB12_DBX538_0 = DB12_DBX538_0;
    }
}
