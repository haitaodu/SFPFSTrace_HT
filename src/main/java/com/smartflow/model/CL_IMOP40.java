package com.smartflow.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="core.CL_IMOP40")
public class CL_IMOP40 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private BigDecimal DB2_DBD40;
    private BigDecimal DB2_DBD44;
    private BigDecimal DB2_DBD48;
    private BigDecimal DB2_DBW0;
    private BigDecimal DB2_DBW12;
    private BigDecimal DB2_DBW16;
    private BigDecimal DB2_DBW2;
    private BigDecimal DB2_DBW20;
    private String DB2_DBW32_0;
    private String DB2_DBW32_1;
    private String DB2_DBW32_2;
    private String DB2_DBW32_3;
    private String DB2_DBW32_4;
    private String DB2_DBW32_5;
    private String DB2_DBW32_6;
    private String DB2_DBW32_7;
    private String DB2_DBW33_0;
    private String DB2_DBW33_1;
    private String DB2_DBW33_2;
    private String DB2_DBW33_3;
    private String DB2_DBW33_4;
    private String DB2_DBW33_5;
    private String DB2_DBW33_6;
    private String DB2_DBW33_7;
    private String DB2_DBW34_0;
    private String DB2_DBW34_1;
    private String DB2_DBW34_2;
    private String DB2_DBW34_3;
    private String DB2_DBW34_4;
    private String DB2_DBW34_5;
    private String DB2_DBW34_6;
    private String DB2_DBW34_7;
    private String DB2_DBW35_0;
    private String DB2_DBW35_1;
    private String DB2_DBW35_2;
    private String DB2_DBW35_3;
    private String DB2_DBW35_4;
    private String DB2_DBW35_5;
    private String DB2_DBW35_6;
    private String DB2_DBW35_7;
    private String DB2_DBW36_0;
    private String DB2_DBW36_1;
    private String DB2_DBW36_2;
    private String DB2_DBW36_3;
    private String DB2_DBW36_4;
    private String DB2_DBW36_5;
    private String DB2_DBW36_6;
    private String DB2_DBW36_7;
    private String DB2_DBW37_0;
    private String DB2_DBW37_1;
    private String DB2_DBW37_2;
    private String DB2_DBW37_3;
    private String DB2_DBW37_4;
    private String DB2_DBW37_5;
    private String DB2_DBW37_6;
    private String DB2_DBW37_7;
    private String DB2_DBW38_0;
    private String DB2_DBW38_1;
    private String DB2_DBW38_2;
    private String DB2_DBW38_3;
    private String DB2_DBW38_4;
    private String DB2_DBW38_5;
    private String DB2_DBW38_6;
    private BigDecimal DB2_DBW4;
    private BigDecimal DB2_DBW52;
    private BigDecimal DB2_DBW54;
    private BigDecimal DB2_DBW56;
    private BigDecimal DB2_DBW58;
    private BigDecimal DB2_DBW6;
    private BigDecimal DB2_DBW60;
    private BigDecimal DB2_DBW62;
    private BigDecimal DB2_DBW8;

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

    public BigDecimal getDB2_DBD40() {
        return DB2_DBD40;
    }

    public void setDB2_DBD40(BigDecimal DB2_DBD40) {
        this.DB2_DBD40 = DB2_DBD40;
    }

    public BigDecimal getDB2_DBD44() {
        return DB2_DBD44;
    }

    public void setDB2_DBD44(BigDecimal DB2_DBD44) {
        this.DB2_DBD44 = DB2_DBD44;
    }

    public BigDecimal getDB2_DBD48() {
        return DB2_DBD48;
    }

    public void setDB2_DBD48(BigDecimal DB2_DBD48) {
        this.DB2_DBD48 = DB2_DBD48;
    }

    public BigDecimal getDB2_DBW0() {
        return DB2_DBW0;
    }

    public void setDB2_DBW0(BigDecimal DB2_DBW0) {
        this.DB2_DBW0 = DB2_DBW0;
    }

    public BigDecimal getDB2_DBW12() {
        return DB2_DBW12;
    }

    public void setDB2_DBW12(BigDecimal DB2_DBW12) {
        this.DB2_DBW12 = DB2_DBW12;
    }

    public BigDecimal getDB2_DBW16() {
        return DB2_DBW16;
    }

    public void setDB2_DBW16(BigDecimal DB2_DBW16) {
        this.DB2_DBW16 = DB2_DBW16;
    }

    public BigDecimal getDB2_DBW2() {
        return DB2_DBW2;
    }

    public void setDB2_DBW2(BigDecimal DB2_DBW2) {
        this.DB2_DBW2 = DB2_DBW2;
    }

    public BigDecimal getDB2_DBW20() {
        return DB2_DBW20;
    }

    public void setDB2_DBW20(BigDecimal DB2_DBW20) {
        this.DB2_DBW20 = DB2_DBW20;
    }

    public String getDB2_DBW32_0() {
        return DB2_DBW32_0;
    }

    public void setDB2_DBW32_0(String DB2_DBW32_0) {
        this.DB2_DBW32_0 = DB2_DBW32_0;
    }

    public String getDB2_DBW32_1() {
        return DB2_DBW32_1;
    }

    public void setDB2_DBW32_1(String DB2_DBW32_1) {
        this.DB2_DBW32_1 = DB2_DBW32_1;
    }

    public String getDB2_DBW32_2() {
        return DB2_DBW32_2;
    }

    public void setDB2_DBW32_2(String DB2_DBW32_2) {
        this.DB2_DBW32_2 = DB2_DBW32_2;
    }

    public String getDB2_DBW32_3() {
        return DB2_DBW32_3;
    }

    public void setDB2_DBW32_3(String DB2_DBW32_3) {
        this.DB2_DBW32_3 = DB2_DBW32_3;
    }

    public String getDB2_DBW32_4() {
        return DB2_DBW32_4;
    }

    public void setDB2_DBW32_4(String DB2_DBW32_4) {
        this.DB2_DBW32_4 = DB2_DBW32_4;
    }

    public String getDB2_DBW32_5() {
        return DB2_DBW32_5;
    }

    public void setDB2_DBW32_5(String DB2_DBW32_5) {
        this.DB2_DBW32_5 = DB2_DBW32_5;
    }

    public String getDB2_DBW32_6() {
        return DB2_DBW32_6;
    }

    public void setDB2_DBW32_6(String DB2_DBW32_6) {
        this.DB2_DBW32_6 = DB2_DBW32_6;
    }

    public String getDB2_DBW32_7() {
        return DB2_DBW32_7;
    }

    public void setDB2_DBW32_7(String DB2_DBW32_7) {
        this.DB2_DBW32_7 = DB2_DBW32_7;
    }

    public String getDB2_DBW33_0() {
        return DB2_DBW33_0;
    }

    public void setDB2_DBW33_0(String DB2_DBW33_0) {
        this.DB2_DBW33_0 = DB2_DBW33_0;
    }

    public String getDB2_DBW33_1() {
        return DB2_DBW33_1;
    }

    public void setDB2_DBW33_1(String DB2_DBW33_1) {
        this.DB2_DBW33_1 = DB2_DBW33_1;
    }

    public String getDB2_DBW33_2() {
        return DB2_DBW33_2;
    }

    public void setDB2_DBW33_2(String DB2_DBW33_2) {
        this.DB2_DBW33_2 = DB2_DBW33_2;
    }

    public String getDB2_DBW33_3() {
        return DB2_DBW33_3;
    }

    public void setDB2_DBW33_3(String DB2_DBW33_3) {
        this.DB2_DBW33_3 = DB2_DBW33_3;
    }

    public String getDB2_DBW33_4() {
        return DB2_DBW33_4;
    }

    public void setDB2_DBW33_4(String DB2_DBW33_4) {
        this.DB2_DBW33_4 = DB2_DBW33_4;
    }

    public String getDB2_DBW33_5() {
        return DB2_DBW33_5;
    }

    public void setDB2_DBW33_5(String DB2_DBW33_5) {
        this.DB2_DBW33_5 = DB2_DBW33_5;
    }

    public String getDB2_DBW33_6() {
        return DB2_DBW33_6;
    }

    public void setDB2_DBW33_6(String DB2_DBW33_6) {
        this.DB2_DBW33_6 = DB2_DBW33_6;
    }

    public String getDB2_DBW33_7() {
        return DB2_DBW33_7;
    }

    public void setDB2_DBW33_7(String DB2_DBW33_7) {
        this.DB2_DBW33_7 = DB2_DBW33_7;
    }

    public String getDB2_DBW34_0() {
        return DB2_DBW34_0;
    }

    public void setDB2_DBW34_0(String DB2_DBW34_0) {
        this.DB2_DBW34_0 = DB2_DBW34_0;
    }

    public String getDB2_DBW34_1() {
        return DB2_DBW34_1;
    }

    public void setDB2_DBW34_1(String DB2_DBW34_1) {
        this.DB2_DBW34_1 = DB2_DBW34_1;
    }

    public String getDB2_DBW34_2() {
        return DB2_DBW34_2;
    }

    public void setDB2_DBW34_2(String DB2_DBW34_2) {
        this.DB2_DBW34_2 = DB2_DBW34_2;
    }

    public String getDB2_DBW34_3() {
        return DB2_DBW34_3;
    }

    public void setDB2_DBW34_3(String DB2_DBW34_3) {
        this.DB2_DBW34_3 = DB2_DBW34_3;
    }

    public String getDB2_DBW34_4() {
        return DB2_DBW34_4;
    }

    public void setDB2_DBW34_4(String DB2_DBW34_4) {
        this.DB2_DBW34_4 = DB2_DBW34_4;
    }

    public String getDB2_DBW34_5() {
        return DB2_DBW34_5;
    }

    public void setDB2_DBW34_5(String DB2_DBW34_5) {
        this.DB2_DBW34_5 = DB2_DBW34_5;
    }

    public String getDB2_DBW34_6() {
        return DB2_DBW34_6;
    }

    public void setDB2_DBW34_6(String DB2_DBW34_6) {
        this.DB2_DBW34_6 = DB2_DBW34_6;
    }

    public String getDB2_DBW34_7() {
        return DB2_DBW34_7;
    }

    public void setDB2_DBW34_7(String DB2_DBW34_7) {
        this.DB2_DBW34_7 = DB2_DBW34_7;
    }

    public String getDB2_DBW35_0() {
        return DB2_DBW35_0;
    }

    public void setDB2_DBW35_0(String DB2_DBW35_0) {
        this.DB2_DBW35_0 = DB2_DBW35_0;
    }

    public String getDB2_DBW35_1() {
        return DB2_DBW35_1;
    }

    public void setDB2_DBW35_1(String DB2_DBW35_1) {
        this.DB2_DBW35_1 = DB2_DBW35_1;
    }

    public String getDB2_DBW35_2() {
        return DB2_DBW35_2;
    }

    public void setDB2_DBW35_2(String DB2_DBW35_2) {
        this.DB2_DBW35_2 = DB2_DBW35_2;
    }

    public String getDB2_DBW35_3() {
        return DB2_DBW35_3;
    }

    public void setDB2_DBW35_3(String DB2_DBW35_3) {
        this.DB2_DBW35_3 = DB2_DBW35_3;
    }

    public String getDB2_DBW35_4() {
        return DB2_DBW35_4;
    }

    public void setDB2_DBW35_4(String DB2_DBW35_4) {
        this.DB2_DBW35_4 = DB2_DBW35_4;
    }

    public String getDB2_DBW35_5() {
        return DB2_DBW35_5;
    }

    public void setDB2_DBW35_5(String DB2_DBW35_5) {
        this.DB2_DBW35_5 = DB2_DBW35_5;
    }

    public String getDB2_DBW35_6() {
        return DB2_DBW35_6;
    }

    public void setDB2_DBW35_6(String DB2_DBW35_6) {
        this.DB2_DBW35_6 = DB2_DBW35_6;
    }

    public String getDB2_DBW35_7() {
        return DB2_DBW35_7;
    }

    public void setDB2_DBW35_7(String DB2_DBW35_7) {
        this.DB2_DBW35_7 = DB2_DBW35_7;
    }

    public String getDB2_DBW36_0() {
        return DB2_DBW36_0;
    }

    public void setDB2_DBW36_0(String DB2_DBW36_0) {
        this.DB2_DBW36_0 = DB2_DBW36_0;
    }

    public String getDB2_DBW36_1() {
        return DB2_DBW36_1;
    }

    public void setDB2_DBW36_1(String DB2_DBW36_1) {
        this.DB2_DBW36_1 = DB2_DBW36_1;
    }

    public String getDB2_DBW36_2() {
        return DB2_DBW36_2;
    }

    public void setDB2_DBW36_2(String DB2_DBW36_2) {
        this.DB2_DBW36_2 = DB2_DBW36_2;
    }

    public String getDB2_DBW36_3() {
        return DB2_DBW36_3;
    }

    public void setDB2_DBW36_3(String DB2_DBW36_3) {
        this.DB2_DBW36_3 = DB2_DBW36_3;
    }

    public String getDB2_DBW36_4() {
        return DB2_DBW36_4;
    }

    public void setDB2_DBW36_4(String DB2_DBW36_4) {
        this.DB2_DBW36_4 = DB2_DBW36_4;
    }

    public String getDB2_DBW36_5() {
        return DB2_DBW36_5;
    }

    public void setDB2_DBW36_5(String DB2_DBW36_5) {
        this.DB2_DBW36_5 = DB2_DBW36_5;
    }

    public String getDB2_DBW36_6() {
        return DB2_DBW36_6;
    }

    public void setDB2_DBW36_6(String DB2_DBW36_6) {
        this.DB2_DBW36_6 = DB2_DBW36_6;
    }

    public String getDB2_DBW36_7() {
        return DB2_DBW36_7;
    }

    public void setDB2_DBW36_7(String DB2_DBW36_7) {
        this.DB2_DBW36_7 = DB2_DBW36_7;
    }

    public String getDB2_DBW37_0() {
        return DB2_DBW37_0;
    }

    public void setDB2_DBW37_0(String DB2_DBW37_0) {
        this.DB2_DBW37_0 = DB2_DBW37_0;
    }

    public String getDB2_DBW37_1() {
        return DB2_DBW37_1;
    }

    public void setDB2_DBW37_1(String DB2_DBW37_1) {
        this.DB2_DBW37_1 = DB2_DBW37_1;
    }

    public String getDB2_DBW37_2() {
        return DB2_DBW37_2;
    }

    public void setDB2_DBW37_2(String DB2_DBW37_2) {
        this.DB2_DBW37_2 = DB2_DBW37_2;
    }

    public String getDB2_DBW37_3() {
        return DB2_DBW37_3;
    }

    public void setDB2_DBW37_3(String DB2_DBW37_3) {
        this.DB2_DBW37_3 = DB2_DBW37_3;
    }

    public String getDB2_DBW37_4() {
        return DB2_DBW37_4;
    }

    public void setDB2_DBW37_4(String DB2_DBW37_4) {
        this.DB2_DBW37_4 = DB2_DBW37_4;
    }

    public String getDB2_DBW37_5() {
        return DB2_DBW37_5;
    }

    public void setDB2_DBW37_5(String DB2_DBW37_5) {
        this.DB2_DBW37_5 = DB2_DBW37_5;
    }

    public String getDB2_DBW37_6() {
        return DB2_DBW37_6;
    }

    public void setDB2_DBW37_6(String DB2_DBW37_6) {
        this.DB2_DBW37_6 = DB2_DBW37_6;
    }

    public String getDB2_DBW37_7() {
        return DB2_DBW37_7;
    }

    public void setDB2_DBW37_7(String DB2_DBW37_7) {
        this.DB2_DBW37_7 = DB2_DBW37_7;
    }

    public String getDB2_DBW38_0() {
        return DB2_DBW38_0;
    }

    public void setDB2_DBW38_0(String DB2_DBW38_0) {
        this.DB2_DBW38_0 = DB2_DBW38_0;
    }

    public String getDB2_DBW38_1() {
        return DB2_DBW38_1;
    }

    public void setDB2_DBW38_1(String DB2_DBW38_1) {
        this.DB2_DBW38_1 = DB2_DBW38_1;
    }

    public String getDB2_DBW38_2() {
        return DB2_DBW38_2;
    }

    public void setDB2_DBW38_2(String DB2_DBW38_2) {
        this.DB2_DBW38_2 = DB2_DBW38_2;
    }

    public String getDB2_DBW38_3() {
        return DB2_DBW38_3;
    }

    public void setDB2_DBW38_3(String DB2_DBW38_3) {
        this.DB2_DBW38_3 = DB2_DBW38_3;
    }

    public String getDB2_DBW38_4() {
        return DB2_DBW38_4;
    }

    public void setDB2_DBW38_4(String DB2_DBW38_4) {
        this.DB2_DBW38_4 = DB2_DBW38_4;
    }

    public String getDB2_DBW38_5() {
        return DB2_DBW38_5;
    }

    public void setDB2_DBW38_5(String DB2_DBW38_5) {
        this.DB2_DBW38_5 = DB2_DBW38_5;
    }

    public String getDB2_DBW38_6() {
        return DB2_DBW38_6;
    }

    public void setDB2_DBW38_6(String DB2_DBW38_6) {
        this.DB2_DBW38_6 = DB2_DBW38_6;
    }

    public BigDecimal getDB2_DBW4() {
        return DB2_DBW4;
    }

    public void setDB2_DBW4(BigDecimal DB2_DBW4) {
        this.DB2_DBW4 = DB2_DBW4;
    }

    public BigDecimal getDB2_DBW52() {
        return DB2_DBW52;
    }

    public void setDB2_DBW52(BigDecimal DB2_DBW52) {
        this.DB2_DBW52 = DB2_DBW52;
    }

    public BigDecimal getDB2_DBW54() {
        return DB2_DBW54;
    }

    public void setDB2_DBW54(BigDecimal DB2_DBW54) {
        this.DB2_DBW54 = DB2_DBW54;
    }

    public BigDecimal getDB2_DBW56() {
        return DB2_DBW56;
    }

    public void setDB2_DBW56(BigDecimal DB2_DBW56) {
        this.DB2_DBW56 = DB2_DBW56;
    }

    public BigDecimal getDB2_DBW58() {
        return DB2_DBW58;
    }

    public void setDB2_DBW58(BigDecimal DB2_DBW58) {
        this.DB2_DBW58 = DB2_DBW58;
    }

    public BigDecimal getDB2_DBW6() {
        return DB2_DBW6;
    }

    public void setDB2_DBW6(BigDecimal DB2_DBW6) {
        this.DB2_DBW6 = DB2_DBW6;
    }

    public BigDecimal getDB2_DBW60() {
        return DB2_DBW60;
    }

    public void setDB2_DBW60(BigDecimal DB2_DBW60) {
        this.DB2_DBW60 = DB2_DBW60;
    }

    public BigDecimal getDB2_DBW62() {
        return DB2_DBW62;
    }

    public void setDB2_DBW62(BigDecimal DB2_DBW62) {
        this.DB2_DBW62 = DB2_DBW62;
    }

    public BigDecimal getDB2_DBW8() {
        return DB2_DBW8;
    }

    public void setDB2_DBW8(BigDecimal DB2_DBW8) {
        this.DB2_DBW8 = DB2_DBW8;
    }
}
