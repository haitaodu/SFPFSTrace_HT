package com.smartflow.common.stationenum;

/**
 * @Author: WJJ
 * @Description:
 * @Date: 2021-01-08 10:43
 **/
public enum CellEnum {
    TUCell("TU", "涡轮条码"),
    IMCell("IM", "泵轮条码"),
    RECell("RE", "导轮条码"),
    PDCell("PD", "闭锁条码"),
    FCCell("FC", "罩轮条码");
    private String key;
    private String label;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    CellEnum(String key, String label) {
        this.key = key;
        this.label = label;
    }
}
