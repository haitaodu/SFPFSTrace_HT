package com.smartflow.common.stationenum;

/**
 * @author ：tao
 * @date ：Created in 2020/8/14 14:48
 */

public enum  StationNameRe {
    /**
     * RE工站需要覆盖的工站
     */
    RE_OP10A("CL_REOP10A"),RE_OP10B("CL_REOP10B");
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    StationNameRe(String name)
    {
        this.name=name;
    }
}
