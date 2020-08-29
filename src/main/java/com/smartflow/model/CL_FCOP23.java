package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
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
    private String DB126_DBX10_0;
    private String DB126_DBX10_1;
    private String DB126_DBX10_2;
    private String DB126_DBX10_3;
    private String DB126_DBX10_4;
    private String DB126_DBX10_5;
    private String DB126_DBX130_0;
    private String DB126_DBX20_3;
    private String DB126_DBX20_4;
    private String DB126_DBX20_5;
    private String DB126_DBX20_6;
    private String DB126_DBX21_0;
    private String DB126_DBX21_1;
    private String DB126_DBX21_2;
    private String DB126_DBX21_3;
    private String DB126_DBX22_0;
    private String DB126_DBX22_1;
    private String DB126_DBX2_0;
    private String DB126_DBX2_1;
    private String DB126_DBX2_2;
    private String DB126_DBX2_3;
    private String DB126_DBX2_4;
    private String DB126_DBX2_5;
    private String DB126_DBX2_6;
    private String DB126_DBX33_0;
    private String DB126_DBX33_1;
    private String DB126_DBX33_4;
    private String DB126_DBX34_1;
    private String DB126_DBX34_2;
    private String DB126_DBX34_3;
    private String DB126_DBX35_0;
    private String DB126_DBX40_1;
    private String DB126_DBX40_2;
    private String DB126_DBX40_3;
    private String DB126_DBX40_6;
    private String DB126_DBX41_0;
    private String DB126_DBX41_1;
    private String DB126_DBX41_2;
    private String DB126_DBX41_3;
    private String DB126_DBX41_4;
    private String DB126_DBX42_0;
    private String DB126_DBX42_1;
    private String DB126_DBX42_2;
    private String DB126_DBX42_3;
    private String DB126_DBX4_0;
    private String DB126_DBX4_1;
    private String DB126_DBX5_0;
    private String DB126_DBX5_1;
    private String DB126_DBX6_0;
    private String DB126_DBX6_1;
    private String DB126_DBX7_0;
    private String DB126_DBX7_1;
    private String DB127_DBX14_0;
    private String DB127_DBX14_1;
    private String DB127_DBX14_2;
    private String DB127_DBX14_3;
    private String DB127_DBX14_4;
    private String DB127_DBX14_5;
    private String DB127_DBX14_6;
    private String DB127_DBX14_7;
    private String DB127_DBX15_0;
    private String DB127_DBX16_0;
    private String DB127_DBX16_1;
    private String DB127_DBX16_2;
    private String DB127_DBX16_3;
    private String DB127_DBX16_4;
    private String DB127_DBX16_5;
    private String DB127_DBX16_6;
    private String DB127_DBX16_7;
    private String DB127_DBX17_0;
    private String DB127_DBX18_0;
    private String DB127_DBX18_1;
    private String DB127_DBX18_2;
    private String DB127_DBX18_3;
    private String DB127_DBX18_4;
    private String DB127_DBX18_5;
    private String DB127_DBX18_6;
    private String DB127_DBX18_7;
    private String DB127_DBX19_0;
    private String DB127_DBX22_0;
    private String DB127_DBX22_1;
    private String DB127_DBX22_2;
    private String DB127_DBX22_3;
    private String DB127_DBX22_4;
    private String DB127_DBX22_5;
    private String DB127_DBX22_6;
    private String DB127_DBX22_7;
    private String DB127_DBX23_0;
    private String DB127_DBX24_0;
    private String DB127_DBX24_1;
    private String DB127_DBX24_2;
    private String DB127_DBX24_3;
    private String DB127_DBX24_4;
    private String DB127_DBX24_5;
    private String DB127_DBX24_6;
    private String DB127_DBX24_7;
    private String DB127_DBX25_0;
    private String DB127_DBX2_0;
    private String DB127_DBX2_1;
    private String DB127_DBX2_2;
    private String DB127_DBX2_3;
    private String DB127_DBX2_4;
    private String DB127_DBX2_5;
    private String DB127_DBX2_6;
    private String DB127_DBX2_7;
    private String DB127_DBX38_0;
    private String DB127_DBX38_1;
    private String DB127_DBX38_2;
    private String DB127_DBX38_3;
    private String DB127_DBX38_4;
    private String DB127_DBX38_5;
    private String DB127_DBX38_6;
    private String DB127_DBX38_7;
    private String DB127_DBX39_0;
    private String DB127_DBX3_0;
    private String DB127_DBX42_0;
    private String DB127_DBX42_1;
    private String DB127_DBX42_2;
    private String DB127_DBX42_3;
    private String DB127_DBX42_4;
    private String DB127_DBX42_5;
    private String DB127_DBX42_6;
    private String DB127_DBX42_7;
    private String DB127_DBX43_0;
    private String DB127_DBX46_0;
    private String DB127_DBX46_1;
    private String DB127_DBX46_2;
    private String DB127_DBX46_3;
    private String DB127_DBX46_4;
    private String DB127_DBX46_5;
    private String DB127_DBX46_6;
    private String DB127_DBX46_7;
    private String DB127_DBX47_0;
    private String DB127_DBX48_0;
    private String DB127_DBX48_1;
    private String DB127_DBX48_2;
    private String DB127_DBX48_3;
    private String DB127_DBX48_4;
    private String DB127_DBX48_5;
    private String DB127_DBX48_6;
    private String DB127_DBX48_7;
    private String DB127_DBX49_0;
    private String DB127_DBX50_0;
    private String DB127_DBX50_1;
    private String DB127_DBX50_2;
    private String DB127_DBX50_3;
    private String DB127_DBX50_4;
    private String DB127_DBX50_5;
    private String DB127_DBX50_6;
    private String DB127_DBX50_7;
    private String DB127_DBX51_0;
    private String DB127_DBX52_0;
    private String DB127_DBX52_1;
    private String DB127_DBX52_2;
    private String DB127_DBX52_3;
    private String DB127_DBX52_4;
    private String DB127_DBX52_5;
    private String DB127_DBX52_6;
    private String DB127_DBX52_7;
    private String DB127_DBX53_0;
    private String DB127_DBX54_0;
    private String DB127_DBX54_1;
    private String DB127_DBX54_2;
    private String DB127_DBX54_3;
    private String DB127_DBX54_4;
    private String DB127_DBX54_5;
    private String DB127_DBX54_6;
    private String DB127_DBX54_7;
    private String DB127_DBX55_0;
    private String DB127_DBX56_0;
    private String DB127_DBX56_1;
    private String DB127_DBX56_2;
    private String DB127_DBX56_3;
    private String DB127_DBX56_4;
    private String DB127_DBX56_5;
    private String DB127_DBX56_6;
    private String DB127_DBX56_7;
    private String DB127_DBX57_0;
    private String DB127_DBX6_0;
    private String DB127_DBX6_1;
    private String DB127_DBX6_2;
    private String DB127_DBX6_3;
    private String DB127_DBX6_4;
    private String DB127_DBX6_5;
    private String DB127_DBX6_6;
    private String DB127_DBX6_7;
    private String DB127_DBX7_0;
    private String DB127_DBX8_0;
    private String DB127_DBX8_1;
    private String DB127_DBX8_2;
    private String DB127_DBX8_3;
    private String DB127_DBX8_4;
    private String DB127_DBX8_5;
    private String DB127_DBX8_6;
    private String DB127_DBX8_7;
    private String DB127_DBX9_0;
    private String DB2000_DB12;
    private String DB2000_DB40;
    private String DB2000_DB552;
    private Integer DB2000_DBW0;
    private Integer DB2000_DBW10;
    private Integer DB2000_DBW2;
    private Integer DB2000_DBW4;
    private Integer DB2000_DBW6;
    private Integer DB2000_DBW8;
    private String DB2000_DBX1000_0;
    private String DB2000_DBX1000_1;
    private String DB2000_DBX1000_2;
    private String DB2000_DBX1000_3;
    private String DB2000_DBX1000_4;
    private String DB2000_DBX1000_5;
    private String DB2000_DBX1000_6;
    private String DB2000_DBX1000_7;
    private String DB2000_DBX1100_0;
    private String DB2000_DBX1100_1;
    private String DB2000_DBX1100_2;
    private String DB2000_DBX1100_3;
    private String DB2000_DBX1100_4;
    private String DB2000_DBX1100_5;
    private String DB2000_DBX1100_6;
    private String DB2000_DBX1100_7;

    public String getDB2000_DB552() {
        return DB2000_DB552;
    }

    public void setDB2000_DB552(String DB2000_DB552) {
        this.DB2000_DB552 = DB2000_DB552;
    }

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

    public String getDB126_DBX10_0() {
        return DB126_DBX10_0;
    }

    public void setDB126_DBX10_0(String DB126_DBX10_0) {
        this.DB126_DBX10_0 = DB126_DBX10_0;
    }

    public String getDB126_DBX10_1() {
        return DB126_DBX10_1;
    }

    public void setDB126_DBX10_1(String DB126_DBX10_1) {
        this.DB126_DBX10_1 = DB126_DBX10_1;
    }

    public String getDB126_DBX10_2() {
        return DB126_DBX10_2;
    }

    public void setDB126_DBX10_2(String DB126_DBX10_2) {
        this.DB126_DBX10_2 = DB126_DBX10_2;
    }

    public String getDB126_DBX10_3() {
        return DB126_DBX10_3;
    }

    public void setDB126_DBX10_3(String DB126_DBX10_3) {
        this.DB126_DBX10_3 = DB126_DBX10_3;
    }

    public String getDB126_DBX10_4() {
        return DB126_DBX10_4;
    }

    public void setDB126_DBX10_4(String DB126_DBX10_4) {
        this.DB126_DBX10_4 = DB126_DBX10_4;
    }

    public String getDB126_DBX10_5() {
        return DB126_DBX10_5;
    }

    public void setDB126_DBX10_5(String DB126_DBX10_5) {
        this.DB126_DBX10_5 = DB126_DBX10_5;
    }

    public String getDB126_DBX130_0() {
        return DB126_DBX130_0;
    }

    public void setDB126_DBX130_0(String DB126_DBX130_0) {
        this.DB126_DBX130_0 = DB126_DBX130_0;
    }

    public String getDB126_DBX20_3() {
        return DB126_DBX20_3;
    }

    public void setDB126_DBX20_3(String DB126_DBX20_3) {
        this.DB126_DBX20_3 = DB126_DBX20_3;
    }

    public String getDB126_DBX20_4() {
        return DB126_DBX20_4;
    }

    public void setDB126_DBX20_4(String DB126_DBX20_4) {
        this.DB126_DBX20_4 = DB126_DBX20_4;
    }

    public String getDB126_DBX20_5() {
        return DB126_DBX20_5;
    }

    public void setDB126_DBX20_5(String DB126_DBX20_5) {
        this.DB126_DBX20_5 = DB126_DBX20_5;
    }

    public String getDB126_DBX20_6() {
        return DB126_DBX20_6;
    }

    public void setDB126_DBX20_6(String DB126_DBX20_6) {
        this.DB126_DBX20_6 = DB126_DBX20_6;
    }

    public String getDB126_DBX21_0() {
        return DB126_DBX21_0;
    }

    public void setDB126_DBX21_0(String DB126_DBX21_0) {
        this.DB126_DBX21_0 = DB126_DBX21_0;
    }

    public String getDB126_DBX21_1() {
        return DB126_DBX21_1;
    }

    public void setDB126_DBX21_1(String DB126_DBX21_1) {
        this.DB126_DBX21_1 = DB126_DBX21_1;
    }

    public String getDB126_DBX21_2() {
        return DB126_DBX21_2;
    }

    public void setDB126_DBX21_2(String DB126_DBX21_2) {
        this.DB126_DBX21_2 = DB126_DBX21_2;
    }

    public String getDB126_DBX21_3() {
        return DB126_DBX21_3;
    }

    public void setDB126_DBX21_3(String DB126_DBX21_3) {
        this.DB126_DBX21_3 = DB126_DBX21_3;
    }

    public String getDB126_DBX22_0() {
        return DB126_DBX22_0;
    }

    public void setDB126_DBX22_0(String DB126_DBX22_0) {
        this.DB126_DBX22_0 = DB126_DBX22_0;
    }

    public String getDB126_DBX22_1() {
        return DB126_DBX22_1;
    }

    public void setDB126_DBX22_1(String DB126_DBX22_1) {
        this.DB126_DBX22_1 = DB126_DBX22_1;
    }

    public String getDB126_DBX2_0() {
        return DB126_DBX2_0;
    }

    public void setDB126_DBX2_0(String DB126_DBX2_0) {
        this.DB126_DBX2_0 = DB126_DBX2_0;
    }

    public String getDB126_DBX2_1() {
        return DB126_DBX2_1;
    }

    public void setDB126_DBX2_1(String DB126_DBX2_1) {
        this.DB126_DBX2_1 = DB126_DBX2_1;
    }

    public String getDB126_DBX2_2() {
        return DB126_DBX2_2;
    }

    public void setDB126_DBX2_2(String DB126_DBX2_2) {
        this.DB126_DBX2_2 = DB126_DBX2_2;
    }

    public String getDB126_DBX2_3() {
        return DB126_DBX2_3;
    }

    public void setDB126_DBX2_3(String DB126_DBX2_3) {
        this.DB126_DBX2_3 = DB126_DBX2_3;
    }

    public String getDB126_DBX2_4() {
        return DB126_DBX2_4;
    }

    public void setDB126_DBX2_4(String DB126_DBX2_4) {
        this.DB126_DBX2_4 = DB126_DBX2_4;
    }

    public String getDB126_DBX2_5() {
        return DB126_DBX2_5;
    }

    public void setDB126_DBX2_5(String DB126_DBX2_5) {
        this.DB126_DBX2_5 = DB126_DBX2_5;
    }

    public String getDB126_DBX2_6() {
        return DB126_DBX2_6;
    }

    public void setDB126_DBX2_6(String DB126_DBX2_6) {
        this.DB126_DBX2_6 = DB126_DBX2_6;
    }

    public String getDB126_DBX33_0() {
        return DB126_DBX33_0;
    }

    public void setDB126_DBX33_0(String DB126_DBX33_0) {
        this.DB126_DBX33_0 = DB126_DBX33_0;
    }

    public String getDB126_DBX33_1() {
        return DB126_DBX33_1;
    }

    public void setDB126_DBX33_1(String DB126_DBX33_1) {
        this.DB126_DBX33_1 = DB126_DBX33_1;
    }

    public String getDB126_DBX33_4() {
        return DB126_DBX33_4;
    }

    public void setDB126_DBX33_4(String DB126_DBX33_4) {
        this.DB126_DBX33_4 = DB126_DBX33_4;
    }

    public String getDB126_DBX34_1() {
        return DB126_DBX34_1;
    }

    public void setDB126_DBX34_1(String DB126_DBX34_1) {
        this.DB126_DBX34_1 = DB126_DBX34_1;
    }

    public String getDB126_DBX34_2() {
        return DB126_DBX34_2;
    }

    public void setDB126_DBX34_2(String DB126_DBX34_2) {
        this.DB126_DBX34_2 = DB126_DBX34_2;
    }

    public String getDB126_DBX34_3() {
        return DB126_DBX34_3;
    }

    public void setDB126_DBX34_3(String DB126_DBX34_3) {
        this.DB126_DBX34_3 = DB126_DBX34_3;
    }

    public String getDB126_DBX35_0() {
        return DB126_DBX35_0;
    }

    public void setDB126_DBX35_0(String DB126_DBX35_0) {
        this.DB126_DBX35_0 = DB126_DBX35_0;
    }

    public String getDB126_DBX40_1() {
        return DB126_DBX40_1;
    }

    public void setDB126_DBX40_1(String DB126_DBX40_1) {
        this.DB126_DBX40_1 = DB126_DBX40_1;
    }

    public String getDB126_DBX40_2() {
        return DB126_DBX40_2;
    }

    public void setDB126_DBX40_2(String DB126_DBX40_2) {
        this.DB126_DBX40_2 = DB126_DBX40_2;
    }

    public String getDB126_DBX40_3() {
        return DB126_DBX40_3;
    }

    public void setDB126_DBX40_3(String DB126_DBX40_3) {
        this.DB126_DBX40_3 = DB126_DBX40_3;
    }

    public String getDB126_DBX40_6() {
        return DB126_DBX40_6;
    }

    public void setDB126_DBX40_6(String DB126_DBX40_6) {
        this.DB126_DBX40_6 = DB126_DBX40_6;
    }

    public String getDB126_DBX41_0() {
        return DB126_DBX41_0;
    }

    public void setDB126_DBX41_0(String DB126_DBX41_0) {
        this.DB126_DBX41_0 = DB126_DBX41_0;
    }

    public String getDB126_DBX41_1() {
        return DB126_DBX41_1;
    }

    public void setDB126_DBX41_1(String DB126_DBX41_1) {
        this.DB126_DBX41_1 = DB126_DBX41_1;
    }

    public String getDB126_DBX41_2() {
        return DB126_DBX41_2;
    }

    public void setDB126_DBX41_2(String DB126_DBX41_2) {
        this.DB126_DBX41_2 = DB126_DBX41_2;
    }

    public String getDB126_DBX41_3() {
        return DB126_DBX41_3;
    }

    public void setDB126_DBX41_3(String DB126_DBX41_3) {
        this.DB126_DBX41_3 = DB126_DBX41_3;
    }

    public String getDB126_DBX41_4() {
        return DB126_DBX41_4;
    }

    public void setDB126_DBX41_4(String DB126_DBX41_4) {
        this.DB126_DBX41_4 = DB126_DBX41_4;
    }

    public String getDB126_DBX42_0() {
        return DB126_DBX42_0;
    }

    public void setDB126_DBX42_0(String DB126_DBX42_0) {
        this.DB126_DBX42_0 = DB126_DBX42_0;
    }

    public String getDB126_DBX42_1() {
        return DB126_DBX42_1;
    }

    public void setDB126_DBX42_1(String DB126_DBX42_1) {
        this.DB126_DBX42_1 = DB126_DBX42_1;
    }

    public String getDB126_DBX42_2() {
        return DB126_DBX42_2;
    }

    public void setDB126_DBX42_2(String DB126_DBX42_2) {
        this.DB126_DBX42_2 = DB126_DBX42_2;
    }

    public String getDB126_DBX42_3() {
        return DB126_DBX42_3;
    }

    public void setDB126_DBX42_3(String DB126_DBX42_3) {
        this.DB126_DBX42_3 = DB126_DBX42_3;
    }

    public String getDB126_DBX4_0() {
        return DB126_DBX4_0;
    }

    public void setDB126_DBX4_0(String DB126_DBX4_0) {
        this.DB126_DBX4_0 = DB126_DBX4_0;
    }

    public String getDB126_DBX4_1() {
        return DB126_DBX4_1;
    }

    public void setDB126_DBX4_1(String DB126_DBX4_1) {
        this.DB126_DBX4_1 = DB126_DBX4_1;
    }

    public String getDB126_DBX5_0() {
        return DB126_DBX5_0;
    }

    public void setDB126_DBX5_0(String DB126_DBX5_0) {
        this.DB126_DBX5_0 = DB126_DBX5_0;
    }

    public String getDB126_DBX5_1() {
        return DB126_DBX5_1;
    }

    public void setDB126_DBX5_1(String DB126_DBX5_1) {
        this.DB126_DBX5_1 = DB126_DBX5_1;
    }

    public String getDB126_DBX6_0() {
        return DB126_DBX6_0;
    }

    public void setDB126_DBX6_0(String DB126_DBX6_0) {
        this.DB126_DBX6_0 = DB126_DBX6_0;
    }

    public String getDB126_DBX6_1() {
        return DB126_DBX6_1;
    }

    public void setDB126_DBX6_1(String DB126_DBX6_1) {
        this.DB126_DBX6_1 = DB126_DBX6_1;
    }

    public String getDB126_DBX7_0() {
        return DB126_DBX7_0;
    }

    public void setDB126_DBX7_0(String DB126_DBX7_0) {
        this.DB126_DBX7_0 = DB126_DBX7_0;
    }

    public String getDB126_DBX7_1() {
        return DB126_DBX7_1;
    }

    public void setDB126_DBX7_1(String DB126_DBX7_1) {
        this.DB126_DBX7_1 = DB126_DBX7_1;
    }

    public String getDB127_DBX14_0() {
        return DB127_DBX14_0;
    }

    public void setDB127_DBX14_0(String DB127_DBX14_0) {
        this.DB127_DBX14_0 = DB127_DBX14_0;
    }

    public String getDB127_DBX14_1() {
        return DB127_DBX14_1;
    }

    public void setDB127_DBX14_1(String DB127_DBX14_1) {
        this.DB127_DBX14_1 = DB127_DBX14_1;
    }

    public String getDB127_DBX14_2() {
        return DB127_DBX14_2;
    }

    public void setDB127_DBX14_2(String DB127_DBX14_2) {
        this.DB127_DBX14_2 = DB127_DBX14_2;
    }

    public String getDB127_DBX14_3() {
        return DB127_DBX14_3;
    }

    public void setDB127_DBX14_3(String DB127_DBX14_3) {
        this.DB127_DBX14_3 = DB127_DBX14_3;
    }

    public String getDB127_DBX14_4() {
        return DB127_DBX14_4;
    }

    public void setDB127_DBX14_4(String DB127_DBX14_4) {
        this.DB127_DBX14_4 = DB127_DBX14_4;
    }

    public String getDB127_DBX14_5() {
        return DB127_DBX14_5;
    }

    public void setDB127_DBX14_5(String DB127_DBX14_5) {
        this.DB127_DBX14_5 = DB127_DBX14_5;
    }

    public String getDB127_DBX14_6() {
        return DB127_DBX14_6;
    }

    public void setDB127_DBX14_6(String DB127_DBX14_6) {
        this.DB127_DBX14_6 = DB127_DBX14_6;
    }

    public String getDB127_DBX14_7() {
        return DB127_DBX14_7;
    }

    public void setDB127_DBX14_7(String DB127_DBX14_7) {
        this.DB127_DBX14_7 = DB127_DBX14_7;
    }

    public String getDB127_DBX15_0() {
        return DB127_DBX15_0;
    }

    public void setDB127_DBX15_0(String DB127_DBX15_0) {
        this.DB127_DBX15_0 = DB127_DBX15_0;
    }

    public String getDB127_DBX16_0() {
        return DB127_DBX16_0;
    }

    public void setDB127_DBX16_0(String DB127_DBX16_0) {
        this.DB127_DBX16_0 = DB127_DBX16_0;
    }

    public String getDB127_DBX16_1() {
        return DB127_DBX16_1;
    }

    public void setDB127_DBX16_1(String DB127_DBX16_1) {
        this.DB127_DBX16_1 = DB127_DBX16_1;
    }

    public String getDB127_DBX16_2() {
        return DB127_DBX16_2;
    }

    public void setDB127_DBX16_2(String DB127_DBX16_2) {
        this.DB127_DBX16_2 = DB127_DBX16_2;
    }

    public String getDB127_DBX16_3() {
        return DB127_DBX16_3;
    }

    public void setDB127_DBX16_3(String DB127_DBX16_3) {
        this.DB127_DBX16_3 = DB127_DBX16_3;
    }

    public String getDB127_DBX16_4() {
        return DB127_DBX16_4;
    }

    public void setDB127_DBX16_4(String DB127_DBX16_4) {
        this.DB127_DBX16_4 = DB127_DBX16_4;
    }

    public String getDB127_DBX16_5() {
        return DB127_DBX16_5;
    }

    public void setDB127_DBX16_5(String DB127_DBX16_5) {
        this.DB127_DBX16_5 = DB127_DBX16_5;
    }

    public String getDB127_DBX16_6() {
        return DB127_DBX16_6;
    }

    public void setDB127_DBX16_6(String DB127_DBX16_6) {
        this.DB127_DBX16_6 = DB127_DBX16_6;
    }

    public String getDB127_DBX16_7() {
        return DB127_DBX16_7;
    }

    public void setDB127_DBX16_7(String DB127_DBX16_7) {
        this.DB127_DBX16_7 = DB127_DBX16_7;
    }

    public String getDB127_DBX17_0() {
        return DB127_DBX17_0;
    }

    public void setDB127_DBX17_0(String DB127_DBX17_0) {
        this.DB127_DBX17_0 = DB127_DBX17_0;
    }

    public String getDB127_DBX18_0() {
        return DB127_DBX18_0;
    }

    public void setDB127_DBX18_0(String DB127_DBX18_0) {
        this.DB127_DBX18_0 = DB127_DBX18_0;
    }

    public String getDB127_DBX18_1() {
        return DB127_DBX18_1;
    }

    public void setDB127_DBX18_1(String DB127_DBX18_1) {
        this.DB127_DBX18_1 = DB127_DBX18_1;
    }

    public String getDB127_DBX18_2() {
        return DB127_DBX18_2;
    }

    public void setDB127_DBX18_2(String DB127_DBX18_2) {
        this.DB127_DBX18_2 = DB127_DBX18_2;
    }

    public String getDB127_DBX18_3() {
        return DB127_DBX18_3;
    }

    public void setDB127_DBX18_3(String DB127_DBX18_3) {
        this.DB127_DBX18_3 = DB127_DBX18_3;
    }

    public String getDB127_DBX18_4() {
        return DB127_DBX18_4;
    }

    public void setDB127_DBX18_4(String DB127_DBX18_4) {
        this.DB127_DBX18_4 = DB127_DBX18_4;
    }

    public String getDB127_DBX18_5() {
        return DB127_DBX18_5;
    }

    public void setDB127_DBX18_5(String DB127_DBX18_5) {
        this.DB127_DBX18_5 = DB127_DBX18_5;
    }

    public String getDB127_DBX18_6() {
        return DB127_DBX18_6;
    }

    public void setDB127_DBX18_6(String DB127_DBX18_6) {
        this.DB127_DBX18_6 = DB127_DBX18_6;
    }

    public String getDB127_DBX18_7() {
        return DB127_DBX18_7;
    }

    public void setDB127_DBX18_7(String DB127_DBX18_7) {
        this.DB127_DBX18_7 = DB127_DBX18_7;
    }

    public String getDB127_DBX19_0() {
        return DB127_DBX19_0;
    }

    public void setDB127_DBX19_0(String DB127_DBX19_0) {
        this.DB127_DBX19_0 = DB127_DBX19_0;
    }

    public String getDB127_DBX22_0() {
        return DB127_DBX22_0;
    }

    public void setDB127_DBX22_0(String DB127_DBX22_0) {
        this.DB127_DBX22_0 = DB127_DBX22_0;
    }

    public String getDB127_DBX22_1() {
        return DB127_DBX22_1;
    }

    public void setDB127_DBX22_1(String DB127_DBX22_1) {
        this.DB127_DBX22_1 = DB127_DBX22_1;
    }

    public String getDB127_DBX22_2() {
        return DB127_DBX22_2;
    }

    public void setDB127_DBX22_2(String DB127_DBX22_2) {
        this.DB127_DBX22_2 = DB127_DBX22_2;
    }

    public String getDB127_DBX22_3() {
        return DB127_DBX22_3;
    }

    public void setDB127_DBX22_3(String DB127_DBX22_3) {
        this.DB127_DBX22_3 = DB127_DBX22_3;
    }

    public String getDB127_DBX22_4() {
        return DB127_DBX22_4;
    }

    public void setDB127_DBX22_4(String DB127_DBX22_4) {
        this.DB127_DBX22_4 = DB127_DBX22_4;
    }

    public String getDB127_DBX22_5() {
        return DB127_DBX22_5;
    }

    public void setDB127_DBX22_5(String DB127_DBX22_5) {
        this.DB127_DBX22_5 = DB127_DBX22_5;
    }

    public String getDB127_DBX22_6() {
        return DB127_DBX22_6;
    }

    public void setDB127_DBX22_6(String DB127_DBX22_6) {
        this.DB127_DBX22_6 = DB127_DBX22_6;
    }

    public String getDB127_DBX22_7() {
        return DB127_DBX22_7;
    }

    public void setDB127_DBX22_7(String DB127_DBX22_7) {
        this.DB127_DBX22_7 = DB127_DBX22_7;
    }

    public String getDB127_DBX23_0() {
        return DB127_DBX23_0;
    }

    public void setDB127_DBX23_0(String DB127_DBX23_0) {
        this.DB127_DBX23_0 = DB127_DBX23_0;
    }

    public String getDB127_DBX24_0() {
        return DB127_DBX24_0;
    }

    public void setDB127_DBX24_0(String DB127_DBX24_0) {
        this.DB127_DBX24_0 = DB127_DBX24_0;
    }

    public String getDB127_DBX24_1() {
        return DB127_DBX24_1;
    }

    public void setDB127_DBX24_1(String DB127_DBX24_1) {
        this.DB127_DBX24_1 = DB127_DBX24_1;
    }

    public String getDB127_DBX24_2() {
        return DB127_DBX24_2;
    }

    public void setDB127_DBX24_2(String DB127_DBX24_2) {
        this.DB127_DBX24_2 = DB127_DBX24_2;
    }

    public String getDB127_DBX24_3() {
        return DB127_DBX24_3;
    }

    public void setDB127_DBX24_3(String DB127_DBX24_3) {
        this.DB127_DBX24_3 = DB127_DBX24_3;
    }

    public String getDB127_DBX24_4() {
        return DB127_DBX24_4;
    }

    public void setDB127_DBX24_4(String DB127_DBX24_4) {
        this.DB127_DBX24_4 = DB127_DBX24_4;
    }

    public String getDB127_DBX24_5() {
        return DB127_DBX24_5;
    }

    public void setDB127_DBX24_5(String DB127_DBX24_5) {
        this.DB127_DBX24_5 = DB127_DBX24_5;
    }

    public String getDB127_DBX24_6() {
        return DB127_DBX24_6;
    }

    public void setDB127_DBX24_6(String DB127_DBX24_6) {
        this.DB127_DBX24_6 = DB127_DBX24_6;
    }

    public String getDB127_DBX24_7() {
        return DB127_DBX24_7;
    }

    public void setDB127_DBX24_7(String DB127_DBX24_7) {
        this.DB127_DBX24_7 = DB127_DBX24_7;
    }

    public String getDB127_DBX25_0() {
        return DB127_DBX25_0;
    }

    public void setDB127_DBX25_0(String DB127_DBX25_0) {
        this.DB127_DBX25_0 = DB127_DBX25_0;
    }

    public String getDB127_DBX2_0() {
        return DB127_DBX2_0;
    }

    public void setDB127_DBX2_0(String DB127_DBX2_0) {
        this.DB127_DBX2_0 = DB127_DBX2_0;
    }

    public String getDB127_DBX2_1() {
        return DB127_DBX2_1;
    }

    public void setDB127_DBX2_1(String DB127_DBX2_1) {
        this.DB127_DBX2_1 = DB127_DBX2_1;
    }

    public String getDB127_DBX2_2() {
        return DB127_DBX2_2;
    }

    public void setDB127_DBX2_2(String DB127_DBX2_2) {
        this.DB127_DBX2_2 = DB127_DBX2_2;
    }

    public String getDB127_DBX2_3() {
        return DB127_DBX2_3;
    }

    public void setDB127_DBX2_3(String DB127_DBX2_3) {
        this.DB127_DBX2_3 = DB127_DBX2_3;
    }

    public String getDB127_DBX2_4() {
        return DB127_DBX2_4;
    }

    public void setDB127_DBX2_4(String DB127_DBX2_4) {
        this.DB127_DBX2_4 = DB127_DBX2_4;
    }

    public String getDB127_DBX2_5() {
        return DB127_DBX2_5;
    }

    public void setDB127_DBX2_5(String DB127_DBX2_5) {
        this.DB127_DBX2_5 = DB127_DBX2_5;
    }

    public String getDB127_DBX2_6() {
        return DB127_DBX2_6;
    }

    public void setDB127_DBX2_6(String DB127_DBX2_6) {
        this.DB127_DBX2_6 = DB127_DBX2_6;
    }

    public String getDB127_DBX2_7() {
        return DB127_DBX2_7;
    }

    public void setDB127_DBX2_7(String DB127_DBX2_7) {
        this.DB127_DBX2_7 = DB127_DBX2_7;
    }

    public String getDB127_DBX38_0() {
        return DB127_DBX38_0;
    }

    public void setDB127_DBX38_0(String DB127_DBX38_0) {
        this.DB127_DBX38_0 = DB127_DBX38_0;
    }

    public String getDB127_DBX38_1() {
        return DB127_DBX38_1;
    }

    public void setDB127_DBX38_1(String DB127_DBX38_1) {
        this.DB127_DBX38_1 = DB127_DBX38_1;
    }

    public String getDB127_DBX38_2() {
        return DB127_DBX38_2;
    }

    public void setDB127_DBX38_2(String DB127_DBX38_2) {
        this.DB127_DBX38_2 = DB127_DBX38_2;
    }

    public String getDB127_DBX38_3() {
        return DB127_DBX38_3;
    }

    public void setDB127_DBX38_3(String DB127_DBX38_3) {
        this.DB127_DBX38_3 = DB127_DBX38_3;
    }

    public String getDB127_DBX38_4() {
        return DB127_DBX38_4;
    }

    public void setDB127_DBX38_4(String DB127_DBX38_4) {
        this.DB127_DBX38_4 = DB127_DBX38_4;
    }

    public String getDB127_DBX38_5() {
        return DB127_DBX38_5;
    }

    public void setDB127_DBX38_5(String DB127_DBX38_5) {
        this.DB127_DBX38_5 = DB127_DBX38_5;
    }

    public String getDB127_DBX38_6() {
        return DB127_DBX38_6;
    }

    public void setDB127_DBX38_6(String DB127_DBX38_6) {
        this.DB127_DBX38_6 = DB127_DBX38_6;
    }

    public String getDB127_DBX38_7() {
        return DB127_DBX38_7;
    }

    public void setDB127_DBX38_7(String DB127_DBX38_7) {
        this.DB127_DBX38_7 = DB127_DBX38_7;
    }

    public String getDB127_DBX39_0() {
        return DB127_DBX39_0;
    }

    public void setDB127_DBX39_0(String DB127_DBX39_0) {
        this.DB127_DBX39_0 = DB127_DBX39_0;
    }

    public String getDB127_DBX3_0() {
        return DB127_DBX3_0;
    }

    public void setDB127_DBX3_0(String DB127_DBX3_0) {
        this.DB127_DBX3_0 = DB127_DBX3_0;
    }

    public String getDB127_DBX42_0() {
        return DB127_DBX42_0;
    }

    public void setDB127_DBX42_0(String DB127_DBX42_0) {
        this.DB127_DBX42_0 = DB127_DBX42_0;
    }

    public String getDB127_DBX42_1() {
        return DB127_DBX42_1;
    }

    public void setDB127_DBX42_1(String DB127_DBX42_1) {
        this.DB127_DBX42_1 = DB127_DBX42_1;
    }

    public String getDB127_DBX42_2() {
        return DB127_DBX42_2;
    }

    public void setDB127_DBX42_2(String DB127_DBX42_2) {
        this.DB127_DBX42_2 = DB127_DBX42_2;
    }

    public String getDB127_DBX42_3() {
        return DB127_DBX42_3;
    }

    public void setDB127_DBX42_3(String DB127_DBX42_3) {
        this.DB127_DBX42_3 = DB127_DBX42_3;
    }

    public String getDB127_DBX42_4() {
        return DB127_DBX42_4;
    }

    public void setDB127_DBX42_4(String DB127_DBX42_4) {
        this.DB127_DBX42_4 = DB127_DBX42_4;
    }

    public String getDB127_DBX42_5() {
        return DB127_DBX42_5;
    }

    public void setDB127_DBX42_5(String DB127_DBX42_5) {
        this.DB127_DBX42_5 = DB127_DBX42_5;
    }

    public String getDB127_DBX42_6() {
        return DB127_DBX42_6;
    }

    public void setDB127_DBX42_6(String DB127_DBX42_6) {
        this.DB127_DBX42_6 = DB127_DBX42_6;
    }

    public String getDB127_DBX42_7() {
        return DB127_DBX42_7;
    }

    public void setDB127_DBX42_7(String DB127_DBX42_7) {
        this.DB127_DBX42_7 = DB127_DBX42_7;
    }

    public String getDB127_DBX43_0() {
        return DB127_DBX43_0;
    }

    public void setDB127_DBX43_0(String DB127_DBX43_0) {
        this.DB127_DBX43_0 = DB127_DBX43_0;
    }

    public String getDB127_DBX46_0() {
        return DB127_DBX46_0;
    }

    public void setDB127_DBX46_0(String DB127_DBX46_0) {
        this.DB127_DBX46_0 = DB127_DBX46_0;
    }

    public String getDB127_DBX46_1() {
        return DB127_DBX46_1;
    }

    public void setDB127_DBX46_1(String DB127_DBX46_1) {
        this.DB127_DBX46_1 = DB127_DBX46_1;
    }

    public String getDB127_DBX46_2() {
        return DB127_DBX46_2;
    }

    public void setDB127_DBX46_2(String DB127_DBX46_2) {
        this.DB127_DBX46_2 = DB127_DBX46_2;
    }

    public String getDB127_DBX46_3() {
        return DB127_DBX46_3;
    }

    public void setDB127_DBX46_3(String DB127_DBX46_3) {
        this.DB127_DBX46_3 = DB127_DBX46_3;
    }

    public String getDB127_DBX46_4() {
        return DB127_DBX46_4;
    }

    public void setDB127_DBX46_4(String DB127_DBX46_4) {
        this.DB127_DBX46_4 = DB127_DBX46_4;
    }

    public String getDB127_DBX46_5() {
        return DB127_DBX46_5;
    }

    public void setDB127_DBX46_5(String DB127_DBX46_5) {
        this.DB127_DBX46_5 = DB127_DBX46_5;
    }

    public String getDB127_DBX46_6() {
        return DB127_DBX46_6;
    }

    public void setDB127_DBX46_6(String DB127_DBX46_6) {
        this.DB127_DBX46_6 = DB127_DBX46_6;
    }

    public String getDB127_DBX46_7() {
        return DB127_DBX46_7;
    }

    public void setDB127_DBX46_7(String DB127_DBX46_7) {
        this.DB127_DBX46_7 = DB127_DBX46_7;
    }

    public String getDB127_DBX47_0() {
        return DB127_DBX47_0;
    }

    public void setDB127_DBX47_0(String DB127_DBX47_0) {
        this.DB127_DBX47_0 = DB127_DBX47_0;
    }

    public String getDB127_DBX48_0() {
        return DB127_DBX48_0;
    }

    public void setDB127_DBX48_0(String DB127_DBX48_0) {
        this.DB127_DBX48_0 = DB127_DBX48_0;
    }

    public String getDB127_DBX48_1() {
        return DB127_DBX48_1;
    }

    public void setDB127_DBX48_1(String DB127_DBX48_1) {
        this.DB127_DBX48_1 = DB127_DBX48_1;
    }

    public String getDB127_DBX48_2() {
        return DB127_DBX48_2;
    }

    public void setDB127_DBX48_2(String DB127_DBX48_2) {
        this.DB127_DBX48_2 = DB127_DBX48_2;
    }

    public String getDB127_DBX48_3() {
        return DB127_DBX48_3;
    }

    public void setDB127_DBX48_3(String DB127_DBX48_3) {
        this.DB127_DBX48_3 = DB127_DBX48_3;
    }

    public String getDB127_DBX48_4() {
        return DB127_DBX48_4;
    }

    public void setDB127_DBX48_4(String DB127_DBX48_4) {
        this.DB127_DBX48_4 = DB127_DBX48_4;
    }

    public String getDB127_DBX48_5() {
        return DB127_DBX48_5;
    }

    public void setDB127_DBX48_5(String DB127_DBX48_5) {
        this.DB127_DBX48_5 = DB127_DBX48_5;
    }

    public String getDB127_DBX48_6() {
        return DB127_DBX48_6;
    }

    public void setDB127_DBX48_6(String DB127_DBX48_6) {
        this.DB127_DBX48_6 = DB127_DBX48_6;
    }

    public String getDB127_DBX48_7() {
        return DB127_DBX48_7;
    }

    public void setDB127_DBX48_7(String DB127_DBX48_7) {
        this.DB127_DBX48_7 = DB127_DBX48_7;
    }

    public String getDB127_DBX49_0() {
        return DB127_DBX49_0;
    }

    public void setDB127_DBX49_0(String DB127_DBX49_0) {
        this.DB127_DBX49_0 = DB127_DBX49_0;
    }

    public String getDB127_DBX50_0() {
        return DB127_DBX50_0;
    }

    public void setDB127_DBX50_0(String DB127_DBX50_0) {
        this.DB127_DBX50_0 = DB127_DBX50_0;
    }

    public String getDB127_DBX50_1() {
        return DB127_DBX50_1;
    }

    public void setDB127_DBX50_1(String DB127_DBX50_1) {
        this.DB127_DBX50_1 = DB127_DBX50_1;
    }

    public String getDB127_DBX50_2() {
        return DB127_DBX50_2;
    }

    public void setDB127_DBX50_2(String DB127_DBX50_2) {
        this.DB127_DBX50_2 = DB127_DBX50_2;
    }

    public String getDB127_DBX50_3() {
        return DB127_DBX50_3;
    }

    public void setDB127_DBX50_3(String DB127_DBX50_3) {
        this.DB127_DBX50_3 = DB127_DBX50_3;
    }

    public String getDB127_DBX50_4() {
        return DB127_DBX50_4;
    }

    public void setDB127_DBX50_4(String DB127_DBX50_4) {
        this.DB127_DBX50_4 = DB127_DBX50_4;
    }

    public String getDB127_DBX50_5() {
        return DB127_DBX50_5;
    }

    public void setDB127_DBX50_5(String DB127_DBX50_5) {
        this.DB127_DBX50_5 = DB127_DBX50_5;
    }

    public String getDB127_DBX50_6() {
        return DB127_DBX50_6;
    }

    public void setDB127_DBX50_6(String DB127_DBX50_6) {
        this.DB127_DBX50_6 = DB127_DBX50_6;
    }

    public String getDB127_DBX50_7() {
        return DB127_DBX50_7;
    }

    public void setDB127_DBX50_7(String DB127_DBX50_7) {
        this.DB127_DBX50_7 = DB127_DBX50_7;
    }

    public String getDB127_DBX51_0() {
        return DB127_DBX51_0;
    }

    public void setDB127_DBX51_0(String DB127_DBX51_0) {
        this.DB127_DBX51_0 = DB127_DBX51_0;
    }

    public String getDB127_DBX52_0() {
        return DB127_DBX52_0;
    }

    public void setDB127_DBX52_0(String DB127_DBX52_0) {
        this.DB127_DBX52_0 = DB127_DBX52_0;
    }

    public String getDB127_DBX52_1() {
        return DB127_DBX52_1;
    }

    public void setDB127_DBX52_1(String DB127_DBX52_1) {
        this.DB127_DBX52_1 = DB127_DBX52_1;
    }

    public String getDB127_DBX52_2() {
        return DB127_DBX52_2;
    }

    public void setDB127_DBX52_2(String DB127_DBX52_2) {
        this.DB127_DBX52_2 = DB127_DBX52_2;
    }

    public String getDB127_DBX52_3() {
        return DB127_DBX52_3;
    }

    public void setDB127_DBX52_3(String DB127_DBX52_3) {
        this.DB127_DBX52_3 = DB127_DBX52_3;
    }

    public String getDB127_DBX52_4() {
        return DB127_DBX52_4;
    }

    public void setDB127_DBX52_4(String DB127_DBX52_4) {
        this.DB127_DBX52_4 = DB127_DBX52_4;
    }

    public String getDB127_DBX52_5() {
        return DB127_DBX52_5;
    }

    public void setDB127_DBX52_5(String DB127_DBX52_5) {
        this.DB127_DBX52_5 = DB127_DBX52_5;
    }

    public String getDB127_DBX52_6() {
        return DB127_DBX52_6;
    }

    public void setDB127_DBX52_6(String DB127_DBX52_6) {
        this.DB127_DBX52_6 = DB127_DBX52_6;
    }

    public String getDB127_DBX52_7() {
        return DB127_DBX52_7;
    }

    public void setDB127_DBX52_7(String DB127_DBX52_7) {
        this.DB127_DBX52_7 = DB127_DBX52_7;
    }

    public String getDB127_DBX53_0() {
        return DB127_DBX53_0;
    }

    public void setDB127_DBX53_0(String DB127_DBX53_0) {
        this.DB127_DBX53_0 = DB127_DBX53_0;
    }

    public String getDB127_DBX54_0() {
        return DB127_DBX54_0;
    }

    public void setDB127_DBX54_0(String DB127_DBX54_0) {
        this.DB127_DBX54_0 = DB127_DBX54_0;
    }

    public String getDB127_DBX54_1() {
        return DB127_DBX54_1;
    }

    public void setDB127_DBX54_1(String DB127_DBX54_1) {
        this.DB127_DBX54_1 = DB127_DBX54_1;
    }

    public String getDB127_DBX54_2() {
        return DB127_DBX54_2;
    }

    public void setDB127_DBX54_2(String DB127_DBX54_2) {
        this.DB127_DBX54_2 = DB127_DBX54_2;
    }

    public String getDB127_DBX54_3() {
        return DB127_DBX54_3;
    }

    public void setDB127_DBX54_3(String DB127_DBX54_3) {
        this.DB127_DBX54_3 = DB127_DBX54_3;
    }

    public String getDB127_DBX54_4() {
        return DB127_DBX54_4;
    }

    public void setDB127_DBX54_4(String DB127_DBX54_4) {
        this.DB127_DBX54_4 = DB127_DBX54_4;
    }

    public String getDB127_DBX54_5() {
        return DB127_DBX54_5;
    }

    public void setDB127_DBX54_5(String DB127_DBX54_5) {
        this.DB127_DBX54_5 = DB127_DBX54_5;
    }

    public String getDB127_DBX54_6() {
        return DB127_DBX54_6;
    }

    public void setDB127_DBX54_6(String DB127_DBX54_6) {
        this.DB127_DBX54_6 = DB127_DBX54_6;
    }

    public String getDB127_DBX54_7() {
        return DB127_DBX54_7;
    }

    public void setDB127_DBX54_7(String DB127_DBX54_7) {
        this.DB127_DBX54_7 = DB127_DBX54_7;
    }

    public String getDB127_DBX55_0() {
        return DB127_DBX55_0;
    }

    public void setDB127_DBX55_0(String DB127_DBX55_0) {
        this.DB127_DBX55_0 = DB127_DBX55_0;
    }

    public String getDB127_DBX56_0() {
        return DB127_DBX56_0;
    }

    public void setDB127_DBX56_0(String DB127_DBX56_0) {
        this.DB127_DBX56_0 = DB127_DBX56_0;
    }

    public String getDB127_DBX56_1() {
        return DB127_DBX56_1;
    }

    public void setDB127_DBX56_1(String DB127_DBX56_1) {
        this.DB127_DBX56_1 = DB127_DBX56_1;
    }

    public String getDB127_DBX56_2() {
        return DB127_DBX56_2;
    }

    public void setDB127_DBX56_2(String DB127_DBX56_2) {
        this.DB127_DBX56_2 = DB127_DBX56_2;
    }

    public String getDB127_DBX56_3() {
        return DB127_DBX56_3;
    }

    public void setDB127_DBX56_3(String DB127_DBX56_3) {
        this.DB127_DBX56_3 = DB127_DBX56_3;
    }

    public String getDB127_DBX56_4() {
        return DB127_DBX56_4;
    }

    public void setDB127_DBX56_4(String DB127_DBX56_4) {
        this.DB127_DBX56_4 = DB127_DBX56_4;
    }

    public String getDB127_DBX56_5() {
        return DB127_DBX56_5;
    }

    public void setDB127_DBX56_5(String DB127_DBX56_5) {
        this.DB127_DBX56_5 = DB127_DBX56_5;
    }

    public String getDB127_DBX56_6() {
        return DB127_DBX56_6;
    }

    public void setDB127_DBX56_6(String DB127_DBX56_6) {
        this.DB127_DBX56_6 = DB127_DBX56_6;
    }

    public String getDB127_DBX56_7() {
        return DB127_DBX56_7;
    }

    public void setDB127_DBX56_7(String DB127_DBX56_7) {
        this.DB127_DBX56_7 = DB127_DBX56_7;
    }

    public String getDB127_DBX57_0() {
        return DB127_DBX57_0;
    }

    public void setDB127_DBX57_0(String DB127_DBX57_0) {
        this.DB127_DBX57_0 = DB127_DBX57_0;
    }

    public String getDB127_DBX6_0() {
        return DB127_DBX6_0;
    }

    public void setDB127_DBX6_0(String DB127_DBX6_0) {
        this.DB127_DBX6_0 = DB127_DBX6_0;
    }

    public String getDB127_DBX6_1() {
        return DB127_DBX6_1;
    }

    public void setDB127_DBX6_1(String DB127_DBX6_1) {
        this.DB127_DBX6_1 = DB127_DBX6_1;
    }

    public String getDB127_DBX6_2() {
        return DB127_DBX6_2;
    }

    public void setDB127_DBX6_2(String DB127_DBX6_2) {
        this.DB127_DBX6_2 = DB127_DBX6_2;
    }

    public String getDB127_DBX6_3() {
        return DB127_DBX6_3;
    }

    public void setDB127_DBX6_3(String DB127_DBX6_3) {
        this.DB127_DBX6_3 = DB127_DBX6_3;
    }

    public String getDB127_DBX6_4() {
        return DB127_DBX6_4;
    }

    public void setDB127_DBX6_4(String DB127_DBX6_4) {
        this.DB127_DBX6_4 = DB127_DBX6_4;
    }

    public String getDB127_DBX6_5() {
        return DB127_DBX6_5;
    }

    public void setDB127_DBX6_5(String DB127_DBX6_5) {
        this.DB127_DBX6_5 = DB127_DBX6_5;
    }

    public String getDB127_DBX6_6() {
        return DB127_DBX6_6;
    }

    public void setDB127_DBX6_6(String DB127_DBX6_6) {
        this.DB127_DBX6_6 = DB127_DBX6_6;
    }

    public String getDB127_DBX6_7() {
        return DB127_DBX6_7;
    }

    public void setDB127_DBX6_7(String DB127_DBX6_7) {
        this.DB127_DBX6_7 = DB127_DBX6_7;
    }

    public String getDB127_DBX7_0() {
        return DB127_DBX7_0;
    }

    public void setDB127_DBX7_0(String DB127_DBX7_0) {
        this.DB127_DBX7_0 = DB127_DBX7_0;
    }

    public String getDB127_DBX8_0() {
        return DB127_DBX8_0;
    }

    public void setDB127_DBX8_0(String DB127_DBX8_0) {
        this.DB127_DBX8_0 = DB127_DBX8_0;
    }

    public String getDB127_DBX8_1() {
        return DB127_DBX8_1;
    }

    public void setDB127_DBX8_1(String DB127_DBX8_1) {
        this.DB127_DBX8_1 = DB127_DBX8_1;
    }

    public String getDB127_DBX8_2() {
        return DB127_DBX8_2;
    }

    public void setDB127_DBX8_2(String DB127_DBX8_2) {
        this.DB127_DBX8_2 = DB127_DBX8_2;
    }

    public String getDB127_DBX8_3() {
        return DB127_DBX8_3;
    }

    public void setDB127_DBX8_3(String DB127_DBX8_3) {
        this.DB127_DBX8_3 = DB127_DBX8_3;
    }

    public String getDB127_DBX8_4() {
        return DB127_DBX8_4;
    }

    public void setDB127_DBX8_4(String DB127_DBX8_4) {
        this.DB127_DBX8_4 = DB127_DBX8_4;
    }

    public String getDB127_DBX8_5() {
        return DB127_DBX8_5;
    }

    public void setDB127_DBX8_5(String DB127_DBX8_5) {
        this.DB127_DBX8_5 = DB127_DBX8_5;
    }

    public String getDB127_DBX8_6() {
        return DB127_DBX8_6;
    }

    public void setDB127_DBX8_6(String DB127_DBX8_6) {
        this.DB127_DBX8_6 = DB127_DBX8_6;
    }

    public String getDB127_DBX8_7() {
        return DB127_DBX8_7;
    }

    public void setDB127_DBX8_7(String DB127_DBX8_7) {
        this.DB127_DBX8_7 = DB127_DBX8_7;
    }

    public String getDB127_DBX9_0() {
        return DB127_DBX9_0;
    }

    public void setDB127_DBX9_0(String DB127_DBX9_0) {
        this.DB127_DBX9_0 = DB127_DBX9_0;
    }

    public String getDB2000_DB12() {
        return DB2000_DB12;
    }

    public void setDB2000_DB12(String DB2000_DB12) {
        this.DB2000_DB12 = DB2000_DB12;
    }

    public String getDB2000_DB40() {
        return DB2000_DB40;
    }

    public void setDB2000_DB40(String DB2000_DB40) {
        this.DB2000_DB40 = DB2000_DB40;
    }

    public Integer getDB2000_DBW0() {
        return DB2000_DBW0;
    }

    public void setDB2000_DBW0(Integer DB2000_DBW0) {
        this.DB2000_DBW0 = DB2000_DBW0;
    }

    public Integer getDB2000_DBW10() {
        return DB2000_DBW10;
    }

    public void setDB2000_DBW10(Integer DB2000_DBW10) {
        this.DB2000_DBW10 = DB2000_DBW10;
    }

    public Integer getDB2000_DBW2() {
        return DB2000_DBW2;
    }

    public void setDB2000_DBW2(Integer DB2000_DBW2) {
        this.DB2000_DBW2 = DB2000_DBW2;
    }

    public Integer getDB2000_DBW4() {
        return DB2000_DBW4;
    }

    public void setDB2000_DBW4(Integer DB2000_DBW4) {
        this.DB2000_DBW4 = DB2000_DBW4;
    }

    public Integer getDB2000_DBW6() {
        return DB2000_DBW6;
    }

    public void setDB2000_DBW6(Integer DB2000_DBW6) {
        this.DB2000_DBW6 = DB2000_DBW6;
    }

    public Integer getDB2000_DBW8() {
        return DB2000_DBW8;
    }

    public void setDB2000_DBW8(Integer DB2000_DBW8) {
        this.DB2000_DBW8 = DB2000_DBW8;
    }

    public String getDB2000_DBX1000_0() {
        return DB2000_DBX1000_0;
    }

    public void setDB2000_DBX1000_0(String DB2000_DBX1000_0) {
        this.DB2000_DBX1000_0 = DB2000_DBX1000_0;
    }

    public String getDB2000_DBX1000_1() {
        return DB2000_DBX1000_1;
    }

    public void setDB2000_DBX1000_1(String DB2000_DBX1000_1) {
        this.DB2000_DBX1000_1 = DB2000_DBX1000_1;
    }

    public String getDB2000_DBX1000_2() {
        return DB2000_DBX1000_2;
    }

    public void setDB2000_DBX1000_2(String DB2000_DBX1000_2) {
        this.DB2000_DBX1000_2 = DB2000_DBX1000_2;
    }

    public String getDB2000_DBX1000_3() {
        return DB2000_DBX1000_3;
    }

    public void setDB2000_DBX1000_3(String DB2000_DBX1000_3) {
        this.DB2000_DBX1000_3 = DB2000_DBX1000_3;
    }

    public String getDB2000_DBX1000_4() {
        return DB2000_DBX1000_4;
    }

    public void setDB2000_DBX1000_4(String DB2000_DBX1000_4) {
        this.DB2000_DBX1000_4 = DB2000_DBX1000_4;
    }

    public String getDB2000_DBX1000_5() {
        return DB2000_DBX1000_5;
    }

    public void setDB2000_DBX1000_5(String DB2000_DBX1000_5) {
        this.DB2000_DBX1000_5 = DB2000_DBX1000_5;
    }

    public String getDB2000_DBX1000_6() {
        return DB2000_DBX1000_6;
    }

    public void setDB2000_DBX1000_6(String DB2000_DBX1000_6) {
        this.DB2000_DBX1000_6 = DB2000_DBX1000_6;
    }

    public String getDB2000_DBX1000_7() {
        return DB2000_DBX1000_7;
    }

    public void setDB2000_DBX1000_7(String DB2000_DBX1000_7) {
        this.DB2000_DBX1000_7 = DB2000_DBX1000_7;
    }

    public String getDB2000_DBX1100_0() {
        return DB2000_DBX1100_0;
    }

    public void setDB2000_DBX1100_0(String DB2000_DBX1100_0) {
        this.DB2000_DBX1100_0 = DB2000_DBX1100_0;
    }

    public String getDB2000_DBX1100_1() {
        return DB2000_DBX1100_1;
    }

    public void setDB2000_DBX1100_1(String DB2000_DBX1100_1) {
        this.DB2000_DBX1100_1 = DB2000_DBX1100_1;
    }

    public String getDB2000_DBX1100_2() {
        return DB2000_DBX1100_2;
    }

    public void setDB2000_DBX1100_2(String DB2000_DBX1100_2) {
        this.DB2000_DBX1100_2 = DB2000_DBX1100_2;
    }

    public String getDB2000_DBX1100_3() {
        return DB2000_DBX1100_3;
    }

    public void setDB2000_DBX1100_3(String DB2000_DBX1100_3) {
        this.DB2000_DBX1100_3 = DB2000_DBX1100_3;
    }

    public String getDB2000_DBX1100_4() {
        return DB2000_DBX1100_4;
    }

    public void setDB2000_DBX1100_4(String DB2000_DBX1100_4) {
        this.DB2000_DBX1100_4 = DB2000_DBX1100_4;
    }

    public String getDB2000_DBX1100_5() {
        return DB2000_DBX1100_5;
    }

    public void setDB2000_DBX1100_5(String DB2000_DBX1100_5) {
        this.DB2000_DBX1100_5 = DB2000_DBX1100_5;
    }

    public String getDB2000_DBX1100_6() {
        return DB2000_DBX1100_6;
    }

    public void setDB2000_DBX1100_6(String DB2000_DBX1100_6) {
        this.DB2000_DBX1100_6 = DB2000_DBX1100_6;
    }

    public String getDB2000_DBX1100_7() {
        return DB2000_DBX1100_7;
    }

    public void setDB2000_DBX1100_7(String DB2000_DBX1100_7) {
        this.DB2000_DBX1100_7 = DB2000_DBX1100_7;
    }
}
