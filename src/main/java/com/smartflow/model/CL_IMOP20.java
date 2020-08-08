package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:24
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_IMOP20", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_IMOP20 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String uuid;
    private Date createDate;
    private String isSynch;
    private String serialNumber;
    private Long workOrderId;
    private BigDecimal db48Dbd12;
    private BigDecimal db48Dbd16;
    private BigDecimal db48Dbd20;
    private BigDecimal db48Dbd24;
    private BigDecimal db48Dbd28;
    private BigDecimal db48Dbd32;
    private BigDecimal db48Dbd344;
    private BigDecimal db48Dbd348;
    private BigDecimal db48Dbd352;
    private BigDecimal db48Dbd356;
    private BigDecimal db48Dbd36;
    private BigDecimal db48Dbd360;
    private BigDecimal db48Dbd4;
    private BigDecimal db48Dbd40;
    private String db48Dbd44;
    private BigDecimal db48Dbd8;
    private String db48Dbd86;
    private Integer db48Dbw342;
    private Integer db48Dbw364;
    private String db49Dbx1260;
    private String db49Dbx1680;
    private String db49Dbx2100;
    private String db49Dbx2520;
    private String db49Dbx420;
    private String db49Dbx840;
    private String m15104;
    private String m15301;
    private String m5000;
    private String m5001;
    private String m5002;
    private String m5003;
    private String m5004;
    private String m5005;
    private String m5006;
    private String m5007;
    private String m5010;
    private String m5011;
    private String m5012;
    private String m5013;
    private String m5014;
    private String m5015;
    private String m5016;
    private String m5017;
    private String m5020;
    private String m5021;
    private String m5022;
    private String m5023;
    private String m5024;
    private String m5025;
    private String m5026;
    private String m5027;
    private String m5030;
    private String m5031;
    private String m5032;
    private String m5033;
    private String m5034;
    private String m5035;
    private String m5036;
    private String m5060;
    private String m5061;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIsSynch() {
        return isSynch;
    }

    public void setIsSynch(String isSynch) {
        this.isSynch = isSynch;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public BigDecimal getDb48Dbd12() {
        return db48Dbd12;
    }

    public void setDb48Dbd12(BigDecimal db48Dbd12) {
        this.db48Dbd12 = db48Dbd12;
    }

    public BigDecimal getDb48Dbd16() {
        return db48Dbd16;
    }

    public void setDb48Dbd16(BigDecimal db48Dbd16) {
        this.db48Dbd16 = db48Dbd16;
    }

    public BigDecimal getDb48Dbd20() {
        return db48Dbd20;
    }

    public void setDb48Dbd20(BigDecimal db48Dbd20) {
        this.db48Dbd20 = db48Dbd20;
    }

    public BigDecimal getDb48Dbd24() {
        return db48Dbd24;
    }

    public void setDb48Dbd24(BigDecimal db48Dbd24) {
        this.db48Dbd24 = db48Dbd24;
    }

    public BigDecimal getDb48Dbd28() {
        return db48Dbd28;
    }

    public void setDb48Dbd28(BigDecimal db48Dbd28) {
        this.db48Dbd28 = db48Dbd28;
    }

    public BigDecimal getDb48Dbd32() {
        return db48Dbd32;
    }

    public void setDb48Dbd32(BigDecimal db48Dbd32) {
        this.db48Dbd32 = db48Dbd32;
    }

    public BigDecimal getDb48Dbd344() {
        return db48Dbd344;
    }

    public void setDb48Dbd344(BigDecimal db48Dbd344) {
        this.db48Dbd344 = db48Dbd344;
    }

    public BigDecimal getDb48Dbd348() {
        return db48Dbd348;
    }

    public void setDb48Dbd348(BigDecimal db48Dbd348) {
        this.db48Dbd348 = db48Dbd348;
    }

    public BigDecimal getDb48Dbd352() {
        return db48Dbd352;
    }

    public void setDb48Dbd352(BigDecimal db48Dbd352) {
        this.db48Dbd352 = db48Dbd352;
    }

    public BigDecimal getDb48Dbd356() {
        return db48Dbd356;
    }

    public void setDb48Dbd356(BigDecimal db48Dbd356) {
        this.db48Dbd356 = db48Dbd356;
    }

    public BigDecimal getDb48Dbd36() {
        return db48Dbd36;
    }

    public void setDb48Dbd36(BigDecimal db48Dbd36) {
        this.db48Dbd36 = db48Dbd36;
    }

    public BigDecimal getDb48Dbd360() {
        return db48Dbd360;
    }

    public void setDb48Dbd360(BigDecimal db48Dbd360) {
        this.db48Dbd360 = db48Dbd360;
    }

    public BigDecimal getDb48Dbd4() {
        return db48Dbd4;
    }

    public void setDb48Dbd4(BigDecimal db48Dbd4) {
        this.db48Dbd4 = db48Dbd4;
    }

    public BigDecimal getDb48Dbd40() {
        return db48Dbd40;
    }

    public void setDb48Dbd40(BigDecimal db48Dbd40) {
        this.db48Dbd40 = db48Dbd40;
    }

    public String getDb48Dbd44() {
        return db48Dbd44;
    }

    public void setDb48Dbd44(String db48Dbd44) {
        this.db48Dbd44 = db48Dbd44;
    }

    public BigDecimal getDb48Dbd8() {
        return db48Dbd8;
    }

    public void setDb48Dbd8(BigDecimal db48Dbd8) {
        this.db48Dbd8 = db48Dbd8;
    }

    public String getDb48Dbd86() {
        return db48Dbd86;
    }

    public void setDb48Dbd86(String db48Dbd86) {
        this.db48Dbd86 = db48Dbd86;
    }

    public Integer getDb48Dbw342() {
        return db48Dbw342;
    }

    public void setDb48Dbw342(Integer db48Dbw342) {
        this.db48Dbw342 = db48Dbw342;
    }

    public Integer getDb48Dbw364() {
        return db48Dbw364;
    }

    public void setDb48Dbw364(Integer db48Dbw364) {
        this.db48Dbw364 = db48Dbw364;
    }

    public String getDb49Dbx1260() {
        return db49Dbx1260;
    }

    public void setDb49Dbx1260(String db49Dbx1260) {
        this.db49Dbx1260 = db49Dbx1260;
    }

    public String getDb49Dbx1680() {
        return db49Dbx1680;
    }

    public void setDb49Dbx1680(String db49Dbx1680) {
        this.db49Dbx1680 = db49Dbx1680;
    }

    public String getDb49Dbx2100() {
        return db49Dbx2100;
    }

    public void setDb49Dbx2100(String db49Dbx2100) {
        this.db49Dbx2100 = db49Dbx2100;
    }

    public String getDb49Dbx2520() {
        return db49Dbx2520;
    }

    public void setDb49Dbx2520(String db49Dbx2520) {
        this.db49Dbx2520 = db49Dbx2520;
    }

    public String getDb49Dbx420() {
        return db49Dbx420;
    }

    public void setDb49Dbx420(String db49Dbx420) {
        this.db49Dbx420 = db49Dbx420;
    }

    public String getDb49Dbx840() {
        return db49Dbx840;
    }

    public void setDb49Dbx840(String db49Dbx840) {
        this.db49Dbx840 = db49Dbx840;
    }

    public String getM15104() {
        return m15104;
    }

    public void setM15104(String m15104) {
        this.m15104 = m15104;
    }

    public String getM15301() {
        return m15301;
    }

    public void setM15301(String m15301) {
        this.m15301 = m15301;
    }

    public String getM5000() {
        return m5000;
    }

    public void setM5000(String m5000) {
        this.m5000 = m5000;
    }

    public String getM5001() {
        return m5001;
    }

    public void setM5001(String m5001) {
        this.m5001 = m5001;
    }

    public String getM5002() {
        return m5002;
    }

    public void setM5002(String m5002) {
        this.m5002 = m5002;
    }

    public String getM5003() {
        return m5003;
    }

    public void setM5003(String m5003) {
        this.m5003 = m5003;
    }

    public String getM5004() {
        return m5004;
    }

    public void setM5004(String m5004) {
        this.m5004 = m5004;
    }

    public String getM5005() {
        return m5005;
    }

    public void setM5005(String m5005) {
        this.m5005 = m5005;
    }

    public String getM5006() {
        return m5006;
    }

    public void setM5006(String m5006) {
        this.m5006 = m5006;
    }

    public String getM5007() {
        return m5007;
    }

    public void setM5007(String m5007) {
        this.m5007 = m5007;
    }

    public String getM5010() {
        return m5010;
    }

    public void setM5010(String m5010) {
        this.m5010 = m5010;
    }

    public String getM5011() {
        return m5011;
    }

    public void setM5011(String m5011) {
        this.m5011 = m5011;
    }

    public String getM5012() {
        return m5012;
    }

    public void setM5012(String m5012) {
        this.m5012 = m5012;
    }

    public String getM5013() {
        return m5013;
    }

    public void setM5013(String m5013) {
        this.m5013 = m5013;
    }

    public String getM5014() {
        return m5014;
    }

    public void setM5014(String m5014) {
        this.m5014 = m5014;
    }

    public String getM5015() {
        return m5015;
    }

    public void setM5015(String m5015) {
        this.m5015 = m5015;
    }


    public String getM5016() {
        return m5016;
    }

    public void setM5016(String m5016) {
        this.m5016 = m5016;
    }


    public String getM5017() {
        return m5017;
    }

    public void setM5017(String m5017) {
        this.m5017 = m5017;
    }


    public String getM5020() {
        return m5020;
    }

    public void setM5020(String m5020) {
        this.m5020 = m5020;
    }

    public String getM5021() {
        return m5021;
    }

    public void setM5021(String m5021) {
        this.m5021 = m5021;
    }


    public String getM5022() {
        return m5022;
    }

    public void setM5022(String m5022) {
        this.m5022 = m5022;
    }


    public String getM5023() {
        return m5023;
    }

    public void setM5023(String m5023) {
        this.m5023 = m5023;
    }


    public String getM5024() {
        return m5024;
    }

    public void setM5024(String m5024) {
        this.m5024 = m5024;
    }


    public String getM5025() {
        return m5025;
    }

    public void setM5025(String m5025) {
        this.m5025 = m5025;
    }

    public String getM5026() {
        return m5026;
    }

    public void setM5026(String m5026) {
        this.m5026 = m5026;
    }

    public String getM5027() {
        return m5027;
    }

    public void setM5027(String m5027) {
        this.m5027 = m5027;
    }


    public String getM5030() {
        return m5030;
    }

    public void setM5030(String m5030) {
        this.m5030 = m5030;
    }


    public String getM5031() {
        return m5031;
    }

    public void setM5031(String m5031) {
        this.m5031 = m5031;
    }


    public String getM5032() {
        return m5032;
    }

    public void setM5032(String m5032) {
        this.m5032 = m5032;
    }


    public String getM5033() {
        return m5033;
    }

    public void setM5033(String m5033) {
        this.m5033 = m5033;
    }


    public String getM5034() {
        return m5034;
    }

    public void setM5034(String m5034) {
        this.m5034 = m5034;
    }

    public String getM5035() {
        return m5035;
    }

    public void setM5035(String m5035) {
        this.m5035 = m5035;
    }


    public String getM5036() {
        return m5036;
    }

    public void setM5036(String m5036) {
        this.m5036 = m5036;
    }

    public String getM5060() {
        return m5060;
    }

    public void setM5060(String m5060) {
        this.m5060 = m5060;
    }


    public String getM5061() {
        return m5061;
    }

    public void setM5061(String m5061) {
        this.m5061 = m5061;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CL_IMOP20 that = (CL_IMOP20) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(isSynch, that.isSynch) &&
                Objects.equals(serialNumber, that.serialNumber) &&
                Objects.equals(workOrderId, that.workOrderId) &&
                Objects.equals(db48Dbd12, that.db48Dbd12) &&
                Objects.equals(db48Dbd16, that.db48Dbd16) &&
                Objects.equals(db48Dbd20, that.db48Dbd20) &&
                Objects.equals(db48Dbd24, that.db48Dbd24) &&
                Objects.equals(db48Dbd28, that.db48Dbd28) &&
                Objects.equals(db48Dbd32, that.db48Dbd32) &&
                Objects.equals(db48Dbd344, that.db48Dbd344) &&
                Objects.equals(db48Dbd348, that.db48Dbd348) &&
                Objects.equals(db48Dbd352, that.db48Dbd352) &&
                Objects.equals(db48Dbd356, that.db48Dbd356) &&
                Objects.equals(db48Dbd36, that.db48Dbd36) &&
                Objects.equals(db48Dbd360, that.db48Dbd360) &&
                Objects.equals(db48Dbd4, that.db48Dbd4) &&
                Objects.equals(db48Dbd40, that.db48Dbd40) &&
                Objects.equals(db48Dbd44, that.db48Dbd44) &&
                Objects.equals(db48Dbd8, that.db48Dbd8) &&
                Objects.equals(db48Dbd86, that.db48Dbd86) &&
                Objects.equals(db48Dbw342, that.db48Dbw342) &&
                Objects.equals(db48Dbw364, that.db48Dbw364) &&
                Objects.equals(db49Dbx1260, that.db49Dbx1260) &&
                Objects.equals(db49Dbx1680, that.db49Dbx1680) &&
                Objects.equals(db49Dbx2100, that.db49Dbx2100) &&
                Objects.equals(db49Dbx2520, that.db49Dbx2520) &&
                Objects.equals(db49Dbx420, that.db49Dbx420) &&
                Objects.equals(db49Dbx840, that.db49Dbx840) &&
                Objects.equals(m15104, that.m15104) &&
                Objects.equals(m15301, that.m15301) &&
                Objects.equals(m5000, that.m5000) &&
                Objects.equals(m5001, that.m5001) &&
                Objects.equals(m5002, that.m5002) &&
                Objects.equals(m5003, that.m5003) &&
                Objects.equals(m5004, that.m5004) &&
                Objects.equals(m5005, that.m5005) &&
                Objects.equals(m5006, that.m5006) &&
                Objects.equals(m5007, that.m5007) &&
                Objects.equals(m5010, that.m5010) &&
                Objects.equals(m5011, that.m5011) &&
                Objects.equals(m5012, that.m5012) &&
                Objects.equals(m5013, that.m5013) &&
                Objects.equals(m5014, that.m5014) &&
                Objects.equals(m5015, that.m5015) &&
                Objects.equals(m5016, that.m5016) &&
                Objects.equals(m5017, that.m5017) &&
                Objects.equals(m5020, that.m5020) &&
                Objects.equals(m5021, that.m5021) &&
                Objects.equals(m5022, that.m5022) &&
                Objects.equals(m5023, that.m5023) &&
                Objects.equals(m5024, that.m5024) &&
                Objects.equals(m5025, that.m5025) &&
                Objects.equals(m5026, that.m5026) &&
                Objects.equals(m5027, that.m5027) &&
                Objects.equals(m5030, that.m5030) &&
                Objects.equals(m5031, that.m5031) &&
                Objects.equals(m5032, that.m5032) &&
                Objects.equals(m5033, that.m5033) &&
                Objects.equals(m5034, that.m5034) &&
                Objects.equals(m5035, that.m5035) &&
                Objects.equals(m5036, that.m5036) &&
                Objects.equals(m5060, that.m5060) &&
                Objects.equals(m5061, that.m5061);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, createDate, isSynch, serialNumber, workOrderId, db48Dbd12, db48Dbd16, db48Dbd20, db48Dbd24, db48Dbd28, db48Dbd32, db48Dbd344, db48Dbd348, db48Dbd352, db48Dbd356, db48Dbd36, db48Dbd360, db48Dbd4, db48Dbd40, db48Dbd44, db48Dbd8, db48Dbd86, db48Dbw342, db48Dbw364, db49Dbx1260, db49Dbx1680, db49Dbx2100, db49Dbx2520, db49Dbx420, db49Dbx840, m15104, m15301, m5000, m5001, m5002, m5003, m5004, m5005, m5006, m5007, m5010, m5011, m5012, m5013, m5014, m5015, m5016, m5017, m5020, m5021, m5022, m5023, m5024, m5025, m5026, m5027, m5030, m5031, m5032, m5033, m5034, m5035, m5036, m5060, m5061);
    }
}
