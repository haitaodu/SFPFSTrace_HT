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
 * @date ：Created in 2020/8/24 14:27
 */

@Entity
@Table(name = "core.CL_PDOP30")
public class CL_PDOP30 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_SYNCH;
    private BigDecimal DB167_DBD0;
    private BigDecimal DB167_DBD12;
    private BigDecimal DB167_DBD16;
    private Integer DB167_DBD20;
    private Integer DB167_DBD24;
    private String DB167_DBD28;
    private String DB167_DBD284;
    private String DB167_DBD326;
    private String DB167_DBD368;
    private String DB167_DBD372;
    private String DB167_DBD376;
    private BigDecimal DB167_DBD4;
    private BigDecimal DB167_DBD8;
    private String DB167_DBX368_0;
    private String DB167_DBX368_1;
    private String DB167_DBX368_2;
    private String DB167_DBX368_3;
    private String DB167_DBX368_4;
    private String DB167_DBX368_5;
    private String DB167_DBX368_6;
    private String DB167_DBX368_7;
    private String DB167_DBX369_0;
    private String DB167_DBX369_1;
    private String DB167_DBX369_2;
    private String DB167_DBX369_3;
    private String DB167_DBX369_4;
    private String DB167_DBX369_5;
    private String DB167_DBX369_6;
    private String DB167_DBX369_7;
    private String DB167_DBX370_0;
    private String DB167_DBX370_1;
    private String DB167_DBX370_2;
    private String DB167_DBX370_3;
    private String DB167_DBX370_4;
    private String DB167_DBX370_5;
    private String DB167_DBX370_6;
    private String DB167_DBX370_7;
    private String DB167_DBX371_0;
    private String DB167_DBX371_1;
    private String DB167_DBX371_2;
    private String DB167_DBX371_3;
    private String DB167_DBX371_4;
    private String DB167_DBX371_5;
    private String DB167_DBX371_6;
    private String DB167_DBX371_7;
    private String DB167_DBX372_0;
    private String DB167_DBX372_1;
    private String DB167_DBX372_2;
    private String DB167_DBX372_3;
    private String DB167_DBX372_4;
    private String DB167_DBX372_5;
    private String DB167_DBX372_6;
    private String DB167_DBX372_7;
    private String DB167_DBX373_0;
    private String DB167_DBX373_1;
    private String DB167_DBX373_2;
    private String DB167_DBX373_3;
    private String DB167_DBX373_4;
    private String DB167_DBX373_5;
    private String DB167_DBX373_6;
    private String DB167_DBX373_7;
    private String DB167_DBX374_0;
    private String DB167_DBX374_1;
    private String DB167_DBX374_2;
    private String DB167_DBX374_3;
    private String DB167_DBX374_4;
    private String DB167_DBX374_5;
    private String DB167_DBX374_6;
    private String DB167_DBX374_7;
    private String DB167_DBX375_0;
    private String DB167_DBX375_1;
    private String DB167_DBX375_2;
    private String DB167_DBX375_3;
    private String DB167_DBX375_4;
    private String DB167_DBX375_5;
    private String DB167_DBX375_6;
    private String DB167_DBX375_7;
    private String DB167_DBX380_0;
    private String DB167_DBD28_LEN;
    private String DB167_DBW378;
    private String DB167_DBW380;
    private String IS_OK;

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

    public String getIS_SYNCH() {
        return IS_SYNCH;
    }

    public void setIS_SYNCH(String IS_SYNCH) {
        this.IS_SYNCH = IS_SYNCH;
    }

    public BigDecimal getDB167_DBD0() {
        return DB167_DBD0;
    }

    public void setDB167_DBD0(BigDecimal DB167_DBD0) {
        this.DB167_DBD0 = DB167_DBD0;
    }

    public BigDecimal getDB167_DBD12() {
        return DB167_DBD12;
    }

    public void setDB167_DBD12(BigDecimal DB167_DBD12) {
        this.DB167_DBD12 = DB167_DBD12;
    }

    public BigDecimal getDB167_DBD16() {
        return DB167_DBD16;
    }

    public void setDB167_DBD16(BigDecimal DB167_DBD16) {
        this.DB167_DBD16 = DB167_DBD16;
    }

    public Integer getDB167_DBD20() {
        return DB167_DBD20;
    }

    public void setDB167_DBD20(Integer DB167_DBD20) {
        this.DB167_DBD20 = DB167_DBD20;
    }

    public Integer getDB167_DBD24() {
        return DB167_DBD24;
    }

    public void setDB167_DBD24(Integer DB167_DBD24) {
        this.DB167_DBD24 = DB167_DBD24;
    }

    public String getDB167_DBD28() {
        return DB167_DBD28;
    }

    public void setDB167_DBD28(String DB167_DBD28) {
        this.DB167_DBD28 = DB167_DBD28;
    }

    public String getDB167_DBD284() {
        return DB167_DBD284;
    }

    public void setDB167_DBD284(String DB167_DBD284) {
        this.DB167_DBD284 = DB167_DBD284;
    }

    public String getDB167_DBD326() {
        return DB167_DBD326;
    }

    public void setDB167_DBD326(String DB167_DBD326) {
        this.DB167_DBD326 = DB167_DBD326;
    }

    public String getDB167_DBD368() {
        return DB167_DBD368;
    }

    public void setDB167_DBD368(String DB167_DBD368) {
        this.DB167_DBD368 = DB167_DBD368;
    }

    public String getDB167_DBD372() {
        return DB167_DBD372;
    }

    public void setDB167_DBD372(String DB167_DBD372) {
        this.DB167_DBD372 = DB167_DBD372;
    }

    public String getDB167_DBD376() {
        return DB167_DBD376;
    }

    public void setDB167_DBD376(String DB167_DBD376) {
        this.DB167_DBD376 = DB167_DBD376;
    }

    public BigDecimal getDB167_DBD4() {
        return DB167_DBD4;
    }

    public void setDB167_DBD4(BigDecimal DB167_DBD4) {
        this.DB167_DBD4 = DB167_DBD4;
    }

    public BigDecimal getDB167_DBD8() {
        return DB167_DBD8;
    }

    public void setDB167_DBD8(BigDecimal DB167_DBD8) {
        this.DB167_DBD8 = DB167_DBD8;
    }

    public String getDB167_DBX368_0() {
        return DB167_DBX368_0;
    }

    public void setDB167_DBX368_0(String DB167_DBX368_0) {
        this.DB167_DBX368_0 = DB167_DBX368_0;
    }

    public String getDB167_DBX368_1() {
        return DB167_DBX368_1;
    }

    public void setDB167_DBX368_1(String DB167_DBX368_1) {
        this.DB167_DBX368_1 = DB167_DBX368_1;
    }

    public String getDB167_DBX368_2() {
        return DB167_DBX368_2;
    }

    public void setDB167_DBX368_2(String DB167_DBX368_2) {
        this.DB167_DBX368_2 = DB167_DBX368_2;
    }

    public String getDB167_DBX368_3() {
        return DB167_DBX368_3;
    }

    public void setDB167_DBX368_3(String DB167_DBX368_3) {
        this.DB167_DBX368_3 = DB167_DBX368_3;
    }

    public String getDB167_DBX368_4() {
        return DB167_DBX368_4;
    }

    public void setDB167_DBX368_4(String DB167_DBX368_4) {
        this.DB167_DBX368_4 = DB167_DBX368_4;
    }

    public String getDB167_DBX368_5() {
        return DB167_DBX368_5;
    }

    public void setDB167_DBX368_5(String DB167_DBX368_5) {
        this.DB167_DBX368_5 = DB167_DBX368_5;
    }

    public String getDB167_DBX368_6() {
        return DB167_DBX368_6;
    }

    public void setDB167_DBX368_6(String DB167_DBX368_6) {
        this.DB167_DBX368_6 = DB167_DBX368_6;
    }

    public String getDB167_DBX368_7() {
        return DB167_DBX368_7;
    }

    public void setDB167_DBX368_7(String DB167_DBX368_7) {
        this.DB167_DBX368_7 = DB167_DBX368_7;
    }

    public String getDB167_DBX369_0() {
        return DB167_DBX369_0;
    }

    public void setDB167_DBX369_0(String DB167_DBX369_0) {
        this.DB167_DBX369_0 = DB167_DBX369_0;
    }

    public String getDB167_DBX369_1() {
        return DB167_DBX369_1;
    }

    public void setDB167_DBX369_1(String DB167_DBX369_1) {
        this.DB167_DBX369_1 = DB167_DBX369_1;
    }

    public String getDB167_DBX369_2() {
        return DB167_DBX369_2;
    }

    public void setDB167_DBX369_2(String DB167_DBX369_2) {
        this.DB167_DBX369_2 = DB167_DBX369_2;
    }

    public String getDB167_DBX369_3() {
        return DB167_DBX369_3;
    }

    public void setDB167_DBX369_3(String DB167_DBX369_3) {
        this.DB167_DBX369_3 = DB167_DBX369_3;
    }

    public String getDB167_DBX369_4() {
        return DB167_DBX369_4;
    }

    public void setDB167_DBX369_4(String DB167_DBX369_4) {
        this.DB167_DBX369_4 = DB167_DBX369_4;
    }

    public String getDB167_DBX369_5() {
        return DB167_DBX369_5;
    }

    public void setDB167_DBX369_5(String DB167_DBX369_5) {
        this.DB167_DBX369_5 = DB167_DBX369_5;
    }

    public String getDB167_DBX369_6() {
        return DB167_DBX369_6;
    }

    public void setDB167_DBX369_6(String DB167_DBX369_6) {
        this.DB167_DBX369_6 = DB167_DBX369_6;
    }

    public String getDB167_DBX369_7() {
        return DB167_DBX369_7;
    }

    public void setDB167_DBX369_7(String DB167_DBX369_7) {
        this.DB167_DBX369_7 = DB167_DBX369_7;
    }

    public String getDB167_DBX370_0() {
        return DB167_DBX370_0;
    }

    public void setDB167_DBX370_0(String DB167_DBX370_0) {
        this.DB167_DBX370_0 = DB167_DBX370_0;
    }

    public String getDB167_DBX370_1() {
        return DB167_DBX370_1;
    }

    public void setDB167_DBX370_1(String DB167_DBX370_1) {
        this.DB167_DBX370_1 = DB167_DBX370_1;
    }

    public String getDB167_DBX370_2() {
        return DB167_DBX370_2;
    }

    public void setDB167_DBX370_2(String DB167_DBX370_2) {
        this.DB167_DBX370_2 = DB167_DBX370_2;
    }

    public String getDB167_DBX370_3() {
        return DB167_DBX370_3;
    }

    public void setDB167_DBX370_3(String DB167_DBX370_3) {
        this.DB167_DBX370_3 = DB167_DBX370_3;
    }

    public String getDB167_DBX370_4() {
        return DB167_DBX370_4;
    }

    public void setDB167_DBX370_4(String DB167_DBX370_4) {
        this.DB167_DBX370_4 = DB167_DBX370_4;
    }

    public String getDB167_DBX370_5() {
        return DB167_DBX370_5;
    }

    public void setDB167_DBX370_5(String DB167_DBX370_5) {
        this.DB167_DBX370_5 = DB167_DBX370_5;
    }

    public String getDB167_DBX370_6() {
        return DB167_DBX370_6;
    }

    public void setDB167_DBX370_6(String DB167_DBX370_6) {
        this.DB167_DBX370_6 = DB167_DBX370_6;
    }

    public String getDB167_DBX370_7() {
        return DB167_DBX370_7;
    }

    public void setDB167_DBX370_7(String DB167_DBX370_7) {
        this.DB167_DBX370_7 = DB167_DBX370_7;
    }

    public String getDB167_DBX371_0() {
        return DB167_DBX371_0;
    }

    public void setDB167_DBX371_0(String DB167_DBX371_0) {
        this.DB167_DBX371_0 = DB167_DBX371_0;
    }

    public String getDB167_DBX371_1() {
        return DB167_DBX371_1;
    }

    public void setDB167_DBX371_1(String DB167_DBX371_1) {
        this.DB167_DBX371_1 = DB167_DBX371_1;
    }

    public String getDB167_DBX371_2() {
        return DB167_DBX371_2;
    }

    public void setDB167_DBX371_2(String DB167_DBX371_2) {
        this.DB167_DBX371_2 = DB167_DBX371_2;
    }

    public String getDB167_DBX371_3() {
        return DB167_DBX371_3;
    }

    public void setDB167_DBX371_3(String DB167_DBX371_3) {
        this.DB167_DBX371_3 = DB167_DBX371_3;
    }

    public String getDB167_DBX371_4() {
        return DB167_DBX371_4;
    }

    public void setDB167_DBX371_4(String DB167_DBX371_4) {
        this.DB167_DBX371_4 = DB167_DBX371_4;
    }

    public String getDB167_DBX371_5() {
        return DB167_DBX371_5;
    }

    public void setDB167_DBX371_5(String DB167_DBX371_5) {
        this.DB167_DBX371_5 = DB167_DBX371_5;
    }

    public String getDB167_DBX371_6() {
        return DB167_DBX371_6;
    }

    public void setDB167_DBX371_6(String DB167_DBX371_6) {
        this.DB167_DBX371_6 = DB167_DBX371_6;
    }

    public String getDB167_DBX371_7() {
        return DB167_DBX371_7;
    }

    public void setDB167_DBX371_7(String DB167_DBX371_7) {
        this.DB167_DBX371_7 = DB167_DBX371_7;
    }

    public String getDB167_DBX372_0() {
        return DB167_DBX372_0;
    }

    public void setDB167_DBX372_0(String DB167_DBX372_0) {
        this.DB167_DBX372_0 = DB167_DBX372_0;
    }

    public String getDB167_DBX372_1() {
        return DB167_DBX372_1;
    }

    public void setDB167_DBX372_1(String DB167_DBX372_1) {
        this.DB167_DBX372_1 = DB167_DBX372_1;
    }

    public String getDB167_DBX372_2() {
        return DB167_DBX372_2;
    }

    public void setDB167_DBX372_2(String DB167_DBX372_2) {
        this.DB167_DBX372_2 = DB167_DBX372_2;
    }

    public String getDB167_DBX372_3() {
        return DB167_DBX372_3;
    }

    public void setDB167_DBX372_3(String DB167_DBX372_3) {
        this.DB167_DBX372_3 = DB167_DBX372_3;
    }

    public String getDB167_DBX372_4() {
        return DB167_DBX372_4;
    }

    public void setDB167_DBX372_4(String DB167_DBX372_4) {
        this.DB167_DBX372_4 = DB167_DBX372_4;
    }

    public String getDB167_DBX372_5() {
        return DB167_DBX372_5;
    }

    public void setDB167_DBX372_5(String DB167_DBX372_5) {
        this.DB167_DBX372_5 = DB167_DBX372_5;
    }

    public String getDB167_DBX372_6() {
        return DB167_DBX372_6;
    }

    public void setDB167_DBX372_6(String DB167_DBX372_6) {
        this.DB167_DBX372_6 = DB167_DBX372_6;
    }

    public String getDB167_DBX372_7() {
        return DB167_DBX372_7;
    }

    public void setDB167_DBX372_7(String DB167_DBX372_7) {
        this.DB167_DBX372_7 = DB167_DBX372_7;
    }

    public String getDB167_DBX373_0() {
        return DB167_DBX373_0;
    }

    public void setDB167_DBX373_0(String DB167_DBX373_0) {
        this.DB167_DBX373_0 = DB167_DBX373_0;
    }

    public String getDB167_DBX373_1() {
        return DB167_DBX373_1;
    }

    public void setDB167_DBX373_1(String DB167_DBX373_1) {
        this.DB167_DBX373_1 = DB167_DBX373_1;
    }

    public String getDB167_DBX373_2() {
        return DB167_DBX373_2;
    }

    public void setDB167_DBX373_2(String DB167_DBX373_2) {
        this.DB167_DBX373_2 = DB167_DBX373_2;
    }

    public String getDB167_DBX373_3() {
        return DB167_DBX373_3;
    }

    public void setDB167_DBX373_3(String DB167_DBX373_3) {
        this.DB167_DBX373_3 = DB167_DBX373_3;
    }

    public String getDB167_DBX373_4() {
        return DB167_DBX373_4;
    }

    public void setDB167_DBX373_4(String DB167_DBX373_4) {
        this.DB167_DBX373_4 = DB167_DBX373_4;
    }

    public String getDB167_DBX373_5() {
        return DB167_DBX373_5;
    }

    public void setDB167_DBX373_5(String DB167_DBX373_5) {
        this.DB167_DBX373_5 = DB167_DBX373_5;
    }

    public String getDB167_DBX373_6() {
        return DB167_DBX373_6;
    }

    public void setDB167_DBX373_6(String DB167_DBX373_6) {
        this.DB167_DBX373_6 = DB167_DBX373_6;
    }

    public String getDB167_DBX373_7() {
        return DB167_DBX373_7;
    }

    public void setDB167_DBX373_7(String DB167_DBX373_7) {
        this.DB167_DBX373_7 = DB167_DBX373_7;
    }

    public String getDB167_DBX374_0() {
        return DB167_DBX374_0;
    }

    public void setDB167_DBX374_0(String DB167_DBX374_0) {
        this.DB167_DBX374_0 = DB167_DBX374_0;
    }

    public String getDB167_DBX374_1() {
        return DB167_DBX374_1;
    }

    public void setDB167_DBX374_1(String DB167_DBX374_1) {
        this.DB167_DBX374_1 = DB167_DBX374_1;
    }

    public String getDB167_DBX374_2() {
        return DB167_DBX374_2;
    }

    public void setDB167_DBX374_2(String DB167_DBX374_2) {
        this.DB167_DBX374_2 = DB167_DBX374_2;
    }

    public String getDB167_DBX374_3() {
        return DB167_DBX374_3;
    }

    public void setDB167_DBX374_3(String DB167_DBX374_3) {
        this.DB167_DBX374_3 = DB167_DBX374_3;
    }

    public String getDB167_DBX374_4() {
        return DB167_DBX374_4;
    }

    public void setDB167_DBX374_4(String DB167_DBX374_4) {
        this.DB167_DBX374_4 = DB167_DBX374_4;
    }

    public String getDB167_DBX374_5() {
        return DB167_DBX374_5;
    }

    public void setDB167_DBX374_5(String DB167_DBX374_5) {
        this.DB167_DBX374_5 = DB167_DBX374_5;
    }

    public String getDB167_DBX374_6() {
        return DB167_DBX374_6;
    }

    public void setDB167_DBX374_6(String DB167_DBX374_6) {
        this.DB167_DBX374_6 = DB167_DBX374_6;
    }

    public String getDB167_DBX374_7() {
        return DB167_DBX374_7;
    }

    public void setDB167_DBX374_7(String DB167_DBX374_7) {
        this.DB167_DBX374_7 = DB167_DBX374_7;
    }

    public String getDB167_DBX375_0() {
        return DB167_DBX375_0;
    }

    public void setDB167_DBX375_0(String DB167_DBX375_0) {
        this.DB167_DBX375_0 = DB167_DBX375_0;
    }

    public String getDB167_DBX375_1() {
        return DB167_DBX375_1;
    }

    public void setDB167_DBX375_1(String DB167_DBX375_1) {
        this.DB167_DBX375_1 = DB167_DBX375_1;
    }

    public String getDB167_DBX375_2() {
        return DB167_DBX375_2;
    }

    public void setDB167_DBX375_2(String DB167_DBX375_2) {
        this.DB167_DBX375_2 = DB167_DBX375_2;
    }

    public String getDB167_DBX375_3() {
        return DB167_DBX375_3;
    }

    public void setDB167_DBX375_3(String DB167_DBX375_3) {
        this.DB167_DBX375_3 = DB167_DBX375_3;
    }

    public String getDB167_DBX375_4() {
        return DB167_DBX375_4;
    }

    public void setDB167_DBX375_4(String DB167_DBX375_4) {
        this.DB167_DBX375_4 = DB167_DBX375_4;
    }

    public String getDB167_DBX375_5() {
        return DB167_DBX375_5;
    }

    public void setDB167_DBX375_5(String DB167_DBX375_5) {
        this.DB167_DBX375_5 = DB167_DBX375_5;
    }

    public String getDB167_DBX375_6() {
        return DB167_DBX375_6;
    }

    public void setDB167_DBX375_6(String DB167_DBX375_6) {
        this.DB167_DBX375_6 = DB167_DBX375_6;
    }

    public String getDB167_DBX375_7() {
        return DB167_DBX375_7;
    }

    public void setDB167_DBX375_7(String DB167_DBX375_7) {
        this.DB167_DBX375_7 = DB167_DBX375_7;
    }

    public String getDB167_DBX380_0() {
        return DB167_DBX380_0;
    }

    public void setDB167_DBX380_0(String DB167_DBX380_0) {
        this.DB167_DBX380_0 = DB167_DBX380_0;
    }

    public String getDB167_DBD28_LEN() {
        return DB167_DBD28_LEN;
    }

    public void setDB167_DBD28_LEN(String DB167_DBD28_LEN) {
        this.DB167_DBD28_LEN = DB167_DBD28_LEN;
    }

    public String getDB167_DBW378() {
        return DB167_DBW378;
    }

    public void setDB167_DBW378(String DB167_DBW378) {
        this.DB167_DBW378 = DB167_DBW378;
    }

    public String getDB167_DBW380() {
        return DB167_DBW380;
    }

    public void setDB167_DBW380(String DB167_DBW380) {
        this.DB167_DBW380 = DB167_DBW380;
    }

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }
}
