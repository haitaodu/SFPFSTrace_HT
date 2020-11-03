package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_IMOP73")
public class CL_IMOP73 {
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
    private String DB2000_DB552;
    private BigDecimal DB2000_DBD100;
    private BigDecimal DB2000_DBD104;
    private BigDecimal DB2000_DBD108;
    private BigDecimal DB2000_DBD112;
    private BigDecimal DB2000_DBD116;
    private BigDecimal DB2000_DBD120;
    private BigDecimal DB2000_DBD124;
    private BigDecimal DB2000_DBD128;
    private BigDecimal DB2000_DBD132;
    private BigDecimal DB2000_DBD136;
    private BigDecimal DB2000_DBD140;
    private BigDecimal DB2000_DBD144;
    private BigDecimal DB2000_DBD148;
    private BigDecimal DB2000_DBD152;
    private BigDecimal DB2000_DBD156;
    private BigDecimal DB2000_DBD40;
    private BigDecimal DB2000_DBD44;
    private BigDecimal DB2000_DBD48;
    private BigDecimal DB2000_DBD52;
    private BigDecimal DB2000_DBD56;
    private BigDecimal DB2000_DBD60;
    private BigDecimal DB2000_DBD64;
    private BigDecimal DB2000_DBD68;
    private BigDecimal DB2000_DBD72;
    private BigDecimal DB2000_DBD76;
    private BigDecimal DB2000_DBD80;
    private BigDecimal DB2000_DBD84;
    private BigDecimal DB2000_DBD88;
    private BigDecimal DB2000_DBD92;
    private BigDecimal DB2000_DBD96;
    private BigDecimal DB2000_DBW2;

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

    public String getDB2000_DB552() {
        return DB2000_DB552;
    }

    public void setDB2000_DB552(String DB2000_DB552) {
        this.DB2000_DB552 = DB2000_DB552;
    }

    public BigDecimal getDB2000_DBD100() {
        return DB2000_DBD100;
    }

    public void setDB2000_DBD100(BigDecimal DB2000_DBD100) {
        this.DB2000_DBD100 = DB2000_DBD100;
    }

    public BigDecimal getDB2000_DBD104() {
        return DB2000_DBD104;
    }

    public void setDB2000_DBD104(BigDecimal DB2000_DBD104) {
        this.DB2000_DBD104 = DB2000_DBD104;
    }

    public BigDecimal getDB2000_DBD108() {
        return DB2000_DBD108;
    }

    public void setDB2000_DBD108(BigDecimal DB2000_DBD108) {
        this.DB2000_DBD108 = DB2000_DBD108;
    }

    public BigDecimal getDB2000_DBD112() {
        return DB2000_DBD112;
    }

    public void setDB2000_DBD112(BigDecimal DB2000_DBD112) {
        this.DB2000_DBD112 = DB2000_DBD112;
    }

    public BigDecimal getDB2000_DBD116() {
        return DB2000_DBD116;
    }

    public void setDB2000_DBD116(BigDecimal DB2000_DBD116) {
        this.DB2000_DBD116 = DB2000_DBD116;
    }

    public BigDecimal getDB2000_DBD120() {
        return DB2000_DBD120;
    }

    public void setDB2000_DBD120(BigDecimal DB2000_DBD120) {
        this.DB2000_DBD120 = DB2000_DBD120;
    }

    public BigDecimal getDB2000_DBD124() {
        return DB2000_DBD124;
    }

    public void setDB2000_DBD124(BigDecimal DB2000_DBD124) {
        this.DB2000_DBD124 = DB2000_DBD124;
    }

    public BigDecimal getDB2000_DBD128() {
        return DB2000_DBD128;
    }

    public void setDB2000_DBD128(BigDecimal DB2000_DBD128) {
        this.DB2000_DBD128 = DB2000_DBD128;
    }

    public BigDecimal getDB2000_DBD132() {
        return DB2000_DBD132;
    }

    public void setDB2000_DBD132(BigDecimal DB2000_DBD132) {
        this.DB2000_DBD132 = DB2000_DBD132;
    }

    public BigDecimal getDB2000_DBD136() {
        return DB2000_DBD136;
    }

    public void setDB2000_DBD136(BigDecimal DB2000_DBD136) {
        this.DB2000_DBD136 = DB2000_DBD136;
    }

    public BigDecimal getDB2000_DBD140() {
        return DB2000_DBD140;
    }

