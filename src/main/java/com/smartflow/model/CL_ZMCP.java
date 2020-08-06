package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_ZMCP")
public class CL_ZMCP {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private BigDecimal DB17_DBD706;
    private BigDecimal DB17_DBD710;
    private BigDecimal DB17_DBD714;
    private BigDecimal DB17_DBD718;
    private BigDecimal DB17_DBD722;
    private BigDecimal DB17_DBD726;
    private BigDecimal DB17_DBD730;
    private BigDecimal DB17_DBD734;
    private BigDecimal DB17_DBD738;
    private BigDecimal DB17_DBD742;
    private BigDecimal DB17_DBD746;
    private BigDecimal DB17_DBD750;
    private BigDecimal DB17_DBD754;
    private BigDecimal DB17_DBD758;
    private BigDecimal DB17_DBD762;
    private BigDecimal DB17_DBD766;
    private BigDecimal DB17_DBD770;
    private BigDecimal DB17_DBD774;
    private String DB17_DBX244_0;
    private String DB17_DBX286_0;
    private String DB17_DBX328_0;
    private String DB17_DBX370_0;
    private String DB17_DBX412_0;
    private String DB17_DBX454_0;
    private String DB17_DBX778_0;
    private String DB17_DBX778_1;
    private String DB180_DBX0_0;
    private String DB180_DBX0_2;
    private String DB180_DBX0_3;
    private String DB180_DBX0_5;
    private String DB180_DBX0_6;
    private String DB180_DBX1_0;
    private String DB180_DBX1_1;
    private String DB180_DBX1_3;
    private String DB180_DBX1_4;
    private String DB180_DBX1_6;
    private String DB180_DBX1_7;
    private String DB182_DBX0_0;
    private String DB182_DBX0_1;
    private String DB182_DBX0_2;
    private String DB182_DBX0_3;
    private String DB182_DBX0_4;
    private String DB182_DBX0_5;
    private String DB182_DBX0_6;
    private String DB182_DBX0_7;
    private String DB182_DBX1_0;
    private String DB182_DBX1_1;
    private String DB182_DBX1_2;
    private String DB182_DBX1_3;
    private String DB182_DBX2_0;
    private String DB182_DBX2_1;
    private String DB182_DBX2_2;
    private String DB182_DBX2_3;
    private String DB182_DBX2_4;
    private String DB182_DBX2_5;
    private String DB182_DBX2_6;
    private String DB182_DBX2_7;
    private String DB182_DBX3_0;
    private String DB182_DBX3_1;
    private String DB182_DBX3_2;
    private String DB182_DBX3_3;
    private String DB182_DBX4_0;
    private String DB182_DBX4_1;
    private String DB182_DBX4_2;
    private String DB182_DBX4_3;
    private String M112_0;
    private String M112_1;
    private String M112_2;
    private String M112_3;
    private String M112_4;
    private String M15_2;
    private String M21_6;
    private String M52_0;
    private String M52_1;
    private String M52_2;

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

    public BigDecimal getDB17_DBD706() {
        return DB17_DBD706;
    }

    public void setDB17_DBD706(BigDecimal DB17_DBD706) {
        this.DB17_DBD706 = DB17_DBD706;
    }

    public BigDecimal getDB17_DBD710() {
        return DB17_DBD710;
    }

    public void setDB17_DBD710(BigDecimal DB17_DBD710) {
        this.DB17_DBD710 = DB17_DBD710;
    }

    public BigDecimal getDB17_DBD714() {
        return DB17_DBD714;
    }

    public void setDB17_DBD714(BigDecimal DB17_DBD714) {
        this.DB17_DBD714 = DB17_DBD714;
    }

    public BigDecimal getDB17_DBD718() {
        return DB17_DBD718;
    }

    public void setDB17_DBD718(BigDecimal DB17_DBD718) {
        this.DB17_DBD718 = DB17_DBD718;
    }

