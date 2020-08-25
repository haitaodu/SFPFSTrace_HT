package com.smartflow.common.stationenum;

/**
 * @author ：tao
 * @date ：Created in 2020/8/14 15:05
 */
public enum StationReWrite {
    /**
     * 给真实条形码的工站
     */
    CL_WLZPDM("CL_TUOP50"),RE_OP15("CL_REOP15"),IM_OP45("CL_IMOP45");
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    StationReWrite(String name)
    {
        this.name=name;
    }
}
