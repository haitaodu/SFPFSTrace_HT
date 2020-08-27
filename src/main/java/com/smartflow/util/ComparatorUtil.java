package com.smartflow.util;

import com.smartflow.dto.TableHeaderDTO;

import java.util.Comparator;

public class ComparatorUtil implements Comparator<TableHeaderDTO> {
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
    public int compare(TableHeaderDTO h1, TableHeaderDTO h2) {
        char[] a = h1.getDataIndex().toCharArray();
        char[] b = h2.getDataIndex().toCharArray();
        if (a != null || b != null) {
            Int aNonzeroIndex = new Int();
            Int bNonzeroIndex = new Int();
            int aIndex = 0, bIndex = 0,
                    aComparedUnitTailIndex, bComparedUnitTailIndex;


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
    //    @Override
//    public int compare(Object o1, Object o2) {
//        String s1 = (String)o1;
//        String s2 = (String)o2;
//        if(s1.charAt(0) > s2.charAt(0)){
//            return 1;
//        }else if(s1.charAt(0) < s2.charAt(0)){
//            return -1;
//        }else{
//            //The alphanumeric section 字母数字部分
//            String alphabet1 = s1.replaceAll("\\d+$", "");
//            String alphabet2 = s2.replaceAll("\\d+$", "");
//            //If you don't want to case_sensitive, or compareTo
//            int cmpAlphabet = alphabet1.compareToIgnoreCase(alphabet2);
//            if(cmpAlphabet != 0){
//                return cmpAlphabet;
//            }
//            //Digital section
//            String numeric1 = s1.replaceAll("^[a-zA-Z]+", "");
//            String numeric2 = s1.replaceAll("^[a-zA-Z]+", "");
//            if("".equals(numeric1)){
//                /* Event if the numeric2 is the empty string also does not matter, of course,
//                 if the comparison is not String (or other immutable objects) is another matter*/
//                return -1;
//            }
//            if("".equals(numeric2)){
//                return 1;
//            }
//            int result = Integer.parseInt(numeric1) - Integer.parseInt(numeric2);
//            return result;
//        }
//    }
}
