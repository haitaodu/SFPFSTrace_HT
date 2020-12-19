package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 13:30
 */

@Entity
@Table(name = "CL_FCOP10", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_FCOP10 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private java.util.Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNuMber;
    private Integer WorkOrderId;
    private String IS_OK;
    private Integer DB64_DBW0;
    private Integer DB64_DBW2;
    private String DB64_DBX5_1;
    private String DB64_DBX5_2;
    private String IW406;
    private String IW408;
    private String IW412;
    private Integer QW840;
    private Integer QW841;
    private Integer QW842;
    private Integer QW843;
    private Integer QW844;
    private BigDecimal DB64_DBD6;
    private BigDecimal DB64_DBD10;
    private BigDecimal DB64_DBD14;
    private String DB64_DBX18_0;


    public String getDB64_DBX18_0() {
        return DB64_DBX18_0;
    }

    public void setDB64_DBX18_0(String DB64_DBX18_0) {
        this.DB64_DBX18_0 = DB64_DBX18_0;
    }

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }

    public BigDecimal getDB64_DBD6() {
        return DB64_DBD6;
    }

    public void setDB64_DBD6(BigDecimal DB64_DBD6) {
        this.DB64_DBD6 = DB64_DBD6;
    }

    public BigDecimal getDB64_DBD10() {
        return DB64_DBD10;
    }

    public void setDB64_DBD10(BigDecimal DB64_DBD10) {
        this.DB64_DBD10 = DB64_DBD10;
    }

    public BigDecimal getDB64_DBD14() {
        return DB64_DBD14;
    }

    public void setDB64_DBD14(BigDecimal DB64_DBD14) {
        this.DB64_DBD14 = DB64_DBD14;
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

    public String getSerialNuMber() {
        return SerialNuMber;
    }

    public void setSerialNuMber(String serialNuMber) {
        SerialNuMber = serialNuMber;
    }

    public Integer getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        WorkOrderId = workOrderId;
    }

    public Integer getDB64_DBW0() {
        return DB64_DBW0;
    }

    public void setDB64_DBW0(Integer DB64_DBW0) {
        this.DB64_DBW0 = DB64_DBW0;
    }

    public Integer getDB64_DBW2() {
        return DB64_DBW2;
    }

    public void setDB64_DBW2(Integer DB64_DBW2) {
        this.DB64_DBW2 = DB64_DBW2;
    }


    public String getDB64_DBX5_1() {
        return DB64_DBX5_1;
    }

    public void setDB64_DBX5_1(String DB64_DBX5_1) {
        this.DB64_DBX5_1 = DB64_DBX5_1;
    }

    public String getDB64_DBX5_2() {
        return DB64_DBX5_2;
    }

    public void setDB64_DBX5_2(String DB64_DBX5_2) {
        this.DB64_DBX5_2 = DB64_DBX5_2;
    }


    public String getIW406() {
        return IW406;
    }

    public void setIW406(String IW406) {
        this.IW406 = IW406;
    }

    public String getIW408() {
        return IW408;
    }

    public void setIW408(String IW408) {
        this.IW408 = IW408;
    }

    public String getIW412() {
        return IW412;
    }

    public void setIW412(String IW412) {
        this.IW412 = IW412;
    }


    public Integer getQW840() {
        return QW840;
    }

    public void setQW840(Integer QW840) {
        this.QW840 = QW840;
    }

    public Integer getQW841() {
        return QW841;
    }

    public void setQW841(Integer QW841) {
        this.QW841 = QW841;
    }

    public Integer getQW842() {
        return QW842;
    }

    public void setQW842(Integer QW842) {
        this.QW842 = QW842;
    }

    public Integer getQW843() {
        return QW843;
    }

    public void setQW843(Integer QW843) {
        this.QW843 = QW843;
    }

    public Integer getQW844() {
        return QW844;
    }

    public void setQW844(Integer QW844) {
        this.QW844 = QW844;
    }


}
