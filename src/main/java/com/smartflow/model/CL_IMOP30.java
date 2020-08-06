package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_IMOP30")
public class CL_IMOP30 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private BigDecimal DB100_DBD12;
    private BigDecimal DB100_DBD16;
    private BigDecimal DB100_DBD2;
    private BigDecimal DB100_DBD20;
    private BigDecimal DB100_DBD24;
    private BigDecimal DB100_DBD28;
    private BigDecimal DB100_DBD308;
    private BigDecimal DB100_DBD312;
    private BigDecimal DB100_DBD316;
    private BigDecimal DB100_DBD32;
    private BigDecimal DB100_DBD320;
    private BigDecimal DB100_DBD46;
    private BigDecimal DB100_DBD6;
    private BigDecimal DB100_DBW44;
    private BigDecimal DB100_DBW584;
    private BigDecimal DB100_DBW586;
    private BigDecimal DB100_DBW588;
    private BigDecimal DB100_DBW590;
    private BigDecimal DB100_DBW592;
    private BigDecimal DB100_DBW594;
    private String DB100_DBX0_0;
    private String DB100_DBX10_0;
    private String DB100_DBX10_1;
    private String DB100_DBX324_0;
    private String DB100_DBX360_0;
    private String DB100_DBX360_1;
    private String DB100_DBX360_2;
    private String DB100_DBX50_0;
    private String DB100_DBX580_0;
    private String DB100_DBX596_0;
    private String DB100_DBX596_1;
    private String DB100_DBX596_2;
    private String DB113_DBB210;
    private BigDecimal DB31_DBD446;
    private String DB31_DBX162_6;
    private String M10_0;
    private String M150_0;
    private String M150_1;
    private String M150_2;
    private String M150_3;
    private String M150_4;
    private String M150_5;
    private String M150_6;
    private String M150_7;
    private String M151_0;
    private String M151_1;
    private String M151_2;
    private String M151_3;
    private String M151_4;
    private String M151_5;
    private String M151_6;
    private String M151_7;
    private String M152_0;
    private String M152_1;
    private String M152_2;
    private String M152_3;
    private String M152_4;
    private String M152_5;
    private String M152_6;
    private String M152_7;
    private String M153_0;
    private String M153_1;
    private String M153_2;
    private String M153_3;
    private String M153_4;
    private String M153_5;
    private String M153_6;
    private String M154_0;
    private String M154_1;
    private String M154_2;
    private String M154_3;
    private String M154_4;
    private String M154_5;
    private String M154_6;
    private String M154_7;
    private String M155_0;
    private String M155_1;
    private String M155_2;
    private String M155_3;
    private String M155_4;
    private String M156_0;
    private String M156_1;
    private String M156_2;
    private String M156_3;
    private String M156_4;
    private String M156_5;
    private String M156_6;
    private String M156_7;
    private String M157_0;
    private String M157_1;
    private String M49_1;
    private String M49_2;
    private String M9_6;
    private String M9_7;
    private String DB200_CHAR0;
    private String DB200_CHAR40;
    private String DB200_CHAR80;
    private String DB200_CHAR120;
    private String DB200_CHAR160;
    private String DB200_CHAR200;
    private String DB200_CHAR240;
    private String M100_3;

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

    public BigDecimal getDB100_DBD12() {
        return DB100_DBD12;
    }

    public void setDB100_DBD12(BigDecimal DB100_DBD12) {
        this.DB100_DBD12 = DB100_DBD12;
    }

    public BigDecimal getDB100_DBD16() {
        return DB100_DBD16;
    }

    public void setDB100_DBD16(BigDecimal DB100_DBD16) {
        this.DB100_DBD16 = DB100_DBD16;
    }

    public BigDecimal getDB100_DBD2() {
        return DB100_DBD2;
    }

    public void setDB100_DBD2(BigDecimal DB100_DBD2) {
        this.DB100_DBD2 = DB100_DBD2;
    }

    public BigDecimal getDB100_DBD20() {
        return DB100_DBD20;
    }

    public void setDB100_DBD20(BigDecimal DB100_DBD20) {
        this.DB100_DBD20 = DB100_DBD20;
    }

    public BigDecimal getDB100_DBD24() {
        return DB100_DBD24;
    }

    public void setDB100_DBD24(BigDecimal DB100_DBD24) {
        this.DB100_DBD24 = DB100_DBD24;
    }

    public BigDecimal getDB100_DBD28() {
        return DB100_DBD28;
    }

    public void setDB100_DBD28(BigDecimal DB100_DBD28) {
        this.DB100_DBD28 = DB100_DBD28;
    }

    public BigDecimal getDB100_DBD308() {
        return DB100_DBD308;
    }

    public void setDB100_DBD308(BigDecimal DB100_DBD308) {
        this.DB100_DBD308 = DB100_DBD308;
    }

    public BigDecimal getDB100_DBD312() {
        return DB100_DBD312;
    }

    public void setDB100_DBD312(BigDecimal DB100_DBD312) {
        this.DB100_DBD312 = DB100_DBD312;
    }

    public BigDecimal getDB100_DBD316() {
        return DB100_DBD316;
    }

    public void setDB100_DBD316(BigDecimal DB100_DBD316) {
        this.DB100_DBD316 = DB100_DBD316;
    }

    public BigDecimal getDB100_DBD32() {
        return DB100_DBD32;
    }

    public void setDB100_DBD32(BigDecimal DB100_DBD32) {
        this.DB100_DBD32 = DB100_DBD32;
    }

    public BigDecimal getDB100_DBD320() {
        return DB100_DBD320;
    }

    public void setDB100_DBD320(BigDecimal DB100_DBD320) {
        this.DB100_DBD320 = DB100_DBD320;
    }

    public BigDecimal getDB100_DBD46() {
        return DB100_DBD46;
    }

    public void setDB100_DBD46(BigDecimal DB100_DBD46) {
        this.DB100_DBD46 = DB100_DBD46;
    }

    public BigDecimal getDB100_DBD6() {
        return DB100_DBD6;
    }

    public void setDB100_DBD6(BigDecimal DB100_DBD6) {
        this.DB100_DBD6 = DB100_DBD6;
    }

    public BigDecimal getDB100_DBW44() {
        return DB100_DBW44;
    }

    public void setDB100_DBW44(BigDecimal DB100_DBW44) {
        this.DB100_DBW44 = DB100_DBW44;
    }

    public BigDecimal getDB100_DBW584() {
        return DB100_DBW584;
    }

    public void setDB100_DBW584(BigDecimal DB100_DBW584) {
        this.DB100_DBW584 = DB100_DBW584;
    }

    public BigDecimal getDB100_DBW586() {
        return DB100_DBW586;
    }

    public void setDB100_DBW586(BigDecimal DB100_DBW586) {
        this.DB100_DBW586 = DB100_DBW586;
    }

    public BigDecimal getDB100_DBW588() {
        return DB100_DBW588;
    }

    public void setDB100_DBW588(BigDecimal DB100_DBW588) {
        this.DB100_DBW588 = DB100_DBW588;
    }

    public BigDecimal getDB100_DBW590() {
        return DB100_DBW590;
    }

    public void setDB100_DBW590(BigDecimal DB100_DBW590) {
        this.DB100_DBW590 = DB100_DBW590;
    }

    public BigDecimal getDB100_DBW592() {
        return DB100_DBW592;
    }

    public void setDB100_DBW592(BigDecimal DB100_DBW592) {
        this.DB100_DBW592 = DB100_DBW592;
    }

    public BigDecimal getDB100_DBW594() {
        return DB100_DBW594;
    }

    public void setDB100_DBW594(BigDecimal DB100_DBW594) {
        this.DB100_DBW594 = DB100_DBW594;
    }

    public String getDB100_DBX0_0() {
        return DB100_DBX0_0;
    }

    public void setDB100_DBX0_0(String DB100_DBX0_0) {
        this.DB100_DBX0_0 = DB100_DBX0_0;
    }

    public String getDB100_DBX10_0() {
        return DB100_DBX10_0;
    }

    public void setDB100_DBX10_0(String DB100_DBX10_0) {
        this.DB100_DBX10_0 = DB100_DBX10_0;
    }

    public String getDB100_DBX10_1() {
        return DB100_DBX10_1;
    }

    public void setDB100_DBX10_1(String DB100_DBX10_1) {
        this.DB100_DBX10_1 = DB100_DBX10_1;
    }

    public String getDB100_DBX324_0() {
        return DB100_DBX324_0;
    }

    public void setDB100_DBX324_0(String DB100_DBX324_0) {
        this.DB100_DBX324_0 = DB100_DBX324_0;
    }

    public String getDB100_DBX360_0() {
        return DB100_DBX360_0;
    }

    public void setDB100_DBX360_0(String DB100_DBX360_0) {
        this.DB100_DBX360_0 = DB100_DBX360_0;
    }

    public String getDB100_DBX360_1() {
        return DB100_DBX360_1;
    }

    public void setDB100_DBX360_1(String DB100_DBX360_1) {
        this.DB100_DBX360_1 = DB100_DBX360_1;
    }

    public String getDB100_DBX360_2() {
        return DB100_DBX360_2;
    }

    public void setDB100_DBX360_2(String DB100_DBX360_2) {
        this.DB100_DBX360_2 = DB100_DBX360_2;
    }

    public String getDB100_DBX50_0() {
        return DB100_DBX50_0;
    }

    public void setDB100_DBX50_0(String DB100_DBX50_0) {
        this.DB100_DBX50_0 = DB100_DBX50_0;
    }

    public String getDB100_DBX580_0() {
        return DB100_DBX580_0;
    }

    public void setDB100_DBX580_0(String DB100_DBX580_0) {
        this.DB100_DBX580_0 = DB100_DBX580_0;
    }

    public String getDB100_DBX596_0() {
        return DB100_DBX596_0;
    }

    public void setDB100_DBX596_0(String DB100_DBX596_0) {
        this.DB100_DBX596_0 = DB100_DBX596_0;
    }

    public String getDB100_DBX596_1() {
        return DB100_DBX596_1;
    }

    public void setDB100_DBX596_1(String DB100_DBX596_1) {
        this.DB100_DBX596_1 = DB100_DBX596_1;
    }

    public String getDB100_DBX596_2() {
        return DB100_DBX596_2;
    }

    public void setDB100_DBX596_2(String DB100_DBX596_2) {
        this.DB100_DBX596_2 = DB100_DBX596_2;
    }

    public String getDB113_DBB210() {
        return DB113_DBB210;
    }

    public void setDB113_DBB210(String DB113_DBB210) {
        this.DB113_DBB210 = DB113_DBB210;
    }

    public BigDecimal getDB31_DBD446() {
        return DB31_DBD446;
    }

    public void setDB31_DBD446(BigDecimal DB31_DBD446) {
        this.DB31_DBD446 = DB31_DBD446;
    }

    public String getDB31_DBX162_6() {
        return DB31_DBX162_6;
    }

    public void setDB31_DBX162_6(String DB31_DBX162_6) {
        this.DB31_DBX162_6 = DB31_DBX162_6;
    }

    public String getM10_0() {
        return M10_0;
    }

    public void setM10_0(String m10_0) {
        M10_0 = m10_0;
    }

    public String getM150_0() {
        return M150_0;
    }

    public void setM150_0(String m150_0) {
        M150_0 = m150_0;
    }

    public String getM150_1() {
        return M150_1;
    }

    public void setM150_1(String m150_1) {
        M150_1 = m150_1;
    }

    public String getM150_2() {
        return M150_2;
    }

    public void setM150_2(String m150_2) {
        M150_2 = m150_2;
    }

    public String getM150_3() {
        return M150_3;
    }

    public void setM150_3(String m150_3) {
        M150_3 = m150_3;
    }

    public String getM150_4() {
        return M150_4;
    }

    public void setM150_4(String m150_4) {
        M150_4 = m150_4;
    }

    public String getM150_5() {
        return M150_5;
    }

    public void setM150_5(String m150_5) {
        M150_5 = m150_5;
    }

    public String getM150_6() {
        return M150_6;
    }

    public void setM150_6(String m150_6) {
        M150_6 = m150_6;
    }

    public String getM150_7() {
        return M150_7;
    }

    public void setM150_7(String m150_7) {
        M150_7 = m150_7;
    }

    public String getM151_0() {
        return M151_0;
    }

    public void setM151_0(String m151_0) {
        M151_0 = m151_0;
    }

    public String getM151_1() {
        return M151_1;
    }

    public void setM151_1(String m151_1) {
        M151_1 = m151_1;
    }

    public String getM151_2() {
        return M151_2;
    }

    public void setM151_2(String m151_2) {
        M151_2 = m151_2;
    }

    public String getM151_3() {
        return M151_3;
    }

    public void setM151_3(String m151_3) {
        M151_3 = m151_3;
    }

    public String getM151_4() {
        return M151_4;
    }

    public void setM151_4(String m151_4) {
        M151_4 = m151_4;
    }

    public String getM151_5() {
        return M151_5;
    }

    public void setM151_5(String m151_5) {
        M151_5 = m151_5;
    }

    public String getM151_6() {
        return M151_6;
    }

    public void setM151_6(String m151_6) {
        M151_6 = m151_6;
    }

    public String getM151_7() {
        return M151_7;
    }

    public void setM151_7(String m151_7) {
        M151_7 = m151_7;
    }

    public String getM152_0() {
        return M152_0;
    }

    public void setM152_0(String m152_0) {
        M152_0 = m152_0;
    }

    public String getM152_1() {
        return M152_1;
    }

    public void setM152_1(String m152_1) {
        M152_1 = m152_1;
    }

    public String getM152_2() {
        return M152_2;
    }

    public void setM152_2(String m152_2) {
        M152_2 = m152_2;
    }

    public String getM152_3() {
        return M152_3;
    }

    public void setM152_3(String m152_3) {
        M152_3 = m152_3;
    }

    public String getM152_4() {
        return M152_4;
    }

    public void setM152_4(String m152_4) {
        M152_4 = m152_4;
    }

    public String getM152_5() {
        return M152_5;
    }

    public void setM152_5(String m152_5) {
        M152_5 = m152_5;
    }

    public String getM152_6() {
        return M152_6;
    }

    public void setM152_6(String m152_6) {
        M152_6 = m152_6;
    }

    public String getM152_7() {
        return M152_7;
    }

    public void setM152_7(String m152_7) {
        M152_7 = m152_7;
    }

    public String getM153_0() {
        return M153_0;
    }

    public void setM153_0(String m153_0) {
        M153_0 = m153_0;
    }

    public String getM153_1() {
        return M153_1;
    }

    public void setM153_1(String m153_1) {
        M153_1 = m153_1;
    }

    public String getM153_2() {
        return M153_2;
    }

    public void setM153_2(String m153_2) {
        M153_2 = m153_2;
    }

    public String getM153_3() {
        return M153_3;
    }

    public void setM153_3(String m153_3) {
        M153_3 = m153_3;
    }

    public String getM153_4() {
        return M153_4;
    }

    public void setM153_4(String m153_4) {
        M153_4 = m153_4;
    }

    public String getM153_5() {
        return M153_5;
    }

    public void setM153_5(String m153_5) {
        M153_5 = m153_5;
    }

    public String getM153_6() {
        return M153_6;
    }

    public void setM153_6(String m153_6) {
        M153_6 = m153_6;
    }

    public String getM154_0() {
        return M154_0;
    }

    public void setM154_0(String m154_0) {
        M154_0 = m154_0;
    }

    public String getM154_1() {
        return M154_1;
    }

    public void setM154_1(String m154_1) {
        M154_1 = m154_1;
    }

    public String getM154_2() {
        return M154_2;
    }

    public void setM154_2(String m154_2) {
        M154_2 = m154_2;
    }

    public String getM154_3() {
        return M154_3;
    }

    public void setM154_3(String m154_3) {
        M154_3 = m154_3;
    }

    public String getM154_4() {
        return M154_4;
    }

    public void setM154_4(String m154_4) {
        M154_4 = m154_4;
    }

    public String getM154_5() {
        return M154_5;
    }

    public void setM154_5(String m154_5) {
        M154_5 = m154_5;
    }

    public String getM154_6() {
        return M154_6;
    }

    public void setM154_6(String m154_6) {
        M154_6 = m154_6;
    }

    public String getM154_7() {
        return M154_7;
    }

    public void setM154_7(String m154_7) {
        M154_7 = m154_7;
    }

    public String getM155_0() {
        return M155_0;
    }

    public void setM155_0(String m155_0) {
        M155_0 = m155_0;
    }

    public String getM155_1() {
        return M155_1;
    }

    public void setM155_1(String m155_1) {
        M155_1 = m155_1;
    }

    public String getM155_2() {
        return M155_2;
    }

    public void setM155_2(String m155_2) {
        M155_2 = m155_2;
    }

    public String getM155_3() {
        return M155_3;
    }

    public void setM155_3(String m155_3) {
        M155_3 = m155_3;
    }

    public String getM155_4() {
        return M155_4;
    }

    public void setM155_4(String m155_4) {
        M155_4 = m155_4;
    }

    public String getM156_0() {
        return M156_0;
    }

    public void setM156_0(String m156_0) {
        M156_0 = m156_0;
    }

    public String getM156_1() {
        return M156_1;
    }

    public void setM156_1(String m156_1) {
        M156_1 = m156_1;
    }

    public String getM156_2() {
        return M156_2;
    }

    public void setM156_2(String m156_2) {
        M156_2 = m156_2;
    }

    public String getM156_3() {
        return M156_3;
    }

    public void setM156_3(String m156_3) {
        M156_3 = m156_3;
    }

    public String getM156_4() {
        return M156_4;
    }

    public void setM156_4(String m156_4) {
        M156_4 = m156_4;
    }

    public String getM156_5() {
        return M156_5;
    }

    public void setM156_5(String m156_5) {
        M156_5 = m156_5;
    }

    public String getM156_6() {
        return M156_6;
    }

    public void setM156_6(String m156_6) {
        M156_6 = m156_6;
    }

    public String getM156_7() {
        return M156_7;
    }

    public void setM156_7(String m156_7) {
        M156_7 = m156_7;
    }

    public String getM157_0() {
        return M157_0;
    }

    public void setM157_0(String m157_0) {
        M157_0 = m157_0;
    }

    public String getM157_1() {
        return M157_1;
    }

    public void setM157_1(String m157_1) {
        M157_1 = m157_1;
    }

    public String getM49_1() {
        return M49_1;
    }

    public void setM49_1(String m49_1) {
        M49_1 = m49_1;
    }

    public String getM49_2() {
        return M49_2;
    }

    public void setM49_2(String m49_2) {
        M49_2 = m49_2;
    }

    public String getM9_6() {
        return M9_6;
    }

    public void setM9_6(String m9_6) {
        M9_6 = m9_6;
    }

    public String getM9_7() {
        return M9_7;
    }

    public void setM9_7(String m9_7) {
        M9_7 = m9_7;
    }

    public String getDB200_CHAR0() {
        return DB200_CHAR0;
    }

    public void setDB200_CHAR0(String DB200_CHAR0) {
        this.DB200_CHAR0 = DB200_CHAR0;
    }

    public String getDB200_CHAR40() {
        return DB200_CHAR40;
    }

    public void setDB200_CHAR40(String DB200_CHAR40) {
        this.DB200_CHAR40 = DB200_CHAR40;
    }

    public String getDB200_CHAR80() {
        return DB200_CHAR80;
    }

    public void setDB200_CHAR80(String DB200_CHAR80) {
        this.DB200_CHAR80 = DB200_CHAR80;
    }

    public String getDB200_CHAR120() {
        return DB200_CHAR120;
    }

    public void setDB200_CHAR120(String DB200_CHAR120) {
        this.DB200_CHAR120 = DB200_CHAR120;
    }

    public String getDB200_CHAR160() {
        return DB200_CHAR160;
    }

    public void setDB200_CHAR160(String DB200_CHAR160) {
        this.DB200_CHAR160 = DB200_CHAR160;
    }

    public String getDB200_CHAR200() {
        return DB200_CHAR200;
    }

    public void setDB200_CHAR200(String DB200_CHAR200) {
        this.DB200_CHAR200 = DB200_CHAR200;
    }

    public String getDB200_CHAR240() {
        return DB200_CHAR240;
    }

    public void setDB200_CHAR240(String DB200_CHAR240) {
        this.DB200_CHAR240 = DB200_CHAR240;
    }

    public String getM100_3() {
        return M100_3;
    }

    public void setM100_3(String m100_3) {
        M100_3 = m100_3;
    }
}
