package com.smartflow.model;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="core.CL_TUOP30")
public class CL_TUOP30 {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid")
  private String UUID;
  private Date CREATE_DATE;
  private String IS_SYNCH;
  private String SerialNumber;
  private Integer WorkOrderId;
  private String IS_OK;
  private BigDecimal DB100_DBD12;
  private BigDecimal DB100_DBD16;
  private BigDecimal DB100_DBD2;
  private BigDecimal DB100_DBD20;
  private BigDecimal DB100_DBD24;
  private BigDecimal DB100_DBD28;
  private BigDecimal DB100_DBD312;
  private BigDecimal DB100_DBD316;
  private BigDecimal DB100_DBD32;
  private BigDecimal DB100_DBD320;
  private BigDecimal DB100_DBD36;
  private BigDecimal DB100_DBD40;
  private BigDecimal DB100_DBD46;
  private BigDecimal DB100_DBD6;
  private BigDecimal DB100_DBW44;
  private String DB100_DBX10_0;
  private String DB100_DBX10_1;
  private String DB100_DBX324_0;
  private String DB100_DBX50_0;
  private BigDecimal DB31_DBD446;
  private String DB200_CHAR0;
  private int state;

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

  public BigDecimal getDB100_DBD12() {
    return DB100_DBD12;
  }

  public void setDB100_DBD12(BigDecimal DB100_DBD12) {
    this.DB100_DBD12 = DB100_DBD12;
  }

  public BigDecimal getDB100_DBD16() {
    return DB100_DBD16;
  }

  public void setDB100_DBD16(BigDecimal DB100_DBD16) {
    this.DB100_DBD16 = DB100_DBD16;
  }

  public BigDecimal getDB100_DBD2() {
    return DB100_DBD2;
  }

  public void setDB100_DBD2(BigDecimal DB100_DBD2) {
    this.DB100_DBD2 = DB100_DBD2;
  }

  public BigDecimal getDB100_DBD20() {
    return DB100_DBD20;
  }

  public void setDB100_DBD20(BigDecimal DB100_DBD20) {
    this.DB100_DBD20 = DB100_DBD20;
  }

  public BigDecimal getDB100_DBD24() {
    return DB100_DBD24;
  }

  public void setDB100_DBD24(BigDecimal DB100_DBD24) {
    this.DB100_DBD24 = DB100_DBD24;
  }

  public BigDecimal getDB100_DBD28() {
    return DB100_DBD28;
  }

  public void setDB100_DBD28(BigDecimal DB100_DBD28) {
    this.DB100_DBD28 = DB100_DBD28;
  }


  public BigDecimal getDB100_DBD312() {
    return DB100_DBD312;
  }

  public void setDB100_DBD312(BigDecimal DB100_DBD312) {
    this.DB100_DBD312 = DB100_DBD312;
  }

  public BigDecimal getDB100_DBD316() {
    return DB100_DBD316;
  }

  public void setDB100_DBD316(BigDecimal DB100_DBD316) {
    this.DB100_DBD316 = DB100_DBD316;
  }

  public BigDecimal getDB100_DBD32() {
    return DB100_DBD32;
  }

  public void setDB100_DBD32(BigDecimal DB100_DBD32) {
    this.DB100_DBD32 = DB100_DBD32;
  }

  public BigDecimal getDB100_DBD320() {
    return DB100_DBD320;
  }

  public void setDB100_DBD320(BigDecimal DB100_DBD320) {
    this.DB100_DBD320 = DB100_DBD320;
  }

  public BigDecimal getDB100_DBD36() {
    return DB100_DBD36;
  }

  public void setDB100_DBD36(BigDecimal DB100_DBD36) {
    this.DB100_DBD36 = DB100_DBD36;
  }

  public BigDecimal getDB100_DBD40() {
    return DB100_DBD40;
  }

  public void setDB100_DBD40(BigDecimal DB100_DBD40) {
    this.DB100_DBD40 = DB100_DBD40;
  }

  public BigDecimal getDB100_DBD46() {
    return DB100_DBD46;
  }

  public void setDB100_DBD46(BigDecimal DB100_DBD46) {
    this.DB100_DBD46 = DB100_DBD46;
  }

  public BigDecimal getDB100_DBD6() {
    return DB100_DBD6;
  }

  public void setDB100_DBD6(BigDecimal DB100_DBD6) {
    this.DB100_DBD6 = DB100_DBD6;
  }

  public BigDecimal getDB100_DBW44() {
    return DB100_DBW44;
  }

  public void setDB100_DBW44(BigDecimal DB100_DBW44) {
    this.DB100_DBW44 = DB100_DBW44;
  }


  public String getDB100_DBX10_0() {
    return DB100_DBX10_0;
  }

  public void setDB100_DBX10_0(String DB100_DBX10_0) {
    this.DB100_DBX10_0 = DB100_DBX10_0;
  }

  public String getDB100_DBX10_1() {
    return DB100_DBX10_1;
  }

  public void setDB100_DBX10_1(String DB100_DBX10_1) {
    this.DB100_DBX10_1 = DB100_DBX10_1;
  }

  public String getDB100_DBX324_0() {
    return DB100_DBX324_0;
  }

  public void setDB100_DBX324_0(String DB100_DBX324_0) {
    this.DB100_DBX324_0 = DB100_DBX324_0;
  }


  public String getDB100_DBX50_0() {
    return DB100_DBX50_0;
  }

  public void setDB100_DBX50_0(String DB100_DBX50_0) {
    this.DB100_DBX50_0 = DB100_DBX50_0;
  }


  public BigDecimal getDB31_DBD446() {
    return DB31_DBD446;
  }

  public void setDB31_DBD446(BigDecimal DB31_DBD446) {
    this.DB31_DBD446 = DB31_DBD446;
  }



  public String getDB200_CHAR0() {
    return DB200_CHAR0;
  }

  public void setDB200_CHAR0(String DB200_CHAR0) {
    this.DB200_CHAR0 = DB200_CHAR0;
  }

  }
