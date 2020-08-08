package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:19
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_FCOP23", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_FCOP23 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String uuid;
    private Date createDate;
    private String isSynch;
    private String db126Dbx100;
    private String db126Dbx101;
    private String db126Dbx102;
    private String db126Dbx103;
    private String db126Dbx104;
    private String db126Dbx105;
    private String db126Dbx1300;
    private String db126Dbx203;
    private String db126Dbx204;
    private String db126Dbx205;
    private String db126Dbx206;
    private String db126Dbx210;
    private String db126Dbx211;
    private String db126Dbx212;
    private String db126Dbx213;
    private String db126Dbx220;
    private String db126Dbx221;
    private String db126Dbx20;
    private String db126Dbx21;
    private String db126Dbx22;
    private String db126Dbx23;
    private String db126Dbx24;
    private String db126Dbx25;
    private String db126Dbx26;
    private String db126Dbx330;
    private String db126Dbx331;
    private String db126Dbx334;
    private String db126Dbx341;
    private String db126Dbx342;
    private String db126Dbx343;
    private String db126Dbx350;
    private String db126Dbx401;
    private String db126Dbx402;
    private String db126Dbx403;
    private String db126Dbx406;
    private String db126Dbx410;
    private String db126Dbx411;
    private String db126Dbx412;
    private String db126Dbx413;
    private String db126Dbx414;
    private String db126Dbx420;
    private String db126Dbx421;
    private String db126Dbx422;
    private String db126Dbx423;
    private String db126Dbx40;
    private String db126Dbx41;
    private String db126Dbx50;
    private String db126Dbx51;
    private String db126Dbx60;
    private String db126Dbx61;
    private String db126Dbx70;
    private String db126Dbx71;
    private String db127Dbx140;
    private String db127Dbx141;
    private String db127Dbx142;
    private String db127Dbx143;
    private String db127Dbx144;
    private String db127Dbx145;
    private String db127Dbx146;
    private String db127Dbx147;
    private String db127Dbx150;
    private String db127Dbx160;
    private String db127Dbx161;
    private String db127Dbx162;
    private String db127Dbx163;
    private String db127Dbx164;
    private String db127Dbx165;
    private String db127Dbx166;
    private String db127Dbx167;
    private String db127Dbx170;
    private String db127Dbx180;
    private String db127Dbx181;
    private String db127Dbx182;
    private String db127Dbx183;
    private String db127Dbx184;
    private String db127Dbx185;
    private String db127Dbx186;
    private String db127Dbx187;
    private String db127Dbx190;
    private String db127Dbx220;
    private String db127Dbx221;
    private String db127Dbx222;
    private String db127Dbx223;
    private String db127Dbx224;
    private String db127Dbx225;
    private String db127Dbx226;
    private String db127Dbx227;
    private String db127Dbx230;
    private String db127Dbx240;
    private String db127Dbx241;
    private String db127Dbx242;
    private String db127Dbx243;
    private String db127Dbx244;
    private String db127Dbx245;
    private String db127Dbx246;
    private String db127Dbx247;
    private String db127Dbx250;
    private String db127Dbx20;
    private String db127Dbx21;
    private String db127Dbx22;
    private String db127Dbx23;
    private String db127Dbx24;
    private String db127Dbx25;
    private String db127Dbx26;
    private String db127Dbx27;
    private String db127Dbx380;
    private String db127Dbx381;
    private String db127Dbx382;
    private String db127Dbx383;
    private String db127Dbx384;
    private String db127Dbx385;
    private String db127Dbx386;
    private String db127Dbx387;
    private String db127Dbx390;
    private String db127Dbx30;
    private String db127Dbx420;
    private String db127Dbx421;
    private String db127Dbx422;
    private String db127Dbx423;
    private String db127Dbx424;
    private String db127Dbx425;
    private String db127Dbx426;
    private String db127Dbx427;
    private String db127Dbx430;
    private String db127Dbx460;
    private String db127Dbx461;
    private String db127Dbx462;
    private String db127Dbx463;
    private String db127Dbx464;
    private String db127Dbx465;
    private String db127Dbx466;
    private String db127Dbx467;
    private String db127Dbx470;
    private String db127Dbx480;
    private String db127Dbx481;
    private String db127Dbx482;
    private String db127Dbx483;
    private String db127Dbx484;
    private String db127Dbx485;
    private String db127Dbx486;
    private String db127Dbx487;
    private String db127Dbx490;
    private String db127Dbx500;
    private String db127Dbx501;
    private String db127Dbx502;
    private String db127Dbx503;
    private String db127Dbx504;
    private String db127Dbx505;
    private String db127Dbx506;
    private String db127Dbx507;
    private String db127Dbx510;
    private String db127Dbx520;
    private String db127Dbx521;
    private String db127Dbx522;
    private String db127Dbx523;
    private String db127Dbx524;
    private String db127Dbx525;
    private String db127Dbx526;
    private String db127Dbx527;
    private String db127Dbx530;
    private String db127Dbx540;
    private String db127Dbx541;
    private String db127Dbx542;
    private String db127Dbx543;
    private String db127Dbx544;
    private String db127Dbx545;
    private String db127Dbx546;
    private String db127Dbx547;
    private String db127Dbx550;
    private String db127Dbx560;
    private String db127Dbx561;
    private String db127Dbx562;
    private String db127Dbx563;
    private String db127Dbx564;
    private String db127Dbx565;
    private String db127Dbx566;
    private String db127Dbx567;
    private String db127Dbx570;
    private String db127Dbx60;
    private String db127Dbx61;
    private String db127Dbx62;
    private String db127Dbx63;
    private String db127Dbx64;
    private String db127Dbx65;
    private String db127Dbx66;
    private String db127Dbx67;
    private String db127Dbx70;
    private String db127Dbx80;
    private String db127Dbx81;
    private String db127Dbx82;
    private String db127Dbx83;
    private String db127Dbx84;
    private String db127Dbx85;
    private String db127Dbx86;
    private String db127Dbx87;
    private String db127Dbx90;
    private String db2000Db12;
    private String db2000Db40;
    private String db2000Db552;
    private Integer db2000Dbw0;
    private Integer db2000Dbw10;
    private Integer db2000Dbw2;
    private Integer db2000Dbw4;
    private Integer db2000Dbw6;
    private Integer db2000Dbw8;
    private String db2000Dbx10000;
    private String db2000Dbx10001;
    private String db2000Dbx10002;
    private String db2000Dbx10003;
    private String db2000Dbx10004;
    private String db2000Dbx10005;
    private String db2000Dbx10006;
    private String db2000Dbx10007;
    private String db2000Dbx11000;
    private String db2000Dbx11001;
    private String db2000Dbx11002;
    private String db2000Dbx11003;
    private String db2000Dbx11004;
    private String db2000Dbx11005;
    private String db2000Dbx11006;
    private String db2000Dbx11007;

    @Id
    @Column(name = "UUID", nullable = false, length = 32)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "IS_SYNCH", nullable = true, length = 2)
    public String getIsSynch() {
        return isSynch;
    }

    public void setIsSynch(String isSynch) {
        this.isSynch = isSynch;
    }

    @Basic
    @Column(name = "DB126_DBX10_0", nullable = true, length = 2)
    public String getDb126Dbx100() {
        return db126Dbx100;
    }

    public void setDb126Dbx100(String db126Dbx100) {
        this.db126Dbx100 = db126Dbx100;
    }

    @Basic
    @Column(name = "DB126_DBX10_1", nullable = true, length = 2)
    public String getDb126Dbx101() {
        return db126Dbx101;
    }

    public void setDb126Dbx101(String db126Dbx101) {
        this.db126Dbx101 = db126Dbx101;
    }

    @Basic
    @Column(name = "DB126_DBX10_2", nullable = true, length = 2)
    public String getDb126Dbx102() {
        return db126Dbx102;
    }

    public void setDb126Dbx102(String db126Dbx102) {
        this.db126Dbx102 = db126Dbx102;
    }

    @Basic
    @Column(name = "DB126_DBX10_3", nullable = true, length = 2)
    public String getDb126Dbx103() {
        return db126Dbx103;
    }

    public void setDb126Dbx103(String db126Dbx103) {
        this.db126Dbx103 = db126Dbx103;
    }

    @Basic
    @Column(name = "DB126_DBX10_4", nullable = true, length = 2)
    public String getDb126Dbx104() {
        return db126Dbx104;
    }

    public void setDb126Dbx104(String db126Dbx104) {
        this.db126Dbx104 = db126Dbx104;
    }

    @Basic
    @Column(name = "DB126_DBX10_5", nullable = true, length = 2)
    public String getDb126Dbx105() {
        return db126Dbx105;
    }

    public void setDb126Dbx105(String db126Dbx105) {
        this.db126Dbx105 = db126Dbx105;
    }

    @Basic
    @Column(name = "DB126_DBX130_0", nullable = true, length = 2)
    public String getDb126Dbx1300() {
        return db126Dbx1300;
    }

    public void setDb126Dbx1300(String db126Dbx1300) {
        this.db126Dbx1300 = db126Dbx1300;
    }

    @Basic
    @Column(name = "DB126_DBX20_3", nullable = true, length = 2)
    public String getDb126Dbx203() {
        return db126Dbx203;
    }

    public void setDb126Dbx203(String db126Dbx203) {
        this.db126Dbx203 = db126Dbx203;
    }

    @Basic
    @Column(name = "DB126_DBX20_4", nullable = true, length = 2)
    public String getDb126Dbx204() {
        return db126Dbx204;
    }

    public void setDb126Dbx204(String db126Dbx204) {
        this.db126Dbx204 = db126Dbx204;
    }

    @Basic
    @Column(name = "DB126_DBX20_5", nullable = true, length = 2)
    public String getDb126Dbx205() {
        return db126Dbx205;
    }

    public void setDb126Dbx205(String db126Dbx205) {
        this.db126Dbx205 = db126Dbx205;
    }

    @Basic
    @Column(name = "DB126_DBX20_6", nullable = true, length = 2)
    public String getDb126Dbx206() {
        return db126Dbx206;
    }

    public void setDb126Dbx206(String db126Dbx206) {
        this.db126Dbx206 = db126Dbx206;
    }

    @Basic
    @Column(name = "DB126_DBX21_0", nullable = true, length = 2)
    public String getDb126Dbx210() {
        return db126Dbx210;
    }

    public void setDb126Dbx210(String db126Dbx210) {
        this.db126Dbx210 = db126Dbx210;
    }

    @Basic
    @Column(name = "DB126_DBX21_1", nullable = true, length = 2)
    public String getDb126Dbx211() {
        return db126Dbx211;
    }

    public void setDb126Dbx211(String db126Dbx211) {
        this.db126Dbx211 = db126Dbx211;
    }

    @Basic
    @Column(name = "DB126_DBX21_2", nullable = true, length = 2)
    public String getDb126Dbx212() {
        return db126Dbx212;
    }

    public void setDb126Dbx212(String db126Dbx212) {
        this.db126Dbx212 = db126Dbx212;
    }

    @Basic
    @Column(name = "DB126_DBX21_3", nullable = true, length = 2)
    public String getDb126Dbx213() {
        return db126Dbx213;
    }

    public void setDb126Dbx213(String db126Dbx213) {
        this.db126Dbx213 = db126Dbx213;
    }

    @Basic
    @Column(name = "DB126_DBX22_0", nullable = true, length = 2)
    public String getDb126Dbx220() {
        return db126Dbx220;
    }

    public void setDb126Dbx220(String db126Dbx220) {
        this.db126Dbx220 = db126Dbx220;
    }

    @Basic
    @Column(name = "DB126_DBX22_1", nullable = true, length = 2)
    public String getDb126Dbx221() {
        return db126Dbx221;
    }

    public void setDb126Dbx221(String db126Dbx221) {
        this.db126Dbx221 = db126Dbx221;
    }

    @Basic
    @Column(name = "DB126_DBX2_0", nullable = true, length = 2)
    public String getDb126Dbx20() {
        return db126Dbx20;
    }

    public void setDb126Dbx20(String db126Dbx20) {
        this.db126Dbx20 = db126Dbx20;
    }

    @Basic
    @Column(name = "DB126_DBX2_1", nullable = true, length = 2)
    public String getDb126Dbx21() {
        return db126Dbx21;
    }

    public void setDb126Dbx21(String db126Dbx21) {
        this.db126Dbx21 = db126Dbx21;
    }

    @Basic
    @Column(name = "DB126_DBX2_2", nullable = true, length = 2)
    public String getDb126Dbx22() {
        return db126Dbx22;
    }

    public void setDb126Dbx22(String db126Dbx22) {
        this.db126Dbx22 = db126Dbx22;
    }

    @Basic
    @Column(name = "DB126_DBX2_3", nullable = true, length = 2)
    public String getDb126Dbx23() {
        return db126Dbx23;
    }

    public void setDb126Dbx23(String db126Dbx23) {
        this.db126Dbx23 = db126Dbx23;
    }

    @Basic
    @Column(name = "DB126_DBX2_4", nullable = true, length = 2)
    public String getDb126Dbx24() {
        return db126Dbx24;
    }

    public void setDb126Dbx24(String db126Dbx24) {
        this.db126Dbx24 = db126Dbx24;
    }

    @Basic
    @Column(name = "DB126_DBX2_5", nullable = true, length = 2)
    public String getDb126Dbx25() {
        return db126Dbx25;
    }

    public void setDb126Dbx25(String db126Dbx25) {
        this.db126Dbx25 = db126Dbx25;
    }

    @Basic
    @Column(name = "DB126_DBX2_6", nullable = true, length = 2)
    public String getDb126Dbx26() {
        return db126Dbx26;
    }

    public void setDb126Dbx26(String db126Dbx26) {
        this.db126Dbx26 = db126Dbx26;
    }

    @Basic
    @Column(name = "DB126_DBX33_0", nullable = true, length = 2)
    public String getDb126Dbx330() {
        return db126Dbx330;
    }

    public void setDb126Dbx330(String db126Dbx330) {
        this.db126Dbx330 = db126Dbx330;
    }

    @Basic
    @Column(name = "DB126_DBX33_1", nullable = true, length = 2)
    public String getDb126Dbx331() {
        return db126Dbx331;
    }

    public void setDb126Dbx331(String db126Dbx331) {
        this.db126Dbx331 = db126Dbx331;
    }

    @Basic
    @Column(name = "DB126_DBX33_4", nullable = true, length = 2)
    public String getDb126Dbx334() {
        return db126Dbx334;
    }

    public void setDb126Dbx334(String db126Dbx334) {
        this.db126Dbx334 = db126Dbx334;
    }

    @Basic
    @Column(name = "DB126_DBX34_1", nullable = true, length = 2)
    public String getDb126Dbx341() {
        return db126Dbx341;
    }

    public void setDb126Dbx341(String db126Dbx341) {
        this.db126Dbx341 = db126Dbx341;
    }

    @Basic
    @Column(name = "DB126_DBX34_2", nullable = true, length = 2)
    public String getDb126Dbx342() {
        return db126Dbx342;
    }

    public void setDb126Dbx342(String db126Dbx342) {
        this.db126Dbx342 = db126Dbx342;
    }

    @Basic
    @Column(name = "DB126_DBX34_3", nullable = true, length = 2)
    public String getDb126Dbx343() {
        return db126Dbx343;
    }

    public void setDb126Dbx343(String db126Dbx343) {
        this.db126Dbx343 = db126Dbx343;
    }

    @Basic
    @Column(name = "DB126_DBX35_0", nullable = true, length = 2)
    public String getDb126Dbx350() {
        return db126Dbx350;
    }

    public void setDb126Dbx350(String db126Dbx350) {
        this.db126Dbx350 = db126Dbx350;
    }

    @Basic
    @Column(name = "DB126_DBX40_1", nullable = true, length = 2)
    public String getDb126Dbx401() {
        return db126Dbx401;
    }

    public void setDb126Dbx401(String db126Dbx401) {
        this.db126Dbx401 = db126Dbx401;
    }

    @Basic
    @Column(name = "DB126_DBX40_2", nullable = true, length = 2)
    public String getDb126Dbx402() {
        return db126Dbx402;
    }

    public void setDb126Dbx402(String db126Dbx402) {
        this.db126Dbx402 = db126Dbx402;
    }

    @Basic
    @Column(name = "DB126_DBX40_3", nullable = true, length = 2)
    public String getDb126Dbx403() {
        return db126Dbx403;
    }

    public void setDb126Dbx403(String db126Dbx403) {
        this.db126Dbx403 = db126Dbx403;
    }

    @Basic
    @Column(name = "DB126_DBX40_6", nullable = true, length = 2)
    public String getDb126Dbx406() {
        return db126Dbx406;
    }

    public void setDb126Dbx406(String db126Dbx406) {
        this.db126Dbx406 = db126Dbx406;
    }

    @Basic
    @Column(name = "DB126_DBX41_0", nullable = true, length = 2)
    public String getDb126Dbx410() {
        return db126Dbx410;
    }

    public void setDb126Dbx410(String db126Dbx410) {
        this.db126Dbx410 = db126Dbx410;
    }

    @Basic
    @Column(name = "DB126_DBX41_1", nullable = true, length = 2)
    public String getDb126Dbx411() {
        return db126Dbx411;
    }

    public void setDb126Dbx411(String db126Dbx411) {
        this.db126Dbx411 = db126Dbx411;
    }

    @Basic
    @Column(name = "DB126_DBX41_2", nullable = true, length = 2)
    public String getDb126Dbx412() {
        return db126Dbx412;
    }

    public void setDb126Dbx412(String db126Dbx412) {
        this.db126Dbx412 = db126Dbx412;
    }

    @Basic
    @Column(name = "DB126_DBX41_3", nullable = true, length = 2)
    public String getDb126Dbx413() {
        return db126Dbx413;
    }

    public void setDb126Dbx413(String db126Dbx413) {
        this.db126Dbx413 = db126Dbx413;
    }

    @Basic
    @Column(name = "DB126_DBX41_4", nullable = true, length = 2)
    public String getDb126Dbx414() {
        return db126Dbx414;
    }

    public void setDb126Dbx414(String db126Dbx414) {
        this.db126Dbx414 = db126Dbx414;
    }

    @Basic
    @Column(name = "DB126_DBX42_0", nullable = true, length = 2)
    public String getDb126Dbx420() {
        return db126Dbx420;
    }

    public void setDb126Dbx420(String db126Dbx420) {
        this.db126Dbx420 = db126Dbx420;
    }

    @Basic
    @Column(name = "DB126_DBX42_1", nullable = true, length = 2)
    public String getDb126Dbx421() {
        return db126Dbx421;
    }

    public void setDb126Dbx421(String db126Dbx421) {
        this.db126Dbx421 = db126Dbx421;
    }

    @Basic
    @Column(name = "DB126_DBX42_2", nullable = true, length = 2)
    public String getDb126Dbx422() {
        return db126Dbx422;
    }

    public void setDb126Dbx422(String db126Dbx422) {
        this.db126Dbx422 = db126Dbx422;
    }

    @Basic
    @Column(name = "DB126_DBX42_3", nullable = true, length = 2)
    public String getDb126Dbx423() {
        return db126Dbx423;
    }

    public void setDb126Dbx423(String db126Dbx423) {
        this.db126Dbx423 = db126Dbx423;
    }

    @Basic
    @Column(name = "DB126_DBX4_0", nullable = true, length = 2)
    public String getDb126Dbx40() {
        return db126Dbx40;
    }

    public void setDb126Dbx40(String db126Dbx40) {
        this.db126Dbx40 = db126Dbx40;
    }

    @Basic
    @Column(name = "DB126_DBX4_1", nullable = true, length = 2)
    public String getDb126Dbx41() {
        return db126Dbx41;
    }

    public void setDb126Dbx41(String db126Dbx41) {
        this.db126Dbx41 = db126Dbx41;
    }

    @Basic
    @Column(name = "DB126_DBX5_0", nullable = true, length = 2)
    public String getDb126Dbx50() {
        return db126Dbx50;
    }

    public void setDb126Dbx50(String db126Dbx50) {
        this.db126Dbx50 = db126Dbx50;
    }

    @Basic
    @Column(name = "DB126_DBX5_1", nullable = true, length = 2)
    public String getDb126Dbx51() {
        return db126Dbx51;
    }

    public void setDb126Dbx51(String db126Dbx51) {
        this.db126Dbx51 = db126Dbx51;
    }

    @Basic
    @Column(name = "DB126_DBX6_0", nullable = true, length = 2)
    public String getDb126Dbx60() {
        return db126Dbx60;
    }

    public void setDb126Dbx60(String db126Dbx60) {
        this.db126Dbx60 = db126Dbx60;
    }

    @Basic
    @Column(name = "DB126_DBX6_1", nullable = true, length = 2)
    public String getDb126Dbx61() {
        return db126Dbx61;
    }

    public void setDb126Dbx61(String db126Dbx61) {
        this.db126Dbx61 = db126Dbx61;
    }

    @Basic
    @Column(name = "DB126_DBX7_0", nullable = true, length = 2)
    public String getDb126Dbx70() {
        return db126Dbx70;
    }

    public void setDb126Dbx70(String db126Dbx70) {
        this.db126Dbx70 = db126Dbx70;
    }

    @Basic
    @Column(name = "DB126_DBX7_1", nullable = true, length = 2)
    public String getDb126Dbx71() {
        return db126Dbx71;
    }

    public void setDb126Dbx71(String db126Dbx71) {
        this.db126Dbx71 = db126Dbx71;
    }

    @Basic
    @Column(name = "DB127_DBX14_0", nullable = true, length = 2)
    public String getDb127Dbx140() {
        return db127Dbx140;
    }

    public void setDb127Dbx140(String db127Dbx140) {
        this.db127Dbx140 = db127Dbx140;
    }

    @Basic
    @Column(name = "DB127_DBX14_1", nullable = true, length = 2)
    public String getDb127Dbx141() {
        return db127Dbx141;
    }

    public void setDb127Dbx141(String db127Dbx141) {
        this.db127Dbx141 = db127Dbx141;
    }

    @Basic
    @Column(name = "DB127_DBX14_2", nullable = true, length = 2)
    public String getDb127Dbx142() {
        return db127Dbx142;
    }

    public void setDb127Dbx142(String db127Dbx142) {
        this.db127Dbx142 = db127Dbx142;
    }

    @Basic
    @Column(name = "DB127_DBX14_3", nullable = true, length = 2)
    public String getDb127Dbx143() {
        return db127Dbx143;
    }

    public void setDb127Dbx143(String db127Dbx143) {
        this.db127Dbx143 = db127Dbx143;
    }

    @Basic
    @Column(name = "DB127_DBX14_4", nullable = true, length = 2)
    public String getDb127Dbx144() {
        return db127Dbx144;
    }

    public void setDb127Dbx144(String db127Dbx144) {
        this.db127Dbx144 = db127Dbx144;
    }

    @Basic
    @Column(name = "DB127_DBX14_5", nullable = true, length = 2)
    public String getDb127Dbx145() {
        return db127Dbx145;
    }

    public void setDb127Dbx145(String db127Dbx145) {
        this.db127Dbx145 = db127Dbx145;
    }

    @Basic
    @Column(name = "DB127_DBX14_6", nullable = true, length = 2)
    public String getDb127Dbx146() {
        return db127Dbx146;
    }

    public void setDb127Dbx146(String db127Dbx146) {
        this.db127Dbx146 = db127Dbx146;
    }

    @Basic
    @Column(name = "DB127_DBX14_7", nullable = true, length = 2)
    public String getDb127Dbx147() {
        return db127Dbx147;
    }

    public void setDb127Dbx147(String db127Dbx147) {
        this.db127Dbx147 = db127Dbx147;
    }

    @Basic
    @Column(name = "DB127_DBX15_0", nullable = true, length = 2)
    public String getDb127Dbx150() {
        return db127Dbx150;
    }

    public void setDb127Dbx150(String db127Dbx150) {
        this.db127Dbx150 = db127Dbx150;
    }

    @Basic
    @Column(name = "DB127_DBX16_0", nullable = true, length = 2)
    public String getDb127Dbx160() {
        return db127Dbx160;
    }

    public void setDb127Dbx160(String db127Dbx160) {
        this.db127Dbx160 = db127Dbx160;
    }

    @Basic
    @Column(name = "DB127_DBX16_1", nullable = true, length = 2)
    public String getDb127Dbx161() {
        return db127Dbx161;
    }

    public void setDb127Dbx161(String db127Dbx161) {
        this.db127Dbx161 = db127Dbx161;
    }

    @Basic
    @Column(name = "DB127_DBX16_2", nullable = true, length = 2)
    public String getDb127Dbx162() {
        return db127Dbx162;
    }

    public void setDb127Dbx162(String db127Dbx162) {
        this.db127Dbx162 = db127Dbx162;
    }

    @Basic
    @Column(name = "DB127_DBX16_3", nullable = true, length = 2)
    public String getDb127Dbx163() {
        return db127Dbx163;
    }

    public void setDb127Dbx163(String db127Dbx163) {
        this.db127Dbx163 = db127Dbx163;
    }

    @Basic
    @Column(name = "DB127_DBX16_4", nullable = true, length = 2)
    public String getDb127Dbx164() {
        return db127Dbx164;
    }

    public void setDb127Dbx164(String db127Dbx164) {
        this.db127Dbx164 = db127Dbx164;
    }

    @Basic
    @Column(name = "DB127_DBX16_5", nullable = true, length = 2)
    public String getDb127Dbx165() {
        return db127Dbx165;
    }

    public void setDb127Dbx165(String db127Dbx165) {
        this.db127Dbx165 = db127Dbx165;
    }

    @Basic
    @Column(name = "DB127_DBX16_6", nullable = true, length = 2)
    public String getDb127Dbx166() {
        return db127Dbx166;
    }

    public void setDb127Dbx166(String db127Dbx166) {
        this.db127Dbx166 = db127Dbx166;
    }

    @Basic
    @Column(name = "DB127_DBX16_7", nullable = true, length = 2)
    public String getDb127Dbx167() {
        return db127Dbx167;
    }

    public void setDb127Dbx167(String db127Dbx167) {
        this.db127Dbx167 = db127Dbx167;
    }

    @Basic
    @Column(name = "DB127_DBX17_0", nullable = true, length = 2)
    public String getDb127Dbx170() {
        return db127Dbx170;
    }

    public void setDb127Dbx170(String db127Dbx170) {
        this.db127Dbx170 = db127Dbx170;
    }

    @Basic
    @Column(name = "DB127_DBX18_0", nullable = true, length = 2)
    public String getDb127Dbx180() {
        return db127Dbx180;
    }

    public void setDb127Dbx180(String db127Dbx180) {
        this.db127Dbx180 = db127Dbx180;
    }

    @Basic
    @Column(name = "DB127_DBX18_1", nullable = true, length = 2)
    public String getDb127Dbx181() {
        return db127Dbx181;
    }

    public void setDb127Dbx181(String db127Dbx181) {
        this.db127Dbx181 = db127Dbx181;
    }

    @Basic
    @Column(name = "DB127_DBX18_2", nullable = true, length = 2)
    public String getDb127Dbx182() {
        return db127Dbx182;
    }

    public void setDb127Dbx182(String db127Dbx182) {
        this.db127Dbx182 = db127Dbx182;
    }

    @Basic
    @Column(name = "DB127_DBX18_3", nullable = true, length = 2)
    public String getDb127Dbx183() {
        return db127Dbx183;
    }

    public void setDb127Dbx183(String db127Dbx183) {
        this.db127Dbx183 = db127Dbx183;
    }

    @Basic
    @Column(name = "DB127_DBX18_4", nullable = true, length = 2)
    public String getDb127Dbx184() {
        return db127Dbx184;
    }

    public void setDb127Dbx184(String db127Dbx184) {
        this.db127Dbx184 = db127Dbx184;
    }

    @Basic
    @Column(name = "DB127_DBX18_5", nullable = true, length = 2)
    public String getDb127Dbx185() {
        return db127Dbx185;
    }

    public void setDb127Dbx185(String db127Dbx185) {
        this.db127Dbx185 = db127Dbx185;
    }

    @Basic
    @Column(name = "DB127_DBX18_6", nullable = true, length = 2)
    public String getDb127Dbx186() {
        return db127Dbx186;
    }

    public void setDb127Dbx186(String db127Dbx186) {
        this.db127Dbx186 = db127Dbx186;
    }

    @Basic
    @Column(name = "DB127_DBX18_7", nullable = true, length = 2)
    public String getDb127Dbx187() {
        return db127Dbx187;
    }

    public void setDb127Dbx187(String db127Dbx187) {
        this.db127Dbx187 = db127Dbx187;
    }

    @Basic
    @Column(name = "DB127_DBX19_0", nullable = true, length = 2)
    public String getDb127Dbx190() {
        return db127Dbx190;
    }

    public void setDb127Dbx190(String db127Dbx190) {
        this.db127Dbx190 = db127Dbx190;
    }

    @Basic
    @Column(name = "DB127_DBX22_0", nullable = true, length = 2)
    public String getDb127Dbx220() {
        return db127Dbx220;
    }

    public void setDb127Dbx220(String db127Dbx220) {
        this.db127Dbx220 = db127Dbx220;
    }

    @Basic
    @Column(name = "DB127_DBX22_1", nullable = true, length = 2)
    public String getDb127Dbx221() {
        return db127Dbx221;
    }

    public void setDb127Dbx221(String db127Dbx221) {
        this.db127Dbx221 = db127Dbx221;
    }

    @Basic
    @Column(name = "DB127_DBX22_2", nullable = true, length = 2)
    public String getDb127Dbx222() {
        return db127Dbx222;
    }

    public void setDb127Dbx222(String db127Dbx222) {
        this.db127Dbx222 = db127Dbx222;
    }

    @Basic
    @Column(name = "DB127_DBX22_3", nullable = true, length = 2)
    public String getDb127Dbx223() {
        return db127Dbx223;
    }

    public void setDb127Dbx223(String db127Dbx223) {
        this.db127Dbx223 = db127Dbx223;
    }

    @Basic
    @Column(name = "DB127_DBX22_4", nullable = true, length = 2)
    public String getDb127Dbx224() {
        return db127Dbx224;
    }

    public void setDb127Dbx224(String db127Dbx224) {
        this.db127Dbx224 = db127Dbx224;
    }

    @Basic
    @Column(name = "DB127_DBX22_5", nullable = true, length = 2)
    public String getDb127Dbx225() {
        return db127Dbx225;
    }

    public void setDb127Dbx225(String db127Dbx225) {
        this.db127Dbx225 = db127Dbx225;
    }

    @Basic
    @Column(name = "DB127_DBX22_6", nullable = true, length = 2)
    public String getDb127Dbx226() {
        return db127Dbx226;
    }

    public void setDb127Dbx226(String db127Dbx226) {
        this.db127Dbx226 = db127Dbx226;
    }

    @Basic
    @Column(name = "DB127_DBX22_7", nullable = true, length = 2)
    public String getDb127Dbx227() {
        return db127Dbx227;
    }

    public void setDb127Dbx227(String db127Dbx227) {
        this.db127Dbx227 = db127Dbx227;
    }

    @Basic
    @Column(name = "DB127_DBX23_0", nullable = true, length = 2)
    public String getDb127Dbx230() {
        return db127Dbx230;
    }

    public void setDb127Dbx230(String db127Dbx230) {
        this.db127Dbx230 = db127Dbx230;
    }

    @Basic
    @Column(name = "DB127_DBX24_0", nullable = true, length = 2)
    public String getDb127Dbx240() {
        return db127Dbx240;
    }

    public void setDb127Dbx240(String db127Dbx240) {
        this.db127Dbx240 = db127Dbx240;
    }

    @Basic
    @Column(name = "DB127_DBX24_1", nullable = true, length = 2)
    public String getDb127Dbx241() {
        return db127Dbx241;
    }

    public void setDb127Dbx241(String db127Dbx241) {
        this.db127Dbx241 = db127Dbx241;
    }

    @Basic
    @Column(name = "DB127_DBX24_2", nullable = true, length = 2)
    public String getDb127Dbx242() {
        return db127Dbx242;
    }

    public void setDb127Dbx242(String db127Dbx242) {
        this.db127Dbx242 = db127Dbx242;
    }

    @Basic
    @Column(name = "DB127_DBX24_3", nullable = true, length = 2)
    public String getDb127Dbx243() {
        return db127Dbx243;
    }

    public void setDb127Dbx243(String db127Dbx243) {
        this.db127Dbx243 = db127Dbx243;
    }

    @Basic
    @Column(name = "DB127_DBX24_4", nullable = true, length = 2)
    public String getDb127Dbx244() {
        return db127Dbx244;
    }

    public void setDb127Dbx244(String db127Dbx244) {
        this.db127Dbx244 = db127Dbx244;
    }

    @Basic
    @Column(name = "DB127_DBX24_5", nullable = true, length = 2)
    public String getDb127Dbx245() {
        return db127Dbx245;
    }

    public void setDb127Dbx245(String db127Dbx245) {
        this.db127Dbx245 = db127Dbx245;
    }

    @Basic
    @Column(name = "DB127_DBX24_6", nullable = true, length = 2)
    public String getDb127Dbx246() {
        return db127Dbx246;
    }

    public void setDb127Dbx246(String db127Dbx246) {
        this.db127Dbx246 = db127Dbx246;
    }

    @Basic
    @Column(name = "DB127_DBX24_7", nullable = true, length = 2)
    public String getDb127Dbx247() {
        return db127Dbx247;
    }

    public void setDb127Dbx247(String db127Dbx247) {
        this.db127Dbx247 = db127Dbx247;
    }

    @Basic
    @Column(name = "DB127_DBX25_0", nullable = true, length = 2)
    public String getDb127Dbx250() {
        return db127Dbx250;
    }

    public void setDb127Dbx250(String db127Dbx250) {
        this.db127Dbx250 = db127Dbx250;
    }

    @Basic
    @Column(name = "DB127_DBX2_0", nullable = true, length = 2)
    public String getDb127Dbx20() {
        return db127Dbx20;
    }

    public void setDb127Dbx20(String db127Dbx20) {
        this.db127Dbx20 = db127Dbx20;
    }

    @Basic
    @Column(name = "DB127_DBX2_1", nullable = true, length = 2)
    public String getDb127Dbx21() {
        return db127Dbx21;
    }

    public void setDb127Dbx21(String db127Dbx21) {
        this.db127Dbx21 = db127Dbx21;
    }

    @Basic
    @Column(name = "DB127_DBX2_2", nullable = true, length = 2)
    public String getDb127Dbx22() {
        return db127Dbx22;
    }

    public void setDb127Dbx22(String db127Dbx22) {
        this.db127Dbx22 = db127Dbx22;
    }

    @Basic
    @Column(name = "DB127_DBX2_3", nullable = true, length = 2)
    public String getDb127Dbx23() {
        return db127Dbx23;
    }

    public void setDb127Dbx23(String db127Dbx23) {
        this.db127Dbx23 = db127Dbx23;
    }

    @Basic
    @Column(name = "DB127_DBX2_4", nullable = true, length = 2)
    public String getDb127Dbx24() {
        return db127Dbx24;
    }

    public void setDb127Dbx24(String db127Dbx24) {
        this.db127Dbx24 = db127Dbx24;
    }

    @Basic
    @Column(name = "DB127_DBX2_5", nullable = true, length = 2)
    public String getDb127Dbx25() {
        return db127Dbx25;
    }

    public void setDb127Dbx25(String db127Dbx25) {
        this.db127Dbx25 = db127Dbx25;
    }

    @Basic
    @Column(name = "DB127_DBX2_6", nullable = true, length = 2)
    public String getDb127Dbx26() {
        return db127Dbx26;
    }

    public void setDb127Dbx26(String db127Dbx26) {
        this.db127Dbx26 = db127Dbx26;
    }

    @Basic
    @Column(name = "DB127_DBX2_7", nullable = true, length = 2)
    public String getDb127Dbx27() {
        return db127Dbx27;
    }

    public void setDb127Dbx27(String db127Dbx27) {
        this.db127Dbx27 = db127Dbx27;
    }

    @Basic
    @Column(name = "DB127_DBX38_0", nullable = true, length = 2)
    public String getDb127Dbx380() {
        return db127Dbx380;
    }

    public void setDb127Dbx380(String db127Dbx380) {
        this.db127Dbx380 = db127Dbx380;
    }

    @Basic
    @Column(name = "DB127_DBX38_1", nullable = true, length = 2)
    public String getDb127Dbx381() {
        return db127Dbx381;
    }

    public void setDb127Dbx381(String db127Dbx381) {
        this.db127Dbx381 = db127Dbx381;
    }

    @Basic
    @Column(name = "DB127_DBX38_2", nullable = true, length = 2)
    public String getDb127Dbx382() {
        return db127Dbx382;
    }

    public void setDb127Dbx382(String db127Dbx382) {
        this.db127Dbx382 = db127Dbx382;
    }

    @Basic
    @Column(name = "DB127_DBX38_3", nullable = true, length = 2)
    public String getDb127Dbx383() {
        return db127Dbx383;
    }

    public void setDb127Dbx383(String db127Dbx383) {
        this.db127Dbx383 = db127Dbx383;
    }

    @Basic
    @Column(name = "DB127_DBX38_4", nullable = true, length = 2)
    public String getDb127Dbx384() {
        return db127Dbx384;
    }

    public void setDb127Dbx384(String db127Dbx384) {
        this.db127Dbx384 = db127Dbx384;
    }

    @Basic
    @Column(name = "DB127_DBX38_5", nullable = true, length = 2)
    public String getDb127Dbx385() {
        return db127Dbx385;
    }

    public void setDb127Dbx385(String db127Dbx385) {
        this.db127Dbx385 = db127Dbx385;
    }

    @Basic
    @Column(name = "DB127_DBX38_6", nullable = true, length = 2)
    public String getDb127Dbx386() {
        return db127Dbx386;
    }

    public void setDb127Dbx386(String db127Dbx386) {
        this.db127Dbx386 = db127Dbx386;
    }

    @Basic
    @Column(name = "DB127_DBX38_7", nullable = true, length = 2)
    public String getDb127Dbx387() {
        return db127Dbx387;
    }

    public void setDb127Dbx387(String db127Dbx387) {
        this.db127Dbx387 = db127Dbx387;
    }

    @Basic
    @Column(name = "DB127_DBX39_0", nullable = true, length = 2)
    public String getDb127Dbx390() {
        return db127Dbx390;
    }

    public void setDb127Dbx390(String db127Dbx390) {
        this.db127Dbx390 = db127Dbx390;
    }

    @Basic
    @Column(name = "DB127_DBX3_0", nullable = true, length = 2)
    public String getDb127Dbx30() {
        return db127Dbx30;
    }

    public void setDb127Dbx30(String db127Dbx30) {
        this.db127Dbx30 = db127Dbx30;
    }

    @Basic
    @Column(name = "DB127_DBX42_0", nullable = true, length = 2)
    public String getDb127Dbx420() {
        return db127Dbx420;
    }

    public void setDb127Dbx420(String db127Dbx420) {
        this.db127Dbx420 = db127Dbx420;
    }

    @Basic
    @Column(name = "DB127_DBX42_1", nullable = true, length = 2)
    public String getDb127Dbx421() {
        return db127Dbx421;
    }

    public void setDb127Dbx421(String db127Dbx421) {
        this.db127Dbx421 = db127Dbx421;
    }

    @Basic
    @Column(name = "DB127_DBX42_2", nullable = true, length = 2)
    public String getDb127Dbx422() {
        return db127Dbx422;
    }

    public void setDb127Dbx422(String db127Dbx422) {
        this.db127Dbx422 = db127Dbx422;
    }

    @Basic
    @Column(name = "DB127_DBX42_3", nullable = true, length = 2)
    public String getDb127Dbx423() {
        return db127Dbx423;
    }

    public void setDb127Dbx423(String db127Dbx423) {
        this.db127Dbx423 = db127Dbx423;
    }

    @Basic
    @Column(name = "DB127_DBX42_4", nullable = true, length = 2)
    public String getDb127Dbx424() {
        return db127Dbx424;
    }

    public void setDb127Dbx424(String db127Dbx424) {
        this.db127Dbx424 = db127Dbx424;
    }

    @Basic
    @Column(name = "DB127_DBX42_5", nullable = true, length = 2)
    public String getDb127Dbx425() {
        return db127Dbx425;
    }

    public void setDb127Dbx425(String db127Dbx425) {
        this.db127Dbx425 = db127Dbx425;
    }

    @Basic
    @Column(name = "DB127_DBX42_6", nullable = true, length = 2)
    public String getDb127Dbx426() {
        return db127Dbx426;
    }

    public void setDb127Dbx426(String db127Dbx426) {
        this.db127Dbx426 = db127Dbx426;
    }

    @Basic
    @Column(name = "DB127_DBX42_7", nullable = true, length = 2)
    public String getDb127Dbx427() {
        return db127Dbx427;
    }

    public void setDb127Dbx427(String db127Dbx427) {
        this.db127Dbx427 = db127Dbx427;
    }

    @Basic
    @Column(name = "DB127_DBX43_0", nullable = true, length = 2)
    public String getDb127Dbx430() {
        return db127Dbx430;
    }

    public void setDb127Dbx430(String db127Dbx430) {
        this.db127Dbx430 = db127Dbx430;
    }

    @Basic
    @Column(name = "DB127_DBX46_0", nullable = true, length = 2)
    public String getDb127Dbx460() {
        return db127Dbx460;
    }

    public void setDb127Dbx460(String db127Dbx460) {
        this.db127Dbx460 = db127Dbx460;
    }

    @Basic
    @Column(name = "DB127_DBX46_1", nullable = true, length = 2)
    public String getDb127Dbx461() {
        return db127Dbx461;
    }

    public void setDb127Dbx461(String db127Dbx461) {
        this.db127Dbx461 = db127Dbx461;
    }

    @Basic
    @Column(name = "DB127_DBX46_2", nullable = true, length = 2)
    public String getDb127Dbx462() {
        return db127Dbx462;
    }

    public void setDb127Dbx462(String db127Dbx462) {
        this.db127Dbx462 = db127Dbx462;
    }

    @Basic
    @Column(name = "DB127_DBX46_3", nullable = true, length = 2)
    public String getDb127Dbx463() {
        return db127Dbx463;
    }

    public void setDb127Dbx463(String db127Dbx463) {
        this.db127Dbx463 = db127Dbx463;
    }

    @Basic
    @Column(name = "DB127_DBX46_4", nullable = true, length = 2)
    public String getDb127Dbx464() {
        return db127Dbx464;
    }

    public void setDb127Dbx464(String db127Dbx464) {
        this.db127Dbx464 = db127Dbx464;
    }

    @Basic
    @Column(name = "DB127_DBX46_5", nullable = true, length = 2)
    public String getDb127Dbx465() {
        return db127Dbx465;
    }

    public void setDb127Dbx465(String db127Dbx465) {
        this.db127Dbx465 = db127Dbx465;
    }

    @Basic
    @Column(name = "DB127_DBX46_6", nullable = true, length = 2)
    public String getDb127Dbx466() {
        return db127Dbx466;
    }

    public void setDb127Dbx466(String db127Dbx466) {
        this.db127Dbx466 = db127Dbx466;
    }

    @Basic
    @Column(name = "DB127_DBX46_7", nullable = true, length = 2)
    public String getDb127Dbx467() {
        return db127Dbx467;
    }

    public void setDb127Dbx467(String db127Dbx467) {
        this.db127Dbx467 = db127Dbx467;
    }

    @Basic
    @Column(name = "DB127_DBX47_0", nullable = true, length = 2)
    public String getDb127Dbx470() {
        return db127Dbx470;
    }

    public void setDb127Dbx470(String db127Dbx470) {
        this.db127Dbx470 = db127Dbx470;
    }

    @Basic
    @Column(name = "DB127_DBX48_0", nullable = true, length = 2)
    public String getDb127Dbx480() {
        return db127Dbx480;
    }

    public void setDb127Dbx480(String db127Dbx480) {
        this.db127Dbx480 = db127Dbx480;
    }

    @Basic
    @Column(name = "DB127_DBX48_1", nullable = true, length = 2)
    public String getDb127Dbx481() {
        return db127Dbx481;
    }

    public void setDb127Dbx481(String db127Dbx481) {
        this.db127Dbx481 = db127Dbx481;
    }

    @Basic
    @Column(name = "DB127_DBX48_2", nullable = true, length = 2)
    public String getDb127Dbx482() {
        return db127Dbx482;
    }

    public void setDb127Dbx482(String db127Dbx482) {
        this.db127Dbx482 = db127Dbx482;
    }

    @Basic
    @Column(name = "DB127_DBX48_3", nullable = true, length = 2)
    public String getDb127Dbx483() {
        return db127Dbx483;
    }

    public void setDb127Dbx483(String db127Dbx483) {
        this.db127Dbx483 = db127Dbx483;
    }

    @Basic
    @Column(name = "DB127_DBX48_4", nullable = true, length = 2)
    public String getDb127Dbx484() {
        return db127Dbx484;
    }

    public void setDb127Dbx484(String db127Dbx484) {
        this.db127Dbx484 = db127Dbx484;
    }

    @Basic
    @Column(name = "DB127_DBX48_5", nullable = true, length = 2)
    public String getDb127Dbx485() {
        return db127Dbx485;
    }

    public void setDb127Dbx485(String db127Dbx485) {
        this.db127Dbx485 = db127Dbx485;
    }

    @Basic
    @Column(name = "DB127_DBX48_6", nullable = true, length = 2)
    public String getDb127Dbx486() {
        return db127Dbx486;
    }

    public void setDb127Dbx486(String db127Dbx486) {
        this.db127Dbx486 = db127Dbx486;
    }

    @Basic
    @Column(name = "DB127_DBX48_7", nullable = true, length = 2)
    public String getDb127Dbx487() {
        return db127Dbx487;
    }

    public void setDb127Dbx487(String db127Dbx487) {
        this.db127Dbx487 = db127Dbx487;
    }

    @Basic
    @Column(name = "DB127_DBX49_0", nullable = true, length = 2)
    public String getDb127Dbx490() {
        return db127Dbx490;
    }

    public void setDb127Dbx490(String db127Dbx490) {
        this.db127Dbx490 = db127Dbx490;
    }

    @Basic
    @Column(name = "DB127_DBX50_0", nullable = true, length = 2)
    public String getDb127Dbx500() {
        return db127Dbx500;
    }

    public void setDb127Dbx500(String db127Dbx500) {
        this.db127Dbx500 = db127Dbx500;
    }

    @Basic
    @Column(name = "DB127_DBX50_1", nullable = true, length = 2)
    public String getDb127Dbx501() {
        return db127Dbx501;
    }

    public void setDb127Dbx501(String db127Dbx501) {
        this.db127Dbx501 = db127Dbx501;
    }

    @Basic
    @Column(name = "DB127_DBX50_2", nullable = true, length = 2)
    public String getDb127Dbx502() {
        return db127Dbx502;
    }

    public void setDb127Dbx502(String db127Dbx502) {
        this.db127Dbx502 = db127Dbx502;
    }

    @Basic
    @Column(name = "DB127_DBX50_3", nullable = true, length = 2)
    public String getDb127Dbx503() {
        return db127Dbx503;
    }

    public void setDb127Dbx503(String db127Dbx503) {
        this.db127Dbx503 = db127Dbx503;
    }

    @Basic
    @Column(name = "DB127_DBX50_4", nullable = true, length = 2)
    public String getDb127Dbx504() {
        return db127Dbx504;
    }

    public void setDb127Dbx504(String db127Dbx504) {
        this.db127Dbx504 = db127Dbx504;
    }

    @Basic
    @Column(name = "DB127_DBX50_5", nullable = true, length = 2)
    public String getDb127Dbx505() {
        return db127Dbx505;
    }

    public void setDb127Dbx505(String db127Dbx505) {
        this.db127Dbx505 = db127Dbx505;
    }

    @Basic
    @Column(name = "DB127_DBX50_6", nullable = true, length = 2)
    public String getDb127Dbx506() {
        return db127Dbx506;
    }

    public void setDb127Dbx506(String db127Dbx506) {
        this.db127Dbx506 = db127Dbx506;
    }

    @Basic
    @Column(name = "DB127_DBX50_7", nullable = true, length = 2)
    public String getDb127Dbx507() {
        return db127Dbx507;
    }

    public void setDb127Dbx507(String db127Dbx507) {
        this.db127Dbx507 = db127Dbx507;
    }

    @Basic
    @Column(name = "DB127_DBX51_0", nullable = true, length = 2)
    public String getDb127Dbx510() {
        return db127Dbx510;
    }

    public void setDb127Dbx510(String db127Dbx510) {
        this.db127Dbx510 = db127Dbx510;
    }

    @Basic
    @Column(name = "DB127_DBX52_0", nullable = true, length = 2)
    public String getDb127Dbx520() {
        return db127Dbx520;
    }

    public void setDb127Dbx520(String db127Dbx520) {
        this.db127Dbx520 = db127Dbx520;
    }

    @Basic
    @Column(name = "DB127_DBX52_1", nullable = true, length = 2)
    public String getDb127Dbx521() {
        return db127Dbx521;
    }

    public void setDb127Dbx521(String db127Dbx521) {
        this.db127Dbx521 = db127Dbx521;
    }

    @Basic
    @Column(name = "DB127_DBX52_2", nullable = true, length = 2)
    public String getDb127Dbx522() {
        return db127Dbx522;
    }

    public void setDb127Dbx522(String db127Dbx522) {
        this.db127Dbx522 = db127Dbx522;
    }

    @Basic
    @Column(name = "DB127_DBX52_3", nullable = true, length = 2)
    public String getDb127Dbx523() {
        return db127Dbx523;
    }

    public void setDb127Dbx523(String db127Dbx523) {
        this.db127Dbx523 = db127Dbx523;
    }

    @Basic
    @Column(name = "DB127_DBX52_4", nullable = true, length = 2)
    public String getDb127Dbx524() {
        return db127Dbx524;
    }

    public void setDb127Dbx524(String db127Dbx524) {
        this.db127Dbx524 = db127Dbx524;
    }

    @Basic
    @Column(name = "DB127_DBX52_5", nullable = true, length = 2)
    public String getDb127Dbx525() {
        return db127Dbx525;
    }

    public void setDb127Dbx525(String db127Dbx525) {
        this.db127Dbx525 = db127Dbx525;
    }

    @Basic
    @Column(name = "DB127_DBX52_6", nullable = true, length = 2)
    public String getDb127Dbx526() {
        return db127Dbx526;
    }

    public void setDb127Dbx526(String db127Dbx526) {
        this.db127Dbx526 = db127Dbx526;
    }

    @Basic
    @Column(name = "DB127_DBX52_7", nullable = true, length = 2)
    public String getDb127Dbx527() {
        return db127Dbx527;
    }

    public void setDb127Dbx527(String db127Dbx527) {
        this.db127Dbx527 = db127Dbx527;
    }

    @Basic
    @Column(name = "DB127_DBX53_0", nullable = true, length = 2)
    public String getDb127Dbx530() {
        return db127Dbx530;
    }

    public void setDb127Dbx530(String db127Dbx530) {
        this.db127Dbx530 = db127Dbx530;
    }

    @Basic
    @Column(name = "DB127_DBX54_0", nullable = true, length = 2)
    public String getDb127Dbx540() {
        return db127Dbx540;
    }

    public void setDb127Dbx540(String db127Dbx540) {
        this.db127Dbx540 = db127Dbx540;
    }

    @Basic
    @Column(name = "DB127_DBX54_1", nullable = true, length = 2)
    public String getDb127Dbx541() {
        return db127Dbx541;
    }

    public void setDb127Dbx541(String db127Dbx541) {
        this.db127Dbx541 = db127Dbx541;
    }

    @Basic
    @Column(name = "DB127_DBX54_2", nullable = true, length = 2)
    public String getDb127Dbx542() {
        return db127Dbx542;
    }

    public void setDb127Dbx542(String db127Dbx542) {
        this.db127Dbx542 = db127Dbx542;
    }

    @Basic
    @Column(name = "DB127_DBX54_3", nullable = true, length = 2)
    public String getDb127Dbx543() {
        return db127Dbx543;
    }

    public void setDb127Dbx543(String db127Dbx543) {
        this.db127Dbx543 = db127Dbx543;
    }

    @Basic
    @Column(name = "DB127_DBX54_4", nullable = true, length = 2)
    public String getDb127Dbx544() {
        return db127Dbx544;
    }

    public void setDb127Dbx544(String db127Dbx544) {
        this.db127Dbx544 = db127Dbx544;
    }

    @Basic
    @Column(name = "DB127_DBX54_5", nullable = true, length = 2)
    public String getDb127Dbx545() {
        return db127Dbx545;
    }

    public void setDb127Dbx545(String db127Dbx545) {
        this.db127Dbx545 = db127Dbx545;
    }

    @Basic
    @Column(name = "DB127_DBX54_6", nullable = true, length = 2)
    public String getDb127Dbx546() {
        return db127Dbx546;
    }

    public void setDb127Dbx546(String db127Dbx546) {
        this.db127Dbx546 = db127Dbx546;
    }

    @Basic
    @Column(name = "DB127_DBX54_7", nullable = true, length = 2)
    public String getDb127Dbx547() {
        return db127Dbx547;
    }

    public void setDb127Dbx547(String db127Dbx547) {
        this.db127Dbx547 = db127Dbx547;
    }

    @Basic
    @Column(name = "DB127_DBX55_0", nullable = true, length = 2)
    public String getDb127Dbx550() {
        return db127Dbx550;
    }

    public void setDb127Dbx550(String db127Dbx550) {
        this.db127Dbx550 = db127Dbx550;
    }

    @Basic
    @Column(name = "DB127_DBX56_0", nullable = true, length = 2)
    public String getDb127Dbx560() {
        return db127Dbx560;
    }

    public void setDb127Dbx560(String db127Dbx560) {
        this.db127Dbx560 = db127Dbx560;
    }

    @Basic
    @Column(name = "DB127_DBX56_1", nullable = true, length = 2)
    public String getDb127Dbx561() {
        return db127Dbx561;
    }

    public void setDb127Dbx561(String db127Dbx561) {
        this.db127Dbx561 = db127Dbx561;
    }

    @Basic
    @Column(name = "DB127_DBX56_2", nullable = true, length = 2)
    public String getDb127Dbx562() {
        return db127Dbx562;
    }

    public void setDb127Dbx562(String db127Dbx562) {
        this.db127Dbx562 = db127Dbx562;
    }

    @Basic
    @Column(name = "DB127_DBX56_3", nullable = true, length = 2)
    public String getDb127Dbx563() {
        return db127Dbx563;
    }

    public void setDb127Dbx563(String db127Dbx563) {
        this.db127Dbx563 = db127Dbx563;
    }

    @Basic
    @Column(name = "DB127_DBX56_4", nullable = true, length = 2)
    public String getDb127Dbx564() {
        return db127Dbx564;
    }

    public void setDb127Dbx564(String db127Dbx564) {
        this.db127Dbx564 = db127Dbx564;
    }

    @Basic
    @Column(name = "DB127_DBX56_5", nullable = true, length = 2)
    public String getDb127Dbx565() {
        return db127Dbx565;
    }

    public void setDb127Dbx565(String db127Dbx565) {
        this.db127Dbx565 = db127Dbx565;
    }

    @Basic
    @Column(name = "DB127_DBX56_6", nullable = true, length = 2)
    public String getDb127Dbx566() {
        return db127Dbx566;
    }

    public void setDb127Dbx566(String db127Dbx566) {
        this.db127Dbx566 = db127Dbx566;
    }

    @Basic
    @Column(name = "DB127_DBX56_7", nullable = true, length = 2)
    public String getDb127Dbx567() {
        return db127Dbx567;
    }

    public void setDb127Dbx567(String db127Dbx567) {
        this.db127Dbx567 = db127Dbx567;
    }

    @Basic
    @Column(name = "DB127_DBX57_0", nullable = true, length = 2)
    public String getDb127Dbx570() {
        return db127Dbx570;
    }

    public void setDb127Dbx570(String db127Dbx570) {
        this.db127Dbx570 = db127Dbx570;
    }

    @Basic
    @Column(name = "DB127_DBX6_0", nullable = true, length = 2)
    public String getDb127Dbx60() {
        return db127Dbx60;
    }

    public void setDb127Dbx60(String db127Dbx60) {
        this.db127Dbx60 = db127Dbx60;
    }

    @Basic
    @Column(name = "DB127_DBX6_1", nullable = true, length = 2)
    public String getDb127Dbx61() {
        return db127Dbx61;
    }

    public void setDb127Dbx61(String db127Dbx61) {
        this.db127Dbx61 = db127Dbx61;
    }

    @Basic
    @Column(name = "DB127_DBX6_2", nullable = true, length = 2)
    public String getDb127Dbx62() {
        return db127Dbx62;
    }

    public void setDb127Dbx62(String db127Dbx62) {
        this.db127Dbx62 = db127Dbx62;
    }

    @Basic
    @Column(name = "DB127_DBX6_3", nullable = true, length = 2)
    public String getDb127Dbx63() {
        return db127Dbx63;
    }

    public void setDb127Dbx63(String db127Dbx63) {
        this.db127Dbx63 = db127Dbx63;
    }

    @Basic
    @Column(name = "DB127_DBX6_4", nullable = true, length = 2)
    public String getDb127Dbx64() {
        return db127Dbx64;
    }

    public void setDb127Dbx64(String db127Dbx64) {
        this.db127Dbx64 = db127Dbx64;
    }

    @Basic
    @Column(name = "DB127_DBX6_5", nullable = true, length = 2)
    public String getDb127Dbx65() {
        return db127Dbx65;
    }

    public void setDb127Dbx65(String db127Dbx65) {
        this.db127Dbx65 = db127Dbx65;
    }

    @Basic
    @Column(name = "DB127_DBX6_6", nullable = true, length = 2)
    public String getDb127Dbx66() {
        return db127Dbx66;
    }

    public void setDb127Dbx66(String db127Dbx66) {
        this.db127Dbx66 = db127Dbx66;
    }

    @Basic
    @Column(name = "DB127_DBX6_7", nullable = true, length = 2)
    public String getDb127Dbx67() {
        return db127Dbx67;
    }

    public void setDb127Dbx67(String db127Dbx67) {
        this.db127Dbx67 = db127Dbx67;
    }

    @Basic
    @Column(name = "DB127_DBX7_0", nullable = true, length = 2)
    public String getDb127Dbx70() {
        return db127Dbx70;
    }

    public void setDb127Dbx70(String db127Dbx70) {
        this.db127Dbx70 = db127Dbx70;
    }

    @Basic
    @Column(name = "DB127_DBX8_0", nullable = true, length = 2)
    public String getDb127Dbx80() {
        return db127Dbx80;
    }

    public void setDb127Dbx80(String db127Dbx80) {
        this.db127Dbx80 = db127Dbx80;
    }

    @Basic
    @Column(name = "DB127_DBX8_1", nullable = true, length = 2)
    public String getDb127Dbx81() {
        return db127Dbx81;
    }

    public void setDb127Dbx81(String db127Dbx81) {
        this.db127Dbx81 = db127Dbx81;
    }

    @Basic
    @Column(name = "DB127_DBX8_2", nullable = true, length = 2)
    public String getDb127Dbx82() {
        return db127Dbx82;
    }

    public void setDb127Dbx82(String db127Dbx82) {
        this.db127Dbx82 = db127Dbx82;
    }

    @Basic
    @Column(name = "DB127_DBX8_3", nullable = true, length = 2)
    public String getDb127Dbx83() {
        return db127Dbx83;
    }

    public void setDb127Dbx83(String db127Dbx83) {
        this.db127Dbx83 = db127Dbx83;
    }

    @Basic
    @Column(name = "DB127_DBX8_4", nullable = true, length = 2)
    public String getDb127Dbx84() {
        return db127Dbx84;
    }

    public void setDb127Dbx84(String db127Dbx84) {
        this.db127Dbx84 = db127Dbx84;
    }

    @Basic
    @Column(name = "DB127_DBX8_5", nullable = true, length = 2)
    public String getDb127Dbx85() {
        return db127Dbx85;
    }

    public void setDb127Dbx85(String db127Dbx85) {
        this.db127Dbx85 = db127Dbx85;
    }

    @Basic
    @Column(name = "DB127_DBX8_6", nullable = true, length = 2)
    public String getDb127Dbx86() {
        return db127Dbx86;
    }

    public void setDb127Dbx86(String db127Dbx86) {
        this.db127Dbx86 = db127Dbx86;
    }

    @Basic
    @Column(name = "DB127_DBX8_7", nullable = true, length = 2)
    public String getDb127Dbx87() {
        return db127Dbx87;
    }

    public void setDb127Dbx87(String db127Dbx87) {
        this.db127Dbx87 = db127Dbx87;
    }

    @Basic
    @Column(name = "DB127_DBX9_0", nullable = true, length = 2)
    public String getDb127Dbx90() {
        return db127Dbx90;
    }

    public void setDb127Dbx90(String db127Dbx90) {
        this.db127Dbx90 = db127Dbx90;
    }

    @Basic
    @Column(name = "DB2000_DB12", nullable = true, length = 4000)
    public String getDb2000Db12() {
        return db2000Db12;
    }

    public void setDb2000Db12(String db2000Db12) {
        this.db2000Db12 = db2000Db12;
    }

    @Basic
    @Column(name = "DB2000_DB40", nullable = true, length = 4000)
    public String getDb2000Db40() {
        return db2000Db40;
    }

    public void setDb2000Db40(String db2000Db40) {
        this.db2000Db40 = db2000Db40;
    }

    @Basic
    @Column(name = "DB2000_DB552", nullable = true, length = 4000)
    public String getDb2000Db552() {
        return db2000Db552;
    }

    public void setDb2000Db552(String db2000Db552) {
        this.db2000Db552 = db2000Db552;
    }

    @Basic
    @Column(name = "DB2000_DBW0", nullable = true, precision = 0)
    public Integer getDb2000Dbw0() {
        return db2000Dbw0;
    }

    public void setDb2000Dbw0(Integer db2000Dbw0) {
        this.db2000Dbw0 = db2000Dbw0;
    }

    @Basic
    @Column(name = "DB2000_DBW10", nullable = true, precision = 0)
    public Integer getDb2000Dbw10() {
        return db2000Dbw10;
    }

    public void setDb2000Dbw10(Integer db2000Dbw10) {
        this.db2000Dbw10 = db2000Dbw10;
    }

    @Basic
    @Column(name = "DB2000_DBW2", nullable = true, precision = 0)
    public Integer getDb2000Dbw2() {
        return db2000Dbw2;
    }

    public void setDb2000Dbw2(Integer db2000Dbw2) {
        this.db2000Dbw2 = db2000Dbw2;
    }

    @Basic
    @Column(name = "DB2000_DBW4", nullable = true, precision = 0)
    public Integer getDb2000Dbw4() {
        return db2000Dbw4;
    }

    public void setDb2000Dbw4(Integer db2000Dbw4) {
        this.db2000Dbw4 = db2000Dbw4;
    }

    @Basic
    @Column(name = "DB2000_DBW6", nullable = true, precision = 0)
    public Integer getDb2000Dbw6() {
        return db2000Dbw6;
    }

    public void setDb2000Dbw6(Integer db2000Dbw6) {
        this.db2000Dbw6 = db2000Dbw6;
    }

    @Basic
    @Column(name = "DB2000_DBW8", nullable = true, precision = 0)
    public Integer getDb2000Dbw8() {
        return db2000Dbw8;
    }

    public void setDb2000Dbw8(Integer db2000Dbw8) {
        this.db2000Dbw8 = db2000Dbw8;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_0", nullable = true, length = 2)
    public String getDb2000Dbx10000() {
        return db2000Dbx10000;
    }

    public void setDb2000Dbx10000(String db2000Dbx10000) {
        this.db2000Dbx10000 = db2000Dbx10000;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_1", nullable = true, length = 2)
    public String getDb2000Dbx10001() {
        return db2000Dbx10001;
    }

    public void setDb2000Dbx10001(String db2000Dbx10001) {
        this.db2000Dbx10001 = db2000Dbx10001;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_2", nullable = true, length = 2)
    public String getDb2000Dbx10002() {
        return db2000Dbx10002;
    }

    public void setDb2000Dbx10002(String db2000Dbx10002) {
        this.db2000Dbx10002 = db2000Dbx10002;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_3", nullable = true, length = 2)
    public String getDb2000Dbx10003() {
        return db2000Dbx10003;
    }

    public void setDb2000Dbx10003(String db2000Dbx10003) {
        this.db2000Dbx10003 = db2000Dbx10003;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_4", nullable = true, length = 2)
    public String getDb2000Dbx10004() {
        return db2000Dbx10004;
    }

    public void setDb2000Dbx10004(String db2000Dbx10004) {
        this.db2000Dbx10004 = db2000Dbx10004;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_5", nullable = true, length = 2)
    public String getDb2000Dbx10005() {
        return db2000Dbx10005;
    }

    public void setDb2000Dbx10005(String db2000Dbx10005) {
        this.db2000Dbx10005 = db2000Dbx10005;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_6", nullable = true, length = 2)
    public String getDb2000Dbx10006() {
        return db2000Dbx10006;
    }

    public void setDb2000Dbx10006(String db2000Dbx10006) {
        this.db2000Dbx10006 = db2000Dbx10006;
    }

    @Basic
    @Column(name = "DB2000_DBX1000_7", nullable = true, length = 2)
    public String getDb2000Dbx10007() {
        return db2000Dbx10007;
    }

    public void setDb2000Dbx10007(String db2000Dbx10007) {
        this.db2000Dbx10007 = db2000Dbx10007;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_0", nullable = true, length = 2)
    public String getDb2000Dbx11000() {
        return db2000Dbx11000;
    }

    public void setDb2000Dbx11000(String db2000Dbx11000) {
        this.db2000Dbx11000 = db2000Dbx11000;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_1", nullable = true, length = 2)
    public String getDb2000Dbx11001() {
        return db2000Dbx11001;
    }

    public void setDb2000Dbx11001(String db2000Dbx11001) {
        this.db2000Dbx11001 = db2000Dbx11001;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_2", nullable = true, length = 2)
    public String getDb2000Dbx11002() {
        return db2000Dbx11002;
    }

    public void setDb2000Dbx11002(String db2000Dbx11002) {
        this.db2000Dbx11002 = db2000Dbx11002;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_3", nullable = true, length = 2)
    public String getDb2000Dbx11003() {
        return db2000Dbx11003;
    }

    public void setDb2000Dbx11003(String db2000Dbx11003) {
        this.db2000Dbx11003 = db2000Dbx11003;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_4", nullable = true, length = 2)
    public String getDb2000Dbx11004() {
        return db2000Dbx11004;
    }

    public void setDb2000Dbx11004(String db2000Dbx11004) {
        this.db2000Dbx11004 = db2000Dbx11004;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_5", nullable = true, length = 2)
    public String getDb2000Dbx11005() {
        return db2000Dbx11005;
    }

    public void setDb2000Dbx11005(String db2000Dbx11005) {
        this.db2000Dbx11005 = db2000Dbx11005;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_6", nullable = true, length = 2)
    public String getDb2000Dbx11006() {
        return db2000Dbx11006;
    }

    public void setDb2000Dbx11006(String db2000Dbx11006) {
        this.db2000Dbx11006 = db2000Dbx11006;
    }

    @Basic
    @Column(name = "DB2000_DBX1100_7", nullable = true, length = 2)
    public String getDb2000Dbx11007() {
        return db2000Dbx11007;
    }

    public void setDb2000Dbx11007(String db2000Dbx11007) {
        this.db2000Dbx11007 = db2000Dbx11007;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CL_FCOP23 that = (CL_FCOP23) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(isSynch, that.isSynch) &&
                Objects.equals(db126Dbx100, that.db126Dbx100) &&
                Objects.equals(db126Dbx101, that.db126Dbx101) &&
                Objects.equals(db126Dbx102, that.db126Dbx102) &&
                Objects.equals(db126Dbx103, that.db126Dbx103) &&
                Objects.equals(db126Dbx104, that.db126Dbx104) &&
                Objects.equals(db126Dbx105, that.db126Dbx105) &&
                Objects.equals(db126Dbx1300, that.db126Dbx1300) &&
                Objects.equals(db126Dbx203, that.db126Dbx203) &&
                Objects.equals(db126Dbx204, that.db126Dbx204) &&
                Objects.equals(db126Dbx205, that.db126Dbx205) &&
                Objects.equals(db126Dbx206, that.db126Dbx206) &&
                Objects.equals(db126Dbx210, that.db126Dbx210) &&
                Objects.equals(db126Dbx211, that.db126Dbx211) &&
                Objects.equals(db126Dbx212, that.db126Dbx212) &&
                Objects.equals(db126Dbx213, that.db126Dbx213) &&
                Objects.equals(db126Dbx220, that.db126Dbx220) &&
                Objects.equals(db126Dbx221, that.db126Dbx221) &&
                Objects.equals(db126Dbx20, that.db126Dbx20) &&
                Objects.equals(db126Dbx21, that.db126Dbx21) &&
                Objects.equals(db126Dbx22, that.db126Dbx22) &&
                Objects.equals(db126Dbx23, that.db126Dbx23) &&
                Objects.equals(db126Dbx24, that.db126Dbx24) &&
                Objects.equals(db126Dbx25, that.db126Dbx25) &&
                Objects.equals(db126Dbx26, that.db126Dbx26) &&
                Objects.equals(db126Dbx330, that.db126Dbx330) &&
                Objects.equals(db126Dbx331, that.db126Dbx331) &&
                Objects.equals(db126Dbx334, that.db126Dbx334) &&
                Objects.equals(db126Dbx341, that.db126Dbx341) &&
                Objects.equals(db126Dbx342, that.db126Dbx342) &&
                Objects.equals(db126Dbx343, that.db126Dbx343) &&
                Objects.equals(db126Dbx350, that.db126Dbx350) &&
                Objects.equals(db126Dbx401, that.db126Dbx401) &&
                Objects.equals(db126Dbx402, that.db126Dbx402) &&
                Objects.equals(db126Dbx403, that.db126Dbx403) &&
                Objects.equals(db126Dbx406, that.db126Dbx406) &&
                Objects.equals(db126Dbx410, that.db126Dbx410) &&
                Objects.equals(db126Dbx411, that.db126Dbx411) &&
                Objects.equals(db126Dbx412, that.db126Dbx412) &&
                Objects.equals(db126Dbx413, that.db126Dbx413) &&
                Objects.equals(db126Dbx414, that.db126Dbx414) &&
                Objects.equals(db126Dbx420, that.db126Dbx420) &&
                Objects.equals(db126Dbx421, that.db126Dbx421) &&
                Objects.equals(db126Dbx422, that.db126Dbx422) &&
                Objects.equals(db126Dbx423, that.db126Dbx423) &&
                Objects.equals(db126Dbx40, that.db126Dbx40) &&
                Objects.equals(db126Dbx41, that.db126Dbx41) &&
                Objects.equals(db126Dbx50, that.db126Dbx50) &&
                Objects.equals(db126Dbx51, that.db126Dbx51) &&
                Objects.equals(db126Dbx60, that.db126Dbx60) &&
                Objects.equals(db126Dbx61, that.db126Dbx61) &&
                Objects.equals(db126Dbx70, that.db126Dbx70) &&
                Objects.equals(db126Dbx71, that.db126Dbx71) &&
                Objects.equals(db127Dbx140, that.db127Dbx140) &&
                Objects.equals(db127Dbx141, that.db127Dbx141) &&
                Objects.equals(db127Dbx142, that.db127Dbx142) &&
                Objects.equals(db127Dbx143, that.db127Dbx143) &&
                Objects.equals(db127Dbx144, that.db127Dbx144) &&
                Objects.equals(db127Dbx145, that.db127Dbx145) &&
                Objects.equals(db127Dbx146, that.db127Dbx146) &&
                Objects.equals(db127Dbx147, that.db127Dbx147) &&
                Objects.equals(db127Dbx150, that.db127Dbx150) &&
                Objects.equals(db127Dbx160, that.db127Dbx160) &&
                Objects.equals(db127Dbx161, that.db127Dbx161) &&
                Objects.equals(db127Dbx162, that.db127Dbx162) &&
                Objects.equals(db127Dbx163, that.db127Dbx163) &&
                Objects.equals(db127Dbx164, that.db127Dbx164) &&
                Objects.equals(db127Dbx165, that.db127Dbx165) &&
                Objects.equals(db127Dbx166, that.db127Dbx166) &&
                Objects.equals(db127Dbx167, that.db127Dbx167) &&
                Objects.equals(db127Dbx170, that.db127Dbx170) &&
                Objects.equals(db127Dbx180, that.db127Dbx180) &&
                Objects.equals(db127Dbx181, that.db127Dbx181) &&
                Objects.equals(db127Dbx182, that.db127Dbx182) &&
                Objects.equals(db127Dbx183, that.db127Dbx183) &&
                Objects.equals(db127Dbx184, that.db127Dbx184) &&
                Objects.equals(db127Dbx185, that.db127Dbx185) &&
                Objects.equals(db127Dbx186, that.db127Dbx186) &&
                Objects.equals(db127Dbx187, that.db127Dbx187) &&
                Objects.equals(db127Dbx190, that.db127Dbx190) &&
                Objects.equals(db127Dbx220, that.db127Dbx220) &&
                Objects.equals(db127Dbx221, that.db127Dbx221) &&
                Objects.equals(db127Dbx222, that.db127Dbx222) &&
                Objects.equals(db127Dbx223, that.db127Dbx223) &&
                Objects.equals(db127Dbx224, that.db127Dbx224) &&
                Objects.equals(db127Dbx225, that.db127Dbx225) &&
                Objects.equals(db127Dbx226, that.db127Dbx226) &&
                Objects.equals(db127Dbx227, that.db127Dbx227) &&
                Objects.equals(db127Dbx230, that.db127Dbx230) &&
                Objects.equals(db127Dbx240, that.db127Dbx240) &&
                Objects.equals(db127Dbx241, that.db127Dbx241) &&
                Objects.equals(db127Dbx242, that.db127Dbx242) &&
                Objects.equals(db127Dbx243, that.db127Dbx243) &&
                Objects.equals(db127Dbx244, that.db127Dbx244) &&
                Objects.equals(db127Dbx245, that.db127Dbx245) &&
                Objects.equals(db127Dbx246, that.db127Dbx246) &&
                Objects.equals(db127Dbx247, that.db127Dbx247) &&
                Objects.equals(db127Dbx250, that.db127Dbx250) &&
                Objects.equals(db127Dbx20, that.db127Dbx20) &&
                Objects.equals(db127Dbx21, that.db127Dbx21) &&
                Objects.equals(db127Dbx22, that.db127Dbx22) &&
                Objects.equals(db127Dbx23, that.db127Dbx23) &&
                Objects.equals(db127Dbx24, that.db127Dbx24) &&
                Objects.equals(db127Dbx25, that.db127Dbx25) &&
                Objects.equals(db127Dbx26, that.db127Dbx26) &&
                Objects.equals(db127Dbx27, that.db127Dbx27) &&
                Objects.equals(db127Dbx380, that.db127Dbx380) &&
                Objects.equals(db127Dbx381, that.db127Dbx381) &&
                Objects.equals(db127Dbx382, that.db127Dbx382) &&
                Objects.equals(db127Dbx383, that.db127Dbx383) &&
                Objects.equals(db127Dbx384, that.db127Dbx384) &&
                Objects.equals(db127Dbx385, that.db127Dbx385) &&
                Objects.equals(db127Dbx386, that.db127Dbx386) &&
                Objects.equals(db127Dbx387, that.db127Dbx387) &&
                Objects.equals(db127Dbx390, that.db127Dbx390) &&
                Objects.equals(db127Dbx30, that.db127Dbx30) &&
                Objects.equals(db127Dbx420, that.db127Dbx420) &&
                Objects.equals(db127Dbx421, that.db127Dbx421) &&
                Objects.equals(db127Dbx422, that.db127Dbx422) &&
                Objects.equals(db127Dbx423, that.db127Dbx423) &&
                Objects.equals(db127Dbx424, that.db127Dbx424) &&
                Objects.equals(db127Dbx425, that.db127Dbx425) &&
                Objects.equals(db127Dbx426, that.db127Dbx426) &&
                Objects.equals(db127Dbx427, that.db127Dbx427) &&
                Objects.equals(db127Dbx430, that.db127Dbx430) &&
                Objects.equals(db127Dbx460, that.db127Dbx460) &&
                Objects.equals(db127Dbx461, that.db127Dbx461) &&
                Objects.equals(db127Dbx462, that.db127Dbx462) &&
                Objects.equals(db127Dbx463, that.db127Dbx463) &&
                Objects.equals(db127Dbx464, that.db127Dbx464) &&
                Objects.equals(db127Dbx465, that.db127Dbx465) &&
                Objects.equals(db127Dbx466, that.db127Dbx466) &&
                Objects.equals(db127Dbx467, that.db127Dbx467) &&
                Objects.equals(db127Dbx470, that.db127Dbx470) &&
                Objects.equals(db127Dbx480, that.db127Dbx480) &&
                Objects.equals(db127Dbx481, that.db127Dbx481) &&
                Objects.equals(db127Dbx482, that.db127Dbx482) &&
                Objects.equals(db127Dbx483, that.db127Dbx483) &&
                Objects.equals(db127Dbx484, that.db127Dbx484) &&
                Objects.equals(db127Dbx485, that.db127Dbx485) &&
                Objects.equals(db127Dbx486, that.db127Dbx486) &&
                Objects.equals(db127Dbx487, that.db127Dbx487) &&
                Objects.equals(db127Dbx490, that.db127Dbx490) &&
                Objects.equals(db127Dbx500, that.db127Dbx500) &&
                Objects.equals(db127Dbx501, that.db127Dbx501) &&
                Objects.equals(db127Dbx502, that.db127Dbx502) &&
                Objects.equals(db127Dbx503, that.db127Dbx503) &&
                Objects.equals(db127Dbx504, that.db127Dbx504) &&
                Objects.equals(db127Dbx505, that.db127Dbx505) &&
                Objects.equals(db127Dbx506, that.db127Dbx506) &&
                Objects.equals(db127Dbx507, that.db127Dbx507) &&
                Objects.equals(db127Dbx510, that.db127Dbx510) &&
                Objects.equals(db127Dbx520, that.db127Dbx520) &&
                Objects.equals(db127Dbx521, that.db127Dbx521) &&
                Objects.equals(db127Dbx522, that.db127Dbx522) &&
                Objects.equals(db127Dbx523, that.db127Dbx523) &&
                Objects.equals(db127Dbx524, that.db127Dbx524) &&
                Objects.equals(db127Dbx525, that.db127Dbx525) &&
                Objects.equals(db127Dbx526, that.db127Dbx526) &&
                Objects.equals(db127Dbx527, that.db127Dbx527) &&
                Objects.equals(db127Dbx530, that.db127Dbx530) &&
                Objects.equals(db127Dbx540, that.db127Dbx540) &&
                Objects.equals(db127Dbx541, that.db127Dbx541) &&
                Objects.equals(db127Dbx542, that.db127Dbx542) &&
                Objects.equals(db127Dbx543, that.db127Dbx543) &&
                Objects.equals(db127Dbx544, that.db127Dbx544) &&
                Objects.equals(db127Dbx545, that.db127Dbx545) &&
                Objects.equals(db127Dbx546, that.db127Dbx546) &&
                Objects.equals(db127Dbx547, that.db127Dbx547) &&
                Objects.equals(db127Dbx550, that.db127Dbx550) &&
                Objects.equals(db127Dbx560, that.db127Dbx560) &&
                Objects.equals(db127Dbx561, that.db127Dbx561) &&
                Objects.equals(db127Dbx562, that.db127Dbx562) &&
                Objects.equals(db127Dbx563, that.db127Dbx563) &&
                Objects.equals(db127Dbx564, that.db127Dbx564) &&
                Objects.equals(db127Dbx565, that.db127Dbx565) &&
                Objects.equals(db127Dbx566, that.db127Dbx566) &&
                Objects.equals(db127Dbx567, that.db127Dbx567) &&
                Objects.equals(db127Dbx570, that.db127Dbx570) &&
                Objects.equals(db127Dbx60, that.db127Dbx60) &&
                Objects.equals(db127Dbx61, that.db127Dbx61) &&
                Objects.equals(db127Dbx62, that.db127Dbx62) &&
                Objects.equals(db127Dbx63, that.db127Dbx63) &&
                Objects.equals(db127Dbx64, that.db127Dbx64) &&
                Objects.equals(db127Dbx65, that.db127Dbx65) &&
                Objects.equals(db127Dbx66, that.db127Dbx66) &&
                Objects.equals(db127Dbx67, that.db127Dbx67) &&
                Objects.equals(db127Dbx70, that.db127Dbx70) &&
                Objects.equals(db127Dbx80, that.db127Dbx80) &&
                Objects.equals(db127Dbx81, that.db127Dbx81) &&
                Objects.equals(db127Dbx82, that.db127Dbx82) &&
                Objects.equals(db127Dbx83, that.db127Dbx83) &&
                Objects.equals(db127Dbx84, that.db127Dbx84) &&
                Objects.equals(db127Dbx85, that.db127Dbx85) &&
                Objects.equals(db127Dbx86, that.db127Dbx86) &&
                Objects.equals(db127Dbx87, that.db127Dbx87) &&
                Objects.equals(db127Dbx90, that.db127Dbx90) &&
                Objects.equals(db2000Db12, that.db2000Db12) &&
                Objects.equals(db2000Db40, that.db2000Db40) &&
                Objects.equals(db2000Db552, that.db2000Db552) &&
                Objects.equals(db2000Dbw0, that.db2000Dbw0) &&
                Objects.equals(db2000Dbw10, that.db2000Dbw10) &&
                Objects.equals(db2000Dbw2, that.db2000Dbw2) &&
                Objects.equals(db2000Dbw4, that.db2000Dbw4) &&
                Objects.equals(db2000Dbw6, that.db2000Dbw6) &&
                Objects.equals(db2000Dbw8, that.db2000Dbw8) &&
                Objects.equals(db2000Dbx10000, that.db2000Dbx10000) &&
                Objects.equals(db2000Dbx10001, that.db2000Dbx10001) &&
                Objects.equals(db2000Dbx10002, that.db2000Dbx10002) &&
                Objects.equals(db2000Dbx10003, that.db2000Dbx10003) &&
                Objects.equals(db2000Dbx10004, that.db2000Dbx10004) &&
                Objects.equals(db2000Dbx10005, that.db2000Dbx10005) &&
                Objects.equals(db2000Dbx10006, that.db2000Dbx10006) &&
                Objects.equals(db2000Dbx10007, that.db2000Dbx10007) &&
                Objects.equals(db2000Dbx11000, that.db2000Dbx11000) &&
                Objects.equals(db2000Dbx11001, that.db2000Dbx11001) &&
                Objects.equals(db2000Dbx11002, that.db2000Dbx11002) &&
                Objects.equals(db2000Dbx11003, that.db2000Dbx11003) &&
                Objects.equals(db2000Dbx11004, that.db2000Dbx11004) &&
                Objects.equals(db2000Dbx11005, that.db2000Dbx11005) &&
                Objects.equals(db2000Dbx11006, that.db2000Dbx11006) &&
                Objects.equals(db2000Dbx11007, that.db2000Dbx11007);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, createDate, isSynch, db126Dbx100, db126Dbx101, db126Dbx102, db126Dbx103, db126Dbx104, db126Dbx105, db126Dbx1300, db126Dbx203, db126Dbx204, db126Dbx205, db126Dbx206, db126Dbx210, db126Dbx211, db126Dbx212, db126Dbx213, db126Dbx220, db126Dbx221, db126Dbx20, db126Dbx21, db126Dbx22, db126Dbx23, db126Dbx24, db126Dbx25, db126Dbx26, db126Dbx330, db126Dbx331, db126Dbx334, db126Dbx341, db126Dbx342, db126Dbx343, db126Dbx350, db126Dbx401, db126Dbx402, db126Dbx403, db126Dbx406, db126Dbx410, db126Dbx411, db126Dbx412, db126Dbx413, db126Dbx414, db126Dbx420, db126Dbx421, db126Dbx422, db126Dbx423, db126Dbx40, db126Dbx41, db126Dbx50, db126Dbx51, db126Dbx60, db126Dbx61, db126Dbx70, db126Dbx71, db127Dbx140, db127Dbx141, db127Dbx142, db127Dbx143, db127Dbx144, db127Dbx145, db127Dbx146, db127Dbx147, db127Dbx150, db127Dbx160, db127Dbx161, db127Dbx162, db127Dbx163, db127Dbx164, db127Dbx165, db127Dbx166, db127Dbx167, db127Dbx170, db127Dbx180, db127Dbx181, db127Dbx182, db127Dbx183, db127Dbx184, db127Dbx185, db127Dbx186, db127Dbx187, db127Dbx190, db127Dbx220, db127Dbx221, db127Dbx222, db127Dbx223, db127Dbx224, db127Dbx225, db127Dbx226, db127Dbx227, db127Dbx230, db127Dbx240, db127Dbx241, db127Dbx242, db127Dbx243, db127Dbx244, db127Dbx245, db127Dbx246, db127Dbx247, db127Dbx250, db127Dbx20, db127Dbx21, db127Dbx22, db127Dbx23, db127Dbx24, db127Dbx25, db127Dbx26, db127Dbx27, db127Dbx380, db127Dbx381, db127Dbx382, db127Dbx383, db127Dbx384, db127Dbx385, db127Dbx386, db127Dbx387, db127Dbx390, db127Dbx30, db127Dbx420, db127Dbx421, db127Dbx422, db127Dbx423, db127Dbx424, db127Dbx425, db127Dbx426, db127Dbx427, db127Dbx430, db127Dbx460, db127Dbx461, db127Dbx462, db127Dbx463, db127Dbx464, db127Dbx465, db127Dbx466, db127Dbx467, db127Dbx470, db127Dbx480, db127Dbx481, db127Dbx482, db127Dbx483, db127Dbx484, db127Dbx485, db127Dbx486, db127Dbx487, db127Dbx490, db127Dbx500, db127Dbx501, db127Dbx502, db127Dbx503, db127Dbx504, db127Dbx505, db127Dbx506, db127Dbx507, db127Dbx510, db127Dbx520, db127Dbx521, db127Dbx522, db127Dbx523, db127Dbx524, db127Dbx525, db127Dbx526, db127Dbx527, db127Dbx530, db127Dbx540, db127Dbx541, db127Dbx542, db127Dbx543, db127Dbx544, db127Dbx545, db127Dbx546, db127Dbx547, db127Dbx550, db127Dbx560, db127Dbx561, db127Dbx562, db127Dbx563, db127Dbx564, db127Dbx565, db127Dbx566, db127Dbx567, db127Dbx570, db127Dbx60, db127Dbx61, db127Dbx62, db127Dbx63, db127Dbx64, db127Dbx65, db127Dbx66, db127Dbx67, db127Dbx70, db127Dbx80, db127Dbx81, db127Dbx82, db127Dbx83, db127Dbx84, db127Dbx85, db127Dbx86, db127Dbx87, db127Dbx90, db2000Db12, db2000Db40, db2000Db552, db2000Dbw0, db2000Dbw10, db2000Dbw2, db2000Dbw4, db2000Dbw6, db2000Dbw8, db2000Dbx10000, db2000Dbx10001, db2000Dbx10002, db2000Dbx10003, db2000Dbx10004, db2000Dbx10005, db2000Dbx10006, db2000Dbx10007, db2000Dbx11000, db2000Dbx11001, db2000Dbx11002, db2000Dbx11003, db2000Dbx11004, db2000Dbx11005, db2000Dbx11006, db2000Dbx11007);
    }
}
