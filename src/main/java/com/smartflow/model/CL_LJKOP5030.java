package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/8/6 11:25
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_LJKOP5030", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_LJKOP5030 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String uuid;
    private Date createDate;
    private String isSynch;
    private String serialNumber;
    private Long workOrderId;
    private BigDecimal db64Dbd12;
    private BigDecimal db64Dbd16;
    private BigDecimal db64Dbd4;
    private BigDecimal db64Dbd40;
    private BigDecimal db64Dbd44;
    private BigDecimal db64Dbd8;
    private Integer db64Dbw0;
    private String ib404;
    private String ib504;
    private String m6160;
    private String m6161;
    private String m6162;
    private String m6163;
    private String m6164;
    private String m6165;
    private String m6166;
    private String m6167;
    private String m6172;
    private String m6173;
    private String m6174;
    private String m6175;
    private String m6176;
    private String m6177;
    private String m6180;
    private String m6181;
    private String m6182;
    private String m6183;
    private String m6184;
    private String m6187;
    private String m6190;
    private String m6191;
    private String m6192;
    private String m6193;
    private String m6194;
    private String m6195;
    private String m6196;
    private String m6197;
    private String m6200;
    private String m6201;
    private String m6202;
    private String m6203;
    private String m6204;
    private String m6210;
    private String m6211;
    private String m6212;
    private String m6213;
    private String m6214;
    private String m6215;
    private String m6216;
    private String m7010;
    private String q8000;
    private String q8001;
    private String q8002;
    private String q8003;
    private String q8004;
    private String q8005;
    private String q8006;
    private String q8007;
    private String q8020;
    private String q8021;
    private String q8022;
    private String q8023;
    private String q8024;
    private String q8025;
    private String q8026;
    private String q8027;
    private String q8040;
    private String q8041;
    private String q8042;
    private String q8043;
    private String q8044;
    private String q8045;
    private String q8046;
    private String q8047;
    private String qw809;
    private String qw840;
    private String qw841;
    private String qw842;
    private String qw843;
    private String qw844;

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
    @Column(name = "SerialNumber", nullable = true, length = 100)
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Basic
    @Column(name = "WorkOrderId", nullable = true)
    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    @Basic
    @Column(name = "DB64_DBD12", nullable = true, precision = 8)
    public BigDecimal getDb64Dbd12() {
        return db64Dbd12;
    }

    public void setDb64Dbd12(BigDecimal db64Dbd12) {
        this.db64Dbd12 = db64Dbd12;
    }

    @Basic
    @Column(name = "DB64_DBD16", nullable = true, precision = 8)
    public BigDecimal getDb64Dbd16() {
        return db64Dbd16;
    }

    public void setDb64Dbd16(BigDecimal db64Dbd16) {
        this.db64Dbd16 = db64Dbd16;
    }

    @Basic
    @Column(name = "DB64_DBD4", nullable = true, precision = 8)
    public BigDecimal getDb64Dbd4() {
        return db64Dbd4;
    }

    public void setDb64Dbd4(BigDecimal db64Dbd4) {
        this.db64Dbd4 = db64Dbd4;
    }

    @Basic
    @Column(name = "DB64_DBD40", nullable = true, precision = 8)
    public BigDecimal getDb64Dbd40() {
        return db64Dbd40;
    }

    public void setDb64Dbd40(BigDecimal db64Dbd40) {
        this.db64Dbd40 = db64Dbd40;
    }

    @Basic
    @Column(name = "DB64_DBD44", nullable = true, precision = 8)
    public BigDecimal getDb64Dbd44() {
        return db64Dbd44;
    }

    public void setDb64Dbd44(BigDecimal db64Dbd44) {
        this.db64Dbd44 = db64Dbd44;
    }

    @Basic
    @Column(name = "DB64_DBD8", nullable = true, precision = 8)
    public BigDecimal getDb64Dbd8() {
        return db64Dbd8;
    }

    public void setDb64Dbd8(BigDecimal db64Dbd8) {
        this.db64Dbd8 = db64Dbd8;
    }

    @Basic
    @Column(name = "DB64_DBW0", nullable = true, precision = 0)
    public Integer getDb64Dbw0() {
        return db64Dbw0;
    }

    public void setDb64Dbw0(Integer db64Dbw0) {
        this.db64Dbw0 = db64Dbw0;
    }

    @Basic
    @Column(name = "IB404", nullable = true, length = 10)
    public String getIb404() {
        return ib404;
    }

    public void setIb404(String ib404) {
        this.ib404 = ib404;
    }

    @Basic
    @Column(name = "IB504", nullable = true, length = 10)
    public String getIb504() {
        return ib504;
    }

    public void setIb504(String ib504) {
        this.ib504 = ib504;
    }

    @Basic
    @Column(name = "M616_0", nullable = true, length = 2)
    public String getM6160() {
        return m6160;
    }

    public void setM6160(String m6160) {
        this.m6160 = m6160;
    }

    @Basic
    @Column(name = "M616_1", nullable = true, length = 2)
    public String getM6161() {
        return m6161;
    }

    public void setM6161(String m6161) {
        this.m6161 = m6161;
    }

    @Basic
    @Column(name = "M616_2", nullable = true, length = 2)
    public String getM6162() {
        return m6162;
    }

    public void setM6162(String m6162) {
        this.m6162 = m6162;
    }

    @Basic
    @Column(name = "M616_3", nullable = true, length = 2)
    public String getM6163() {
        return m6163;
    }

    public void setM6163(String m6163) {
        this.m6163 = m6163;
    }

    @Basic
    @Column(name = "M616_4", nullable = true, length = 2)
    public String getM6164() {
        return m6164;
    }

    public void setM6164(String m6164) {
        this.m6164 = m6164;
    }

    @Basic
    @Column(name = "M616_5", nullable = true, length = 2)
    public String getM6165() {
        return m6165;
    }

    public void setM6165(String m6165) {
        this.m6165 = m6165;
    }

    @Basic
    @Column(name = "M616_6", nullable = true, length = 2)
    public String getM6166() {
        return m6166;
    }

    public void setM6166(String m6166) {
        this.m6166 = m6166;
    }

    @Basic
    @Column(name = "M616_7", nullable = true, length = 2)
    public String getM6167() {
        return m6167;
    }

    public void setM6167(String m6167) {
        this.m6167 = m6167;
    }

    @Basic
    @Column(name = "M617_2", nullable = true, length = 2)
    public String getM6172() {
        return m6172;
    }

    public void setM6172(String m6172) {
        this.m6172 = m6172;
    }

    @Basic
    @Column(name = "M617_3", nullable = true, length = 2)
    public String getM6173() {
        return m6173;
    }

    public void setM6173(String m6173) {
        this.m6173 = m6173;
    }

    @Basic
    @Column(name = "M617_4", nullable = true, length = 2)
    public String getM6174() {
        return m6174;
    }

    public void setM6174(String m6174) {
        this.m6174 = m6174;
    }

    @Basic
    @Column(name = "M617_5", nullable = true, length = 2)
    public String getM6175() {
        return m6175;
    }

    public void setM6175(String m6175) {
        this.m6175 = m6175;
    }

    @Basic
    @Column(name = "M617_6", nullable = true, length = 2)
    public String getM6176() {
        return m6176;
    }

    public void setM6176(String m6176) {
        this.m6176 = m6176;
    }

    @Basic
    @Column(name = "M617_7", nullable = true, length = 2)
    public String getM6177() {
        return m6177;
    }

    public void setM6177(String m6177) {
        this.m6177 = m6177;
    }

    @Basic
    @Column(name = "M618_0", nullable = true, length = 2)
    public String getM6180() {
        return m6180;
    }

    public void setM6180(String m6180) {
        this.m6180 = m6180;
    }

    @Basic
    @Column(name = "M618_1", nullable = true, length = 2)
    public String getM6181() {
        return m6181;
    }

    public void setM6181(String m6181) {
        this.m6181 = m6181;
    }

    @Basic
    @Column(name = "M618_2", nullable = true, length = 2)
    public String getM6182() {
        return m6182;
    }

    public void setM6182(String m6182) {
        this.m6182 = m6182;
    }

    @Basic
    @Column(name = "M618_3", nullable = true, length = 2)
    public String getM6183() {
        return m6183;
    }

    public void setM6183(String m6183) {
        this.m6183 = m6183;
    }

    @Basic
    @Column(name = "M618_4", nullable = true, length = 2)
    public String getM6184() {
        return m6184;
    }

    public void setM6184(String m6184) {
        this.m6184 = m6184;
    }

    @Basic
    @Column(name = "M618_7", nullable = true, length = 2)
    public String getM6187() {
        return m6187;
    }

    public void setM6187(String m6187) {
        this.m6187 = m6187;
    }

    @Basic
    @Column(name = "M619_0", nullable = true, length = 2)
    public String getM6190() {
        return m6190;
    }

    public void setM6190(String m6190) {
        this.m6190 = m6190;
    }

    @Basic
    @Column(name = "M619_1", nullable = true, length = 2)
    public String getM6191() {
        return m6191;
    }

    public void setM6191(String m6191) {
        this.m6191 = m6191;
    }

    @Basic
    @Column(name = "M619_2", nullable = true, length = 2)
    public String getM6192() {
        return m6192;
    }

    public void setM6192(String m6192) {
        this.m6192 = m6192;
    }

    @Basic
    @Column(name = "M619_3", nullable = true, length = 2)
    public String getM6193() {
        return m6193;
    }

    public void setM6193(String m6193) {
        this.m6193 = m6193;
    }

    @Basic
    @Column(name = "M619_4", nullable = true, length = 2)
    public String getM6194() {
        return m6194;
    }

    public void setM6194(String m6194) {
        this.m6194 = m6194;
    }

    @Basic
    @Column(name = "M619_5", nullable = true, length = 2)
    public String getM6195() {
        return m6195;
    }

    public void setM6195(String m6195) {
        this.m6195 = m6195;
    }

    @Basic
    @Column(name = "M619_6", nullable = true, length = 2)
    public String getM6196() {
        return m6196;
    }

    public void setM6196(String m6196) {
        this.m6196 = m6196;
    }

    @Basic
    @Column(name = "M619_7", nullable = true, length = 2)
    public String getM6197() {
        return m6197;
    }

    public void setM6197(String m6197) {
        this.m6197 = m6197;
    }

    @Basic
    @Column(name = "M620_0", nullable = true, length = 2)
    public String getM6200() {
        return m6200;
    }

    public void setM6200(String m6200) {
        this.m6200 = m6200;
    }

    @Basic
    @Column(name = "M620_1", nullable = true, length = 2)
    public String getM6201() {
        return m6201;
    }

    public void setM6201(String m6201) {
        this.m6201 = m6201;
    }

    @Basic
    @Column(name = "M620_2", nullable = true, length = 2)
    public String getM6202() {
        return m6202;
    }

    public void setM6202(String m6202) {
        this.m6202 = m6202;
    }

    @Basic
    @Column(name = "M620_3", nullable = true, length = 2)
    public String getM6203() {
        return m6203;
    }

    public void setM6203(String m6203) {
        this.m6203 = m6203;
    }

    @Basic
    @Column(name = "M620_4", nullable = true, length = 2)
    public String getM6204() {
        return m6204;
    }

    public void setM6204(String m6204) {
        this.m6204 = m6204;
    }

    @Basic
    @Column(name = "M621_0", nullable = true, length = 2)
    public String getM6210() {
        return m6210;
    }

    public void setM6210(String m6210) {
        this.m6210 = m6210;
    }

    @Basic
    @Column(name = "M621_1", nullable = true, length = 2)
    public String getM6211() {
        return m6211;
    }

    public void setM6211(String m6211) {
        this.m6211 = m6211;
    }

    @Basic
    @Column(name = "M621_2", nullable = true, length = 2)
    public String getM6212() {
        return m6212;
    }

    public void setM6212(String m6212) {
        this.m6212 = m6212;
    }

    @Basic
    @Column(name = "M621_3", nullable = true, length = 2)
    public String getM6213() {
        return m6213;
    }

    public void setM6213(String m6213) {
        this.m6213 = m6213;
    }

    @Basic
    @Column(name = "M621_4", nullable = true, length = 2)
    public String getM6214() {
        return m6214;
    }

    public void setM6214(String m6214) {
        this.m6214 = m6214;
    }

    @Basic
    @Column(name = "M621_5", nullable = true, length = 2)
    public String getM6215() {
        return m6215;
    }

    public void setM6215(String m6215) {
        this.m6215 = m6215;
    }

    @Basic
    @Column(name = "M621_6", nullable = true, length = 2)
    public String getM6216() {
        return m6216;
    }

    public void setM6216(String m6216) {
        this.m6216 = m6216;
    }

    @Basic
    @Column(name = "M701_0", nullable = true, length = 2)
    public String getM7010() {
        return m7010;
    }

    public void setM7010(String m7010) {
        this.m7010 = m7010;
    }

    @Basic
    @Column(name = "Q800_0", nullable = true, length = 2)
    public String getQ8000() {
        return q8000;
    }

    public void setQ8000(String q8000) {
        this.q8000 = q8000;
    }

    @Basic
    @Column(name = "Q800_1", nullable = true, length = 2)
    public String getQ8001() {
        return q8001;
    }

    public void setQ8001(String q8001) {
        this.q8001 = q8001;
    }

    @Basic
    @Column(name = "Q800_2", nullable = true, length = 2)
    public String getQ8002() {
        return q8002;
    }

    public void setQ8002(String q8002) {
        this.q8002 = q8002;
    }

    @Basic
    @Column(name = "Q800_3", nullable = true, length = 2)
    public String getQ8003() {
        return q8003;
    }

    public void setQ8003(String q8003) {
        this.q8003 = q8003;
    }

    @Basic
    @Column(name = "Q800_4", nullable = true, length = 2)
    public String getQ8004() {
        return q8004;
    }

    public void setQ8004(String q8004) {
        this.q8004 = q8004;
    }

    @Basic
    @Column(name = "Q800_5", nullable = true, length = 2)
    public String getQ8005() {
        return q8005;
    }

    public void setQ8005(String q8005) {
        this.q8005 = q8005;
    }

    @Basic
    @Column(name = "Q800_6", nullable = true, length = 2)
    public String getQ8006() {
        return q8006;
    }

    public void setQ8006(String q8006) {
        this.q8006 = q8006;
    }

    @Basic
    @Column(name = "Q800_7", nullable = true, length = 2)
    public String getQ8007() {
        return q8007;
    }

    public void setQ8007(String q8007) {
        this.q8007 = q8007;
    }

    @Basic
    @Column(name = "Q802_0", nullable = true, length = 2)
    public String getQ8020() {
        return q8020;
    }

    public void setQ8020(String q8020) {
        this.q8020 = q8020;
    }

    @Basic
    @Column(name = "Q802_1", nullable = true, length = 2)
    public String getQ8021() {
        return q8021;
    }

    public void setQ8021(String q8021) {
        this.q8021 = q8021;
    }

    @Basic
    @Column(name = "Q802_2", nullable = true, length = 2)
    public String getQ8022() {
        return q8022;
    }

    public void setQ8022(String q8022) {
        this.q8022 = q8022;
    }

    @Basic
    @Column(name = "Q802_3", nullable = true, length = 2)
    public String getQ8023() {
        return q8023;
    }

    public void setQ8023(String q8023) {
        this.q8023 = q8023;
    }

    @Basic
    @Column(name = "Q802_4", nullable = true, length = 2)
    public String getQ8024() {
        return q8024;
    }

    public void setQ8024(String q8024) {
        this.q8024 = q8024;
    }

    @Basic
    @Column(name = "Q802_5", nullable = true, length = 2)
    public String getQ8025() {
        return q8025;
    }

    public void setQ8025(String q8025) {
        this.q8025 = q8025;
    }

    @Basic
    @Column(name = "Q802_6", nullable = true, length = 2)
    public String getQ8026() {
        return q8026;
    }

    public void setQ8026(String q8026) {
        this.q8026 = q8026;
    }

    @Basic
    @Column(name = "Q802_7", nullable = true, length = 2)
    public String getQ8027() {
        return q8027;
    }

    public void setQ8027(String q8027) {
        this.q8027 = q8027;
    }

    @Basic
    @Column(name = "Q804_0", nullable = true, length = 2)
    public String getQ8040() {
        return q8040;
    }

    public void setQ8040(String q8040) {
        this.q8040 = q8040;
    }

    @Basic
    @Column(name = "Q804_1", nullable = true, length = 2)
    public String getQ8041() {
        return q8041;
    }

    public void setQ8041(String q8041) {
        this.q8041 = q8041;
    }

    @Basic
    @Column(name = "Q804_2", nullable = true, length = 2)
    public String getQ8042() {
        return q8042;
    }

    public void setQ8042(String q8042) {
        this.q8042 = q8042;
    }

    @Basic
    @Column(name = "Q804_3", nullable = true, length = 2)
    public String getQ8043() {
        return q8043;
    }

    public void setQ8043(String q8043) {
        this.q8043 = q8043;
    }

    @Basic
    @Column(name = "Q804_4", nullable = true, length = 2)
    public String getQ8044() {
        return q8044;
    }

    public void setQ8044(String q8044) {
        this.q8044 = q8044;
    }

    @Basic
    @Column(name = "Q804_5", nullable = true, length = 2)
    public String getQ8045() {
        return q8045;
    }

    public void setQ8045(String q8045) {
        this.q8045 = q8045;
    }

    @Basic
    @Column(name = "Q804_6", nullable = true, length = 2)
    public String getQ8046() {
        return q8046;
    }

    public void setQ8046(String q8046) {
        this.q8046 = q8046;
    }

    @Basic
    @Column(name = "Q804_7", nullable = true, length = 2)
    public String getQ8047() {
        return q8047;
    }

    public void setQ8047(String q8047) {
        this.q8047 = q8047;
    }

    @Basic
    @Column(name = "QW809", nullable = true, length = 4000)
    public String getQw809() {
        return qw809;
    }

    public void setQw809(String qw809) {
        this.qw809 = qw809;
    }

    @Basic
    @Column(name = "QW840", nullable = true, length = 4000)
    public String getQw840() {
        return qw840;
    }

    public void setQw840(String qw840) {
        this.qw840 = qw840;
    }

    @Basic
    @Column(name = "QW841", nullable = true, length = 4000)
    public String getQw841() {
        return qw841;
    }

    public void setQw841(String qw841) {
        this.qw841 = qw841;
    }

    @Basic
    @Column(name = "QW842", nullable = true, length = 4000)
    public String getQw842() {
        return qw842;
    }

    public void setQw842(String qw842) {
        this.qw842 = qw842;
    }

    @Basic
    @Column(name = "QW843", nullable = true, length = 4000)
    public String getQw843() {
        return qw843;
    }

    public void setQw843(String qw843) {
        this.qw843 = qw843;
    }

    @Basic
    @Column(name = "QW844", nullable = true, length = 4000)
    public String getQw844() {
        return qw844;
    }

    public void setQw844(String qw844) {
        this.qw844 = qw844;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CL_LJKOP5030 that = (CL_LJKOP5030) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(isSynch, that.isSynch) &&
                Objects.equals(serialNumber, that.serialNumber) &&
                Objects.equals(workOrderId, that.workOrderId) &&
                Objects.equals(db64Dbd12, that.db64Dbd12) &&
                Objects.equals(db64Dbd16, that.db64Dbd16) &&
                Objects.equals(db64Dbd4, that.db64Dbd4) &&
                Objects.equals(db64Dbd40, that.db64Dbd40) &&
                Objects.equals(db64Dbd44, that.db64Dbd44) &&
                Objects.equals(db64Dbd8, that.db64Dbd8) &&
                Objects.equals(db64Dbw0, that.db64Dbw0) &&
                Objects.equals(ib404, that.ib404) &&
                Objects.equals(ib504, that.ib504) &&
                Objects.equals(m6160, that.m6160) &&
                Objects.equals(m6161, that.m6161) &&
                Objects.equals(m6162, that.m6162) &&
                Objects.equals(m6163, that.m6163) &&
                Objects.equals(m6164, that.m6164) &&
                Objects.equals(m6165, that.m6165) &&
                Objects.equals(m6166, that.m6166) &&
                Objects.equals(m6167, that.m6167) &&
                Objects.equals(m6172, that.m6172) &&
                Objects.equals(m6173, that.m6173) &&
                Objects.equals(m6174, that.m6174) &&
                Objects.equals(m6175, that.m6175) &&
                Objects.equals(m6176, that.m6176) &&
                Objects.equals(m6177, that.m6177) &&
                Objects.equals(m6180, that.m6180) &&
                Objects.equals(m6181, that.m6181) &&
                Objects.equals(m6182, that.m6182) &&
                Objects.equals(m6183, that.m6183) &&
                Objects.equals(m6184, that.m6184) &&
                Objects.equals(m6187, that.m6187) &&
                Objects.equals(m6190, that.m6190) &&
                Objects.equals(m6191, that.m6191) &&
                Objects.equals(m6192, that.m6192) &&
                Objects.equals(m6193, that.m6193) &&
                Objects.equals(m6194, that.m6194) &&
                Objects.equals(m6195, that.m6195) &&
                Objects.equals(m6196, that.m6196) &&
                Objects.equals(m6197, that.m6197) &&
                Objects.equals(m6200, that.m6200) &&
                Objects.equals(m6201, that.m6201) &&
                Objects.equals(m6202, that.m6202) &&
                Objects.equals(m6203, that.m6203) &&
                Objects.equals(m6204, that.m6204) &&
                Objects.equals(m6210, that.m6210) &&
                Objects.equals(m6211, that.m6211) &&
                Objects.equals(m6212, that.m6212) &&
                Objects.equals(m6213, that.m6213) &&
                Objects.equals(m6214, that.m6214) &&
                Objects.equals(m6215, that.m6215) &&
                Objects.equals(m6216, that.m6216) &&
                Objects.equals(m7010, that.m7010) &&
                Objects.equals(q8000, that.q8000) &&
                Objects.equals(q8001, that.q8001) &&
                Objects.equals(q8002, that.q8002) &&
                Objects.equals(q8003, that.q8003) &&
                Objects.equals(q8004, that.q8004) &&
                Objects.equals(q8005, that.q8005) &&
                Objects.equals(q8006, that.q8006) &&
                Objects.equals(q8007, that.q8007) &&
                Objects.equals(q8020, that.q8020) &&
                Objects.equals(q8021, that.q8021) &&
                Objects.equals(q8022, that.q8022) &&
                Objects.equals(q8023, that.q8023) &&
                Objects.equals(q8024, that.q8024) &&
                Objects.equals(q8025, that.q8025) &&
                Objects.equals(q8026, that.q8026) &&
                Objects.equals(q8027, that.q8027) &&
                Objects.equals(q8040, that.q8040) &&
                Objects.equals(q8041, that.q8041) &&
                Objects.equals(q8042, that.q8042) &&
                Objects.equals(q8043, that.q8043) &&
                Objects.equals(q8044, that.q8044) &&
                Objects.equals(q8045, that.q8045) &&
                Objects.equals(q8046, that.q8046) &&
                Objects.equals(q8047, that.q8047) &&
                Objects.equals(qw809, that.qw809) &&
                Objects.equals(qw840, that.qw840) &&
                Objects.equals(qw841, that.qw841) &&
                Objects.equals(qw842, that.qw842) &&
                Objects.equals(qw843, that.qw843) &&
                Objects.equals(qw844, that.qw844);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, createDate, isSynch, serialNumber, workOrderId, db64Dbd12, db64Dbd16, db64Dbd4, db64Dbd40, db64Dbd44, db64Dbd8, db64Dbw0, ib404, ib504, m6160, m6161, m6162, m6163, m6164, m6165, m6166, m6167, m6172, m6173, m6174, m6175, m6176, m6177, m6180, m6181, m6182, m6183, m6184, m6187, m6190, m6191, m6192, m6193, m6194, m6195, m6196, m6197, m6200, m6201, m6202, m6203, m6204, m6210, m6211, m6212, m6213, m6214, m6215, m6216, m7010, q8000, q8001, q8002, q8003, q8004, q8005, q8006, q8007, q8020, q8021, q8022, q8023, q8024, q8025, q8026, q8027, q8040, q8041, q8042, q8043, q8044, q8045, q8046, q8047, qw809, qw840, qw841, qw842, qw843, qw844);
    }
}
