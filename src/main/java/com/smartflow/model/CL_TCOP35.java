package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/9/5 9:58
 */

@Entity
@Table(name = "CL_TCOP35", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_TCOP35 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Long WorkOrderId;
    private String DB2000_DB40;
    private String DB2000_DB552;
    private Integer DB2000_DBW2;
    private BigDecimal DB2000_DBD44;
    private BigDecimal DB2000_DBD48;
    private String IS_OK;

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

    public Long getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        WorkOrderId = workOrderId;
    }

    public String getDB2000_DB40() {
        return DB2000_DB40;
    }

    public void setDB2000_DB40(String DB2000_DB40) {
        this.DB2000_DB40 = DB2000_DB40;
    }

    public String getDB2000_DB552() {
        return DB2000_DB552;
    }

    public void setDB2000_DB552(String DB2000_DB552) {
        this.DB2000_DB552 = DB2000_DB552;
    }

    public Integer getDB2000_DBW2() {
        return DB2000_DBW2;
    }

    public void setDB2000_DBW2(Integer DB2000_DBW2) {
        this.DB2000_DBW2 = DB2000_DBW2;
    }

    public BigDecimal getDB2000_DBD44() {
        return DB2000_DBD44;
    }

    public void setDB2000_DBD44(BigDecimal DB2000_DBD44) {
        this.DB2000_DBD44 = DB2000_DBD44;
    }

    public BigDecimal getDB2000_DBD48() {
        return DB2000_DBD48;
    }

    public void setDB2000_DBD48(BigDecimal DB2000_DBD48) {
        this.DB2000_DBD48 = DB2000_DBD48;
    }

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }
}
