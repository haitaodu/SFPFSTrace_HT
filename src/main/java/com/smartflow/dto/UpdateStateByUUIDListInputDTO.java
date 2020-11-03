package com.smartflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UpdateStateByUUIDListInputDTO {
    private List<String> UUIDList;
    private Integer ButtonValue;
    private Integer StationId;
    @JsonProperty("UUIDList")
    public List<String> getUUIDList() {
        return UUIDList;
    }

    public void setUUIDList(List<String> UUIDList) {
        this.UUIDList = UUIDList;
    }
    @JsonProperty("ButtonValue")
    public Integer getButtonValue() {
        return ButtonValue;
    }

    public void setButtonValue(Integer buttonValue) {
        ButtonValue = buttonValue;
    }
    @JsonProperty("StationId")
    public Integer getStationId() {
        return StationId;
    }

    public void setStationId(Integer stationId) {
        StationId = stationId;
    }
}
