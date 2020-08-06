package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_DHOP20160")
public class CL_DHOP20160 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private BigDecimal DB1670_DBD328;
    private BigDecimal DB1670_DBD60;
    private BigDecimal DB1670_DBW0;
    private BigDecimal DB1670_DBW10;
    private BigDecimal DB1670_DBW12;
    private BigDecimal DB1670_DBW14;
    private BigDecimal DB1670_DBW16;
    private BigDecimal DB1670_DBW18;
    private BigDecimal DB1670_DBW2;
    private BigDecimal DB1670_DBW20;
    private BigDecimal DB1670_DBW22;
    private BigDecimal DB1670_DBW24;
    private BigDecimal DB1670_DBW26;
    private BigDecimal DB1670_DBW28;
    private BigDecimal DB1670_DBW30;
    private BigDecimal DB1670_DBW32;
    private BigDecimal DB1670_DBW34;
    private BigDecimal DB1670_DBW36;
    private BigDecimal DB1670_DBW38;
    private BigDecimal DB1670_DBW4;
    private BigDecimal DB1670_DBW40;
    private BigDecimal DB1670_DBW42;
    private BigDecimal DB1670_DBW44;
    private BigDecimal DB1670_DBW46;
    private BigDecimal DB1670_DBW48;
    private BigDecimal DB1670_DBW50;
    private BigDecimal DB1670_DBW52;
    private BigDecimal DB1670_DBW54;
    private BigDecimal DB1670_DBW56;
    private BigDecimal DB1670_DBW6;
    private BigDecimal DB1670_DBW64;
    private BigDecimal DB1670_DBW68;
    private BigDecimal DB1670_DBW70;
    private BigDecimal DB1670_DBW8;
    private String DB1670_DBX58_0;
    private String DB1670_DBX58_1;
    private String DB1670_DBX58_2;
    private String DB1670_DBX58_3;
    private String DB1670_DBX58_4;
    private String DB1670_DBX58_5;
    private String DB1670_DBX58_6;
    private String DB1670_DBX58_7;
    private String DB1670_DBX59_0;
    private String DB1670_DBX59_1;
    private String DB1670_DBX59_2;
    private String DB1670_DBX59_6;
    private String DB1670_DBX59_7;
    private String DB1670_DBX72_0;
    private String DB7_DBX10_0;
    private String DB7_DBX10_1;
    private String DB7_DBX10_2;
    private String DB7_DBX10_3;
    private String DB7_DBX10_4;
    private String DB7_DBX10_5;
    private String DB7_DBX12_0;
    private String DB7_DBX12_1;
    private String DB7_DBX12_2;
    private String DB7_DBX12_3;
    private String DB7_DBX12_4;
    private String DB7_DBX12_5;
    private String DB7_DBX12_6;
    private String DB7_DBX12_7;
    private String DB7_DBX14_0;
    private String DB7_DBX14_1;
    private String DB7_DBX14_2;
    private String DB7_DBX14_3;
    private String DB7_DBX14_4;
    private String DB7_DBX14_5;
    private String DB7_DBX14_6;
    private String DB7_DBX14_7;
    private String DB7_DBX16_0;
    private String DB7_DBX16_1;
    private String DB7_DBX16_2;
    private String DB7_DBX16_3;
    private String DB7_DBX16_4;
    private String DB7_DBX16_5;
    private String DB7_DBX16_6;
    private String DB7_DBX16_7;
    private String DB7_DBX17_0;
    private String DB7_DBX17_1;
    private String DB7_DBX17_2;
    private String DB7_DBX17_3;
    private String DB7_DBX17_4;
    private String DB7_DBX17_5;
    private String DB7_DBX17_6;
    private String DB7_DBX17_7;
    private String DB7_DBX18_0;
    private String DB7_DBX18_1;
    private String DB7_DBX18_2;
    private String DB7_DBX18_3;
    private String DB7_DBX18_4;
    private String DB7_DBX18_5;
    private String DB7_DBX18_6;
    private String DB7_DBX18_7;
    private String DB7_DBX19_0;
    private String DB7_DBX19_1;
    private String DB7_DBX19_2;
    private String DB7_DBX19_3;
    private String DB7_DBX19_4;
    private String DB7_DBX19_5;
    private String DB7_DBX19_6;
    private String DB7_DBX19_7;
    private String DB7_DBX20_0;
    private String DB7_DBX20_1;
    private String DB7_DBX20_2;
    private String DB7_DBX20_3;
    private String DB7_DBX20_4;
    private String DB7_DBX20_5;
    private String DB7_DBX20_6;
    private String DB7_DBX20_7;
    private String DB7_DBX21_0;
    private String DB7_DBX21_1;
    private String DB7_DBX21_2;
    private String DB7_DBX21_3;
    private String DB7_DBX21_4;
    private String DB7_DBX21_5;
    private String DB7_DBX21_6;
    private String DB7_DBX21_7;
    private String DB7_DBX34_0;
    private String DB7_DBX34_1;
    private String DB7_DBX34_2;
    private String DB7_DBX34_3;
    private String DB7_DBX34_4;
    private String DB7_DBX34_5;
    private String DB7_DBX34_6;
    private String DB7_DBX34_7;
    private String DB7_DBX35_0;
    private String DB7_DBX35_1;
    private String DB7_DBX35_2;
    private String DB7_DBX35_3;
    private String DB7_DBX35_4;
    private String DB7_DBX35_5;
    private String DB7_DBX35_6;
    private String DB7_DBX35_7;
    private String DB7_DBX36_0;
    private String DB7_DBX36_1;
    private String DB7_DBX36_2;
    private String DB7_DBX36_3;
    private String DB7_DBX36_4;
    private String DB7_DBX36_5;
    private String DB7_DBX36_6;
    private String DB7_DBX36_7;
    private String DB7_DBX37_0;
    private String DB7_DBX37_1;
    private String DB7_DBX37_2;
    private String DB7_DBX37_3;
    private String DB7_DBX37_4;
    private String DB7_DBX37_5;
    private String DB7_DBX37_6;
    private String DB7_DBX37_7;
    private String DB7_DBX38_0;
    private String DB7_DBX38_1;
    private String DB7_DBX38_2;
    private String DB7_DBX38_3;
    private String DB7_DBX38_4;
    private String DB7_DBX38_5;
    private String DB7_DBX38_6;
    private String DB7_DBX38_7;
    private String DB7_DBX39_0;
    private String DB7_DBX39_1;
    private String DB7_DBX39_2;
    private String DB7_DBX39_3;
    private String DB7_DBX39_4;
    private String DB7_DBX39_5;
    private String DB7_DBX39_6;
    private String DB7_DBX39_7;
    private String DB7_DBX4_0;
    private String DB7_DBX4_1;
    private String DB7_DBX4_2;
    private String DB7_DBX4_3;
    private String DB7_DBX4_4;
    private String DB7_DBX4_5;
    private String DB7_DBX4_6;
    private String DB7_DBX4_7;
    private String DB7_DBX52_0;
    private String DB7_DBX52_1;
    private String DB7_DBX52_2;
    private String DB7_DBX52_3;
    private String DB7_DBX52_4;
    private String DB7_DBX52_5;
    private String DB7_DBX52_6;
    private String DB7_DBX52_7;
    private String DB7_DBX53_0;
    private String DB7_DBX53_1;
    private String DB7_DBX53_2;
    private String DB7_DBX53_3;
    private String DB7_DBX54_0;
    private String DB7_DBX54_1;
    private String DB7_DBX54_2;
    private String DB7_DBX54_3;
    private String DB7_DBX54_4;
    private String DB7_DBX54_5;
    private String DB7_DBX54_6;
    private String DB7_DBX54_7;
    private String DB7_DBX55_0;
    private String DB7_DBX55_1;
    private String DB7_DBX55_2;
    private String DB7_DBX55_3;
    private String DB7_DBX56_0;
    private String DB7_DBX56_1;
    private String DB7_DBX56_2;
    private String DB7_DBX56_3;
    private String DB7_DBX56_4;
    private String DB7_DBX56_5;
    private String DB7_DBX56_6;
    private String DB7_DBX56_7;
    private String DB7_DBX57_0;
    private String DB7_DBX58_0;
    private String DB7_DBX58_1;
    private String DB7_DBX58_2;
    private String DB7_DBX60_0;
    private String DB7_DBX60_1;
    private String DB7_DBX60_2;
    private String DB7_DBX62_0;
    private String DB7_DBX62_1;
    private String DB7_DBX62_2;
    private String DB7_DBX6_0;
    private String DB7_DBX6_1;
    private String DB7_DBX6_2;
    private String DB7_DBX6_3;
    private String DB7_DBX6_4;
    private String DB7_DBX6_5;
    private String DB7_DBX6_6;
    private String DB7_DBX6_7;
    private String DB7_DBX7_0;
    private String DB7_DBX7_1;
    private String DB7_DBX7_2;
    private String DB7_DBX7_3;
    private String DB7_DBX7_4;
    private String DB7_DBX7_5;
    private String DB7_DBX7_6;
    private String DB7_DBX7_7;
    private String DB7_DBX8_0;
    private String DB7_DBX8_1;
    private String DB7_DBX8_2;
    private String DB7_DBX8_3;
    private String DB7_DBX8_4;
    private String DB7_DBX8_5;

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

    public BigDecimal getDB1670_DBD328() {
        return DB1670_DBD328;
    }

    public void setDB1670_DBD328(BigDecimal DB1670_DBD328) {
        this.DB1670_DBD328 = DB1670_DBD328;
    }

    public BigDecimal getDB1670_DBD60() {
        return DB1670_DBD60;
    }

    public void setDB1670_DBD60(BigDecimal DB1670_DBD60) {
        this.DB1670_DBD60 = DB1670_DBD60;
    }

    public BigDecimal getDB1670_DBW0() {
        return DB1670_DBW0;
    }

    public void setDB1670_DBW0(BigDecimal DB1670_DBW0) {
        this.DB1670_DBW0 = DB1670_DBW0;
    }

    public BigDecimal getDB1670_DBW10() {
        return DB1670_DBW10;
    }

    public void setDB1670_DBW10(BigDecimal DB1670_DBW10) {
        this.DB1670_DBW10 = DB1670_DBW10;
    }

    public BigDecimal getDB1670_DBW12() {
        return DB1670_DBW12;
    }

    public void setDB1670_DBW12(BigDecimal DB1670_DBW12) {
        this.DB1670_DBW12 = DB1670_DBW12;
    }

    public BigDecimal getDB1670_DBW14() {
        return DB1670_DBW14;
    }

    public void setDB1670_DBW14(BigDecimal DB1670_DBW14) {
        this.DB1670_DBW14 = DB1670_DBW14;
    }

    public BigDecimal getDB1670_DBW16() {
        return DB1670_DBW16;
    }

    public void setDB1670_DBW16(BigDecimal DB1670_DBW16) {
        this.DB1670_DBW16 = DB1670_DBW16;
    }

    public BigDecimal getDB1670_DBW18() {
        return DB1670_DBW18;
    }

    public void setDB1670_DBW18(BigDecimal DB1670_DBW18) {
        this.DB1670_DBW18 = DB1670_DBW18;
    }

    public BigDecimal getDB1670_DBW2() {
        return DB1670_DBW2;
    }

    public void setDB1670_DBW2(BigDecimal DB1670_DBW2) {
        this.DB1670_DBW2 = DB1670_DBW2;
    }

    public BigDecimal getDB1670_DBW20() {
        return DB1670_DBW20;
    }

    public void setDB1670_DBW20(BigDecimal DB1670_DBW20) {
        this.DB1670_DBW20 = DB1670_DBW20;
    }

    public BigDecimal getDB1670_DBW22() {
        return DB1670_DBW22;
    }

    public void setDB1670_DBW22(BigDecimal DB1670_DBW22) {
        this.DB1670_DBW22 = DB1670_DBW22;
    }

    public BigDecimal getDB1670_DBW24() {
        return DB1670_DBW24;
    }

    public void setDB1670_DBW24(BigDecimal DB1670_DBW24) {
        this.DB1670_DBW24 = DB1670_DBW24;
    }

    public BigDecimal getDB1670_DBW26() {
        return DB1670_DBW26;
    }

    public void setDB1670_DBW26(BigDecimal DB1670_DBW26) {
        this.DB1670_DBW26 = DB1670_DBW26;
    }

    public BigDecimal getDB1670_DBW28() {
        return DB1670_DBW28;
    }

    public void setDB1670_DBW28(BigDecimal DB1670_DBW28) {
        this.DB1670_DBW28 = DB1670_DBW28;
    }

    public BigDecimal getDB1670_DBW30() {
        return DB1670_DBW30;
    }

    public void setDB1670_DBW30(BigDecimal DB1670_DBW30) {
        this.DB1670_DBW30 = DB1670_DBW30;
    }

    public BigDecimal getDB1670_DBW32() {
        return DB1670_DBW32;
    }

    public void setDB1670_DBW32(BigDecimal DB1670_DBW32) {
        this.DB1670_DBW32 = DB1670_DBW32;
    }

    public BigDecimal getDB1670_DBW34() {
        return DB1670_DBW34;
    }

    public void setDB1670_DBW34(BigDecimal DB1670_DBW34) {
        this.DB1670_DBW34 = DB1670_DBW34;
    }

    public BigDecimal getDB1670_DBW36() {
        return DB1670_DBW36;
    }

    public void setDB1670_DBW36(BigDecimal DB1670_DBW36) {
        this.DB1670_DBW36 = DB1670_DBW36;
    }

    public BigDecimal getDB1670_DBW38() {
        return DB1670_DBW38;
    }

    public void setDB1670_DBW38(BigDecimal DB1670_DBW38) {
        this.DB1670_DBW38 = DB1670_DBW38;
    }

    public BigDecimal getDB1670_DBW4() {
        return DB1670_DBW4;
    }

    public void setDB1670_DBW4(BigDecimal DB1670_DBW4) {
        this.DB1670_DBW4 = DB1670_DBW4;
    }

    public BigDecimal getDB1670_DBW40() {
        return DB1670_DBW40;
    }

    public void setDB1670_DBW40(BigDecimal DB1670_DBW40) {
        this.DB1670_DBW40 = DB1670_DBW40;
    }

    public BigDecimal getDB1670_DBW42() {
        return DB1670_DBW42;
    }

    public void setDB1670_DBW42(BigDecimal DB1670_DBW42) {
        this.DB1670_DBW42 = DB1670_DBW42;
    }

    public BigDecimal getDB1670_DBW44() {
        return DB1670_DBW44;
    }

    public void setDB1670_DBW44(BigDecimal DB1670_DBW44) {
        this.DB1670_DBW44 = DB1670_DBW44;
    }

    public BigDecimal getDB1670_DBW46() {
        return DB1670_DBW46;
    }

    public void setDB1670_DBW46(BigDecimal DB1670_DBW46) {
        this.DB1670_DBW46 = DB1670_DBW46;
    }

    public BigDecimal getDB1670_DBW48() {
        return DB1670_DBW48;
    }

    public void setDB1670_DBW48(BigDecimal DB1670_DBW48) {
        this.DB1670_DBW48 = DB1670_DBW48;
    }

    public BigDecimal getDB1670_DBW50() {
        return DB1670_DBW50;
    }

    public void setDB1670_DBW50(BigDecimal DB1670_DBW50) {
        this.DB1670_DBW50 = DB1670_DBW50;
    }

    public BigDecimal getDB1670_DBW52() {
        return DB1670_DBW52;
    }

    public void setDB1670_DBW52(BigDecimal DB1670_DBW52) {
        this.DB1670_DBW52 = DB1670_DBW52;
    }

    public BigDecimal getDB1670_DBW54() {
        return DB1670_DBW54;
    }

    public void setDB1670_DBW54(BigDecimal DB1670_DBW54) {
        this.DB1670_DBW54 = DB1670_DBW54;
    }

    public BigDecimal getDB1670_DBW56() {
        return DB1670_DBW56;
    }

    public void setDB1670_DBW56(BigDecimal DB1670_DBW56) {
        this.DB1670_DBW56 = DB1670_DBW56;
    }

    public BigDecimal getDB1670_DBW6() {
        return DB1670_DBW6;
    }

    public void setDB1670_DBW6(BigDecimal DB1670_DBW6) {
        this.DB1670_DBW6 = DB1670_DBW6;
    }

    public BigDecimal getDB1670_DBW64() {
        return DB1670_DBW64;
    }

    public void setDB1670_DBW64(BigDecimal DB1670_DBW64) {
        this.DB1670_DBW64 = DB1670_DBW64;
    }

    public BigDecimal getDB1670_DBW68() {
        return DB1670_DBW68;
    }

    public void setDB1670_DBW68(BigDecimal DB1670_DBW68) {
        this.DB1670_DBW68 = DB1670_DBW68;
    }

    public BigDecimal getDB1670_DBW70() {
        return DB1670_DBW70;
    }

    public void setDB1670_DBW70(BigDecimal DB1670_DBW70) {
        this.DB1670_DBW70 = DB1670_DBW70;
    }

    public BigDecimal getDB1670_DBW8() {
        return DB1670_DBW8;
    }

    public void setDB1670_DBW8(BigDecimal DB1670_DBW8) {
        this.DB1670_DBW8 = DB1670_DBW8;
    }

    public String getDB1670_DBX58_0() {
        return DB1670_DBX58_0;
    }

    public void setDB1670_DBX58_0(String DB1670_DBX58_0) {
        this.DB1670_DBX58_0 = DB1670_DBX58_0;
    }

    public String getDB1670_DBX58_1() {
        return DB1670_DBX58_1;
    }

    public void setDB1670_DBX58_1(String DB1670_DBX58_1) {
        this.DB1670_DBX58_1 = DB1670_DBX58_1;
    }

    public String getDB1670_DBX58_2() {
        return DB1670_DBX58_2;
    }

    public void setDB1670_DBX58_2(String DB1670_DBX58_2) {
        this.DB1670_DBX58_2 = DB1670_DBX58_2;
    }

    public String getDB1670_DBX58_3() {
        return DB1670_DBX58_3;
    }

    public void setDB1670_DBX58_3(String DB1670_DBX58_3) {
        this.DB1670_DBX58_3 = DB1670_DBX58_3;
    }

    public String getDB1670_DBX58_4() {
        return DB1670_DBX58_4;
    }

    public void setDB1670_DBX58_4(String DB1670_DBX58_4) {
        this.DB1670_DBX58_4 = DB1670_DBX58_4;
    }

    public String getDB1670_DBX58_5() {
        return DB1670_DBX58_5;
    }

    public void setDB1670_DBX58_5(String DB1670_DBX58_5) {
        this.DB1670_DBX58_5 = DB1670_DBX58_5;
    }

    public String getDB1670_DBX58_6() {
        return DB1670_DBX58_6;
    }

    public void setDB1670_DBX58_6(String DB1670_DBX58_6) {
        this.DB1670_DBX58_6 = DB1670_DBX58_6;
    }

    public String getDB1670_DBX58_7() {
        return DB1670_DBX58_7;
    }

    public void setDB1670_DBX58_7(String DB1670_DBX58_7) {
        this.DB1670_DBX58_7 = DB1670_DBX58_7;
    }

    public String getDB1670_DBX59_0() {
        return DB1670_DBX59_0;
    }

    public void setDB1670_DBX59_0(String DB1670_DBX59_0) {
        this.DB1670_DBX59_0 = DB1670_DBX59_0;
    }

    public String getDB1670_DBX59_1() {
        return DB1670_DBX59_1;
    }

    public void setDB1670_DBX59_1(String DB1670_DBX59_1) {
        this.DB1670_DBX59_1 = DB1670_DBX59_1;
    }

    public String getDB1670_DBX59_2() {
        return DB1670_DBX59_2;
    }

    public void setDB1670_DBX59_2(String DB1670_DBX59_2) {
        this.DB1670_DBX59_2 = DB1670_DBX59_2;
    }

    public String getDB1670_DBX59_6() {
        return DB1670_DBX59_6;
    }

    public void setDB1670_DBX59_6(String DB1670_DBX59_6) {
        this.DB1670_DBX59_6 = DB1670_DBX59_6;
    }

    public String getDB1670_DBX59_7() {
        return DB1670_DBX59_7;
    }

    public void setDB1670_DBX59_7(String DB1670_DBX59_7) {
        this.DB1670_DBX59_7 = DB1670_DBX59_7;
    }

    public String getDB1670_DBX72_0() {
        return DB1670_DBX72_0;
    }

    public void setDB1670_DBX72_0(String DB1670_DBX72_0) {
        this.DB1670_DBX72_0 = DB1670_DBX72_0;
    }

    public String getDB7_DBX10_0() {
        return DB7_DBX10_0;
    }

    public void setDB7_DBX10_0(String DB7_DBX10_0) {
        this.DB7_DBX10_0 = DB7_DBX10_0;
    }

    public String getDB7_DBX10_1() {
        return DB7_DBX10_1;
    }

    public void setDB7_DBX10_1(String DB7_DBX10_1) {
        this.DB7_DBX10_1 = DB7_DBX10_1;
    }

    public String getDB7_DBX10_2() {
        return DB7_DBX10_2;
    }

    public void setDB7_DBX10_2(String DB7_DBX10_2) {
        this.DB7_DBX10_2 = DB7_DBX10_2;
    }

    public String getDB7_DBX10_3() {
        return DB7_DBX10_3;
    }

    public void setDB7_DBX10_3(String DB7_DBX10_3) {
        this.DB7_DBX10_3 = DB7_DBX10_3;
    }

    public String getDB7_DBX10_4() {
        return DB7_DBX10_4;
    }

    public void setDB7_DBX10_4(String DB7_DBX10_4) {
        this.DB7_DBX10_4 = DB7_DBX10_4;
    }

    public String getDB7_DBX10_5() {
        return DB7_DBX10_5;
    }

    public void setDB7_DBX10_5(String DB7_DBX10_5) {
        this.DB7_DBX10_5 = DB7_DBX10_5;
    }

    public String getDB7_DBX12_0() {
        return DB7_DBX12_0;
    }

    public void setDB7_DBX12_0(String DB7_DBX12_0) {
        this.DB7_DBX12_0 = DB7_DBX12_0;
    }

    public String getDB7_DBX12_1() {
        return DB7_DBX12_1;
    }

    public void setDB7_DBX12_1(String DB7_DBX12_1) {
        this.DB7_DBX12_1 = DB7_DBX12_1;
    }

    public String getDB7_DBX12_2() {
        return DB7_DBX12_2;
    }

    public void setDB7_DBX12_2(String DB7_DBX12_2) {
        this.DB7_DBX12_2 = DB7_DBX12_2;
    }

    public String getDB7_DBX12_3() {
        return DB7_DBX12_3;
    }

    public void setDB7_DBX12_3(String DB7_DBX12_3) {
        this.DB7_DBX12_3 = DB7_DBX12_3;
    }

    public String getDB7_DBX12_4() {
        return DB7_DBX12_4;
    }

    public void setDB7_DBX12_4(String DB7_DBX12_4) {
        this.DB7_DBX12_4 = DB7_DBX12_4;
    }

    public String getDB7_DBX12_5() {
        return DB7_DBX12_5;
    }

    public void setDB7_DBX12_5(String DB7_DBX12_5) {
        this.DB7_DBX12_5 = DB7_DBX12_5;
    }

    public String getDB7_DBX12_6() {
        return DB7_DBX12_6;
    }

    public void setDB7_DBX12_6(String DB7_DBX12_6) {
        this.DB7_DBX12_6 = DB7_DBX12_6;
    }

    public String getDB7_DBX12_7() {
        return DB7_DBX12_7;
    }

    public void setDB7_DBX12_7(String DB7_DBX12_7) {
        this.DB7_DBX12_7 = DB7_DBX12_7;
    }

    public String getDB7_DBX14_0() {
        return DB7_DBX14_0;
    }

    public void setDB7_DBX14_0(String DB7_DBX14_0) {
        this.DB7_DBX14_0 = DB7_DBX14_0;
    }

    public String getDB7_DBX14_1() {
        return DB7_DBX14_1;
    }

    public void setDB7_DBX14_1(String DB7_DBX14_1) {
        this.DB7_DBX14_1 = DB7_DBX14_1;
    }

    public String getDB7_DBX14_2() {
        return DB7_DBX14_2;
    }

    public void setDB7_DBX14_2(String DB7_DBX14_2) {
        this.DB7_DBX14_2 = DB7_DBX14_2;
    }

    public String getDB7_DBX14_3() {
        return DB7_DBX14_3;
    }

    public void setDB7_DBX14_3(String DB7_DBX14_3) {
        this.DB7_DBX14_3 = DB7_DBX14_3;
    }

    public String getDB7_DBX14_4() {
        return DB7_DBX14_4;
    }

    public void setDB7_DBX14_4(String DB7_DBX14_4) {
        this.DB7_DBX14_4 = DB7_DBX14_4;
    }

    public String getDB7_DBX14_5() {
        return DB7_DBX14_5;
    }

    public void setDB7_DBX14_5(String DB7_DBX14_5) {
        this.DB7_DBX14_5 = DB7_DBX14_5;
    }

    public String getDB7_DBX14_6() {
        return DB7_DBX14_6;
    }

    public void setDB7_DBX14_6(String DB7_DBX14_6) {
        this.DB7_DBX14_6 = DB7_DBX14_6;
    }

    public String getDB7_DBX14_7() {
        return DB7_DBX14_7;
    }

    public void setDB7_DBX14_7(String DB7_DBX14_7) {
        this.DB7_DBX14_7 = DB7_DBX14_7;
    }

    public String getDB7_DBX16_0() {
        return DB7_DBX16_0;
    }

    public void setDB7_DBX16_0(String DB7_DBX16_0) {
        this.DB7_DBX16_0 = DB7_DBX16_0;
    }

    public String getDB7_DBX16_1() {
        return DB7_DBX16_1;
    }

    public void setDB7_DBX16_1(String DB7_DBX16_1) {
        this.DB7_DBX16_1 = DB7_DBX16_1;
    }

    public String getDB7_DBX16_2() {
        return DB7_DBX16_2;
    }

    public void setDB7_DBX16_2(String DB7_DBX16_2) {
        this.DB7_DBX16_2 = DB7_DBX16_2;
    }

    public String getDB7_DBX16_3() {
        return DB7_DBX16_3;
    }

    public void setDB7_DBX16_3(String DB7_DBX16_3) {
        this.DB7_DBX16_3 = DB7_DBX16_3;
    }

    public String getDB7_DBX16_4() {
        return DB7_DBX16_4;
    }

    public void setDB7_DBX16_4(String DB7_DBX16_4) {
        this.DB7_DBX16_4 = DB7_DBX16_4;
    }

    public String getDB7_DBX16_5() {
        return DB7_DBX16_5;
    }

    public void setDB7_DBX16_5(String DB7_DBX16_5) {
        this.DB7_DBX16_5 = DB7_DBX16_5;
    }

    public String getDB7_DBX16_6() {
        return DB7_DBX16_6;
    }

    public void setDB7_DBX16_6(String DB7_DBX16_6) {
        this.DB7_DBX16_6 = DB7_DBX16_6;
    }

    public String getDB7_DBX16_7() {
        return DB7_DBX16_7;
    }

    public void setDB7_DBX16_7(String DB7_DBX16_7) {
        this.DB7_DBX16_7 = DB7_DBX16_7;
    }

    public String getDB7_DBX17_0() {
        return DB7_DBX17_0;
    }

    public void setDB7_DBX17_0(String DB7_DBX17_0) {
        this.DB7_DBX17_0 = DB7_DBX17_0;
    }

    public String getDB7_DBX17_1() {
        return DB7_DBX17_1;
    }

    public void setDB7_DBX17_1(String DB7_DBX17_1) {
        this.DB7_DBX17_1 = DB7_DBX17_1;
    }

    public String getDB7_DBX17_2() {
        return DB7_DBX17_2;
    }

    public void setDB7_DBX17_2(String DB7_DBX17_2) {
        this.DB7_DBX17_2 = DB7_DBX17_2;
    }

    public String getDB7_DBX17_3() {
        return DB7_DBX17_3;
    }

    public void setDB7_DBX17_3(String DB7_DBX17_3) {
        this.DB7_DBX17_3 = DB7_DBX17_3;
    }

    public String getDB7_DBX17_4() {
        return DB7_DBX17_4;
    }

    public void setDB7_DBX17_4(String DB7_DBX17_4) {
        this.DB7_DBX17_4 = DB7_DBX17_4;
    }

    public String getDB7_DBX17_5() {
        return DB7_DBX17_5;
    }

    public void setDB7_DBX17_5(String DB7_DBX17_5) {
        this.DB7_DBX17_5 = DB7_DBX17_5;
    }

    public String getDB7_DBX17_6() {
        return DB7_DBX17_6;
    }

    public void setDB7_DBX17_6(String DB7_DBX17_6) {
        this.DB7_DBX17_6 = DB7_DBX17_6;
    }

    public String getDB7_DBX17_7() {
        return DB7_DBX17_7;
    }

    public void setDB7_DBX17_7(String DB7_DBX17_7) {
        this.DB7_DBX17_7 = DB7_DBX17_7;
    }

    public String getDB7_DBX18_0() {
        return DB7_DBX18_0;
    }

    public void setDB7_DBX18_0(String DB7_DBX18_0) {
        this.DB7_DBX18_0 = DB7_DBX18_0;
    }

    public String getDB7_DBX18_1() {
        return DB7_DBX18_1;
    }

    public void setDB7_DBX18_1(String DB7_DBX18_1) {
        this.DB7_DBX18_1 = DB7_DBX18_1;
    }

    public String getDB7_DBX18_2() {
        return DB7_DBX18_2;
    }

    public void setDB7_DBX18_2(String DB7_DBX18_2) {
        this.DB7_DBX18_2 = DB7_DBX18_2;
    }

    public String getDB7_DBX18_3() {
        return DB7_DBX18_3;
    }

    public void setDB7_DBX18_3(String DB7_DBX18_3) {
        this.DB7_DBX18_3 = DB7_DBX18_3;
    }

    public String getDB7_DBX18_4() {
        return DB7_DBX18_4;
    }

    public void setDB7_DBX18_4(String DB7_DBX18_4) {
        this.DB7_DBX18_4 = DB7_DBX18_4;
    }

    public String getDB7_DBX18_5() {
        return DB7_DBX18_5;
    }

    public void setDB7_DBX18_5(String DB7_DBX18_5) {
        this.DB7_DBX18_5 = DB7_DBX18_5;
    }

    public String getDB7_DBX18_6() {
        return DB7_DBX18_6;
    }

    public void setDB7_DBX18_6(String DB7_DBX18_6) {
        this.DB7_DBX18_6 = DB7_DBX18_6;
    }

    public String getDB7_DBX18_7() {
        return DB7_DBX18_7;
    }

    public void setDB7_DBX18_7(String DB7_DBX18_7) {
        this.DB7_DBX18_7 = DB7_DBX18_7;
    }

    public String getDB7_DBX19_0() {
        return DB7_DBX19_0;
    }

    public void setDB7_DBX19_0(String DB7_DBX19_0) {
        this.DB7_DBX19_0 = DB7_DBX19_0;
    }

    public String getDB7_DBX19_1() {
        return DB7_DBX19_1;
    }

    public void setDB7_DBX19_1(String DB7_DBX19_1) {
        this.DB7_DBX19_1 = DB7_DBX19_1;
    }

    public String getDB7_DBX19_2() {
        return DB7_DBX19_2;
    }

    public void setDB7_DBX19_2(String DB7_DBX19_2) {
        this.DB7_DBX19_2 = DB7_DBX19_2;
    }

    public String getDB7_DBX19_3() {
        return DB7_DBX19_3;
    }

    public void setDB7_DBX19_3(String DB7_DBX19_3) {
        this.DB7_DBX19_3 = DB7_DBX19_3;
    }

    public String getDB7_DBX19_4() {
        return DB7_DBX19_4;
    }

    public void setDB7_DBX19_4(String DB7_DBX19_4) {
        this.DB7_DBX19_4 = DB7_DBX19_4;
    }

    public String getDB7_DBX19_5() {
        return DB7_DBX19_5;
    }

    public void setDB7_DBX19_5(String DB7_DBX19_5) {
        this.DB7_DBX19_5 = DB7_DBX19_5;
    }

    public String getDB7_DBX19_6() {
        return DB7_DBX19_6;
    }

    public void setDB7_DBX19_6(String DB7_DBX19_6) {
        this.DB7_DBX19_6 = DB7_DBX19_6;
    }

    public String getDB7_DBX19_7() {
        return DB7_DBX19_7;
    }

    public void setDB7_DBX19_7(String DB7_DBX19_7) {
        this.DB7_DBX19_7 = DB7_DBX19_7;
    }

    public String getDB7_DBX20_0() {
        return DB7_DBX20_0;
    }

    public void setDB7_DBX20_0(String DB7_DBX20_0) {
        this.DB7_DBX20_0 = DB7_DBX20_0;
    }

    public String getDB7_DBX20_1() {
        return DB7_DBX20_1;
    }

    public void setDB7_DBX20_1(String DB7_DBX20_1) {
        this.DB7_DBX20_1 = DB7_DBX20_1;
    }

    public String getDB7_DBX20_2() {
        return DB7_DBX20_2;
    }

    public void setDB7_DBX20_2(String DB7_DBX20_2) {
        this.DB7_DBX20_2 = DB7_DBX20_2;
    }

    public String getDB7_DBX20_3() {
        return DB7_DBX20_3;
    }

    public void setDB7_DBX20_3(String DB7_DBX20_3) {
        this.DB7_DBX20_3 = DB7_DBX20_3;
    }

    public String getDB7_DBX20_4() {
        return DB7_DBX20_4;
    }

    public void setDB7_DBX20_4(String DB7_DBX20_4) {
        this.DB7_DBX20_4 = DB7_DBX20_4;
    }

    public String getDB7_DBX20_5() {
        return DB7_DBX20_5;
    }

    public void setDB7_DBX20_5(String DB7_DBX20_5) {
        this.DB7_DBX20_5 = DB7_DBX20_5;
    }

    public String getDB7_DBX20_6() {
        return DB7_DBX20_6;
    }

    public void setDB7_DBX20_6(String DB7_DBX20_6) {
        this.DB7_DBX20_6 = DB7_DBX20_6;
    }

    public String getDB7_DBX20_7() {
        return DB7_DBX20_7;
    }

    public void setDB7_DBX20_7(String DB7_DBX20_7) {
        this.DB7_DBX20_7 = DB7_DBX20_7;
    }

    public String getDB7_DBX21_0() {
        return DB7_DBX21_0;
    }

    public void setDB7_DBX21_0(String DB7_DBX21_0) {
        this.DB7_DBX21_0 = DB7_DBX21_0;
    }

    public String getDB7_DBX21_1() {
        return DB7_DBX21_1;
    }

    public void setDB7_DBX21_1(String DB7_DBX21_1) {
        this.DB7_DBX21_1 = DB7_DBX21_1;
    }

    public String getDB7_DBX21_2() {
        return DB7_DBX21_2;
    }

    public void setDB7_DBX21_2(String DB7_DBX21_2) {
        this.DB7_DBX21_2 = DB7_DBX21_2;
    }

    public String getDB7_DBX21_3() {
        return DB7_DBX21_3;
    }

    public void setDB7_DBX21_3(String DB7_DBX21_3) {
        this.DB7_DBX21_3 = DB7_DBX21_3;
    }

    public String getDB7_DBX21_4() {
        return DB7_DBX21_4;
    }

    public void setDB7_DBX21_4(String DB7_DBX21_4) {
        this.DB7_DBX21_4 = DB7_DBX21_4;
    }

    public String getDB7_DBX21_5() {
        return DB7_DBX21_5;
    }

    public void setDB7_DBX21_5(String DB7_DBX21_5) {
        this.DB7_DBX21_5 = DB7_DBX21_5;
    }

    public String getDB7_DBX21_6() {
        return DB7_DBX21_6;
    }

    public void setDB7_DBX21_6(String DB7_DBX21_6) {
        this.DB7_DBX21_6 = DB7_DBX21_6;
    }

    public String getDB7_DBX21_7() {
        return DB7_DBX21_7;
    }

    public void setDB7_DBX21_7(String DB7_DBX21_7) {
        this.DB7_DBX21_7 = DB7_DBX21_7;
    }

    public String getDB7_DBX34_0() {
        return DB7_DBX34_0;
    }

    public void setDB7_DBX34_0(String DB7_DBX34_0) {
        this.DB7_DBX34_0 = DB7_DBX34_0;
    }

    public String getDB7_DBX34_1() {
        return DB7_DBX34_1;
    }

    public void setDB7_DBX34_1(String DB7_DBX34_1) {
        this.DB7_DBX34_1 = DB7_DBX34_1;
    }

    public String getDB7_DBX34_2() {
        return DB7_DBX34_2;
    }

    public void setDB7_DBX34_2(String DB7_DBX34_2) {
        this.DB7_DBX34_2 = DB7_DBX34_2;
    }

    public String getDB7_DBX34_3() {
        return DB7_DBX34_3;
    }

    public void setDB7_DBX34_3(String DB7_DBX34_3) {
        this.DB7_DBX34_3 = DB7_DBX34_3;
    }

    public String getDB7_DBX34_4() {
        return DB7_DBX34_4;
    }

    public void setDB7_DBX34_4(String DB7_DBX34_4) {
        this.DB7_DBX34_4 = DB7_DBX34_4;
    }

    public String getDB7_DBX34_5() {
        return DB7_DBX34_5;
    }

    public void setDB7_DBX34_5(String DB7_DBX34_5) {
        this.DB7_DBX34_5 = DB7_DBX34_5;
    }

    public String getDB7_DBX34_6() {
        return DB7_DBX34_6;
    }

    public void setDB7_DBX34_6(String DB7_DBX34_6) {
        this.DB7_DBX34_6 = DB7_DBX34_6;
    }

    public String getDB7_DBX34_7() {
        return DB7_DBX34_7;
    }

    public void setDB7_DBX34_7(String DB7_DBX34_7) {
        this.DB7_DBX34_7 = DB7_DBX34_7;
    }

    public String getDB7_DBX35_0() {
        return DB7_DBX35_0;
    }

    public void setDB7_DBX35_0(String DB7_DBX35_0) {
        this.DB7_DBX35_0 = DB7_DBX35_0;
    }

    public String getDB7_DBX35_1() {
        return DB7_DBX35_1;
    }

    public void setDB7_DBX35_1(String DB7_DBX35_1) {
        this.DB7_DBX35_1 = DB7_DBX35_1;
    }

    public String getDB7_DBX35_2() {
        return DB7_DBX35_2;
    }

    public void setDB7_DBX35_2(String DB7_DBX35_2) {
        this.DB7_DBX35_2 = DB7_DBX35_2;
    }

    public String getDB7_DBX35_3() {
        return DB7_DBX35_3;
    }

    public void setDB7_DBX35_3(String DB7_DBX35_3) {
        this.DB7_DBX35_3 = DB7_DBX35_3;
    }

    public String getDB7_DBX35_4() {
        return DB7_DBX35_4;
    }

    public void setDB7_DBX35_4(String DB7_DBX35_4) {
        this.DB7_DBX35_4 = DB7_DBX35_4;
    }

    public String getDB7_DBX35_5() {
        return DB7_DBX35_5;
    }

    public void setDB7_DBX35_5(String DB7_DBX35_5) {
        this.DB7_DBX35_5 = DB7_DBX35_5;
    }

    public String getDB7_DBX35_6() {
        return DB7_DBX35_6;
    }

    public void setDB7_DBX35_6(String DB7_DBX35_6) {
        this.DB7_DBX35_6 = DB7_DBX35_6;
    }

    public String getDB7_DBX35_7() {
        return DB7_DBX35_7;
    }

    public void setDB7_DBX35_7(String DB7_DBX35_7) {
        this.DB7_DBX35_7 = DB7_DBX35_7;
    }

    public String getDB7_DBX36_0() {
        return DB7_DBX36_0;
    }

    public void setDB7_DBX36_0(String DB7_DBX36_0) {
        this.DB7_DBX36_0 = DB7_DBX36_0;
    }

    public String getDB7_DBX36_1() {
        return DB7_DBX36_1;
    }

    public void setDB7_DBX36_1(String DB7_DBX36_1) {
        this.DB7_DBX36_1 = DB7_DBX36_1;
    }

    public String getDB7_DBX36_2() {
        return DB7_DBX36_2;
    }

    public void setDB7_DBX36_2(String DB7_DBX36_2) {
        this.DB7_DBX36_2 = DB7_DBX36_2;
    }

    public String getDB7_DBX36_3() {
        return DB7_DBX36_3;
    }

    public void setDB7_DBX36_3(String DB7_DBX36_3) {
        this.DB7_DBX36_3 = DB7_DBX36_3;
    }

    public String getDB7_DBX36_4() {
        return DB7_DBX36_4;
    }

    public void setDB7_DBX36_4(String DB7_DBX36_4) {
        this.DB7_DBX36_4 = DB7_DBX36_4;
    }

    public String getDB7_DBX36_5() {
        return DB7_DBX36_5;
    }

    public void setDB7_DBX36_5(String DB7_DBX36_5) {
        this.DB7_DBX36_5 = DB7_DBX36_5;
    }

    public String getDB7_DBX36_6() {
        return DB7_DBX36_6;
    }

    public void setDB7_DBX36_6(String DB7_DBX36_6) {
        this.DB7_DBX36_6 = DB7_DBX36_6;
    }

    public String getDB7_DBX36_7() {
        return DB7_DBX36_7;
    }

    public void setDB7_DBX36_7(String DB7_DBX36_7) {
        this.DB7_DBX36_7 = DB7_DBX36_7;
    }

    public String getDB7_DBX37_0() {
        return DB7_DBX37_0;
    }

    public void setDB7_DBX37_0(String DB7_DBX37_0) {
        this.DB7_DBX37_0 = DB7_DBX37_0;
    }

    public String getDB7_DBX37_1() {
        return DB7_DBX37_1;
    }

    public void setDB7_DBX37_1(String DB7_DBX37_1) {
        this.DB7_DBX37_1 = DB7_DBX37_1;
    }

    public String getDB7_DBX37_2() {
        return DB7_DBX37_2;
    }

    public void setDB7_DBX37_2(String DB7_DBX37_2) {
        this.DB7_DBX37_2 = DB7_DBX37_2;
    }

    public String getDB7_DBX37_3() {
        return DB7_DBX37_3;
    }

    public void setDB7_DBX37_3(String DB7_DBX37_3) {
        this.DB7_DBX37_3 = DB7_DBX37_3;
    }

    public String getDB7_DBX37_4() {
        return DB7_DBX37_4;
    }

    public void setDB7_DBX37_4(String DB7_DBX37_4) {
        this.DB7_DBX37_4 = DB7_DBX37_4;
    }

    public String getDB7_DBX37_5() {
        return DB7_DBX37_5;
    }

    public void setDB7_DBX37_5(String DB7_DBX37_5) {
        this.DB7_DBX37_5 = DB7_DBX37_5;
    }

    public String getDB7_DBX37_6() {
        return DB7_DBX37_6;
    }

    public void setDB7_DBX37_6(String DB7_DBX37_6) {
        this.DB7_DBX37_6 = DB7_DBX37_6;
    }

    public String getDB7_DBX37_7() {
        return DB7_DBX37_7;
    }

    public void setDB7_DBX37_7(String DB7_DBX37_7) {
        this.DB7_DBX37_7 = DB7_DBX37_7;
    }

    public String getDB7_DBX38_0() {
        return DB7_DBX38_0;
    }

    public void setDB7_DBX38_0(String DB7_DBX38_0) {
        this.DB7_DBX38_0 = DB7_DBX38_0;
    }

    public String getDB7_DBX38_1() {
        return DB7_DBX38_1;
    }

    public void setDB7_DBX38_1(String DB7_DBX38_1) {
        this.DB7_DBX38_1 = DB7_DBX38_1;
    }

    public String getDB7_DBX38_2() {
        return DB7_DBX38_2;
    }

    public void setDB7_DBX38_2(String DB7_DBX38_2) {
        this.DB7_DBX38_2 = DB7_DBX38_2;
    }

    public String getDB7_DBX38_3() {
        return DB7_DBX38_3;
    }

    public void setDB7_DBX38_3(String DB7_DBX38_3) {
        this.DB7_DBX38_3 = DB7_DBX38_3;
    }

    public String getDB7_DBX38_4() {
        return DB7_DBX38_4;
    }

    public void setDB7_DBX38_4(String DB7_DBX38_4) {
        this.DB7_DBX38_4 = DB7_DBX38_4;
    }

    public String getDB7_DBX38_5() {
        return DB7_DBX38_5;
    }

    public void setDB7_DBX38_5(String DB7_DBX38_5) {
        this.DB7_DBX38_5 = DB7_DBX38_5;
    }

    public String getDB7_DBX38_6() {
        return DB7_DBX38_6;
    }

    public void setDB7_DBX38_6(String DB7_DBX38_6) {
        this.DB7_DBX38_6 = DB7_DBX38_6;
    }

    public String getDB7_DBX38_7() {
        return DB7_DBX38_7;
    }

    public void setDB7_DBX38_7(String DB7_DBX38_7) {
        this.DB7_DBX38_7 = DB7_DBX38_7;
    }

    public String getDB7_DBX39_0() {
        return DB7_DBX39_0;
    }

    public void setDB7_DBX39_0(String DB7_DBX39_0) {
        this.DB7_DBX39_0 = DB7_DBX39_0;
    }

    public String getDB7_DBX39_1() {
        return DB7_DBX39_1;
    }

    public void setDB7_DBX39_1(String DB7_DBX39_1) {
        this.DB7_DBX39_1 = DB7_DBX39_1;
    }

    public String getDB7_DBX39_2() {
        return DB7_DBX39_2;
    }

    public void setDB7_DBX39_2(String DB7_DBX39_2) {
        this.DB7_DBX39_2 = DB7_DBX39_2;
    }

    public String getDB7_DBX39_3() {
        return DB7_DBX39_3;
    }

    public void setDB7_DBX39_3(String DB7_DBX39_3) {
        this.DB7_DBX39_3 = DB7_DBX39_3;
    }

    public String getDB7_DBX39_4() {
        return DB7_DBX39_4;
    }

    public void setDB7_DBX39_4(String DB7_DBX39_4) {
        this.DB7_DBX39_4 = DB7_DBX39_4;
    }

    public String getDB7_DBX39_5() {
        return DB7_DBX39_5;
    }

    public void setDB7_DBX39_5(String DB7_DBX39_5) {
        this.DB7_DBX39_5 = DB7_DBX39_5;
    }

    public String getDB7_DBX39_6() {
        return DB7_DBX39_6;
    }

    public void setDB7_DBX39_6(String DB7_DBX39_6) {
        this.DB7_DBX39_6 = DB7_DBX39_6;
    }

    public String getDB7_DBX39_7() {
        return DB7_DBX39_7;
    }

    public void setDB7_DBX39_7(String DB7_DBX39_7) {
        this.DB7_DBX39_7 = DB7_DBX39_7;
    }

    public String getDB7_DBX4_0() {
        return DB7_DBX4_0;
    }

    public void setDB7_DBX4_0(String DB7_DBX4_0) {
        this.DB7_DBX4_0 = DB7_DBX4_0;
    }

    public String getDB7_DBX4_1() {
        return DB7_DBX4_1;
    }

    public void setDB7_DBX4_1(String DB7_DBX4_1) {
        this.DB7_DBX4_1 = DB7_DBX4_1;
    }

    public String getDB7_DBX4_2() {
        return DB7_DBX4_2;
    }

    public void setDB7_DBX4_2(String DB7_DBX4_2) {
        this.DB7_DBX4_2 = DB7_DBX4_2;
    }

    public String getDB7_DBX4_3() {
        return DB7_DBX4_3;
    }

    public void setDB7_DBX4_3(String DB7_DBX4_3) {
        this.DB7_DBX4_3 = DB7_DBX4_3;
    }

    public String getDB7_DBX4_4() {
        return DB7_DBX4_4;
    }

    public void setDB7_DBX4_4(String DB7_DBX4_4) {
        this.DB7_DBX4_4 = DB7_DBX4_4;
    }

    public String getDB7_DBX4_5() {
        return DB7_DBX4_5;
    }

    public void setDB7_DBX4_5(String DB7_DBX4_5) {
        this.DB7_DBX4_5 = DB7_DBX4_5;
    }

    public String getDB7_DBX4_6() {
        return DB7_DBX4_6;
    }

    public void setDB7_DBX4_6(String DB7_DBX4_6) {
        this.DB7_DBX4_6 = DB7_DBX4_6;
    }

    public String getDB7_DBX4_7() {
        return DB7_DBX4_7;
    }

    public void setDB7_DBX4_7(String DB7_DBX4_7) {
        this.DB7_DBX4_7 = DB7_DBX4_7;
    }

    public String getDB7_DBX52_0() {
        return DB7_DBX52_0;
    }

    public void setDB7_DBX52_0(String DB7_DBX52_0) {
        this.DB7_DBX52_0 = DB7_DBX52_0;
    }

    public String getDB7_DBX52_1() {
        return DB7_DBX52_1;
    }

    public void setDB7_DBX52_1(String DB7_DBX52_1) {
        this.DB7_DBX52_1 = DB7_DBX52_1;
    }

    public String getDB7_DBX52_2() {
        return DB7_DBX52_2;
    }

    public void setDB7_DBX52_2(String DB7_DBX52_2) {
        this.DB7_DBX52_2 = DB7_DBX52_2;
    }

    public String getDB7_DBX52_3() {
        return DB7_DBX52_3;
    }

    public void setDB7_DBX52_3(String DB7_DBX52_3) {
        this.DB7_DBX52_3 = DB7_DBX52_3;
    }

    public String getDB7_DBX52_4() {
        return DB7_DBX52_4;
    }

    public void setDB7_DBX52_4(String DB7_DBX52_4) {
        this.DB7_DBX52_4 = DB7_DBX52_4;
    }

    public String getDB7_DBX52_5() {
        return DB7_DBX52_5;
    }

    public void setDB7_DBX52_5(String DB7_DBX52_5) {
        this.DB7_DBX52_5 = DB7_DBX52_5;
    }

    public String getDB7_DBX52_6() {
        return DB7_DBX52_6;
    }

    public void setDB7_DBX52_6(String DB7_DBX52_6) {
        this.DB7_DBX52_6 = DB7_DBX52_6;
    }

    public String getDB7_DBX52_7() {
        return DB7_DBX52_7;
    }

    public void setDB7_DBX52_7(String DB7_DBX52_7) {
        this.DB7_DBX52_7 = DB7_DBX52_7;
    }

    public String getDB7_DBX53_0() {
        return DB7_DBX53_0;
    }

    public void setDB7_DBX53_0(String DB7_DBX53_0) {
        this.DB7_DBX53_0 = DB7_DBX53_0;
    }

    public String getDB7_DBX53_1() {
        return DB7_DBX53_1;
    }

    public void setDB7_DBX53_1(String DB7_DBX53_1) {
        this.DB7_DBX53_1 = DB7_DBX53_1;
    }

    public String getDB7_DBX53_2() {
        return DB7_DBX53_2;
    }

    public void setDB7_DBX53_2(String DB7_DBX53_2) {
        this.DB7_DBX53_2 = DB7_DBX53_2;
    }

    public String getDB7_DBX53_3() {
        return DB7_DBX53_3;
    }

    public void setDB7_DBX53_3(String DB7_DBX53_3) {
        this.DB7_DBX53_3 = DB7_DBX53_3;
    }

    public String getDB7_DBX54_0() {
        return DB7_DBX54_0;
    }

    public void setDB7_DBX54_0(String DB7_DBX54_0) {
        this.DB7_DBX54_0 = DB7_DBX54_0;
    }

    public String getDB7_DBX54_1() {
        return DB7_DBX54_1;
    }

    public void setDB7_DBX54_1(String DB7_DBX54_1) {
        this.DB7_DBX54_1 = DB7_DBX54_1;
    }

    public String getDB7_DBX54_2() {
        return DB7_DBX54_2;
    }

    public void setDB7_DBX54_2(String DB7_DBX54_2) {
        this.DB7_DBX54_2 = DB7_DBX54_2;
    }

    public String getDB7_DBX54_3() {
        return DB7_DBX54_3;
    }

    public void setDB7_DBX54_3(String DB7_DBX54_3) {
        this.DB7_DBX54_3 = DB7_DBX54_3;
    }

    public String getDB7_DBX54_4() {
        return DB7_DBX54_4;
    }

    public void setDB7_DBX54_4(String DB7_DBX54_4) {
        this.DB7_DBX54_4 = DB7_DBX54_4;
    }

    public String getDB7_DBX54_5() {
        return DB7_DBX54_5;
    }

    public void setDB7_DBX54_5(String DB7_DBX54_5) {
        this.DB7_DBX54_5 = DB7_DBX54_5;
    }

    public String getDB7_DBX54_6() {
        return DB7_DBX54_6;
    }

    public void setDB7_DBX54_6(String DB7_DBX54_6) {
        this.DB7_DBX54_6 = DB7_DBX54_6;
    }

    public String getDB7_DBX54_7() {
        return DB7_DBX54_7;
    }

    public void setDB7_DBX54_7(String DB7_DBX54_7) {
        this.DB7_DBX54_7 = DB7_DBX54_7;
    }

    public String getDB7_DBX55_0() {
        return DB7_DBX55_0;
    }

    public void setDB7_DBX55_0(String DB7_DBX55_0) {
        this.DB7_DBX55_0 = DB7_DBX55_0;
    }

    public String getDB7_DBX55_1() {
        return DB7_DBX55_1;
    }

    public void setDB7_DBX55_1(String DB7_DBX55_1) {
        this.DB7_DBX55_1 = DB7_DBX55_1;
    }

    public String getDB7_DBX55_2() {
        return DB7_DBX55_2;
    }

    public void setDB7_DBX55_2(String DB7_DBX55_2) {
        this.DB7_DBX55_2 = DB7_DBX55_2;
    }

    public String getDB7_DBX55_3() {
        return DB7_DBX55_3;
    }

    public void setDB7_DBX55_3(String DB7_DBX55_3) {
        this.DB7_DBX55_3 = DB7_DBX55_3;
    }

    public String getDB7_DBX56_0() {
        return DB7_DBX56_0;
    }

    public void setDB7_DBX56_0(String DB7_DBX56_0) {
        this.DB7_DBX56_0 = DB7_DBX56_0;
    }

    public String getDB7_DBX56_1() {
        return DB7_DBX56_1;
    }

    public void setDB7_DBX56_1(String DB7_DBX56_1) {
        this.DB7_DBX56_1 = DB7_DBX56_1;
    }

    public String getDB7_DBX56_2() {
        return DB7_DBX56_2;
    }

    public void setDB7_DBX56_2(String DB7_DBX56_2) {
        this.DB7_DBX56_2 = DB7_DBX56_2;
    }

    public String getDB7_DBX56_3() {
        return DB7_DBX56_3;
    }

    public void setDB7_DBX56_3(String DB7_DBX56_3) {
        this.DB7_DBX56_3 = DB7_DBX56_3;
    }

    public String getDB7_DBX56_4() {
        return DB7_DBX56_4;
    }

    public void setDB7_DBX56_4(String DB7_DBX56_4) {
        this.DB7_DBX56_4 = DB7_DBX56_4;
    }

    public String getDB7_DBX56_5() {
        return DB7_DBX56_5;
    }

    public void setDB7_DBX56_5(String DB7_DBX56_5) {
        this.DB7_DBX56_5 = DB7_DBX56_5;
    }

    public String getDB7_DBX56_6() {
        return DB7_DBX56_6;
    }

    public void setDB7_DBX56_6(String DB7_DBX56_6) {
        this.DB7_DBX56_6 = DB7_DBX56_6;
    }

    public String getDB7_DBX56_7() {
        return DB7_DBX56_7;
    }

    public void setDB7_DBX56_7(String DB7_DBX56_7) {
        this.DB7_DBX56_7 = DB7_DBX56_7;
    }

    public String getDB7_DBX57_0() {
        return DB7_DBX57_0;
    }

    public void setDB7_DBX57_0(String DB7_DBX57_0) {
        this.DB7_DBX57_0 = DB7_DBX57_0;
    }

    public String getDB7_DBX58_0() {
        return DB7_DBX58_0;
    }

    public void setDB7_DBX58_0(String DB7_DBX58_0) {
        this.DB7_DBX58_0 = DB7_DBX58_0;
    }

    public String getDB7_DBX58_1() {
        return DB7_DBX58_1;
    }

    public void setDB7_DBX58_1(String DB7_DBX58_1) {
        this.DB7_DBX58_1 = DB7_DBX58_1;
    }

    public String getDB7_DBX58_2() {
        return DB7_DBX58_2;
    }

    public void setDB7_DBX58_2(String DB7_DBX58_2) {
        this.DB7_DBX58_2 = DB7_DBX58_2;
    }

    public String getDB7_DBX60_0() {
        return DB7_DBX60_0;
    }

    public void setDB7_DBX60_0(String DB7_DBX60_0) {
        this.DB7_DBX60_0 = DB7_DBX60_0;
    }

    public String getDB7_DBX60_1() {
        return DB7_DBX60_1;
    }

    public void setDB7_DBX60_1(String DB7_DBX60_1) {
        this.DB7_DBX60_1 = DB7_DBX60_1;
    }

    public String getDB7_DBX60_2() {
        return DB7_DBX60_2;
    }

    public void setDB7_DBX60_2(String DB7_DBX60_2) {
        this.DB7_DBX60_2 = DB7_DBX60_2;
    }

    public String getDB7_DBX62_0() {
        return DB7_DBX62_0;
    }

    public void setDB7_DBX62_0(String DB7_DBX62_0) {
        this.DB7_DBX62_0 = DB7_DBX62_0;
    }

    public String getDB7_DBX62_1() {
        return DB7_DBX62_1;
    }

    public void setDB7_DBX62_1(String DB7_DBX62_1) {
        this.DB7_DBX62_1 = DB7_DBX62_1;
    }

    public String getDB7_DBX62_2() {
        return DB7_DBX62_2;
    }

    public void setDB7_DBX62_2(String DB7_DBX62_2) {
        this.DB7_DBX62_2 = DB7_DBX62_2;
    }

    public String getDB7_DBX6_0() {
        return DB7_DBX6_0;
    }

    public void setDB7_DBX6_0(String DB7_DBX6_0) {
        this.DB7_DBX6_0 = DB7_DBX6_0;
    }

    public String getDB7_DBX6_1() {
        return DB7_DBX6_1;
    }

    public void setDB7_DBX6_1(String DB7_DBX6_1) {
        this.DB7_DBX6_1 = DB7_DBX6_1;
    }

    public String getDB7_DBX6_2() {
        return DB7_DBX6_2;
    }

    public void setDB7_DBX6_2(String DB7_DBX6_2) {
        this.DB7_DBX6_2 = DB7_DBX6_2;
    }

    public String getDB7_DBX6_3() {
        return DB7_DBX6_3;
    }

    public void setDB7_DBX6_3(String DB7_DBX6_3) {
        this.DB7_DBX6_3 = DB7_DBX6_3;
    }

    public String getDB7_DBX6_4() {
        return DB7_DBX6_4;
    }

    public void setDB7_DBX6_4(String DB7_DBX6_4) {
        this.DB7_DBX6_4 = DB7_DBX6_4;
    }

    public String getDB7_DBX6_5() {
        return DB7_DBX6_5;
    }

    public void setDB7_DBX6_5(String DB7_DBX6_5) {
        this.DB7_DBX6_5 = DB7_DBX6_5;
    }

    public String getDB7_DBX6_6() {
        return DB7_DBX6_6;
    }

    public void setDB7_DBX6_6(String DB7_DBX6_6) {
        this.DB7_DBX6_6 = DB7_DBX6_6;
    }

    public String getDB7_DBX6_7() {
        return DB7_DBX6_7;
    }

    public void setDB7_DBX6_7(String DB7_DBX6_7) {
        this.DB7_DBX6_7 = DB7_DBX6_7;
    }

    public String getDB7_DBX7_0() {
        return DB7_DBX7_0;
    }

    public void setDB7_DBX7_0(String DB7_DBX7_0) {
        this.DB7_DBX7_0 = DB7_DBX7_0;
    }

    public String getDB7_DBX7_1() {
        return DB7_DBX7_1;
    }

    public void setDB7_DBX7_1(String DB7_DBX7_1) {
        this.DB7_DBX7_1 = DB7_DBX7_1;
    }

    public String getDB7_DBX7_2() {
        return DB7_DBX7_2;
    }

    public void setDB7_DBX7_2(String DB7_DBX7_2) {
        this.DB7_DBX7_2 = DB7_DBX7_2;
    }

    public String getDB7_DBX7_3() {
        return DB7_DBX7_3;
    }

    public void setDB7_DBX7_3(String DB7_DBX7_3) {
        this.DB7_DBX7_3 = DB7_DBX7_3;
    }

    public String getDB7_DBX7_4() {
        return DB7_DBX7_4;
    }

    public void setDB7_DBX7_4(String DB7_DBX7_4) {
        this.DB7_DBX7_4 = DB7_DBX7_4;
    }

    public String getDB7_DBX7_5() {
        return DB7_DBX7_5;
    }

    public void setDB7_DBX7_5(String DB7_DBX7_5) {
        this.DB7_DBX7_5 = DB7_DBX7_5;
    }

    public String getDB7_DBX7_6() {
        return DB7_DBX7_6;
    }

    public void setDB7_DBX7_6(String DB7_DBX7_6) {
        this.DB7_DBX7_6 = DB7_DBX7_6;
    }

    public String getDB7_DBX7_7() {
        return DB7_DBX7_7;
    }

    public void setDB7_DBX7_7(String DB7_DBX7_7) {
        this.DB7_DBX7_7 = DB7_DBX7_7;
    }

    public String getDB7_DBX8_0() {
        return DB7_DBX8_0;
    }

    public void setDB7_DBX8_0(String DB7_DBX8_0) {
        this.DB7_DBX8_0 = DB7_DBX8_0;
    }

    public String getDB7_DBX8_1() {
        return DB7_DBX8_1;
    }

    public void setDB7_DBX8_1(String DB7_DBX8_1) {
        this.DB7_DBX8_1 = DB7_DBX8_1;
    }

    public String getDB7_DBX8_2() {
        return DB7_DBX8_2;
    }

    public void setDB7_DBX8_2(String DB7_DBX8_2) {
        this.DB7_DBX8_2 = DB7_DBX8_2;
    }

    public String getDB7_DBX8_3() {
        return DB7_DBX8_3;
    }

    public void setDB7_DBX8_3(String DB7_DBX8_3) {
        this.DB7_DBX8_3 = DB7_DBX8_3;
    }

    public String getDB7_DBX8_4() {
        return DB7_DBX8_4;
    }

    public void setDB7_DBX8_4(String DB7_DBX8_4) {
        this.DB7_DBX8_4 = DB7_DBX8_4;
    }

    public String getDB7_DBX8_5() {
        return DB7_DBX8_5;
    }

    public void setDB7_DBX8_5(String DB7_DBX8_5) {
        this.DB7_DBX8_5 = DB7_DBX8_5;
    }
}
