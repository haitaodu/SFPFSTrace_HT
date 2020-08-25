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
@Table(name = "CL_FCOP10", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_FCOP10 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private java.util.Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNuMber;
    private Integer WorkOrderId;
    private Integer DB64_DBW0;
    private Integer DB64_DBW2;
    private String DB64_DBX4_0;
    private String DB64_DBX4_1;
    private String DB64_DBX4_2;
    private String DB64_DBX4_3;
    private String DB64_DBX4_4;
    private String DB64_DBX4_5;
    private String DB64_DBX4_6;
    private String DB64_DBX4_7;
    private String DB64_DBX5_0;
    private String DB64_DBX5_1;
    private String DB64_DBX5_2;
    private String IB404;
    private String IW406;
    private String IW408;
    private String IW412;
    private String M201_0;
    private String M201_1;
    private String M201_2;
    private String M201_3;
    private String M201_4;
    private String M201_5;
    private String M201_6;
    private String M202_0;
    private String M203_0;
    private String M203_1;
    private String M203_2;
    private String M203_3;
    private String M203_4;
    private String M203_5;
    private String M203_6;
    private String M203_7;
    private String Q800_0;
    private String Q800_1;
    private String Q800_2;
    private String Q800_3;
    private String Q800_4;
    private String Q800_5;
    private String Q800_6;
    private String Q800_7;
    private String Q802_0;
    private String Q802_1;
    private String Q802_2;
    private String Q802_3;
    private String Q802_4;
    private String Q802_5;
    private String Q802_6;
    private String Q802_7;
    private String Q804_0;
    private String Q804_1;
    private String Q804_2;
    private String Q804_3;
    private String Q804_4;
    private String Q804_5;
    private String Q804_6;
    private String Q804_7;
    private String QW809;
    private Integer QW840;
    private Integer QW841;
    private Integer QW842;
    private Integer QW843;
    private Integer QW844;
    private BigDecimal DB64_DBD6;
    private BigDecimal DB64_DBD10;
    private BigDecimal DB64_DBD14;

    public BigDecimal getDB64_DBD6() {
        return DB64_DBD6;
    }

    public void setDB64_DBD6(BigDecimal DB64_DBD6) {
        this.DB64_DBD6 = DB64_DBD6;
    }

    public BigDecimal getDB64_DBD10() {
        return DB64_DBD10;
    }

    public void setDB64_DBD10(BigDecimal DB64_DBD10) {
        this.DB64_DBD10 = DB64_DBD10;
    }

    public BigDecimal getDB64_DBD14() {
        return DB64_DBD14;
    }

    public void setDB64_DBD14(BigDecimal DB64_DBD14) {
        this.DB64_DBD14 = DB64_DBD14;
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

    public Integer getDB64_DBW0() {
        return DB64_DBW0;
    }

    public void setDB64_DBW0(Integer DB64_DBW0) {
        this.DB64_DBW0 = DB64_DBW0;
    }

    public Integer getDB64_DBW2() {
        return DB64_DBW2;
    }

    public void setDB64_DBW2(Integer DB64_DBW2) {
        this.DB64_DBW2 = DB64_DBW2;
    }

    public String getDB64_DBX4_0() {
        return DB64_DBX4_0;
    }

    public void setDB64_DBX4_0(String DB64_DBX4_0) {
        this.DB64_DBX4_0 = DB64_DBX4_0;
    }

    public String getDB64_DBX4_1() {
        return DB64_DBX4_1;
    }

    public void setDB64_DBX4_1(String DB64_DBX4_1) {
        this.DB64_DBX4_1 = DB64_DBX4_1;
    }

    public String getDB64_DBX4_2() {
        return DB64_DBX4_2;
    }

    public void setDB64_DBX4_2(String DB64_DBX4_2) {
        this.DB64_DBX4_2 = DB64_DBX4_2;
    }

    public String getDB64_DBX4_3() {
        return DB64_DBX4_3;
    }

    public void setDB64_DBX4_3(String DB64_DBX4_3) {
        this.DB64_DBX4_3 = DB64_DBX4_3;
    }

    public String getDB64_DBX4_4() {
        return DB64_DBX4_4;
    }

    public void setDB64_DBX4_4(String DB64_DBX4_4) {
        this.DB64_DBX4_4 = DB64_DBX4_4;
    }

    public String getDB64_DBX4_5() {
        return DB64_DBX4_5;
    }

    public void setDB64_DBX4_5(String DB64_DBX4_5) {
        this.DB64_DBX4_5 = DB64_DBX4_5;
    }

    public String getDB64_DBX4_6() {
        return DB64_DBX4_6;
    }

    public void setDB64_DBX4_6(String DB64_DBX4_6) {
        this.DB64_DBX4_6 = DB64_DBX4_6;
    }

    public String getDB64_DBX4_7() {
        return DB64_DBX4_7;
    }

    public void setDB64_DBX4_7(String DB64_DBX4_7) {
        this.DB64_DBX4_7 = DB64_DBX4_7;
    }

    public String getDB64_DBX5_0() {
        return DB64_DBX5_0;
    }

    public void setDB64_DBX5_0(String DB64_DBX5_0) {
        this.DB64_DBX5_0 = DB64_DBX5_0;
    }

    public String getDB64_DBX5_1() {
        return DB64_DBX5_1;
    }

    public void setDB64_DBX5_1(String DB64_DBX5_1) {
        this.DB64_DBX5_1 = DB64_DBX5_1;
    }

    public String getDB64_DBX5_2() {
        return DB64_DBX5_2;
    }

    public void setDB64_DBX5_2(String DB64_DBX5_2) {
        this.DB64_DBX5_2 = DB64_DBX5_2;
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

    public String getM201_0() {
        return M201_0;
    }

    public void setM201_0(String m2010) {
        M201_0 = m2010;
    }

    public String getM201_1() {
        return M201_1;
    }

    public void setM201_1(String m2011) {
        M201_1 = m2011;
    }

    public String getM201_2() {
        return M201_2;
    }

    public void setM201_2(String m2012) {
        M201_2 = m2012;
    }

    public String getM201_3() {
        return M201_3;
    }

    public void setM201_3(String m2013) {
        M201_3 = m2013;
    }

    public String getM201_4() {
        return M201_4;
    }

    public void setM201_4(String m2014) {
        M201_4 = m2014;
    }

    public String getM201_5() {
        return M201_5;
    }

    public void setM201_5(String m2015) {
        M201_5 = m2015;
    }

    public String getM201_6() {
        return M201_6;
    }

    public void setM201_6(String m2016) {
        M201_6 = m2016;
    }

    public String getM202_0() {
        return M202_0;
    }

    public void setM202_0(String m2020) {
        M202_0 = m2020;
    }

    public String getM203_0() {
        return M203_0;
    }

    public void setM203_0(String m2030) {
        M203_0 = m2030;
    }

    public String getM203_1() {
        return M203_1;
    }

    public void setM203_1(String m2031) {
        M203_1 = m2031;
    }

    public String getM203_2() {
        return M203_2;
    }

    public void setM203_2(String m2032) {
        M203_2 = m2032;
    }

    public String getM203_3() {
        return M203_3;
    }

    public void setM203_3(String m2033) {
        M203_3 = m2033;
    }

    public String getM203_4() {
        return M203_4;
    }

    public void setM203_4(String m2034) {
        M203_4 = m2034;
    }

    public String getM203_5() {
        return M203_5;
    }

    public void setM203_5(String m2035) {
        M203_5 = m2035;
    }

    public String getM203_6() {
        return M203_6;
    }

    public void setM203_6(String m2036) {
        M203_6 = m2036;
    }

    public String getM203_7() {
        return M203_7;
    }

    public void setM203_7(String m2037) {
        M203_7 = m2037;
    }

    public String getQ800_0() {
        return Q800_0;
    }

    public void setQ800_0(String q8000) {
        Q800_0 = q8000;
    }

    public String getQ800_1() {
        return Q800_1;
    }

    public void setQ800_1(String q8001) {
        Q800_1 = q8001;
    }

    public String getQ800_2() {
        return Q800_2;
    }

    public void setQ800_2(String q8002) {
        Q800_2 = q8002;
    }

    public String getQ800_3() {
        return Q800_3;
    }

    public void setQ800_3(String q8003) {
        Q800_3 = q8003;
    }

    public String getQ800_4() {
        return Q800_4;
    }

    public void setQ800_4(String q8004) {
        Q800_4 = q8004;
    }

    public String getQ800_5() {
        return Q800_5;
    }

    public void setQ800_5(String q8005) {
        Q800_5 = q8005;
    }

    public String getQ800_6() {
        return Q800_6;
    }

    public void setQ800_6(String q8006) {
        Q800_6 = q8006;
    }

    public String getQ800_7() {
        return Q800_7;
    }

    public void setQ800_7(String q8007) {
        Q800_7 = q8007;
    }

    public String getQ802_0() {
        return Q802_0;
    }

    public void setQ802_0(String q8020) {
        Q802_0 = q8020;
    }

    public String getQ802_1() {
        return Q802_1;
    }

    public void setQ802_1(String q8021) {
        Q802_1 = q8021;
    }

    public String getQ802_2() {
        return Q802_2;
    }

    public void setQ802_2(String q8022) {
        Q802_2 = q8022;
    }

    public String getQ802_3() {
        return Q802_3;
    }

    public void setQ802_3(String q8023) {
        Q802_3 = q8023;
    }

    public String getQ802_4() {
        return Q802_4;
    }

    public void setQ802_4(String q8024) {
        Q802_4 = q8024;
    }

    public String getQ802_5() {
        return Q802_5;
    }

    public void setQ802_5(String q8025) {
        Q802_5 = q8025;
    }

    public String getQ802_6() {
        return Q802_6;
    }

    public void setQ802_6(String q8026) {
        Q802_6 = q8026;
    }

    public String getQ802_7() {
        return Q802_7;
    }

    public void setQ802_7(String q8027) {
        Q802_7 = q8027;
    }

    public String getQ804_0() {
        return Q804_0;
    }

    public void setQ804_0(String q8040) {
        Q804_0 = q8040;
    }

    public String getQ804_1() {
        return Q804_1;
    }

    public void setQ804_1(String q8041) {
        Q804_1 = q8041;
    }

    public String getQ804_2() {
        return Q804_2;
    }

    public void setQ804_2(String q8042) {
        Q804_2 = q8042;
    }

    public String getQ804_3() {
        return Q804_3;
    }

    public void setQ804_3(String q8043) {
        Q804_3 = q8043;
    }

    public String getQ804_4() {
        return Q804_4;
    }

    public void setQ804_4(String q8044) {
        Q804_4 = q8044;
    }

    public String getQ804_5() {
        return Q804_5;
    }

    public void setQ804_5(String q8045) {
        Q804_5 = q8045;
    }

    public String getQ804_6() {
        return Q804_6;
    }

    public void setQ804_6(String q8046) {
        Q804_6 = q8046;
    }

    public String getQ804_7() {
        return Q804_7;
    }

    public void setQ804_7(String q8047) {
        Q804_7 = q8047;
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


}