    public BigDecimal getDB17_DBD722() {
        return DB17_DBD722;
    }

    public void setDB17_DBD722(BigDecimal DB17_DBD722) {
        this.DB17_DBD722 = DB17_DBD722;
    }

    public BigDecimal getDB17_DBD726() {
        return DB17_DBD726;
    }

    public void setDB17_DBD726(BigDecimal DB17_DBD726) {
        this.DB17_DBD726 = DB17_DBD726;
    }

    public BigDecimal getDB17_DBD730() {
        return DB17_DBD730;
    }

    public void setDB17_DBD730(BigDecimal DB17_DBD730) {
        this.DB17_DBD730 = DB17_DBD730;
    }

    public BigDecimal getDB17_DBD734() {
        return DB17_DBD734;
    }

    public void setDB17_DBD734(BigDecimal DB17_DBD734) {
        this.DB17_DBD734 = DB17_DBD734;
    }

    public BigDecimal getDB17_DBD738() {
        return DB17_DBD738;
    }

    public void setDB17_DBD738(BigDecimal DB17_DBD738) {
        this.DB17_DBD738 = DB17_DBD738;
    }

    public BigDecimal getDB17_DBD742() {
        return DB17_DBD742;
    }

    public void setDB17_DBD742(BigDecimal DB17_DBD742) {
        this.DB17_DBD742 = DB17_DBD742;
    }

    public BigDecimal getDB17_DBD746() {
        return DB17_DBD746;
    }

    public void setDB17_DBD746(BigDecimal DB17_DBD746) {
        this.DB17_DBD746 = DB17_DBD746;
    }

    public BigDecimal getDB17_DBD750() {
        return DB17_DBD750;
    }

    public void setDB17_DBD750(BigDecimal DB17_DBD750) {
        this.DB17_DBD750 = DB17_DBD750;
    }

    public BigDecimal getDB17_DBD754() {
        return DB17_DBD754;
    }

    public void setDB17_DBD754(BigDecimal DB17_DBD754) {
        this.DB17_DBD754 = DB17_DBD754;
    }

    public BigDecimal getDB17_DBD758() {
        return DB17_DBD758;
    }

    public void setDB17_DBD758(BigDecimal DB17_DBD758) {
        this.DB17_DBD758 = DB17_DBD758;
    }

    public BigDecimal getDB17_DBD762() {
        return DB17_DBD762;
    }

    public void setDB17_DBD762(BigDecimal DB17_DBD762) {
        this.DB17_DBD762 = DB17_DBD762;
    }

    public BigDecimal getDB17_DBD766() {
        return DB17_DBD766;
    }

    public void setDB17_DBD766(BigDecimal DB17_DBD766) {
        this.DB17_DBD766 = DB17_DBD766;
    }

    public BigDecimal getDB17_DBD770() {
        return DB17_DBD770;
    }

    public void setDB17_DBD770(BigDecimal DB17_DBD770) {
        this.DB17_DBD770 = DB17_DBD770;
    }

    public BigDecimal getDB17_DBD774() {
        return DB17_DBD774;
    }

    public void setDB17_DBD774(BigDecimal DB17_DBD774) {
        this.DB17_DBD774 = DB17_DBD774;
    }

    public String getDB17_DBX244_0() {
        return DB17_DBX244_0;
    }

    public void setDB17_DBX244_0(String DB17_DBX244_0) {
        this.DB17_DBX244_0 = DB17_DBX244_0;
    }

    public String getDB17_DBX286_0() {
        return DB17_DBX286_0;
    }

    public void setDB17_DBX286_0(String DB17_DBX286_0) {
        this.DB17_DBX286_0 = DB17_DBX286_0;
    }

    public String getDB17_DBX328_0() {
        return DB17_DBX328_0;
    }

    public void setDB17_DBX328_0(String DB17_DBX328_0) {
        this.DB17_DBX328_0 = DB17_DBX328_0;
    }

