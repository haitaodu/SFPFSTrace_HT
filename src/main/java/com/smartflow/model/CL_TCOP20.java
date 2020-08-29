package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_TCOP20")
public class CL_TCOP20 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String DB37_DBX0_0;
    private String DB37_DBX1_0;
    private String DB37_DBX1_1;
    private String DB37_DBX1_2;
    private String DB37_DBX2_0;
    private String DB37_DBX3_0;
    private String DB37_DBX3_1;
    private String DB37_DBX3_2;
    private String DB400_DBD1098;
    private BigDecimal DB400_DBD118;
    private String DB400_DBD1198;
    private BigDecimal DB400_DBD198;
    private BigDecimal DB400_DBD202;
    private String DB400_DBD398;
    private String DB400_DBD500;
    private BigDecimal DB400_DBD542;
    private BigDecimal DB400_DBD546;
    private BigDecimal DB400_DBD58;
    private BigDecimal DB400_DBD604;
    private BigDecimal DB400_DBD608;
    private BigDecimal DB400_DBD622;
    private BigDecimal DB400_DBD626;
    private BigDecimal DB400_DBD630;
    private BigDecimal DB400_DBD634;
    private BigDecimal DB400_DBD638;
    private BigDecimal DB400_DBD642;
    private BigDecimal DB400_DBD646;
    private BigDecimal DB400_DBD730;
    private String DB400_DBD736;
    private String DB400_DBD798;
    private String DB400_DBD838;
    private BigDecimal DB400_DBD86;
    private String DB400_DBD878;
    private String DB400_DBD919;
    private BigDecimal DB400_DBW0;
    private BigDecimal DB400_DBW1000;
    private BigDecimal DB400_DBW1008;
    private BigDecimal DB400_DBW1010;
    private BigDecimal DB400_DBW1018;
    private BigDecimal DB400_DBW1020;
    private BigDecimal DB400_DBW1028;
    private BigDecimal DB400_DBW1030;
    private BigDecimal DB400_DBW122;
    private BigDecimal DB400_DBW278;
    private BigDecimal DB400_DBW280;
    private BigDecimal DB400_DBW282;
    private BigDecimal DB400_DBW284;
    private BigDecimal DB400_DBW286;
    private BigDecimal DB400_DBW288;
    private BigDecimal DB400_DBW290;
    private BigDecimal DB400_DBW292;
    private BigDecimal DB400_DBW450;
    private BigDecimal DB400_DBW498;
    private BigDecimal DB400_DBW540;
    private BigDecimal DB400_DBW550;
    private BigDecimal DB400_DBW552;
    private BigDecimal DB400_DBW554;
    private BigDecimal DB400_DBW556;
    private BigDecimal DB400_DBW558;
    private BigDecimal DB400_DBW598;
    private BigDecimal DB400_DBW6;
    private BigDecimal DB400_DBW600;
    private BigDecimal DB400_DBW602;
    private BigDecimal DB400_DBW608;
    private BigDecimal DB400_DBW612;
    private BigDecimal DB400_DBW614;
    private BigDecimal DB400_DBW618;
    private BigDecimal DB400_DBW62;
    private BigDecimal DB400_DBW620;
    private BigDecimal DB400_DBW64;
    private BigDecimal DB400_DBW650;
    private BigDecimal DB400_DBW652;
    private BigDecimal DB400_DBW658;
    private BigDecimal DB400_DBW66;
    private BigDecimal DB400_DBW660;
    private BigDecimal DB400_DBW662;
    private BigDecimal DB400_DBW664;
    private BigDecimal DB400_DBW666;
    private BigDecimal DB400_DBW668;
    private BigDecimal DB400_DBW670;
    private BigDecimal DB400_DBW672;
    private BigDecimal DB400_DBW674;
    private BigDecimal DB400_DBW676;
    private BigDecimal DB400_DBW678;
    private BigDecimal DB400_DBW68;
    private BigDecimal DB400_DBW680;
    private BigDecimal DB400_DBW70;
    private BigDecimal DB400_DBW718;
    private BigDecimal DB400_DBW72;
    private BigDecimal DB400_DBW720;
    private BigDecimal DB400_DBW734;
    private BigDecimal DB400_DBW74;
    private BigDecimal DB400_DBW76;
    private BigDecimal DB400_DBW776;
    private BigDecimal DB400_DBW78;
    private BigDecimal DB400_DBW798;
    private BigDecimal DB400_DBW80;
    private BigDecimal DB400_DBW800;
    private BigDecimal DB400_DBW808;
    private BigDecimal DB400_DBW810;
    private BigDecimal DB400_DBW818;
    private BigDecimal DB400_DBW82;
    private BigDecimal DB400_DBW820;
    private BigDecimal DB400_DBW828;
    private BigDecimal DB400_DBW830;
    private BigDecimal DB400_DBW838;
    private BigDecimal DB400_DBW84;
    private BigDecimal DB400_DBW840;
    private BigDecimal DB400_DBW848;
    private BigDecimal DB400_DBW850;
    private BigDecimal DB400_DBW858;
    private BigDecimal DB400_DBW860;
    private BigDecimal DB400_DBW868;
    private BigDecimal DB400_DBW870;
    private BigDecimal DB400_DBW879;
    private BigDecimal DB400_DBW880;
    private BigDecimal DB400_DBW888;
    private BigDecimal DB400_DBW890;
    private BigDecimal DB400_DBW898;
    private BigDecimal DB400_DBW900;
    private BigDecimal DB400_DBW908;
    private BigDecimal DB400_DBW910;
    private BigDecimal DB400_DBW918;
    private BigDecimal DB400_DBW920;
    private BigDecimal DB400_DBW928;
    private BigDecimal DB400_DBW930;
    private BigDecimal DB400_DBW938;
    private BigDecimal DB400_DBW940;
    private BigDecimal DB400_DBW949;
    private BigDecimal DB400_DBW950;
    private BigDecimal DB400_DBW998;
    private String DB400_DBX16_0;
    private String DB400_DBX16_1;
    private String DB400_DBX18_0;
    private String DB400_DBX18_1;
    private String DB400_DBX18_2;
    private String DB400_DBX18_3;
    private String DB400_DBX18_4;
    private String DB400_DBX18_5;
    private String DB400_DBX18_6;
    private String DB400_DBX18_7;
    private String DB400_DBX20_0;
    private String DB400_DBX20_1;
    private String DB400_DBX20_2;
    private String DB400_DBX338_0;
    private String DB400_DBX338_1;
    private String DB400_DBX338_2;
    private String DB400_DBX338_3;
    private String DB400_DBX338_4;
    private String DB400_DBX338_5;
    private String DB400_DBX340_2;
    private String DB400_DBX340_3;
    private String DB400_DBX340_4;
    private String DB400_DBX340_5;
    private String DB400_DBX340_6;
    private String DB400_DBX340_7;
    private String DB400_DBX341_0;
    private String DB400_DBX341_1;
    private String DB400_DBX341_2;
    private String DB400_DBX341_3;
    private String DB400_DBX341_4;
    private String DB400_DBX341_5;
    private String DB400_DBX342_2;
    private String DB400_DBX342_3;
    private String DB400_DBX342_4;
    private String DB400_DBX342_5;
    private String DB400_DBX358_0;
    private String DB400_DBX358_1;
    private String DB400_DBX358_2;
    private String DB400_DBX358_3;
    private String DB400_DBX358_4;
    private String DB400_DBX358_5;
    private String DB400_DBX358_6;
    private String DB400_DBX358_7;
    private String DB400_DBX359_0;
    private String DB400_DBX359_1;
    private String DB400_DBX359_2;
    private String DB400_DBX359_3;
    private String DB400_DBX359_5;
    private String DB400_DBX359_6;
    private String DB400_DBX359_7;
    private String DB400_DBX360_0;
    private String DB400_DBX360_1;
    private String DB400_DBX360_2;
    private String DB400_DBX360_3;
    private String DB400_DBX360_4;
    private String DB400_DBX360_5;
    private String DB400_DBX360_6;
    private String DB400_DBX360_7;
    private String DB400_DBX361_0;
    private String DB400_DBX361_1;
    private String DB400_DBX361_2;
    private String DB400_DBX361_3;
    private String DB400_DBX361_4;
    private String DB400_DBX361_5;
    private String DB400_DBX361_6;
    private String DB400_DBX361_7;
    private String DB400_DBX362_0;
    private String DB400_DBX362_1;
    private String DB400_DBX362_2;
    private String DB400_DBX362_3;
    private String DB400_DBX362_4;
    private String DB400_DBX362_5;
    private String DB400_DBX362_6;
    private String DB400_DBX362_7;
    private String DB400_DBX363_0;
    private String DB400_DBX363_1;
    private String DB400_DBX363_2;
    private String DB400_DBX363_3;
    private String DB400_DBX363_4;
    private String DB400_DBX363_5;
    private String DB400_DBX363_6;
    private String DB400_DBX363_7;
    private String DB400_DBX364_0;
    private String DB400_DBX364_1;
    private String DB400_DBX364_2;
    private String DB400_DBX364_3;
    private String DB400_DBX364_4;
    private String DB400_DBX364_5;
    private String DB400_DBX364_6;
    private String DB400_DBX364_7;
    private String DB400_DBX365_0;
    private String DB400_DBX365_1;
    private String DB400_DBX365_2;
    private String DB400_DBX365_3;
    private String DB400_DBX365_4;
    private String DB400_DBX365_5;
    private String DB400_DBX365_6;
    private String DB400_DBX365_7;
    private String DB400_DBX366_0;
    private String DB400_DBX366_1;
    private String DB400_DBX366_2;
    private String DB400_DBX366_3;
    private String DB400_DBX366_4;
    private String DB400_DBX366_5;
    private String DB400_DBX366_6;
    private String DB400_DBX366_7;
    private String DB400_DBX367_0;
    private String DB400_DBX367_1;
    private String DB400_DBX367_2;
    private String DB400_DBX367_3;
    private String DB400_DBX367_6;
    private String DB400_DBX367_7;
    private String DB400_DBX368_0;
    private String DB400_DBX368_1;
    private String DB400_DBX368_2;
    private String DB400_DBX368_3;
    private String DB400_DBX368_4;
    private String DB400_DBX368_5;
    private String DB400_DBX368_6;
    private String DB400_DBX368_7;
    private String DB400_DBX369_0;
    private String DB400_DBX369_1;
    private String DB400_DBX369_2;
    private String DB400_DBX369_3;
    private String DB400_DBX369_4;
    private String DB400_DBX369_5;
    private String DB400_DBX369_6;
    private String DB400_DBX369_7;
    private String DB400_DBX370_0;
    private String DB400_DBX370_1;
    private String DB400_DBX370_2;
    private String DB400_DBX370_3;
    private String DB400_DBX370_4;
    private String DB400_DBX370_5;
    private String DB400_DBX370_6;
    private String DB400_DBX370_7;
    private String DB400_DBX371_0;
    private String DB400_DBX371_1;
    private String DB400_DBX371_2;
    private String DB400_DBX371_3;
    private String DB400_DBX371_4;
    private String DB400_DBX371_5;
    private String DB400_DBX371_6;
    private String DB400_DBX371_7;
    private String DB400_DBX372_0;
    private String DB400_DBX372_1;
    private String DB400_DBX374_0;
    private String DB400_DBX374_1;
    private String DB400_DBX374_2;
    private String DB400_DBX374_3;
    private String DB400_DBX374_4;
    private String DB400_DBX374_5;
    private String DB400_DBX374_6;
    private String DB400_DBX374_7;
    private String DB400_DBX376_0;
    private String DB400_DBX376_1;
    private String DB400_DBX376_2;
    private String DB400_DBX376_3;
    private String DB400_DBX376_4;
    private String DB400_DBX376_5;
    private String DB400_DBX4_0;
    private String DB400_DBX4_1;
    private String DB400_DBX4_2;
    private String DB400_DBX4_3;
    private Date DB400_DT438;
    private Date DB400_DT722;

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

    public String getDB37_DBX0_0() {
        return DB37_DBX0_0;
    }

    public void setDB37_DBX0_0(String DB37_DBX0_0) {
        this.DB37_DBX0_0 = DB37_DBX0_0;
    }

    public String getDB37_DBX1_0() {
        return DB37_DBX1_0;
    }

    public void setDB37_DBX1_0(String DB37_DBX1_0) {
        this.DB37_DBX1_0 = DB37_DBX1_0;
    }

    public String getDB37_DBX1_1() {
        return DB37_DBX1_1;
    }

    public void setDB37_DBX1_1(String DB37_DBX1_1) {
        this.DB37_DBX1_1 = DB37_DBX1_1;
    }

    public String getDB37_DBX1_2() {
        return DB37_DBX1_2;
    }

    public void setDB37_DBX1_2(String DB37_DBX1_2) {
        this.DB37_DBX1_2 = DB37_DBX1_2;
    }

    public String getDB37_DBX2_0() {
        return DB37_DBX2_0;
    }

    public void setDB37_DBX2_0(String DB37_DBX2_0) {
        this.DB37_DBX2_0 = DB37_DBX2_0;
    }

    public String getDB37_DBX3_0() {
        return DB37_DBX3_0;
    }

    public void setDB37_DBX3_0(String DB37_DBX3_0) {
        this.DB37_DBX3_0 = DB37_DBX3_0;
    }

    public String getDB37_DBX3_1() {
        return DB37_DBX3_1;
    }

    public void setDB37_DBX3_1(String DB37_DBX3_1) {
        this.DB37_DBX3_1 = DB37_DBX3_1;
    }

    public String getDB37_DBX3_2() {
        return DB37_DBX3_2;
    }

    public void setDB37_DBX3_2(String DB37_DBX3_2) {
        this.DB37_DBX3_2 = DB37_DBX3_2;
    }

    public String getDB400_DBD1098() {
        return DB400_DBD1098;
    }

    public void setDB400_DBD1098(String DB400_DBD1098) {
        this.DB400_DBD1098 = DB400_DBD1098;
    }

    public BigDecimal getDB400_DBD118() {
        return DB400_DBD118;
    }

    public void setDB400_DBD118(BigDecimal DB400_DBD118) {
        this.DB400_DBD118 = DB400_DBD118;
    }

    public String getDB400_DBD1198() {
        return DB400_DBD1198;
    }

    public void setDB400_DBD1198(String DB400_DBD1198) {
        this.DB400_DBD1198 = DB400_DBD1198;
    }

    public BigDecimal getDB400_DBD198() {
        return DB400_DBD198;
    }

    public void setDB400_DBD198(BigDecimal DB400_DBD198) {
        this.DB400_DBD198 = DB400_DBD198;
    }

    public BigDecimal getDB400_DBD202() {
        return DB400_DBD202;
    }

    public void setDB400_DBD202(BigDecimal DB400_DBD202) {
        this.DB400_DBD202 = DB400_DBD202;
    }

    public String getDB400_DBD398() {
        return DB400_DBD398;
    }

    public void setDB400_DBD398(String DB400_DBD398) {
        this.DB400_DBD398 = DB400_DBD398;
    }

    public String getDB400_DBD500() {
        return DB400_DBD500;
    }

    public void setDB400_DBD500(String DB400_DBD500) {
        this.DB400_DBD500 = DB400_DBD500;
    }

    public BigDecimal getDB400_DBD542() {
        return DB400_DBD542;
    }

    public void setDB400_DBD542(BigDecimal DB400_DBD542) {
        this.DB400_DBD542 = DB400_DBD542;
    }

    public BigDecimal getDB400_DBD546() {
        return DB400_DBD546;
    }

    public void setDB400_DBD546(BigDecimal DB400_DBD546) {
        this.DB400_DBD546 = DB400_DBD546;
    }

    public BigDecimal getDB400_DBD58() {
        return DB400_DBD58;
    }

    public void setDB400_DBD58(BigDecimal DB400_DBD58) {
        this.DB400_DBD58 = DB400_DBD58;
    }

    public BigDecimal getDB400_DBD604() {
        return DB400_DBD604;
    }

    public void setDB400_DBD604(BigDecimal DB400_DBD604) {
        this.DB400_DBD604 = DB400_DBD604;
    }

    public BigDecimal getDB400_DBD608() {
        return DB400_DBD608;
    }

    public void setDB400_DBD608(BigDecimal DB400_DBD608) {
        this.DB400_DBD608 = DB400_DBD608;
    }

    public BigDecimal getDB400_DBD622() {
        return DB400_DBD622;
    }

    public void setDB400_DBD622(BigDecimal DB400_DBD622) {
        this.DB400_DBD622 = DB400_DBD622;
    }

    public BigDecimal getDB400_DBD626() {
        return DB400_DBD626;
    }

    public void setDB400_DBD626(BigDecimal DB400_DBD626) {
        this.DB400_DBD626 = DB400_DBD626;
    }

    public BigDecimal getDB400_DBD630() {
        return DB400_DBD630;
    }

    public void setDB400_DBD630(BigDecimal DB400_DBD630) {
        this.DB400_DBD630 = DB400_DBD630;
    }

    public BigDecimal getDB400_DBD634() {
        return DB400_DBD634;
    }

    public void setDB400_DBD634(BigDecimal DB400_DBD634) {
        this.DB400_DBD634 = DB400_DBD634;
    }

    public BigDecimal getDB400_DBD638() {
        return DB400_DBD638;
    }

    public void setDB400_DBD638(BigDecimal DB400_DBD638) {
        this.DB400_DBD638 = DB400_DBD638;
    }

    public BigDecimal getDB400_DBD642() {
        return DB400_DBD642;
    }

    public void setDB400_DBD642(BigDecimal DB400_DBD642) {
        this.DB400_DBD642 = DB400_DBD642;
    }

    public BigDecimal getDB400_DBD646() {
        return DB400_DBD646;
    }

    public void setDB400_DBD646(BigDecimal DB400_DBD646) {
        this.DB400_DBD646 = DB400_DBD646;
    }

    public BigDecimal getDB400_DBD730() {
        return DB400_DBD730;
    }

    public void setDB400_DBD730(BigDecimal DB400_DBD730) {
        this.DB400_DBD730 = DB400_DBD730;
    }

    public String getDB400_DBD736() {
        return DB400_DBD736;
    }

    public void setDB400_DBD736(String DB400_DBD736) {
        this.DB400_DBD736 = DB400_DBD736;
    }

    public String getDB400_DBD798() {
        return DB400_DBD798;
    }

    public void setDB400_DBD798(String DB400_DBD798) {
        this.DB400_DBD798 = DB400_DBD798;
    }

    public String getDB400_DBD838() {
        return DB400_DBD838;
    }

    public void setDB400_DBD838(String DB400_DBD838) {
        this.DB400_DBD838 = DB400_DBD838;
    }

    public BigDecimal getDB400_DBD86() {
        return DB400_DBD86;
    }

    public void setDB400_DBD86(BigDecimal DB400_DBD86) {
        this.DB400_DBD86 = DB400_DBD86;
    }

    public String getDB400_DBD878() {
        return DB400_DBD878;
    }

    public void setDB400_DBD878(String DB400_DBD878) {
        this.DB400_DBD878 = DB400_DBD878;
    }

    public String getDB400_DBD919() {
        return DB400_DBD919;
    }

    public void setDB400_DBD919(String DB400_DBD919) {
        this.DB400_DBD919 = DB400_DBD919;
    }

    public BigDecimal getDB400_DBW0() {
        return DB400_DBW0;
    }

    public void setDB400_DBW0(BigDecimal DB400_DBW0) {
        this.DB400_DBW0 = DB400_DBW0;
    }

    public BigDecimal getDB400_DBW1000() {
        return DB400_DBW1000;
    }

    public void setDB400_DBW1000(BigDecimal DB400_DBW1000) {
        this.DB400_DBW1000 = DB400_DBW1000;
    }

    public BigDecimal getDB400_DBW1008() {
        return DB400_DBW1008;
    }

    public void setDB400_DBW1008(BigDecimal DB400_DBW1008) {
        this.DB400_DBW1008 = DB400_DBW1008;
    }

    public BigDecimal getDB400_DBW1010() {
        return DB400_DBW1010;
    }

    public void setDB400_DBW1010(BigDecimal DB400_DBW1010) {
        this.DB400_DBW1010 = DB400_DBW1010;
    }

    public BigDecimal getDB400_DBW1018() {
        return DB400_DBW1018;
    }

    public void setDB400_DBW1018(BigDecimal DB400_DBW1018) {
        this.DB400_DBW1018 = DB400_DBW1018;
    }

    public BigDecimal getDB400_DBW1020() {
        return DB400_DBW1020;
    }

    public void setDB400_DBW1020(BigDecimal DB400_DBW1020) {
        this.DB400_DBW1020 = DB400_DBW1020;
    }

    public BigDecimal getDB400_DBW1028() {
        return DB400_DBW1028;
    }

    public void setDB400_DBW1028(BigDecimal DB400_DBW1028) {
        this.DB400_DBW1028 = DB400_DBW1028;
    }

    public BigDecimal getDB400_DBW1030() {
        return DB400_DBW1030;
    }

    public void setDB400_DBW1030(BigDecimal DB400_DBW1030) {
        this.DB400_DBW1030 = DB400_DBW1030;
    }

    public BigDecimal getDB400_DBW122() {
        return DB400_DBW122;
    }

    public void setDB400_DBW122(BigDecimal DB400_DBW122) {
        this.DB400_DBW122 = DB400_DBW122;
    }

    public BigDecimal getDB400_DBW278() {
        return DB400_DBW278;
    }

    public void setDB400_DBW278(BigDecimal DB400_DBW278) {
        this.DB400_DBW278 = DB400_DBW278;
    }

    public BigDecimal getDB400_DBW280() {
        return DB400_DBW280;
    }

    public void setDB400_DBW280(BigDecimal DB400_DBW280) {
        this.DB400_DBW280 = DB400_DBW280;
    }

    public BigDecimal getDB400_DBW282() {
        return DB400_DBW282;
    }

    public void setDB400_DBW282(BigDecimal DB400_DBW282) {
        this.DB400_DBW282 = DB400_DBW282;
    }

    public BigDecimal getDB400_DBW284() {
        return DB400_DBW284;
    }

    public void setDB400_DBW284(BigDecimal DB400_DBW284) {
        this.DB400_DBW284 = DB400_DBW284;
    }

    public BigDecimal getDB400_DBW286() {
        return DB400_DBW286;
    }

    public void setDB400_DBW286(BigDecimal DB400_DBW286) {
        this.DB400_DBW286 = DB400_DBW286;
    }

    public BigDecimal getDB400_DBW288() {
        return DB400_DBW288;
    }

    public void setDB400_DBW288(BigDecimal DB400_DBW288) {
        this.DB400_DBW288 = DB400_DBW288;
    }

    public BigDecimal getDB400_DBW290() {
        return DB400_DBW290;
    }

    public void setDB400_DBW290(BigDecimal DB400_DBW290) {
        this.DB400_DBW290 = DB400_DBW290;
    }

    public BigDecimal getDB400_DBW292() {
        return DB400_DBW292;
    }

    public void setDB400_DBW292(BigDecimal DB400_DBW292) {
        this.DB400_DBW292 = DB400_DBW292;
    }

    public BigDecimal getDB400_DBW450() {
        return DB400_DBW450;
    }

    public void setDB400_DBW450(BigDecimal DB400_DBW450) {
        this.DB400_DBW450 = DB400_DBW450;
    }

    public BigDecimal getDB400_DBW498() {
        return DB400_DBW498;
    }

    public void setDB400_DBW498(BigDecimal DB400_DBW498) {
        this.DB400_DBW498 = DB400_DBW498;
    }

    public BigDecimal getDB400_DBW540() {
        return DB400_DBW540;
    }

    public void setDB400_DBW540(BigDecimal DB400_DBW540) {
        this.DB400_DBW540 = DB400_DBW540;
    }

    public BigDecimal getDB400_DBW550() {
        return DB400_DBW550;
    }

    public void setDB400_DBW550(BigDecimal DB400_DBW550) {
        this.DB400_DBW550 = DB400_DBW550;
    }

    public BigDecimal getDB400_DBW552() {
        return DB400_DBW552;
    }

    public void setDB400_DBW552(BigDecimal DB400_DBW552) {
        this.DB400_DBW552 = DB400_DBW552;
    }

    public BigDecimal getDB400_DBW554() {
        return DB400_DBW554;
    }

    public void setDB400_DBW554(BigDecimal DB400_DBW554) {
        this.DB400_DBW554 = DB400_DBW554;
    }

    public BigDecimal getDB400_DBW556() {
        return DB400_DBW556;
    }

    public void setDB400_DBW556(BigDecimal DB400_DBW556) {
        this.DB400_DBW556 = DB400_DBW556;
    }

    public BigDecimal getDB400_DBW558() {
        return DB400_DBW558;
    }

    public void setDB400_DBW558(BigDecimal DB400_DBW558) {
        this.DB400_DBW558 = DB400_DBW558;
    }

    public BigDecimal getDB400_DBW598() {
        return DB400_DBW598;
    }

    public void setDB400_DBW598(BigDecimal DB400_DBW598) {
        this.DB400_DBW598 = DB400_DBW598;
    }

    public BigDecimal getDB400_DBW6() {
        return DB400_DBW6;
    }

    public void setDB400_DBW6(BigDecimal DB400_DBW6) {
        this.DB400_DBW6 = DB400_DBW6;
    }

    public BigDecimal getDB400_DBW600() {
        return DB400_DBW600;
    }

    public void setDB400_DBW600(BigDecimal DB400_DBW600) {
        this.DB400_DBW600 = DB400_DBW600;
    }

    public BigDecimal getDB400_DBW602() {
        return DB400_DBW602;
    }

    public void setDB400_DBW602(BigDecimal DB400_DBW602) {
        this.DB400_DBW602 = DB400_DBW602;
    }

    public BigDecimal getDB400_DBW608() {
        return DB400_DBW608;
    }

    public void setDB400_DBW608(BigDecimal DB400_DBW608) {
        this.DB400_DBW608 = DB400_DBW608;
    }

    public BigDecimal getDB400_DBW612() {
        return DB400_DBW612;
    }

    public void setDB400_DBW612(BigDecimal DB400_DBW612) {
        this.DB400_DBW612 = DB400_DBW612;
    }

    public BigDecimal getDB400_DBW614() {
        return DB400_DBW614;
    }

    public void setDB400_DBW614(BigDecimal DB400_DBW614) {
        this.DB400_DBW614 = DB400_DBW614;
    }

    public BigDecimal getDB400_DBW618() {
        return DB400_DBW618;
    }

    public void setDB400_DBW618(BigDecimal DB400_DBW618) {
        this.DB400_DBW618 = DB400_DBW618;
    }

    public BigDecimal getDB400_DBW62() {
        return DB400_DBW62;
    }

    public void setDB400_DBW62(BigDecimal DB400_DBW62) {
        this.DB400_DBW62 = DB400_DBW62;
    }

    public BigDecimal getDB400_DBW620() {
        return DB400_DBW620;
    }

    public void setDB400_DBW620(BigDecimal DB400_DBW620) {
        this.DB400_DBW620 = DB400_DBW620;
    }

    public BigDecimal getDB400_DBW64() {
        return DB400_DBW64;
    }

    public void setDB400_DBW64(BigDecimal DB400_DBW64) {
        this.DB400_DBW64 = DB400_DBW64;
    }

    public BigDecimal getDB400_DBW650() {
        return DB400_DBW650;
    }

    public void setDB400_DBW650(BigDecimal DB400_DBW650) {
        this.DB400_DBW650 = DB400_DBW650;
    }

    public BigDecimal getDB400_DBW652() {
        return DB400_DBW652;
    }

    public void setDB400_DBW652(BigDecimal DB400_DBW652) {
        this.DB400_DBW652 = DB400_DBW652;
    }

    public BigDecimal getDB400_DBW658() {
        return DB400_DBW658;
    }

    public void setDB400_DBW658(BigDecimal DB400_DBW658) {
        this.DB400_DBW658 = DB400_DBW658;
    }

    public BigDecimal getDB400_DBW66() {
        return DB400_DBW66;
    }

    public void setDB400_DBW66(BigDecimal DB400_DBW66) {
        this.DB400_DBW66 = DB400_DBW66;
    }

    public BigDecimal getDB400_DBW660() {
        return DB400_DBW660;
    }

    public void setDB400_DBW660(BigDecimal DB400_DBW660) {
        this.DB400_DBW660 = DB400_DBW660;
    }

    public BigDecimal getDB400_DBW662() {
        return DB400_DBW662;
    }

    public void setDB400_DBW662(BigDecimal DB400_DBW662) {
        this.DB400_DBW662 = DB400_DBW662;
    }

    public BigDecimal getDB400_DBW664() {
        return DB400_DBW664;
    }

    public void setDB400_DBW664(BigDecimal DB400_DBW664) {
        this.DB400_DBW664 = DB400_DBW664;
    }

    public BigDecimal getDB400_DBW666() {
        return DB400_DBW666;
    }

    public void setDB400_DBW666(BigDecimal DB400_DBW666) {
        this.DB400_DBW666 = DB400_DBW666;
    }

    public BigDecimal getDB400_DBW668() {
        return DB400_DBW668;
    }

    public void setDB400_DBW668(BigDecimal DB400_DBW668) {
        this.DB400_DBW668 = DB400_DBW668;
    }

    public BigDecimal getDB400_DBW670() {
        return DB400_DBW670;
    }

    public void setDB400_DBW670(BigDecimal DB400_DBW670) {
        this.DB400_DBW670 = DB400_DBW670;
    }

    public BigDecimal getDB400_DBW672() {
        return DB400_DBW672;
    }

    public void setDB400_DBW672(BigDecimal DB400_DBW672) {
        this.DB400_DBW672 = DB400_DBW672;
    }

    public BigDecimal getDB400_DBW674() {
        return DB400_DBW674;
    }

    public void setDB400_DBW674(BigDecimal DB400_DBW674) {
        this.DB400_DBW674 = DB400_DBW674;
    }

    public BigDecimal getDB400_DBW676() {
        return DB400_DBW676;
    }

    public void setDB400_DBW676(BigDecimal DB400_DBW676) {
        this.DB400_DBW676 = DB400_DBW676;
    }

    public BigDecimal getDB400_DBW678() {
        return DB400_DBW678;
    }

    public void setDB400_DBW678(BigDecimal DB400_DBW678) {
        this.DB400_DBW678 = DB400_DBW678;
    }

    public BigDecimal getDB400_DBW68() {
        return DB400_DBW68;
    }

    public void setDB400_DBW68(BigDecimal DB400_DBW68) {
        this.DB400_DBW68 = DB400_DBW68;
    }

    public BigDecimal getDB400_DBW680() {
        return DB400_DBW680;
    }

    public void setDB400_DBW680(BigDecimal DB400_DBW680) {
        this.DB400_DBW680 = DB400_DBW680;
    }

    public BigDecimal getDB400_DBW70() {
        return DB400_DBW70;
    }

    public void setDB400_DBW70(BigDecimal DB400_DBW70) {
        this.DB400_DBW70 = DB400_DBW70;
    }

    public BigDecimal getDB400_DBW718() {
        return DB400_DBW718;
    }

    public void setDB400_DBW718(BigDecimal DB400_DBW718) {
        this.DB400_DBW718 = DB400_DBW718;
    }

    public BigDecimal getDB400_DBW72() {
        return DB400_DBW72;
    }

    public void setDB400_DBW72(BigDecimal DB400_DBW72) {
        this.DB400_DBW72 = DB400_DBW72;
    }

    public BigDecimal getDB400_DBW720() {
        return DB400_DBW720;
    }

    public void setDB400_DBW720(BigDecimal DB400_DBW720) {
        this.DB400_DBW720 = DB400_DBW720;
    }

    public BigDecimal getDB400_DBW734() {
        return DB400_DBW734;
    }

    public void setDB400_DBW734(BigDecimal DB400_DBW734) {
        this.DB400_DBW734 = DB400_DBW734;
    }

    public BigDecimal getDB400_DBW74() {
        return DB400_DBW74;
    }

    public void setDB400_DBW74(BigDecimal DB400_DBW74) {
        this.DB400_DBW74 = DB400_DBW74;
    }

    public BigDecimal getDB400_DBW76() {
        return DB400_DBW76;
    }

    public void setDB400_DBW76(BigDecimal DB400_DBW76) {
        this.DB400_DBW76 = DB400_DBW76;
    }

    public BigDecimal getDB400_DBW776() {
        return DB400_DBW776;
    }

    public void setDB400_DBW776(BigDecimal DB400_DBW776) {
        this.DB400_DBW776 = DB400_DBW776;
    }

    public BigDecimal getDB400_DBW78() {
        return DB400_DBW78;
    }

    public void setDB400_DBW78(BigDecimal DB400_DBW78) {
        this.DB400_DBW78 = DB400_DBW78;
    }

    public BigDecimal getDB400_DBW798() {
        return DB400_DBW798;
    }

    public void setDB400_DBW798(BigDecimal DB400_DBW798) {
        this.DB400_DBW798 = DB400_DBW798;
    }

    public BigDecimal getDB400_DBW80() {
        return DB400_DBW80;
    }

    public void setDB400_DBW80(BigDecimal DB400_DBW80) {
        this.DB400_DBW80 = DB400_DBW80;
    }

    public BigDecimal getDB400_DBW800() {
        return DB400_DBW800;
    }

    public void setDB400_DBW800(BigDecimal DB400_DBW800) {
        this.DB400_DBW800 = DB400_DBW800;
    }

    public BigDecimal getDB400_DBW808() {
        return DB400_DBW808;
    }

    public void setDB400_DBW808(BigDecimal DB400_DBW808) {
        this.DB400_DBW808 = DB400_DBW808;
    }

    public BigDecimal getDB400_DBW810() {
        return DB400_DBW810;
    }

    public void setDB400_DBW810(BigDecimal DB400_DBW810) {
        this.DB400_DBW810 = DB400_DBW810;
    }

    public BigDecimal getDB400_DBW818() {
        return DB400_DBW818;
    }

    public void setDB400_DBW818(BigDecimal DB400_DBW818) {
        this.DB400_DBW818 = DB400_DBW818;
    }

    public BigDecimal getDB400_DBW82() {
        return DB400_DBW82;
    }

    public void setDB400_DBW82(BigDecimal DB400_DBW82) {
        this.DB400_DBW82 = DB400_DBW82;
    }

    public BigDecimal getDB400_DBW820() {
        return DB400_DBW820;
    }

    public void setDB400_DBW820(BigDecimal DB400_DBW820) {
        this.DB400_DBW820 = DB400_DBW820;
    }

    public BigDecimal getDB400_DBW828() {
        return DB400_DBW828;
    }

    public void setDB400_DBW828(BigDecimal DB400_DBW828) {
        this.DB400_DBW828 = DB400_DBW828;
    }

    public BigDecimal getDB400_DBW830() {
        return DB400_DBW830;
    }

    public void setDB400_DBW830(BigDecimal DB400_DBW830) {
        this.DB400_DBW830 = DB400_DBW830;
    }

    public BigDecimal getDB400_DBW838() {
        return DB400_DBW838;
    }

    public void setDB400_DBW838(BigDecimal DB400_DBW838) {
        this.DB400_DBW838 = DB400_DBW838;
    }

    public BigDecimal getDB400_DBW84() {
        return DB400_DBW84;
    }

    public void setDB400_DBW84(BigDecimal DB400_DBW84) {
        this.DB400_DBW84 = DB400_DBW84;
    }

    public BigDecimal getDB400_DBW840() {
        return DB400_DBW840;
    }

    public void setDB400_DBW840(BigDecimal DB400_DBW840) {
        this.DB400_DBW840 = DB400_DBW840;
    }

    public BigDecimal getDB400_DBW848() {
        return DB400_DBW848;
    }

    public void setDB400_DBW848(BigDecimal DB400_DBW848) {
        this.DB400_DBW848 = DB400_DBW848;
    }

    public BigDecimal getDB400_DBW850() {
        return DB400_DBW850;
    }

    public void setDB400_DBW850(BigDecimal DB400_DBW850) {
        this.DB400_DBW850 = DB400_DBW850;
    }

    public BigDecimal getDB400_DBW858() {
        return DB400_DBW858;
    }

    public void setDB400_DBW858(BigDecimal DB400_DBW858) {
        this.DB400_DBW858 = DB400_DBW858;
    }

    public BigDecimal getDB400_DBW860() {
        return DB400_DBW860;
    }

    public void setDB400_DBW860(BigDecimal DB400_DBW860) {
        this.DB400_DBW860 = DB400_DBW860;
    }

    public BigDecimal getDB400_DBW868() {
        return DB400_DBW868;
    }

    public void setDB400_DBW868(BigDecimal DB400_DBW868) {
        this.DB400_DBW868 = DB400_DBW868;
    }

    public BigDecimal getDB400_DBW870() {
        return DB400_DBW870;
    }

    public void setDB400_DBW870(BigDecimal DB400_DBW870) {
        this.DB400_DBW870 = DB400_DBW870;
    }

    public BigDecimal getDB400_DBW879() {
        return DB400_DBW879;
    }

    public void setDB400_DBW879(BigDecimal DB400_DBW879) {
        this.DB400_DBW879 = DB400_DBW879;
    }

    public BigDecimal getDB400_DBW880() {
        return DB400_DBW880;
    }

    public void setDB400_DBW880(BigDecimal DB400_DBW880) {
        this.DB400_DBW880 = DB400_DBW880;
    }

    public BigDecimal getDB400_DBW888() {
        return DB400_DBW888;
    }

    public void setDB400_DBW888(BigDecimal DB400_DBW888) {
        this.DB400_DBW888 = DB400_DBW888;
    }

    public BigDecimal getDB400_DBW890() {
        return DB400_DBW890;
    }

    public void setDB400_DBW890(BigDecimal DB400_DBW890) {
        this.DB400_DBW890 = DB400_DBW890;
    }

    public BigDecimal getDB400_DBW898() {
        return DB400_DBW898;
    }

    public void setDB400_DBW898(BigDecimal DB400_DBW898) {
        this.DB400_DBW898 = DB400_DBW898;
    }

    public BigDecimal getDB400_DBW900() {
        return DB400_DBW900;
    }

    public void setDB400_DBW900(BigDecimal DB400_DBW900) {
        this.DB400_DBW900 = DB400_DBW900;
    }

    public BigDecimal getDB400_DBW908() {
        return DB400_DBW908;
    }

    public void setDB400_DBW908(BigDecimal DB400_DBW908) {
        this.DB400_DBW908 = DB400_DBW908;
    }

    public BigDecimal getDB400_DBW910() {
        return DB400_DBW910;
    }

    public void setDB400_DBW910(BigDecimal DB400_DBW910) {
        this.DB400_DBW910 = DB400_DBW910;
    }

    public BigDecimal getDB400_DBW918() {
        return DB400_DBW918;
    }

    public void setDB400_DBW918(BigDecimal DB400_DBW918) {
        this.DB400_DBW918 = DB400_DBW918;
    }

    public BigDecimal getDB400_DBW920() {
        return DB400_DBW920;
    }

    public void setDB400_DBW920(BigDecimal DB400_DBW920) {
        this.DB400_DBW920 = DB400_DBW920;
    }

    public BigDecimal getDB400_DBW928() {
        return DB400_DBW928;
    }

    public void setDB400_DBW928(BigDecimal DB400_DBW928) {
        this.DB400_DBW928 = DB400_DBW928;
    }

    public BigDecimal getDB400_DBW930() {
        return DB400_DBW930;
    }

    public void setDB400_DBW930(BigDecimal DB400_DBW930) {
        this.DB400_DBW930 = DB400_DBW930;
    }

    public BigDecimal getDB400_DBW938() {
        return DB400_DBW938;
    }

    public void setDB400_DBW938(BigDecimal DB400_DBW938) {
        this.DB400_DBW938 = DB400_DBW938;
    }

    public BigDecimal getDB400_DBW940() {
        return DB400_DBW940;
    }

    public void setDB400_DBW940(BigDecimal DB400_DBW940) {
        this.DB400_DBW940 = DB400_DBW940;
    }

    public BigDecimal getDB400_DBW949() {
        return DB400_DBW949;
    }

    public void setDB400_DBW949(BigDecimal DB400_DBW949) {
        this.DB400_DBW949 = DB400_DBW949;
    }

    public BigDecimal getDB400_DBW950() {
        return DB400_DBW950;
    }

    public void setDB400_DBW950(BigDecimal DB400_DBW950) {
        this.DB400_DBW950 = DB400_DBW950;
    }

    public BigDecimal getDB400_DBW998() {
        return DB400_DBW998;
    }

    public void setDB400_DBW998(BigDecimal DB400_DBW998) {
        this.DB400_DBW998 = DB400_DBW998;
    }

    public String getDB400_DBX16_0() {
        return DB400_DBX16_0;
    }

    public void setDB400_DBX16_0(String DB400_DBX16_0) {
        this.DB400_DBX16_0 = DB400_DBX16_0;
    }

    public String getDB400_DBX16_1() {
        return DB400_DBX16_1;
    }

    public void setDB400_DBX16_1(String DB400_DBX16_1) {
        this.DB400_DBX16_1 = DB400_DBX16_1;
    }

    public String getDB400_DBX18_0() {
        return DB400_DBX18_0;
    }

    public void setDB400_DBX18_0(String DB400_DBX18_0) {
        this.DB400_DBX18_0 = DB400_DBX18_0;
    }

    public String getDB400_DBX18_1() {
        return DB400_DBX18_1;
    }

    public void setDB400_DBX18_1(String DB400_DBX18_1) {
        this.DB400_DBX18_1 = DB400_DBX18_1;
    }

    public String getDB400_DBX18_2() {
        return DB400_DBX18_2;
    }

    public void setDB400_DBX18_2(String DB400_DBX18_2) {
        this.DB400_DBX18_2 = DB400_DBX18_2;
    }

    public String getDB400_DBX18_3() {
        return DB400_DBX18_3;
    }

    public void setDB400_DBX18_3(String DB400_DBX18_3) {
        this.DB400_DBX18_3 = DB400_DBX18_3;
    }

    public String getDB400_DBX18_4() {
        return DB400_DBX18_4;
    }

    public void setDB400_DBX18_4(String DB400_DBX18_4) {
        this.DB400_DBX18_4 = DB400_DBX18_4;
    }

    public String getDB400_DBX18_5() {
        return DB400_DBX18_5;
    }

    public void setDB400_DBX18_5(String DB400_DBX18_5) {
        this.DB400_DBX18_5 = DB400_DBX18_5;
    }

    public String getDB400_DBX18_6() {
        return DB400_DBX18_6;
    }

    public void setDB400_DBX18_6(String DB400_DBX18_6) {
        this.DB400_DBX18_6 = DB400_DBX18_6;
    }

    public String getDB400_DBX18_7() {
        return DB400_DBX18_7;
    }

    public void setDB400_DBX18_7(String DB400_DBX18_7) {
        this.DB400_DBX18_7 = DB400_DBX18_7;
    }

    public String getDB400_DBX20_0() {
        return DB400_DBX20_0;
    }

    public void setDB400_DBX20_0(String DB400_DBX20_0) {
        this.DB400_DBX20_0 = DB400_DBX20_0;
    }

    public String getDB400_DBX20_1() {
        return DB400_DBX20_1;
    }

    public void setDB400_DBX20_1(String DB400_DBX20_1) {
        this.DB400_DBX20_1 = DB400_DBX20_1;
    }

    public String getDB400_DBX20_2() {
        return DB400_DBX20_2;
    }

    public void setDB400_DBX20_2(String DB400_DBX20_2) {
        this.DB400_DBX20_2 = DB400_DBX20_2;
    }

    public String getDB400_DBX338_0() {
        return DB400_DBX338_0;
    }

    public void setDB400_DBX338_0(String DB400_DBX338_0) {
        this.DB400_DBX338_0 = DB400_DBX338_0;
    }

    public String getDB400_DBX338_1() {
        return DB400_DBX338_1;
    }

    public void setDB400_DBX338_1(String DB400_DBX338_1) {
        this.DB400_DBX338_1 = DB400_DBX338_1;
    }

    public String getDB400_DBX338_2() {
        return DB400_DBX338_2;
    }

    public void setDB400_DBX338_2(String DB400_DBX338_2) {
        this.DB400_DBX338_2 = DB400_DBX338_2;
    }

    public String getDB400_DBX338_3() {
        return DB400_DBX338_3;
    }

    public void setDB400_DBX338_3(String DB400_DBX338_3) {
        this.DB400_DBX338_3 = DB400_DBX338_3;
    }

    public String getDB400_DBX338_4() {
        return DB400_DBX338_4;
    }

    public void setDB400_DBX338_4(String DB400_DBX338_4) {
        this.DB400_DBX338_4 = DB400_DBX338_4;
    }

    public String getDB400_DBX338_5() {
        return DB400_DBX338_5;
    }

    public void setDB400_DBX338_5(String DB400_DBX338_5) {
        this.DB400_DBX338_5 = DB400_DBX338_5;
    }

    public String getDB400_DBX340_2() {
        return DB400_DBX340_2;
    }

    public void setDB400_DBX340_2(String DB400_DBX340_2) {
        this.DB400_DBX340_2 = DB400_DBX340_2;
    }

    public String getDB400_DBX340_3() {
        return DB400_DBX340_3;
    }

    public void setDB400_DBX340_3(String DB400_DBX340_3) {
        this.DB400_DBX340_3 = DB400_DBX340_3;
    }

    public String getDB400_DBX340_4() {
        return DB400_DBX340_4;
    }

    public void setDB400_DBX340_4(String DB400_DBX340_4) {
        this.DB400_DBX340_4 = DB400_DBX340_4;
    }

    public String getDB400_DBX340_5() {
        return DB400_DBX340_5;
    }

    public void setDB400_DBX340_5(String DB400_DBX340_5) {
        this.DB400_DBX340_5 = DB400_DBX340_5;
    }

    public String getDB400_DBX340_6() {
        return DB400_DBX340_6;
    }

    public void setDB400_DBX340_6(String DB400_DBX340_6) {
        this.DB400_DBX340_6 = DB400_DBX340_6;
    }

    public String getDB400_DBX340_7() {
        return DB400_DBX340_7;
    }

    public void setDB400_DBX340_7(String DB400_DBX340_7) {
        this.DB400_DBX340_7 = DB400_DBX340_7;
    }

    public String getDB400_DBX341_0() {
        return DB400_DBX341_0;
    }

    public void setDB400_DBX341_0(String DB400_DBX341_0) {
        this.DB400_DBX341_0 = DB400_DBX341_0;
    }

    public String getDB400_DBX341_1() {
        return DB400_DBX341_1;
    }

    public void setDB400_DBX341_1(String DB400_DBX341_1) {
        this.DB400_DBX341_1 = DB400_DBX341_1;
    }

    public String getDB400_DBX341_2() {
        return DB400_DBX341_2;
    }

    public void setDB400_DBX341_2(String DB400_DBX341_2) {
        this.DB400_DBX341_2 = DB400_DBX341_2;
    }

    public String getDB400_DBX341_3() {
        return DB400_DBX341_3;
    }

    public void setDB400_DBX341_3(String DB400_DBX341_3) {
        this.DB400_DBX341_3 = DB400_DBX341_3;
    }

    public String getDB400_DBX341_4() {
        return DB400_DBX341_4;
    }

    public void setDB400_DBX341_4(String DB400_DBX341_4) {
        this.DB400_DBX341_4 = DB400_DBX341_4;
    }

    public String getDB400_DBX341_5() {
        return DB400_DBX341_5;
    }

    public void setDB400_DBX341_5(String DB400_DBX341_5) {
        this.DB400_DBX341_5 = DB400_DBX341_5;
    }

    public String getDB400_DBX342_2() {
        return DB400_DBX342_2;
    }

    public void setDB400_DBX342_2(String DB400_DBX342_2) {
        this.DB400_DBX342_2 = DB400_DBX342_2;
    }

    public String getDB400_DBX342_3() {
        return DB400_DBX342_3;
    }

    public void setDB400_DBX342_3(String DB400_DBX342_3) {
        this.DB400_DBX342_3 = DB400_DBX342_3;
    }

    public String getDB400_DBX342_4() {
        return DB400_DBX342_4;
    }

    public void setDB400_DBX342_4(String DB400_DBX342_4) {
        this.DB400_DBX342_4 = DB400_DBX342_4;
    }

    public String getDB400_DBX342_5() {
        return DB400_DBX342_5;
    }

    public void setDB400_DBX342_5(String DB400_DBX342_5) {
        this.DB400_DBX342_5 = DB400_DBX342_5;
    }

    public String getDB400_DBX358_0() {
        return DB400_DBX358_0;
    }

    public void setDB400_DBX358_0(String DB400_DBX358_0) {
        this.DB400_DBX358_0 = DB400_DBX358_0;
    }

    public String getDB400_DBX358_1() {
        return DB400_DBX358_1;
    }

    public void setDB400_DBX358_1(String DB400_DBX358_1) {
        this.DB400_DBX358_1 = DB400_DBX358_1;
    }

    public String getDB400_DBX358_2() {
        return DB400_DBX358_2;
    }

    public void setDB400_DBX358_2(String DB400_DBX358_2) {
        this.DB400_DBX358_2 = DB400_DBX358_2;
    }

    public String getDB400_DBX358_3() {
        return DB400_DBX358_3;
    }

    public void setDB400_DBX358_3(String DB400_DBX358_3) {
        this.DB400_DBX358_3 = DB400_DBX358_3;
    }

    public String getDB400_DBX358_4() {
        return DB400_DBX358_4;
    }

    public void setDB400_DBX358_4(String DB400_DBX358_4) {
        this.DB400_DBX358_4 = DB400_DBX358_4;
    }

    public String getDB400_DBX358_5() {
        return DB400_DBX358_5;
    }

    public void setDB400_DBX358_5(String DB400_DBX358_5) {
        this.DB400_DBX358_5 = DB400_DBX358_5;
    }

    public String getDB400_DBX358_6() {
        return DB400_DBX358_6;
    }

    public void setDB400_DBX358_6(String DB400_DBX358_6) {
        this.DB400_DBX358_6 = DB400_DBX358_6;
    }

    public String getDB400_DBX358_7() {
        return DB400_DBX358_7;
    }

    public void setDB400_DBX358_7(String DB400_DBX358_7) {
        this.DB400_DBX358_7 = DB400_DBX358_7;
    }

    public String getDB400_DBX359_0() {
        return DB400_DBX359_0;
    }

    public void setDB400_DBX359_0(String DB400_DBX359_0) {
        this.DB400_DBX359_0 = DB400_DBX359_0;
    }

    public String getDB400_DBX359_1() {
        return DB400_DBX359_1;
    }

    public void setDB400_DBX359_1(String DB400_DBX359_1) {
        this.DB400_DBX359_1 = DB400_DBX359_1;
    }

    public String getDB400_DBX359_2() {
        return DB400_DBX359_2;
    }

    public void setDB400_DBX359_2(String DB400_DBX359_2) {
        this.DB400_DBX359_2 = DB400_DBX359_2;
    }

    public String getDB400_DBX359_3() {
        return DB400_DBX359_3;
    }

    public void setDB400_DBX359_3(String DB400_DBX359_3) {
        this.DB400_DBX359_3 = DB400_DBX359_3;
    }

    public String getDB400_DBX359_5() {
        return DB400_DBX359_5;
    }

    public void setDB400_DBX359_5(String DB400_DBX359_5) {
        this.DB400_DBX359_5 = DB400_DBX359_5;
    }

    public String getDB400_DBX359_6() {
        return DB400_DBX359_6;
    }

    public void setDB400_DBX359_6(String DB400_DBX359_6) {
        this.DB400_DBX359_6 = DB400_DBX359_6;
    }

    public String getDB400_DBX359_7() {
        return DB400_DBX359_7;
    }

    public void setDB400_DBX359_7(String DB400_DBX359_7) {
        this.DB400_DBX359_7 = DB400_DBX359_7;
    }

    public String getDB400_DBX360_0() {
        return DB400_DBX360_0;
    }

    public void setDB400_DBX360_0(String DB400_DBX360_0) {
        this.DB400_DBX360_0 = DB400_DBX360_0;
    }

    public String getDB400_DBX360_1() {
        return DB400_DBX360_1;
    }

    public void setDB400_DBX360_1(String DB400_DBX360_1) {
        this.DB400_DBX360_1 = DB400_DBX360_1;
    }

    public String getDB400_DBX360_2() {
        return DB400_DBX360_2;
    }

    public void setDB400_DBX360_2(String DB400_DBX360_2) {
        this.DB400_DBX360_2 = DB400_DBX360_2;
    }

    public String getDB400_DBX360_3() {
        return DB400_DBX360_3;
    }

    public void setDB400_DBX360_3(String DB400_DBX360_3) {
        this.DB400_DBX360_3 = DB400_DBX360_3;
    }

    public String getDB400_DBX360_4() {
        return DB400_DBX360_4;
    }

    public void setDB400_DBX360_4(String DB400_DBX360_4) {
        this.DB400_DBX360_4 = DB400_DBX360_4;
    }

    public String getDB400_DBX360_5() {
        return DB400_DBX360_5;
    }

    public void setDB400_DBX360_5(String DB400_DBX360_5) {
        this.DB400_DBX360_5 = DB400_DBX360_5;
    }

    public String getDB400_DBX360_6() {
        return DB400_DBX360_6;
    }

    public void setDB400_DBX360_6(String DB400_DBX360_6) {
        this.DB400_DBX360_6 = DB400_DBX360_6;
    }

    public String getDB400_DBX360_7() {
        return DB400_DBX360_7;
    }

    public void setDB400_DBX360_7(String DB400_DBX360_7) {
        this.DB400_DBX360_7 = DB400_DBX360_7;
    }

    public String getDB400_DBX361_0() {
        return DB400_DBX361_0;
    }

    public void setDB400_DBX361_0(String DB400_DBX361_0) {
        this.DB400_DBX361_0 = DB400_DBX361_0;
    }

    public String getDB400_DBX361_1() {
        return DB400_DBX361_1;
    }

    public void setDB400_DBX361_1(String DB400_DBX361_1) {
        this.DB400_DBX361_1 = DB400_DBX361_1;
    }

    public String getDB400_DBX361_2() {
        return DB400_DBX361_2;
    }

    public void setDB400_DBX361_2(String DB400_DBX361_2) {
        this.DB400_DBX361_2 = DB400_DBX361_2;
    }

    public String getDB400_DBX361_3() {
        return DB400_DBX361_3;
    }

    public void setDB400_DBX361_3(String DB400_DBX361_3) {
        this.DB400_DBX361_3 = DB400_DBX361_3;
    }

    public String getDB400_DBX361_4() {
        return DB400_DBX361_4;
    }

    public void setDB400_DBX361_4(String DB400_DBX361_4) {
        this.DB400_DBX361_4 = DB400_DBX361_4;
    }

    public String getDB400_DBX361_5() {
        return DB400_DBX361_5;
    }

    public void setDB400_DBX361_5(String DB400_DBX361_5) {
        this.DB400_DBX361_5 = DB400_DBX361_5;
    }

    public String getDB400_DBX361_6() {
        return DB400_DBX361_6;
    }

    public void setDB400_DBX361_6(String DB400_DBX361_6) {
        this.DB400_DBX361_6 = DB400_DBX361_6;
    }

    public String getDB400_DBX361_7() {
        return DB400_DBX361_7;
    }

    public void setDB400_DBX361_7(String DB400_DBX361_7) {
        this.DB400_DBX361_7 = DB400_DBX361_7;
    }

    public String getDB400_DBX362_0() {
        return DB400_DBX362_0;
    }

    public void setDB400_DBX362_0(String DB400_DBX362_0) {
        this.DB400_DBX362_0 = DB400_DBX362_0;
    }

    public String getDB400_DBX362_1() {
        return DB400_DBX362_1;
    }

    public void setDB400_DBX362_1(String DB400_DBX362_1) {
        this.DB400_DBX362_1 = DB400_DBX362_1;
    }

    public String getDB400_DBX362_2() {
        return DB400_DBX362_2;
    }

    public void setDB400_DBX362_2(String DB400_DBX362_2) {
        this.DB400_DBX362_2 = DB400_DBX362_2;
    }

    public String getDB400_DBX362_3() {
        return DB400_DBX362_3;
    }

    public void setDB400_DBX362_3(String DB400_DBX362_3) {
        this.DB400_DBX362_3 = DB400_DBX362_3;
    }

    public String getDB400_DBX362_4() {
        return DB400_DBX362_4;
    }

    public void setDB400_DBX362_4(String DB400_DBX362_4) {
        this.DB400_DBX362_4 = DB400_DBX362_4;
    }

    public String getDB400_DBX362_5() {
        return DB400_DBX362_5;
    }

    public void setDB400_DBX362_5(String DB400_DBX362_5) {
        this.DB400_DBX362_5 = DB400_DBX362_5;
    }

    public String getDB400_DBX362_6() {
        return DB400_DBX362_6;
    }

    public void setDB400_DBX362_6(String DB400_DBX362_6) {
        this.DB400_DBX362_6 = DB400_DBX362_6;
    }

    public String getDB400_DBX362_7() {
        return DB400_DBX362_7;
    }

    public void setDB400_DBX362_7(String DB400_DBX362_7) {
        this.DB400_DBX362_7 = DB400_DBX362_7;
    }

    public String getDB400_DBX363_0() {
        return DB400_DBX363_0;
    }

    public void setDB400_DBX363_0(String DB400_DBX363_0) {
        this.DB400_DBX363_0 = DB400_DBX363_0;
    }

    public String getDB400_DBX363_1() {
        return DB400_DBX363_1;
    }

    public void setDB400_DBX363_1(String DB400_DBX363_1) {
        this.DB400_DBX363_1 = DB400_DBX363_1;
    }

    public String getDB400_DBX363_2() {
        return DB400_DBX363_2;
    }

    public void setDB400_DBX363_2(String DB400_DBX363_2) {
        this.DB400_DBX363_2 = DB400_DBX363_2;
    }

    public String getDB400_DBX363_3() {
        return DB400_DBX363_3;
    }

    public void setDB400_DBX363_3(String DB400_DBX363_3) {
        this.DB400_DBX363_3 = DB400_DBX363_3;
    }

    public String getDB400_DBX363_4() {
        return DB400_DBX363_4;
    }

    public void setDB400_DBX363_4(String DB400_DBX363_4) {
        this.DB400_DBX363_4 = DB400_DBX363_4;
    }

    public String getDB400_DBX363_5() {
        return DB400_DBX363_5;
    }

    public void setDB400_DBX363_5(String DB400_DBX363_5) {
        this.DB400_DBX363_5 = DB400_DBX363_5;
    }

    public String getDB400_DBX363_6() {
        return DB400_DBX363_6;
    }

    public void setDB400_DBX363_6(String DB400_DBX363_6) {
        this.DB400_DBX363_6 = DB400_DBX363_6;
    }

    public String getDB400_DBX363_7() {
        return DB400_DBX363_7;
    }

    public void setDB400_DBX363_7(String DB400_DBX363_7) {
        this.DB400_DBX363_7 = DB400_DBX363_7;
    }

    public String getDB400_DBX364_0() {
        return DB400_DBX364_0;
    }

    public void setDB400_DBX364_0(String DB400_DBX364_0) {
        this.DB400_DBX364_0 = DB400_DBX364_0;
    }

    public String getDB400_DBX364_1() {
        return DB400_DBX364_1;
    }

    public void setDB400_DBX364_1(String DB400_DBX364_1) {
        this.DB400_DBX364_1 = DB400_DBX364_1;
    }

    public String getDB400_DBX364_2() {
        return DB400_DBX364_2;
    }

    public void setDB400_DBX364_2(String DB400_DBX364_2) {
        this.DB400_DBX364_2 = DB400_DBX364_2;
    }

    public String getDB400_DBX364_3() {
        return DB400_DBX364_3;
    }

    public void setDB400_DBX364_3(String DB400_DBX364_3) {
        this.DB400_DBX364_3 = DB400_DBX364_3;
    }

    public String getDB400_DBX364_4() {
        return DB400_DBX364_4;
    }

    public void setDB400_DBX364_4(String DB400_DBX364_4) {
        this.DB400_DBX364_4 = DB400_DBX364_4;
    }

    public String getDB400_DBX364_5() {
        return DB400_DBX364_5;
    }

    public void setDB400_DBX364_5(String DB400_DBX364_5) {
        this.DB400_DBX364_5 = DB400_DBX364_5;
    }

    public String getDB400_DBX364_6() {
        return DB400_DBX364_6;
    }

    public void setDB400_DBX364_6(String DB400_DBX364_6) {
        this.DB400_DBX364_6 = DB400_DBX364_6;
    }

    public String getDB400_DBX364_7() {
        return DB400_DBX364_7;
    }

    public void setDB400_DBX364_7(String DB400_DBX364_7) {
        this.DB400_DBX364_7 = DB400_DBX364_7;
    }

    public String getDB400_DBX365_0() {
        return DB400_DBX365_0;
    }

    public void setDB400_DBX365_0(String DB400_DBX365_0) {
        this.DB400_DBX365_0 = DB400_DBX365_0;
    }

    public String getDB400_DBX365_1() {
        return DB400_DBX365_1;
    }

    public void setDB400_DBX365_1(String DB400_DBX365_1) {
        this.DB400_DBX365_1 = DB400_DBX365_1;
    }

    public String getDB400_DBX365_2() {
        return DB400_DBX365_2;
    }

    public void setDB400_DBX365_2(String DB400_DBX365_2) {
        this.DB400_DBX365_2 = DB400_DBX365_2;
    }

    public String getDB400_DBX365_3() {
        return DB400_DBX365_3;
    }

    public void setDB400_DBX365_3(String DB400_DBX365_3) {
        this.DB400_DBX365_3 = DB400_DBX365_3;
    }

    public String getDB400_DBX365_4() {
        return DB400_DBX365_4;
    }

    public void setDB400_DBX365_4(String DB400_DBX365_4) {
        this.DB400_DBX365_4 = DB400_DBX365_4;
    }

    public String getDB400_DBX365_5() {
        return DB400_DBX365_5;
    }

    public void setDB400_DBX365_5(String DB400_DBX365_5) {
        this.DB400_DBX365_5 = DB400_DBX365_5;
    }

    public String getDB400_DBX365_6() {
        return DB400_DBX365_6;
    }

    public void setDB400_DBX365_6(String DB400_DBX365_6) {
        this.DB400_DBX365_6 = DB400_DBX365_6;
    }

    public String getDB400_DBX365_7() {
        return DB400_DBX365_7;
    }

    public void setDB400_DBX365_7(String DB400_DBX365_7) {
        this.DB400_DBX365_7 = DB400_DBX365_7;
    }

    public String getDB400_DBX366_0() {
        return DB400_DBX366_0;
    }

    public void setDB400_DBX366_0(String DB400_DBX366_0) {
        this.DB400_DBX366_0 = DB400_DBX366_0;
    }

    public String getDB400_DBX366_1() {
        return DB400_DBX366_1;
    }

    public void setDB400_DBX366_1(String DB400_DBX366_1) {
        this.DB400_DBX366_1 = DB400_DBX366_1;
    }

    public String getDB400_DBX366_2() {
        return DB400_DBX366_2;
    }

    public void setDB400_DBX366_2(String DB400_DBX366_2) {
        this.DB400_DBX366_2 = DB400_DBX366_2;
    }

    public String getDB400_DBX366_3() {
        return DB400_DBX366_3;
    }

    public void setDB400_DBX366_3(String DB400_DBX366_3) {
        this.DB400_DBX366_3 = DB400_DBX366_3;
    }

    public String getDB400_DBX366_4() {
        return DB400_DBX366_4;
    }

    public void setDB400_DBX366_4(String DB400_DBX366_4) {
        this.DB400_DBX366_4 = DB400_DBX366_4;
    }

    public String getDB400_DBX366_5() {
        return DB400_DBX366_5;
    }

    public void setDB400_DBX366_5(String DB400_DBX366_5) {
        this.DB400_DBX366_5 = DB400_DBX366_5;
    }

    public String getDB400_DBX366_6() {
        return DB400_DBX366_6;
    }

    public void setDB400_DBX366_6(String DB400_DBX366_6) {
        this.DB400_DBX366_6 = DB400_DBX366_6;
    }

    public String getDB400_DBX366_7() {
        return DB400_DBX366_7;
    }

    public void setDB400_DBX366_7(String DB400_DBX366_7) {
        this.DB400_DBX366_7 = DB400_DBX366_7;
    }

    public String getDB400_DBX367_0() {
        return DB400_DBX367_0;
    }

    public void setDB400_DBX367_0(String DB400_DBX367_0) {
        this.DB400_DBX367_0 = DB400_DBX367_0;
    }

    public String getDB400_DBX367_1() {
        return DB400_DBX367_1;
    }

    public void setDB400_DBX367_1(String DB400_DBX367_1) {
        this.DB400_DBX367_1 = DB400_DBX367_1;
    }

    public String getDB400_DBX367_2() {
        return DB400_DBX367_2;
    }

    public void setDB400_DBX367_2(String DB400_DBX367_2) {
        this.DB400_DBX367_2 = DB400_DBX367_2;
    }

    public String getDB400_DBX367_3() {
        return DB400_DBX367_3;
    }

    public void setDB400_DBX367_3(String DB400_DBX367_3) {
        this.DB400_DBX367_3 = DB400_DBX367_3;
    }

    public String getDB400_DBX367_6() {
        return DB400_DBX367_6;
    }

    public void setDB400_DBX367_6(String DB400_DBX367_6) {
        this.DB400_DBX367_6 = DB400_DBX367_6;
    }

    public String getDB400_DBX367_7() {
        return DB400_DBX367_7;
    }

    public void setDB400_DBX367_7(String DB400_DBX367_7) {
        this.DB400_DBX367_7 = DB400_DBX367_7;
    }

    public String getDB400_DBX368_0() {
        return DB400_DBX368_0;
    }

    public void setDB400_DBX368_0(String DB400_DBX368_0) {
        this.DB400_DBX368_0 = DB400_DBX368_0;
    }

    public String getDB400_DBX368_1() {
        return DB400_DBX368_1;
    }

    public void setDB400_DBX368_1(String DB400_DBX368_1) {
        this.DB400_DBX368_1 = DB400_DBX368_1;
    }

    public String getDB400_DBX368_2() {
        return DB400_DBX368_2;
    }

    public void setDB400_DBX368_2(String DB400_DBX368_2) {
        this.DB400_DBX368_2 = DB400_DBX368_2;
    }

    public String getDB400_DBX368_3() {
        return DB400_DBX368_3;
    }

    public void setDB400_DBX368_3(String DB400_DBX368_3) {
        this.DB400_DBX368_3 = DB400_DBX368_3;
    }

    public String getDB400_DBX368_4() {
        return DB400_DBX368_4;
    }

    public void setDB400_DBX368_4(String DB400_DBX368_4) {
        this.DB400_DBX368_4 = DB400_DBX368_4;
    }

    public String getDB400_DBX368_5() {
        return DB400_DBX368_5;
    }

    public void setDB400_DBX368_5(String DB400_DBX368_5) {
        this.DB400_DBX368_5 = DB400_DBX368_5;
    }

    public String getDB400_DBX368_6() {
        return DB400_DBX368_6;
    }

    public void setDB400_DBX368_6(String DB400_DBX368_6) {
        this.DB400_DBX368_6 = DB400_DBX368_6;
    }

    public String getDB400_DBX368_7() {
        return DB400_DBX368_7;
    }

    public void setDB400_DBX368_7(String DB400_DBX368_7) {
        this.DB400_DBX368_7 = DB400_DBX368_7;
    }

    public String getDB400_DBX369_0() {
        return DB400_DBX369_0;
    }

    public void setDB400_DBX369_0(String DB400_DBX369_0) {
        this.DB400_DBX369_0 = DB400_DBX369_0;
    }

    public String getDB400_DBX369_1() {
        return DB400_DBX369_1;
    }

    public void setDB400_DBX369_1(String DB400_DBX369_1) {
        this.DB400_DBX369_1 = DB400_DBX369_1;
    }

    public String getDB400_DBX369_2() {
        return DB400_DBX369_2;
    }

    public void setDB400_DBX369_2(String DB400_DBX369_2) {
        this.DB400_DBX369_2 = DB400_DBX369_2;
    }

    public String getDB400_DBX369_3() {
        return DB400_DBX369_3;
    }

    public void setDB400_DBX369_3(String DB400_DBX369_3) {
        this.DB400_DBX369_3 = DB400_DBX369_3;
    }

    public String getDB400_DBX369_4() {
        return DB400_DBX369_4;
    }

    public void setDB400_DBX369_4(String DB400_DBX369_4) {
        this.DB400_DBX369_4 = DB400_DBX369_4;
    }

    public String getDB400_DBX369_5() {
        return DB400_DBX369_5;
    }

    public void setDB400_DBX369_5(String DB400_DBX369_5) {
        this.DB400_DBX369_5 = DB400_DBX369_5;
    }

    public String getDB400_DBX369_6() {
        return DB400_DBX369_6;
    }

    public void setDB400_DBX369_6(String DB400_DBX369_6) {
        this.DB400_DBX369_6 = DB400_DBX369_6;
    }

    public String getDB400_DBX369_7() {
        return DB400_DBX369_7;
    }

    public void setDB400_DBX369_7(String DB400_DBX369_7) {
        this.DB400_DBX369_7 = DB400_DBX369_7;
    }

    public String getDB400_DBX370_0() {
        return DB400_DBX370_0;
    }

    public void setDB400_DBX370_0(String DB400_DBX370_0) {
        this.DB400_DBX370_0 = DB400_DBX370_0;
    }

    public String getDB400_DBX370_1() {
        return DB400_DBX370_1;
    }

    public void setDB400_DBX370_1(String DB400_DBX370_1) {
        this.DB400_DBX370_1 = DB400_DBX370_1;
    }

    public String getDB400_DBX370_2() {
        return DB400_DBX370_2;
    }

    public void setDB400_DBX370_2(String DB400_DBX370_2) {
        this.DB400_DBX370_2 = DB400_DBX370_2;
    }

    public String getDB400_DBX370_3() {
        return DB400_DBX370_3;
    }

    public void setDB400_DBX370_3(String DB400_DBX370_3) {
        this.DB400_DBX370_3 = DB400_DBX370_3;
    }

    public String getDB400_DBX370_4() {
        return DB400_DBX370_4;
    }

    public void setDB400_DBX370_4(String DB400_DBX370_4) {
        this.DB400_DBX370_4 = DB400_DBX370_4;
    }

    public String getDB400_DBX370_5() {
        return DB400_DBX370_5;
    }

    public void setDB400_DBX370_5(String DB400_DBX370_5) {
        this.DB400_DBX370_5 = DB400_DBX370_5;
    }

    public String getDB400_DBX370_6() {
        return DB400_DBX370_6;
    }

    public void setDB400_DBX370_6(String DB400_DBX370_6) {
        this.DB400_DBX370_6 = DB400_DBX370_6;
    }

    public String getDB400_DBX370_7() {
        return DB400_DBX370_7;
    }

    public void setDB400_DBX370_7(String DB400_DBX370_7) {
        this.DB400_DBX370_7 = DB400_DBX370_7;
    }

    public String getDB400_DBX371_0() {
        return DB400_DBX371_0;
    }

    public void setDB400_DBX371_0(String DB400_DBX371_0) {
        this.DB400_DBX371_0 = DB400_DBX371_0;
    }

    public String getDB400_DBX371_1() {
        return DB400_DBX371_1;
    }

    public void setDB400_DBX371_1(String DB400_DBX371_1) {
        this.DB400_DBX371_1 = DB400_DBX371_1;
    }

    public String getDB400_DBX371_2() {
        return DB400_DBX371_2;
    }

    public void setDB400_DBX371_2(String DB400_DBX371_2) {
        this.DB400_DBX371_2 = DB400_DBX371_2;
    }

    public String getDB400_DBX371_3() {
        return DB400_DBX371_3;
    }

    public void setDB400_DBX371_3(String DB400_DBX371_3) {
        this.DB400_DBX371_3 = DB400_DBX371_3;
    }

    public String getDB400_DBX371_4() {
        return DB400_DBX371_4;
    }

    public void setDB400_DBX371_4(String DB400_DBX371_4) {
        this.DB400_DBX371_4 = DB400_DBX371_4;
    }

    public String getDB400_DBX371_5() {
        return DB400_DBX371_5;
    }

    public void setDB400_DBX371_5(String DB400_DBX371_5) {
        this.DB400_DBX371_5 = DB400_DBX371_5;
    }

    public String getDB400_DBX371_6() {
        return DB400_DBX371_6;
    }

    public void setDB400_DBX371_6(String DB400_DBX371_6) {
        this.DB400_DBX371_6 = DB400_DBX371_6;
    }

    public String getDB400_DBX371_7() {
        return DB400_DBX371_7;
    }

    public void setDB400_DBX371_7(String DB400_DBX371_7) {
        this.DB400_DBX371_7 = DB400_DBX371_7;
    }

    public String getDB400_DBX372_0() {
        return DB400_DBX372_0;
    }

    public void setDB400_DBX372_0(String DB400_DBX372_0) {
        this.DB400_DBX372_0 = DB400_DBX372_0;
    }

    public String getDB400_DBX372_1() {
        return DB400_DBX372_1;
    }

    public void setDB400_DBX372_1(String DB400_DBX372_1) {
        this.DB400_DBX372_1 = DB400_DBX372_1;
    }

    public String getDB400_DBX374_0() {
        return DB400_DBX374_0;
    }

    public void setDB400_DBX374_0(String DB400_DBX374_0) {
        this.DB400_DBX374_0 = DB400_DBX374_0;
    }

    public String getDB400_DBX374_1() {
        return DB400_DBX374_1;
    }

    public void setDB400_DBX374_1(String DB400_DBX374_1) {
        this.DB400_DBX374_1 = DB400_DBX374_1;
    }

    public String getDB400_DBX374_2() {
        return DB400_DBX374_2;
    }

    public void setDB400_DBX374_2(String DB400_DBX374_2) {
        this.DB400_DBX374_2 = DB400_DBX374_2;
    }

    public String getDB400_DBX374_3() {
        return DB400_DBX374_3;
    }

    public void setDB400_DBX374_3(String DB400_DBX374_3) {
        this.DB400_DBX374_3 = DB400_DBX374_3;
    }

    public String getDB400_DBX374_4() {
        return DB400_DBX374_4;
    }

    public void setDB400_DBX374_4(String DB400_DBX374_4) {
        this.DB400_DBX374_4 = DB400_DBX374_4;
    }

    public String getDB400_DBX374_5() {
        return DB400_DBX374_5;
    }

    public void setDB400_DBX374_5(String DB400_DBX374_5) {
        this.DB400_DBX374_5 = DB400_DBX374_5;
    }

    public String getDB400_DBX374_6() {
        return DB400_DBX374_6;
    }

    public void setDB400_DBX374_6(String DB400_DBX374_6) {
        this.DB400_DBX374_6 = DB400_DBX374_6;
    }

    public String getDB400_DBX374_7() {
        return DB400_DBX374_7;
    }

    public void setDB400_DBX374_7(String DB400_DBX374_7) {
        this.DB400_DBX374_7 = DB400_DBX374_7;
    }

    public String getDB400_DBX376_0() {
        return DB400_DBX376_0;
    }

    public void setDB400_DBX376_0(String DB400_DBX376_0) {
        this.DB400_DBX376_0 = DB400_DBX376_0;
    }

    public String getDB400_DBX376_1() {
        return DB400_DBX376_1;
    }

    public void setDB400_DBX376_1(String DB400_DBX376_1) {
        this.DB400_DBX376_1 = DB400_DBX376_1;
    }

    public String getDB400_DBX376_2() {
        return DB400_DBX376_2;
    }

    public void setDB400_DBX376_2(String DB400_DBX376_2) {
        this.DB400_DBX376_2 = DB400_DBX376_2;
    }

    public String getDB400_DBX376_3() {
        return DB400_DBX376_3;
    }

    public void setDB400_DBX376_3(String DB400_DBX376_3) {
        this.DB400_DBX376_3 = DB400_DBX376_3;
    }

    public String getDB400_DBX376_4() {
        return DB400_DBX376_4;
    }

    public void setDB400_DBX376_4(String DB400_DBX376_4) {
        this.DB400_DBX376_4 = DB400_DBX376_4;
    }

    public String getDB400_DBX376_5() {
        return DB400_DBX376_5;
    }

    public void setDB400_DBX376_5(String DB400_DBX376_5) {
        this.DB400_DBX376_5 = DB400_DBX376_5;
    }

    public String getDB400_DBX4_0() {
        return DB400_DBX4_0;
    }

    public void setDB400_DBX4_0(String DB400_DBX4_0) {
        this.DB400_DBX4_0 = DB400_DBX4_0;
    }

    public String getDB400_DBX4_1() {
        return DB400_DBX4_1;
    }

    public void setDB400_DBX4_1(String DB400_DBX4_1) {
        this.DB400_DBX4_1 = DB400_DBX4_1;
    }

    public String getDB400_DBX4_2() {
        return DB400_DBX4_2;
    }

    public void setDB400_DBX4_2(String DB400_DBX4_2) {
        this.DB400_DBX4_2 = DB400_DBX4_2;
    }

    public String getDB400_DBX4_3() {
        return DB400_DBX4_3;
    }

    public void setDB400_DBX4_3(String DB400_DBX4_3) {
        this.DB400_DBX4_3 = DB400_DBX4_3;
    }

    public Date getDB400_DT438() {
        return DB400_DT438;
    }

    public void setDB400_DT438(Date DB400_DT438) {
        this.DB400_DT438 = DB400_DT438;
    }

    public Date getDB400_DT722() {
        return DB400_DT722;
    }

    public void setDB400_DT722(Date DB400_DT722) {
        this.DB400_DT722 = DB400_DT722;
    }
}
