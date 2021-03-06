package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_REOP100")
public class CL_REOP100 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private String DB100_DBX56_6;
    private String DB100_DBX56_7;
    private String DB100_DBX57_0;
    private String DB100_DBX57_1;
    private String DB100_DBX57_3;
    private String DB100_DBX59_2;
    private BigDecimal DB10_DBD108;
    private BigDecimal DB10_DBD120;
    private BigDecimal DB10_DBD124;
    private String DB200_DBX57_0;
    private String DB200_DBX57_1;
    private String DB200_DBX58_7;
    private String DB200_DBX59_0;
    private String DB200_DBX59_1;
    private String DB200_DBX59_2;
    private BigDecimal DB56_DBD244;
    private BigDecimal DB56_DBD248;
    private BigDecimal DB56_DBD300;
    private BigDecimal DB56_DBD304;
    private BigDecimal DB56_DBW148;
    private BigDecimal DB56_DBW150;
    private BigDecimal DB56_DBW152;
    private BigDecimal DB56_DBW2;
    private BigDecimal DB56_DBW252;
    private BigDecimal DB56_DBW254;
    private BigDecimal DB56_DBW256;
    private BigDecimal DB56_DBW4;
    private BigDecimal DB56_DBW48;
    private BigDecimal DB56_DBW50;
    private BigDecimal DB56_DBW52;
    private BigDecimal DB56_DBW54;
    private String DB56_DBX154_0;
    private String DB56_DBX258_0;
    private String DB56_DBX60_0;
    private Integer DB56_DBW308;
    private Integer DB56_DBW310;
    private Integer DB56_DBW312;
    private String  DB56_DBX314_0;
    private BigDecimal DB56_DBD356;
    private BigDecimal DB56_DBD360;
    private BigDecimal DB56_DBD364;
    private BigDecimal  DB56_DBD368;


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

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }

    public String getDB100_DBX56_6() {
        return DB100_DBX56_6;
    }

    public void setDB100_DBX56_6(String DB100_DBX56_6) {
        this.DB100_DBX56_6 = DB100_DBX56_6;
    }

    public String getDB100_DBX56_7() {
        return DB100_DBX56_7;
    }

    public void setDB100_DBX56_7(String DB100_DBX56_7) {
        this.DB100_DBX56_7 = DB100_DBX56_7;
    }

    public String getDB100_DBX57_0() {
        return DB100_DBX57_0;
    }

    public void setDB100_DBX57_0(String DB100_DBX57_0) {
        this.DB100_DBX57_0 = DB100_DBX57_0;
    }

    public String getDB100_DBX57_1() {
        return DB100_DBX57_1;
    }

    public void setDB100_DBX57_1(String DB100_DBX57_1) {
        this.DB100_DBX57_1 = DB100_DBX57_1;
    }

    public String getDB100_DBX57_3() {
        return DB100_DBX57_3;
    }

    public void setDB100_DBX57_3(String DB100_DBX57_3) {
        this.DB100_DBX57_3 = DB100_DBX57_3;
    }

    public String getDB100_DBX59_2() {
        return DB100_DBX59_2;
    }

    public void setDB100_DBX59_2(String DB100_DBX59_2) {
        this.DB100_DBX59_2 = DB100_DBX59_2;
    }

    public BigDecimal getDB10_DBD108() {
        return DB10_DBD108;
    }

    public void setDB10_DBD108(BigDecimal DB10_DBD108) {
        this.DB10_DBD108 = DB10_DBD108;
    }

    public BigDecimal getDB10_DBD120() {
        return DB10_DBD120;
    }

    public void setDB10_DBD120(BigDecimal DB10_DBD120) {
        this.DB10_DBD120 = DB10_DBD120;
    }

    public BigDecimal getDB10_DBD124() {
        return DB10_DBD124;
    }

    public void setDB10_DBD124(BigDecimal DB10_DBD124) {
        this.DB10_DBD124 = DB10_DBD124;
    }

    public String getDB200_DBX57_0() {
        return DB200_DBX57_0;
    }

    public void setDB200_DBX57_0(String DB200_DBX57_0) {
        this.DB200_DBX57_0 = DB200_DBX57_0;
    }

    public String getDB200_DBX57_1() {
        return DB200_DBX57_1;
    }

    public void setDB200_DBX57_1(String DB200_DBX57_1) {
        this.DB200_DBX57_1 = DB200_DBX57_1;
    }

    public String getDB200_DBX58_7() {
        return DB200_DBX58_7;
    }

    public void setDB200_DBX58_7(String DB200_DBX58_7) {
        this.DB200_DBX58_7 = DB200_DBX58_7;
    }

    public String getDB200_DBX59_0() {
        return DB200_DBX59_0;
    }

    public void setDB200_DBX59_0(String DB200_DBX59_0) {
        this.DB200_DBX59_0 = DB200_DBX59_0;
    }

    public String getDB200_DBX59_1() {
        return DB200_DBX59_1;
    }

    public void setDB200_DBX59_1(String DB200_DBX59_1) {
        this.DB200_DBX59_1 = DB200_DBX59_1;
    }

    public String getDB200_DBX59_2() {
        return DB200_DBX59_2;
    }

    public void setDB200_DBX59_2(String DB200_DBX59_2) {
        this.DB200_DBX59_2 = DB200_DBX59_2;
    }

    public BigDecimal getDB56_DBD244() {
        return DB56_DBD244;
    }

    public void setDB56_DBD244(BigDecimal DB56_DBD244) {
        this.DB56_DBD244 = DB56_DBD244;
    }

    public BigDecimal getDB56_DBD248() {
        return DB56_DBD248;
    }

    public void setDB56_DBD248(BigDecimal DB56_DBD248) {
        this.DB56_DBD248 = DB56_DBD248;
    }

    public BigDecimal getDB56_DBD300() {
        return DB56_DBD300;
    }

    public void setDB56_DBD300(BigDecimal DB56_DBD300) {
        this.DB56_DBD300 = DB56_DBD300;
    }

    public BigDecimal getDB56_DBD304() {
        return DB56_DBD304;
    }

    public void setDB56_DBD304(BigDecimal DB56_DBD304) {
        this.DB56_DBD304 = DB56_DBD304;
    }

    public BigDecimal getDB56_DBW148() {
        return DB56_DBW148;
    }

    public void setDB56_DBW148(BigDecimal DB56_DBW148) {
        this.DB56_DBW148 = DB56_DBW148;
    }

    public BigDecimal getDB56_DBW150() {
        return DB56_DBW150;
    }

    public void setDB56_DBW150(BigDecimal DB56_DBW150) {
        this.DB56_DBW150 = DB56_DBW150;
    }

    public BigDecimal getDB56_DBW152() {
        return DB56_DBW152;
    }

    public void setDB56_DBW152(BigDecimal DB56_DBW152) {
        this.DB56_DBW152 = DB56_DBW152;
    }

    public BigDecimal getDB56_DBW2() {
        return DB56_DBW2;
    }

    public void setDB56_DBW2(BigDecimal DB56_DBW2) {
        this.DB56_DBW2 = DB56_DBW2;
    }

    public BigDecimal getDB56_DBW252() {
        return DB56_DBW252;
    }

    public void setDB56_DBW252(BigDecimal DB56_DBW252) {
        this.DB56_DBW252 = DB56_DBW252;
    }

    public BigDecimal getDB56_DBW254() {
        return DB56_DBW254;
    }

    public void setDB56_DBW254(BigDecimal DB56_DBW254) {
        this.DB56_DBW254 = DB56_DBW254;
    }

    public BigDecimal getDB56_DBW256() {
        return DB56_DBW256;
    }

    public void setDB56_DBW256(BigDecimal DB56_DBW256) {
        this.DB56_DBW256 = DB56_DBW256;
    }

    public BigDecimal getDB56_DBW4() {
        return DB56_DBW4;
    }

    public void setDB56_DBW4(BigDecimal DB56_DBW4) {
        this.DB56_DBW4 = DB56_DBW4;
    }

    public BigDecimal getDB56_DBW48() {
        return DB56_DBW48;
    }

    public void setDB56_DBW48(BigDecimal DB56_DBW48) {
        this.DB56_DBW48 = DB56_DBW48;
    }

    public BigDecimal getDB56_DBW50() {
        return DB56_DBW50;
    }

    public void setDB56_DBW50(BigDecimal DB56_DBW50) {
        this.DB56_DBW50 = DB56_DBW50;
    }

    public BigDecimal getDB56_DBW52() {
        return DB56_DBW52;
    }

    public void setDB56_DBW52(BigDecimal DB56_DBW52) {
        this.DB56_DBW52 = DB56_DBW52;
    }

    public BigDecimal getDB56_DBW54() {
        return DB56_DBW54;
    }

    public void setDB56_DBW54(BigDecimal DB56_DBW54) {
        this.DB56_DBW54 = DB56_DBW54;
    }

    public String getDB56_DBX154_0() {
        return DB56_DBX154_0;
    }

    public void setDB56_DBX154_0(String DB56_DBX154_0) {
        this.DB56_DBX154_0 = DB56_DBX154_0;
    }

    public String getDB56_DBX258_0() {
        return DB56_DBX258_0;
    }

    public void setDB56_DBX258_0(String DB56_DBX258_0) {
        this.DB56_DBX258_0 = DB56_DBX258_0;
    }

    public String getDB56_DBX60_0() {
        return DB56_DBX60_0;
    }

    public void setDB56_DBX60_0(String DB56_DBX60_0) {
        this.DB56_DBX60_0 = DB56_DBX60_0;
    }

    public Integer getDB56_DBW308() {
        return DB56_DBW308;
    }

    public void setDB56_DBW308(Integer DB56_DBW308) {
        this.DB56_DBW308 = DB56_DBW308;
    }

    public Integer getDB56_DBW310() {
        return DB56_DBW310;
    }

    public void setDB56_DBW310(Integer DB56_DBW310) {
        this.DB56_DBW310 = DB56_DBW310;
    }

    public Integer getDB56_DBW312() {
        return DB56_DBW312;
    }

    public void setDB56_DBW312(Integer DB56_DBW312) {
        this.DB56_DBW312 = DB56_DBW312;
    }

    public String getDB56_DBX314_0() {
        return DB56_DBX314_0;
    }

    public void setDB56_DBX314_0(String DB56_DBX314_0) {
        this.DB56_DBX314_0 = DB56_DBX314_0;
    }

    public BigDecimal getDB56_DBD356() {
        return DB56_DBD356;
    }

    public void setDB56_DBD356(BigDecimal DB56_DBD356) {
        this.DB56_DBD356 = DB56_DBD356;
    }

    public BigDecimal getDB56_DBD360() {
        return DB56_DBD360;
    }

    public void setDB56_DBD360(BigDecimal DB56_DBD360) {
        this.DB56_DBD360 = DB56_DBD360;
    }

    public BigDecimal getDB56_DBD364() {
        return DB56_DBD364;
    }

    public void setDB56_DBD364(BigDecimal DB56_DBD364) {
        this.DB56_DBD364 = DB56_DBD364;
    }

    public BigDecimal getDB56_DBD368() {
        return DB56_DBD368;
    }

    public void setDB56_DBD368(BigDecimal DB56_DBD368) {
        this.DB56_DBD368 = DB56_DBD368;
    }
}
