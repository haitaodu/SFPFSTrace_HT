package com.smartflow.model;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="core.CL_TUOP25")
public class CL_TUOP25 {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid")
  private String UUID;
  private Date CREATE_DATE;
  private String IS_SYNCH;
  private String SerialNumber;
  private Integer WorkOrderId;
  private String IS_OK;
  private BigDecimal DB1_DBD0;
  private BigDecimal DB1_DBD116;
  private BigDecimal DB1_DBD12;
  private BigDecimal DB1_DBD120;
  private BigDecimal DB1_DBD124;
  private BigDecimal DB1_DBD128;
  private BigDecimal DB1_DBD132;
  private BigDecimal DB1_DBD137;
  private BigDecimal DB1_DBD140;
  private BigDecimal DB1_DBD144;
  private BigDecimal DB1_DBD148;
  private BigDecimal DB1_DBD152;
  private BigDecimal DB1_DBD156;
  private BigDecimal DB1_DBD16;
  private BigDecimal DB1_DBD160;
  private BigDecimal DB1_DBD164;
  private BigDecimal DB1_DBD176;
  private BigDecimal DB1_DBD184;
  private BigDecimal DB1_DBD192;
  private BigDecimal DB1_DBD20;
  private BigDecimal DB1_DBD24;
  private BigDecimal DB1_DBD240;
  private BigDecimal DB1_DBD244;
  private BigDecimal DB1_DBD248;
  private BigDecimal DB1_DBD252;
  private BigDecimal DB1_DBD28;
  private BigDecimal DB1_DBD32;
  private BigDecimal DB1_DBD36;
  private BigDecimal DB1_DBD4;
  private BigDecimal DB1_DBD40;
  private BigDecimal DB1_DBD44;
  private BigDecimal DB1_DBD48;
  private BigDecimal DB1_DBD52;
  private BigDecimal DB1_DBD56;
  private BigDecimal DB1_DBD60;
  private BigDecimal DB1_DBD64;
  private BigDecimal DB1_DBD72;
  private BigDecimal DB1_DBD8;
  private BigDecimal DB1_DBW114;
  private BigDecimal DB1_DBW168;
  private BigDecimal DB1_DBW170;
  private BigDecimal DB1_DBW172;
  private BigDecimal DB1_DBW174;
  private BigDecimal DB1_DBW96;
  private BigDecimal DB59_DBW4;
  private String M202_1;
  private String M202_2;
  private String M202_3;
  private String M230_2;
  private String M230_3;
  private String M240_0;
  private String M240_1;
  private String M240_2;
  private String M240_3;
  private String M240_4;
  private String M240_5;
  private String M240_6;
  private String M240_7;
  private String M241_0;
  private String M241_1;
  private String M241_2;
  private String M241_3;
  private String M241_4;
  private String M241_5;
  private String M241_6;
  private String M241_7;
  private String M244_0;
  private String M244_1;
  private String M244_2;
  private String M244_3;
  private String M244_4;
  private String M244_5;
  private String M244_6;
  private String M244_7;
  private String M245_2;
  private String M245_3;
  private String M246_0;
  private String M246_1;
  private String M246_2;
  private String M246_3;
  private String M246_4;
  private String M246_5;
  private String M248_2;
  private String M248_3;
  private String M248_4;
  private String M248_5;
  private String M620_3;
  private String MD200;
  private String DB73_DBX44_0;
  private int state;


  public String getDB73_DBX44_0() {
    return DB73_DBX44_0;
  }

  public void setDB73_DBX44_0(String DB73_DBX44_0) {
    this.DB73_DBX44_0 = DB73_DBX44_0;
  }

  public String getIS_OK() {
    return IS_OK;
  }

  public void setIS_OK(String IS_OK) {
    this.IS_OK = IS_OK;
  }

