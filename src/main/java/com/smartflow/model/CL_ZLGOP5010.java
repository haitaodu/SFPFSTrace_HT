package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 13:30
 */

@Entity
@Table(name = "CL_ZLGOP5010", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_ZLGOP5010 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private java.util.Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNuMber;
    private Integer WorkOrderId;
    private Integer DB64DBW0;
    private Integer DB64DBW2;
    private String DB64DBX40;
    private String DB64DBX41;
    private String DB64DBX42;
    private String DB64DBX43;
    private String DB64DBX44;
    private String DB64DBX45;
    private String DB64DBX46;
    private String DB64DBX47;
    private String DB64DBX50;
    private String DB64DBX51;
    private String DB64DBX52;
    private String IB404;
    private String IW406;
    private String IW408;
    private String IW412;
    private String M2010;
    private String M2011;
    private String M2012;
    private String M2013;
    private String M2014;
    private String M2015;
    private String M2016;
    private String M2020;
    private String M2030;
    private String M2031;
    private String M2032;
    private String M2033;
    private String M2034;
    private String M2035;
    private String M2036;
    private String M2037;
    private String Q8000;
    private String Q8001;
    private String Q8002;
    private String Q8003;
    private String Q8004;
    private String Q8005;
    private String Q8006;
    private String Q8007;
    private String Q8020;
    private String Q8021;
    private String Q8022;
    private String Q8023;
    private String Q8024;
    private String Q8025;
    private String Q8026;
    private String Q8027;
    private String Q8040;
    private String Q8041;
    private String Q8042;
    private String Q8043;
    private String Q8044;
    private String Q8045;
    private String Q8046;
    private String Q8047;
    private String QW809;
    private Integer QW840;
    private Integer QW841;
    private Integer QW842;
    private Integer QW843;
    private Integer QW844;
    private BigDecimal DB64DDB6;
    private BigDecimal DB64DDB10;
    private BigDecimal DB64DDB14;

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

    public String getSerialNuMber() {
        return SerialNuMber;
    }

    public void setSerialNuMber(String serialNuMber) {
        SerialNuMber = serialNuMber;
    }

    public Integer getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        WorkOrderId = workOrderId;
    }

    public Integer getDB64DBW0() {
        return DB64DBW0;
    }

    public void setDB64DBW0(Integer DB64DBW0) {
        this.DB64DBW0 = DB64DBW0;
    }

    public Integer getDB64DBW2() {
        return DB64DBW2;
    }

    public void setDB64DBW2(Integer DB64DBW2) {
        this.DB64DBW2 = DB64DBW2;
    }

    public String getDB64DBX40() {
        return DB64DBX40;
    }

    public void setDB64DBX40(String DB64DBX40) {
        this.DB64DBX40 = DB64DBX40;
    }

    public String getDB64DBX41() {
        return DB64DBX41;
    }

    public void setDB64DBX41(String DB64DBX41) {
        this.DB64DBX41 = DB64DBX41;
    }

    public String getDB64DBX42() {
        return DB64DBX42;
    }

    public void setDB64DBX42(String DB64DBX42) {
        this.DB64DBX42 = DB64DBX42;
    }

    public String getDB64DBX43() {
        return DB64DBX43;
    }

    public void setDB64DBX43(String DB64DBX43) {
        this.DB64DBX43 = DB64DBX43;
    }

    public String getDB64DBX44() {
        return DB64DBX44;
    }

    public void setDB64DBX44(String DB64DBX44) {
        this.DB64DBX44 = DB64DBX44;
    }

    public String getDB64DBX45() {
        return DB64DBX45;
    }

    public void setDB64DBX45(String DB64DBX45) {
        this.DB64DBX45 = DB64DBX45;
    }

    public String getDB64DBX46() {
        return DB64DBX46;
    }

    public void setDB64DBX46(String DB64DBX46) {
        this.DB64DBX46 = DB64DBX46;
    }

    public String getDB64DBX47() {
        return DB64DBX47;
    }

    public void setDB64DBX47(String DB64DBX47) {
        this.DB64DBX47 = DB64DBX47;
    }

    public String getDB64DBX50() {
        return DB64DBX50;
    }

    public void setDB64DBX50(String DB64DBX50) {
        this.DB64DBX50 = DB64DBX50;
    }

    public String getDB64DBX51() {
        return DB64DBX51;
    }

    public void setDB64DBX51(String DB64DBX51) {
        this.DB64DBX51 = DB64DBX51;
    }

    public String getDB64DBX52() {
        return DB64DBX52;
    }

    public void setDB64DBX52(String DB64DBX52) {
        this.DB64DBX52 = DB64DBX52;
    }

    public String getIB404() {
        return IB404;
    }

    public void setIB404(String IB404) {
        this.IB404 = IB404;
    }

    public String getIW406() {
        return IW406;
    }

    public void setIW406(String IW406) {
        this.IW406 = IW406;
    }

    public String getIW408() {
        return IW408;
    }

    public void setIW408(String IW408) {
        this.IW408 = IW408;
    }

    public String getIW412() {
        return IW412;
    }

    public void setIW412(String IW412) {
        this.IW412 = IW412;
    }

    public String getM2010() {
        return M2010;
    }

    public void setM2010(String m2010) {
        M2010 = m2010;
    }

    public String getM2011() {
        return M2011;
    }

    public void setM2011(String m2011) {
        M2011 = m2011;
    }

    public String getM2012() {
        return M2012;
    }

    public void setM2012(String m2012) {
        M2012 = m2012;
    }

    public String getM2013() {
        return M2013;
    }

    public void setM2013(String m2013) {
        M2013 = m2013;
    }

    public String getM2014() {
        return M2014;
    }

    public void setM2014(String m2014) {
        M2014 = m2014;
    }

    public String getM2015() {
        return M2015;
    }

    public void setM2015(String m2015) {
        M2015 = m2015;
    }

    public String getM2016() {
        return M2016;
    }

    public void setM2016(String m2016) {
        M2016 = m2016;
    }

    public String getM2020() {
        return M2020;
    }

    public void setM2020(String m2020) {
        M2020 = m2020;
    }

    public String getM2030() {
        return M2030;
    }

    public void setM2030(String m2030) {
        M2030 = m2030;
    }

    public String getM2031() {
        return M2031;
    }

    public void setM2031(String m2031) {
        M2031 = m2031;
    }

    public String getM2032() {
        return M2032;
    }

    public void setM2032(String m2032) {
        M2032 = m2032;
    }

    public String getM2033() {
        return M2033;
    }

    public void setM2033(String m2033) {
        M2033 = m2033;
    }

    public String getM2034() {
        return M2034;
    }

    public void setM2034(String m2034) {
        M2034 = m2034;
    }

    public String getM2035() {
        return M2035;
    }

    public void setM2035(String m2035) {
        M2035 = m2035;
    }

    public String getM2036() {
        return M2036;
    }

    public void setM2036(String m2036) {
        M2036 = m2036;
    }

    public String getM2037() {
        return M2037;
    }

    public void setM2037(String m2037) {
        M2037 = m2037;
    }

    public String getQ8000() {
        return Q8000;
    }

    public void setQ8000(String q8000) {
        Q8000 = q8000;
    }

    public String getQ8001() {
        return Q8001;
    }

    public void setQ8001(String q8001) {
        Q8001 = q8001;
    }

    public String getQ8002() {
        return Q8002;
    }

    public void setQ8002(String q8002) {
        Q8002 = q8002;
    }

    public String getQ8003() {
        return Q8003;
    }

    public void setQ8003(String q8003) {
        Q8003 = q8003;
    }

    public String getQ8004() {
        return Q8004;
    }

    public void setQ8004(String q8004) {
        Q8004 = q8004;
    }

    public String getQ8005() {
        return Q8005;
    }

    public void setQ8005(String q8005) {
        Q8005 = q8005;
    }

    public String getQ8006() {
        return Q8006;
    }

    public void setQ8006(String q8006) {
        Q8006 = q8006;
    }

    public String getQ8007() {
        return Q8007;
    }

    public void setQ8007(String q8007) {
        Q8007 = q8007;
    }

    public String getQ8020() {
        return Q8020;
    }

    public void setQ8020(String q8020) {
        Q8020 = q8020;
    }

    public String getQ8021() {
        return Q8021;
    }

    public void setQ8021(String q8021) {
        Q8021 = q8021;
    }

    public String getQ8022() {
        return Q8022;
    }

    public void setQ8022(String q8022) {
        Q8022 = q8022;
    }

    public String getQ8023() {
        return Q8023;
    }

    public void setQ8023(String q8023) {
        Q8023 = q8023;
    }

    public String getQ8024() {
        return Q8024;
    }

    public void setQ8024(String q8024) {
        Q8024 = q8024;
    }

    public String getQ8025() {
        return Q8025;
    }

    public void setQ8025(String q8025) {
        Q8025 = q8025;
    }

    public String getQ8026() {
        return Q8026;
    }

    public void setQ8026(String q8026) {
        Q8026 = q8026;
    }

    public String getQ8027() {
        return Q8027;
    }

    public void setQ8027(String q8027) {
        Q8027 = q8027;
    }

    public String getQ8040() {
        return Q8040;
    }

    public void setQ8040(String q8040) {
        Q8040 = q8040;
    }

    public String getQ8041() {
        return Q8041;
    }

    public void setQ8041(String q8041) {
        Q8041 = q8041;
    }

    public String getQ8042() {
        return Q8042;
    }

    public void setQ8042(String q8042) {
        Q8042 = q8042;
    }

    public String getQ8043() {
        return Q8043;
    }

    public void setQ8043(String q8043) {
        Q8043 = q8043;
    }

    public String getQ8044() {
        return Q8044;
    }

    public void setQ8044(String q8044) {
        Q8044 = q8044;
    }

    public String getQ8045() {
        return Q8045;
    }

    public void setQ8045(String q8045) {
        Q8045 = q8045;
    }

    public String getQ8046() {
        return Q8046;
    }

    public void setQ8046(String q8046) {
        Q8046 = q8046;
    }

    public String getQ8047() {
        return Q8047;
    }

    public void setQ8047(String q8047) {
        Q8047 = q8047;
    }

    public String getQW809() {
        return QW809;
    }

    public void setQW809(String QW809) {
        this.QW809 = QW809;
    }

    public Integer getQW840() {
        return QW840;
    }

    public void setQW840(Integer QW840) {
        this.QW840 = QW840;
    }

    public Integer getQW841() {
        return QW841;
    }

    public void setQW841(Integer QW841) {
        this.QW841 = QW841;
    }

    public Integer getQW842() {
        return QW842;
    }

    public void setQW842(Integer QW842) {
        this.QW842 = QW842;
    }

    public Integer getQW843() {
        return QW843;
    }

    public void setQW843(Integer QW843) {
        this.QW843 = QW843;
    }

    public Integer getQW844() {
        return QW844;
    }

    public void setQW844(Integer QW844) {
        this.QW844 = QW844;
    }

    public BigDecimal getDB64DDB6() {
        return DB64DDB6;
    }

    public void setDB64DDB6(BigDecimal DB64DDB6) {
        this.DB64DDB6 = DB64DDB6;
    }

    public BigDecimal getDB64DDB10() {
        return DB64DDB10;
    }

    public void setDB64DDB10(BigDecimal DB64DDB10) {
        this.DB64DDB10 = DB64DDB10;
    }

    public BigDecimal getDB64DDB14() {
        return DB64DDB14;
    }

    public void setDB64DDB14(BigDecimal DB64DDB14) {
        this.DB64DDB14 = DB64DDB14;
    }
}