    public void setDB2000_DBD140(BigDecimal DB2000_DBD140) {
        this.DB2000_DBD140 = DB2000_DBD140;
    }

    public BigDecimal getDB2000_DBD144() {
        return DB2000_DBD144;
    }

    public void setDB2000_DBD144(BigDecimal DB2000_DBD144) {
        this.DB2000_DBD144 = DB2000_DBD144;
    }

    public BigDecimal getDB2000_DBD148() {
        return DB2000_DBD148;
    }

    public void setDB2000_DBD148(BigDecimal DB2000_DBD148) {
        this.DB2000_DBD148 = DB2000_DBD148;
    }

    public BigDecimal getDB2000_DBD152() {
        return DB2000_DBD152;
    }

    public void setDB2000_DBD152(BigDecimal DB2000_DBD152) {
        this.DB2000_DBD152 = DB2000_DBD152;
    }

    public BigDecimal getDB2000_DBD156() {
        return DB2000_DBD156;
    }

    public void setDB2000_DBD156(BigDecimal DB2000_DBD156) {
        this.DB2000_DBD156 = DB2000_DBD156;
    }

    public BigDecimal getDB2000_DBD40() {
        return DB2000_DBD40;
    }

    public void setDB2000_DBD40(BigDecimal DB2000_DBD40) {
        this.DB2000_DBD40 = DB2000_DBD40;
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

    public BigDecimal getDB2000_DBD52() {
        return DB2000_DBD52;
    }

    public void setDB2000_DBD52(BigDecimal DB2000_DBD52) {
        this.DB2000_DBD52 = DB2000_DBD52;
    }

    public BigDecimal getDB2000_DBD56() {
        return DB2000_DBD56;
    }

    public void setDB2000_DBD56(BigDecimal DB2000_DBD56) {
        this.DB2000_DBD56 = DB2000_DBD56;
    }

    public BigDecimal getDB2000_DBD60() {
        return DB2000_DBD60;
    }

    public void setDB2000_DBD60(BigDecimal DB2000_DBD60) {
        this.DB2000_DBD60 = DB2000_DBD60;
    }

    public BigDecimal getDB2000_DBD64() {
        return DB2000_DBD64;
    }

    public void setDB2000_DBD64(BigDecimal DB2000_DBD64) {
        this.DB2000_DBD64 = DB2000_DBD64;
    }

    public BigDecimal getDB2000_DBD68() {
        return DB2000_DBD68;
    }

    public void setDB2000_DBD68(BigDecimal DB2000_DBD68) {
        this.DB2000_DBD68 = DB2000_DBD68;
    }

    public BigDecimal getDB2000_DBD72() {
        return DB2000_DBD72;
    }

    public void setDB2000_DBD72(BigDecimal DB2000_DBD72) {
        this.DB2000_DBD72 = DB2000_DBD72;
    }

    public BigDecimal getDB2000_DBD76() {
        return DB2000_DBD76;
    }

    public void setDB2000_DBD76(BigDecimal DB2000_DBD76) {
        this.DB2000_DBD76 = DB2000_DBD76;
    }

    public BigDecimal getDB2000_DBD80() {
        return DB2000_DBD80;
    }

    public void setDB2000_DBD80(BigDecimal DB2000_DBD80) {
        this.DB2000_DBD80 = DB2000_DBD80;
    }

    public BigDecimal getDB2000_DBD84() {
        return DB2000_DBD84;
    }

    public void setDB2000_DBD84(BigDecimal DB2000_DBD84) {
        this.DB2000_DBD84 = DB2000_DBD84;
    }

    public BigDecimal getDB2000_DBD88() {
        return DB2000_DBD88;
    }

    public void setDB2000_DBD88(BigDecimal DB2000_DBD88) {
        this.DB2000_DBD88 = DB2000_DBD88;
    }

    public BigDecimal getDB2000_DBD92() {
        return DB2000_DBD92;
    }

    public void setDB2000_DBD92(BigDecimal DB2000_DBD92) {
        this.DB2000_DBD92 = DB2000_DBD92;
    }

    public BigDecimal getDB2000_DBD96() {
        return DB2000_DBD96;
    }

    public void setDB2000_DBD96(BigDecimal DB2000_DBD96) {
        this.DB2000_DBD96 = DB2000_DBD96;
    }

    public BigDecimal getDB2000_DBW2() {
        return DB2000_DBW2;
    }

    public void setDB2000_DBW2(BigDecimal DB2000_DBW2) {
        this.DB2000_DBW2 = DB2000_DBW2;
    }
}
