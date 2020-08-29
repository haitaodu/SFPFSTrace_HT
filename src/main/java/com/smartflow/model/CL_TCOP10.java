package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_TCOP10")
public class CL_TCOP10 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String DB407_DBX60_3;
    private String DB407_DBX60_4;
    private String DB407_DBX60_5;
    private String DB407_DBX60_6;
    private String DB407_DBX60_7;
    private String DB407_DBX61_0;
    private BigDecimal DB9_DBW1560;
    private BigDecimal DB9_DBW1562;
    private BigDecimal DB9_DBW1564;
    private BigDecimal DB9_DBW1566;
    private BigDecimal DB9_DBW1568;
    private BigDecimal DB9_DBW1570;
    private String DB9_DBX1006_0;
    private String DB9_DBX1048_0;
    private String DB9_DBX1590_0;
    private String DB9_DBX1590_1;
    private String DB9_DBX586_0;
    private String DB9_DBX628_0;
    private String DB9_DBX670_0;
    private String DB9_DBX712_0;
    private String DB9_DBX754_0;
    private String DB9_DBX796_0;
    private String DB9_DBX838_0;
    private String DB9_DBX880_0;
    private String DB9_DBX922_0;
    private String DB9_DBX964_0;
    private String M100_2;
    private String M105_0;
    private String M105_1;
    private String M105_2;
    private String M150_0;
    private String M150_1;
    private String M150_2;
    private String M150_3;
    private String M150_4;
    private String M150_5;
    private String M150_6;
    private String M150_7;
    private String M151_0;
    private String M151_1;
    private String M151_2;
    private String M151_3;
    private String M151_4;
    private String M151_5;
    private String M151_6;
    private String M151_7;
    private String M152_0;
    private String M152_1;
    private String M152_2;
    private String M152_3;
    private String M152_4;
    private String M152_5;
    private String M152_6;
    private String M152_7;
    private String M153_0;
    private String M153_1;
    private String M153_2;
    private String M153_3;
    private String M153_4;
    private String M153_5;
    private String M153_6;
    private String M153_7;
    private String M154_0;
    private String M154_1;
    private String M154_2;
    private String M155_0;
    private String M155_1;
    private String M155_2;
    private String M155_3;
    private String M155_4;
    private String M155_5;

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

    public String getDB407_DBX60_3() {
        return DB407_DBX60_3;
    }

    public void setDB407_DBX60_3(String DB407_DBX60_3) {
        this.DB407_DBX60_3 = DB407_DBX60_3;
    }

    public String getDB407_DBX60_4() {
        return DB407_DBX60_4;
    }

    public void setDB407_DBX60_4(String DB407_DBX60_4) {
        this.DB407_DBX60_4 = DB407_DBX60_4;
    }

    public String getDB407_DBX60_5() {
        return DB407_DBX60_5;
    }

    public void setDB407_DBX60_5(String DB407_DBX60_5) {
        this.DB407_DBX60_5 = DB407_DBX60_5;
    }

    public String getDB407_DBX60_6() {
        return DB407_DBX60_6;
    }

    public void setDB407_DBX60_6(String DB407_DBX60_6) {
        this.DB407_DBX60_6 = DB407_DBX60_6;
    }

    public String getDB407_DBX60_7() {
        return DB407_DBX60_7;
    }

    public void setDB407_DBX60_7(String DB407_DBX60_7) {
        this.DB407_DBX60_7 = DB407_DBX60_7;
    }

    public String getDB407_DBX61_0() {
        return DB407_DBX61_0;
    }

    public void setDB407_DBX61_0(String DB407_DBX61_0) {
        this.DB407_DBX61_0 = DB407_DBX61_0;
    }

    public BigDecimal getDB9_DBW1560() {
        return DB9_DBW1560;
    }

    public void setDB9_DBW1560(BigDecimal DB9_DBW1560) {
        this.DB9_DBW1560 = DB9_DBW1560;
    }

    public BigDecimal getDB9_DBW1562() {
        return DB9_DBW1562;
    }

    public void setDB9_DBW1562(BigDecimal DB9_DBW1562) {
        this.DB9_DBW1562 = DB9_DBW1562;
    }

    public BigDecimal getDB9_DBW1564() {
        return DB9_DBW1564;
    }

    public void setDB9_DBW1564(BigDecimal DB9_DBW1564) {
        this.DB9_DBW1564 = DB9_DBW1564;
    }

    public BigDecimal getDB9_DBW1566() {
        return DB9_DBW1566;
    }

    public void setDB9_DBW1566(BigDecimal DB9_DBW1566) {
        this.DB9_DBW1566 = DB9_DBW1566;
    }

    public BigDecimal getDB9_DBW1568() {
        return DB9_DBW1568;
    }

    public void setDB9_DBW1568(BigDecimal DB9_DBW1568) {
        this.DB9_DBW1568 = DB9_DBW1568;
    }

    public BigDecimal getDB9_DBW1570() {
        return DB9_DBW1570;
    }

    public void setDB9_DBW1570(BigDecimal DB9_DBW1570) {
        this.DB9_DBW1570 = DB9_DBW1570;
    }

    public String getDB9_DBX1006_0() {
        return DB9_DBX1006_0;
    }

    public void setDB9_DBX1006_0(String DB9_DBX1006_0) {
        this.DB9_DBX1006_0 = DB9_DBX1006_0;
    }

    public String getDB9_DBX1048_0() {
        return DB9_DBX1048_0;
    }

    public void setDB9_DBX1048_0(String DB9_DBX1048_0) {
        this.DB9_DBX1048_0 = DB9_DBX1048_0;
    }

    public String getDB9_DBX1590_0() {
        return DB9_DBX1590_0;
    }

    public void setDB9_DBX1590_0(String DB9_DBX1590_0) {
        this.DB9_DBX1590_0 = DB9_DBX1590_0;
    }

    public String getDB9_DBX1590_1() {
        return DB9_DBX1590_1;
    }

    public void setDB9_DBX1590_1(String DB9_DBX1590_1) {
        this.DB9_DBX1590_1 = DB9_DBX1590_1;
    }

    public String getDB9_DBX586_0() {
        return DB9_DBX586_0;
    }

    public void setDB9_DBX586_0(String DB9_DBX586_0) {
        this.DB9_DBX586_0 = DB9_DBX586_0;
    }

    public String getDB9_DBX628_0() {
        return DB9_DBX628_0;
    }

    public void setDB9_DBX628_0(String DB9_DBX628_0) {
        this.DB9_DBX628_0 = DB9_DBX628_0;
    }

    public String getDB9_DBX670_0() {
        return DB9_DBX670_0;
    }

    public void setDB9_DBX670_0(String DB9_DBX670_0) {
        this.DB9_DBX670_0 = DB9_DBX670_0;
    }

    public String getDB9_DBX712_0() {
        return DB9_DBX712_0;
    }

    public void setDB9_DBX712_0(String DB9_DBX712_0) {
        this.DB9_DBX712_0 = DB9_DBX712_0;
    }

    public String getDB9_DBX754_0() {
        return DB9_DBX754_0;
    }

    public void setDB9_DBX754_0(String DB9_DBX754_0) {
        this.DB9_DBX754_0 = DB9_DBX754_0;
    }

    public String getDB9_DBX796_0() {
        return DB9_DBX796_0;
    }

    public void setDB9_DBX796_0(String DB9_DBX796_0) {
        this.DB9_DBX796_0 = DB9_DBX796_0;
    }

    public String getDB9_DBX838_0() {
        return DB9_DBX838_0;
    }

    public void setDB9_DBX838_0(String DB9_DBX838_0) {
        this.DB9_DBX838_0 = DB9_DBX838_0;
    }

    public String getDB9_DBX880_0() {
        return DB9_DBX880_0;
    }

    public void setDB9_DBX880_0(String DB9_DBX880_0) {
        this.DB9_DBX880_0 = DB9_DBX880_0;
    }

    public String getDB9_DBX922_0() {
        return DB9_DBX922_0;
    }

    public void setDB9_DBX922_0(String DB9_DBX922_0) {
        this.DB9_DBX922_0 = DB9_DBX922_0;
    }

    public String getDB9_DBX964_0() {
        return DB9_DBX964_0;
    }

    public void setDB9_DBX964_0(String DB9_DBX964_0) {
        this.DB9_DBX964_0 = DB9_DBX964_0;
    }

    public String getM100_2() {
        return M100_2;
    }

    public void setM100_2(String m100_2) {
        M100_2 = m100_2;
    }

    public String getM105_0() {
        return M105_0;
    }

    public void setM105_0(String m105_0) {
        M105_0 = m105_0;
    }

    public String getM105_1() {
        return M105_1;
    }

    public void setM105_1(String m105_1) {
        M105_1 = m105_1;
    }

    public String getM105_2() {
        return M105_2;
    }

    public void setM105_2(String m105_2) {
        M105_2 = m105_2;
    }

    public String getM150_0() {
        return M150_0;
    }

    public void setM150_0(String m150_0) {
        M150_0 = m150_0;
    }

    public String getM150_1() {
        return M150_1;
    }

    public void setM150_1(String m150_1) {
        M150_1 = m150_1;
    }

    public String getM150_2() {
        return M150_2;
    }

    public void setM150_2(String m150_2) {
        M150_2 = m150_2;
    }

    public String getM150_3() {
        return M150_3;
    }

    public void setM150_3(String m150_3) {
        M150_3 = m150_3;
    }

    public String getM150_4() {
        return M150_4;
    }

    public void setM150_4(String m150_4) {
        M150_4 = m150_4;
    }

    public String getM150_5() {
        return M150_5;
    }

    public void setM150_5(String m150_5) {
        M150_5 = m150_5;
    }

    public String getM150_6() {
        return M150_6;
    }

    public void setM150_6(String m150_6) {
        M150_6 = m150_6;
    }

    public String getM150_7() {
        return M150_7;
    }

    public void setM150_7(String m150_7) {
        M150_7 = m150_7;
    }

    public String getM151_0() {
        return M151_0;
    }

    public void setM151_0(String m151_0) {
        M151_0 = m151_0;
    }

    public String getM151_1() {
        return M151_1;
    }

    public void setM151_1(String m151_1) {
        M151_1 = m151_1;
    }

    public String getM151_2() {
        return M151_2;
    }

    public void setM151_2(String m151_2) {
        M151_2 = m151_2;
    }

    public String getM151_3() {
        return M151_3;
    }

    public void setM151_3(String m151_3) {
        M151_3 = m151_3;
    }

    public String getM151_4() {
        return M151_4;
    }

    public void setM151_4(String m151_4) {
        M151_4 = m151_4;
    }

    public String getM151_5() {
        return M151_5;
    }

    public void setM151_5(String m151_5) {
        M151_5 = m151_5;
    }

    public String getM151_6() {
        return M151_6;
    }

    public void setM151_6(String m151_6) {
        M151_6 = m151_6;
    }

    public String getM151_7() {
        return M151_7;
    }

    public void setM151_7(String m151_7) {
        M151_7 = m151_7;
    }

    public String getM152_0() {
        return M152_0;
    }

    public void setM152_0(String m152_0) {
        M152_0 = m152_0;
    }

    public String getM152_1() {
        return M152_1;
    }

    public void setM152_1(String m152_1) {
        M152_1 = m152_1;
    }

    public String getM152_2() {
        return M152_2;
    }

    public void setM152_2(String m152_2) {
        M152_2 = m152_2;
    }

    public String getM152_3() {
        return M152_3;
    }

    public void setM152_3(String m152_3) {
        M152_3 = m152_3;
    }

    public String getM152_4() {
        return M152_4;
    }

    public void setM152_4(String m152_4) {
        M152_4 = m152_4;
    }

    public String getM152_5() {
        return M152_5;
    }

    public void setM152_5(String m152_5) {
        M152_5 = m152_5;
    }

    public String getM152_6() {
        return M152_6;
    }

    public void setM152_6(String m152_6) {
        M152_6 = m152_6;
    }

    public String getM152_7() {
        return M152_7;
    }

    public void setM152_7(String m152_7) {
        M152_7 = m152_7;
    }

    public String getM153_0() {
        return M153_0;
    }

    public void setM153_0(String m153_0) {
        M153_0 = m153_0;
    }

    public String getM153_1() {
        return M153_1;
    }

    public void setM153_1(String m153_1) {
        M153_1 = m153_1;
    }

    public String getM153_2() {
        return M153_2;
    }

    public void setM153_2(String m153_2) {
        M153_2 = m153_2;
    }

    public String getM153_3() {
        return M153_3;
    }

    public void setM153_3(String m153_3) {
        M153_3 = m153_3;
    }

    public String getM153_4() {
        return M153_4;
    }

    public void setM153_4(String m153_4) {
        M153_4 = m153_4;
    }

    public String getM153_5() {
        return M153_5;
    }

    public void setM153_5(String m153_5) {
        M153_5 = m153_5;
    }

    public String getM153_6() {
        return M153_6;
    }

    public void setM153_6(String m153_6) {
        M153_6 = m153_6;
    }

    public String getM153_7() {
        return M153_7;
    }

    public void setM153_7(String m153_7) {
        M153_7 = m153_7;
    }

    public String getM154_0() {
        return M154_0;
    }

    public void setM154_0(String m154_0) {
        M154_0 = m154_0;
    }

    public String getM154_1() {
        return M154_1;
    }

    public void setM154_1(String m154_1) {
        M154_1 = m154_1;
    }

    public String getM154_2() {
        return M154_2;
    }

    public void setM154_2(String m154_2) {
        M154_2 = m154_2;
    }

    public String getM155_0() {
        return M155_0;
    }

    public void setM155_0(String m155_0) {
        M155_0 = m155_0;
    }

    public String getM155_1() {
        return M155_1;
    }

    public void setM155_1(String m155_1) {
        M155_1 = m155_1;
    }

    public String getM155_2() {
        return M155_2;
    }

    public void setM155_2(String m155_2) {
        M155_2 = m155_2;
    }

    public String getM155_3() {
        return M155_3;
    }

    public void setM155_3(String m155_3) {
        M155_3 = m155_3;
    }

    public String getM155_4() {
        return M155_4;
    }

    public void setM155_4(String m155_4) {
        M155_4 = m155_4;
    }

    public String getM155_5() {
        return M155_5;
    }

    public void setM155_5(String m155_5) {
        M155_5 = m155_5;
    }
}
