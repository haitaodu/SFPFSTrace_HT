package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:28
 */

@Entity
@Table(name = "CL_PDOP75", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_PDOP75 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private java.util.Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String DB126_DBX10_0;
    private String DB126_DBX10_1;
    private String DB126_DBX10_2;
    private String DB126_DBX10_3;
    private String DB126_DBX10_4;
    private String DB126_DBX10_5;
    private String DB126_DBX10_6;
    private String DB126_DBX130_0;
    private String DB126_DBX20_0;
    private String DB126_DBX20_1;
    private String DB126_DBX20_2;
    private String DB126_DBX20_3;
    private String DB126_DBX20_4;
    private String DB126_DBX20_5;
    private String DB126_DBX20_6;
    private String DB126_DBX21_0;
    private String DB126_DBX21_1;
    private String DB126_DBX21_2;
    private String DB126_DBX22_0;
    private String DB126_DBX22_1;
    private String DB126_DBX2_0;
    private String DB126_DBX2_1;
    private String DB126_DBX2_2;
    private String DB126_DBX2_3;
    private String DB126_DBX2_4;
    private String DB126_DBX2_5;
    private String DB126_DBX2_6;
    private String DB126_DBX2_7;
    private String DB126_DBX33_0;
    private String DB126_DBX33_1;
    private String DB126_DBX33_2;
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
    private String DB126_DBX42_0;
    private String DB126_DBX42_1;
    private String DB126_DBX42_2;
    private String DB126_DBX43_0;
    private String DB126_DBX43_1;
    private String DB126_DBX43_2;
    private String DB126_DBX43_3;
    private String DB126_DBX43_4;
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
    private String DB127_DBX26_0;
    private String DB127_DBX26_1;
    private String DB127_DBX26_2;
    private String DB127_DBX26_3;
    private String DB127_DBX26_4;
    private String DB127_DBX26_5;
    private String DB127_DBX26_6;
    private String DB127_DBX26_7;
    private String DB127_DBX27_0;
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
    private String DB127_DBX40_0;
    private String DB127_DBX40_1;
    private String DB127_DBX40_2;
    private String DB127_DBX40_3;
    private String DB127_DBX40_4;
    private String DB127_DBX40_5;
    private String DB127_DBX40_6;
    private String DB127_DBX40_7;
    private String DB127_DBX41_0;
    private String DB127_DBX42_0;
    private String DB127_DBX42_1;
    private String DB127_DBX42_2;
    private String DB127_DBX42_3;
    private String DB127_DBX42_4;
    private String DB127_DBX42_5;
    private String DB127_DBX42_6;
    private String DB127_DBX42_7;
    private String DB127_DBX43_0;
    private String DB127_DBX4_0;
    private String DB127_DBX4_1;
    private String DB127_DBX4_2;
    private String DB127_DBX4_3;
    private String DB127_DBX4_4;
    private String DB127_DBX4_5;
    private String DB127_DBX4_6;
    private String DB127_DBX4_7;
    private String DB127_DBX50_0;
    private String DB127_DBX50_1;
    private String DB127_DBX50_2;
    private String DB127_DBX50_3;
    private String DB127_DBX50_4;
    private String DB127_DBX50_5;
    private String DB127_DBX50_6;
    private String DB127_DBX50_7;
    private String DB127_DBX51_0;
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
    private String DB127_DBX56_7;
    private String DB127_DBX57_0;
    private String DB127_DBX5_0;
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
    private float DB2000_DBD40;
    private float DB2000_DBD44;
    private float DB2000_DBD48;
    private float DB2000_DBD52;
    private float DB2000_DBD56;
    private float DB2000_DBD60;
    private float DB2000_DBD64;
    private float DB2000_DBD68;
    private float DB2000_DBD72;

    public float getDB2000_DBD40() {
        return DB2000_DBD40;
    }

    public void setDB2000_DBD40(float DB2000_DBD40) {
        this.DB2000_DBD40 = DB2000_DBD40;
    }

    public float getDB2000_DBD44() {
        return DB2000_DBD44;
    }

    public void setDB2000_DBD44(float DB2000_DBD44) {
        this.DB2000_DBD44 = DB2000_DBD44;
    }

    public float getDB2000_DBD48() {
        return DB2000_DBD48;
    }

    public void setDB2000_DBD48(float DB2000_DBD48) {
        this.DB2000_DBD48 = DB2000_DBD48;
    }

    public float getDB2000_DBD52() {
        return DB2000_DBD52;
    }

    public void setDB2000_DBD52(float DB2000_DBD52) {
        this.DB2000_DBD52 = DB2000_DBD52;
    }

    public float getDB2000_DBD56() {
        return DB2000_DBD56;
    }

    public void setDB2000_DBD56(float DB2000_DBD56) {
        this.DB2000_DBD56 = DB2000_DBD56;
    }

    public float getDB2000_DBD60() {
        return DB2000_DBD60;
    }

    public void setDB2000_DBD60(float DB2000_DBD60) {
        this.DB2000_DBD60 = DB2000_DBD60;
    }

    public float getDB2000_DBD64() {
        return DB2000_DBD64;
    }

    public void setDB2000_DBD64(float DB2000_DBD64) {
        this.DB2000_DBD64 = DB2000_DBD64;
    }

    public float getDB2000_DBD68() {
        return DB2000_DBD68;
    }

    public void setDB2000_DBD68(float DB2000_DBD68) {
        this.DB2000_DBD68 = DB2000_DBD68;
    }

    public float getDB2000_DBD72() {
        return DB2000_DBD72;
    }

    public void setDB2000_DBD72(float DB2000_DBD72) {
        this.DB2000_DBD72 = DB2000_DBD72;
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

    public String getDB126_DBX10_6() {
        return DB126_DBX10_6;
    }

    public void setDB126_DBX10_6(String DB126_DBX10_6) {
        this.DB126_DBX10_6 = DB126_DBX10_6;
    }

    public String getDB126_DBX130_0() {
        return DB126_DBX130_0;
    }

    public void setDB126_DBX130_0(String DB126_DBX130_0) {
        this.DB126_DBX130_0 = DB126_DBX130_0;
    }

    public String getDB126_DBX20_0() {
        return DB126_DBX20_0;
    }

    public void setDB126_DBX20_0(String DB126_DBX20_0) {
        this.DB126_DBX20_0 = DB126_DBX20_0;
    }

    public String getDB126_DBX20_1() {
        return DB126_DBX20_1;
    }

    public void setDB126_DBX20_1(String DB126_DBX20_1) {
        this.DB126_DBX20_1 = DB126_DBX20_1;
    }

    public String getDB126_DBX20_2() {
        return DB126_DBX20_2;
    }

    public void setDB126_DBX20_2(String DB126_DBX20_2) {
        this.DB126_DBX20_2 = DB126_DBX20_2;
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

    public String getDB126_DBX2_7() {
        return DB126_DBX2_7;
    }

    public void setDB126_DBX2_7(String DB126_DBX2_7) {
        this.DB126_DBX2_7 = DB126_DBX2_7;
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

    public String getDB126_DBX33_2() {
        return DB126_DBX33_2;
    }

    public void setDB126_DBX33_2(String DB126_DBX33_2) {
        this.DB126_DBX33_2 = DB126_DBX33_2;
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

    public String getDB126_DBX43_0() {
        return DB126_DBX43_0;
    }

    public void setDB126_DBX43_0(String DB126_DBX43_0) {
        this.DB126_DBX43_0 = DB126_DBX43_0;
    }

    public String getDB126_DBX43_1() {
        return DB126_DBX43_1;
    }

    public void setDB126_DBX43_1(String DB126_DBX43_1) {
        this.DB126_DBX43_1 = DB126_DBX43_1;
    }

    public String getDB126_DBX43_2() {
        return DB126_DBX43_2;
    }

    public void setDB126_DBX43_2(String DB126_DBX43_2) {
        this.DB126_DBX43_2 = DB126_DBX43_2;
    }

    public String getDB126_DBX43_3() {
        return DB126_DBX43_3;
    }

    public void setDB126_DBX43_3(String DB126_DBX43_3) {
        this.DB126_DBX43_3 = DB126_DBX43_3;
    }

    public String getDB126_DBX43_4() {
        return DB126_DBX43_4;
    }

    public void setDB126_DBX43_4(String DB126_DBX43_4) {
        this.DB126_DBX43_4 = DB126_DBX43_4;
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

    public String getDB127_DBX26_0() {
        return DB127_DBX26_0;
    }

    public void setDB127_DBX26_0(String DB127_DBX26_0) {
        this.DB127_DBX26_0 = DB127_DBX26_0;
    }

    public String getDB127_DBX26_1() {
        return DB127_DBX26_1;
    }

    public void setDB127_DBX26_1(String DB127_DBX26_1) {
        this.DB127_DBX26_1 = DB127_DBX26_1;
    }

    public String getDB127_DBX26_2() {
        return DB127_DBX26_2;
    }

    public void setDB127_DBX26_2(String DB127_DBX26_2) {
        this.DB127_DBX26_2 = DB127_DBX26_2;
    }

    public String getDB127_DBX26_3() {
        return DB127_DBX26_3;
    }

    public void setDB127_DBX26_3(String DB127_DBX26_3) {
        this.DB127_DBX26_3 = DB127_DBX26_3;
    }

    public String getDB127_DBX26_4() {
        return DB127_DBX26_4;
    }

    public void setDB127_DBX26_4(String DB127_DBX26_4) {
        this.DB127_DBX26_4 = DB127_DBX26_4;
    }

    public String getDB127_DBX26_5() {
        return DB127_DBX26_5;
    }

    public void setDB127_DBX26_5(String DB127_DBX26_5) {
        this.DB127_DBX26_5 = DB127_DBX26_5;
    }

    public String getDB127_DBX26_6() {
        return DB127_DBX26_6;
    }

    public void setDB127_DBX26_6(String DB127_DBX26_6) {
        this.DB127_DBX26_6 = DB127_DBX26_6;
    }

    public String getDB127_DBX26_7() {
        return DB127_DBX26_7;
    }

    public void setDB127_DBX26_7(String DB127_DBX26_7) {
        this.DB127_DBX26_7 = DB127_DBX26_7;
    }

    public String getDB127_DBX27_0() {
        return DB127_DBX27_0;
    }

    public void setDB127_DBX27_0(String DB127_DBX27_0) {
        this.DB127_DBX27_0 = DB127_DBX27_0;
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

    public String getDB127_DBX40_0() {
        return DB127_DBX40_0;
    }

    public void setDB127_DBX40_0(String DB127_DBX40_0) {
        this.DB127_DBX40_0 = DB127_DBX40_0;
    }

    public String getDB127_DBX40_1() {
        return DB127_DBX40_1;
    }

    public void setDB127_DBX40_1(String DB127_DBX40_1) {
        this.DB127_DBX40_1 = DB127_DBX40_1;
    }

    public String getDB127_DBX40_2() {
        return DB127_DBX40_2;
    }

    public void setDB127_DBX40_2(String DB127_DBX40_2) {
        this.DB127_DBX40_2 = DB127_DBX40_2;
    }

    public String getDB127_DBX40_3() {
        return DB127_DBX40_3;
    }

    public void setDB127_DBX40_3(String DB127_DBX40_3) {
        this.DB127_DBX40_3 = DB127_DBX40_3;
    }

    public String getDB127_DBX40_4() {
        return DB127_DBX40_4;
    }

    public void setDB127_DBX40_4(String DB127_DBX40_4) {
        this.DB127_DBX40_4 = DB127_DBX40_4;
    }

    public String getDB127_DBX40_5() {
        return DB127_DBX40_5;
    }

    public void setDB127_DBX40_5(String DB127_DBX40_5) {
        this.DB127_DBX40_5 = DB127_DBX40_5;
    }

    public String getDB127_DBX40_6() {
        return DB127_DBX40_6;
    }

    public void setDB127_DBX40_6(String DB127_DBX40_6) {
        this.DB127_DBX40_6 = DB127_DBX40_6;
    }

    public String getDB127_DBX40_7() {
        return DB127_DBX40_7;
    }

    public void setDB127_DBX40_7(String DB127_DBX40_7) {
        this.DB127_DBX40_7 = DB127_DBX40_7;
    }

    public String getDB127_DBX41_0() {
        return DB127_DBX41_0;
    }

    public void setDB127_DBX41_0(String DB127_DBX41_0) {
        this.DB127_DBX41_0 = DB127_DBX41_0;
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

    public String getDB127_DBX4_0() {
        return DB127_DBX4_0;
    }

    public void setDB127_DBX4_0(String DB127_DBX4_0) {
        this.DB127_DBX4_0 = DB127_DBX4_0;
    }

    public String getDB127_DBX4_1() {
        return DB127_DBX4_1;
    }

    public void setDB127_DBX4_1(String DB127_DBX4_1) {
        this.DB127_DBX4_1 = DB127_DBX4_1;
    }

    public String getDB127_DBX4_2() {
        return DB127_DBX4_2;
    }

    public void setDB127_DBX4_2(String DB127_DBX4_2) {
        this.DB127_DBX4_2 = DB127_DBX4_2;
    }

    public String getDB127_DBX4_3() {
        return DB127_DBX4_3;
    }

    public void setDB127_DBX4_3(String DB127_DBX4_3) {
        this.DB127_DBX4_3 = DB127_DBX4_3;
    }

    public String getDB127_DBX4_4() {
        return DB127_DBX4_4;
    }

    public void setDB127_DBX4_4(String DB127_DBX4_4) {
        this.DB127_DBX4_4 = DB127_DBX4_4;
    }

    public String getDB127_DBX4_5() {
        return DB127_DBX4_5;
    }

    public void setDB127_DBX4_5(String DB127_DBX4_5) {
        this.DB127_DBX4_5 = DB127_DBX4_5;
    }

    public String getDB127_DBX4_6() {
        return DB127_DBX4_6;
    }

    public void setDB127_DBX4_6(String DB127_DBX4_6) {
        this.DB127_DBX4_6 = DB127_DBX4_6;
    }

    public String getDB127_DBX4_7() {
        return DB127_DBX4_7;
    }

    public void setDB127_DBX4_7(String DB127_DBX4_7) {
        this.DB127_DBX4_7 = DB127_DBX4_7;
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

    public String getDB127_DBX5_0() {
        return DB127_DBX5_0;
    }

    public void setDB127_DBX5_0(String DB127_DBX5_0) {
        this.DB127_DBX5_0 = DB127_DBX5_0;
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

    public String getDB2000_DB552() {
        return DB2000_DB552;
    }

    public void setDB2000_DB552(String DB2000_DB552) {
        this.DB2000_DB552 = DB2000_DB552;
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