    public String getDB17_DBX370_0() {
        return DB17_DBX370_0;
    }

    public void setDB17_DBX370_0(String DB17_DBX370_0) {
        this.DB17_DBX370_0 = DB17_DBX370_0;
    }

    public String getDB17_DBX412_0() {
        return DB17_DBX412_0;
    }

    public void setDB17_DBX412_0(String DB17_DBX412_0) {
        this.DB17_DBX412_0 = DB17_DBX412_0;
    }

    public String getDB17_DBX454_0() {
        return DB17_DBX454_0;
    }

    public void setDB17_DBX454_0(String DB17_DBX454_0) {
        this.DB17_DBX454_0 = DB17_DBX454_0;
    }

    public String getDB17_DBX778_0() {
        return DB17_DBX778_0;
    }

    public void setDB17_DBX778_0(String DB17_DBX778_0) {
        this.DB17_DBX778_0 = DB17_DBX778_0;
    }

    public String getDB17_DBX778_1() {
        return DB17_DBX778_1;
    }

    public void setDB17_DBX778_1(String DB17_DBX778_1) {
        this.DB17_DBX778_1 = DB17_DBX778_1;
    }

    public String getDB180_DBX0_0() {
        return DB180_DBX0_0;
    }

    public void setDB180_DBX0_0(String DB180_DBX0_0) {
        this.DB180_DBX0_0 = DB180_DBX0_0;
    }

    public String getDB180_DBX0_2() {
        return DB180_DBX0_2;
    }

    public void setDB180_DBX0_2(String DB180_DBX0_2) {
        this.DB180_DBX0_2 = DB180_DBX0_2;
    }

    public String getDB180_DBX0_3() {
        return DB180_DBX0_3;
    }

    public void setDB180_DBX0_3(String DB180_DBX0_3) {
        this.DB180_DBX0_3 = DB180_DBX0_3;
    }

    public String getDB180_DBX0_5() {
        return DB180_DBX0_5;
    }

    public void setDB180_DBX0_5(String DB180_DBX0_5) {
        this.DB180_DBX0_5 = DB180_DBX0_5;
    }

    public String getDB180_DBX0_6() {
        return DB180_DBX0_6;
    }

    public void setDB180_DBX0_6(String DB180_DBX0_6) {
        this.DB180_DBX0_6 = DB180_DBX0_6;
    }

    public String getDB180_DBX1_0() {
        return DB180_DBX1_0;
    }

    public void setDB180_DBX1_0(String DB180_DBX1_0) {
        this.DB180_DBX1_0 = DB180_DBX1_0;
    }

    public String getDB180_DBX1_1() {
        return DB180_DBX1_1;
    }

    public void setDB180_DBX1_1(String DB180_DBX1_1) {
        this.DB180_DBX1_1 = DB180_DBX1_1;
    }

    public String getDB180_DBX1_3() {
        return DB180_DBX1_3;
    }

    public void setDB180_DBX1_3(String DB180_DBX1_3) {
        this.DB180_DBX1_3 = DB180_DBX1_3;
    }

    public String getDB180_DBX1_4() {
        return DB180_DBX1_4;
    }

    public void setDB180_DBX1_4(String DB180_DBX1_4) {
        this.DB180_DBX1_4 = DB180_DBX1_4;
    }

    public String getDB180_DBX1_6() {
        return DB180_DBX1_6;
    }

    public void setDB180_DBX1_6(String DB180_DBX1_6) {
        this.DB180_DBX1_6 = DB180_DBX1_6;
    }

    public String getDB180_DBX1_7() {
        return DB180_DBX1_7;
    }

    public void setDB180_DBX1_7(String DB180_DBX1_7) {
        this.DB180_DBX1_7 = DB180_DBX1_7;
    }

    public String getDB182_DBX0_0() {
        return DB182_DBX0_0;
    }

