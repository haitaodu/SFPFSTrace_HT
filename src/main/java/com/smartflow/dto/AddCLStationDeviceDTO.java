package com.smartflow.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddCLStationDeviceDTO {
    private String LinkTableName;
    private Object Object;

    @Override
    public String toString() {
        return "AddCLStationDeviceDTO{" +
                "LinkTableName='" + LinkTableName + '\'' +
                ", Object=" + Object +
                '}';
    }

    @JsonProperty("LinkTableName")
    public String getLinkTableName() {
        return LinkTableName;
    }

    public void setLinkTableName(String linkTableName) {
        LinkTableName = linkTableName;
    }
    @JsonProperty("Object")
    public java.lang.Object getObject() {
        return Object;
    }

    public void setObject(java.lang.Object object) {
        Object = object;
    }
}
