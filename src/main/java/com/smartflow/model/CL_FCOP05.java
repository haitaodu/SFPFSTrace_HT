package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ：tao
 * @date ：Created in 2020/7/13 13:43
 */

@Entity
@Table(name = "CL_FCOP05", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_FCOP05 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String DB100_DB330;
    private String DB100_DBD0_40;
    private String DB100_DBD40_40;
    private String DB100_DBX328_0;
    private String DB100_DBX80_0;
    private String DB100_DBX80_2;
    private String DB100_DBX80_3;
    private String DB100_DBX80_4;
    private String DB100_DBX80_5;
    private String DB100_DBX80_6;


    public String getDB100_DBX328_0() {
        return DB100_DBX328_0;
    }

    public void setDB100_DBX328_0(String DB100_DBX328_0) {
        this.DB100_DBX328_0 = DB100_DBX328_0;
    }

    public String getDB100_DB330() {
        return DB100_DB330;
    }

    public void setDB100_DB330(String DB100_DB330) {
        this.DB100_DB330 = DB100_DB330;
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

    public String getDB100_DBD0_40() {
        return DB100_DBD0_40;
    }

    public void setDB100_DBD0_40(String DB100_DBD0_40) {
        this.DB100_DBD0_40 = DB100_DBD0_40;
    }

    public String getDB100_DBD40_40() {
        return DB100_DBD40_40;
    }

    public void setDB100_DBD40_40(String DB100_DBD40_40) {
        this.DB100_DBD40_40 = DB100_DBD40_40;
    }

    public String getDB100_DBX80_0() {
        return DB100_DBX80_0;
    }

    public void setDB100_DBX80_0(String DB100_DBX80_0) {
        this.DB100_DBX80_0 = DB100_DBX80_0;
    }


    public String getDB100_DBX80_2() {
        return DB100_DBX80_2;
    }

    public void setDB100_DBX80_2(String DB100_DBX80_2) {
        this.DB100_DBX80_2 = DB100_DBX80_2;
    }

    public String getDB100_DBX80_3() {
        return DB100_DBX80_3;
    }

    public void setDB100_DBX80_3(String DB100_DBX80_3) {
        this.DB100_DBX80_3 = DB100_DBX80_3;
    }

    public String getDB100_DBX80_4() {
        return DB100_DBX80_4;
    }

    public void setDB100_DBX80_4(String DB100_DBX80_4) {
        this.DB100_DBX80_4 = DB100_DBX80_4;
    }

    public String getDB100_DBX80_5() {
        return DB100_DBX80_5;
    }

    public void setDB100_DBX80_5(String DB100_DBX80_5) {
        this.DB100_DBX80_5 = DB100_DBX80_5;
    }

    public String getDB100_DBX80_6() {
        return DB100_DBX80_6;
    }

    public void setDB100_DBX80_6(String DB100_DBX80_6) {
        this.DB100_DBX80_6 = DB100_DBX80_6;
    }


}
