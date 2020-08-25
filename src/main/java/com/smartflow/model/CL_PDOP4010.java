package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:28
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_PDOP4010", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_PDOP4010 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String MACHINETOOL;
    private String UUID;
    private java.util.Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String DB15DB120;
    private String DB15DB160;
    private String DB15DB360;
    private String DB15DB400;
    private String DB15DBx6584;
    private String DB15DBx6585;
    private String DB15DBx6586;
    private String DB15DBx6587;


    public String getMACHINETOOL() {
        return MACHINETOOL;
    }

    public void setMACHINETOOL(String MACHINETOOL) {
        this.MACHINETOOL = MACHINETOOL;
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

    @Basic
    @Column(name = "DB15_DB120", nullable = true, length = 4000)
    public String getDB15DB120() {
        return DB15DB120;
    }

    public void setDB15DB120(String DB15DB120) {
        this.DB15DB120 = DB15DB120;
    }

    @Basic
    @Column(name = "DB15_DB160", nullable = true, length = 4000)
    public String getDB15DB160() {
        return DB15DB160;
    }

    public void setDB15DB160(String DB15DB160) {
        this.DB15DB160 = DB15DB160;
    }

    @Basic
    @Column(name = "DB15_DB360", nullable = true, length = 4000)
    public String getDB15DB360() {
        return DB15DB360;
    }

    public void setDB15DB360(String DB15DB360) {
        this.DB15DB360 = DB15DB360;
    }

    @Basic
    @Column(name = "DB15_DB400", nullable = true, length = 4000)
    public String getDB15DB400() {
        return DB15DB400;
    }

    public void setDB15DB400(String DB15DB400) {
        this.DB15DB400 = DB15DB400;
    }

    @Basic
    @Column(name = "DB15_DBX658_4", nullable = true, length = 2)
    public String getDB15DBx6584() {
        return DB15DBx6584;
    }

    public void setDB15DBx6584(String DB15DBx6584) {
        this.DB15DBx6584 = DB15DBx6584;
    }

    @Basic
    @Column(name = "DB15_DBX658_5", nullable = true, length = 2)
    public String getDB15DBx6585() {
        return DB15DBx6585;
    }

    public void setDB15DBx6585(String DB15DBx6585) {
        this.DB15DBx6585 = DB15DBx6585;
    }

    @Basic
    @Column(name = "DB15_DBX658_6", nullable = true, length = 2)
    public String getDB15DBx6586() {
        return DB15DBx6586;
    }

    public void setDB15DBx6586(String DB15DBx6586) {
        this.DB15DBx6586 = DB15DBx6586;
    }

    @Basic
    @Column(name = "DB15_DBX658_7", nullable = true, length = 2)
    public String getDB15DBx6587() {
        return DB15DBx6587;
    }

    public void setDB15DBx6587(String DB15DBx6587) {
        this.DB15DBx6587 = DB15DBx6587;
    }


}
