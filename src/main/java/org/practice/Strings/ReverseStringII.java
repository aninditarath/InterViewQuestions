package org.practice.Strings;

public class ReverseStringII {
//    Input: s = "abcdefg", k = 2
//    Output: "bacdfeg"
    public static String reverseStr(String s, int k) {

        String newstr= s.substring(0,k);

        StringBuilder sbr= new StringBuilder(newstr);
        sbr.reverse();


        String value= sbr.toString()+s.substring(k,s.length());


        return value;
    }

}
