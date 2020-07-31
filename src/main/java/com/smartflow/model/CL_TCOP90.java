package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_TCOP90")
public class CL_TCOP90 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String DB110_DBX0_0;
    private String DB110_DBX0_1;
    private String DB110_DBX0_2;
    private String DB110_DBX0_3;
    private String DB110_DBX0_4;
    private String DB110_DBX0_5;
    private String DB110_DBX0_6;
    private String DB110_DBX0_7;
    private String DB110_DBX10_0;
    private String DB110_DBX10_1;
    private String DB110_DBX10_4;
    private String DB110_DBX10_5;
    private String DB110_DBX10_6;
    private String DB110_DBX10_7;
    private String DB110_DBX11_0;
    private String DB110_DBX11_1;
    private String DB110_DBX11_3;
    private String DB110_DBX11_6;
    private String DB110_DBX13_4;
    private String DB110_DBX13_5;
    private String DB110_DBX13_6;
    private String DB110_DBX13_7;
    private String DB110_DBX14_0;
    private String DB110_DBX14_1;
    private String DB110_DBX14_2;
    private String DB110_DBX14_3;
    private String DB110_DBX14_4;
    private String DB110_DBX14_5;
    private String DB110_DBX14_6;
    private String DB110_DBX14_7;
    private String DB110_DBX15_0;
    private String DB110_DBX15_1;
    private String DB110_DBX15_2;
    private String DB110_DBX15_3;
    private String DB110_DBX16_2;
    private String DB110_DBX16_3;
    private String DB110_DBX16_4;
    private String DB110_DBX16_5;
    private String DB110_DBX17_3;
    private String DB110_DBX17_4;
    private String DB110_DBX17_5;
    private String DB110_DBX17_6;
    private String DB110_DBX17_7;
    private String DB110_DBX1_0;
    private String DB110_DBX1_1;
    private String DB110_DBX34_0;
    private String DB110_DBX35_4;
    private String DB110_DBX35_5;
    private String DB110_DBX35_6;
    private String DB110_DBX4_0;
    private String DB110_DBX4_1;
    private String DB110_DBX4_7;
    private String DB110_DBX558_0;
    private String DB110_DBX5_0;
    private String DB110_DBX5_1;
    private String DB110_DBX5_2;
    private String DB110_DBX5_5;
    private String DB110_DBX6_0;
    private String DB110_DBX6_1;
    private String DB110_DBX6_4;
    private String DB110_DBX6_5;
    private String DB110_DBX6_6;
    private String DB110_DBX6_7;
    private String DB110_DBX7_0;
    private String DB110_DBX7_1;
    private String DB110_DBX7_3;
    private String DB110_DBX7_6;
    private String DB110_DBX8_0;
    private String DB110_DBX8_1;
    private String DB110_DBX8_4;
    private String DB110_DBX8_5;
    private String DB110_DBX8_6;
    private String DB110_DBX8_7;
    private String DB110_DBX9_0;
    private String DB110_DBX9_1;
    private String DB110_DBX9_3;
    private String DB110_DBX9_6;
    private String DB500_DB332;
    private String DB500_DB642;
    private String DB500_DB682;
    private String DB500_DB76;
    private String DB500_DB986;
    private BigDecimal DB500_DBD32;
    private BigDecimal DB500_DBD36;
    private BigDecimal DB500_DBD40;
    private BigDecimal DB500_DBD44;
    private BigDecimal DB500_DBD48;
    private BigDecimal DB500_DBD52;
    private BigDecimal DB500_DBD56;
    private BigDecimal DB500_DBD588;
    private BigDecimal DB500_DBD592;
    private BigDecimal DB500_DBD596;
    private BigDecimal DB500_DBD60;
    private BigDecimal DB500_DBD600;
    private BigDecimal DB500_DBD604;
    private BigDecimal DB500_DBD608;
    private BigDecimal DB500_DBD612;
    private BigDecimal DB500_DBD616;
    private BigDecimal DB500_DBD938;
    private BigDecimal DB500_DBD942;
    private BigDecimal DB500_DBD946;
    private BigDecimal DB500_DBD950;
    private BigDecimal DB500_DBD954;
    private BigDecimal DB500_DBW640;
    private BigDecimal DB500_DBW958;
    private BigDecimal DB500_DBW960;
    private String DB500_DBX0_0;
    private String DB500_DBX0_1;
    private String DB500_DBX0_2;
    private String DB500_DBX0_3;
    private String DB500_DBX0_4;
    private String DB500_DBX0_5;
    private String DB500_DBX0_6;
    private String DB500_DBX1_0;
    private String DB500_DBX1_1;
    private BigDecimal DB500_DBW1028;
    private BigDecimal DB500_DBW1030;

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

    public String getDB110_DBX0_0() {
        return DB110_DBX0_0;
    }

    public void setDB110_DBX0_0(String DB110_DBX0_0) {
        this.DB110_DBX0_0 = DB110_DBX0_0;
    }

    public String getDB110_DBX0_1() {
        return DB110_DBX0_1;
    }

    public void setDB110_DBX0_1(String DB110_DBX0_1) {
        this.DB110_DBX0_1 = DB110_DBX0_1;
    }

    public String getDB110_DBX0_2() {
        return DB110_DBX0_2;
    }

    public void setDB110_DBX0_2(String DB110_DBX0_2) {
        this.DB110_DBX0_2 = DB110_DBX0_2;
    }

    public String getDB110_DBX0_3() {
        return DB110_DBX0_3;
    }

    public void setDB110_DBX0_3(String DB110_DBX0_3) {
        this.DB110_DBX0_3 = DB110_DBX0_3;
    }

    public String getDB110_DBX0_4() {
        return DB110_DBX0_4;
    }

    public void setDB110_DBX0_4(String DB110_DBX0_4) {
        this.DB110_DBX0_4 = DB110_DBX0_4;
    }

    public String getDB110_DBX0_5() {
        return DB110_DBX0_5;
    }

    public void setDB110_DBX0_5(String DB110_DBX0_5) {
        this.DB110_DBX0_5 = DB110_DBX0_5;
    }

    public String getDB110_DBX0_6() {
        return DB110_DBX0_6;
    }

    public void setDB110_DBX0_6(String DB110_DBX0_6) {
        this.DB110_DBX0_6 = DB110_DBX0_6;
    }

    public String getDB110_DBX0_7() {
        return DB110_DBX0_7;
    }

    public void setDB110_DBX0_7(String DB110_DBX0_7) {
        this.DB110_DBX0_7 = DB110_DBX0_7;
    }

    public String getDB110_DBX10_0() {
        return DB110_DBX10_0;
    }

    public void setDB110_DBX10_0(String DB110_DBX10_0) {
        this.DB110_DBX10_0 = DB110_DBX10_0;
    }

    public String getDB110_DBX10_1() {
        return DB110_DBX10_1;
    }

    public void setDB110_DBX10_1(String DB110_DBX10_1) {
        this.DB110_DBX10_1 = DB110_DBX10_1;
    }

    public String getDB110_DBX10_4() {
        return DB110_DBX10_4;
    }

    public void setDB110_DBX10_4(String DB110_DBX10_4) {
        this.DB110_DBX10_4 = DB110_DBX10_4;
    }

    public String getDB110_DBX10_5() {
        return DB110_DBX10_5;
    }

    public void setDB110_DBX10_5(String DB110_DBX10_5) {
        this.DB110_DBX10_5 = DB110_DBX10_5;
    }

    public String getDB110_DBX10_6() {
        return DB110_DBX10_6;
    }

    public void setDB110_DBX10_6(String DB110_DBX10_6) {
        this.DB110_DBX10_6 = DB110_DBX10_6;
    }

    public String getDB110_DBX10_7() {
        return DB110_DBX10_7;
    }

    public void setDB110_DBX10_7(String DB110_DBX10_7) {
        this.DB110_DBX10_7 = DB110_DBX10_7;
    }

    public String getDB110_DBX11_0() {
        return DB110_DBX11_0;
    }

    public void setDB110_DBX11_0(String DB110_DBX11_0) {
        this.DB110_DBX11_0 = DB110_DBX11_0;
    }

    public String getDB110_DBX11_1() {
        return DB110_DBX11_1;
    }

    public void setDB110_DBX11_1(String DB110_DBX11_1) {
        this.DB110_DBX11_1 = DB110_DBX11_1;
    }

    public String getDB110_DBX11_3() {
        return DB110_DBX11_3;
    }

    public void setDB110_DBX11_3(String DB110_DBX11_3) {
        this.DB110_DBX11_3 = DB110_DBX11_3;
    }

    public String getDB110_DBX11_6() {
        return DB110_DBX11_6;
    }

    public void setDB110_DBX11_6(String DB110_DBX11_6) {
        this.DB110_DBX11_6 = DB110_DBX11_6;
    }

    public String getDB110_DBX13_4() {
        return DB110_DBX13_4;
    }

    public void setDB110_DBX13_4(String DB110_DBX13_4) {
        this.DB110_DBX13_4 = DB110_DBX13_4;
    }

    public String getDB110_DBX13_5() {
        return DB110_DBX13_5;
    }

    public void setDB110_DBX13_5(String DB110_DBX13_5) {
        this.DB110_DBX13_5 = DB110_DBX13_5;
    }

    public String getDB110_DBX13_6() {
        return DB110_DBX13_6;
    }

    public void setDB110_DBX13_6(String DB110_DBX13_6) {
        this.DB110_DBX13_6 = DB110_DBX13_6;
    }

    public String getDB110_DBX13_7() {
        return DB110_DBX13_7;
    }

    public void setDB110_DBX13_7(String DB110_DBX13_7) {
        this.DB110_DBX13_7 = DB110_DBX13_7;
    }

    public String getDB110_DBX14_0() {
        return DB110_DBX14_0;
    }

    public void setDB110_DBX14_0(String DB110_DBX14_0) {
        this.DB110_DBX14_0 = DB110_DBX14_0;
    }

    public String getDB110_DBX14_1() {
        return DB110_DBX14_1;
    }

    public void setDB110_DBX14_1(String DB110_DBX14_1) {
        this.DB110_DBX14_1 = DB110_DBX14_1;
    }

    public String getDB110_DBX14_2() {
        return DB110_DBX14_2;
    }

    public void setDB110_DBX14_2(String DB110_DBX14_2) {
        this.DB110_DBX14_2 = DB110_DBX14_2;
    }

    public String getDB110_DBX14_3() {
        return DB110_DBX14_3;
    }

    public void setDB110_DBX14_3(String DB110_DBX14_3) {
        this.DB110_DBX14_3 = DB110_DBX14_3;
    }

    public String getDB110_DBX14_4() {
        return DB110_DBX14_4;
    }

    public void setDB110_DBX14_4(String DB110_DBX14_4) {
        this.DB110_DBX14_4 = DB110_DBX14_4;
    }

    public String getDB110_DBX14_5() {
        return DB110_DBX14_5;
    }

    public void setDB110_DBX14_5(String DB110_DBX14_5) {
        this.DB110_DBX14_5 = DB110_DBX14_5;
    }

    public String getDB110_DBX14_6() {
        return DB110_DBX14_6;
    }

    public void setDB110_DBX14_6(String DB110_DBX14_6) {
        this.DB110_DBX14_6 = DB110_DBX14_6;
    }

    public String getDB110_DBX14_7() {
        return DB110_DBX14_7;
    }

    public void setDB110_DBX14_7(String DB110_DBX14_7) {
        this.DB110_DBX14_7 = DB110_DBX14_7;
    }

    public String getDB110_DBX15_0() {
        return DB110_DBX15_0;
    }

    public void setDB110_DBX15_0(String DB110_DBX15_0) {
        this.DB110_DBX15_0 = DB110_DBX15_0;
    }

    public String getDB110_DBX15_1() {
        return DB110_DBX15_1;
    }

    public void setDB110_DBX15_1(String DB110_DBX15_1) {
        this.DB110_DBX15_1 = DB110_DBX15_1;
    }

    public String getDB110_DBX15_2() {
        return DB110_DBX15_2;
    }

    public void setDB110_DBX15_2(String DB110_DBX15_2) {
        this.DB110_DBX15_2 = DB110_DBX15_2;
    }

    public String getDB110_DBX15_3() {
        return DB110_DBX15_3;
    }

    public void setDB110_DBX15_3(String DB110_DBX15_3) {
        this.DB110_DBX15_3 = DB110_DBX15_3;
    }

    public String getDB110_DBX16_2() {
        return DB110_DBX16_2;
    }

    public void setDB110_DBX16_2(String DB110_DBX16_2) {
        this.DB110_DBX16_2 = DB110_DBX16_2;
    }

    public String getDB110_DBX16_3() {
        return DB110_DBX16_3;
    }

    public void setDB110_DBX16_3(String DB110_DBX16_3) {
        this.DB110_DBX16_3 = DB110_DBX16_3;
    }

    public String getDB110_DBX16_4() {
        return DB110_DBX16_4;
    }

    public void setDB110_DBX16_4(String DB110_DBX16_4) {
        this.DB110_DBX16_4 = DB110_DBX16_4;
    }

    public String getDB110_DBX16_5() {
        return DB110_DBX16_5;
    }

    public void setDB110_DBX16_5(String DB110_DBX16_5) {
        this.DB110_DBX16_5 = DB110_DBX16_5;
    }

    public String getDB110_DBX17_3() {
        return DB110_DBX17_3;
    }

    public void setDB110_DBX17_3(String DB110_DBX17_3) {
        this.DB110_DBX17_3 = DB110_DBX17_3;
    }

    public String getDB110_DBX17_4() {
        return DB110_DBX17_4;
    }

    public void setDB110_DBX17_4(String DB110_DBX17_4) {
        this.DB110_DBX17_4 = DB110_DBX17_4;
    }

    public String getDB110_DBX17_5() {
        return DB110_DBX17_5;
    }

    public void setDB110_DBX17_5(String DB110_DBX17_5) {
        this.DB110_DBX17_5 = DB110_DBX17_5;
    }

    public String getDB110_DBX17_6() {
        return DB110_DBX17_6;
    }

    public void setDB110_DBX17_6(String DB110_DBX17_6) {
        this.DB110_DBX17_6 = DB110_DBX17_6;
    }

    public String getDB110_DBX17_7() {
        return DB110_DBX17_7;
    }

    public void setDB110_DBX17_7(String DB110_DBX17_7) {
        this.DB110_DBX17_7 = DB110_DBX17_7;
    }

    public String getDB110_DBX1_0() {
        return DB110_DBX1_0;
    }

    public void setDB110_DBX1_0(String DB110_DBX1_0) {
        this.DB110_DBX1_0 = DB110_DBX1_0;
    }

    public String getDB110_DBX1_1() {
        return DB110_DBX1_1;
    }

    public void setDB110_DBX1_1(String DB110_DBX1_1) {
        this.DB110_DBX1_1 = DB110_DBX1_1;
    }

    public String getDB110_DBX34_0() {
        return DB110_DBX34_0;
    }

    public void setDB110_DBX34_0(String DB110_DBX34_0) {
        this.DB110_DBX34_0 = DB110_DBX34_0;
    }

    public String getDB110_DBX35_4() {
        return DB110_DBX35_4;
    }

    public void setDB110_DBX35_4(String DB110_DBX35_4) {
        this.DB110_DBX35_4 = DB110_DBX35_4;
    }

    public String getDB110_DBX35_5() {
        return DB110_DBX35_5;
    }

    public void setDB110_DBX35_5(String DB110_DBX35_5) {
        this.DB110_DBX35_5 = DB110_DBX35_5;
    }

    public String getDB110_DBX35_6() {
        return DB110_DBX35_6;
    }

    public void setDB110_DBX35_6(String DB110_DBX35_6) {
        this.DB110_DBX35_6 = DB110_DBX35_6;
    }

    public String getDB110_DBX4_0() {
        return DB110_DBX4_0;
    }

    public void setDB110_DBX4_0(String DB110_DBX4_0) {
        this.DB110_DBX4_0 = DB110_DBX4_0;
    }

    public String getDB110_DBX4_1() {
        return DB110_DBX4_1;
    }

    public void setDB110_DBX4_1(String DB110_DBX4_1) {
        this.DB110_DBX4_1 = DB110_DBX4_1;
    }

    public String getDB110_DBX4_7() {
        return DB110_DBX4_7;
    }

    public void setDB110_DBX4_7(String DB110_DBX4_7) {
        this.DB110_DBX4_7 = DB110_DBX4_7;
    }

    public String getDB110_DBX558_0() {
        return DB110_DBX558_0;
    }

    public void setDB110_DBX558_0(String DB110_DBX558_0) {
        this.DB110_DBX558_0 = DB110_DBX558_0;
    }

    public String getDB110_DBX5_0() {
        return DB110_DBX5_0;
    }

    public void setDB110_DBX5_0(String DB110_DBX5_0) {
        this.DB110_DBX5_0 = DB110_DBX5_0;
    }

    public String getDB110_DBX5_1() {
        return DB110_DBX5_1;
    }

    public void setDB110_DBX5_1(String DB110_DBX5_1) {
        this.DB110_DBX5_1 = DB110_DBX5_1;
    }

    public String getDB110_DBX5_2() {
        return DB110_DBX5_2;
    }

    public void setDB110_DBX5_2(String DB110_DBX5_2) {
        this.DB110_DBX5_2 = DB110_DBX5_2;
    }

    public String getDB110_DBX5_5() {
        return DB110_DBX5_5;
    }

    public void setDB110_DBX5_5(String DB110_DBX5_5) {
        this.DB110_DBX5_5 = DB110_DBX5_5;
    }

    public String getDB110_DBX6_0() {
        return DB110_DBX6_0;
    }

    public void setDB110_DBX6_0(String DB110_DBX6_0) {
        this.DB110_DBX6_0 = DB110_DBX6_0;
    }

    public String getDB110_DBX6_1() {
        return DB110_DBX6_1;
    }

    public void setDB110_DBX6_1(String DB110_DBX6_1) {
        this.DB110_DBX6_1 = DB110_DBX6_1;
    }

    public String getDB110_DBX6_4() {
        return DB110_DBX6_4;
    }

    public void setDB110_DBX6_4(String DB110_DBX6_4) {
        this.DB110_DBX6_4 = DB110_DBX6_4;
    }

    public String getDB110_DBX6_5() {
        return DB110_DBX6_5;
    }

    public void setDB110_DBX6_5(String DB110_DBX6_5) {
        this.DB110_DBX6_5 = DB110_DBX6_5;
    }

    public String getDB110_DBX6_6() {
        return DB110_DBX6_6;
    }

    public void setDB110_DBX6_6(String DB110_DBX6_6) {
        this.DB110_DBX6_6 = DB110_DBX6_6;
    }

    public String getDB110_DBX6_7() {
        return DB110_DBX6_7;
    }

    public void setDB110_DBX6_7(String DB110_DBX6_7) {
        this.DB110_DBX6_7 = DB110_DBX6_7;
    }

    public String getDB110_DBX7_0() {
        return DB110_DBX7_0;
    }

    public void setDB110_DBX7_0(String DB110_DBX7_0) {
        this.DB110_DBX7_0 = DB110_DBX7_0;
    }

    public String getDB110_DBX7_1() {
        return DB110_DBX7_1;
    }

    public void setDB110_DBX7_1(String DB110_DBX7_1) {
        this.DB110_DBX7_1 = DB110_DBX7_1;
    }

    public String getDB110_DBX7_3() {
        return DB110_DBX7_3;
    }

    public void setDB110_DBX7_3(String DB110_DBX7_3) {
        this.DB110_DBX7_3 = DB110_DBX7_3;
    }

    public String getDB110_DBX7_6() {
        return DB110_DBX7_6;
    }

    public void setDB110_DBX7_6(String DB110_DBX7_6) {
        this.DB110_DBX7_6 = DB110_DBX7_6;
    }

    public String getDB110_DBX8_0() {
        return DB110_DBX8_0;
    }

    public void setDB110_DBX8_0(String DB110_DBX8_0) {
        this.DB110_DBX8_0 = DB110_DBX8_0;
    }

    public String getDB110_DBX8_1() {
        return DB110_DBX8_1;
    }

    public void setDB110_DBX8_1(String DB110_DBX8_1) {
        this.DB110_DBX8_1 = DB110_DBX8_1;
    }

    public String getDB110_DBX8_4() {
        return DB110_DBX8_4;
    }

    public void setDB110_DBX8_4(String DB110_DBX8_4) {
        this.DB110_DBX8_4 = DB110_DBX8_4;
    }

    public String getDB110_DBX8_5() {
        return DB110_DBX8_5;
    }

    public void setDB110_DBX8_5(String DB110_DBX8_5) {
        this.DB110_DBX8_5 = DB110_DBX8_5;
    }

    public String getDB110_DBX8_6() {
        return DB110_DBX8_6;
    }

    public void setDB110_DBX8_6(String DB110_DBX8_6) {
        this.DB110_DBX8_6 = DB110_DBX8_6;
    }

    public String getDB110_DBX8_7() {
        return DB110_DBX8_7;
    }

    public void setDB110_DBX8_7(String DB110_DBX8_7) {
        this.DB110_DBX8_7 = DB110_DBX8_7;
    }

    public String getDB110_DBX9_0() {
        return DB110_DBX9_0;
    }

    public void setDB110_DBX9_0(String DB110_DBX9_0) {
        this.DB110_DBX9_0 = DB110_DBX9_0;
    }

    public String getDB110_DBX9_1() {
        return DB110_DBX9_1;
    }

    public void setDB110_DBX9_1(String DB110_DBX9_1) {
        this.DB110_DBX9_1 = DB110_DBX9_1;
    }

    public String getDB110_DBX9_3() {
        return DB110_DBX9_3;
    }

    public void setDB110_DBX9_3(String DB110_DBX9_3) {
        this.DB110_DBX9_3 = DB110_DBX9_3;
    }

    public String getDB110_DBX9_6() {
        return DB110_DBX9_6;
    }

    public void setDB110_DBX9_6(String DB110_DBX9_6) {
        this.DB110_DBX9_6 = DB110_DBX9_6;
    }

    public String getDB500_DB332() {
        return DB500_DB332;
    }

    public void setDB500_DB332(String DB500_DB332) {
        this.DB500_DB332 = DB500_DB332;
    }

    public String getDB500_DB642() {
        return DB500_DB642;
    }

    public void setDB500_DB642(String DB500_DB642) {
        this.DB500_DB642 = DB500_DB642;
    }

    public String getDB500_DB682() {
        return DB500_DB682;
    }

    public void setDB500_DB682(String DB500_DB682) {
        this.DB500_DB682 = DB500_DB682;
    }

    public String getDB500_DB76() {
        return DB500_DB76;
    }

    public void setDB500_DB76(String DB500_DB76) {
        this.DB500_DB76 = DB500_DB76;
    }

    public String getDB500_DB986() {
        return DB500_DB986;
    }

    public void setDB500_DB986(String DB500_DB986) {
        this.DB500_DB986 = DB500_DB986;
    }

    public BigDecimal getDB500_DBD32() {
        return DB500_DBD32;
    }

    public void setDB500_DBD32(BigDecimal DB500_DBD32) {
        this.DB500_DBD32 = DB500_DBD32;
    }

    public BigDecimal getDB500_DBD36() {
        return DB500_DBD36;
    }

    public void setDB500_DBD36(BigDecimal DB500_DBD36) {
        this.DB500_DBD36 = DB500_DBD36;
    }

    public BigDecimal getDB500_DBD40() {
        return DB500_DBD40;
    }

    public void setDB500_DBD40(BigDecimal DB500_DBD40) {
        this.DB500_DBD40 = DB500_DBD40;
    }

    public BigDecimal getDB500_DBD44() {
        return DB500_DBD44;
    }

    public void setDB500_DBD44(BigDecimal DB500_DBD44) {
        this.DB500_DBD44 = DB500_DBD44;
    }

    public BigDecimal getDB500_DBD48() {
        return DB500_DBD48;
    }

    public void setDB500_DBD48(BigDecimal DB500_DBD48) {
        this.DB500_DBD48 = DB500_DBD48;
    }

    public BigDecimal getDB500_DBD52() {
        return DB500_DBD52;
    }

    public void setDB500_DBD52(BigDecimal DB500_DBD52) {
        this.DB500_DBD52 = DB500_DBD52;
    }

    public BigDecimal getDB500_DBD56() {
        return DB500_DBD56;
    }

    public void setDB500_DBD56(BigDecimal DB500_DBD56) {
        this.DB500_DBD56 = DB500_DBD56;
    }

    public BigDecimal getDB500_DBD588() {
        return DB500_DBD588;
    }

    public void setDB500_DBD588(BigDecimal DB500_DBD588) {
        this.DB500_DBD588 = DB500_DBD588;
    }

    public BigDecimal getDB500_DBD592() {
        return DB500_DBD592;
    }

    public void setDB500_DBD592(BigDecimal DB500_DBD592) {
        this.DB500_DBD592 = DB500_DBD592;
    }

    public BigDecimal getDB500_DBD596() {
        return DB500_DBD596;
    }

    public void setDB500_DBD596(BigDecimal DB500_DBD596) {
        this.DB500_DBD596 = DB500_DBD596;
    }

    public BigDecimal getDB500_DBD60() {
        return DB500_DBD60;
    }

    public void setDB500_DBD60(BigDecimal DB500_DBD60) {
        this.DB500_DBD60 = DB500_DBD60;
    }

    public BigDecimal getDB500_DBD600() {
        return DB500_DBD600;
    }

    public void setDB500_DBD600(BigDecimal DB500_DBD600) {
        this.DB500_DBD600 = DB500_DBD600;
    }

    public BigDecimal getDB500_DBD604() {
        return DB500_DBD604;
    }

    public void setDB500_DBD604(BigDecimal DB500_DBD604) {
        this.DB500_DBD604 = DB500_DBD604;
    }

    public BigDecimal getDB500_DBD608() {
        return DB500_DBD608;
    }

    public void setDB500_DBD608(BigDecimal DB500_DBD608) {
        this.DB500_DBD608 = DB500_DBD608;
    }

    public BigDecimal getDB500_DBD612() {
        return DB500_DBD612;
    }

    public void setDB500_DBD612(BigDecimal DB500_DBD612) {
        this.DB500_DBD612 = DB500_DBD612;
    }

    public BigDecimal getDB500_DBD616() {
        return DB500_DBD616;
    }

    public void setDB500_DBD616(BigDecimal DB500_DBD616) {
        this.DB500_DBD616 = DB500_DBD616;
    }

    public BigDecimal getDB500_DBD938() {
        return DB500_DBD938;
    }

    public void setDB500_DBD938(BigDecimal DB500_DBD938) {
        this.DB500_DBD938 = DB500_DBD938;
    }

    public BigDecimal getDB500_DBD942() {
        return DB500_DBD942;
    }

    public void setDB500_DBD942(BigDecimal DB500_DBD942) {
        this.DB500_DBD942 = DB500_DBD942;
    }

    public BigDecimal getDB500_DBD946() {
        return DB500_DBD946;
    }

    public void setDB500_DBD946(BigDecimal DB500_DBD946) {
        this.DB500_DBD946 = DB500_DBD946;
    }

    public BigDecimal getDB500_DBD950() {
        return DB500_DBD950;
    }

    public void setDB500_DBD950(BigDecimal DB500_DBD950) {
        this.DB500_DBD950 = DB500_DBD950;
    }

    public BigDecimal getDB500_DBD954() {
        return DB500_DBD954;
    }

    public void setDB500_DBD954(BigDecimal DB500_DBD954) {
        this.DB500_DBD954 = DB500_DBD954;
    }

    public BigDecimal getDB500_DBW640() {
        return DB500_DBW640;
    }

    public void setDB500_DBW640(BigDecimal DB500_DBW640) {
        this.DB500_DBW640 = DB500_DBW640;
    }

    public BigDecimal getDB500_DBW958() {
        return DB500_DBW958;
    }

    public void setDB500_DBW958(BigDecimal DB500_DBW958) {
        this.DB500_DBW958 = DB500_DBW958;
    }

    public BigDecimal getDB500_DBW960() {
        return DB500_DBW960;
    }

    public void setDB500_DBW960(BigDecimal DB500_DBW960) {
        this.DB500_DBW960 = DB500_DBW960;
    }

    public String getDB500_DBX0_0() {
        return DB500_DBX0_0;
    }

    public void setDB500_DBX0_0(String DB500_DBX0_0) {
        this.DB500_DBX0_0 = DB500_DBX0_0;
    }

    public String getDB500_DBX0_1() {
        return DB500_DBX0_1;
    }

    public void setDB500_DBX0_1(String DB500_DBX0_1) {
        this.DB500_DBX0_1 = DB500_DBX0_1;
    }

    public String getDB500_DBX0_2() {
        return DB500_DBX0_2;
    }

    public void setDB500_DBX0_2(String DB500_DBX0_2) {
        this.DB500_DBX0_2 = DB500_DBX0_2;
    }

    public String getDB500_DBX0_3() {
        return DB500_DBX0_3;
    }

    public void setDB500_DBX0_3(String DB500_DBX0_3) {
        this.DB500_DBX0_3 = DB500_DBX0_3;
    }

    public String getDB500_DBX0_4() {
        return DB500_DBX0_4;
    }

    public void setDB500_DBX0_4(String DB500_DBX0_4) {
        this.DB500_DBX0_4 = DB500_DBX0_4;
    }

    public String getDB500_DBX0_5() {
        return DB500_DBX0_5;
    }

    public void setDB500_DBX0_5(String DB500_DBX0_5) {
        this.DB500_DBX0_5 = DB500_DBX0_5;
    }

    public String getDB500_DBX0_6() {
        return DB500_DBX0_6;
    }

    public void setDB500_DBX0_6(String DB500_DBX0_6) {
        this.DB500_DBX0_6 = DB500_DBX0_6;
    }

    public String getDB500_DBX1_0() {
        return DB500_DBX1_0;
    }

    public void setDB500_DBX1_0(String DB500_DBX1_0) {
        this.DB500_DBX1_0 = DB500_DBX1_0;
    }

    public String getDB500_DBX1_1() {
        return DB500_DBX1_1;
    }

    public void setDB500_DBX1_1(String DB500_DBX1_1) {
        this.DB500_DBX1_1 = DB500_DBX1_1;
    }

    public BigDecimal getDB500_DBW1028() {
        return DB500_DBW1028;
    }

    public void setDB500_DBW1028(BigDecimal DB500_DBW1028) {
        this.DB500_DBW1028 = DB500_DBW1028;
    }

    public BigDecimal getDB500_DBW1030() {
        return DB500_DBW1030;
    }

    public void setDB500_DBW1030(BigDecimal DB500_DBW1030) {
        this.DB500_DBW1030 = DB500_DBW1030;
    }
}
