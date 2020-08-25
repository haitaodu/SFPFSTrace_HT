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
    private String DB10_DBX1828_0;
    private String DB10_DBX1828_1;
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
    private String M10_1;
    private String M500_2;
    private String M500_5;
    private String M501_0;
    private String M501_1;
    private String M502_0;
    private String M503_0;
    private String M503_1;
    private String M503_2;
    private String M506_0;
    private String M506_1;
    private String M506_2;
    private String M506_3;
    private String M506_4;
    private String M506_5;
    private String M506_6;
    private String M506_7;
    private String M507_0;
    private String M52_0;
    private String M52_1;
    private String M52_2;
    private int state;
    private String DB10_DBX1155_0;
    private String DB10_DBX1155_1;
    private String M53_5;
    private String M15_6;

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

    public String getDB10_DBX1828_0() {
        return DB10_DBX1828_0;
    }

    public void setDB10_DBX1828_0(String DB10_DBX1828_0) {
        this.DB10_DBX1828_0 = DB10_DBX1828_0;
    }

    public String getDB10_DBX1828_1() {
        return DB10_DBX1828_1;
    }

    public void setDB10_DBX1828_1(String DB10_DBX1828_1) {
        this.DB10_DBX1828_1 = DB10_DBX1828_1;
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

    public String getM10_1() {
        return M10_1;
    }

    public void setM10_1(String m10_1) {
        M10_1 = m10_1;
    }

    public String getM500_2() {
        return M500_2;
    }

    public void setM500_2(String m500_2) {
        M500_2 = m500_2;
    }

    public String getM500_5() {
        return M500_5;
    }

    public void setM500_5(String m500_5) {
        M500_5 = m500_5;
    }

    public String getM501_0() {
        return M501_0;
    }

    public void setM501_0(String m501_0) {
        M501_0 = m501_0;
    }

    public String getM501_1() {
        return M501_1;
    }

    public void setM501_1(String m501_1) {
        M501_1 = m501_1;
    }

    public String getM502_0() {
        return M502_0;
    }

    public void setM502_0(String m502_0) {
        M502_0 = m502_0;
    }

    public String getM503_0() {
        return M503_0;
    }

    public void setM503_0(String m503_0) {
        M503_0 = m503_0;
    }

    public String getM503_1() {
        return M503_1;
    }

    public void setM503_1(String m503_1) {
        M503_1 = m503_1;
    }

    public String getM503_2() {
        return M503_2;
    }

    public void setM503_2(String m503_2) {
        M503_2 = m503_2;
    }

    public String getM506_0() {
        return M506_0;
    }

    public void setM506_0(String m506_0) {
        M506_0 = m506_0;
    }

    public String getM506_1() {
        return M506_1;
    }

    public void setM506_1(String m506_1) {
        M506_1 = m506_1;
    }

    public String getM506_2() {
        return M506_2;
    }

    public void setM506_2(String m506_2) {
        M506_2 = m506_2;
    }

    public String getM506_3() {
        return M506_3;
    }

    public void setM506_3(String m506_3) {
        M506_3 = m506_3;
    }

    public String getM506_4() {
        return M506_4;
    }

    public void setM506_4(String m506_4) {
        M506_4 = m506_4;
    }

    public String getM506_5() {
        return M506_5;
    }

    public void setM506_5(String m506_5) {
        M506_5 = m506_5;
    }

    public String getM506_6() {
        return M506_6;
    }

    public void setM506_6(String m506_6) {
        M506_6 = m506_6;
    }

    public String getM506_7() {
        return M506_7;
    }

    public void setM506_7(String m506_7) {
        M506_7 = m506_7;
    }

    public String getM507_0() {
        return M507_0;
    }

    public void setM507_0(String m507_0) {
        M507_0 = m507_0;
    }

    public String getM52_0() {
        return M52_0;
    }

    public void setM52_0(String m52_0) {
        M52_0 = m52_0;
    }

    public String getM52_1() {
        return M52_1;
    }

    public void setM52_1(String m52_1) {
        M52_1 = m52_1;
    }

    public String getM52_2() {
        return M52_2;
    }

    public void setM52_2(String m52_2) {
        M52_2 = m52_2;
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
                ", DB10_DBX1828_0='" + DB10_DBX1828_0 + '\'' +
                ", DB10_DBX1828_1='" + DB10_DBX1828_1 + '\'' +
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
                ", M10_1='" + M10_1 + '\'' +
                ", M500_2='" + M500_2 + '\'' +
                ", M500_5='" + M500_5 + '\'' +
                ", M501_0='" + M501_0 + '\'' +
                ", M501_1='" + M501_1 + '\'' +
                ", M502_0='" + M502_0 + '\'' +
                ", M503_0='" + M503_0 + '\'' +
                ", M503_1='" + M503_1 + '\'' +
                ", M503_2='" + M503_2 + '\'' +
                ", M506_0='" + M506_0 + '\'' +
                ", M506_1='" + M506_1 + '\'' +
                ", M506_2='" + M506_2 + '\'' +
                ", M506_3='" + M506_3 + '\'' +
                ", M506_4='" + M506_4 + '\'' +
                ", M506_5='" + M506_5 + '\'' +
                ", M506_6='" + M506_6 + '\'' +
                ", M506_7='" + M506_7 + '\'' +
                ", M507_0='" + M507_0 + '\'' +
                ", M52_0='" + M52_0 + '\'' +
                ", M52_1='" + M52_1 + '\'' +
                ", M52_2='" + M52_2 + '\'' +
                ", state=" + state +
                ", DB10_DBX1155_0='" + DB10_DBX1155_0 + '\'' +
                ", DB10_DBX1155_1='" + DB10_DBX1155_1 + '\'' +
                ", M53_5='" + M53_5 + '\'' +
                ", M15_6='" + M15_6 + '\'' +
                '}';
    }
}
