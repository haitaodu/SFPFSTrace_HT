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
  private BigDecimal DB1_DBD12;
  private BigDecimal DB1_DBD132;
  private BigDecimal DB1_DBD137;
  private BigDecimal DB1_DBD140;
  private BigDecimal DB1_DBD144;
  private BigDecimal DB1_DBD148;
  private BigDecimal DB1_DBD156;
  private BigDecimal DB1_DBD160;
  private BigDecimal DB1_DBD20;
  private BigDecimal DB1_DBD24;
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
  private BigDecimal DB1_DBW96;
  private String DB73_DBX44_0;
  private int state;
  private BigDecimal MD448;
  private BigDecimal MD452;
  private BigDecimal MD456;
  private BigDecimal MD460;
  private BigDecimal MD464;
  private BigDecimal MD468;
  private BigDecimal MD472;
  private BigDecimal MD476;

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


  public BigDecimal getDB1_DBD12() {
    return DB1_DBD12;
  }

  public void setDB1_DBD12(BigDecimal DB1_DBD12) {
    this.DB1_DBD12 = DB1_DBD12;
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


  public BigDecimal getDB1_DBD156() {
    return DB1_DBD156;
  }

  public void setDB1_DBD156(BigDecimal DB1_DBD156) {
    this.DB1_DBD156 = DB1_DBD156;
  }


  public BigDecimal getDB1_DBD160() {
    return DB1_DBD160;
  }

  public void setDB1_DBD160(BigDecimal DB1_DBD160) {
    this.DB1_DBD160 = DB1_DBD160;
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



  public BigDecimal getDB1_DBW96() {
    return DB1_DBW96;
  }

  public void setDB1_DBW96(BigDecimal DB1_DBW96) {
    this.DB1_DBW96 = DB1_DBW96;
  }

  public BigDecimal getMD448() {
    return MD448;
  }

  public void setMD448(BigDecimal MD448) {
    this.MD448 = MD448;
  }

  public BigDecimal getMD452() {
    return MD452;
  }

  public void setMD452(BigDecimal MD452) {
    this.MD452 = MD452;
  }

  public BigDecimal getMD456() {
    return MD456;
  }

  public void setMD456(BigDecimal MD456) {
    this.MD456 = MD456;
  }

  public BigDecimal getMD460() {
    return MD460;
  }

  public void setMD460(BigDecimal MD460) {
    this.MD460 = MD460;
  }

  public BigDecimal getMD464() {
    return MD464;
  }

  public void setMD464(BigDecimal MD464) {
    this.MD464 = MD464;
  }

  public BigDecimal getMD468() {
    return MD468;
  }

  public void setMD468(BigDecimal MD468) {
    this.MD468 = MD468;
  }

  public BigDecimal getMD472() {
    return MD472;
  }

  public void setMD472(BigDecimal MD472) {
    this.MD472 = MD472;
  }

  public BigDecimal getMD476() {
    return MD476;
  }

  public void setMD476(BigDecimal MD476) {
    this.MD476 = MD476;
  }
}
