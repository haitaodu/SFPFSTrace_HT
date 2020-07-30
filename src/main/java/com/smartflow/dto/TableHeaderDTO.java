package com.smartflow.dto;

public class TableHeaderDTO {
    private String title;
    private String dataIndex;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDataIndex() {
        return dataIndex;
    }

    public void setDataIndex(String dataIndex) {
        this.dataIndex = dataIndex;
    }
    public TableHeaderDTO() {

    }

    public TableHeaderDTO(String title, String dataIndex) {
        this.title = title;
        this.dataIndex = dataIndex;
    }
}
