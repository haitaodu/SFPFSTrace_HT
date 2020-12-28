package com.smartflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: WJJ
 * @Description:
 * @Date: 2020-12-28 12:41
 **/
public class GetStationTestResultBySerialNumberDTO {
    private String TUSerialNumber;
    private String IMSerialNumber;
    private String RESerialNumber;
    private String PDSerialNumber;
    private String FCSerialNumber;
    @JsonProperty("TUSerialNumber")
    public String getTUSerialNumber() {
        return TUSerialNumber;
    }

    public void setTUSerialNumber(String TUSerialNumber) {
        this.TUSerialNumber = TUSerialNumber;
    }
    @JsonProperty("IMSerialNumber")
    public String getIMSerialNumber() {
        return IMSerialNumber;
    }

    public void setIMSerialNumber(String IMSerialNumber) {
        this.IMSerialNumber = IMSerialNumber;
    }
    @JsonProperty("RESerialNumber")
    public String getRESerialNumber() {
        return RESerialNumber;
    }

    public void setRESerialNumber(String RESerialNumber) {
        this.RESerialNumber = RESerialNumber;
    }
    @JsonProperty("PDSerialNumber")
    public String getPDSerialNumber() {
        return PDSerialNumber;
    }

    public void setPDSerialNumber(String PDSerialNumber) {
        this.PDSerialNumber = PDSerialNumber;
    }
    @JsonProperty("FCSerialNumber")
    public String getFCSerialNumber() {
        return FCSerialNumber;
    }

    public void setFCSerialNumber(String FCSerialNumber) {
        this.FCSerialNumber = FCSerialNumber;
    }
}
