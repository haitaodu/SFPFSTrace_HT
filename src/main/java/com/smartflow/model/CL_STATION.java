package com.smartflow.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="core.CL_STATION")
public class CL_STATION {

  @Id
  @GeneratedValue
  private String PID;
  private String STATION_CODE;
  private String STATION_BAR_CODE;
  private String STATION_IP_ADDRESS;
  private String STATION_DESCRIPTION;
  private Date CREATION_TIME;
  private Date EDITING_TIME;
  private String LINK_TABLE_NAME;
  private String STATION_MODEL;

  public String getPID() {
    return PID;
  }

  public void setPID(String PID) {
    this.PID = PID;
  }

  public String getSTATION_CODE() {
    return STATION_CODE;
  }

  public void setSTATION_CODE(String STATION_CODE) {
    this.STATION_CODE = STATION_CODE;
  }

  public String getSTATION_BAR_CODE() {
    return STATION_BAR_CODE;
  }

  public void setSTATION_BAR_CODE(String STATION_BAR_CODE) {
    this.STATION_BAR_CODE = STATION_BAR_CODE;
  }

  public String getSTATION_IP_ADDRESS() {
    return STATION_IP_ADDRESS;
  }

  public void setSTATION_IP_ADDRESS(String STATION_IP_ADDRESS) {
    this.STATION_IP_ADDRESS = STATION_IP_ADDRESS;
  }

  public String getSTATION_DESCRIPTION() {
    return STATION_DESCRIPTION;
  }

  public void setSTATION_DESCRIPTION(String STATION_DESCRIPTION) {
    this.STATION_DESCRIPTION = STATION_DESCRIPTION;
  }

  public Date getCREATION_TIME() {
    return CREATION_TIME;
  }

  public void setCREATION_TIME(Date CREATION_TIME) {
    this.CREATION_TIME = CREATION_TIME;
  }

  public Date getEDITING_TIME() {
    return EDITING_TIME;
  }

  public void setEDITING_TIME(Date EDITING_TIME) {
    this.EDITING_TIME = EDITING_TIME;
  }

  public String getLINK_TABLE_NAME() {
    return LINK_TABLE_NAME;
  }

  public void setLINK_TABLE_NAME(String LINK_TABLE_NAME) {
    this.LINK_TABLE_NAME = LINK_TABLE_NAME;
  }

  public String getSTATION_MODEL() {
    return STATION_MODEL;
  }

  public void setSTATION_MODEL(String STATION_MODEL) {
    this.STATION_MODEL = STATION_MODEL;
  }
}
