package com.smartflow.util;

public class StationUtil {

    public static String getIMLastStationName(String linkTableName) {
        switch (linkTableName) {
            case "CL_IMOP80"://IM_OP80
                return "CL_IMOP75";
            case "CL_IMOP70B"://IM_OP72
                return "CL_IMOP70A";
            case "CL_IMOP70A"://IM_OP70
                return "CL_IMOP67";
            case "CL_IMOP67"://IM_OP67
                return "CL_IMOP75";
            case "CL_IMOP75"://IM_OP75
                return "CL_IMOP60";
            case "CL_IMOP60"://IM_OP60
                return "CL_IMOP50";
            case "CL_IMOP50"://IM_OP50
                return "CL_IMOP45";
            case "CL_IMOP45"://IM_OP45
                return "CL_IMOP40";
            case "CL_IMOP40"://IM_OP40
                return "CL_IMOP30";
            case "CL_IMOP30"://IM_OP30
                return "CL_IMOP25";
            case "CL_IMOP25"://IM_OP25
                return "CL_IMOP10";
            case "CL_IMOP10"://IM_OP10
                return "CL_IMOP10";
        }
        return linkTableName;
    }
}
