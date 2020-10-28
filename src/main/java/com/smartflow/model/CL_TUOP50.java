package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_TUOP50")
public class CL_TUOP50 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private BigDecimal DB10_DBD1830;
    private BigDecimal DB10_DBD1834;
    private BigDecimal DB10_DBD1838;
    private BigDecimal DB10_DBD1842;
    private BigDecimal DB10_DBW1006;
    private BigDecimal DB10_DBW1008;
    private BigDecimal DB10_DBW1010;
    private BigDecimal DB10_DBW1146;
    private BigDecimal DB10_DBW1148;
    private BigDecimal DB10_DBW1150;
    private BigDecimal DB10_DBW824;
    private BigDecimal DB10_DBW826;
    private BigDecimal DB10_DBW828;
    private BigDecimal DB10_DBW830;
    private BigDecimal DB10_DBW832;
    private BigDecimal DB10_DBW834;
    private String DB10_DBX1018_0;
    private String DB10_DBX1062_0;
    private String DB10_DBX1104_0;
    private String DB10_DBX652_0;
    private String DB10_DBX694_0;
    private String DB10_DBX736_0;
    private String DB10_DBX778_0;
    private String DB10_DBX84_0;
    private String DB10_DBX878_0;
    private String DB10_DBX962_0;
    private BigDecimal DB1_DBD0;
    private BigDecimal DB1_DBD12;
    private BigDecimal DB1_DBD4;
    private BigDecimal DB1_DBD8;
    private String DB20_DBX56_6;
    private String DB20_DBX56_7;
    private String DB20_DBX57_0;
    private String DB20_DBX57_1;
    private String DB20_DBX57_3;
    private String DB20_DBX57_4;
    private String DB20_DBX60_1;
    private String DB20_DBX60_2;
    private int state;
    private String DB10_DBX1155_0;
    private String DB10_DBX1155_1;
    private String M53_5;
    private String M15_6;

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public String getDB10_DBX1155_0() {
        return DB10_DBX1155_0;
    }

    public void setDB10_DBX1155_0(String DB10_DBX1155_0) {
        this.DB10_DBX1155_0 = DB10_DBX1155_0;
    }

    public String getDB10_DBX1155_1() {
        return DB10_DBX1155_1;
    }

    public void setDB10_DBX1155_1(String DB10_DBX1155_1) {
        this.DB10_DBX1155_1 = DB10_DBX1155_1;
    }

    public String getM53_5() {
        return M53_5;
    }

    public void setM53_5(String m53_5) {
        M53_5 = m53_5;
    }

    public String getM15_6() {
        return M15_6;
    }

    public void setM15_6(String m15_6) {
        M15_6 = m15_6;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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



    public Integer getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        WorkOrderId = workOrderId;
    }

    public BigDecimal getDB10_DBD1830() {
        return DB10_DBD1830;
    }

    public void setDB10_DBD1830(BigDecimal DB10_DBD1830) {
        this.DB10_DBD1830 = DB10_DBD1830;
    }

    public BigDecimal getDB10_DBD1834() {
        return DB10_DBD1834;
    }

    public void setDB10_DBD1834(BigDecimal DB10_DBD1834) {
        this.DB10_DBD1834 = DB10_DBD1834;
    }

    public BigDecimal getDB10_DBD1838() {
        return DB10_DBD1838;
    }

    public void setDB10_DBD1838(BigDecimal DB10_DBD1838) {
        this.DB10_DBD1838 = DB10_DBD1838;
    }

    public BigDecimal getDB10_DBD1842() {
        return DB10_DBD1842;
    }

    public void setDB10_DBD1842(BigDecimal DB10_DBD1842) {
        this.DB10_DBD1842 = DB10_DBD1842;
    }

    public BigDecimal getDB10_DBW1006() {
        return DB10_DBW1006;
    }

    public void setDB10_DBW1006(BigDecimal DB10_DBW1006) {
        this.DB10_DBW1006 = DB10_DBW1006;
    }

    public BigDecimal getDB10_DBW1008() {
        return DB10_DBW1008;
    }

    public void setDB10_DBW1008(BigDecimal DB10_DBW1008) {
        this.DB10_DBW1008 = DB10_DBW1008;
    }

    public BigDecimal getDB10_DBW1010() {
        return DB10_DBW1010;
    }

    public void setDB10_DBW1010(BigDecimal DB10_DBW1010) {
        this.DB10_DBW1010 = DB10_DBW1010;
    }

    public BigDecimal getDB10_DBW1146() {
        return DB10_DBW1146;
    }

    public void setDB10_DBW1146(BigDecimal DB10_DBW1146) {
        this.DB10_DBW1146 = DB10_DBW1146;
    }

    public BigDecimal getDB10_DBW1148() {
        return DB10_DBW1148;
    }

    public void setDB10_DBW1148(BigDecimal DB10_DBW1148) {
        this.DB10_DBW1148 = DB10_DBW1148;
    }

    public BigDecimal getDB10_DBW1150() {
        return DB10_DBW1150;
    }

    public void setDB10_DBW1150(BigDecimal DB10_DBW1150) {
        this.DB10_DBW1150 = DB10_DBW1150;
    }

    public BigDecimal getDB10_DBW824() {
        return DB10_DBW824;
    }

    public void setDB10_DBW824(BigDecimal DB10_DBW824) {
        this.DB10_DBW824 = DB10_DBW824;
    }

    public BigDecimal getDB10_DBW826() {
        return DB10_DBW826;
    }

    public void setDB10_DBW826(BigDecimal DB10_DBW826) {
        this.DB10_DBW826 = DB10_DBW826;
    }

    public BigDecimal getDB10_DBW828() {
        return DB10_DBW828;
    }

    public void setDB10_DBW828(BigDecimal DB10_DBW828) {
        this.DB10_DBW828 = DB10_DBW828;
    }

    public BigDecimal getDB10_DBW830() {
        return DB10_DBW830;
    }

    public void setDB10_DBW830(BigDecimal DB10_DBW830) {
        this.DB10_DBW830 = DB10_DBW830;
    }

    public BigDecimal getDB10_DBW832() {
        return DB10_DBW832;
    }

    public void setDB10_DBW832(BigDecimal DB10_DBW832) {
        this.DB10_DBW832 = DB10_DBW832;
    }

    public BigDecimal getDB10_DBW834() {
        return DB10_DBW834;
    }

    public void setDB10_DBW834(BigDecimal DB10_DBW834) {
        this.DB10_DBW834 = DB10_DBW834;
    }

    public String getDB10_DBX1018_0() {
        return DB10_DBX1018_0;
    }

    public void setDB10_DBX1018_0(String DB10_DBX1018_0) {
        this.DB10_DBX1018_0 = DB10_DBX1018_0;
    }

    public String getDB10_DBX1062_0() {
        return DB10_DBX1062_0;
    }

    public void setDB10_DBX1062_0(String DB10_DBX1062_0) {
        this.DB10_DBX1062_0 = DB10_DBX1062_0;
    }

    public String getDB10_DBX1104_0() {
        return DB10_DBX1104_0;
    }

    public void setDB10_DBX1104_0(String DB10_DBX1104_0) {
        this.DB10_DBX1104_0 = DB10_DBX1104_0;
    }


    public String getDB10_DBX652_0() {
        return DB10_DBX652_0;
    }

    public void setDB10_DBX652_0(String DB10_DBX652_0) {
        this.DB10_DBX652_0 = DB10_DBX652_0;
    }

    public String getDB10_DBX694_0() {
        return DB10_DBX694_0;
    }

    public void setDB10_DBX694_0(String DB10_DBX694_0) {
        this.DB10_DBX694_0 = DB10_DBX694_0;
    }

    public String getDB10_DBX736_0() {
        return DB10_DBX736_0;
    }

    public void setDB10_DBX736_0(String DB10_DBX736_0) {
        this.DB10_DBX736_0 = DB10_DBX736_0;
    }

    public String getDB10_DBX778_0() {
        return DB10_DBX778_0;
    }

    public void setDB10_DBX778_0(String DB10_DBX778_0) {
        this.DB10_DBX778_0 = DB10_DBX778_0;
    }

    public String getDB10_DBX84_0() {
        return DB10_DBX84_0;
    }

    public void setDB10_DBX84_0(String DB10_DBX84_0) {
        this.DB10_DBX84_0 = DB10_DBX84_0;
    }

    public String getDB10_DBX878_0() {
        return DB10_DBX878_0;
    }

    public void setDB10_DBX878_0(String DB10_DBX878_0) {
        this.DB10_DBX878_0 = DB10_DBX878_0;
    }

    public String getDB10_DBX962_0() {
        return DB10_DBX962_0;
    }

    public void setDB10_DBX962_0(String DB10_DBX962_0) {
        this.DB10_DBX962_0 = DB10_DBX962_0;
    }

    public BigDecimal getDB1_DBD0() {
        return DB1_DBD0;
    }

    public void setDB1_DBD0(BigDecimal DB1_DBD0) {
        this.DB1_DBD0 = DB1_DBD0;
    }

    public BigDecimal getDB1_DBD12() {
        return DB1_DBD12;
    }

    public void setDB1_DBD12(BigDecimal DB1_DBD12) {
        this.DB1_DBD12 = DB1_DBD12;
    }

    public BigDecimal getDB1_DBD4() {
        return DB1_DBD4;
    }

    public void setDB1_DBD4(BigDecimal DB1_DBD4) {
        this.DB1_DBD4 = DB1_DBD4;
    }

    public BigDecimal getDB1_DBD8() {
        return DB1_DBD8;
    }

    public void setDB1_DBD8(BigDecimal DB1_DBD8) {
        this.DB1_DBD8 = DB1_DBD8;
    }

    public String getDB20_DBX56_6() {
        return DB20_DBX56_6;
    }

    public void setDB20_DBX56_6(String DB20_DBX56_6) {
        this.DB20_DBX56_6 = DB20_DBX56_6;
    }

    public String getDB20_DBX56_7() {
        return DB20_DBX56_7;
    }

    public void setDB20_DBX56_7(String DB20_DBX56_7) {
        this.DB20_DBX56_7 = DB20_DBX56_7;
    }

    public String getDB20_DBX57_0() {
        return DB20_DBX57_0;
    }

    public void setDB20_DBX57_0(String DB20_DBX57_0) {
        this.DB20_DBX57_0 = DB20_DBX57_0;
    }

    public String getDB20_DBX57_1() {
        return DB20_DBX57_1;
    }

    public void setDB20_DBX57_1(String DB20_DBX57_1) {
        this.DB20_DBX57_1 = DB20_DBX57_1;
    }

    public String getDB20_DBX57_3() {
        return DB20_DBX57_3;
    }

    public void setDB20_DBX57_3(String DB20_DBX57_3) {
        this.DB20_DBX57_3 = DB20_DBX57_3;
    }

    public String getDB20_DBX57_4() {
        return DB20_DBX57_4;
    }

    public void setDB20_DBX57_4(String DB20_DBX57_4) {
        this.DB20_DBX57_4 = DB20_DBX57_4;
    }

    public String getDB20_DBX60_1() {
        return DB20_DBX60_1;
    }

    public void setDB20_DBX60_1(String DB20_DBX60_1) {
        this.DB20_DBX60_1 = DB20_DBX60_1;
    }

    public String getDB20_DBX60_2() {
        return DB20_DBX60_2;
    }

    public void setDB20_DBX60_2(String DB20_DBX60_2) {
        this.DB20_DBX60_2 = DB20_DBX60_2;
    }


    @Override
    public String toString() {
        return "CL_TUOP50{" +
                "UUID='" + UUID + '\'' +
                ", CREATE_DATE=" + CREATE_DATE +
                ", IS_SYNCH='" + IS_SYNCH + '\'' +
                ", SerialNumber='" + SerialNumber + '\'' +
                ", WorkOrderId=" + WorkOrderId +
                ", DB10_DBD1830=" + DB10_DBD1830 +
                ", DB10_DBD1834=" + DB10_DBD1834 +
                ", DB10_DBD1838=" + DB10_DBD1838 +
                ", DB10_DBD1842=" + DB10_DBD1842 +
                ", DB10_DBW1006=" + DB10_DBW1006 +
                ", DB10_DBW1008=" + DB10_DBW1008 +
                ", DB10_DBW1010=" + DB10_DBW1010 +
                ", DB10_DBW1146=" + DB10_DBW1146 +
                ", DB10_DBW1148=" + DB10_DBW1148 +
                ", DB10_DBW1150=" + DB10_DBW1150 +
                ", DB10_DBW824=" + DB10_DBW824 +
                ", DB10_DBW826=" + DB10_DBW826 +
                ", DB10_DBW828=" + DB10_DBW828 +
                ", DB10_DBW830=" + DB10_DBW830 +
                ", DB10_DBW832=" + DB10_DBW832 +
                ", DB10_DBW834=" + DB10_DBW834 +
                ", DB10_DBX1018_0='" + DB10_DBX1018_0 + '\'' +
                ", DB10_DBX1062_0='" + DB10_DBX1062_0 + '\'' +
                ", DB10_DBX1104_0='" + DB10_DBX1104_0 + '\'' +
                ", DB10_DBX652_0='" + DB10_DBX652_0 + '\'' +
                ", DB10_DBX694_0='" + DB10_DBX694_0 + '\'' +
                ", DB10_DBX736_0='" + DB10_DBX736_0 + '\'' +
                ", DB10_DBX778_0='" + DB10_DBX778_0 + '\'' +
                ", DB10_DBX84_0='" + DB10_DBX84_0 + '\'' +
                ", DB10_DBX878_0='" + DB10_DBX878_0 + '\'' +
                ", DB10_DBX962_0='" + DB10_DBX962_0 + '\'' +
                ", DB1_DBD0=" + DB1_DBD0 +
                ", DB1_DBD12=" + DB1_DBD12 +
                ", DB1_DBD4=" + DB1_DBD4 +
                ", DB1_DBD8=" + DB1_DBD8 +
                ", DB20_DBX56_6='" + DB20_DBX56_6 + '\'' +
                ", DB20_DBX56_7='" + DB20_DBX56_7 + '\'' +
                ", DB20_DBX57_0='" + DB20_DBX57_0 + '\'' +
                ", DB20_DBX57_1='" + DB20_DBX57_1 + '\'' +
                ", DB20_DBX57_3='" + DB20_DBX57_3 + '\'' +
                ", DB20_DBX57_4='" + DB20_DBX57_4 + '\'' +
                ", DB20_DBX60_1='" + DB20_DBX60_1 + '\'' +
                ", DB20_DBX60_2='" + DB20_DBX60_2 + '\'' +
                ", state=" + state +
                ", DB10_DBX1155_0='" + DB10_DBX1155_0 + '\'' +
                ", DB10_DBX1155_1='" + DB10_DBX1155_1 + '\'' +
                ", M53_5='" + M53_5 + '\'' +
                ", M15_6='" + M15_6 + '\'' +
                '}';
    }
}
