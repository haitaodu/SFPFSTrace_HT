package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_TCOP100")
public class CL_TCOP100 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private BigDecimal D2000;
    private BigDecimal D2001;
    private BigDecimal D2002;
    private BigDecimal D2003;
    private BigDecimal D2004;
    private BigDecimal D2005;
    private BigDecimal D2006;
    private BigDecimal D2007;
    private BigDecimal D2008;
    private String QRCODE;


    public String getQRCODE() {
        return QRCODE;
    }

    public void setQRCODE(String QRCODE) {
        this.QRCODE = QRCODE;
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

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }

    public BigDecimal getD2000() {
        return D2000;
    }

    public void setD2000(BigDecimal d2000) {
        D2000 = d2000;
    }

    public BigDecimal getD2001() {
        return D2001;
    }

    public void setD2001(BigDecimal d2001) {
        D2001 = d2001;
    }

    public BigDecimal getD2002() {
        return D2002;
    }

    public void setD2002(BigDecimal d2002) {
        D2002 = d2002;
    }

    public BigDecimal getD2003() {
        return D2003;
    }

    public void setD2003(BigDecimal d2003) {
        D2003 = d2003;
    }

    public BigDecimal getD2004() {
        return D2004;
    }

    public void setD2004(BigDecimal d2004) {
        D2004 = d2004;
    }

    public BigDecimal getD2005() {
        return D2005;
    }

    public void setD2005(BigDecimal d2005) {
        D2005 = d2005;
    }

    public BigDecimal getD2006() {
        return D2006;
    }

    public void setD2006(BigDecimal d2006) {
        D2006 = d2006;
    }

    public BigDecimal getD2007() {
        return D2007;
    }

    public void setD2007(BigDecimal d2007) {
        D2007 = d2007;
    }

    public BigDecimal getD2008() {
        return D2008;
    }

    public void setD2008(BigDecimal d2008) {
        D2008 = d2008;
    }
}