    public void setDB182_DBX0_0(String DB182_DBX0_0) {
        this.DB182_DBX0_0 = DB182_DBX0_0;
    }

    public String getDB182_DBX0_1() {
        return DB182_DBX0_1;
    }

    public void setDB182_DBX0_1(String DB182_DBX0_1) {
        this.DB182_DBX0_1 = DB182_DBX0_1;
    }

    public String getDB182_DBX0_2() {
        return DB182_DBX0_2;
    }

    public void setDB182_DBX0_2(String DB182_DBX0_2) {
        this.DB182_DBX0_2 = DB182_DBX0_2;
    }

    public String getDB182_DBX0_3() {
        return DB182_DBX0_3;
    }

    public void setDB182_DBX0_3(String DB182_DBX0_3) {
        this.DB182_DBX0_3 = DB182_DBX0_3;
    }

    public String getDB182_DBX0_4() {
        return DB182_DBX0_4;
    }

    public void setDB182_DBX0_4(String DB182_DBX0_4) {
        this.DB182_DBX0_4 = DB182_DBX0_4;
    }

    public String getDB182_DBX0_5() {
        return DB182_DBX0_5;
    }

    public void setDB182_DBX0_5(String DB182_DBX0_5) {
        this.DB182_DBX0_5 = DB182_DBX0_5;
    }

    public String getDB182_DBX0_6() {
        return DB182_DBX0_6;
    }

    public void setDB182_DBX0_6(String DB182_DBX0_6) {
        this.DB182_DBX0_6 = DB182_DBX0_6;
    }

    public String getDB182_DBX0_7() {
        return DB182_DBX0_7;
    }

    public void setDB182_DBX0_7(String DB182_DBX0_7) {
        this.DB182_DBX0_7 = DB182_DBX0_7;
    }

    public String getDB182_DBX1_0() {
        return DB182_DBX1_0;
    }

    public void setDB182_DBX1_0(String DB182_DBX1_0) {
        this.DB182_DBX1_0 = DB182_DBX1_0;
    }

    public String getDB182_DBX1_1() {
        return DB182_DBX1_1;
    }

    public void setDB182_DBX1_1(String DB182_DBX1_1) {
        this.DB182_DBX1_1 = DB182_DBX1_1;
    }

    public String getDB182_DBX1_2() {
        return DB182_DBX1_2;
    }

    public void setDB182_DBX1_2(String DB182_DBX1_2) {
        this.DB182_DBX1_2 = DB182_DBX1_2;
    }

    public String getDB182_DBX1_3() {
        return DB182_DBX1_3;
    }

    public void setDB182_DBX1_3(String DB182_DBX1_3) {
        this.DB182_DBX1_3 = DB182_DBX1_3;
    }

    public String getDB182_DBX2_0() {
        return DB182_DBX2_0;
    }

    public void setDB182_DBX2_0(String DB182_DBX2_0) {
        this.DB182_DBX2_0 = DB182_DBX2_0;
    }

    public String getDB182_DBX2_1() {
        return DB182_DBX2_1;
    }

    public void setDB182_DBX2_1(String DB182_DBX2_1) {
        this.DB182_DBX2_1 = DB182_DBX2_1;
    }

    public String getDB182_DBX2_2() {
        return DB182_DBX2_2;
    }

    public void setDB182_DBX2_2(String DB182_DBX2_2) {
        this.DB182_DBX2_2 = DB182_DBX2_2;
    }

    public String getDB182_DBX2_3() {
        return DB182_DBX2_3;
    }

    public void setDB182_DBX2_3(String DB182_DBX2_3) {
        this.DB182_DBX2_3 = DB182_DBX2_3;
    }

    public String getDB182_DBX2_4() {
        return DB182_DBX2_4;
    }

    public void setDB182_DBX2_4(String DB182_DBX2_4) {
        this.DB182_DBX2_4 = DB182_DBX2_4;
    }

    public String getDB182_DBX2_5() {
        return DB182_DBX2_5;
    }

