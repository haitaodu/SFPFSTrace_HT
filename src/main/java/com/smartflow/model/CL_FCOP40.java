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
 * @date ：Created in 2020/8/7 17:25
 */

@Entity
@Table(name = "core.CL_FCOP40")
public class CL_FCOP40 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private BigDecimal DB64_DBD48;
    private BigDecimal DB64_DBD52;
    private BigDecimal DB64_DBD56;
    private BigDecimal DB64_DBD60;
    private BigDecimal DB64_DBD64;
    private BigDecimal DB64_DBD68;
    private BigDecimal DB64_DBD72;
    private BigDecimal DB64_DBD76;
    private BigDecimal DB64_DBD80;
    private BigDecimal DB64_DBD84;
    private BigDecimal DB64_DBD88;
    private BigDecimal DB64_DBD92;
    private Integer DB64_DBW0;
    private String DB64_DBX136_0;
    private String DB64_DBX96_0;
    private String QW840;
    private String QW841;
    private String QW842;
    private String QW843;
    private String QW844;
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

    public Integer getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        WorkOrderId = workOrderId;
    }

    public BigDecimal getDB64_DBD48() {
        return DB64_DBD48;
    }

    public void setDB64_DBD48(BigDecimal DB64_DBD48) {
        this.DB64_DBD48 = DB64_DBD48;
    }

    public BigDecimal getDB64_DBD52() {
        return DB64_DBD52;
    }

    public void setDB64_DBD52(BigDecimal DB64_DBD52) {
        this.DB64_DBD52 = DB64_DBD52;
    }

    public BigDecimal getDB64_DBD56() {
        return DB64_DBD56;
    }

    public void setDB64_DBD56(BigDecimal DB64_DBD56) {
        this.DB64_DBD56 = DB64_DBD56;
    }

    public BigDecimal getDB64_DBD60() {
        return DB64_DBD60;
    }

    public void setDB64_DBD60(BigDecimal DB64_DBD60) {
        this.DB64_DBD60 = DB64_DBD60;
    }

    public BigDecimal getDB64_DBD64() {
        return DB64_DBD64;
    }

    public void setDB64_DBD64(BigDecimal DB64_DBD64) {
        this.DB64_DBD64 = DB64_DBD64;
    }

    public BigDecimal getDB64_DBD68() {
        return DB64_DBD68;
    }

    public void setDB64_DBD68(BigDecimal DB64_DBD68) {
        this.DB64_DBD68 = DB64_DBD68;
    }

    public BigDecimal getDB64_DBD72() {
        return DB64_DBD72;
    }

    public void setDB64_DBD72(BigDecimal DB64_DBD72) {
        this.DB64_DBD72 = DB64_DBD72;
    }

    public BigDecimal getDB64_DBD76() {
        return DB64_DBD76;
    }

    public void setDB64_DBD76(BigDecimal DB64_DBD76) {
        this.DB64_DBD76 = DB64_DBD76;
    }

    public BigDecimal getDB64_DBD80() {
        return DB64_DBD80;
    }

    public void setDB64_DBD80(BigDecimal DB64_DBD80) {
        this.DB64_DBD80 = DB64_DBD80;
    }

    public BigDecimal getDB64_DBD84() {
        return DB64_DBD84;
    }

    public void setDB64_DBD84(BigDecimal DB64_DBD84) {
        this.DB64_DBD84 = DB64_DBD84;
    }

    public BigDecimal getDB64_DBD88() {
        return DB64_DBD88;
    }

    public void setDB64_DBD88(BigDecimal DB64_DBD88) {
        this.DB64_DBD88 = DB64_DBD88;
    }

    public BigDecimal getDB64_DBD92() {
        return DB64_DBD92;
    }

    public void setDB64_DBD92(BigDecimal DB64_DBD92) {
        this.DB64_DBD92 = DB64_DBD92;
    }

    public Integer getDB64_DBW0() {
        return DB64_DBW0;
    }

    public void setDB64_DBW0(Integer DB64_DBW0) {
        this.DB64_DBW0 = DB64_DBW0;
    }

    public String getDB64_DBX136_0() {
        return DB64_DBX136_0;
    }

    public void setDB64_DBX136_0(String DB64_DBX136_0) {
        this.DB64_DBX136_0 = DB64_DBX136_0;
    }

    public String getDB64_DBX96_0() {
        return DB64_DBX96_0;
    }

    public void setDB64_DBX96_0(String DB64_DBX96_0) {
        this.DB64_DBX96_0 = DB64_DBX96_0;
    }

    public String getQW840() {
        return QW840;
    }

    public void setQW840(String QW840) {
        this.QW840 = QW840;
    }

    public String getQW841() {
        return QW841;
    }

    public void setQW841(String QW841) {
        this.QW841 = QW841;
    }

    public String getQW842() {
        return QW842;
    }

    public void setQW842(String QW842) {
        this.QW842 = QW842;
    }

    public String getQW843() {
        return QW843;
    }

    public void setQW843(String QW843) {
        this.QW843 = QW843;
    }

    public String getQW844() {
        return QW844;
    }

    public void setQW844(String QW844) {
        this.QW844 = QW844;
    }

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }
}
