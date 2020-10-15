package com.smartflow.common.stationenum;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：tao
 * @date ：Created in 2020/9/3 13:26
 */

public class ParseToArray {
    private ParseToArray(){}
    private final static List<String> IM_ARRAY =new ArrayList<>();
    private final static List<String> RE_ARRAY=new ArrayList<>();
    private final  static  List<String> TU_ARRAY=new ArrayList<>();
    public static List<String> parseImStation()
    {
        for (StationNameIm stationNameIm:StationNameIm.values())
        {
            IM_ARRAY.add(stationNameIm.getName());
        }
        return IM_ARRAY;
    }

    public static List<String> parseReStation()
    {
        for (StationNameRe stationNameRe:StationNameRe.values())
        {
            RE_ARRAY.add(stationNameRe.getName());
        }
        return RE_ARRAY;
    }
    public static List<String> parseTuStation()
    {
        for (StationNameTu stationNameTu:StationNameTu.values())
        {
            TU_ARRAY.add(stationNameTu.getName());
        }
        return TU_ARRAY;
    }
}