    public void setDB182_DBX2_5(String DB182_DBX2_5) {
        this.DB182_DBX2_5 = DB182_DBX2_5;
    }

    public String getDB182_DBX2_6() {
        return DB182_DBX2_6;
    }

    public void setDB182_DBX2_6(String DB182_DBX2_6) {
        this.DB182_DBX2_6 = DB182_DBX2_6;
    }

    public String getDB182_DBX2_7() {
        return DB182_DBX2_7;
    }

    public void setDB182_DBX2_7(String DB182_DBX2_7) {
        this.DB182_DBX2_7 = DB182_DBX2_7;
    }

    public String getDB182_DBX3_0() {
        return DB182_DBX3_0;
    }

    public void setDB182_DBX3_0(String DB182_DBX3_0) {
        this.DB182_DBX3_0 = DB182_DBX3_0;
    }

    public String getDB182_DBX3_1() {
        return DB182_DBX3_1;
    }

    public void setDB182_DBX3_1(String DB182_DBX3_1) {
        this.DB182_DBX3_1 = DB182_DBX3_1;
    }

    public String getDB182_DBX3_2() {
        return DB182_DBX3_2;
    }

    public void setDB182_DBX3_2(String DB182_DBX3_2) {
        this.DB182_DBX3_2 = DB182_DBX3_2;
    }

    public String getDB182_DBX3_3() {
        return DB182_DBX3_3;
    }

    public void setDB182_DBX3_3(String DB182_DBX3_3) {
        this.DB182_DBX3_3 = DB182_DBX3_3;
    }

    public String getDB182_DBX4_0() {
        return DB182_DBX4_0;
    }

    public void setDB182_DBX4_0(String DB182_DBX4_0) {
        this.DB182_DBX4_0 = DB182_DBX4_0;
    }

    public String getDB182_DBX4_1() {
        return DB182_DBX4_1;
    }

    public void setDB182_DBX4_1(String DB182_DBX4_1) {
        this.DB182_DBX4_1 = DB182_DBX4_1;
    }

    public String getDB182_DBX4_2() {
        return DB182_DBX4_2;
    }

    public void setDB182_DBX4_2(String DB182_DBX4_2) {
        this.DB182_DBX4_2 = DB182_DBX4_2;
    }

    public String getDB182_DBX4_3() {
        return DB182_DBX4_3;
    }

    public void setDB182_DBX4_3(String DB182_DBX4_3) {
        this.DB182_DBX4_3 = DB182_DBX4_3;
    }

    public String getM112_0() {
        return M112_0;
    }

    public void setM112_0(String m112_0) {
        M112_0 = m112_0;
    }

    public String getM112_1() {
        return M112_1;
    }

    public void setM112_1(String m112_1) {
        M112_1 = m112_1;
    }

    public String getM112_2() {
        return M112_2;
    }

    public void setM112_2(String m112_2) {
        M112_2 = m112_2;
    }

    public String getM112_3() {
        return M112_3;
    }

    public void setM112_3(String m112_3) {
        M112_3 = m112_3;
    }

    public String getM112_4() {
        return M112_4;
    }

    public void setM112_4(String m112_4) {
        M112_4 = m112_4;
    }

    public String getM15_2() {
        return M15_2;
    }

    public void setM15_2(String m15_2) {
        M15_2 = m15_2;
    }

    public String getM21_6() {
        return M21_6;
    }

    public void setM21_6(String m21_6) {
        M21_6 = m21_6;
    }

    public String getM52_0() {
        return M52_0;
    }

    public void setM52_0(String m52_0) {
        M52_0 = m52_0;
    }

    public String getM52_1() {
        return M52_1;
    }

    public void setM52_1(String m52_1) {
        M52_1 = m52_1;
    }

    public String getM52_2() {
        return M52_2;
    }

    public void setM52_2(String m52_2) {
        M52_2 = m52_2;
    }
}
