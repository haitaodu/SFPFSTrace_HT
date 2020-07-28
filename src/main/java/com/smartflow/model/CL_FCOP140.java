package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="core.CL_FCOP140")
public class CL_FCOP140 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private BigDecimal DB1_DBD0;
    private BigDecimal DB1_DBD116;
    private BigDecimal DB1_DBD120;
    private BigDecimal DB1_DBD124;
    private BigDecimal DB1_DBD176;
    private BigDecimal DB1_DBD184;
    private BigDecimal DB1_DBD4;
    private BigDecimal DB1_DBD44;
    private BigDecimal DB1_DBD48;
    private BigDecimal DB1_DBD64;
    private BigDecimal DB1_DBW168;
    private BigDecimal DB1_DBW96;
    private String M230_2;
    private String M230_3;
    private String M240_0;
    private String M240_3;
    private String M240_4;
    private String M240_7;
    private String M241_2;
    private String M241_3;
    private String M241_4;
    private String M241_5;
    private String M241_6;
    private String M241_7;
    private String M244_0;
    private String M244_1;
    private String M244_4;
    private String M244_5;
    private String M244_6;
    private String M244_7;
    private String M245_2;
    private String M245_3;
    private String M620_3;

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

    public BigDecimal getDB1_DBD0() {
        return DB1_DBD0;
    }

    public void setDB1_DBD0(BigDecimal DB1_DBD0) {
        this.DB1_DBD0 = DB1_DBD0;
    }

    public BigDecimal getDB1_DBD116() {
        return DB1_DBD116;
    }

    public void setDB1_DBD116(BigDecimal DB1_DBD116) {
        this.DB1_DBD116 = DB1_DBD116;
    }

    public BigDecimal getDB1_DBD120() {
        return DB1_DBD120;
    }

    public void setDB1_DBD120(BigDecimal DB1_DBD120) {
        this.DB1_DBD120 = DB1_DBD120;
    }

    public BigDecimal getDB1_DBD124() {
        return DB1_DBD124;
    }

    public void setDB1_DBD124(BigDecimal DB1_DBD124) {
        this.DB1_DBD124 = DB1_DBD124;
    }

    public BigDecimal getDB1_DBD176() {
        return DB1_DBD176;
    }

    public void setDB1_DBD176(BigDecimal DB1_DBD176) {
        this.DB1_DBD176 = DB1_DBD176;
    }

    public BigDecimal getDB1_DBD184() {
        return DB1_DBD184;
    }

    public void setDB1_DBD184(BigDecimal DB1_DBD184) {
        this.DB1_DBD184 = DB1_DBD184;
    }

    public BigDecimal getDB1_DBD4() {
        return DB1_DBD4;
    }

    public void setDB1_DBD4(BigDecimal DB1_DBD4) {
        this.DB1_DBD4 = DB1_DBD4;
    }

    public BigDecimal getDB1_DBD44() {
        return DB1_DBD44;
    }

    public void setDB1_DBD44(BigDecimal DB1_DBD44) {
        this.DB1_DBD44 = DB1_DBD44;
    }

    public BigDecimal getDB1_DBD48() {
        return DB1_DBD48;
    }

    public void setDB1_DBD48(BigDecimal DB1_DBD48) {
        this.DB1_DBD48 = DB1_DBD48;
    }

    public BigDecimal getDB1_DBD64() {
        return DB1_DBD64;
    }

    public void setDB1_DBD64(BigDecimal DB1_DBD64) {
        this.DB1_DBD64 = DB1_DBD64;
    }

    public BigDecimal getDB1_DBW168() {
        return DB1_DBW168;
    }

    public void setDB1_DBW168(BigDecimal DB1_DBW168) {
        this.DB1_DBW168 = DB1_DBW168;
    }

    public BigDecimal getDB1_DBW96() {
        return DB1_DBW96;
    }

    public void setDB1_DBW96(BigDecimal DB1_DBW96) {
        this.DB1_DBW96 = DB1_DBW96;
    }

    public String getM230_2() {
        return M230_2;
    }

    public void setM230_2(String m230_2) {
        M230_2 = m230_2;
    }

    public String getM230_3() {
        return M230_3;
    }

    public void setM230_3(String m230_3) {
        M230_3 = m230_3;
    }

    public String getM240_0() {
        return M240_0;
    }

    public void setM240_0(String m240_0) {
        M240_0 = m240_0;
    }

    public String getM240_3() {
        return M240_3;
    }

    public void setM240_3(String m240_3) {
        M240_3 = m240_3;
    }

    public String getM240_4() {
        return M240_4;
    }

    public void setM240_4(String m240_4) {
        M240_4 = m240_4;
    }

    public String getM240_7() {
        return M240_7;
    }

    public void setM240_7(String m240_7) {
        M240_7 = m240_7;
    }

    public String getM241_2() {
        return M241_2;
    }

    public void setM241_2(String m241_2) {
        M241_2 = m241_2;
    }

    public String getM241_3() {
        return M241_3;
    }

    public void setM241_3(String m241_3) {
        M241_3 = m241_3;
    }

    public String getM241_4() {
        return M241_4;
    }

    public void setM241_4(String m241_4) {
        M241_4 = m241_4;
    }

    public String getM241_5() {
        return M241_5;
    }

    public void setM241_5(String m241_5) {
        M241_5 = m241_5;
    }

    public String getM241_6() {
        return M241_6;
    }

    public void setM241_6(String m241_6) {
        M241_6 = m241_6;
    }

    public String getM241_7() {
        return M241_7;
    }

    public void setM241_7(String m241_7) {
        M241_7 = m241_7;
    }

    public String getM244_0() {
        return M244_0;
    }

    public void setM244_0(String m244_0) {
        M244_0 = m244_0;
    }

    public String getM244_1() {
        return M244_1;
    }

    public void setM244_1(String m244_1) {
        M244_1 = m244_1;
    }

    public String getM244_4() {
        return M244_4;
    }

    public void setM244_4(String m244_4) {
        M244_4 = m244_4;
    }

    public String getM244_5() {
        return M244_5;
    }

    public void setM244_5(String m244_5) {
        M244_5 = m244_5;
    }

    public String getM244_6() {
        return M244_6;
    }

    public void setM244_6(String m244_6) {
        M244_6 = m244_6;
    }

    public String getM244_7() {
        return M244_7;
    }

    public void setM244_7(String m244_7) {
        M244_7 = m244_7;
    }

    public String getM245_2() {
        return M245_2;
    }

    public void setM245_2(String m245_2) {
        M245_2 = m245_2;
    }

    public String getM245_3() {
        return M245_3;
    }

    public void setM245_3(String m245_3) {
        M245_3 = m245_3;
    }

    public String getM620_3() {
        return M620_3;
    }

    public void setM620_3(String m620_3) {
        M620_3 = m620_3;
    }
}
