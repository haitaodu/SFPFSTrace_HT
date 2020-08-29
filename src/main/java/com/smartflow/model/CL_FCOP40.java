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
 * @date ：Created in 2020/8/7 17:25
 */

@Entity
@Table(name = "core.CL_FCOP40")
public class CL_FCOP40 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private BigDecimal DB64_DBD12;
    private BigDecimal DB64_DBD16;
    private BigDecimal DB64_DBD4;
    private BigDecimal DB64_DBD40;
    private BigDecimal DB64_DBD44;
    private BigDecimal DB64_DBD8;
    private Integer DB64_DBW0;
    private String IB404;
    private String IB504;
    private String M616_0;
    private String M616_1;
    private String M616_2;
    private String M616_3;
    private String M616_4;
    private String M616_5;
    private String M616_6;
    private String M616_7;
    private String M617_2;
    private String M617_3;
    private String M617_4;
    private String M617_5;
    private String M617_6;
    private String M617_7;
    private String M618_0;
    private String M618_1;
    private String M618_2;
    private String M618_3;
    private String M618_4;
    private String M618_7;
    private String M619_0;
    private String M619_1;
    private String M619_2;
    private String M619_3;
    private String M619_4;
    private String M619_5;
    private String M619_6;
    private String M619_7;
    private String M620_0;
    private String M620_1;
    private String M620_2;
    private String M620_3;
    private String M620_4;
    private String M621_0;
    private String M621_1;
    private String M621_2;
    private String M621_3;
    private String M621_4;
    private String M621_5;
    private String M621_6;
    private String M701_0;
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
    private String QW840;
    private String QW841;
    private String QW842;
    private String QW843;
    private String QW844;
    private String IS_OK;

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

    public BigDecimal getDB64_DBD12() {
        return DB64_DBD12;
    }

    public void setDB64_DBD12(BigDecimal DB64_DBD12) {
        this.DB64_DBD12 = DB64_DBD12;
    }

    public BigDecimal getDB64_DBD16() {
        return DB64_DBD16;
    }

    public void setDB64_DBD16(BigDecimal DB64_DBD16) {
        this.DB64_DBD16 = DB64_DBD16;
    }

    public BigDecimal getDB64_DBD4() {
        return DB64_DBD4;
    }

    public void setDB64_DBD4(BigDecimal DB64_DBD4) {
        this.DB64_DBD4 = DB64_DBD4;
    }

    public BigDecimal getDB64_DBD40() {
        return DB64_DBD40;
    }

    public void setDB64_DBD40(BigDecimal DB64_DBD40) {
        this.DB64_DBD40 = DB64_DBD40;
    }

    public BigDecimal getDB64_DBD44() {
        return DB64_DBD44;
    }

    public void setDB64_DBD44(BigDecimal DB64_DBD44) {
        this.DB64_DBD44 = DB64_DBD44;
    }

    public BigDecimal getDB64_DBD8() {
        return DB64_DBD8;
    }

    public void setDB64_DBD8(BigDecimal DB64_DBD8) {
        this.DB64_DBD8 = DB64_DBD8;
    }

    public Integer getDB64_DBW0() {
        return DB64_DBW0;
    }

    public void setDB64_DBW0(Integer DB64_DBW0) {
        this.DB64_DBW0 = DB64_DBW0;
    }

    public String getIB404() {
        return IB404;
    }

    public void setIB404(String IB404) {
        this.IB404 = IB404;
    }

    public String getIB504() {
        return IB504;
    }

    public void setIB504(String IB504) {
        this.IB504 = IB504;
    }

    public String getM616_0() {
        return M616_0;
    }

    public void setM616_0(String m616_0) {
        M616_0 = m616_0;
    }

    public String getM616_1() {
        return M616_1;
    }

    public void setM616_1(String m616_1) {
        M616_1 = m616_1;
    }

    public String getM616_2() {
        return M616_2;
    }

    public void setM616_2(String m616_2) {
        M616_2 = m616_2;
    }

    public String getM616_3() {
        return M616_3;
    }

    public void setM616_3(String m616_3) {
        M616_3 = m616_3;
    }

    public String getM616_4() {
        return M616_4;
    }

    public void setM616_4(String m616_4) {
        M616_4 = m616_4;
    }

    public String getM616_5() {
        return M616_5;
    }

    public void setM616_5(String m616_5) {
        M616_5 = m616_5;
    }

    public String getM616_6() {
        return M616_6;
    }

    public void setM616_6(String m616_6) {
        M616_6 = m616_6;
    }

    public String getM616_7() {
        return M616_7;
    }

    public void setM616_7(String m616_7) {
        M616_7 = m616_7;
    }

    public String getM617_2() {
        return M617_2;
    }

    public void setM617_2(String m617_2) {
        M617_2 = m617_2;
    }

    public String getM617_3() {
        return M617_3;
    }

    public void setM617_3(String m617_3) {
        M617_3 = m617_3;
    }

    public String getM617_4() {
        return M617_4;
    }

    public void setM617_4(String m617_4) {
        M617_4 = m617_4;
    }

    public String getM617_5() {
        return M617_5;
    }

    public void setM617_5(String m617_5) {
        M617_5 = m617_5;
    }

    public String getM617_6() {
        return M617_6;
    }

    public void setM617_6(String m617_6) {
        M617_6 = m617_6;
    }

    public String getM617_7() {
        return M617_7;
    }

    public void setM617_7(String m617_7) {
        M617_7 = m617_7;
    }

    public String getM618_0() {
        return M618_0;
    }

    public void setM618_0(String m618_0) {
        M618_0 = m618_0;
    }

    public String getM618_1() {
        return M618_1;
    }

    public void setM618_1(String m618_1) {
        M618_1 = m618_1;
    }

    public String getM618_2() {
        return M618_2;
    }

    public void setM618_2(String m618_2) {
        M618_2 = m618_2;
    }

    public String getM618_3() {
        return M618_3;
    }

    public void setM618_3(String m618_3) {
        M618_3 = m618_3;
    }

    public String getM618_4() {
        return M618_4;
    }

    public void setM618_4(String m618_4) {
        M618_4 = m618_4;
    }

    public String getM618_7() {
        return M618_7;
    }

    public void setM618_7(String m618_7) {
        M618_7 = m618_7;
    }

    public String getM619_0() {
        return M619_0;
    }

    public void setM619_0(String m619_0) {
        M619_0 = m619_0;
    }

    public String getM619_1() {
        return M619_1;
    }

    public void setM619_1(String m619_1) {
        M619_1 = m619_1;
    }

    public String getM619_2() {
        return M619_2;
    }

    public void setM619_2(String m619_2) {
        M619_2 = m619_2;
    }

    public String getM619_3() {
        return M619_3;
    }

    public void setM619_3(String m619_3) {
        M619_3 = m619_3;
    }

    public String getM619_4() {
        return M619_4;
    }

    public void setM619_4(String m619_4) {
        M619_4 = m619_4;
    }

    public String getM619_5() {
        return M619_5;
    }

    public void setM619_5(String m619_5) {
        M619_5 = m619_5;
    }

    public String getM619_6() {
        return M619_6;
    }

    public void setM619_6(String m619_6) {
        M619_6 = m619_6;
    }

    public String getM619_7() {
        return M619_7;
    }

    public void setM619_7(String m619_7) {
        M619_7 = m619_7;
    }

    public String getM620_0() {
        return M620_0;
    }

    public void setM620_0(String m620_0) {
        M620_0 = m620_0;
    }

    public String getM620_1() {
        return M620_1;
    }

    public void setM620_1(String m620_1) {
        M620_1 = m620_1;
    }

    public String getM620_2() {
        return M620_2;
    }

    public void setM620_2(String m620_2) {
        M620_2 = m620_2;
    }

    public String getM620_3() {
        return M620_3;
    }

    public void setM620_3(String m620_3) {
        M620_3 = m620_3;
    }

    public String getM620_4() {
        return M620_4;
    }

    public void setM620_4(String m620_4) {
        M620_4 = m620_4;
    }

    public String getM621_0() {
        return M621_0;
    }

    public void setM621_0(String m621_0) {
        M621_0 = m621_0;
    }

    public String getM621_1() {
        return M621_1;
    }

    public void setM621_1(String m621_1) {
        M621_1 = m621_1;
    }

    public String getM621_2() {
        return M621_2;
    }

    public void setM621_2(String m621_2) {
        M621_2 = m621_2;
    }

    public String getM621_3() {
        return M621_3;
    }

    public void setM621_3(String m621_3) {
        M621_3 = m621_3;
    }

    public String getM621_4() {
        return M621_4;
    }

    public void setM621_4(String m621_4) {
        M621_4 = m621_4;
    }

    public String getM621_5() {
        return M621_5;
    }

    public void setM621_5(String m621_5) {
        M621_5 = m621_5;
    }

    public String getM621_6() {
        return M621_6;
    }

    public void setM621_6(String m621_6) {
        M621_6 = m621_6;
    }

    public String getM701_0() {
        return M701_0;
    }

    public void setM701_0(String m701_0) {
        M701_0 = m701_0;
    }

    public String getQ800_0() {
        return Q800_0;
    }

    public void setQ800_0(String q800_0) {
        Q800_0 = q800_0;
    }

    public String getQ800_1() {
        return Q800_1;
    }

    public void setQ800_1(String q800_1) {
        Q800_1 = q800_1;
    }

    public String getQ800_2() {
        return Q800_2;
    }

    public void setQ800_2(String q800_2) {
        Q800_2 = q800_2;
    }

    public String getQ800_3() {
        return Q800_3;
    }

    public void setQ800_3(String q800_3) {
        Q800_3 = q800_3;
    }

    public String getQ800_4() {
        return Q800_4;
    }

    public void setQ800_4(String q800_4) {
        Q800_4 = q800_4;
    }

    public String getQ800_5() {
        return Q800_5;
    }

    public void setQ800_5(String q800_5) {
        Q800_5 = q800_5;
    }

    public String getQ800_6() {
        return Q800_6;
    }

    public void setQ800_6(String q800_6) {
        Q800_6 = q800_6;
    }

    public String getQ800_7() {
        return Q800_7;
    }

    public void setQ800_7(String q800_7) {
        Q800_7 = q800_7;
    }

    public String getQ802_0() {
        return Q802_0;
    }

    public void setQ802_0(String q802_0) {
        Q802_0 = q802_0;
    }

    public String getQ802_1() {
        return Q802_1;
    }

    public void setQ802_1(String q802_1) {
        Q802_1 = q802_1;
    }

    public String getQ802_2() {
        return Q802_2;
    }

    public void setQ802_2(String q802_2) {
        Q802_2 = q802_2;
    }

    public String getQ802_3() {
        return Q802_3;
    }

    public void setQ802_3(String q802_3) {
        Q802_3 = q802_3;
    }

    public String getQ802_4() {
        return Q802_4;
    }

    public void setQ802_4(String q802_4) {
        Q802_4 = q802_4;
    }

    public String getQ802_5() {
        return Q802_5;
    }

    public void setQ802_5(String q802_5) {
        Q802_5 = q802_5;
    }

    public String getQ802_6() {
        return Q802_6;
    }

    public void setQ802_6(String q802_6) {
        Q802_6 = q802_6;
    }

    public String getQ802_7() {
        return Q802_7;
    }

    public void setQ802_7(String q802_7) {
        Q802_7 = q802_7;
    }

    public String getQ804_0() {
        return Q804_0;
    }

    public void setQ804_0(String q804_0) {
        Q804_0 = q804_0;
    }

    public String getQ804_1() {
        return Q804_1;
    }

    public void setQ804_1(String q804_1) {
        Q804_1 = q804_1;
    }

    public String getQ804_2() {
        return Q804_2;
    }

    public void setQ804_2(String q804_2) {
        Q804_2 = q804_2;
    }

    public String getQ804_3() {
        return Q804_3;
    }

    public void setQ804_3(String q804_3) {
        Q804_3 = q804_3;
    }

    public String getQ804_4() {
        return Q804_4;
    }

    public void setQ804_4(String q804_4) {
        Q804_4 = q804_4;
    }

    public String getQ804_5() {
        return Q804_5;
    }

    public void setQ804_5(String q804_5) {
        Q804_5 = q804_5;
    }

    public String getQ804_6() {
        return Q804_6;
    }

    public void setQ804_6(String q804_6) {
        Q804_6 = q804_6;
    }

    public String getQ804_7() {
        return Q804_7;
    }

    public void setQ804_7(String q804_7) {
        Q804_7 = q804_7;
    }

    public String getQW809() {
        return QW809;
    }

    public void setQW809(String QW809) {
        this.QW809 = QW809;
    }

    public String getQW840() {
        return QW840;
    }

    public void setQW840(String QW840) {
        this.QW840 = QW840;
    }

    public String getQW841() {
        return QW841;
    }

    public void setQW841(String QW841) {
        this.QW841 = QW841;
    }

    public String getQW842() {
        return QW842;
    }

    public void setQW842(String QW842) {
        this.QW842 = QW842;
    }

    public String getQW843() {
        return QW843;
    }

    public void setQW843(String QW843) {
        this.QW843 = QW843;
    }

    public String getQW844() {
        return QW844;
    }

    public void setQW844(String QW844) {
        this.QW844 = QW844;
    }
}
