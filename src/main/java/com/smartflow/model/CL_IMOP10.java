package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_IMOP10")
public class CL_IMOP10 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private BigDecimal DB48_DBD12;
    private BigDecimal DB48_DBD16;
    private BigDecimal DB48_DBD20;
    private BigDecimal DB48_DBD24;
    private BigDecimal DB48_DBD28;
    private BigDecimal DB48_DBD32;
    private BigDecimal DB48_DBD344;
    private BigDecimal DB48_DBD348;
    private BigDecimal DB48_DBD352;
    private BigDecimal DB48_DBD356;
    private BigDecimal DB48_DBD36;
    private BigDecimal DB48_DBD360;
    private BigDecimal DB48_DBD4;
    private BigDecimal DB48_DBD40;
    private String DB48_DBD44;
    private BigDecimal DB48_DBD8;
    private String DB48_DBD86;
    private BigDecimal DB48_DBW342;
    private BigDecimal DB48_DBW364;
    private String DB49_DBX126_0;
    private String DB49_DBX168_0;
    private String DB49_DBX210_0;
    private String DB49_DBX252_0;
    private String DB49_DBX42_0;
    private String DB49_DBX84_0;
    private String M1510_4;
    private String M1530_1;
    private String M500_0;
    private String M500_1;
    private String M500_2;
    private String M500_3;
    private String M500_4;
    private String M500_5;
    private String M500_6;
    private String M500_7;
    private String M501_0;
    private String M501_1;
    private String M501_2;
    private String M501_3;
    private String M501_4;
    private String M501_5;
    private String M501_6;
    private String M501_7;
    private String M502_0;
    private String M502_1;
    private String M502_2;
    private String M502_3;
    private String M502_4;
    private String M502_5;
    private String M502_6;
    private String M502_7;
    private String M503_0;
    private String M503_1;
    private String M503_2;
    private String M503_3;
    private String M503_4;
    private String M503_5;
    private String M503_6;
    private String M506_0;
    private String M506_1;
    private String IS_OK;

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

    public BigDecimal getDB48_DBD12() {
        return DB48_DBD12;
    }

    public void setDB48_DBD12(BigDecimal DB48_DBD12) {
        this.DB48_DBD12 = DB48_DBD12;
    }

    public BigDecimal getDB48_DBD16() {
        return DB48_DBD16;
    }

    public void setDB48_DBD16(BigDecimal DB48_DBD16) {
        this.DB48_DBD16 = DB48_DBD16;
    }

    public BigDecimal getDB48_DBD20() {
        return DB48_DBD20;
    }

    public void setDB48_DBD20(BigDecimal DB48_DBD20) {
        this.DB48_DBD20 = DB48_DBD20;
    }

    public BigDecimal getDB48_DBD24() {
        return DB48_DBD24;
    }

    public void setDB48_DBD24(BigDecimal DB48_DBD24) {
        this.DB48_DBD24 = DB48_DBD24;
    }

    public BigDecimal getDB48_DBD28() {
        return DB48_DBD28;
    }

    public void setDB48_DBD28(BigDecimal DB48_DBD28) {
        this.DB48_DBD28 = DB48_DBD28;
    }

    public BigDecimal getDB48_DBD32() {
        return DB48_DBD32;
    }

    public void setDB48_DBD32(BigDecimal DB48_DBD32) {
        this.DB48_DBD32 = DB48_DBD32;
    }

    public BigDecimal getDB48_DBD344() {
        return DB48_DBD344;
    }

    public void setDB48_DBD344(BigDecimal DB48_DBD344) {
        this.DB48_DBD344 = DB48_DBD344;
    }

    public BigDecimal getDB48_DBD348() {
        return DB48_DBD348;
    }

    public void setDB48_DBD348(BigDecimal DB48_DBD348) {
        this.DB48_DBD348 = DB48_DBD348;
    }

    public BigDecimal getDB48_DBD352() {
        return DB48_DBD352;
    }

    public void setDB48_DBD352(BigDecimal DB48_DBD352) {
        this.DB48_DBD352 = DB48_DBD352;
    }

    public BigDecimal getDB48_DBD356() {
        return DB48_DBD356;
    }

    public void setDB48_DBD356(BigDecimal DB48_DBD356) {
        this.DB48_DBD356 = DB48_DBD356;
    }

    public BigDecimal getDB48_DBD36() {
        return DB48_DBD36;
    }

    public void setDB48_DBD36(BigDecimal DB48_DBD36) {
        this.DB48_DBD36 = DB48_DBD36;
    }

    public BigDecimal getDB48_DBD360() {
        return DB48_DBD360;
    }

    public void setDB48_DBD360(BigDecimal DB48_DBD360) {
        this.DB48_DBD360 = DB48_DBD360;
    }

    public BigDecimal getDB48_DBD4() {
        return DB48_DBD4;
    }

    public void setDB48_DBD4(BigDecimal DB48_DBD4) {
        this.DB48_DBD4 = DB48_DBD4;
    }

    public BigDecimal getDB48_DBD40() {
        return DB48_DBD40;
    }

    public void setDB48_DBD40(BigDecimal DB48_DBD40) {
        this.DB48_DBD40 = DB48_DBD40;
    }

    public String getDB48_DBD44() {
        return DB48_DBD44;
    }

    public void setDB48_DBD44(String DB48_DBD44) {
        this.DB48_DBD44 = DB48_DBD44;
    }

    public BigDecimal getDB48_DBD8() {
        return DB48_DBD8;
    }

    public void setDB48_DBD8(BigDecimal DB48_DBD8) {
        this.DB48_DBD8 = DB48_DBD8;
    }

    public String getDB48_DBD86() {
        return DB48_DBD86;
    }

    public void setDB48_DBD86(String DB48_DBD86) {
        this.DB48_DBD86 = DB48_DBD86;
    }

    public BigDecimal getDB48_DBW342() {
        return DB48_DBW342;
    }

    public void setDB48_DBW342(BigDecimal DB48_DBW342) {
        this.DB48_DBW342 = DB48_DBW342;
    }

    public BigDecimal getDB48_DBW364() {
        return DB48_DBW364;
    }

    public void setDB48_DBW364(BigDecimal DB48_DBW364) {
        this.DB48_DBW364 = DB48_DBW364;
    }

    public String getDB49_DBX126_0() {
        return DB49_DBX126_0;
    }

    public void setDB49_DBX126_0(String DB49_DBX126_0) {
        this.DB49_DBX126_0 = DB49_DBX126_0;
    }

    public String getDB49_DBX168_0() {
        return DB49_DBX168_0;
    }

    public void setDB49_DBX168_0(String DB49_DBX168_0) {
        this.DB49_DBX168_0 = DB49_DBX168_0;
    }

    public String getDB49_DBX210_0() {
        return DB49_DBX210_0;
    }

    public void setDB49_DBX210_0(String DB49_DBX210_0) {
        this.DB49_DBX210_0 = DB49_DBX210_0;
    }

    public String getDB49_DBX252_0() {
        return DB49_DBX252_0;
    }

    public void setDB49_DBX252_0(String DB49_DBX252_0) {
        this.DB49_DBX252_0 = DB49_DBX252_0;
    }

    public String getDB49_DBX42_0() {
        return DB49_DBX42_0;
    }

    public void setDB49_DBX42_0(String DB49_DBX42_0) {
        this.DB49_DBX42_0 = DB49_DBX42_0;
    }

    public String getDB49_DBX84_0() {
        return DB49_DBX84_0;
    }

    public void setDB49_DBX84_0(String DB49_DBX84_0) {
        this.DB49_DBX84_0 = DB49_DBX84_0;
    }

    public String getM1510_4() {
        return M1510_4;
    }

    public void setM1510_4(String m1510_4) {
        M1510_4 = m1510_4;
    }

    public String getM1530_1() {
        return M1530_1;
    }

    public void setM1530_1(String m1530_1) {
        M1530_1 = m1530_1;
    }

    public String getM500_0() {
        return M500_0;
    }

    public void setM500_0(String m500_0) {
        M500_0 = m500_0;
    }

    public String getM500_1() {
        return M500_1;
    }

    public void setM500_1(String m500_1) {
        M500_1 = m500_1;
    }

    public String getM500_2() {
        return M500_2;
    }

    public void setM500_2(String m500_2) {
        M500_2 = m500_2;
    }

    public String getM500_3() {
        return M500_3;
    }

    public void setM500_3(String m500_3) {
        M500_3 = m500_3;
    }

    public String getM500_4() {
        return M500_4;
    }

    public void setM500_4(String m500_4) {
        M500_4 = m500_4;
    }

    public String getM500_5() {
        return M500_5;
    }

    public void setM500_5(String m500_5) {
        M500_5 = m500_5;
    }

    public String getM500_6() {
        return M500_6;
    }

    public void setM500_6(String m500_6) {
        M500_6 = m500_6;
    }

    public String getM500_7() {
        return M500_7;
    }

    public void setM500_7(String m500_7) {
        M500_7 = m500_7;
    }

    public String getM501_0() {
        return M501_0;
    }

    public void setM501_0(String m501_0) {
        M501_0 = m501_0;
    }

    public String getM501_1() {
        return M501_1;
    }

    public void setM501_1(String m501_1) {
        M501_1 = m501_1;
    }

    public String getM501_2() {
        return M501_2;
    }

    public void setM501_2(String m501_2) {
        M501_2 = m501_2;
    }

    public String getM501_3() {
        return M501_3;
    }

    public void setM501_3(String m501_3) {
        M501_3 = m501_3;
    }

    public String getM501_4() {
        return M501_4;
    }

    public void setM501_4(String m501_4) {
        M501_4 = m501_4;
    }

    public String getM501_5() {
        return M501_5;
    }

    public void setM501_5(String m501_5) {
        M501_5 = m501_5;
    }

    public String getM501_6() {
        return M501_6;
    }

    public void setM501_6(String m501_6) {
        M501_6 = m501_6;
    }

    public String getM501_7() {
        return M501_7;
    }

    public void setM501_7(String m501_7) {
        M501_7 = m501_7;
    }

    public String getM502_0() {
        return M502_0;
    }

    public void setM502_0(String m502_0) {
        M502_0 = m502_0;
    }

    public String getM502_1() {
        return M502_1;
    }

    public void setM502_1(String m502_1) {
        M502_1 = m502_1;
    }

    public String getM502_2() {
        return M502_2;
    }

    public void setM502_2(String m502_2) {
        M502_2 = m502_2;
    }

    public String getM502_3() {
        return M502_3;
    }

    public void setM502_3(String m502_3) {
        M502_3 = m502_3;
    }

    public String getM502_4() {
        return M502_4;
    }

    public void setM502_4(String m502_4) {
        M502_4 = m502_4;
    }

    public String getM502_5() {
        return M502_5;
    }

    public void setM502_5(String m502_5) {
        M502_5 = m502_5;
    }

    public String getM502_6() {
        return M502_6;
    }

    public void setM502_6(String m502_6) {
        M502_6 = m502_6;
    }

    public String getM502_7() {
        return M502_7;
    }

    public void setM502_7(String m502_7) {
        M502_7 = m502_7;
    }

    public String getM503_0() {
        return M503_0;
    }

    public void setM503_0(String m503_0) {
        M503_0 = m503_0;
    }

    public String getM503_1() {
        return M503_1;
    }

    public void setM503_1(String m503_1) {
        M503_1 = m503_1;
    }

    public String getM503_2() {
        return M503_2;
    }

    public void setM503_2(String m503_2) {
        M503_2 = m503_2;
    }

    public String getM503_3() {
        return M503_3;
    }

    public void setM503_3(String m503_3) {
        M503_3 = m503_3;
    }

    public String getM503_4() {
        return M503_4;
    }

    public void setM503_4(String m503_4) {
        M503_4 = m503_4;
    }

    public String getM503_5() {
        return M503_5;
    }

    public void setM503_5(String m503_5) {
        M503_5 = m503_5;
    }

    public String getM503_6() {
        return M503_6;
    }

    public void setM503_6(String m503_6) {
        M503_6 = m503_6;
    }

    public String getM506_0() {
        return M506_0;
    }

    public void setM506_0(String m506_0) {
        M506_0 = m506_0;
    }

    public String getM506_1() {
        return M506_1;
    }

    public void setM506_1(String m506_1) {
        M506_1 = m506_1;
    }
}
