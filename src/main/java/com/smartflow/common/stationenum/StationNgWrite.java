package com.smartflow.common.stationenum;

/**
 * @author ：tao
 * @date ：Created in 2020/9/3 14:29
 */

public enum  StationNgWrite {
    /**
     *发生ng字段的时候需要覆盖的表，做特殊处理
     */
    IM_OP25("CL_IMOP25"),
    IM_OP30("CL_IMOP30"),
    IM_OP40("CL_IMOP40"),
    CL_TUOP25("CL_TUOP25"),
    CL_TUOP30("CL_TUOP30"),
    CL_TUOP45("CL_TUOP45");
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    StationNgWrite(String name)
    {
        this.name=name;
    }
}
