package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_REOP40")
public class CL_REOP40 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String DB11_BYTE132;
    private BigDecimal DB11_INT130;
    private BigDecimal DB11_REAL10;
    private BigDecimal DB11_REAL100;
    private BigDecimal DB11_REAL104;
    private BigDecimal DB11_REAL108;
    private BigDecimal DB11_REAL114;
    private BigDecimal DB11_REAL118;
    private BigDecimal DB11_REAL122;
    private BigDecimal DB11_REAL126;
    private BigDecimal DB11_REAL14;
    private BigDecimal DB11_REAL24;
    private BigDecimal DB11_REAL28;
    private BigDecimal DB11_REAL32;
    private BigDecimal DB11_REAL36;
    private BigDecimal DB11_REAL40;
    private BigDecimal DB11_REAL44;
    private BigDecimal DB11_REAL48;
    private BigDecimal DB11_REAL52;
    private BigDecimal DB11_REAL56;
    private BigDecimal DB11_REAL60;
    private BigDecimal DB11_REAL64;
    private BigDecimal DB11_REAL68;
    private BigDecimal DB11_REAL72;
    private BigDecimal DB11_REAL76;
    private BigDecimal DB11_REAL80;
    private BigDecimal DB11_REAL84;
    private BigDecimal DB11_REAL88;
    private BigDecimal DB11_REAL92;
    private BigDecimal DB11_REAL96;
    private String DB11_X134_0;
    private String DB11_X134_1;
    private String DB11_X136_0;
    private String DB11_X136_1;
    private String DB11_X136_2;
    private String DB11_X136_3;
    private String DB11_X136_4;
    private String DB11_X136_5;
    private String DB11_X137_0;
    private String DB11_X137_1;
    private String DB11_X137_2;
    private String DB11_X137_3;
    private String DB11_X137_4;
    private String DB11_X137_5;
    private String DB11_X137_6;
    private String DB11_X138_0;
    private String DB11_X138_1;
    private String DB11_X138_2;
    private String DB11_X138_3;
    private String DB11_X138_4;
    private String DB11_X138_5;
    private String DB11_X138_6;
    private String DB11_X138_7;
    private String DB11_X139_0;
    private String DB11_X139_1;
    private String DB11_X139_2;
    private String DB11_X139_3;
    private String DB11_X139_4;
    private String DB11_X139_5;
    private String DB11_X139_6;
    private String DB11_X139_7;
    private String DB11_X140_0;
    private String DB11_X140_1;
    private String DB11_X140_2;
    private String DB11_X140_3;
    private String DB11_X140_4;
    private String DB11_X140_5;
    private String DB11_X140_6;
    private String DB11_X140_7;
    private String DB11_X141_0;
    private String DB11_X141_1;
    private String DB11_X141_2;
    private String DB11_X141_3;
    private String DB11_X141_4;
    private String DB11_X141_5;
    private String DB11_X141_6;
    private String DB11_X141_7;
    private String DB11_X142_0;
    private String DB11_X142_1;
    private String DB11_X142_2;
    private String DB11_X142_3;
    private String DB11_X142_4;
    private String DB11_X142_5;
    private String DB11_X142_6;
    private String DB11_X142_7;
    private String DB11_X143_0;
    private String DB11_X143_1;
    private String DB11_X143_2;
    private String DB11_X143_3;
    private String DB11_X143_4;
    private String DB11_X143_5;
    private String DB11_X143_6;
    private String DB11_X144_0;
    private String DB11_X144_1;
    private String DB11_X144_2;
    private String DB11_X144_4;
    private String DB11_X144_5;
    private String DB11_X144_6;
    private String DB11_X144_7;
    private String DB11_X145_0;
    private String DB11_X145_1;
    private String DB11_X145_2;
    private String DB11_X145_3;
    private String DB11_X145_4;
    private String DB11_X145_5;
    private String DB11_X145_6;
    private String DB11_X145_7;
    private String DB11_X146_0;
    private String DB11_X146_1;
    private String DB11_X146_2;
    private String DB11_X146_3;
    private String DB11_X146_4;
    private String DB11_X146_5;
    private String DB11_X147_2;
    private String DB11_X147_3;
    private String DB11_X147_4;
    private String DB11_X147_5;
    private String DB11_X147_6;
    private String DB11_X147_7;
    private String DB11_X148_0;
    private String DB11_X148_1;
    private String DB11_X148_2;
    private String DB11_X148_3;
    private String DB11_X148_4;
    private String DB11_X148_5;
    private String DB11_X149_0;
    private String DB11_X149_1;
    private String DB15_BYTE208_8;
    private String DB15_BYTE218_8;
    private String DB15_CHAR48_40;
    private String DB15_INT0_22;
    private BigDecimal DB15_SINT46;
    private String M100_0;
    private String M98_5;
    private String M98_6;

    public String getDB11_X134_0() {
        return DB11_X134_0;
    }

    public void setDB11_X134_0(String DB11_X134_0) {
        this.DB11_X134_0 = DB11_X134_0;
    }

    public String getDB11_X134_1() {
        return DB11_X134_1;
    }

    public void setDB11_X134_1(String DB11_X134_1) {
        this.DB11_X134_1 = DB11_X134_1;
    }

    public String getDB11_X141_2() {
        return DB11_X141_2;
    }

    public void setDB11_X141_2(String DB11_X141_2) {
        this.DB11_X141_2 = DB11_X141_2;
    }

    public String getDB11_X141_3() {
        return DB11_X141_3;
    }

    public void setDB11_X141_3(String DB11_X141_3) {
        this.DB11_X141_3 = DB11_X141_3;
    }

    public String getDB11_X145_3() {
        return DB11_X145_3;
    }

    public void setDB11_X145_3(String DB11_X145_3) {
        this.DB11_X145_3 = DB11_X145_3;
    }

    public String getDB11_X145_4() {
        return DB11_X145_4;
    }

    public void setDB11_X145_4(String DB11_X145_4) {
        this.DB11_X145_4 = DB11_X145_4;
    }

    public String getDB11_X145_5() {
        return DB11_X145_5;
    }

    public void setDB11_X145_5(String DB11_X145_5) {
        this.DB11_X145_5 = DB11_X145_5;
    }

    public String getDB11_X145_6() {
        return DB11_X145_6;
    }

    public void setDB11_X145_6(String DB11_X145_6) {
        this.DB11_X145_6 = DB11_X145_6;
    }

    public String getDB11_X145_7() {
        return DB11_X145_7;
    }

    public void setDB11_X145_7(String DB11_X145_7) {
        this.DB11_X145_7 = DB11_X145_7;
    }

    public String getDB11_X146_2() {
        return DB11_X146_2;
    }

    public void setDB11_X146_2(String DB11_X146_2) {
        this.DB11_X146_2 = DB11_X146_2;
    }

    public String getDB11_X146_3() {
        return DB11_X146_3;
    }

    public void setDB11_X146_3(String DB11_X146_3) {
        this.DB11_X146_3 = DB11_X146_3;
    }

    public String getDB11_X146_4() {
        return DB11_X146_4;
    }

    public void setDB11_X146_4(String DB11_X146_4) {
        this.DB11_X146_4 = DB11_X146_4;
    }

    public String getDB11_X146_5() {
        return DB11_X146_5;
    }

    public void setDB11_X146_5(String DB11_X146_5) {
        this.DB11_X146_5 = DB11_X146_5;
    }

    public String getDB11_X147_2() {
        return DB11_X147_2;
    }

    public void setDB11_X147_2(String DB11_X147_2) {
        this.DB11_X147_2 = DB11_X147_2;
    }

    public String getDB11_X147_3() {
        return DB11_X147_3;
    }

    public void setDB11_X147_3(String DB11_X147_3) {
        this.DB11_X147_3 = DB11_X147_3;
    }

    public String getDB11_X147_4() {
        return DB11_X147_4;
    }

    public void setDB11_X147_4(String DB11_X147_4) {
        this.DB11_X147_4 = DB11_X147_4;
    }

    public String getDB11_X147_5() {
        return DB11_X147_5;
    }

    public void setDB11_X147_5(String DB11_X147_5) {
        this.DB11_X147_5 = DB11_X147_5;
    }

    public String getDB11_X147_6() {
        return DB11_X147_6;
    }

    public void setDB11_X147_6(String DB11_X147_6) {
        this.DB11_X147_6 = DB11_X147_6;
    }

    public String getDB11_X147_7() {
        return DB11_X147_7;
    }

    public void setDB11_X147_7(String DB11_X147_7) {
        this.DB11_X147_7 = DB11_X147_7;
    }

    public String getDB11_X148_0() {
        return DB11_X148_0;
    }

    public void setDB11_X148_0(String DB11_X148_0) {
        this.DB11_X148_0 = DB11_X148_0;
    }

    public String getDB11_X148_1() {
        return DB11_X148_1;
    }

    public void setDB11_X148_1(String DB11_X148_1) {
        this.DB11_X148_1 = DB11_X148_1;
    }

    public String getDB11_X148_2() {
        return DB11_X148_2;
    }

    public void setDB11_X148_2(String DB11_X148_2) {
        this.DB11_X148_2 = DB11_X148_2;
    }

    public String getDB11_X148_3() {
        return DB11_X148_3;
    }

    public void setDB11_X148_3(String DB11_X148_3) {
        this.DB11_X148_3 = DB11_X148_3;
    }

    public String getDB11_X148_4() {
        return DB11_X148_4;
    }

    public void setDB11_X148_4(String DB11_X148_4) {
        this.DB11_X148_4 = DB11_X148_4;
    }

    public String getDB11_X148_5() {
        return DB11_X148_5;
    }

    public void setDB11_X148_5(String DB11_X148_5) {
        this.DB11_X148_5 = DB11_X148_5;
    }

    public String getDB11_X149_0() {
        return DB11_X149_0;
    }

    public void setDB11_X149_0(String DB11_X149_0) {
        this.DB11_X149_0 = DB11_X149_0;
    }

    public String getDB11_X149_1() {
        return DB11_X149_1;
    }

    public void setDB11_X149_1(String DB11_X149_1) {
        this.DB11_X149_1 = DB11_X149_1;
    }

    public String getDB15_BYTE208_8() {
        return DB15_BYTE208_8;
    }

    public void setDB15_BYTE208_8(String DB15_BYTE208_8) {
        this.DB15_BYTE208_8 = DB15_BYTE208_8;
    }

    public String getDB15_BYTE218_8() {
        return DB15_BYTE218_8;
    }

    public void setDB15_BYTE218_8(String DB15_BYTE218_8) {
        this.DB15_BYTE218_8 = DB15_BYTE218_8;
    }

    public String getM98_6() {
        return M98_6;
    }

    public void setM98_6(String m98_6) {
        M98_6 = m98_6;
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



    public String getDB11_BYTE132() {
        return DB11_BYTE132;
    }

    public void setDB11_BYTE132(String DB11_BYTE132) {
        this.DB11_BYTE132 = DB11_BYTE132;
    }

    public BigDecimal getDB11_INT130() {
        return DB11_INT130;
    }

    public void setDB11_INT130(BigDecimal DB11_INT130) {
        this.DB11_INT130 = DB11_INT130;
    }

    public BigDecimal getDB11_REAL10() {
        return DB11_REAL10;
    }

    public void setDB11_REAL10(BigDecimal DB11_REAL10) {
        this.DB11_REAL10 = DB11_REAL10;
    }

    public BigDecimal getDB11_REAL100() {
        return DB11_REAL100;
    }

    public void setDB11_REAL100(BigDecimal DB11_REAL100) {
        this.DB11_REAL100 = DB11_REAL100;
    }

    public BigDecimal getDB11_REAL104() {
        return DB11_REAL104;
    }

    public void setDB11_REAL104(BigDecimal DB11_REAL104) {
        this.DB11_REAL104 = DB11_REAL104;
    }

    public BigDecimal getDB11_REAL108() {
        return DB11_REAL108;
    }

    public void setDB11_REAL108(BigDecimal DB11_REAL108) {
        this.DB11_REAL108 = DB11_REAL108;
    }

    public BigDecimal getDB11_REAL114() {
        return DB11_REAL114;
    }

    public void setDB11_REAL114(BigDecimal DB11_REAL114) {
        this.DB11_REAL114 = DB11_REAL114;
    }

    public BigDecimal getDB11_REAL118() {
        return DB11_REAL118;
    }

    public void setDB11_REAL118(BigDecimal DB11_REAL118) {
        this.DB11_REAL118 = DB11_REAL118;
    }

    public BigDecimal getDB11_REAL122() {
        return DB11_REAL122;
    }

    public void setDB11_REAL122(BigDecimal DB11_REAL122) {
        this.DB11_REAL122 = DB11_REAL122;
    }

    public BigDecimal getDB11_REAL126() {
        return DB11_REAL126;
    }

    public void setDB11_REAL126(BigDecimal DB11_REAL126) {
        this.DB11_REAL126 = DB11_REAL126;
    }

    public BigDecimal getDB11_REAL14() {
        return DB11_REAL14;
    }

    public void setDB11_REAL14(BigDecimal DB11_REAL14) {
        this.DB11_REAL14 = DB11_REAL14;
    }

    public BigDecimal getDB11_REAL24() {
        return DB11_REAL24;
    }

    public void setDB11_REAL24(BigDecimal DB11_REAL24) {
        this.DB11_REAL24 = DB11_REAL24;
    }

    public BigDecimal getDB11_REAL28() {
        return DB11_REAL28;
    }

    public void setDB11_REAL28(BigDecimal DB11_REAL28) {
        this.DB11_REAL28 = DB11_REAL28;
    }

    public BigDecimal getDB11_REAL32() {
        return DB11_REAL32;
    }

    public void setDB11_REAL32(BigDecimal DB11_REAL32) {
        this.DB11_REAL32 = DB11_REAL32;
    }

    public BigDecimal getDB11_REAL36() {
        return DB11_REAL36;
    }

    public void setDB11_REAL36(BigDecimal DB11_REAL36) {
        this.DB11_REAL36 = DB11_REAL36;
    }

    public BigDecimal getDB11_REAL40() {
        return DB11_REAL40;
    }

    public void setDB11_REAL40(BigDecimal DB11_REAL40) {
        this.DB11_REAL40 = DB11_REAL40;
    }

    public BigDecimal getDB11_REAL44() {
        return DB11_REAL44;
    }

    public void setDB11_REAL44(BigDecimal DB11_REAL44) {
        this.DB11_REAL44 = DB11_REAL44;
    }

    public BigDecimal getDB11_REAL48() {
        return DB11_REAL48;
    }

    public void setDB11_REAL48(BigDecimal DB11_REAL48) {
        this.DB11_REAL48 = DB11_REAL48;
    }

    public BigDecimal getDB11_REAL52() {
        return DB11_REAL52;
    }

    public void setDB11_REAL52(BigDecimal DB11_REAL52) {
        this.DB11_REAL52 = DB11_REAL52;
    }

    public BigDecimal getDB11_REAL56() {
        return DB11_REAL56;
    }

    public void setDB11_REAL56(BigDecimal DB11_REAL56) {
        this.DB11_REAL56 = DB11_REAL56;
    }

    public BigDecimal getDB11_REAL60() {
        return DB11_REAL60;
    }

    public void setDB11_REAL60(BigDecimal DB11_REAL60) {
        this.DB11_REAL60 = DB11_REAL60;
    }

    public BigDecimal getDB11_REAL64() {
        return DB11_REAL64;
    }

    public void setDB11_REAL64(BigDecimal DB11_REAL64) {
        this.DB11_REAL64 = DB11_REAL64;
    }

    public BigDecimal getDB11_REAL68() {
        return DB11_REAL68;
    }

    public void setDB11_REAL68(BigDecimal DB11_REAL68) {
        this.DB11_REAL68 = DB11_REAL68;
    }

    public BigDecimal getDB11_REAL72() {
        return DB11_REAL72;
    }

    public void setDB11_REAL72(BigDecimal DB11_REAL72) {
        this.DB11_REAL72 = DB11_REAL72;
    }

    public BigDecimal getDB11_REAL76() {
        return DB11_REAL76;
    }

    public void setDB11_REAL76(BigDecimal DB11_REAL76) {
        this.DB11_REAL76 = DB11_REAL76;
    }

    public BigDecimal getDB11_REAL80() {
        return DB11_REAL80;
    }

    public void setDB11_REAL80(BigDecimal DB11_REAL80) {
        this.DB11_REAL80 = DB11_REAL80;
    }

    public BigDecimal getDB11_REAL84() {
        return DB11_REAL84;
    }

    public void setDB11_REAL84(BigDecimal DB11_REAL84) {
        this.DB11_REAL84 = DB11_REAL84;
    }

    public BigDecimal getDB11_REAL88() {
        return DB11_REAL88;
    }

    public void setDB11_REAL88(BigDecimal DB11_REAL88) {
        this.DB11_REAL88 = DB11_REAL88;
    }

    public BigDecimal getDB11_REAL92() {
        return DB11_REAL92;
    }

    public void setDB11_REAL92(BigDecimal DB11_REAL92) {
        this.DB11_REAL92 = DB11_REAL92;
    }

    public BigDecimal getDB11_REAL96() {
        return DB11_REAL96;
    }

    public void setDB11_REAL96(BigDecimal DB11_REAL96) {
        this.DB11_REAL96 = DB11_REAL96;
    }

    public String getDB11_X136_0() {
        return DB11_X136_0;
    }

    public void setDB11_X136_0(String DB11_X136_0) {
        this.DB11_X136_0 = DB11_X136_0;
    }

    public String getDB11_X136_1() {
        return DB11_X136_1;
    }

    public void setDB11_X136_1(String DB11_X136_1) {
        this.DB11_X136_1 = DB11_X136_1;
    }

    public String getDB11_X136_2() {
        return DB11_X136_2;
    }

    public void setDB11_X136_2(String DB11_X136_2) {
        this.DB11_X136_2 = DB11_X136_2;
    }

    public String getDB11_X136_3() {
        return DB11_X136_3;
    }

    public void setDB11_X136_3(String DB11_X136_3) {
        this.DB11_X136_3 = DB11_X136_3;
    }

    public String getDB11_X136_4() {
        return DB11_X136_4;
    }

    public void setDB11_X136_4(String DB11_X136_4) {
        this.DB11_X136_4 = DB11_X136_4;
    }

    public String getDB11_X136_5() {
        return DB11_X136_5;
    }

    public void setDB11_X136_5(String DB11_X136_5) {
        this.DB11_X136_5 = DB11_X136_5;
    }

    public String getDB11_X137_0() {
        return DB11_X137_0;
    }

    public void setDB11_X137_0(String DB11_X137_0) {
        this.DB11_X137_0 = DB11_X137_0;
    }

    public String getDB11_X137_1() {
        return DB11_X137_1;
    }

    public void setDB11_X137_1(String DB11_X137_1) {
        this.DB11_X137_1 = DB11_X137_1;
    }

    public String getDB11_X137_2() {
        return DB11_X137_2;
    }

    public void setDB11_X137_2(String DB11_X137_2) {
        this.DB11_X137_2 = DB11_X137_2;
    }

    public String getDB11_X137_3() {
        return DB11_X137_3;
    }

    public void setDB11_X137_3(String DB11_X137_3) {
        this.DB11_X137_3 = DB11_X137_3;
    }

    public String getDB11_X137_4() {
        return DB11_X137_4;
    }

    public void setDB11_X137_4(String DB11_X137_4) {
        this.DB11_X137_4 = DB11_X137_4;
    }

    public String getDB11_X137_5() {
        return DB11_X137_5;
    }

    public void setDB11_X137_5(String DB11_X137_5) {
        this.DB11_X137_5 = DB11_X137_5;
    }

    public String getDB11_X137_6() {
        return DB11_X137_6;
    }

    public void setDB11_X137_6(String DB11_X137_6) {
        this.DB11_X137_6 = DB11_X137_6;
    }

    public String getDB11_X138_0() {
        return DB11_X138_0;
    }

    public void setDB11_X138_0(String DB11_X138_0) {
        this.DB11_X138_0 = DB11_X138_0;
    }

    public String getDB11_X138_1() {
        return DB11_X138_1;
    }

    public void setDB11_X138_1(String DB11_X138_1) {
        this.DB11_X138_1 = DB11_X138_1;
    }

    public String getDB11_X138_2() {
        return DB11_X138_2;
    }

    public void setDB11_X138_2(String DB11_X138_2) {
        this.DB11_X138_2 = DB11_X138_2;
    }

    public String getDB11_X138_3() {
        return DB11_X138_3;
    }

    public void setDB11_X138_3(String DB11_X138_3) {
        this.DB11_X138_3 = DB11_X138_3;
    }

    public String getDB11_X138_4() {
        return DB11_X138_4;
    }

    public void setDB11_X138_4(String DB11_X138_4) {
        this.DB11_X138_4 = DB11_X138_4;
    }

    public String getDB11_X138_5() {
        return DB11_X138_5;
    }

    public void setDB11_X138_5(String DB11_X138_5) {
        this.DB11_X138_5 = DB11_X138_5;
    }

    public String getDB11_X138_6() {
        return DB11_X138_6;
    }

    public void setDB11_X138_6(String DB11_X138_6) {
        this.DB11_X138_6 = DB11_X138_6;
    }

    public String getDB11_X138_7() {
        return DB11_X138_7;
    }

    public void setDB11_X138_7(String DB11_X138_7) {
        this.DB11_X138_7 = DB11_X138_7;
    }

    public String getDB11_X139_0() {
        return DB11_X139_0;
    }

    public void setDB11_X139_0(String DB11_X139_0) {
        this.DB11_X139_0 = DB11_X139_0;
    }

    public String getDB11_X139_1() {
        return DB11_X139_1;
    }

    public void setDB11_X139_1(String DB11_X139_1) {
        this.DB11_X139_1 = DB11_X139_1;
    }

    public String getDB11_X139_2() {
        return DB11_X139_2;
    }

    public void setDB11_X139_2(String DB11_X139_2) {
        this.DB11_X139_2 = DB11_X139_2;
    }

    public String getDB11_X139_3() {
        return DB11_X139_3;
    }

    public void setDB11_X139_3(String DB11_X139_3) {
        this.DB11_X139_3 = DB11_X139_3;
    }

    public String getDB11_X139_4() {
        return DB11_X139_4;
    }

    public void setDB11_X139_4(String DB11_X139_4) {
        this.DB11_X139_4 = DB11_X139_4;
    }

    public String getDB11_X139_5() {
        return DB11_X139_5;
    }

    public void setDB11_X139_5(String DB11_X139_5) {
        this.DB11_X139_5 = DB11_X139_5;
    }

    public String getDB11_X139_6() {
        return DB11_X139_6;
    }

    public void setDB11_X139_6(String DB11_X139_6) {
        this.DB11_X139_6 = DB11_X139_6;
    }

    public String getDB11_X139_7() {
        return DB11_X139_7;
    }

    public void setDB11_X139_7(String DB11_X139_7) {
        this.DB11_X139_7 = DB11_X139_7;
    }

    public String getDB11_X140_0() {
        return DB11_X140_0;
    }

    public void setDB11_X140_0(String DB11_X140_0) {
        this.DB11_X140_0 = DB11_X140_0;
    }

    public String getDB11_X140_1() {
        return DB11_X140_1;
    }

    public void setDB11_X140_1(String DB11_X140_1) {
        this.DB11_X140_1 = DB11_X140_1;
    }

    public String getDB11_X140_2() {
        return DB11_X140_2;
    }

    public void setDB11_X140_2(String DB11_X140_2) {
        this.DB11_X140_2 = DB11_X140_2;
    }

    public String getDB11_X140_3() {
        return DB11_X140_3;
    }

    public void setDB11_X140_3(String DB11_X140_3) {
        this.DB11_X140_3 = DB11_X140_3;
    }

    public String getDB11_X140_4() {
        return DB11_X140_4;
    }

    public void setDB11_X140_4(String DB11_X140_4) {
        this.DB11_X140_4 = DB11_X140_4;
    }

    public String getDB11_X140_5() {
        return DB11_X140_5;
    }

    public void setDB11_X140_5(String DB11_X140_5) {
        this.DB11_X140_5 = DB11_X140_5;
    }

    public String getDB11_X140_6() {
        return DB11_X140_6;
    }

    public void setDB11_X140_6(String DB11_X140_6) {
        this.DB11_X140_6 = DB11_X140_6;
    }

    public String getDB11_X140_7() {
        return DB11_X140_7;
    }

    public void setDB11_X140_7(String DB11_X140_7) {
        this.DB11_X140_7 = DB11_X140_7;
    }

    public String getDB11_X141_0() {
        return DB11_X141_0;
    }

    public void setDB11_X141_0(String DB11_X141_0) {
        this.DB11_X141_0 = DB11_X141_0;
    }

    public String getDB11_X141_1() {
        return DB11_X141_1;
    }

    public void setDB11_X141_1(String DB11_X141_1) {
        this.DB11_X141_1 = DB11_X141_1;
    }

    public String getDB11_X141_4() {
        return DB11_X141_4;
    }

    public void setDB11_X141_4(String DB11_X141_4) {
        this.DB11_X141_4 = DB11_X141_4;
    }

    public String getDB11_X141_5() {
        return DB11_X141_5;
    }

    public void setDB11_X141_5(String DB11_X141_5) {
        this.DB11_X141_5 = DB11_X141_5;
    }

    public String getDB11_X141_6() {
        return DB11_X141_6;
    }

    public void setDB11_X141_6(String DB11_X141_6) {
        this.DB11_X141_6 = DB11_X141_6;
    }

    public String getDB11_X141_7() {
        return DB11_X141_7;
    }

    public void setDB11_X141_7(String DB11_X141_7) {
        this.DB11_X141_7 = DB11_X141_7;
    }

    public String getDB11_X142_0() {
        return DB11_X142_0;
    }

    public void setDB11_X142_0(String DB11_X142_0) {
        this.DB11_X142_0 = DB11_X142_0;
    }

    public String getDB11_X142_1() {
        return DB11_X142_1;
    }

    public void setDB11_X142_1(String DB11_X142_1) {
        this.DB11_X142_1 = DB11_X142_1;
    }

    public String getDB11_X142_2() {
        return DB11_X142_2;
    }

    public void setDB11_X142_2(String DB11_X142_2) {
        this.DB11_X142_2 = DB11_X142_2;
    }

    public String getDB11_X142_3() {
        return DB11_X142_3;
    }

    public void setDB11_X142_3(String DB11_X142_3) {
        this.DB11_X142_3 = DB11_X142_3;
    }

    public String getDB11_X142_4() {
        return DB11_X142_4;
    }

    public void setDB11_X142_4(String DB11_X142_4) {
        this.DB11_X142_4 = DB11_X142_4;
    }

    public String getDB11_X142_5() {
        return DB11_X142_5;
    }

    public void setDB11_X142_5(String DB11_X142_5) {
        this.DB11_X142_5 = DB11_X142_5;
    }

    public String getDB11_X142_6() {
        return DB11_X142_6;
    }

    public void setDB11_X142_6(String DB11_X142_6) {
        this.DB11_X142_6 = DB11_X142_6;
    }

    public String getDB11_X142_7() {
        return DB11_X142_7;
    }

    public void setDB11_X142_7(String DB11_X142_7) {
        this.DB11_X142_7 = DB11_X142_7;
    }

    public String getDB11_X143_0() {
        return DB11_X143_0;
    }

    public void setDB11_X143_0(String DB11_X143_0) {
        this.DB11_X143_0 = DB11_X143_0;
    }

    public String getDB11_X143_1() {
        return DB11_X143_1;
    }

    public void setDB11_X143_1(String DB11_X143_1) {
        this.DB11_X143_1 = DB11_X143_1;
    }

    public String getDB11_X143_2() {
        return DB11_X143_2;
    }

    public void setDB11_X143_2(String DB11_X143_2) {
        this.DB11_X143_2 = DB11_X143_2;
    }

    public String getDB11_X143_3() {
        return DB11_X143_3;
    }

    public void setDB11_X143_3(String DB11_X143_3) {
        this.DB11_X143_3 = DB11_X143_3;
    }

    public String getDB11_X143_4() {
        return DB11_X143_4;
    }

    public void setDB11_X143_4(String DB11_X143_4) {
        this.DB11_X143_4 = DB11_X143_4;
    }

    public String getDB11_X143_5() {
        return DB11_X143_5;
    }

    public void setDB11_X143_5(String DB11_X143_5) {
        this.DB11_X143_5 = DB11_X143_5;
    }

    public String getDB11_X143_6() {
        return DB11_X143_6;
    }

    public void setDB11_X143_6(String DB11_X143_6) {
        this.DB11_X143_6 = DB11_X143_6;
    }

    public String getDB11_X144_0() {
        return DB11_X144_0;
    }

    public void setDB11_X144_0(String DB11_X144_0) {
        this.DB11_X144_0 = DB11_X144_0;
    }

    public String getDB11_X144_1() {
        return DB11_X144_1;
    }

    public void setDB11_X144_1(String DB11_X144_1) {
        this.DB11_X144_1 = DB11_X144_1;
    }

    public String getDB11_X144_2() {
        return DB11_X144_2;
    }

    public void setDB11_X144_2(String DB11_X144_2) {
        this.DB11_X144_2 = DB11_X144_2;
    }

    public String getDB11_X144_4() {
        return DB11_X144_4;
    }

    public void setDB11_X144_4(String DB11_X144_4) {
        this.DB11_X144_4 = DB11_X144_4;
    }

    public String getDB11_X144_5() {
        return DB11_X144_5;
    }

    public void setDB11_X144_5(String DB11_X144_5) {
        this.DB11_X144_5 = DB11_X144_5;
    }

    public String getDB11_X144_6() {
        return DB11_X144_6;
    }

    public void setDB11_X144_6(String DB11_X144_6) {
        this.DB11_X144_6 = DB11_X144_6;
    }

    public String getDB11_X144_7() {
        return DB11_X144_7;
    }

    public void setDB11_X144_7(String DB11_X144_7) {
        this.DB11_X144_7 = DB11_X144_7;
    }

    public String getDB11_X145_0() {
        return DB11_X145_0;
    }

    public void setDB11_X145_0(String DB11_X145_0) {
        this.DB11_X145_0 = DB11_X145_0;
    }

    public String getDB11_X145_1() {
        return DB11_X145_1;
    }

    public void setDB11_X145_1(String DB11_X145_1) {
        this.DB11_X145_1 = DB11_X145_1;
    }

    public String getDB11_X145_2() {
        return DB11_X145_2;
    }

    public void setDB11_X145_2(String DB11_X145_2) {
        this.DB11_X145_2 = DB11_X145_2;
    }

    public String getDB11_X146_0() {
        return DB11_X146_0;
    }

    public void setDB11_X146_0(String DB11_X146_0) {
        this.DB11_X146_0 = DB11_X146_0;
    }

    public String getDB11_X146_1() {
        return DB11_X146_1;
    }

    public void setDB11_X146_1(String DB11_X146_1) {
        this.DB11_X146_1 = DB11_X146_1;
    }

    public String getDB15_CHAR48_40() {
        return DB15_CHAR48_40;
    }

    public void setDB15_CHAR48_40(String DB15_CHAR48_40) {
        this.DB15_CHAR48_40 = DB15_CHAR48_40;
    }

    public String getDB15_INT0_22() {
        return DB15_INT0_22;
    }

    public void setDB15_INT0_22(String DB15_INT0_22) {
        this.DB15_INT0_22 = DB15_INT0_22;
    }

    public BigDecimal getDB15_SINT46() {
        return DB15_SINT46;
    }

    public void setDB15_SINT46(BigDecimal DB15_SINT46) {
        this.DB15_SINT46 = DB15_SINT46;
    }

    public String getM100_0() {
        return M100_0;
    }

    public void setM100_0(String m100_0) {
        M100_0 = m100_0;
    }

    public String getM98_5() {
        return M98_5;
    }

    public void setM98_5(String m98_5) {
        M98_5 = m98_5;
    }
}
