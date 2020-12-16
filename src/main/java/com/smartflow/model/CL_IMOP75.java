package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_IMOP75")
public class CL_IMOP75 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private BigDecimal DB11_INT10;
    private BigDecimal DB11_INT314;
    private BigDecimal DB11_INT8;
    private BigDecimal DB11_REAL0;
    private BigDecimal DB11_REAL102;
    private BigDecimal DB11_REAL106;
    private BigDecimal DB11_REAL110;
    private BigDecimal DB11_REAL114;
    private BigDecimal DB11_REAL130;
    private BigDecimal DB11_REAL134;
    private BigDecimal DB11_REAL138;
    private BigDecimal DB11_REAL142;
    private BigDecimal DB11_REAL146;
    private BigDecimal DB11_REAL150;
    private BigDecimal DB11_REAL154;
    private BigDecimal DB11_REAL158;
    private BigDecimal DB11_REAL174;
    private BigDecimal DB11_REAL178;
    private BigDecimal DB11_REAL18;
    private BigDecimal DB11_REAL182;
    private BigDecimal DB11_REAL186;
    private BigDecimal DB11_REAL190;
    private BigDecimal DB11_REAL194;
    private BigDecimal DB11_REAL198;
    private BigDecimal DB11_REAL202;
    private BigDecimal DB11_REAL218;
    private BigDecimal DB11_REAL222;
    private BigDecimal DB11_REAL226;
    private BigDecimal DB11_REAL230;
    private BigDecimal DB11_REAL234;
    private BigDecimal DB11_REAL238;
    private BigDecimal DB11_REAL242;
    private BigDecimal DB11_REAL246;
    private BigDecimal DB11_REAL264;
    private BigDecimal DB11_REAL268;
    private BigDecimal DB11_REAL272;
    private BigDecimal DB11_REAL276;
    private BigDecimal DB11_REAL280;
    private BigDecimal DB11_REAL284;
    private BigDecimal DB11_REAL288;
    private BigDecimal DB11_REAL292;
    private BigDecimal DB11_REAL296;
    private BigDecimal DB11_REAL30;
    private BigDecimal DB11_REAL300;
    private BigDecimal DB11_REAL304;
    private BigDecimal DB11_REAL308;
    private BigDecimal DB11_REAL4;
    private BigDecimal DB11_REAL42;
    private BigDecimal DB11_REAL54;
    private BigDecimal DB11_REAL66;
    private BigDecimal DB11_REAL78;
    private BigDecimal DB11_REAL86;
    private BigDecimal DB11_REAL90;
    private BigDecimal DB11_REAL94;
    private BigDecimal DB11_REAL98;
    private String DB11_X12_0;
    private String DB11_X12_1;
    private String DB15_CHAR48_40;
    private String DB15_INT0_22;
    private BigDecimal DB15_SINT46;



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

    public BigDecimal getDB11_INT10() {
        return DB11_INT10;
    }

    public void setDB11_INT10(BigDecimal DB11_INT10) {
        this.DB11_INT10 = DB11_INT10;
    }

    public BigDecimal getDB11_INT314() {
        return DB11_INT314;
    }

    public void setDB11_INT314(BigDecimal DB11_INT314) {
        this.DB11_INT314 = DB11_INT314;
    }

    public BigDecimal getDB11_INT8() {
        return DB11_INT8;
    }

    public void setDB11_INT8(BigDecimal DB11_INT8) {
        this.DB11_INT8 = DB11_INT8;
    }

    public BigDecimal getDB11_REAL0() {
        return DB11_REAL0;
    }

    public void setDB11_REAL0(BigDecimal DB11_REAL0) {
        this.DB11_REAL0 = DB11_REAL0;
    }

    public BigDecimal getDB11_REAL102() {
        return DB11_REAL102;
    }

    public void setDB11_REAL102(BigDecimal DB11_REAL102) {
        this.DB11_REAL102 = DB11_REAL102;
    }

    public BigDecimal getDB11_REAL106() {
        return DB11_REAL106;
    }

    public void setDB11_REAL106(BigDecimal DB11_REAL106) {
        this.DB11_REAL106 = DB11_REAL106;
    }

    public BigDecimal getDB11_REAL110() {
        return DB11_REAL110;
    }

    public void setDB11_REAL110(BigDecimal DB11_REAL110) {
        this.DB11_REAL110 = DB11_REAL110;
    }

    public BigDecimal getDB11_REAL114() {
        return DB11_REAL114;
    }

    public void setDB11_REAL114(BigDecimal DB11_REAL114) {
        this.DB11_REAL114 = DB11_REAL114;
    }

    public BigDecimal getDB11_REAL130() {
        return DB11_REAL130;
    }

    public void setDB11_REAL130(BigDecimal DB11_REAL130) {
        this.DB11_REAL130 = DB11_REAL130;
    }

    public BigDecimal getDB11_REAL134() {
        return DB11_REAL134;
    }

    public void setDB11_REAL134(BigDecimal DB11_REAL134) {
        this.DB11_REAL134 = DB11_REAL134;
    }

    public BigDecimal getDB11_REAL138() {
        return DB11_REAL138;
    }

    public void setDB11_REAL138(BigDecimal DB11_REAL138) {
        this.DB11_REAL138 = DB11_REAL138;
    }

    public BigDecimal getDB11_REAL142() {
        return DB11_REAL142;
    }

    public void setDB11_REAL142(BigDecimal DB11_REAL142) {
        this.DB11_REAL142 = DB11_REAL142;
    }

    public BigDecimal getDB11_REAL146() {
        return DB11_REAL146;
    }

    public void setDB11_REAL146(BigDecimal DB11_REAL146) {
        this.DB11_REAL146 = DB11_REAL146;
    }

    public BigDecimal getDB11_REAL150() {
        return DB11_REAL150;
    }

    public void setDB11_REAL150(BigDecimal DB11_REAL150) {
        this.DB11_REAL150 = DB11_REAL150;
    }

    public BigDecimal getDB11_REAL154() {
        return DB11_REAL154;
    }

    public void setDB11_REAL154(BigDecimal DB11_REAL154) {
        this.DB11_REAL154 = DB11_REAL154;
    }

    public BigDecimal getDB11_REAL158() {
        return DB11_REAL158;
    }

    public void setDB11_REAL158(BigDecimal DB11_REAL158) {
        this.DB11_REAL158 = DB11_REAL158;
    }

    public BigDecimal getDB11_REAL174() {
        return DB11_REAL174;
    }

    public void setDB11_REAL174(BigDecimal DB11_REAL174) {
        this.DB11_REAL174 = DB11_REAL174;
    }

    public BigDecimal getDB11_REAL178() {
        return DB11_REAL178;
    }

    public void setDB11_REAL178(BigDecimal DB11_REAL178) {
        this.DB11_REAL178 = DB11_REAL178;
    }

    public BigDecimal getDB11_REAL18() {
        return DB11_REAL18;
    }

    public void setDB11_REAL18(BigDecimal DB11_REAL18) {
        this.DB11_REAL18 = DB11_REAL18;
    }

    public BigDecimal getDB11_REAL182() {
        return DB11_REAL182;
    }

    public void setDB11_REAL182(BigDecimal DB11_REAL182) {
        this.DB11_REAL182 = DB11_REAL182;
    }

    public BigDecimal getDB11_REAL186() {
        return DB11_REAL186;
    }

    public void setDB11_REAL186(BigDecimal DB11_REAL186) {
        this.DB11_REAL186 = DB11_REAL186;
    }

    public BigDecimal getDB11_REAL190() {
        return DB11_REAL190;
    }

    public void setDB11_REAL190(BigDecimal DB11_REAL190) {
        this.DB11_REAL190 = DB11_REAL190;
    }

    public BigDecimal getDB11_REAL194() {
        return DB11_REAL194;
    }

    public void setDB11_REAL194(BigDecimal DB11_REAL194) {
        this.DB11_REAL194 = DB11_REAL194;
    }

    public BigDecimal getDB11_REAL198() {
        return DB11_REAL198;
    }

    public void setDB11_REAL198(BigDecimal DB11_REAL198) {
        this.DB11_REAL198 = DB11_REAL198;
    }

    public BigDecimal getDB11_REAL202() {
        return DB11_REAL202;
    }

    public void setDB11_REAL202(BigDecimal DB11_REAL202) {
        this.DB11_REAL202 = DB11_REAL202;
    }

    public BigDecimal getDB11_REAL218() {
        return DB11_REAL218;
    }

    public void setDB11_REAL218(BigDecimal DB11_REAL218) {
        this.DB11_REAL218 = DB11_REAL218;
    }

    public BigDecimal getDB11_REAL222() {
        return DB11_REAL222;
    }

    public void setDB11_REAL222(BigDecimal DB11_REAL222) {
        this.DB11_REAL222 = DB11_REAL222;
    }

    public BigDecimal getDB11_REAL226() {
        return DB11_REAL226;
    }

    public void setDB11_REAL226(BigDecimal DB11_REAL226) {
        this.DB11_REAL226 = DB11_REAL226;
    }

    public BigDecimal getDB11_REAL230() {
        return DB11_REAL230;
    }

    public void setDB11_REAL230(BigDecimal DB11_REAL230) {
        this.DB11_REAL230 = DB11_REAL230;
    }

    public BigDecimal getDB11_REAL234() {
        return DB11_REAL234;
    }

    public void setDB11_REAL234(BigDecimal DB11_REAL234) {
        this.DB11_REAL234 = DB11_REAL234;
    }

    public BigDecimal getDB11_REAL238() {
        return DB11_REAL238;
    }

    public void setDB11_REAL238(BigDecimal DB11_REAL238) {
        this.DB11_REAL238 = DB11_REAL238;
    }

    public BigDecimal getDB11_REAL242() {
        return DB11_REAL242;
    }

    public void setDB11_REAL242(BigDecimal DB11_REAL242) {
        this.DB11_REAL242 = DB11_REAL242;
    }

    public BigDecimal getDB11_REAL246() {
        return DB11_REAL246;
    }

    public void setDB11_REAL246(BigDecimal DB11_REAL246) {
        this.DB11_REAL246 = DB11_REAL246;
    }

    public BigDecimal getDB11_REAL264() {
        return DB11_REAL264;
    }

    public void setDB11_REAL264(BigDecimal DB11_REAL264) {
        this.DB11_REAL264 = DB11_REAL264;
    }

    public BigDecimal getDB11_REAL268() {
        return DB11_REAL268;
    }

    public void setDB11_REAL268(BigDecimal DB11_REAL268) {
        this.DB11_REAL268 = DB11_REAL268;
    }

    public BigDecimal getDB11_REAL272() {
        return DB11_REAL272;
    }

    public void setDB11_REAL272(BigDecimal DB11_REAL272) {
        this.DB11_REAL272 = DB11_REAL272;
    }

    public BigDecimal getDB11_REAL276() {
        return DB11_REAL276;
    }

    public void setDB11_REAL276(BigDecimal DB11_REAL276) {
        this.DB11_REAL276 = DB11_REAL276;
    }

    public BigDecimal getDB11_REAL280() {
        return DB11_REAL280;
    }

    public void setDB11_REAL280(BigDecimal DB11_REAL280) {
        this.DB11_REAL280 = DB11_REAL280;
    }

    public BigDecimal getDB11_REAL284() {
        return DB11_REAL284;
    }

    public void setDB11_REAL284(BigDecimal DB11_REAL284) {
        this.DB11_REAL284 = DB11_REAL284;
    }

    public BigDecimal getDB11_REAL288() {
        return DB11_REAL288;
    }

    public void setDB11_REAL288(BigDecimal DB11_REAL288) {
        this.DB11_REAL288 = DB11_REAL288;
    }

    public BigDecimal getDB11_REAL292() {
        return DB11_REAL292;
    }

    public void setDB11_REAL292(BigDecimal DB11_REAL292) {
        this.DB11_REAL292 = DB11_REAL292;
    }

    public BigDecimal getDB11_REAL296() {
        return DB11_REAL296;
    }

    public void setDB11_REAL296(BigDecimal DB11_REAL296) {
        this.DB11_REAL296 = DB11_REAL296;
    }

    public BigDecimal getDB11_REAL30() {
        return DB11_REAL30;
    }

    public void setDB11_REAL30(BigDecimal DB11_REAL30) {
        this.DB11_REAL30 = DB11_REAL30;
    }

    public BigDecimal getDB11_REAL300() {
        return DB11_REAL300;
    }

    public void setDB11_REAL300(BigDecimal DB11_REAL300) {
        this.DB11_REAL300 = DB11_REAL300;
    }

    public BigDecimal getDB11_REAL304() {
        return DB11_REAL304;
    }

    public void setDB11_REAL304(BigDecimal DB11_REAL304) {
        this.DB11_REAL304 = DB11_REAL304;
    }

    public BigDecimal getDB11_REAL308() {
        return DB11_REAL308;
    }

    public void setDB11_REAL308(BigDecimal DB11_REAL308) {
        this.DB11_REAL308 = DB11_REAL308;
    }

    public BigDecimal getDB11_REAL4() {
        return DB11_REAL4;
    }

    public void setDB11_REAL4(BigDecimal DB11_REAL4) {
        this.DB11_REAL4 = DB11_REAL4;
    }

    public BigDecimal getDB11_REAL42() {
        return DB11_REAL42;
    }

    public void setDB11_REAL42(BigDecimal DB11_REAL42) {
        this.DB11_REAL42 = DB11_REAL42;
    }

    public BigDecimal getDB11_REAL54() {
        return DB11_REAL54;
    }

    public void setDB11_REAL54(BigDecimal DB11_REAL54) {
        this.DB11_REAL54 = DB11_REAL54;
    }

    public BigDecimal getDB11_REAL66() {
        return DB11_REAL66;
    }

    public void setDB11_REAL66(BigDecimal DB11_REAL66) {
        this.DB11_REAL66 = DB11_REAL66;
    }

    public BigDecimal getDB11_REAL78() {
        return DB11_REAL78;
    }

    public void setDB11_REAL78(BigDecimal DB11_REAL78) {
        this.DB11_REAL78 = DB11_REAL78;
    }

    public BigDecimal getDB11_REAL86() {
        return DB11_REAL86;
    }

    public void setDB11_REAL86(BigDecimal DB11_REAL86) {
        this.DB11_REAL86 = DB11_REAL86;
    }

    public BigDecimal getDB11_REAL90() {
        return DB11_REAL90;
    }

    public void setDB11_REAL90(BigDecimal DB11_REAL90) {
        this.DB11_REAL90 = DB11_REAL90;
    }

    public BigDecimal getDB11_REAL94() {
        return DB11_REAL94;
    }

    public void setDB11_REAL94(BigDecimal DB11_REAL94) {
        this.DB11_REAL94 = DB11_REAL94;
    }

    public BigDecimal getDB11_REAL98() {
        return DB11_REAL98;
    }

    public void setDB11_REAL98(BigDecimal DB11_REAL98) {
        this.DB11_REAL98 = DB11_REAL98;
    }


    public String getDB11_X12_0() {
        return DB11_X12_0;
    }

    public void setDB11_X12_0(String DB11_X12_0) {
        this.DB11_X12_0 = DB11_X12_0;
    }

    public String getDB11_X12_1() {
        return DB11_X12_1;
    }

    public void setDB11_X12_1(String DB11_X12_1) {
        this.DB11_X12_1 = DB11_X12_1;
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

   }
