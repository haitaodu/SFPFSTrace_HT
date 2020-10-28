package com.smartflow.common.stationenum;

/**
 * @author ：tao
 * @date ：Created in 2020/8/10 15:51
 */
public enum StationNameTu {
    /**
     * TUOP描述
     */
    CL_TUOP25("CL_TUOP25"),
    CL_TUOP20("CL_TUOP20"),CL_TUOP30("CL_TUOP30"),;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    StationNameTu(String name)
    {
        this.name=name;
    }

}
