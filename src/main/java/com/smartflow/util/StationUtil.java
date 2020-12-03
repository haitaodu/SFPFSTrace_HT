package com.smartflow.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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


    public static List<String> sortList(){
        String[] strArray = new String[]{"DB48_DBD4","DB48_DBD16","DB48_DBD20","DB48_DBD24","DB48_DBD28","DB48_DBD12","DB48_DBD32","DB48_DBD344","DB48_DBD348","DB48_DBD352","DB48_DBD356","DB48_DBD36","DB48_DBD360","DB48_DBD40","DB48_DBD44","DB48_DBD8","DB48_DBD86","DB48_DBW342","DB48_DBW364","DB49_DBX126_0","DB49_DBX168_0","DB49_DBX210_0","DB49_DBX252_0","DB49_DBX42_0","DB49_DBX84_0"};
        List<String> stringList = Arrays.asList(strArray);
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(o1.substring(0,7));
                System.out.println(o1.substring(8, o1.length()));
                System.out.println("=============================================");
                System.out.println(o2.substring(0,7));
                System.out.println(o2.substring(8, o2.length()));
                //comparator 大于返回1，小于返回-1，等于返回0
//               return (o1.substring(0,7).compareTo(o2.substring(0,7)) == 1 && o1.substring(8, o1.length()-1).compareTo(o2.substring(8,o2.length()-1)) == 1 )? 1 : -1;
                return o1.substring(8, o1.length()).compareTo(o2.substring(8,o2.length()));
            }
        });
        return stringList;
    }

    public static List<String> getFilterStartsWithCondition(){
        List<String> list = new ArrayList<>();
        list.add("M1");
        list.add("M2");
        list.add("M3");
        list.add("M5");
        list.add("M6");
        list.add("M7");
        list.add("MES_EM16");
        list.add("Q8");
        list.add("DB7.DBX");
        list.add("DB12_DBX580_");
        list.add("DB13_DBX944_");
        list.add("DB167_DBX");
        list.add("DB1670.DBX5");
        list.add("DB100_DBX5");
        list.add("DB10_DBX1828");
        list.add("DB180_DBX");
        list.add("DB17_DBX778");
        list.add("DB200_DBX5");
        list.add("DB20_DBX");
        list.add("DB407_DBX6");
        list.add("DB9_DBX1590_");
        list.add("DB56_DBX378");

        list.add("M49");
        list.add("M9");
        //list.add("DB100_DBX10");//DB100_DBX10_0：相机检测结果
        list.add("DB100_DBX360");
        list.add("DB110_DBX");
        list.add("DB126_DBX");
        list.add("DB127_DBX");
        list.add("DB14_DBX18");
        list.add("DB2_DBW3");
        list.add("DB400_DBX3");
        list.add("ALARM");

        list.add("DB2000_DBW");
        list.add("DB2000_DBX1");
        list.add("DB500_DBX");
        list.add("DB100_DBX80");
        list.add("DB14_DBW");
//        list.add("DB1670.DBX5");
//        list.add("DB7.DBX");
//        list.add("DB167_DBX3");
        list.add("MES_STATUS");
        list.add("DB64_DBX");
        list.add("IW4");
        list.add("DB182_DBX");
        list.add("DB37_DBX1_2");
        list.add("DB37_DBX3_2");

        list.add("DB10_DBW");
        list.add("DB10_DBX6");
        list.add("DB10_DBX7");
        list.add("DB10_DBX8");
        list.add("DB10_DBX9");
        list.add("MES_SCAN");
        list.add("MES_CUT");
        list.add("DB11_INT");
        list.add("DB11_REAL");
        list.add("DB11_X");
        list.add("DB100_REAL");
        list.add("QW8");
        list.add("MD2");
      return list;
    }
    public static List<String> getFilterEqualsCondition(){
        List<String> list = new ArrayList<>();
        list.add("DB48_DBW364");

        //list.add("M620.3");
        list.add("M620_3");
        list.add("IB404");
        list.add("IB504");
        list.add("DB167_DBW378");
        list.add("DB167_DBW380");

        list.add("DB100_DBX0_0");
        list.add("DB100_DBX580_0");
        list.add("DB14_DBX178_0");
        list.add("M100_3");
        list.add("M10_0");
        list.add("IS_ALARM");
        list.add("DB48_DBD40");//TU_OP20不显示该字段（测试结果(1=OK,2=NG)）0=NG，1=OK

        list.add("DB14_DBD28");
        list.add("DB100_DB284");

        list.add("MES_ERR");
        list.add("MES_MODE");
        list.add("MES_READ");
        list.add("MES_RESULT");//? 平衡加工结果 1超量/2合格/3不合
        list.add("IB404");
        list.add("DB167_DBD368");
        list.add("DB167_DBD372");
        list.add("DB167_DBD376");
        list.add("DB2000_DB12");

        //TUOP50
        list.add("DB1_DBD8");
        list.add("DB1_DBD12");
        list.add("DB10_DBD1830");
        list.add("DB10_DBD1834");
        list.add("DB10_DBX778_0");
        list.add("DB10_DBX694_0");
        list.add("DB10_DBX84_0");
        list.add("DB10_DBX652_0");
        list.add("DB10_DBX736_0");

        list.add("DB100_DBD0_40");
        list.add("DB100_DBD40_40");
        list.add("DB100_DBX328_0");
        list.add("DB13_DBX676_0");
        list.add("DB15_SINT46");//二维码长度
        list.add("QR_CODE");
        return list;
    }

    public static void main(String[] args) {

        // TODO Auto-generated method stub
//        String fileNames[] = { "fss01", "fss2", "fss01_22", "fss3", "fss1", "fss10", "fss20", "fss4", "fss30", "fss21", "fss12","fss01_3" };
//        String[] fileNames = new String[]{"DB48_DBD4","DB48_DBD16","DB48_DBD20","DB48_DBD24","DB48_DBD28","DB48_DBD12","DB48_DBD32","DB48_DBD344","DB48_DBD348","DB48_DBD352","DB48_DBD356","DB48_DBD36","DB48_DBD360","DB48_DBD40","DB48_DBD44","DB48_DBD8","DB48_DBD86","DB48_DBW342","DB48_DBW364","DB49_DBX126_0","DB49_DBX168_0","DB49_DBX210_0","DB49_DBX252_0","DB49_DBX42_0","DB49_DBX84_0"};
//
//        char chFileNames[][] = new char[fileNames.length][];
//        String[] oldSortedNames = new String[fileNames.length];
//        for (int i = 0; i < fileNames.length; i++) {
//            chFileNames[i] = fileNames[i].toCharArray();
//            oldSortedNames[i] = fileNames[i];
//        }
//
//        // Arrays.sort(fileNames, StrLogicCmp);
//        Arrays.sort(chFileNames, ChsLogicCmp);
//        System.out.println("_Random_" + "\t" + "_Tradion_" + "\t" + "_Target_");
//        String line;
//        for (int i = 0; i < fileNames.length; i++) {
//            line = fileNames[i] + (fileNames[i].length() >= 8 ? "\t" : "\t\t");
//            line += oldSortedNames[i] + (oldSortedNames[i].length() >= 8 ? "\t" : "\t\t");
//            line += new String(chFileNames[i]);
//            System.out.println(line);
//        }
        String[] filedNames = new String[]{"DB48_DBD4","DB48_DBD16","DB48_DBD20","DB48_DBD24","DB48_DBD28","DB48_DBD12","DB48_DBD32","DB48_DBD344","DB48_DBD348","DB48_DBD352","DB48_DBD356","DB48_DBD36","DB48_DBD360","DB48_DBD40","DB48_DBD44","DB48_DBD8","DB48_DBD86","DB48_DBW342","DB48_DBW364","DB49_DBX126_0","DB49_DBX168_0","DB49_DBX210_0","DB49_DBX252_0","DB49_DBX42_0","DB49_DBX84_0"};
        getTargetSortString(filedNames);

    }

    public static char[][] getTargetSortString(String[] filedNames){
        char chFileNames[][] = new char[filedNames.length][];
        String[] oldSortedNames = new String[filedNames.length];
        for (int i = 0; i < filedNames.length; i++) {
            chFileNames[i] = filedNames[i].toCharArray();
            oldSortedNames[i] = filedNames[i];
        }

        // Arrays.sort(fileNames, StrLogicCmp);
        Arrays.sort(chFileNames, ChsLogicCmp);
        System.out.println("_Target_");
        String line;
        for (int i = 0; i < filedNames.length; i++) {
            line =new String(chFileNames[i]);
            System.out.println(line);
        }
        return chFileNames;

    }

    static Comparator<String> StrLogicCmp = new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
            // TODO Auto-generated method stub
            return 0;
        }

    };

    // "f01s2s22", "f1s02s2"
    public static Comparator<char[]> ChsLogicCmp = new Comparator<char[]>() {
        class Int {
            public int i;
        }

        public int findDigitEnd(char[] arrChar, Int at) {
            int k = at.i;
            char c = arrChar[k];
            boolean bFirstZero = (c == '0');
            while (k < arrChar.length) {
                c = arrChar[k];
                //first non-digit which is a high chance.
                if (c > '9' || c < '0') {
                    break;
                } else if (bFirstZero && c == '0') {
                    at.i++;
                }
                k++;
            }
            return k;
        }

        @Override
        public int compare(char[] a, char[] b) {
            if (a != null || b != null) {
                Int aNonzeroIndex = new Int();
                Int bNonzeroIndex = new Int();
                int aIndex = 0, bIndex = 0,
                        aComparedUnitTailIndex, bComparedUnitTailIndex;

//              Pattern pattern = Pattern.compile("D*(d+)D*");
//              Matcher matcher1 = pattern.matcher(a);
//              Matcher matcher2 = pattern.matcher(b);
//              if(matcher1.find() && matcher2.find()) {
//                  String s1 = matcher1.group(1);
//                  String s2 = matcher2.group(1);
//              }

                while (aIndex < a.length && bIndex < b.length) {
                    //aIndex <
                    aNonzeroIndex.i = aIndex;
                    bNonzeroIndex.i = bIndex;
                    aComparedUnitTailIndex = findDigitEnd(a, aNonzeroIndex);
                    bComparedUnitTailIndex = findDigitEnd(b, bNonzeroIndex);
                    //compare by number
                    if (aComparedUnitTailIndex > aIndex && bComparedUnitTailIndex > bIndex) {
                        int aDigitIndex = aNonzeroIndex.i;
                        int bDigitIndex = bNonzeroIndex.i;
                        int aDigit = aComparedUnitTailIndex - aDigitIndex;
                        int bDigit = bComparedUnitTailIndex - bDigitIndex;
                        //compare by digit
                        if (aDigit != bDigit)
                            return aDigit - bDigit;
                        //the number of their digit is same.
                        while (aDigitIndex < aComparedUnitTailIndex) {
                            if (a[aDigitIndex] != b[bDigitIndex])
                                return a[aDigitIndex] - b[bDigitIndex];
                            aDigitIndex++;
                            bDigitIndex++;
                        }
                        //if they are equal compared by number, compare the number of '0' when start with "0"
                        //ps note: paNonZero and pbNonZero can be added the above loop "while", but it is changed meanwhile.
                        //so, the following comparsion is ok.
                        aDigit = aNonzeroIndex.i - aIndex;
                        bDigit = bNonzeroIndex.i - bIndex;
                        if (aDigit != bDigit)
                            return aDigit - bDigit;
                        aIndex = aComparedUnitTailIndex;
                        bIndex = bComparedUnitTailIndex;
                    } else {
                        if (a[aIndex] != b[bIndex])
                            return a[aIndex] - b[bIndex];
                        aIndex++;
                        bIndex++;
                    }

                }

            }
            return a.length - b.length;
        }
    };
}
