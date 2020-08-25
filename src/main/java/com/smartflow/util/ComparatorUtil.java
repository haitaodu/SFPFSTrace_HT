package com.smartflow.util;

import java.util.Comparator;

public class ComparatorUtil implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        if(s1.charAt(0) > s2.charAt(0)){
            return 1;
        }else if(s1.charAt(0) < s2.charAt(0)){
            return -1;
        }else{
            //The alphanumeric section 字母数字部分
            String alphabet1 = s1.replaceAll("\\d+$", "");
            String alphabet2 = s2.replaceAll("\\d+$", "");
            //If you don't want to case_sensitive, or compareTo
            int cmpAlphabet = alphabet1.compareToIgnoreCase(alphabet2);
            if(cmpAlphabet != 0){
                return cmpAlphabet;
            }
            //Digital section
            String numeric1 = s1.replaceAll("^[a-zA-Z]+", "");
            String numeric2 = s1.replaceAll("^[a-zA-Z]+", "");
            if("".equals(numeric1)){
                /* Event if the numeric2 is the empty string also does not matter, of course,
                 if the comparison is not String (or other immutable objects) is another matter*/
                return -1;
            }
            if("".equals(numeric2)){
                return 1;
            }
            int result = Integer.parseInt(numeric1) - Integer.parseInt(numeric2);
            return result;
        }
    }
}
