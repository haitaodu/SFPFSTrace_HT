package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:28
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_PDOP15", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_PDOP15 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private java.util.Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String DB126DBX100;
    private String DB126DBX101;
    private String DB126DBX102;
    private String DB126DBX103;
    private String DB126DBX104;
    private String DB126DBX105;
    private String DB126DBX106;
    private String DB126DBX1300;
    private String DB126DBX1301;
    private String DB126DBX200;
    private String DB126DBX201;
    private String DB126DBX203;
    private String DB126DBX204;
    private String DB126DBX205;
    private String DB126DBX206;
    private String DB126DBX210;
    private String DB126DBX211;
    private String DB126DBX212;
    private String DB126DBX213;
    private String DB126DBX220;
    private String DB126DBX221;
    private String DB126DBX20;
    private String DB126DBX21;
    private String DB126DBX22;
    private String DB126DBX23;
    private String DB126DBX24;
    private String DB126DBX25;
    private String DB126DBX26;
    private String DB126DBX330;
    private String DB126DBX331;
    private String DB126DBX332;
    private String DB126DBX334;
    private String DB126DBX341;
    private String DB126DBX342;
    private String DB126DBX343;
    private String DB126DBX350;
    private String DB126DBX401;
    private String DB126DBX402;
    private String DB126DBX403;
    private String DB126DBX406;
    private String DB126DBX410;
    private String DB126DBX411;
    private String DB126DBX412;
    private String DB126DBX413;
    private String DB126DBX414;
    private String DB126DBX420;
    private String DB126DBX421;
    private String DB126DBX422;
    private String DB126DBX423;
    private String DB126DBX430;
    private String DB126DBX431;
    private String DB126DBX432;
    private String DB126DBX433;
    private String DB126DBX434;
    private String DB126DBX40;
    private String DB126DBX41;
    private String DB126DBX50;
    private String DB126DBX51;
    private String DB126DBX60;
    private String DB126DBX61;
    private String DB126DBX70;
    private String DB126DBX71;
    private String DB127DBX100;
    private String DB127DBX101;
    private String DB127DBX102;
    private String DB127DBX103;
    private String DB127DBX104;
    private String DB127DBX105;
    private String DB127DBX106;
    private String DB127DBX107;
    private String DB127DBX110;
    private String DB127DBX140;
    private String DB127DBX141;
    private String DB127DBX142;
    private String DB127DBX143;
    private String DB127DBX144;
    private String DB127DBX145;
    private String DB127DBX146;
    private String DB127DBX147;
    private String DB127DBX150;
    private String DB127DBX160;
    private String DB127DBX161;
    private String DB127DBX162;
    private String DB127DBX163;
    private String DB127DBX164;
    private String DB127DBX165;
    private String DB127DBX166;
    private String DB127DBX167;
    private String DB127DBX170;
    private String DB127DBX180;
    private String DB127DBX181;
    private String DB127DBX182;
    private String DB127DBX183;
    private String DB127DBX184;
    private String DB127DBX185;
    private String DB127DBX186;
    private String DB127DBX187;
    private String DB127DBX190;
    private String DB127DBX200;
    private String DB127DBX201;
    private String DB127DBX202;
    private String DB127DBX203;
    private String DB127DBX204;
    private String DB127DBX205;
    private String DB127DBX206;
    private String DB127DBX207;
    private String DB127DBX210;
    private String DB127DBX220;
    private String DB127DBX221;
    private String DB127DBX222;
    private String DB127DBX223;
    private String DB127DBX224;
    private String DB127DBX225;
    private String DB127DBX226;
    private String DB127DBX227;
    private String DB127DBX230;
    private String DB127DBX20;
    private String DB127DBX21;
    private String DB127DBX22;
    private String DB127DBX23;
    private String DB127DBX24;
    private String DB127DBX25;
    private String DB127DBX26;
    private String DB127DBX27;
    private String DB127DBX380;
    private String DB127DBX381;
    private String DB127DBX382;
    private String DB127DBX383;
    private String DB127DBX384;
    private String DB127DBX385;
    private String DB127DBX386;
    private String DB127DBX387;
    private String DB127DBX390;
    private String DB127DBX30;
    private String DB127DBX420;
    private String DB127DBX421;
    private String DB127DBX422;
    private String DB127DBX423;
    private String DB127DBX424;
    private String DB127DBX425;
    private String DB127DBX426;
    private String DB127DBX427;
    private String DB127DBX430;
    private String DB127DBX460;
    private String DB127DBX461;
    private String DB127DBX462;
    private String DB127DBX463;
    private String DB127DBX464;
    private String DB127DBX465;
    private String DB127DBX466;
    private String DB127DBX467;
    private String DB127DBX470;
    private String DB127DBX480;
    private String DB127DBX481;
    private String DB127DBX482;
    private String DB127DBX483;
    private String DB127DBX484;
    private String DB127DBX485;
    private String DB127DBX486;
    private String DB127DBX487;
    private String DB127DBX490;
    private String DB127DBX500;
    private String DB127DBX501;
    private String DB127DBX502;
    private String DB127DBX503;
    private String DB127DBX504;
    private String DB127DBX505;
    private String DB127DBX506;
    private String DB127DBX507;
    private String DB127DBX510;
    private String DB127DBX520;
    private String DB127DBX521;
    private String DB127DBX522;
    private String DB127DBX523;
    private String DB127DBX524;
    private String DB127DBX525;
    private String DB127DBX526;
    private String DB127DBX527;
    private String DB127DBX530;
    private String DB127DBX540;
    private String DB127DBX541;
    private String DB127DBX542;
    private String DB127DBX543;
    private String DB127DBX544;
    private String DB127DBX545;
    private String DB127DBX546;
    private String DB127DBX547;
    private String DB127DBX550;
    private String DB127DBX560;
    private String DB127DBX561;
    private String DB127DBX562;
    private String DB127DBX563;
    private String DB127DBX564;
    private String DB127DBX565;
    private String DB127DBX566;
    private String DB127DBX567;
    private String DB127DBX570;
    private String DB127DBX60;
    private String DB127DBX61;
    private String DB127DBX62;
    private String DB127DBX63;
    private String DB127DBX64;
    private String DB127DBX65;
    private String DB127DBX66;
    private String DB127DBX67;
    private String DB127DBX70;
    private String DB127DBX80;
    private String DB127DBX81;
    private String DB127DBX82;
    private String DB127DBX83;
    private String DB127DBX84;
    private String DB127DBX85;
    private String DB127DBX86;
    private String DB127DBX87;
    private String DB127DBX90;
    private String DB2000Db12;
    private String DB2000Db40;
    private String DB2000Db552;
    private Integer DB2000Dbw0;
    private Integer DB2000Dbw10;
    private Integer DB2000Dbw2;
    private Integer DB2000Dbw4;
    private Integer DB2000Dbw6;
    private Integer DB2000Dbw8;
    private String DB2000DBX10000;
    private String DB2000DBX10001;
    private String DB2000DBX10002;
    private String DB2000DBX10003;
    private String DB2000DBX10004;
    private String DB2000DBX10005;
    private String DB2000DBX10006;
    private String DB2000DBX10007;
    private String DB2000DBX11000;
    private String DB2000DBX11001;
    private String DB2000DBX11002;
    private String DB2000DBX11003;
    private String DB2000DBX11004;
    private String DB2000DBX11005;
    private String DB2000DBX11006;
    private String DB2000DBX11007;

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

    @Basic
    @Column(name = "DB126_DBX10_0", nullable = true, length = 2)
    public String getDb126DBX100() {
        return DB126DBX100;
    }

    public void setDb126DBX100(String DB126DBX100) {
        this.DB126DBX100 = DB126DBX100;
    }

    @Basic
    @Column(name = "DB126_DBX10_1", nullable = true, length = 2)
    public String getDb126DBX101() {
        return DB126DBX101;
    }

    public void setDb126DBX101(String DB126DBX101) {
        this.DB126DBX101 = DB126DBX101;
    }

    @Basic
    @Column(name = "DB126_DBX10_2", nullable = true, length = 2)
    public String getDb126DBX102() {
        return DB126DBX102;
    }

    public void setDb126DBX102(String DB126DBX102) {
        this.DB126DBX102 = DB126DBX102;
    }

    @Basic
    @Column(name = "DB126_DBX10_3", nullable = true, length = 2)
    public String getDb126DBX103() {
        return DB126DBX103;
    }

    public void setDb126DBX103(String DB126DBX103) {
        this.DB126DBX103 = DB126DBX103;
    }

    @Basic
    @Column(name = "DB126_DBX10_4", nullable = true, length = 2)
    public String getDb126DBX104() {
        return DB126DBX104;
    }

    public void setDb126DBX104(String DB126DBX104) {
        this.DB126DBX104 = DB126DBX104;
    }

    @Basic
    @Column(name = "DB126_DBX10_5", nullable = true, length = 2)
    public String getDb126DBX105() {
        return DB126DBX105;
    }

    public void setDb126DBX105(String DB126DBX105) {
        this.DB126DBX105 = DB126DBX105;
    }

    @Basic
    @Column(name = "DB126_DBX10_6", nullable = true, length = 2)
    public String getDb126DBX106() {
        return DB126DBX106;
    }

    public void setDb126DBX106(String DB126DBX106) {
        this.DB126DBX106 = DB126DBX106;
    }

    @Basic
    @Column(name = "DB126_DBX130_0", nullable = true, length = 2)
    public String getDb126DBX1300() {
        return DB126DBX1300;
    }

    public void setDb126DBX1300(String DB126DBX1300) {
        this.DB126DBX1300 = DB126DBX1300;
    }

    @Basic
    @Column(name = "DB126_DBX130_1", nullable = true, length = 2)
    public String getDb126DBX1301() {
        return DB126DBX1301;
    }

    public void setDb126DBX1301(String DB126DBX1301) {
        this.DB126DBX1301 = DB126DBX1301;
    }

    @Basic
    @Column(name = "DB126_DBX20_0", nullable = true, length = 2)
    public String getDb126DBX200() {
        return DB126DBX200;
    }

    public void setDb126DBX200(String DB126DBX200) {
        this.DB126DBX200 = DB126DBX200;
    }

    @Basic
    @Column(name = "DB126_DBX20_1", nullable = true, length = 2)
    public String getDb126DBX201() {
        return DB126DBX201;
    }

    public void setDb126DBX201(String DB126DBX201) {
        this.DB126DBX201 = DB126DBX201;
    }

    @Basic
    @Column(name = "DB126_DBX20_3", nullable = true, length = 2)
    public String getDb126DBX203() {
        return DB126DBX203;
    }

    public void setDb126DBX203(String DB126DBX203) {
        this.DB126DBX203 = DB126DBX203;
    }

    @Basic
    @Column(name = "DB126_DBX20_4", nullable = true, length = 2)
    public String getDb126DBX204() {
        return DB126DBX204;
    }

    public void setDb126DBX204(String DB126DBX204) {
        this.DB126DBX204 = DB126DBX204;
    }

    @Basic
    @Column(name = "DB126_DBX20_5", nullable = true, length = 2)
    public String getDb126DBX205() {
        return DB126DBX205;
    }

    public void setDb126DBX205(String DB126DBX205) {
        this.DB126DBX205 = DB126DBX205;
    }

    @Basic
    @Column(name = "DB126_DBX20_6", nullable = true, length = 2)
    public String getDb126DBX206() {
        return DB126DBX206;
    }

    public void setDb126DBX206(String DB126DBX206) {
        this.DB126DBX206 = DB126DBX206;
    }

    @Basic
    @Column(name = "DB126_DBX21_0", nullable = true, length = 2)
    public String getDb126DBX210() {
        return DB126DBX210;
    }

    public void setDb126DBX210(String DB126DBX210) {
        this.DB126DBX210 = DB126DBX210;
    }

    @Basic
    @Column(name = "DB126_DBX21_1", nullable = true, length = 2)
    public String getDb126DBX211() {
        return DB126DBX211;
    }

    public void setDb126DBX211(String DB126DBX211) {
        this.DB126DBX211 = DB126DBX211;
    }

    @Basic
    @Column(name = "DB126_DBX21_2", nullable = true, length = 2)
    public String getDb126DBX212() {
        return DB126DBX212;
    }

    public void setDb126DBX212(String DB126DBX212) {
        this.DB126DBX212 = DB126DBX212;
    }

    @Basic
    @Column(name = "DB126_DBX21_3", nullable = true, length = 2)
    public String getDb126DBX213() {
        return DB126DBX213;
    }

    public void setDb126DBX213(String DB126DBX213) {
        this.DB126DBX213 = DB126DBX213;
    }

    @Basic
    @Column(name = "DB126_DBX22_0", nullable = true, length = 2)
    public String getDb126DBX220() {
        return DB126DBX220;
    }

    public void setDb126DBX220(String DB126DBX220) {
        this.DB126DBX220 = DB126DBX220;
    }

    @Basic
    @Column(name = "DB126_DBX22_1", nullable = true, length = 2)
    public String getDb126DBX221() {
        return DB126DBX221;
    }

    public void setDb126DBX221(String DB126DBX221) {
        this.DB126DBX221 = DB126DBX221;
    }

    @Basic
    @Column(name = "DB126_DBX2_0", nullable = true, length = 2)
    public String getDb126DBX20() {
        return DB126DBX20;
    }

    public void setDb126DBX20(String DB126DBX20) {
        this.DB126DBX20 = DB126DBX20;
    }

    @Basic
    @Column(name = "DB126_DBX2_1", nullable = true, length = 2)
    public String getDb126DBX21() {
        return DB126DBX21;
    }

    public void setDb126DBX21(String DB126DBX21) {
        this.DB126DBX21 = DB126DBX21;
    }

    @Basic
    @Column(name = "DB126_DBX2_2", nullable = true, length = 2)
    public String getDb126DBX22() {
        return DB126DBX22;
    }

    public void setDb126DBX22(String DB126DBX22) {
        this.DB126DBX22 = DB126DBX22;
    }

    @Basic
    @Column(name = "DB126_DBX2_3", nullable = true, length = 2)
    public String getDb126DBX23() {
        return DB126DBX23;
    }

    public void setDb126DBX23(String DB126DBX23) {
        this.DB126DBX23 = DB126DBX23;
    }

    @Basic
    @Column(name = "DB126_DBX2_4", nullable = true, length = 2)
    public String getDb126DBX24() {
        return DB126DBX24;
    }

    public void setDb126DBX24(String DB126DBX24) {
        this.DB126DBX24 = DB126DBX24;
    }

    @Basic
    @Column(name = "DB126_DBX2_5", nullable = true, length = 2)
    public String getDb126DBX25() {
        return DB126DBX25;
    }

    public void setDb126DBX25(String DB126DBX25) {
        this.DB126DBX25 = DB126DBX25;
    }

    @Basic
    @Column(name = "DB126_DBX2_6", nullable = true, length = 2)
    public String getDb126DBX26() {
        return DB126DBX26;
    }

    public void setDb126DBX26(String DB126DBX26) {
        this.DB126DBX26 = DB126DBX26;
    }

    @Basic
    @Column(name = "DB126_DBX33_0", nullable = true, length = 2)
    public String getDb126DBX330() {
        return DB126DBX330;
    }

    public void setDb126DBX330(String DB126DBX330) {
        this.DB126DBX330 = DB126DBX330;
    }

    @Basic
    @Column(name = "DB126_DBX33_1", nullable = true, length = 2)
    public String getDb126DBX331() {
        return DB126DBX331;
    }

    public void setDb126DBX331(String DB126DBX331) {
        this.DB126DBX331 = DB126DBX331;
    }

    @Basic
    @Column(name = "DB126_DBX33_2", nullable = true, length = 2)
    public String getDb126DBX332() {
        return DB126DBX332;
    }

    public void setDb126DBX332(String DB126DBX332) {
        this.DB126DBX332 = DB126DBX332;
    }

    @Basic
    @Column(name = "DB126_DBX33_4", nullable = true, length = 2)
    public String getDb126DBX334() {
        return DB126DBX334;
    }

    public void setDb126DBX334(String DB126DBX334) {
        this.DB126DBX334 = DB126DBX334;
    }

    @Basic
    @Column(name = "DB126_DBX34_1", nullable = true, length = 2)
    public String getDb126DBX341() {
        return DB126DBX341;
    }

    public void setDb126DBX341(String DB126DBX341) {
        this.DB126DBX341 = DB126DBX341;
    }

    @Basic
    @Column(name = "DB126_DBX34_2", nullable = true, length = 2)
    public String getDb126DBX342() {
        return DB126DBX342;
    }

    public void setDb126DBX342(String DB126DBX342) {
        this.DB126DBX342 = DB126DBX342;
    }

    @Basic
    @Column(name = "DB126_DBX34_3", nullable = true, length = 2)
    public String getDb126DBX343() {
        return DB126DBX343;
    }

    public void setDb126DBX343(String DB126DBX343) {
        this.DB126DBX343 = DB126DBX343;
    }

    @Basic
    @Column(name = "DB126_DBX35_0", nullable = true, length = 2)
    public String getDb126DBX350() {
        return DB126DBX350;
    }

    public void setDb126DBX350(String DB126DBX350) {
        this.DB126DBX350 = DB126DBX350;
    }

    @Basic
    @Column(name = "DB126_DBX40_1", nullable = true, length = 2)
    public String getDb126DBX401() {
        return DB126DBX401;
    }

    public void setDb126DBX401(String DB126DBX401) {
        this.DB126DBX401 = DB126DBX401;
    }

    @Basic
    @Column(name = "DB126_DBX40_2", nullable = true, length = 2)
    public String getDb126DBX402() {
        return DB126DBX402;
    }

    public void setDb126DBX402(String DB126DBX402) {
        this.DB126DBX402 = DB126DBX402;
    }

    @Basic
    @Column(name = "DB126_DBX40_3", nullable = true, length = 2)
    public String getDb126DBX403() {
        return DB126DBX403;
    }

    public void setDb126DBX403(String DB126DBX403) {
        this.DB126DBX403 = DB126DBX403;
    }

    @Basic
    @Column(name = "DB126_DBX40_6", nullable = true, length = 2)
    public String getDb126DBX406() {
        return DB126DBX406;
    }

    public void setDb126DBX406(String DB126DBX406) {
        this.DB126DBX406 = DB126DBX406;
    }

    @Basic
    @Column(name = "DB126_DBX41_0", nullable = true, length = 2)
    public String getDb126DBX410() {
        return DB126DBX410;
    }

    public void setDb126DBX410(String DB126DBX410) {
        this.DB126DBX410 = DB126DBX410;
    }

    @Basic
    @Column(name = "DB126_DBX41_1", nullable = true, length = 2)
    public String getDb126DBX411() {
        return DB126DBX411;
    }

    public void setDb126DBX411(String DB126DBX411) {
        this.DB126DBX411 = DB126DBX411;
    }

    @Basic
    @Column(name = "DB126_DBX41_2", nullable = true, length = 2)
    public String getDb126DBX412() {
        return DB126DBX412;
    }

    public void setDb126DBX412(String DB126DBX412) {
        this.DB126DBX412 = DB126DBX412;
    }

    @Basic
    @Column(name = "DB126_DBX41_3", nullable = true, length = 2)
    public String getDb126DBX413() {
        return DB126DBX413;
    }

    public void setDb126DBX413(String DB126DBX413) {
        this.DB126DBX413 = DB126DBX413;
    }

    @Basic
    @Column(name = "DB126_DBX41_4", nullable = true, length = 2)
    public String getDb126DBX414() {
        return DB126DBX414;
    }

    public void setDb126DBX414(String DB126DBX414) {
        this.DB126DBX414 = DB126DBX414;
    }

    @Basic
    @Column(name = "DB126_DBX42_0", nullable = true, length = 2)
    public String getDb126DBX420() {
        return DB126DBX420;
    }

    public void setDb126DBX420(String DB126DBX420) {
        this.DB126DBX420 = DB126DBX420;
    }

    @Basic
    @Column(name = "DB126_DBX42_1", nullable = true, length = 2)
    public String getDb126DBX421() {
        return DB126DBX421;
    }

    public void setDb126DBX421(String DB126DBX421) {
        this.DB126DBX421 = DB126DBX421;
    }

    @Basic
    @Column(name = "DB126_DBX42_2", nullable = true, length = 2)
    public String getDb126DBX422() {
        return DB126DBX422;
    }

    public void setDb126DBX422(String DB126DBX422) {
        this.DB126DBX422 = DB126DBX422;
    }

    @Basic
    @Column(name = "DB126_DBX42_3", nullable = true, length = 2)
    public String getDb126DBX423() {
        return DB126DBX423;
    }

    public void setDb126DBX423(String DB126DBX423) {
        this.DB126DBX423 = DB126DBX423;
    }

    @Basic
    @Column(name = "DB126_DBX43_0", nullable = true, length = 2)
    public String getDb126DBX430() {
        return DB126DBX430;
    }

    public void setDb126DBX430(String DB126DBX430) {
        this.DB126DBX430 = DB126DBX430;
    }

    @Basic
    @Column(name = "DB126_DBX43_1", nullable = true, length = 2)
    public String getDb126DBX431() {
        return DB126DBX431;
    }

    public void setDb126DBX431(String DB126DBX431) {
        this.DB126DBX431 = DB126DBX431;
    }

    @Basic
    @Column(name = "DB126_DBX43_2", nullable = true, length = 2)
    public String getDb126DBX432() {
        return DB126DBX432;
    }

    public void setDb126DBX432(String DB126DBX432) {
        this.DB126DBX432 = DB126DBX432;
    }

    @Basic
    @Column(name = "DB126_DBX43_3", nullable = true, length = 2)
    public String getDb126DBX433() {
        return DB126DBX433;
    }

    public void setDb126DBX433(String DB126DBX433) {
        this.DB126DBX433 = DB126DBX433;
    }

    @Basic
    @Column(name = "DB126_DBX43_4", nullable = true, length = 2)
    public String getDb126DBX434() {
        return DB126DBX434;
    }

    public void setDb126DBX434(String DB126DBX434) {
        this.DB126DBX434 = DB126DBX434;
    }

    @Basic
    @Column(name = "DB126_DBX4_0", nullable = true, length = 2)
    public String getDb126DBX40() {
        return DB126DBX40;
    }

    public void setDb126DBX40(String DB126DBX40) {
        this.DB126DBX40 = DB126DBX40;
    }

    @Basic
    @Column(name = "DB126_DBX4_1", nullable = true, length = 2)
    public String getDb126DBX41() {
        return DB126DBX41;
    }

    public void setDb126DBX41(String DB126DBX41) {
        this.DB126DBX41 = DB126DBX41;
    }

    @Basic
    @Column(name = "DB126_DBX5_0", nullable = true, length = 2)
    public String getDb126DBX50() {
        return DB126DBX50;
    }

    public void setDb126DBX50(String DB126DBX50) {
        this.DB126DBX50 = DB126DBX50;
    }

    @Basic
    @Column(name = "DB126_DBX5_1", nullable = true, length = 2)
    public String getDb126DBX51() {
        return DB126DBX51;
    }

    public void setDb126DBX51(String DB126DBX51) {
        this.DB126DBX51 = DB126DBX51;
    }

    @Basic
    @Column(name = "DB126_DBX6_0", nullable = true, length = 2)
    public String getDb126DBX60() {
        return DB126DBX60;
    }

    public void setDb126DBX60(String DB126DBX60) {
        this.DB126DBX60 = DB126DBX60;
    }

    @Basic
    @Column(name = "DB126_DBX6_1", nullable = true, length = 2)
    public String getDb126DBX61() {
        return DB126DBX61;
    }

    public void setDb126DBX61(String DB126DBX61) {
        this.DB126DBX61 = DB126DBX61;
    }

    @Basic
    @Column(name = "DB126_DBX7_0", nullable = true, length = 2)
    public String getDb126DBX70() {
        return DB126DBX70;
    }

    public void setDb126DBX70(String DB126DBX70) {
        this.DB126DBX70 = DB126DBX70;
    }

    @Basic
    @Column(name = "DB126_DBX7_1", nullable = true, length = 2)
    public String getDb126DBX71() {
        return DB126DBX71;
    }

    public void setDb126DBX71(String DB126DBX71) {
        this.DB126DBX71 = DB126DBX71;
    }

    @Basic
    @Column(name = "DB127_DBX10_0", nullable = true, length = 2)
    public String getDb127DBX100() {
        return DB127DBX100;
    }

    public void setDb127DBX100(String DB127DBX100) {
        this.DB127DBX100 = DB127DBX100;
    }

    @Basic
    @Column(name = "DB127_DBX10_1", nullable = true, length = 2)
    public String getDb127DBX101() {
        return DB127DBX101;
    }

    public void setDb127DBX101(String DB127DBX101) {
        this.DB127DBX101 = DB127DBX101;
    }

    @Basic
    @Column(name = "DB127_DBX10_2", nullable = true, length = 2)
    public String getDb127DBX102() {
        return DB127DBX102;
    }

    public void setDb127DBX102(String DB127DBX102) {
        this.DB127DBX102 = DB127DBX102;
    }

    @Basic
    @Column(name = "DB127_DBX10_3", nullable = true, length = 2)
    public String getDb127DBX103() {
        return DB127DBX103;
    }

    public void setDb127DBX103(String DB127DBX103) {
        this.DB127DBX103 = DB127DBX103;
    }

    @Basic
    @Column(name = "DB127_DBX10_4", nullable = true, length = 2)
    public String getDb127DBX104() {
        return DB127DBX104;
    }

    public void setDb127DBX104(String DB127DBX104) {
        this.DB127DBX104 = DB127DBX104;
    }

    @Basic
    @Column(name = "DB127_DBX10_5", nullable = true, length = 2)
    public String getDb127DBX105() {
        return DB127DBX105;
    }

    public void setDb127DBX105(String DB127DBX105) {
        this.DB127DBX105 = DB127DBX105;
    }

    @Basic
    @Column(name = "DB127_DBX10_6", nullable = true, length = 2)
    public String getDb127DBX106() {
        return DB127DBX106;
    }

    public void setDb127DBX106(String DB127DBX106) {
        this.DB127DBX106 = DB127DBX106;
    }

    @Basic
    @Column(name = "DB127_DBX10_7", nullable = true, length = 2)
    public String getDb127DBX107() {
        return DB127DBX107;
    }

    public void setDb127DBX107(String DB127DBX107) {
        this.DB127DBX107 = DB127DBX107;
    }

    @Basic
    @Column(name = "DB127_DBX11_0", nullable = true, length = 2)
    public String getDb127DBX110() {
        return DB127DBX110;
    }

    public void setDb127DBX110(String DB127DBX110) {
        this.DB127DBX110 = DB127DBX110;
    }

    @Basic
    @Column(name = "DB127_DBX14_0", nullable = true, length = 2)
    public String getDb127DBX140() {
        return DB127DBX140;
    }

    public void setDb127DBX140(String DB127DBX140) {
        this.DB127DBX140 = DB127DBX140;
    }

    @Basic
    @Column(name = "DB127_DBX14_1", nullable = true, length = 2)
    public String getDb127DBX141() {
        return DB127DBX141;
    }

    public void setDb127DBX141(String DB127DBX141) {
        this.DB127DBX141 = DB127DBX141;
    }

    @Basic
    @Column(name = "DB127_DBX14_2", nullable = true, length = 2)
    public String getDb127DBX142() {
        return DB127DBX142;
    }

    public void setDb127DBX142(String DB127DBX142) {
        this.DB127DBX142 = DB127DBX142;
    }

    @Basic
    @Column(name = "DB127_DBX14_3", nullable = true, length = 2)
    public String getDb127DBX143() {
        return DB127DBX143;
    }

    public void setDb127DBX143(String DB127DBX143) {
        this.DB127DBX143 = DB127DBX143;
    }

    @Basic
    @Column(name = "DB127_DBX14_4", nullable = true, length = 2)
    public String getDb127DBX144() {
        return DB127DBX144;
    }

    public void setDb127DBX144(String DB127DBX144) {
        this.DB127DBX144 = DB127DBX144;
    }

    @Basic
    @Column(name = "DB127_DBX14_5", nullable = true, length = 2)
    public String getDb127DBX145() {
        return DB127DBX145;
    }

    public void setDb127DBX145(String DB127DBX145) {
        this.DB127DBX145 = DB127DBX145;
    }

    @Basic
    @Column(name = "DB127_DBX14_6", nullable = true, length = 2)
    public String getDb127DBX146() {
        return DB127DBX146;
    }

    public void setDb127DBX146(String DB127DBX146) {
        this.DB127DBX146 = DB127DBX146;
    }

    @Basic
    @Column(name = "DB127_DBX14_7", nullable = true, length = 2)
    public String getDb127DBX147() {
        return DB127DBX147;
    }

    public void setDb127DBX147(String DB127DBX147) {
        this.DB127DBX147 = DB127DBX147;
    }

    @Basic
    @Column(name = "DB127_DBX15_0", nullable = true, length = 2)
    public String getDb127DBX150() {
        return DB127DBX150;
    }

    public void setDb127DBX150(String DB127DBX150) {
        this.DB127DBX150 = DB127DBX150;
    }

    @Basic
    @Column(name = "DB127_DBX16_0", nullable = true, length = 2)
    public String getDb127DBX160() {
        return DB127DBX160;
    }

    public void setDb127DBX160(String DB127DBX160) {
        this.DB127DBX160 = DB127DBX160;
    }

    @Basic
    @Column(name = "DB127_DBX16_1", nullable = true, length = 2)
    public String getDb127DBX161() {
        return DB127DBX161;
    }

    public void setDb127DBX161(String DB127DBX161) {
        this.DB127DBX161 = DB127DBX161;
    }

    @Basic
    @Column(name = "DB127_DBX16_2", nullable = true, length = 2)
    public String getDb127DBX162() {
        return DB127DBX162;
    }

    public void setDb127DBX162(String DB127DBX162) {
        this.DB127DBX162 = DB127DBX162;
    }

    @Basic
    @Column(name = "DB127_DBX16_3", nullable = true, length = 2)
    public String getDb127DBX163() {
        return DB127DBX163;
    }

    public void setDb127DBX163(String DB127DBX163) {
        this.DB127DBX163 = DB127DBX163;
    }

    @Basic
    @Column(name = "DB127_DBX16_4", nullable = true, length = 2)
    public String getDb127DBX164() {
        return DB127DBX164;
    }

    public void setDb127DBX164(String DB127DBX164) {
        this.DB127DBX164 = DB127DBX164;
    }

    @Basic
    @Column(name = "DB127_DBX16_5", nullable = true, length = 2)
    public String getDb127DBX165() {
        return DB127DBX165;
    }

    public void setDb127DBX165(String DB127DBX165) {
        this.DB127DBX165 = DB127DBX165;
    }

    @Basic
    @Column(name = "DB127_DBX16_6", nullable = true, length = 2)
    public String getDb127DBX166() {
        return DB127DBX166;
    }

    public void setDb127DBX166(String DB127DBX166) {
        this.DB127DBX166 = DB127DBX166;
    }

    @Basic
    @Column(name = "DB127_DBX16_7", nullable = true, length = 2)
    public String getDb127DBX167() {
        return DB127DBX167;
    }

    public void setDb127DBX167(String DB127DBX167) {
        this.DB127DBX167 = DB127DBX167;
    }

    @Basic
    @Column(name = "DB127_DBX17_0", nullable = true, length = 2)
    public String getDb127DBX170() {
        return DB127DBX170;
    }

    public void setDb127DBX170(String DB127DBX170) {
        this.DB127DBX170 = DB127DBX170;
    }

    @Basic
    @Column(name = "DB127_DBX18_0", nullable = true, length = 2)
    public String getDb127DBX180() {
        return DB127DBX180;
    }

    public void setDb127DBX180(String DB127DBX180) {
        this.DB127DBX180 = DB127DBX180;
    }

    @Basic
    @Column(name = "DB127_DBX18_1", nullable = true, length = 2)
    public String getDb127DBX181() {
        return DB127DBX181;
    }

    public void setDb127DBX181(String DB127DBX181) {
        this.DB127DBX181 = DB127DBX181;
    }

    @Basic
    @Column(name = "DB127_DBX18_2", nullable = true, length = 2)
    public String getDb127DBX182() {
        return DB127DBX182;
    }

    public void setDb127DBX182(String DB127DBX182) {
        this.DB127DBX182 = DB127DBX182;
    }

    @Basic
    @Column(name = "DB127_DBX18_3", nullable = true, length = 2)
    public String getDb127DBX183() {
        return DB127DBX183;
    }

    public void setDb127DBX183(String DB127DBX183) {
        this.DB127DBX183 = DB127DBX183;
    }

    @Basic
    @Column(name = "DB127_DBX18_4", nullable = true, length = 2)
    public String getDb127DBX184() {
        return DB127DBX184;
    }

    public void setDb127DBX184(String DB127DBX184) {
        this.DB127DBX184 = DB127DBX184;
    }

    @Basic
    @Column(name = "DB127_DBX18_5", nullable = true, length = 2)
    public String getDb127DBX185() {
        return DB127DBX185;
    }

    public void setDb127DBX185(String DB127DBX185) {
        this.DB127DBX185 = DB127DBX185;
    }

    @Basic
    @Column(name = "DB127_DBX18_6", nullable = true, length = 2)
    public String getDb127DBX186() {
        return DB127DBX186;
    }

    public void setDb127DBX186(String DB127DBX186) {
        this.DB127DBX186 = DB127DBX186;
    }

    @Basic
    @Column(name = "DB127_DBX18_7", nullable = true, length = 2)
    public String getDb127DBX187() {
        return DB127DBX187;
    }

    public void setDb127DBX187(String DB127DBX187) {
        this.DB127DBX187 = DB127DBX187;
    }

    @Basic
    @Column(name = "DB127_DBX19_0", nullable = true, length = 2)
    public String getDb127DBX190() {
        return DB127DBX190;
    }

    public void setDb127DBX190(String DB127DBX190) {
        this.DB127DBX190 = DB127DBX190;
    }

    @Basic
    @Column(name = "DB127_DBX20_0", nullable = true, length = 2)
    public String getDb127DBX200() {
        return DB127DBX200;
    }

    public void setDb127DBX200(String DB127DBX200) {
        this.DB127DBX200 = DB127DBX200;
    }

    @Basic
    @Column(name = "DB127_DBX20_1", nullable = true, length = 2)
    public String getDb127DBX201() {
        return DB127DBX201;
    }

    public void setDb127DBX201(String DB127DBX201) {
        this.DB127DBX201 = DB127DBX201;
    }

    @Basic
    @Column(name = "DB127_DBX20_2", nullable = true, length = 2)
    public String getDb127DBX202() {
        return DB127DBX202;
    }

    public void setDb127DBX202(String DB127DBX202) {
        this.DB127DBX202 = DB127DBX202;
    }

    @Basic
    @Column(name = "DB127_DBX20_3", nullable = true, length = 2)
    public String getDb127DBX203() {
        return DB127DBX203;
    }

    public void setDb127DBX203(String DB127DBX203) {
        this.DB127DBX203 = DB127DBX203;
    }

    @Basic
    @Column(name = "DB127_DBX20_4", nullable = true, length = 2)
    public String getDb127DBX204() {
        return DB127DBX204;
    }

    public void setDb127DBX204(String DB127DBX204) {
        this.DB127DBX204 = DB127DBX204;
    }

    @Basic
    @Column(name = "DB127_DBX20_5", nullable = true, length = 2)
    public String getDb127DBX205() {
        return DB127DBX205;
    }

    public void setDb127DBX205(String DB127DBX205) {
        this.DB127DBX205 = DB127DBX205;
    }

    @Basic
    @Column(name = "DB127_DBX20_6", nullable = true, length = 2)
    public String getDb127DBX206() {
        return DB127DBX206;
    }

    public void setDb127DBX206(String DB127DBX206) {
        this.DB127DBX206 = DB127DBX206;
    }

    @Basic
    @Column(name = "DB127_DBX20_7", nullable = true, length = 2)
    public String getDb127DBX207() {
        return DB127DBX207;
    }

    public void setDb127DBX207(String DB127DBX207) {
        this.DB127DBX207 = DB127DBX207;
    }

    @Basic
    @Column(name = "DB127_DBX21_0", nullable = true, length = 2)
    public String getDb127DBX210() {
        return DB127DBX210;
    }

    public void setDb127DBX210(String DB127DBX210) {
        this.DB127DBX210 = DB127DBX210;
    }

    @Basic
    @Column(name = "DB127_DBX22_0", nullable = true, length = 2)
    public String getDb127DBX220() {
        return DB127DBX220;
    }

    public void setDb127DBX220(String DB127DBX220) {
        this.DB127DBX220 = DB127DBX220;
    }

    @Basic
    @Column(name = "DB127_DBX22_1", nullable = true, length = 2)
    public String getDb127DBX221() {
        return DB127DBX221;
    }

    public void setDb127DBX221(String DB127DBX221) {
        this.DB127DBX221 = DB127DBX221;
    }

    @Basic
    @Column(name = "DB127_DBX22_2", nullable = true, length = 2)
    public String getDb127DBX222() {
        return DB127DBX222;
    }

    public void setDb127DBX222(String DB127DBX222) {
        this.DB127DBX222 = DB127DBX222;
    }

    @Basic
    @Column(name = "DB127_DBX22_3", nullable = true, length = 2)
    public String getDb127DBX223() {
        return DB127DBX223;
    }

    public void setDb127DBX223(String DB127DBX223) {
        this.DB127DBX223 = DB127DBX223;
    }

    @Basic
    @Column(name = "DB127_DBX22_4", nullable = true, length = 2)
    public String getDb127DBX224() {
        return DB127DBX224;
    }

    public void setDb127DBX224(String DB127DBX224) {
        this.DB127DBX224 = DB127DBX224;
    }

    @Basic
    @Column(name = "DB127_DBX22_5", nullable = true, length = 2)
    public String getDb127DBX225() {
        return DB127DBX225;
    }

    public void setDb127DBX225(String DB127DBX225) {
        this.DB127DBX225 = DB127DBX225;
    }

    @Basic
    @Column(name = "DB127_DBX22_6", nullable = true, length = 2)
    public String getDb127DBX226() {
        return DB127DBX226;
    }

    public void setDb127DBX226(String DB127DBX226) {
        this.DB127DBX226 = DB127DBX226;
    }

    @Basic
    @Column(name = "DB127_DBX22_7", nullable = true, length = 2)
    public String getDb127DBX227() {
        return DB127DBX227;
    }

    public void setDb127DBX227(String DB127DBX227) {
        this.DB127DBX227 = DB127DBX227;
    }

    @Basic
    @Column(name = "DB127_DBX23_0", nullable = true, length = 2)
    public String getDb127DBX230() {
        return DB127DBX230;
    }

    public void setDb127DBX230(String DB127DBX230) {
        this.DB127DBX230 = DB127DBX230;
    }

    @Basic
    @Column(name = "DB127_DBX2_0", nullable = true, length = 2)
    public String getDb127DBX20() {
        return DB127DBX20;
    }

    public void setDb127DBX20(String DB127DBX20) {
        this.DB127DBX20 = DB127DBX20;
    }

    @Basic
    @Column(name = "DB127_DBX2_1", nullable = true, length = 2)
    public String getDb127DBX21() {
        return DB127DBX21;
    }

    public void setDb127DBX21(String DB127DBX21) {
        this.DB127DBX21 = DB127DBX21;
    }

    @Basic
    @Column(name = "DB127_DBX2_2", nullable = true, length = 2)
    public String getDb127DBX22() {
        return DB127DBX22;
    }

    public void setDb127DBX22(String DB127DBX22) {
        this.DB127DBX22 = DB127DBX22;
    }

    @Basic
    @Column(name = "DB127_DBX2_3", nullable = true, length = 2)
    public String getDb127DBX23() {
        return DB127DBX23;
    }

    public void setDb127DBX23(String DB127DBX23) {
        this.DB127DBX23 = DB127DBX23;
    }

    @Basic
    @Column(name = "DB127_DBX2_4", nullable = true, length = 2)
    public String getDb127DBX24() {
        return DB127DBX24;
    }

    public void setDb127DBX24(String DB127DBX24) {
        this.DB127DBX24 = DB127DBX24;
    }

    @Basic
    @Column(name = "DB127_DBX2_5", nullable = true, length = 2)
    public String getDb127DBX25() {
        return DB127DBX25;
    }

    public void setDb127DBX25(String DB127DBX25) {
        this.DB127DBX25 = DB127DBX25;
    }

    @Basic
    @Column(name = "DB127_DBX2_6", nullable = true, length = 2)
    public String getDb127DBX26() {
        return DB127DBX26;
    }

    public void setDb127DBX26(String DB127DBX26) {
        this.DB127DBX26 = DB127DBX26;
    }

    @Basic
    @Column(name = "DB127_DBX2_7", nullable = true, length = 2)
    public String getDb127DBX27() {
        return DB127DBX27;
    }

    public void setDb127DBX27(String DB127DBX27) {
        this.DB127DBX27 = DB127DBX27;
    }

    @Basic
    @Column(name = "DB127_DBX38_0", nullable = true, length = 2)
    public String getDb127DBX380() {
        return DB127DBX380;
    }

    public void setDb127DBX380(String DB127DBX380) {
        this.DB127DBX380 = DB127DBX380;
    }

    @Basic
    @Column(name = "DB127_DBX38_1", nullable = true, length = 2)
    public String getDb127DBX381() {
        return DB127DBX381;
    }

    public void setDb127DBX381(String DB127DBX381) {
        this.DB127DBX381 = DB127DBX381;
    }

    @Basic
    @Column(name = "DB127_DBX38_2", nullable = true, length = 2)
    public String getDb127DBX382() {
        return DB127DBX382;
    }

    public void setDb127DBX382(String DB127DBX382) {
        this.DB127DBX382 = DB127DBX382;
    }

    @Basic
    @Column(name = "DB127_DBX38_3", nullable = true, length = 2)
    public String getDb127DBX383() {
        return DB127DBX383;
    }

    public void setDb127DBX383(String DB127DBX383) {
        this.DB127DBX383 = DB127DBX383;
    }

    @Basic
    @Column(name = "DB127_DBX38_4", nullable = true, length = 2)
    public String getDb127DBX384() {
        return DB127DBX384;
    }

    public void setDb127DBX384(String DB127DBX384) {
        this.DB127DBX384 = DB127DBX384;
    }

    @Basic
    @Column(name = "DB127_DBX38_5", nullable = true, length = 2)
    public String getDb127DBX385() {
        return DB127DBX385;
    }

    public void setDb127DBX385(String DB127DBX385) {
        this.DB127DBX385 = DB127DBX385;
    }

    @Basic
    @Column(name = "DB127_DBX38_6", nullable = true, length = 2)
    public String getDb127DBX386() {
        return DB127DBX386;
    }

    public void setDb127DBX386(String DB127DBX386) {
        this.DB127DBX386 = DB127DBX386;
    }

    @Basic
    @Column(name = "DB127_DBX38_7", nullable = true, length = 2)
    public String getDb127DBX387() {
        return DB127DBX387;
    }

    public void setDb127DBX387(String DB127DBX387) {
        this.DB127DBX387 = DB127DBX387;
    }

    @Basic
    @Column(name = "DB127_DBX39_0", nullable = true, length = 2)
    public String getDb127DBX390() {
        return DB127DBX390;
    }

    public void setDb127DBX390(String DB127DBX390) {
        this.DB127DBX390 = DB127DBX390;
    }

    @Basic
    @Column(name = "DB127_DBX3_0", nullable = true, length = 2)
    public String getDb127DBX30() {
        return DB127DBX30;
    }

    public void setDb127DBX30(String DB127DBX30) {
        this.DB127DBX30 = DB127DBX30;
    }

    @Basic
    @Column(name = "DB127_DBX42_0", nullable = true, length = 2)
    public String getDb127DBX420() {
        return DB127DBX420;
    }

    public void setDb127DBX420(String DB127DBX420) {
        this.DB127DBX420 = DB127DBX420;
    }

    @Basic
    @Column(name = "DB127_DBX42_1", nullable = true, length = 2)
    public String getDb127DBX421() {
        return DB127DBX421;
    }

    public void setDb127DBX421(String DB127DBX421) {
        this.DB127DBX421 = DB127DBX421;
    }

    @Basic
    @Column(name = "DB127_DBX42_2", nullable = true, length = 2)
    public String getDb127DBX422() {
        return DB127DBX422;
    }

    public void setDb127DBX422(String DB127DBX422) {
        this.DB127DBX422 = DB127DBX422;
    }

    @Basic
    @Column(name = "DB127_DBX42_3", nullable = true, length = 2)
    public String getDb127DBX423() {
        return DB127DBX423;
    }

    public void setDb127DBX423(String DB127DBX423) {
        this.DB127DBX423 = DB127DBX423;
    }

    @Basic
    @Column(name = "DB127_DBX42_4", nullable = true, length = 2)
    public String getDb127DBX424() {
        return DB127DBX424;
    }

    public void setDb127DBX424(String DB127DBX424) {
        this.DB127DBX424 = DB127DBX424;
    }

    @Basic
    @Column(name = "DB127_DBX42_5", nullable = true, length = 2)
    public String getDb127DBX425() {
        return DB127DBX425;
    }

    public void setDb127DBX425(String DB127DBX425) {
        this.DB127DBX425 = DB127DBX425;
    }

    @Basic
    @Column(name = "DB127_DBX42_6", nullable = true, length = 2)
    public String getDb127DBX426() {
        return DB127DBX426;
    }

    public void setDb127DBX426(String DB127DBX426) {
        this.DB127DBX426 = DB127DBX426;
    }

    @Basic
    @Column(name = "DB127_DBX42_7", nullable = true, length = 2)
    public String getDb127DBX427() {
        return DB127DBX427;
    }

    public void setDb127DBX427(String DB127DBX427) {
        this.DB127DBX427 = DB127DBX427;
    }

    @Basic
    @Column(name = "DB127_DBX43_0", nullable = true, length = 2)
    public String getDb127DBX430() {
        return DB127DBX430;
    }

    public void setDb127DBX430(String DB127DBX430) {
        this.DB127DBX430 = DB127DBX430;
    }

    @Basic
    @Column(name = "DB127_DBX46_0", nullable = true, length = 2)
    public String getDb127DBX460() {
        return DB127DBX460;
    }

    public void setDb127DBX460(String DB127DBX460) {
        this.DB127DBX460 = DB127DBX460;
    }

    @Basic
    @Column(name = "DB127_DBX46_1", nullable = true, length = 2)
    public String getDb127DBX461() {
        return DB127DBX461;
    }

    public void setDb127DBX461(String DB127DBX461) {
        this.DB127DBX461 = DB127DBX461;
    }

    @Basic
    @Column(name = "DB127_DBX46_2", nullable = true, length = 2)
    public String getDb127DBX462() {
        return DB127DBX462;
    }

    public void setDb127DBX462(String DB127DBX462) {
        this.DB127DBX462 = DB127DBX462;
    }

    @Basic
    @Column(name = "DB127_DBX46_3", nullable = true, length = 2)
    public String getDb127DBX463() {
        return DB127DBX463;
    }

    public void setDb127DBX463(String DB127DBX463) {
        this.DB127DBX463 = DB127DBX463;
    }

    @Basic
    @Column(name = "DB127_DBX46_4", nullable = true, length = 2)
    public String getDb127DBX464() {
        return DB127DBX464;
    }

    public void setDb127DBX464(String DB127DBX464) {
        this.DB127DBX464 = DB127DBX464;
    }

    @Basic
    @Column(name = "DB127_DBX46_5", nullable = true, length = 2)
    public String getDb127DBX465() {
        return DB127DBX465;
    }

    public void setDb127DBX465(String DB127DBX465) {
        this.DB127DBX465 = DB127DBX465;
    }

    @Basic
    @Column(name = "DB127_DBX46_6", nullable = true, length = 2)
    public String getDb127DBX466() {
        return DB127DBX466;
    }

    public void setDb127DBX466(String DB127DBX466) {
        this.DB127DBX466 = DB127DBX466;
    }

    @Basic
    @Column(name = "DB127_DBX46_7", nullable = true, length = 2)
    public String getDb127DBX467() {
        return DB127DBX467;
    }

    public void setDb127DBX467(String DB127DBX467) {
        this.DB127DBX467 = DB127DBX467;
    }

    @Basic
    @Column(name = "DB127_DBX47_0", nullable = true, length = 2)
    public String getDb127DBX470() {
        return DB127DBX470;
    }

    public void setDb127DBX470(String DB127DBX470) {
        this.DB127DBX470 = DB127DBX470;
    }

    @Basic
    @Column(name = "DB127_DBX48_0", nullable = true, length = 2)
    public String getDb127DBX480() {
        return DB127DBX480;
    }

    public void setDb127DBX480(String DB127DBX480) {
        this.DB127DBX480 = DB127DBX480;
    }

    @Basic
    @Column(name = "DB127_DBX48_1", nullable = true, length = 2)
    public String getDb127DBX481() {
        return DB127DBX481;
    }

    public void setDb127DBX481(String DB127DBX481) {
        this.DB127DBX481 = DB127DBX481;
    }

    @Basic
    @Column(name = "DB127_DBX48_2", nullable = true, length = 2)
    public String getDb127DBX482() {
        return DB127DBX482;
    }

    public void setDb127DBX482(String DB127DBX482) {
        this.DB127DBX482 = DB127DBX482;
    }

    @Basic
    @Column(name = "DB127_DBX48_3", nullable = true, length = 2)
    public String getDb127DBX483() {
        return DB127DBX483;
    }

    public void setDb127DBX483(String DB127DBX483) {
        this.DB127DBX483 = DB127DBX483;
    }

    @Basic
    @Column(name = "DB127_DBX48_4", nullable = true, length = 2)
    public String getDb127DBX484() {
        return DB127DBX484;
    }

    public void setDb127DBX484(String DB127DBX484) {
        this.DB127DBX484 = DB127DBX484;
    }

    @Basic
    @Column(name = "DB127_DBX48_5", nullable = true, length = 2)
    public String getDb127DBX485() {
        return DB127DBX485;
    }

    public void setDb127DBX485(String DB127DBX485) {
        this.DB127DBX485 = DB127DBX485;
    }

    @Basic
    @Column(name = "DB127_DBX48_6", nullable = true, length = 2)
    public String getDb127DBX486() {
        return DB127DBX486;
    }

    public void setDb127DBX486(String DB127DBX486) {
        this.DB127DBX486 = DB127DBX486;
    }

    @Basic
    @Column(name = "DB127_DBX48_7", nullable = true, length = 2)
    public String getDb127DBX487() {
        return DB127DBX487;
    }

    public void setDb127DBX487(String DB127DBX487) {
        this.DB127DBX487 = DB127DBX487;
    }

    @Basic
    @Column(name = "DB127_DBX49_0", nullable = true, length = 2)
    public String getDb127DBX490() {
        return DB127DBX490;
    }

    public void setDb127DBX490(String DB127DBX490) {
        this.DB127DBX490 = DB127DBX490;
    }

    @Basic
    @Column(name = "DB127_DBX50_0", nullable = true, length = 2)
    public String getDb127DBX500() {
        return DB127DBX500;
    }

    public void setDb127DBX500(String DB127DBX500) {
        this.DB127DBX500 = DB127DBX500;
    }

    @Basic
    @Column(name = "DB127_DBX50_1", nullable = true, length = 2)
    public String getDb127DBX501() {
        return DB127DBX501;
    }

    public void setDb127DBX501(String DB127DBX501) {
        this.DB127DBX501 = DB127DBX501;
    }

    @Basic
    @Column(name = "DB127_DBX50_2", nullable = true, length = 2)
    public String getDb127DBX502() {
        return DB127DBX502;
    }

    public void setDb127DBX502(String DB127DBX502) {
        this.DB127DBX502 = DB127DBX502;
    }

    @Basic
    @Column(name = "DB127_DBX50_3", nullable = true, length = 2)
    public String getDb127DBX503() {
        return DB127DBX503;
    }

    public void setDb127DBX503(String DB127DBX503) {
        this.DB127DBX503 = DB127DBX503;
    }

    @Basic
    @Column(name = "DB127_DBX50_4", nullable = true, length = 2)
    public String getDb127DBX504() {
        return DB127DBX504;
    }

    public void setDb127DBX504(String DB127DBX504) {
        this.DB127DBX504 = DB127DBX504;
    }

    @Basic
    @Column(name = "DB127_DBX50_5", nullable = true, length = 2)
    public String getDb127DBX505() {
        return DB127DBX505;
    }

    public void setDb127DBX505(String DB127DBX505) {
        this.DB127DBX505 = DB127DBX505;
    }

    @Basic
    @Column(name = "DB127_DBX50_6", nullable = true, length = 2)
    public String getDb127DBX506() {
        return DB127DBX506;
    }

    public void setDb127DBX506(String DB127DBX506) {
        this.DB127DBX506 = DB127DBX506;
    }

    @Basic
    @Column(name = "DB127_DBX50_7", nullable = true, length = 2)
    public String getDb127DBX507() {
        return DB127DBX507;
    }

    public void setDb127DBX507(String DB127DBX507) {
        this.DB127DBX507 = DB127DBX507;
    }

    @Basic
    @Column(name = "DB127_DBX51_0", nullable = true, length = 2)
    public String getDb127DBX510() {
        return DB127DBX510;
    }

    public void setDb127DBX510(String DB127DBX510) {
        this.DB127DBX510 = DB127DBX510;
    }

    @Basic
    @Column(name = "DB127_DBX52_0", nullable = true, length = 2)
    public String getDb127DBX520() {
        return DB127DBX520;
    }

    public void setDb127DBX520(String DB127DBX520) {
        this.DB127DBX520 = DB127DBX520;
    }

    @Basic
    @Column(name = "DB127_DBX52_1", nullable = true, length = 2)
    public String getDb127DBX521() {
        return DB127DBX521;
    }

    public void setDb127DBX521(String DB127DBX521) {
        this.DB127DBX521 = DB127DBX521;
    }

    @Basic
    @Column(name = "DB127_DBX52_2", nullable = true, length = 2)
    public String getDb127DBX522() {
        return DB127DBX522;
    }

    public void setDb127DBX522(String DB127DBX522) {
        this.DB127DBX522 = DB127DBX522;
    }

    @Basic
    @Column(name = "DB127_DBX52_3", nullable = true, length = 2)
    public String getDb127DBX523() {
        return DB127DBX523;
    }

    public void setDb127DBX523(String DB127DBX523) {
        this.DB127DBX523 = DB127DBX523;
    }

    @Basic
    @Column(name = "DB127_DBX52_4", nullable = true, length = 2)
    public String getDb127DBX524() {
        return DB127DBX524;
    }

    public void setDb127DBX524(String DB127DBX524) {
        this.DB127DBX524 = DB127DBX524;
    }

    @Basic
    @Column(name = "DB127_DBX52_5", nullable = true, length = 2)
    public String getDb127DBX525() {
        return DB127DBX525;
    }

    public void setDb127DBX525(String DB127DBX525) {
        this.DB127DBX525 = DB127DBX525;
    }

    @Basic
    @Column(name = "DB127_DBX52_6", nullable = true, length = 2)
    public String getDb127DBX526() {
        return DB127DBX526;
    }

    public void setDb127DBX526(String DB127DBX526) {
        this.DB127DBX526 = DB127DBX526;
    }

    @Basic
    @Column(name = "DB127_DBX52_7", nullable = true, length = 2)
    public String getDb127DBX527() {
        return DB127DBX527;
    }

    public void setDb127DBX527(String DB127DBX527) {
        this.DB127DBX527 = DB127DBX527;
    }

    @Basic
    @Column(name = "DB127_DBX53_0", nullable = true, length = 2)
    public String getDb127DBX530() {
        return DB127DBX530;
    }

    public void setDb127DBX530(String DB127DBX530) {
        this.DB127DBX530 = DB127DBX530;
    }

    @Basic
    @Column(name = "DB127_DBX54_0", nullable = true, length = 2)
    public String getDb127DBX540() {
        return DB127DBX540;
    }

    public void setDb127DBX540(String DB127DBX540) {
        this.DB127DBX540 = DB127DBX540;
    }

    @Basic
    @Column(name = "DB127_DBX54_1", nullable = true, length = 2)
    public String getDb127DBX541() {
        return DB127DBX541;
    }

    public void setDb127DBX541(String DB127DBX541) {
        this.DB127DBX541 = DB127DBX541;
    }

    @Basic
    @Column(name = "DB127_DBX54_2", nullable = true, length = 2)
    public String getDb127DBX542() {
        return DB127DBX542;
    }

    public void setDb127DBX542(String DB127DBX542) {
        this.DB127DBX542 = DB127DBX542;
    }

    @Basic
    @Column(name = "DB127_DBX54_3", nullable = true, length = 2)
    public String getDb127DBX543() {
        return DB127DBX543;
    }

    public void setDb127DBX543(String DB127DBX543) {
        this.DB127DBX543 = DB127DBX543;
    }

    @Basic
    @Column(name = "DB127_DBX54_4", nullable = true, length = 2)
    public String getDb127DBX544() {
        return DB127DBX544;
    }

    public void setDb127DBX544(String DB127DBX544) {
        this.DB127DBX544 = DB127DBX544;
    }

    @Basic
    @Column(name = "DB127_DBX54_5", nullable = true, length = 2)
    public String getDb127DBX545() {
        return DB127DBX545;
    }

    public void setDb127DBX545(String DB127DBX545) {
        this.DB127DBX545 = DB127DBX545;
    }

    @Basic
    @Column(name = "DB127_DBX54_6", nullable = true, length = 2)
    public String getDb127DBX546() {
        return DB127DBX546;
    }

    public void setDb127DBX546(String DB127DBX546) {
        this.DB127DBX546 = DB127DBX546;
    }

    @Basic
    @Column(name = "DB127_DBX54_7", nullable = true, length = 2)
    public String getDb127DBX547() {
        return DB127DBX547;
    }

    public void setDb127DBX547(String DB127DBX547) {
        this.DB127DBX547 = DB127DBX547;
    }

    @Basic
    @Column(name = "DB127_DBX55_0", nullable = true, length = 2)
    public String getDb127DBX550() {
        return DB127DBX550;
    }

    public void setDb127DBX550(String DB127DBX550) {
        this.DB127DBX550 = DB127DBX550;
    }

    @Basic
    @Column(name = "DB127_DBX56_0", nullable = true, length = 2)
    public String getDb127DBX560() {
        return DB127DBX560;
    }

    public void setDb127DBX560(String DB127DBX560) {
        this.DB127DBX560 = DB127DBX560;
    }

    @Basic
    @Column(name = "DB127_DBX56_1", nullable = true, length = 2)
    public String getDb127DBX561() {
        return DB127DBX561;
    }

    public void setDb127DBX561(String DB127DBX561) {
        this.DB127DBX561 = DB127DBX561;
    }

    @Basic
    @Column(name = "DB127_DBX56_2", nullable = true, length = 2)
    public String getDb127DBX562() {
        return DB127DBX562;
    }

    public void setDb127DBX562(String DB127DBX562) {
        this.DB127DBX562 = DB127DBX562;
    }

    @Basic
    @Column(name = "DB127_DBX56_3", nullable = true, length = 2)
    public String getDb127DBX563() {
        return DB127DBX563;
    }

    public void setDb127DBX563(String DB127DBX563) {
        this.DB127DBX563 = DB127DBX563;
    }

    @Basic
    @Column(name = "DB127_DBX56_4", nullable = true, length = 2)
    public String getDb127DBX564() {
        return DB127DBX564;
    }

    public void setDb127DBX564(String DB127DBX564) {
        this.DB127DBX564 = DB127DBX564;
    }

    @Basic
    @Column(name = "DB127_DBX56_5", nullable = true, length = 2)
    public String getDb127DBX565() {
        return DB127DBX565;
    }

    public void setDb127DBX565(String DB127DBX565) {
        this.DB127DBX565 = DB127DBX565;
    }

    @Basic
    @Column(name = "DB127_DBX56_6", nullable = true, length = 2)
    public String getDb127DBX566() {
        return DB127DBX566;
    }

    public void setDb127DBX566(String DB127DBX566) {
        this.DB127DBX566 = DB127DBX566;
    }

    @Basic
    @Column(name = "DB127_DBX56_7", nullable = true, length = 2)
    public String getDb127DBX567() {
        return DB127DBX567;
    }

    public void setDb127DBX567(String DB127DBX567) {
        this.DB127DBX567 = DB127DBX567;
    }

    @Basic
    @Column(name = "DB127_DBX57_0", nullable = true, length = 2)
    public String getDb127DBX570() {
        return DB127DBX570;
    }

    public void setDb127DBX570(String DB127DBX570) {
        this.DB127DBX570 = DB127DBX570;
    }

    @Basic
    @Column(name = "DB127_DBX6_0", nullable = true, length = 2)
    public String getDb127DBX60() {
        return DB127DBX60;
    }

    public void setDb127DBX60(String DB127DBX60) {
        this.DB127DBX60 = DB127DBX60;
    }

    @Basic
    @Column(name = "DB127_DBX6_1", nullable = true, length = 2)
    public String getDb127DBX61() {
        return DB127DBX61;
    }

    public void setDb127DBX61(String DB127DBX61) {
        this.DB127DBX61 = DB127DBX61;
    }

    @Basic
    @Column(name = "DB127_DBX6_2", nullable = true, length = 2)
    public String getDb127DBX62() {
        return DB127DBX62;
    }

    public void setDb127DBX62(String DB127DBX62) {
        this.DB127DBX62 = DB127DBX62;
    }

    @Basic
    @Column(name = "DB127_DBX6_3", nullable = true, length = 2)
    public String getDb127DBX63() {
        return DB127DBX63;
    }

    public void setDb127DBX63(String DB127DBX63) {
        this.DB127DBX63 = DB127DBX63;
    }

    @Basic
    @Column(name = "DB127_DBX6_4", nullable = true, length = 2)
    public String getDb127DBX64() {
        return DB127DBX64;
    }

    public void setDb127DBX64(String DB127DBX64) {
        this.DB127DBX64 = DB127DBX64;
    }

    @Basic
    @Column(name = "DB127_DBX6_5", nullable = true, length = 2)
    public String getDb127DBX65() {
        return DB127DBX65;
    }

    public void setDb127DBX65(String DB127DBX65) {
        this.DB127DBX65 = DB127DBX65;
    }

    @Basic
    @Column(name = "DB127_DBX6_6", nullable = true, length = 2)
    public String getDb127DBX66() {
        return DB127DBX66;
    }

    public void setDb127DBX66(String DB127DBX66) {
        this.DB127DBX66 = DB127DBX66;
    }

    @Basic
    @Column(name = "DB127_DBX6_7", nullable = true, length = 2)
    public String getDb127DBX67() {
        return DB127DBX67;
    }

    public void setDb127DBX67(String DB127DBX67) {
        this.DB127DBX67 = DB127DBX67;
    }

    @Basic
    @Column(name = "DB127_DBX7_0", nullable = true, length = 2)
    public String getDb127DBX70() {
        return DB127DBX70;
    }

    public void setDb127DBX70(String DB127DBX70) {
        this.DB127DBX70 = DB127DBX70;
    }

    @Basic
    @Column(name = "DB127_DBX8_0", nullable = true, length = 2)
    public String getDb127DBX80() {
        return DB127DBX80;
    }

    public void setDb127DBX80(String DB127DBX80) {
        this.DB127DBX80 = DB127DBX80;
    }

    @Basic
    @Column(name = "DB127_DBX8_1", nullable = true, length = 2)
    public String getDb127DBX81() {
        return DB127DBX81;
    }

    public void setDb127DBX81(String DB127DBX81) {
        this.DB127DBX81 = DB127DBX81;
    }

    @Basic
    @Column(name = "DB127_DBX8_2", nullable = true, length = 2)
    public String getDb127DBX82() {
        return DB127DBX82;
    }

    public void setDb127DBX82(String DB127DBX82) {
        this.DB127DBX82 = DB127DBX82;
    }

    @Basic
    @Column(name = "DB127_DBX8_3", nullable = true, length = 2)
    public String getDb127DBX83() {
        return DB127DBX83;
    }

    public void setDb127DBX83(String DB127DBX83) {
        this.DB127DBX83 = DB127DBX83;
    }

    @Basic
    @Column(name = "DB127_DBX8_4", nullable = true, length = 2)
    public String getDb127DBX84() {
        return DB127DBX84;
    }

    public void setDb127DBX84(String DB127DBX84) {
        this.DB127DBX84 = DB127DBX84;
    }

    @Basic
    @Column(name = "DB127_DBX8_5", nullable = true, length = 2)
    public String getDb127DBX85() {
        return DB127DBX85;
    }

    public void setDb127DBX85(String DB127DBX85) {
        this.DB127DBX85 = DB127DBX85;
    }

    @Basic
    @Column(name = "DB127_DBX8_6", nullable = true, length = 2)
    public String getDb127DBX86() {
        return DB127DBX86;
    }

    public void setDb127DBX86(String DB127DBX86) {
        this.DB127DBX86 = DB127DBX86;
    }

    @Basic
    @Column(name = "DB127_DBX8_7", nullable = true, length = 2)
    public String getDb127DBX87() {
        return DB127DBX87;
    }

    public void setDb127DBX87(String DB127DBX87) {
        this.DB127DBX87 = DB127DBX87;
    }

    @Basic
    @Column(name = "DB127_DBX9_0", nullable = true, length = 2)
    public String getDb127DBX90() {
        return DB127DBX90;
    }

    public void setDb127DBX90(String DB127DBX90) {
        this.DB127DBX90 = DB127DBX90;
    }

    @Basic
    @Column(name = "DB2000_DB12", nullable = true, length = 4000)
    public String getDb2000Db12() {
        return DB2000Db12;
    }

    public void setDb2000Db12(String DB2000Db12) {
        this.DB2000Db12 = DB2000Db12;
    }

    @Basic
    @Column(name = "DB2000_DB40", nullable = true, length = 4000)
    public String getDb2000Db40() {
        return DB2000Db40;
    }

    public void setDb2000Db40(String DB2000Db40) {
        this.DB2000Db40 = DB2000Db40;
    }

    @Basic
    @Column(name = "DB2000_DB552", nullable = true, length = 4000)
    public String getDb2000Db552() {
        return DB2000Db552;
    }

    public void setDb2000Db552(String DB2000Db552) {
        this.DB2000Db552 = DB2000Db552;
    }

    @Basic
    @Column(name = "DB2000_DBW0", nullable = true, precision = 0)
    public Integer getDb2000Dbw0() {
        return DB2000Dbw0;
    }

    public void setDb2000Dbw0(Integer DB2000Dbw0) {
        this.DB2000Dbw0 = DB2000Dbw0;
    }

    @Basic
    @Column(name = "DB2000_DBW10", nullable = true, precision = 0)
    public Integer getDb2000Dbw10() {
        return DB2000Dbw10;
    }

    public void setDb2000Dbw10(Integer DB2000Dbw10) {
        this.DB2000Dbw10 = DB2000Dbw10;
    }

    @Basic
    @Column(name = "DB2000_DBW2", nullable = true, precision = 0)
    public Integer getDb2000Dbw2() {
        return DB2000Dbw2;
    }

    public void setDb2000Dbw2(Integer DB2000Dbw2) {
        this.DB2000Dbw2 = DB2000Dbw2;
    }

    @Basic
    @Column(name = "DB2000_DBW4", nullable = true, precision = 0)
    public Integer getDb2000Dbw4() {
        return DB2000Dbw4;
    }

    public void setDb2000Dbw4(Integer DB2000Dbw4) {
        this.DB2000Dbw4 = DB2000Dbw4;
    }

    @Basic
    @Column(name = "DB2000_DBW6", nullable = true, precision = 0)
    public Integer getDb2000Dbw6() {
        return DB2000Dbw6;
    }

    public void setDb2000Dbw6(Integer DB2000Dbw6) {
        this.DB2000Dbw6 = DB2000Dbw6;
    }

    @Basic
    @Column(name = "DB2000_DBW8", nullable = true, precision = 0)
    public Integer getDb2000Dbw8() {
        return DB2000Dbw8;
    }

    public void setDb2000Dbw8(Integer DB2000Dbw8) {
        this.DB2000Dbw8 = DB2000Dbw8;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_0", nullable = true, length = 2)
    public String getDb2000DBX10000() {
        return DB2000DBX10000;
    }

    public void setDb2000DBX10000(String DB2000DBX10000) {
        this.DB2000DBX10000 = DB2000DBX10000;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_1", nullable = true, length = 2)
    public String getDb2000DBX10001() {
        return DB2000DBX10001;
    }

    public void setDb2000DBX10001(String DB2000DBX10001) {
        this.DB2000DBX10001 = DB2000DBX10001;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_2", nullable = true, length = 2)
    public String getDb2000DBX10002() {
        return DB2000DBX10002;
    }

    public void setDb2000DBX10002(String DB2000DBX10002) {
        this.DB2000DBX10002 = DB2000DBX10002;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_3", nullable = true, length = 2)
    public String getDb2000DBX10003() {
        return DB2000DBX10003;
    }

    public void setDb2000DBX10003(String DB2000DBX10003) {
        this.DB2000DBX10003 = DB2000DBX10003;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_4", nullable = true, length = 2)
    public String getDb2000DBX10004() {
        return DB2000DBX10004;
    }

    public void setDb2000DBX10004(String DB2000DBX10004) {
        this.DB2000DBX10004 = DB2000DBX10004;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_5", nullable = true, length = 2)
    public String getDb2000DBX10005() {
        return DB2000DBX10005;
    }

    public void setDb2000DBX10005(String DB2000DBX10005) {
        this.DB2000DBX10005 = DB2000DBX10005;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_6", nullable = true, length = 2)
    public String getDb2000DBX10006() {
        return DB2000DBX10006;
    }

    public void setDb2000DBX10006(String DB2000DBX10006) {
        this.DB2000DBX10006 = DB2000DBX10006;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_7", nullable = true, length = 2)
    public String getDb2000DBX10007() {
        return DB2000DBX10007;
    }

    public void setDb2000DBX10007(String DB2000DBX10007) {
        this.DB2000DBX10007 = DB2000DBX10007;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_0", nullable = true, length = 2)
    public String getDb2000DBX11000() {
        return DB2000DBX11000;
    }

    public void setDb2000DBX11000(String DB2000DBX11000) {
        this.DB2000DBX11000 = DB2000DBX11000;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_1", nullable = true, length = 2)
    public String getDb2000DBX11001() {
        return DB2000DBX11001;
    }

    public void setDb2000DBX11001(String DB2000DBX11001) {
        this.DB2000DBX11001 = DB2000DBX11001;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_2", nullable = true, length = 2)
    public String getDb2000DBX11002() {
        return DB2000DBX11002;
    }

    public void setDb2000DBX11002(String DB2000DBX11002) {
        this.DB2000DBX11002 = DB2000DBX11002;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_3", nullable = true, length = 2)
    public String getDb2000DBX11003() {
        return DB2000DBX11003;
    }

    public void setDb2000DBX11003(String DB2000DBX11003) {
        this.DB2000DBX11003 = DB2000DBX11003;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_4", nullable = true, length = 2)
    public String getDb2000DBX11004() {
        return DB2000DBX11004;
    }

    public void setDb2000DBX11004(String DB2000DBX11004) {
        this.DB2000DBX11004 = DB2000DBX11004;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_5", nullable = true, length = 2)
    public String getDb2000DBX11005() {
        return DB2000DBX11005;
    }

    public void setDb2000DBX11005(String DB2000DBX11005) {
        this.DB2000DBX11005 = DB2000DBX11005;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_6", nullable = true, length = 2)
    public String getDb2000DBX11006() {
        return DB2000DBX11006;
    }

    public void setDb2000DBX11006(String DB2000DBX11006) {
        this.DB2000DBX11006 = DB2000DBX11006;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_7", nullable = true, length = 2)
    public String getDb2000DBX11007() {
        return DB2000DBX11007;
    }

    public void setDb2000DBX11007(String DB2000DBX11007) {
        this.DB2000DBX11007 = DB2000DBX11007;
    }


}
