package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/7/13 13:42
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_COMOP130", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_COMOP130 {
    private String uuid;
    private Date createDate;
    private String isSynch;
    private Integer db11Int10;
    private Integer db11Int314;
    private Integer db11Int8;
    private BigDecimal db11Real0;
    private BigDecimal db11Real102;
    private BigDecimal db11Real106;
    private BigDecimal db11Real110;
    private BigDecimal db11Real114;
    private BigDecimal db11Real130;
    private BigDecimal db11Real134;
    private BigDecimal db11Real138;
    private BigDecimal db11Real142;
    private BigDecimal db11Real146;
    private BigDecimal db11Real150;
    private BigDecimal db11Real154;
    private BigDecimal db11Real158;
    private BigDecimal db11Real174;
    private BigDecimal db11Real178;
    private BigDecimal db11Real18;
    private BigDecimal db11Real182;
    private BigDecimal db11Real186;
    private BigDecimal db11Real190;
    private BigDecimal db11Real194;
    private BigDecimal db11Real198;
    private BigDecimal db11Real202;
    private BigDecimal db11Real218;
    private BigDecimal db11Real222;
    private BigDecimal db11Real226;
    private BigDecimal db11Real230;
    private BigDecimal db11Real234;
    private BigDecimal db11Real238;
    private BigDecimal db11Real242;
    private BigDecimal db11Real246;
    private BigDecimal db11Real264;
    private BigDecimal db11Real268;
    private BigDecimal db11Real272;
    private BigDecimal db11Real276;
    private BigDecimal db11Real280;
    private BigDecimal db11Real284;
    private BigDecimal db11Real288;
    private BigDecimal db11Real292;
    private BigDecimal db11Real296;
    private BigDecimal db11Real30;
    private BigDecimal db11Real300;
    private BigDecimal db11Real304;
    private BigDecimal db11Real308;
    private BigDecimal db11Real4;
    private BigDecimal db11Real42;
    private BigDecimal db11Real54;
    private BigDecimal db11Real66;
    private BigDecimal db11Real78;
    private BigDecimal db11Real86;
    private BigDecimal db11Real90;
    private BigDecimal db11Real94;
    private BigDecimal db11Real98;
    private String db11X1290;
    private String db11X1292;
    private String db11X120;
    private String db11X121;
    private String db11X1730;
    private String db11X1732;
    private String db11X2170;
    private String db11X2172;
    private String db11X2610;
    private String db11X2612;
    private String db11X3160;
    private String db11X3161;
    private String db11X3162;
    private String db11X3163;
    private String db11X3164;
    private String db11X3165;
    private String db11X3170;
    private String db11X3171;
    private String db11X3172;
    private String db11X3173;
    private String db11X3174;
    private String db11X3175;
    private String db11X3176;
    private String db11X3180;
    private String db11X3181;
    private String db11X3182;
    private String db11X3183;
    private String db11X3184;
    private String db11X3185;
    private String db11X3186;
    private String db11X3187;
    private String db11X3190;
    private String db11X3191;
    private String db11X3192;
    private String db11X3193;
    private String db11X3194;
    private String db11X3195;
    private String db11X3196;
    private String db11X3200;
    private String db11X3201;
    private String db11X3202;
    private String db11X3203;
    private String db11X3204;
    private String db11X3205;
    private String db11X3206;
    private String db11X3207;
    private String db11X3210;
    private String db11X3211;
    private String db11X3214;
    private String db11X3215;
    private String db11X3220;
    private String db11X3221;
    private String db11X3240;
    private String db11X3241;
    private String db11X3242;
    private String db11X3243;
    private String db11X3244;
    private String db11X3245;
    private String db11X3260;
    private String db11X3261;
    private String db15Char4840;
    private String db15Int022;
    private Integer db15Sint46;
    private String m980;
    private String m985;

    @Id
    @Column(name = "UUID", nullable = false, length = 32)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
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
    @Column(name = "DB11_INT10", nullable = true, precision = 0)
    public Integer getDb11Int10() {
        return db11Int10;
    }

    public void setDb11Int10(Integer db11Int10) {
        this.db11Int10 = db11Int10;
    }

    @Basic
    @Column(name = "DB11_INT314", nullable = true, precision = 0)
    public Integer getDb11Int314() {
        return db11Int314;
    }

    public void setDb11Int314(Integer db11Int314) {
        this.db11Int314 = db11Int314;
    }

    @Basic
    @Column(name = "DB11_INT8", nullable = true, precision = 0)
    public Integer getDb11Int8() {
        return db11Int8;
    }

    public void setDb11Int8(Integer db11Int8) {
        this.db11Int8 = db11Int8;
    }

    @Basic
    @Column(name = "DB11_REAL0", nullable = true, precision = 8)
    public BigDecimal getDb11Real0() {
        return db11Real0;
    }

    public void setDb11Real0(BigDecimal db11Real0) {
        this.db11Real0 = db11Real0;
    }

    @Basic
    @Column(name = "DB11_REAL102", nullable = true, precision = 8)
    public BigDecimal getDb11Real102() {
        return db11Real102;
    }

    public void setDb11Real102(BigDecimal db11Real102) {
        this.db11Real102 = db11Real102;
    }

    @Basic
    @Column(name = "DB11_REAL106", nullable = true, precision = 8)
    public BigDecimal getDb11Real106() {
        return db11Real106;
    }

    public void setDb11Real106(BigDecimal db11Real106) {
        this.db11Real106 = db11Real106;
    }

    @Basic
    @Column(name = "DB11_REAL110", nullable = true, precision = 8)
    public BigDecimal getDb11Real110() {
        return db11Real110;
    }

    public void setDb11Real110(BigDecimal db11Real110) {
        this.db11Real110 = db11Real110;
    }

    @Basic
    @Column(name = "DB11_REAL114", nullable = true, precision = 8)
    public BigDecimal getDb11Real114() {
        return db11Real114;
    }

    public void setDb11Real114(BigDecimal db11Real114) {
        this.db11Real114 = db11Real114;
    }

    @Basic
    @Column(name = "DB11_REAL130", nullable = true, precision = 8)
    public BigDecimal getDb11Real130() {
        return db11Real130;
    }

    public void setDb11Real130(BigDecimal db11Real130) {
        this.db11Real130 = db11Real130;
    }

    @Basic
    @Column(name = "DB11_REAL134", nullable = true, precision = 8)
    public BigDecimal getDb11Real134() {
        return db11Real134;
    }

    public void setDb11Real134(BigDecimal db11Real134) {
        this.db11Real134 = db11Real134;
    }

    @Basic
    @Column(name = "DB11_REAL138", nullable = true, precision = 8)
    public BigDecimal getDb11Real138() {
        return db11Real138;
    }

    public void setDb11Real138(BigDecimal db11Real138) {
        this.db11Real138 = db11Real138;
    }

    @Basic
    @Column(name = "DB11_REAL142", nullable = true, precision = 8)
    public BigDecimal getDb11Real142() {
        return db11Real142;
    }

    public void setDb11Real142(BigDecimal db11Real142) {
        this.db11Real142 = db11Real142;
    }

    @Basic
    @Column(name = "DB11_REAL146", nullable = true, precision = 8)
    public BigDecimal getDb11Real146() {
        return db11Real146;
    }

    public void setDb11Real146(BigDecimal db11Real146) {
        this.db11Real146 = db11Real146;
    }

    @Basic
    @Column(name = "DB11_REAL150", nullable = true, precision = 8)
    public BigDecimal getDb11Real150() {
        return db11Real150;
    }

    public void setDb11Real150(BigDecimal db11Real150) {
        this.db11Real150 = db11Real150;
    }

    @Basic
    @Column(name = "DB11_REAL154", nullable = true, precision = 8)
    public BigDecimal getDb11Real154() {
        return db11Real154;
    }

    public void setDb11Real154(BigDecimal db11Real154) {
        this.db11Real154 = db11Real154;
    }

    @Basic
    @Column(name = "DB11_REAL158", nullable = true, precision = 8)
    public BigDecimal getDb11Real158() {
        return db11Real158;
    }

    public void setDb11Real158(BigDecimal db11Real158) {
        this.db11Real158 = db11Real158;
    }

    @Basic
    @Column(name = "DB11_REAL174", nullable = true, precision = 8)
    public BigDecimal getDb11Real174() {
        return db11Real174;
    }

    public void setDb11Real174(BigDecimal db11Real174) {
        this.db11Real174 = db11Real174;
    }

    @Basic
    @Column(name = "DB11_REAL178", nullable = true, precision = 8)
    public BigDecimal getDb11Real178() {
        return db11Real178;
    }

    public void setDb11Real178(BigDecimal db11Real178) {
        this.db11Real178 = db11Real178;
    }

    @Basic
    @Column(name = "DB11_REAL18", nullable = true, precision = 8)
    public BigDecimal getDb11Real18() {
        return db11Real18;
    }

    public void setDb11Real18(BigDecimal db11Real18) {
        this.db11Real18 = db11Real18;
    }

    @Basic
    @Column(name = "DB11_REAL182", nullable = true, precision = 8)
    public BigDecimal getDb11Real182() {
        return db11Real182;
    }

    public void setDb11Real182(BigDecimal db11Real182) {
        this.db11Real182 = db11Real182;
    }

    @Basic
    @Column(name = "DB11_REAL186", nullable = true, precision = 8)
    public BigDecimal getDb11Real186() {
        return db11Real186;
    }

    public void setDb11Real186(BigDecimal db11Real186) {
        this.db11Real186 = db11Real186;
    }

    @Basic
    @Column(name = "DB11_REAL190", nullable = true, precision = 8)
    public BigDecimal getDb11Real190() {
        return db11Real190;
    }

    public void setDb11Real190(BigDecimal db11Real190) {
        this.db11Real190 = db11Real190;
    }

    @Basic
    @Column(name = "DB11_REAL194", nullable = true, precision = 8)
    public BigDecimal getDb11Real194() {
        return db11Real194;
    }

    public void setDb11Real194(BigDecimal db11Real194) {
        this.db11Real194 = db11Real194;
    }

    @Basic
    @Column(name = "DB11_REAL198", nullable = true, precision = 8)
    public BigDecimal getDb11Real198() {
        return db11Real198;
    }

    public void setDb11Real198(BigDecimal db11Real198) {
        this.db11Real198 = db11Real198;
    }

    @Basic
    @Column(name = "DB11_REAL202", nullable = true, precision = 8)
    public BigDecimal getDb11Real202() {
        return db11Real202;
    }

    public void setDb11Real202(BigDecimal db11Real202) {
        this.db11Real202 = db11Real202;
    }

    @Basic
    @Column(name = "DB11_REAL218", nullable = true, precision = 8)
    public BigDecimal getDb11Real218() {
        return db11Real218;
    }

    public void setDb11Real218(BigDecimal db11Real218) {
        this.db11Real218 = db11Real218;
    }

    @Basic
    @Column(name = "DB11_REAL222", nullable = true, precision = 8)
    public BigDecimal getDb11Real222() {
        return db11Real222;
    }

    public void setDb11Real222(BigDecimal db11Real222) {
        this.db11Real222 = db11Real222;
    }

    @Basic
    @Column(name = "DB11_REAL226", nullable = true, precision = 8)
    public BigDecimal getDb11Real226() {
        return db11Real226;
    }

    public void setDb11Real226(BigDecimal db11Real226) {
        this.db11Real226 = db11Real226;
    }

    @Basic
    @Column(name = "DB11_REAL230", nullable = true, precision = 8)
    public BigDecimal getDb11Real230() {
        return db11Real230;
    }

    public void setDb11Real230(BigDecimal db11Real230) {
        this.db11Real230 = db11Real230;
    }

    @Basic
    @Column(name = "DB11_REAL234", nullable = true, precision = 8)
    public BigDecimal getDb11Real234() {
        return db11Real234;
    }

    public void setDb11Real234(BigDecimal db11Real234) {
        this.db11Real234 = db11Real234;
    }

    @Basic
    @Column(name = "DB11_REAL238", nullable = true, precision = 8)
    public BigDecimal getDb11Real238() {
        return db11Real238;
    }

    public void setDb11Real238(BigDecimal db11Real238) {
        this.db11Real238 = db11Real238;
    }

    @Basic
    @Column(name = "DB11_REAL242", nullable = true, precision = 8)
    public BigDecimal getDb11Real242() {
        return db11Real242;
    }

    public void setDb11Real242(BigDecimal db11Real242) {
        this.db11Real242 = db11Real242;
    }

    @Basic
    @Column(name = "DB11_REAL246", nullable = true, precision = 8)
    public BigDecimal getDb11Real246() {
        return db11Real246;
    }

    public void setDb11Real246(BigDecimal db11Real246) {
        this.db11Real246 = db11Real246;
    }

    @Basic
    @Column(name = "DB11_REAL264", nullable = true, precision = 8)
    public BigDecimal getDb11Real264() {
        return db11Real264;
    }

    public void setDb11Real264(BigDecimal db11Real264) {
        this.db11Real264 = db11Real264;
    }

    @Basic
    @Column(name = "DB11_REAL268", nullable = true, precision = 8)
    public BigDecimal getDb11Real268() {
        return db11Real268;
    }

    public void setDb11Real268(BigDecimal db11Real268) {
        this.db11Real268 = db11Real268;
    }

    @Basic
    @Column(name = "DB11_REAL272", nullable = true, precision = 8)
    public BigDecimal getDb11Real272() {
        return db11Real272;
    }

    public void setDb11Real272(BigDecimal db11Real272) {
        this.db11Real272 = db11Real272;
    }

    @Basic
    @Column(name = "DB11_REAL276", nullable = true, precision = 8)
    public BigDecimal getDb11Real276() {
        return db11Real276;
    }

    public void setDb11Real276(BigDecimal db11Real276) {
        this.db11Real276 = db11Real276;
    }

    @Basic
    @Column(name = "DB11_REAL280", nullable = true, precision = 8)
    public BigDecimal getDb11Real280() {
        return db11Real280;
    }

    public void setDb11Real280(BigDecimal db11Real280) {
        this.db11Real280 = db11Real280;
    }

    @Basic
    @Column(name = "DB11_REAL284", nullable = true, precision = 8)
    public BigDecimal getDb11Real284() {
        return db11Real284;
    }

    public void setDb11Real284(BigDecimal db11Real284) {
        this.db11Real284 = db11Real284;
    }

    @Basic
    @Column(name = "DB11_REAL288", nullable = true, precision = 8)
    public BigDecimal getDb11Real288() {
        return db11Real288;
    }

    public void setDb11Real288(BigDecimal db11Real288) {
        this.db11Real288 = db11Real288;
    }

    @Basic
    @Column(name = "DB11_REAL292", nullable = true, precision = 8)
    public BigDecimal getDb11Real292() {
        return db11Real292;
    }

    public void setDb11Real292(BigDecimal db11Real292) {
        this.db11Real292 = db11Real292;
    }

    @Basic
    @Column(name = "DB11_REAL296", nullable = true, precision = 8)
    public BigDecimal getDb11Real296() {
        return db11Real296;
    }

    public void setDb11Real296(BigDecimal db11Real296) {
        this.db11Real296 = db11Real296;
    }

    @Basic
    @Column(name = "DB11_REAL30", nullable = true, precision = 8)
    public BigDecimal getDb11Real30() {
        return db11Real30;
    }

    public void setDb11Real30(BigDecimal db11Real30) {
        this.db11Real30 = db11Real30;
    }

    @Basic
    @Column(name = "DB11_REAL300", nullable = true, precision = 8)
    public BigDecimal getDb11Real300() {
        return db11Real300;
    }

    public void setDb11Real300(BigDecimal db11Real300) {
        this.db11Real300 = db11Real300;
    }

    @Basic
    @Column(name = "DB11_REAL304", nullable = true, precision = 8)
    public BigDecimal getDb11Real304() {
        return db11Real304;
    }

    public void setDb11Real304(BigDecimal db11Real304) {
        this.db11Real304 = db11Real304;
    }

    @Basic
    @Column(name = "DB11_REAL308", nullable = true, precision = 8)
    public BigDecimal getDb11Real308() {
        return db11Real308;
    }

    public void setDb11Real308(BigDecimal db11Real308) {
        this.db11Real308 = db11Real308;
    }

    @Basic
    @Column(name = "DB11_REAL4", nullable = true, precision = 8)
    public BigDecimal getDb11Real4() {
        return db11Real4;
    }

    public void setDb11Real4(BigDecimal db11Real4) {
        this.db11Real4 = db11Real4;
    }

    @Basic
    @Column(name = "DB11_REAL42", nullable = true, precision = 8)
    public BigDecimal getDb11Real42() {
        return db11Real42;
    }

    public void setDb11Real42(BigDecimal db11Real42) {
        this.db11Real42 = db11Real42;
    }

    @Basic
    @Column(name = "DB11_REAL54", nullable = true, precision = 8)
    public BigDecimal getDb11Real54() {
        return db11Real54;
    }

    public void setDb11Real54(BigDecimal db11Real54) {
        this.db11Real54 = db11Real54;
    }

    @Basic
    @Column(name = "DB11_REAL66", nullable = true, precision = 8)
    public BigDecimal getDb11Real66() {
        return db11Real66;
    }

    public void setDb11Real66(BigDecimal db11Real66) {
        this.db11Real66 = db11Real66;
    }

    @Basic
    @Column(name = "DB11_REAL78", nullable = true, precision = 8)
    public BigDecimal getDb11Real78() {
        return db11Real78;
    }

    public void setDb11Real78(BigDecimal db11Real78) {
        this.db11Real78 = db11Real78;
    }

    @Basic
    @Column(name = "DB11_REAL86", nullable = true, precision = 8)
    public BigDecimal getDb11Real86() {
        return db11Real86;
    }

    public void setDb11Real86(BigDecimal db11Real86) {
        this.db11Real86 = db11Real86;
    }

    @Basic
    @Column(name = "DB11_REAL90", nullable = true, precision = 8)
    public BigDecimal getDb11Real90() {
        return db11Real90;
    }

    public void setDb11Real90(BigDecimal db11Real90) {
        this.db11Real90 = db11Real90;
    }

    @Basic
    @Column(name = "DB11_REAL94", nullable = true, precision = 8)
    public BigDecimal getDb11Real94() {
        return db11Real94;
    }

    public void setDb11Real94(BigDecimal db11Real94) {
        this.db11Real94 = db11Real94;
    }

    @Basic
    @Column(name = "DB11_REAL98", nullable = true, precision = 8)
    public BigDecimal getDb11Real98() {
        return db11Real98;
    }

    public void setDb11Real98(BigDecimal db11Real98) {
        this.db11Real98 = db11Real98;
    }

    @Basic
    @Column(name = "DB11_X129_0", nullable = true, length = 2)
    public String getDb11X1290() {
        return db11X1290;
    }

    public void setDb11X1290(String db11X1290) {
        this.db11X1290 = db11X1290;
    }

    @Basic
    @Column(name = "DB11_X129_2", nullable = true, length = 2)
    public String getDb11X1292() {
        return db11X1292;
    }

    public void setDb11X1292(String db11X1292) {
        this.db11X1292 = db11X1292;
    }

    @Basic
    @Column(name = "DB11_X12_0", nullable = true, length = 2)
    public String getDb11X120() {
        return db11X120;
    }

    public void setDb11X120(String db11X120) {
        this.db11X120 = db11X120;
    }

    @Basic
    @Column(name = "DB11_X12_1", nullable = true, length = 2)
    public String getDb11X121() {
        return db11X121;
    }

    public void setDb11X121(String db11X121) {
        this.db11X121 = db11X121;
    }

    @Basic
    @Column(name = "DB11_X173_0", nullable = true, length = 2)
    public String getDb11X1730() {
        return db11X1730;
    }

    public void setDb11X1730(String db11X1730) {
        this.db11X1730 = db11X1730;
    }

    @Basic
    @Column(name = "DB11_X173_2", nullable = true, length = 2)
    public String getDb11X1732() {
        return db11X1732;
    }

    public void setDb11X1732(String db11X1732) {
        this.db11X1732 = db11X1732;
    }

    @Basic
    @Column(name = "DB11_X217_0", nullable = true, length = 2)
    public String getDb11X2170() {
        return db11X2170;
    }

    public void setDb11X2170(String db11X2170) {
        this.db11X2170 = db11X2170;
    }

    @Basic
    @Column(name = "DB11_X217_2", nullable = true, length = 2)
    public String getDb11X2172() {
        return db11X2172;
    }

    public void setDb11X2172(String db11X2172) {
        this.db11X2172 = db11X2172;
    }

    @Basic
    @Column(name = "DB11_X261_0", nullable = true, length = 2)
    public String getDb11X2610() {
        return db11X2610;
    }

    public void setDb11X2610(String db11X2610) {
        this.db11X2610 = db11X2610;
    }

    @Basic
    @Column(name = "DB11_X261_2", nullable = true, length = 2)
    public String getDb11X2612() {
        return db11X2612;
    }

    public void setDb11X2612(String db11X2612) {
        this.db11X2612 = db11X2612;
    }

    @Basic
    @Column(name = "DB11_X316_0", nullable = true, length = 2)
    public String getDb11X3160() {
        return db11X3160;
    }

    public void setDb11X3160(String db11X3160) {
        this.db11X3160 = db11X3160;
    }

    @Basic
    @Column(name = "DB11_X316_1", nullable = true, length = 2)
    public String getDb11X3161() {
        return db11X3161;
    }

    public void setDb11X3161(String db11X3161) {
        this.db11X3161 = db11X3161;
    }

    @Basic
    @Column(name = "DB11_X316_2", nullable = true, length = 2)
    public String getDb11X3162() {
        return db11X3162;
    }

    public void setDb11X3162(String db11X3162) {
        this.db11X3162 = db11X3162;
    }

    @Basic
    @Column(name = "DB11_X316_3", nullable = true, length = 2)
    public String getDb11X3163() {
        return db11X3163;
    }

    public void setDb11X3163(String db11X3163) {
        this.db11X3163 = db11X3163;
    }

    @Basic
    @Column(name = "DB11_X316_4", nullable = true, length = 2)
    public String getDb11X3164() {
        return db11X3164;
    }

    public void setDb11X3164(String db11X3164) {
        this.db11X3164 = db11X3164;
    }

    @Basic
    @Column(name = "DB11_X316_5", nullable = true, length = 2)
    public String getDb11X3165() {
        return db11X3165;
    }

    public void setDb11X3165(String db11X3165) {
        this.db11X3165 = db11X3165;
    }

    @Basic
    @Column(name = "DB11_X317_0", nullable = true, length = 2)
    public String getDb11X3170() {
        return db11X3170;
    }

    public void setDb11X3170(String db11X3170) {
        this.db11X3170 = db11X3170;
    }

    @Basic
    @Column(name = "DB11_X317_1", nullable = true, length = 2)
    public String getDb11X3171() {
        return db11X3171;
    }

    public void setDb11X3171(String db11X3171) {
        this.db11X3171 = db11X3171;
    }

    @Basic
    @Column(name = "DB11_X317_2", nullable = true, length = 2)
    public String getDb11X3172() {
        return db11X3172;
    }

    public void setDb11X3172(String db11X3172) {
        this.db11X3172 = db11X3172;
    }

    @Basic
    @Column(name = "DB11_X317_3", nullable = true, length = 2)
    public String getDb11X3173() {
        return db11X3173;
    }

    public void setDb11X3173(String db11X3173) {
        this.db11X3173 = db11X3173;
    }

    @Basic
    @Column(name = "DB11_X317_4", nullable = true, length = 2)
    public String getDb11X3174() {
        return db11X3174;
    }

    public void setDb11X3174(String db11X3174) {
        this.db11X3174 = db11X3174;
    }

    @Basic
    @Column(name = "DB11_X317_5", nullable = true, length = 2)
    public String getDb11X3175() {
        return db11X3175;
    }

    public void setDb11X3175(String db11X3175) {
        this.db11X3175 = db11X3175;
    }

    @Basic
    @Column(name = "DB11_X317_6", nullable = true, length = 2)
    public String getDb11X3176() {
        return db11X3176;
    }

    public void setDb11X3176(String db11X3176) {
        this.db11X3176 = db11X3176;
    }

    @Basic
    @Column(name = "DB11_X318_0", nullable = true, length = 2)
    public String getDb11X3180() {
        return db11X3180;
    }

    public void setDb11X3180(String db11X3180) {
        this.db11X3180 = db11X3180;
    }

    @Basic
    @Column(name = "DB11_X318_1", nullable = true, length = 2)
    public String getDb11X3181() {
        return db11X3181;
    }

    public void setDb11X3181(String db11X3181) {
        this.db11X3181 = db11X3181;
    }

    @Basic
    @Column(name = "DB11_X318_2", nullable = true, length = 2)
    public String getDb11X3182() {
        return db11X3182;
    }

    public void setDb11X3182(String db11X3182) {
        this.db11X3182 = db11X3182;
    }

    @Basic
    @Column(name = "DB11_X318_3", nullable = true, length = 2)
    public String getDb11X3183() {
        return db11X3183;
    }

    public void setDb11X3183(String db11X3183) {
        this.db11X3183 = db11X3183;
    }

    @Basic
    @Column(name = "DB11_X318_4", nullable = true, length = 2)
    public String getDb11X3184() {
        return db11X3184;
    }

    public void setDb11X3184(String db11X3184) {
        this.db11X3184 = db11X3184;
    }

    @Basic
    @Column(name = "DB11_X318_5", nullable = true, length = 2)
    public String getDb11X3185() {
        return db11X3185;
    }

    public void setDb11X3185(String db11X3185) {
        this.db11X3185 = db11X3185;
    }

    @Basic
    @Column(name = "DB11_X318_6", nullable = true, length = 2)
    public String getDb11X3186() {
        return db11X3186;
    }

    public void setDb11X3186(String db11X3186) {
        this.db11X3186 = db11X3186;
    }

    @Basic
    @Column(name = "DB11_X318_7", nullable = true, length = 2)
    public String getDb11X3187() {
        return db11X3187;
    }

    public void setDb11X3187(String db11X3187) {
        this.db11X3187 = db11X3187;
    }

    @Basic
    @Column(name = "DB11_X319_0", nullable = true, length = 2)
    public String getDb11X3190() {
        return db11X3190;
    }

    public void setDb11X3190(String db11X3190) {
        this.db11X3190 = db11X3190;
    }

    @Basic
    @Column(name = "DB11_X319_1", nullable = true, length = 2)
    public String getDb11X3191() {
        return db11X3191;
    }

    public void setDb11X3191(String db11X3191) {
        this.db11X3191 = db11X3191;
    }

    @Basic
    @Column(name = "DB11_X319_2", nullable = true, length = 2)
    public String getDb11X3192() {
        return db11X3192;
    }

    public void setDb11X3192(String db11X3192) {
        this.db11X3192 = db11X3192;
    }

    @Basic
    @Column(name = "DB11_X319_3", nullable = true, length = 2)
    public String getDb11X3193() {
        return db11X3193;
    }

    public void setDb11X3193(String db11X3193) {
        this.db11X3193 = db11X3193;
    }

    @Basic
    @Column(name = "DB11_X319_4", nullable = true, length = 2)
    public String getDb11X3194() {
        return db11X3194;
    }

    public void setDb11X3194(String db11X3194) {
        this.db11X3194 = db11X3194;
    }

    @Basic
    @Column(name = "DB11_X319_5", nullable = true, length = 2)
    public String getDb11X3195() {
        return db11X3195;
    }

    public void setDb11X3195(String db11X3195) {
        this.db11X3195 = db11X3195;
    }

    @Basic
    @Column(name = "DB11_X319_6", nullable = true, length = 2)
    public String getDb11X3196() {
        return db11X3196;
    }

    public void setDb11X3196(String db11X3196) {
        this.db11X3196 = db11X3196;
    }

    @Basic
    @Column(name = "DB11_X320_0", nullable = true, length = 2)
    public String getDb11X3200() {
        return db11X3200;
    }

    public void setDb11X3200(String db11X3200) {
        this.db11X3200 = db11X3200;
    }

    @Basic
    @Column(name = "DB11_X320_1", nullable = true, length = 2)
    public String getDb11X3201() {
        return db11X3201;
    }

    public void setDb11X3201(String db11X3201) {
        this.db11X3201 = db11X3201;
    }

    @Basic
    @Column(name = "DB11_X320_2", nullable = true, length = 2)
    public String getDb11X3202() {
        return db11X3202;
    }

    public void setDb11X3202(String db11X3202) {
        this.db11X3202 = db11X3202;
    }

    @Basic
    @Column(name = "DB11_X320_3", nullable = true, length = 2)
    public String getDb11X3203() {
        return db11X3203;
    }

    public void setDb11X3203(String db11X3203) {
        this.db11X3203 = db11X3203;
    }

    @Basic
    @Column(name = "DB11_X320_4", nullable = true, length = 2)
    public String getDb11X3204() {
        return db11X3204;
    }

    public void setDb11X3204(String db11X3204) {
        this.db11X3204 = db11X3204;
    }

    @Basic
    @Column(name = "DB11_X320_5", nullable = true, length = 2)
    public String getDb11X3205() {
        return db11X3205;
    }

    public void setDb11X3205(String db11X3205) {
        this.db11X3205 = db11X3205;
    }

    @Basic
    @Column(name = "DB11_X320_6", nullable = true, length = 2)
    public String getDb11X3206() {
        return db11X3206;
    }

    public void setDb11X3206(String db11X3206) {
        this.db11X3206 = db11X3206;
    }

    @Basic
    @Column(name = "DB11_X320_7", nullable = true, length = 2)
    public String getDb11X3207() {
        return db11X3207;
    }

    public void setDb11X3207(String db11X3207) {
        this.db11X3207 = db11X3207;
    }

    @Basic
    @Column(name = "DB11_X321_0", nullable = true, length = 2)
    public String getDb11X3210() {
        return db11X3210;
    }

    public void setDb11X3210(String db11X3210) {
        this.db11X3210 = db11X3210;
    }

    @Basic
    @Column(name = "DB11_X321_1", nullable = true, length = 2)
    public String getDb11X3211() {
        return db11X3211;
    }

    public void setDb11X3211(String db11X3211) {
        this.db11X3211 = db11X3211;
    }

    @Basic
    @Column(name = "DB11_X321_4", nullable = true, length = 2)
    public String getDb11X3214() {
        return db11X3214;
    }

    public void setDb11X3214(String db11X3214) {
        this.db11X3214 = db11X3214;
    }

    @Basic
    @Column(name = "DB11_X321_5", nullable = true, length = 2)
    public String getDb11X3215() {
        return db11X3215;
    }

    public void setDb11X3215(String db11X3215) {
        this.db11X3215 = db11X3215;
    }

    @Basic
    @Column(name = "DB11_X322_0", nullable = true, length = 2)
    public String getDb11X3220() {
        return db11X3220;
    }

    public void setDb11X3220(String db11X3220) {
        this.db11X3220 = db11X3220;
    }

    @Basic
    @Column(name = "DB11_X322_1", nullable = true, length = 2)
    public String getDb11X3221() {
        return db11X3221;
    }

    public void setDb11X3221(String db11X3221) {
        this.db11X3221 = db11X3221;
    }

    @Basic
    @Column(name = "DB11_X324_0", nullable = true, length = 2)
    public String getDb11X3240() {
        return db11X3240;
    }

    public void setDb11X3240(String db11X3240) {
        this.db11X3240 = db11X3240;
    }

    @Basic
    @Column(name = "DB11_X324_1", nullable = true, length = 2)
    public String getDb11X3241() {
        return db11X3241;
    }

    public void setDb11X3241(String db11X3241) {
        this.db11X3241 = db11X3241;
    }

    @Basic
    @Column(name = "DB11_X324_2", nullable = true, length = 2)
    public String getDb11X3242() {
        return db11X3242;
    }

    public void setDb11X3242(String db11X3242) {
        this.db11X3242 = db11X3242;
    }

    @Basic
    @Column(name = "DB11_X324_3", nullable = true, length = 2)
    public String getDb11X3243() {
        return db11X3243;
    }

    public void setDb11X3243(String db11X3243) {
        this.db11X3243 = db11X3243;
    }

    @Basic
    @Column(name = "DB11_X324_4", nullable = true, length = 2)
    public String getDb11X3244() {
        return db11X3244;
    }

    public void setDb11X3244(String db11X3244) {
        this.db11X3244 = db11X3244;
    }

    @Basic
    @Column(name = "DB11_X324_5", nullable = true, length = 2)
    public String getDb11X3245() {
        return db11X3245;
    }

    public void setDb11X3245(String db11X3245) {
        this.db11X3245 = db11X3245;
    }

    @Basic
    @Column(name = "DB11_X326_0", nullable = true, length = 2)
    public String getDb11X3260() {
        return db11X3260;
    }

    public void setDb11X3260(String db11X3260) {
        this.db11X3260 = db11X3260;
    }

    @Basic
    @Column(name = "DB11_X326_1", nullable = true, length = 2)
    public String getDb11X3261() {
        return db11X3261;
    }

    public void setDb11X3261(String db11X3261) {
        this.db11X3261 = db11X3261;
    }

    @Basic
    @Column(name = "DB15_CHAR48_40", nullable = true, length = 4000)
    public String getDb15Char4840() {
        return db15Char4840;
    }

    public void setDb15Char4840(String db15Char4840) {
        this.db15Char4840 = db15Char4840;
    }

    @Basic
    @Column(name = "DB15_INT0_22", nullable = true, length = 4000)
    public String getDb15Int022() {
        return db15Int022;
    }

    public void setDb15Int022(String db15Int022) {
        this.db15Int022 = db15Int022;
    }

    @Basic
    @Column(name = "DB15_SINT46", nullable = true, precision = 0)
    public Integer getDb15Sint46() {
        return db15Sint46;
    }

    public void setDb15Sint46(Integer db15Sint46) {
        this.db15Sint46 = db15Sint46;
    }

    @Basic
    @Column(name = "M98_0", nullable = true, length = 2)
    public String getM980() {
        return m980;
    }

    public void setM980(String m980) {
        this.m980 = m980;
    }

    @Basic
    @Column(name = "M98_5", nullable = true, length = 2)
    public String getM985() {
        return m985;
    }

    public void setM985(String m985) {
        this.m985 = m985;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CL_COMOP130 that = (CL_COMOP130) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(isSynch, that.isSynch) &&
                Objects.equals(db11Int10, that.db11Int10) &&
                Objects.equals(db11Int314, that.db11Int314) &&
                Objects.equals(db11Int8, that.db11Int8) &&
                Objects.equals(db11Real0, that.db11Real0) &&
                Objects.equals(db11Real102, that.db11Real102) &&
                Objects.equals(db11Real106, that.db11Real106) &&
                Objects.equals(db11Real110, that.db11Real110) &&
                Objects.equals(db11Real114, that.db11Real114) &&
                Objects.equals(db11Real130, that.db11Real130) &&
                Objects.equals(db11Real134, that.db11Real134) &&
                Objects.equals(db11Real138, that.db11Real138) &&
                Objects.equals(db11Real142, that.db11Real142) &&
                Objects.equals(db11Real146, that.db11Real146) &&
                Objects.equals(db11Real150, that.db11Real150) &&
                Objects.equals(db11Real154, that.db11Real154) &&
                Objects.equals(db11Real158, that.db11Real158) &&
                Objects.equals(db11Real174, that.db11Real174) &&
                Objects.equals(db11Real178, that.db11Real178) &&
                Objects.equals(db11Real18, that.db11Real18) &&
                Objects.equals(db11Real182, that.db11Real182) &&
                Objects.equals(db11Real186, that.db11Real186) &&
                Objects.equals(db11Real190, that.db11Real190) &&
                Objects.equals(db11Real194, that.db11Real194) &&
                Objects.equals(db11Real198, that.db11Real198) &&
                Objects.equals(db11Real202, that.db11Real202) &&
                Objects.equals(db11Real218, that.db11Real218) &&
                Objects.equals(db11Real222, that.db11Real222) &&
                Objects.equals(db11Real226, that.db11Real226) &&
                Objects.equals(db11Real230, that.db11Real230) &&
                Objects.equals(db11Real234, that.db11Real234) &&
                Objects.equals(db11Real238, that.db11Real238) &&
                Objects.equals(db11Real242, that.db11Real242) &&
                Objects.equals(db11Real246, that.db11Real246) &&
                Objects.equals(db11Real264, that.db11Real264) &&
                Objects.equals(db11Real268, that.db11Real268) &&
                Objects.equals(db11Real272, that.db11Real272) &&
                Objects.equals(db11Real276, that.db11Real276) &&
                Objects.equals(db11Real280, that.db11Real280) &&
                Objects.equals(db11Real284, that.db11Real284) &&
                Objects.equals(db11Real288, that.db11Real288) &&
                Objects.equals(db11Real292, that.db11Real292) &&
                Objects.equals(db11Real296, that.db11Real296) &&
                Objects.equals(db11Real30, that.db11Real30) &&
                Objects.equals(db11Real300, that.db11Real300) &&
                Objects.equals(db11Real304, that.db11Real304) &&
                Objects.equals(db11Real308, that.db11Real308) &&
                Objects.equals(db11Real4, that.db11Real4) &&
                Objects.equals(db11Real42, that.db11Real42) &&
                Objects.equals(db11Real54, that.db11Real54) &&
                Objects.equals(db11Real66, that.db11Real66) &&
                Objects.equals(db11Real78, that.db11Real78) &&
                Objects.equals(db11Real86, that.db11Real86) &&
                Objects.equals(db11Real90, that.db11Real90) &&
                Objects.equals(db11Real94, that.db11Real94) &&
                Objects.equals(db11Real98, that.db11Real98) &&
                Objects.equals(db11X1290, that.db11X1290) &&
                Objects.equals(db11X1292, that.db11X1292) &&
                Objects.equals(db11X120, that.db11X120) &&
                Objects.equals(db11X121, that.db11X121) &&
                Objects.equals(db11X1730, that.db11X1730) &&
                Objects.equals(db11X1732, that.db11X1732) &&
                Objects.equals(db11X2170, that.db11X2170) &&
                Objects.equals(db11X2172, that.db11X2172) &&
                Objects.equals(db11X2610, that.db11X2610) &&
                Objects.equals(db11X2612, that.db11X2612) &&
                Objects.equals(db11X3160, that.db11X3160) &&
                Objects.equals(db11X3161, that.db11X3161) &&
                Objects.equals(db11X3162, that.db11X3162) &&
                Objects.equals(db11X3163, that.db11X3163) &&
                Objects.equals(db11X3164, that.db11X3164) &&
                Objects.equals(db11X3165, that.db11X3165) &&
                Objects.equals(db11X3170, that.db11X3170) &&
                Objects.equals(db11X3171, that.db11X3171) &&
                Objects.equals(db11X3172, that.db11X3172) &&
                Objects.equals(db11X3173, that.db11X3173) &&
                Objects.equals(db11X3174, that.db11X3174) &&
                Objects.equals(db11X3175, that.db11X3175) &&
                Objects.equals(db11X3176, that.db11X3176) &&
                Objects.equals(db11X3180, that.db11X3180) &&
                Objects.equals(db11X3181, that.db11X3181) &&
                Objects.equals(db11X3182, that.db11X3182) &&
                Objects.equals(db11X3183, that.db11X3183) &&
                Objects.equals(db11X3184, that.db11X3184) &&
                Objects.equals(db11X3185, that.db11X3185) &&
                Objects.equals(db11X3186, that.db11X3186) &&
                Objects.equals(db11X3187, that.db11X3187) &&
                Objects.equals(db11X3190, that.db11X3190) &&
                Objects.equals(db11X3191, that.db11X3191) &&
                Objects.equals(db11X3192, that.db11X3192) &&
                Objects.equals(db11X3193, that.db11X3193) &&
                Objects.equals(db11X3194, that.db11X3194) &&
                Objects.equals(db11X3195, that.db11X3195) &&
                Objects.equals(db11X3196, that.db11X3196) &&
                Objects.equals(db11X3200, that.db11X3200) &&
                Objects.equals(db11X3201, that.db11X3201) &&
                Objects.equals(db11X3202, that.db11X3202) &&
                Objects.equals(db11X3203, that.db11X3203) &&
                Objects.equals(db11X3204, that.db11X3204) &&
                Objects.equals(db11X3205, that.db11X3205) &&
                Objects.equals(db11X3206, that.db11X3206) &&
                Objects.equals(db11X3207, that.db11X3207) &&
                Objects.equals(db11X3210, that.db11X3210) &&
                Objects.equals(db11X3211, that.db11X3211) &&
                Objects.equals(db11X3214, that.db11X3214) &&
                Objects.equals(db11X3215, that.db11X3215) &&
                Objects.equals(db11X3220, that.db11X3220) &&
                Objects.equals(db11X3221, that.db11X3221) &&
                Objects.equals(db11X3240, that.db11X3240) &&
                Objects.equals(db11X3241, that.db11X3241) &&
                Objects.equals(db11X3242, that.db11X3242) &&
                Objects.equals(db11X3243, that.db11X3243) &&
                Objects.equals(db11X3244, that.db11X3244) &&
                Objects.equals(db11X3245, that.db11X3245) &&
                Objects.equals(db11X3260, that.db11X3260) &&
                Objects.equals(db11X3261, that.db11X3261) &&
                Objects.equals(db15Char4840, that.db15Char4840) &&
                Objects.equals(db15Int022, that.db15Int022) &&
                Objects.equals(db15Sint46, that.db15Sint46) &&
                Objects.equals(m980, that.m980) &&
                Objects.equals(m985, that.m985);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, createDate, isSynch, db11Int10, db11Int314, db11Int8, db11Real0, db11Real102, db11Real106, db11Real110, db11Real114, db11Real130, db11Real134, db11Real138, db11Real142, db11Real146, db11Real150, db11Real154, db11Real158, db11Real174, db11Real178, db11Real18, db11Real182, db11Real186, db11Real190, db11Real194, db11Real198, db11Real202, db11Real218, db11Real222, db11Real226, db11Real230, db11Real234, db11Real238, db11Real242, db11Real246, db11Real264, db11Real268, db11Real272, db11Real276, db11Real280, db11Real284, db11Real288, db11Real292, db11Real296, db11Real30, db11Real300, db11Real304, db11Real308, db11Real4, db11Real42, db11Real54, db11Real66, db11Real78, db11Real86, db11Real90, db11Real94, db11Real98, db11X1290, db11X1292, db11X120, db11X121, db11X1730, db11X1732, db11X2170, db11X2172, db11X2610, db11X2612, db11X3160, db11X3161, db11X3162, db11X3163, db11X3164, db11X3165, db11X3170, db11X3171, db11X3172, db11X3173, db11X3174, db11X3175, db11X3176, db11X3180, db11X3181, db11X3182, db11X3183, db11X3184, db11X3185, db11X3186, db11X3187, db11X3190, db11X3191, db11X3192, db11X3193, db11X3194, db11X3195, db11X3196, db11X3200, db11X3201, db11X3202, db11X3203, db11X3204, db11X3205, db11X3206, db11X3207, db11X3210, db11X3211, db11X3214, db11X3215, db11X3220, db11X3221, db11X3240, db11X3241, db11X3242, db11X3243, db11X3244, db11X3245, db11X3260, db11X3261, db15Char4840, db15Int022, db15Sint46, m980, m985);
    }
}
