package com.smartflow.common.stationenum;

import org.apache.poi.hssf.util.HSSFColor;

/**
 * @author ：tao
 * @date ：Created in 2020/8/14 16:12
 */

public class StationEnumUtil {


    /**
     * 判断该工站是否属于给真实条码的工站
     * @param name 工站名
     * @return 返回是否属于给真实条码的工站
     */
    public static  boolean isLastStation(String name)
    {
        for (StationReWrite stationReWrite:StationReWrite.values())
        {
            if (name.equals(stationReWrite.getName()))
            {
                return true;
            }
        }
        return false;
    }
    /**
     *
     * @param name 参数
     * @return 返回是否是Tu的工站覆盖
     */
    public static boolean isTu(String name)
    {
        for (StationNameTu stationNameTu:StationNameTu.values())
        {
            if (name.equals(stationNameTu.getName()))
            {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param name 参数
     * @return 返回是否是Re的工站覆盖
     */
    public static boolean isRe(String name)
    {
        for (StationNameRe stationNameRe:StationNameRe.values())
        {
            if (name.equals(stationNameRe.getName()))
            {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param name 参数
     * @return 返回是否是Im的工站覆盖
     */
    public static boolean isIm(String name)
    {
        for (StationNameIm stationNameIm:StationNameIm.values())
        {
            if (name.equals(stationNameIm.getName()))
            {
                return true;
            }
        }
        return false;
    }

    /**\
     *
     * @param name 参数
     * @return 判断是否是应该覆盖的工站，Tu,Im,Re
     */
    public static  boolean isReWriteStation(String name)
    {
        return isIm(name) || isRe(name) || isTu(name);
    }

    public static boolean isNgWriteTable(String name)
    {
        for (StationNgWrite stationNgWrite:StationNgWrite.values())
        {
            return name.equals(stationNgWrite.getName());
        }
        return false;
    }

}