  public int isState() {
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

  public BigDecimal getDB1_DBD0() {
    return DB1_DBD0;
  }

  public void setDB1_DBD0(BigDecimal DB1_DBD0) {
    this.DB1_DBD0 = DB1_DBD0;
  }

  public BigDecimal getDB1_DBD116() {
    return DB1_DBD116;
  }

  public void setDB1_DBD116(BigDecimal DB1_DBD116) {
    this.DB1_DBD116 = DB1_DBD116;
  }

  public BigDecimal getDB1_DBD12() {
    return DB1_DBD12;
  }

  public void setDB1_DBD12(BigDecimal DB1_DBD12) {
    this.DB1_DBD12 = DB1_DBD12;
  }

  public BigDecimal getDB1_DBD120() {
    return DB1_DBD120;
  }

  public void setDB1_DBD120(BigDecimal DB1_DBD120) {
    this.DB1_DBD120 = DB1_DBD120;
  }

  public BigDecimal getDB1_DBD124() {
    return DB1_DBD124;
  }

  public void setDB1_DBD124(BigDecimal DB1_DBD124) {
    this.DB1_DBD124 = DB1_DBD124;
  }

  public BigDecimal getDB1_DBD128() {
    return DB1_DBD128;
  }

  public void setDB1_DBD128(BigDecimal DB1_DBD128) {
    this.DB1_DBD128 = DB1_DBD128;
  }

  public BigDecimal getDB1_DBD132() {
    return DB1_DBD132;
  }

  public void setDB1_DBD132(BigDecimal DB1_DBD132) {
    this.DB1_DBD132 = DB1_DBD132;
  }

  public BigDecimal getDB1_DBD137() {
    return DB1_DBD137;
  }

  public void setDB1_DBD137(BigDecimal DB1_DBD137) {
    this.DB1_DBD137 = DB1_DBD137;
  }

  public BigDecimal getDB1_DBD140() {
    return DB1_DBD140;
  }

  public void setDB1_DBD140(BigDecimal DB1_DBD140) {
    this.DB1_DBD140 = DB1_DBD140;
  }

  public BigDecimal getDB1_DBD144() {
    return DB1_DBD144;
  }

  public void setDB1_DBD144(BigDecimal DB1_DBD144) {
    this.DB1_DBD144 = DB1_DBD144;
  }

  public BigDecimal getDB1_DBD148() {
    return DB1_DBD148;
  }

  public void setDB1_DBD148(BigDecimal DB1_DBD148) {
    this.DB1_DBD148 = DB1_DBD148;
  }

  public BigDecimal getDB1_DBD152() {
    return DB1_DBD152;
  }

  public void setDB1_DBD152(BigDecimal DB1_DBD152) {
    this.DB1_DBD152 = DB1_DBD152;
  }

  public BigDecimal getDB1_DBD156() {
    return DB1_DBD156;
  }

  public void setDB1_DBD156(BigDecimal DB1_DBD156) {
    this.DB1_DBD156 = DB1_DBD156;
  }

  public BigDecimal getDB1_DBD16() {
    return DB1_DBD16;
  }

  public void setDB1_DBD16(BigDecimal DB1_DBD16) {
    this.DB1_DBD16 = DB1_DBD16;
  }

  public BigDecimal getDB1_DBD160() {
    return DB1_DBD160;
  }

  public void setDB1_DBD160(BigDecimal DB1_DBD160) {
    this.DB1_DBD160 = DB1_DBD160;
  }

  public BigDecimal getDB1_DBD164() {
    return DB1_DBD164;
  }

  public void setDB1_DBD164(BigDecimal DB1_DBD164) {
    this.DB1_DBD164 = DB1_DBD164;
  }

  public BigDecimal getDB1_DBD176() {
    return DB1_DBD176;
  }

  public void setDB1_DBD176(BigDecimal DB1_DBD176) {
    this.DB1_DBD176 = DB1_DBD176;
  }

  public BigDecimal getDB1_DBD184() {
    return DB1_DBD184;
  }

  public void setDB1_DBD184(BigDecimal DB1_DBD184) {
    this.DB1_DBD184 = DB1_DBD184;
  }

  public BigDecimal getDB1_DBD192() {
    return DB1_DBD192;
  }

  public void setDB1_DBD192(BigDecimal DB1_DBD192) {
    this.DB1_DBD192 = DB1_DBD192;
  }

  public BigDecimal getDB1_DBD20() {
    return DB1_DBD20;
  }

  public void setDB1_DBD20(BigDecimal DB1_DBD20) {
    this.DB1_DBD20 = DB1_DBD20;
  }

  public BigDecimal getDB1_DBD24() {
    return DB1_DBD24;
  }

  public void setDB1_DBD24(BigDecimal DB1_DBD24) {
    this.DB1_DBD24 = DB1_DBD24;
  }

  public BigDecimal getDB1_DBD240() {
    return DB1_DBD240;
  }

  public void setDB1_DBD240(BigDecimal DB1_DBD240) {
    this.DB1_DBD240 = DB1_DBD240;
  }

  public BigDecimal getDB1_DBD244() {
    return DB1_DBD244;
  }

  public void setDB1_DBD244(BigDecimal DB1_DBD244) {
    this.DB1_DBD244 = DB1_DBD244;
  }

  public BigDecimal getDB1_DBD248() {
    return DB1_DBD248;
  }

  public void setDB1_DBD248(BigDecimal DB1_DBD248) {
    this.DB1_DBD248 = DB1_DBD248;
  }

  public BigDecimal getDB1_DBD252() {
    return DB1_DBD252;
  }

  public void setDB1_DBD252(BigDecimal DB1_DBD252) {
    this.DB1_DBD252 = DB1_DBD252;
  }

  public BigDecimal getDB1_DBD28() {
    return DB1_DBD28;
  }

  public void setDB1_DBD28(BigDecimal DB1_DBD28) {
    this.DB1_DBD28 = DB1_DBD28;
  }

  public BigDecimal getDB1_DBD32() {
    return DB1_DBD32;
  }

  public void setDB1_DBD32(BigDecimal DB1_DBD32) {
    this.DB1_DBD32 = DB1_DBD32;
  }

  public BigDecimal getDB1_DBD36() {
    return DB1_DBD36;
  }

  public void setDB1_DBD36(BigDecimal DB1_DBD36) {
    this.DB1_DBD36 = DB1_DBD36;
  }

  public BigDecimal getDB1_DBD4() {
    return DB1_DBD4;
  }

  public void setDB1_DBD4(BigDecimal DB1_DBD4) {
    this.DB1_DBD4 = DB1_DBD4;
  }

  public BigDecimal getDB1_DBD40() {
    return DB1_DBD40;
  }

  public void setDB1_DBD40(BigDecimal DB1_DBD40) {
    this.DB1_DBD40 = DB1_DBD40;
  }

  public BigDecimal getDB1_DBD44() {
    return DB1_DBD44;
  }

  public void setDB1_DBD44(BigDecimal DB1_DBD44) {
    this.DB1_DBD44 = DB1_DBD44;
  }

  public BigDecimal getDB1_DBD48() {
    return DB1_DBD48;
  }

  public void setDB1_DBD48(BigDecimal DB1_DBD48) {
    this.DB1_DBD48 = DB1_DBD48;
  }

  public BigDecimal getDB1_DBD52() {
    return DB1_DBD52;
  }

  public void setDB1_DBD52(BigDecimal DB1_DBD52) {
    this.DB1_DBD52 = DB1_DBD52;
  }

  public BigDecimal getDB1_DBD56() {
    return DB1_DBD56;
  }

  public void setDB1_DBD56(BigDecimal DB1_DBD56) {
    this.DB1_DBD56 = DB1_DBD56;
  }

  public BigDecimal getDB1_DBD60() {
    return DB1_DBD60;
  }

  public void setDB1_DBD60(BigDecimal DB1_DBD60) {
    this.DB1_DBD60 = DB1_DBD60;
  }

  public BigDecimal getDB1_DBD64() {
    return DB1_DBD64;
  }

  public void setDB1_DBD64(BigDecimal DB1_DBD64) {
    this.DB1_DBD64 = DB1_DBD64;
  }

  public BigDecimal getDB1_DBD72() {
    return DB1_DBD72;
  }

  public void setDB1_DBD72(BigDecimal DB1_DBD72) {
    this.DB1_DBD72 = DB1_DBD72;
  }

  public BigDecimal getDB1_DBD8() {
    return DB1_DBD8;
  }

  public void setDB1_DBD8(BigDecimal DB1_DBD8) {
    this.DB1_DBD8 = DB1_DBD8;
  }

  public BigDecimal getDB1_DBW114() {
    return DB1_DBW114;
  }

  public void setDB1_DBW114(BigDecimal DB1_DBW114) {
    this.DB1_DBW114 = DB1_DBW114;
  }

  public BigDecimal getDB1_DBW168() {
    return DB1_DBW168;
  }

  public void setDB1_DBW168(BigDecimal DB1_DBW168) {
    this.DB1_DBW168 = DB1_DBW168;
  }

  public BigDecimal getDB1_DBW170() {
    return DB1_DBW170;
  }

  public void setDB1_DBW170(BigDecimal DB1_DBW170) {
    this.DB1_DBW170 = DB1_DBW170;
  }

  public BigDecimal getDB1_DBW172() {
    return DB1_DBW172;
  }

  public void setDB1_DBW172(BigDecimal DB1_DBW172) {
    this.DB1_DBW172 = DB1_DBW172;
  }

  public BigDecimal getDB1_DBW174() {
    return DB1_DBW174;
  }

  public void setDB1_DBW174(BigDecimal DB1_DBW174) {
    this.DB1_DBW174 = DB1_DBW174;
  }

  public BigDecimal getDB1_DBW96() {
    return DB1_DBW96;
  }

  public void setDB1_DBW96(BigDecimal DB1_DBW96) {
    this.DB1_DBW96 = DB1_DBW96;
  }

  public BigDecimal getDB59_DBW4() {
    return DB59_DBW4;
  }

  public void setDB59_DBW4(BigDecimal DB59_DBW4) {
    this.DB59_DBW4 = DB59_DBW4;
  }

  public String getM202_1() {
    return M202_1;
  }

  public void setM202_1(String m202_1) {
    M202_1 = m202_1;
  }

  public String getM202_2() {
    return M202_2;
  }

  public void setM202_2(String m202_2) {
    M202_2 = m202_2;
  }

  public String getM202_3() {
    return M202_3;
  }

  public void setM202_3(String m202_3) {
    M202_3 = m202_3;
  }

  public String getM230_2() {
    return M230_2;
  }

  public void setM230_2(String m230_2) {
    M230_2 = m230_2;
  }

  public String getM230_3() {
    return M230_3;
  }

  public void setM230_3(String m230_3) {
    M230_3 = m230_3;
  }

  public String getM240_0() {
    return M240_0;
  }

  public void setM240_0(String m240_0) {
    M240_0 = m240_0;
  }

  public String getM240_1() {
    return M240_1;
  }

  public void setM240_1(String m240_1) {
    M240_1 = m240_1;
  }

  public String getM240_2() {
    return M240_2;
  }

  public void setM240_2(String m240_2) {
    M240_2 = m240_2;
  }

  public String getM240_3() {
    return M240_3;
  }

  public void setM240_3(String m240_3) {
    M240_3 = m240_3;
  }

  public String getM240_4() {
    return M240_4;
  }

  public void setM240_4(String m240_4) {
    M240_4 = m240_4;
  }

  public String getM240_5() {
    return M240_5;
  }

  public void setM240_5(String m240_5) {
    M240_5 = m240_5;
  }

  public String getM240_6() {
    return M240_6;
  }

  public void setM240_6(String m240_6) {
    M240_6 = m240_6;
  }

  public String getM240_7() {
    return M240_7;
  }

  public void setM240_7(String m240_7) {
    M240_7 = m240_7;
  }

  public String getM241_0() {
    return M241_0;
  }

  public void setM241_0(String m241_0) {
    M241_0 = m241_0;
  }

  public String getM241_1() {
    return M241_1;
  }

  public void setM241_1(String m241_1) {
    M241_1 = m241_1;
  }

  public String getM241_2() {
    return M241_2;
  }

  public void setM241_2(String m241_2) {
    M241_2 = m241_2;
  }

  public String getM241_3() {
    return M241_3;
  }

  public void setM241_3(String m241_3) {
    M241_3 = m241_3;
  }

  public String getM241_4() {
    return M241_4;
  }

  public void setM241_4(String m241_4) {
    M241_4 = m241_4;
  }

  public String getM241_5() {
    return M241_5;
  }

  public void setM241_5(String m241_5) {
    M241_5 = m241_5;
  }

  public String getM241_6() {
    return M241_6;
  }

  public void setM241_6(String m241_6) {
    M241_6 = m241_6;
  }

  public String getM241_7() {
    return M241_7;
  }

  public void setM241_7(String m241_7) {
    M241_7 = m241_7;
  }

  public String getM244_0() {
    return M244_0;
  }

  public void setM244_0(String m244_0) {
    M244_0 = m244_0;
  }

  public String getM244_1() {
    return M244_1;
  }

  public void setM244_1(String m244_1) {
    M244_1 = m244_1;
  }

  public String getM244_2() {
    return M244_2;
  }

  public void setM244_2(String m244_2) {
    M244_2 = m244_2;
  }

  public String getM244_3() {
    return M244_3;
  }

  public void setM244_3(String m244_3) {
    M244_3 = m244_3;
  }

  public String getM244_4() {
    return M244_4;
  }

  public void setM244_4(String m244_4) {
    M244_4 = m244_4;
  }

  public String getM244_5() {
    return M244_5;
  }

  public void setM244_5(String m244_5) {
    M244_5 = m244_5;
  }

  public String getM244_6() {
    return M244_6;
  }

  public void setM244_6(String m244_6) {
    M244_6 = m244_6;
  }

  public String getM244_7() {
    return M244_7;
  }

  public void setM244_7(String m244_7) {
    M244_7 = m244_7;
  }

  public String getM245_2() {
    return M245_2;
  }

  public void setM245_2(String m245_2) {
    M245_2 = m245_2;
  }

  public String getM245_3() {
    return M245_3;
  }

  public void setM245_3(String m245_3) {
    M245_3 = m245_3;
  }

  public String getM246_0() {
    return M246_0;
  }

  public void setM246_0(String m246_0) {
    M246_0 = m246_0;
  }

  public String getM246_1() {
    return M246_1;
  }

  public void setM246_1(String m246_1) {
    M246_1 = m246_1;
  }

  public String getM246_2() {
    return M246_2;
  }

  public void setM246_2(String m246_2) {
    M246_2 = m246_2;
  }

  public String getM246_3() {
    return M246_3;
  }

  public void setM246_3(String m246_3) {
    M246_3 = m246_3;
  }

  public String getM246_4() {
    return M246_4;
  }

  public void setM246_4(String m246_4) {
    M246_4 = m246_4;
  }

  public String getM246_5() {
    return M246_5;
  }

  public void setM246_5(String m246_5) {
    M246_5 = m246_5;
  }

  public String getM248_2() {
    return M248_2;
  }

  public void setM248_2(String m248_2) {
    M248_2 = m248_2;
  }

  public String getM248_3() {
    return M248_3;
  }

  public void setM248_3(String m248_3) {
    M248_3 = m248_3;
  }

  public String getM248_4() {
    return M248_4;
  }

  public void setM248_4(String m248_4) {
    M248_4 = m248_4;
  }

  public String getM248_5() {
    return M248_5;
  }

  public void setM248_5(String m248_5) {
    M248_5 = m248_5;
  }

  public String getM620_3() {
    return M620_3;
  }

  public void setM620_3(String m620_3) {
    M620_3 = m620_3;
  }

  public String getMD200() {
    return MD200;
  }

  public void setMD200(String MD200) {
    this.MD200 = MD200;
  }
}
