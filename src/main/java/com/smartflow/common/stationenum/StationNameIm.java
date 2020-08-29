package com.smartflow.common.stationenum;

/**
 * @author ：tao
 * @date ：Created in 2020/8/14 14:50
 */

public enum  StationNameIm {
    /**
     * IM工站需要覆盖的工站位
     */
    IM_OP20("CL_IMOP20"),
    IM_OP25("CL_IMOP25"),
    IM_OP30("CL_IMOP30"),
    IM_OP40("CL_IMOP40");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    StationNameIm(String name){
        this.name=name;
    }
}
