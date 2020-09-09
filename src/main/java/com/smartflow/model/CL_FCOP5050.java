package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:20
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_FCOP5050", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_FCOP5050 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATEDATE;
    private String MACHINETOOL;
    private String ISSYNCH;
    private String SerialNumber;
    private Long WorkOrderId;
    private String IS_OK;
    private String DB9DB120;
    private String DB9DB80;
    private String DB9DBx3704;
    private String DB9DBx3705;

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

    public Date getCREATEDATE() {
        return CREATEDATE;
    }

    public void setCREATEDATE(Date CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }

    public String getMACHINETOOL() {
        return MACHINETOOL;
    }

    public void setMACHINETOOL(String MACHINETOOL) {
        this.MACHINETOOL = MACHINETOOL;
    }

    public String getISSYNCH() {
        return ISSYNCH;
    }

    public void setISSYNCH(String ISSYNCH) {
        this.ISSYNCH = ISSYNCH;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public Long getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        WorkOrderId = workOrderId;
    }

    public String getDB9DB120() {
        return DB9DB120;
    }

    public void setDB9DB120(String DB9DB120) {
        this.DB9DB120 = DB9DB120;
    }

    public String getDB9DB80() {
        return DB9DB80;
    }

    public void setDB9DB80(String DB9DB80) {
        this.DB9DB80 = DB9DB80;
    }

    public String getDB9DBx3704() {
        return DB9DBx3704;
    }

    public void setDB9DBx3704(String DB9DBx3704) {
        this.DB9DBx3704 = DB9DBx3704;
    }

    public String getDB9DBx3705() {
        return DB9DBx3705;
    }

    public void setDB9DBx3705(String DB9DBx3705) {
        this.DB9DBx3705 = DB9DBx3705;
    }
}
