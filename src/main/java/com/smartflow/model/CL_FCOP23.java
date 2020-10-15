package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/7 16:35
 */

@Entity
@Table(name = "CL_FCOP23", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_FCOP23 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String IS_OK;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String DB2000_DB12;
    private Integer DB2000_DBW2;
    private String DB2000_DBD40;
    private String DB2000_DBD44;
    private String DB2000_DBD48;

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

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
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

    public String getDB2000_DB12() {
        return DB2000_DB12;
    }

    public void setDB2000_DB12(String DB2000_DB12) {
        this.DB2000_DB12 = DB2000_DB12;
    }

    public Integer getDB2000_DBW2() {
        return DB2000_DBW2;
    }

    public void setDB2000_DBW2(Integer DB2000_DBW2) {
        this.DB2000_DBW2 = DB2000_DBW2;
    }

    public String getDB2000_DBD40() {
        return DB2000_DBD40;
    }

    public void setDB2000_DBD40(String DB2000_DBD40) {
        this.DB2000_DBD40 = DB2000_DBD40;
    }

    public String getDB2000_DBD44() {
        return DB2000_DBD44;
    }

    public void setDB2000_DBD44(String DB2000_DBD44) {
        this.DB2000_DBD44 = DB2000_DBD44;
    }

    public String getDB2000_DBD48() {
        return DB2000_DBD48;
    }

    public void setDB2000_DBD48(String DB2000_DBD48) {
        this.DB2000_DBD48 = DB2000_DBD48;
    }
}
