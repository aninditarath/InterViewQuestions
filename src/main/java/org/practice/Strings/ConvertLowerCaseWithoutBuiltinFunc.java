package org.practice.Strings;

public class ConvertLowerCaseWithoutBuiltinFunc {
    public static String toLowerCase(String s) {
        int len = s.length();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<len; i++){
            int asciivalue = (int)s.charAt(i);
            if(asciivalue >= 65 && asciivalue <= 90){
                asciivalue += 32;
                char a = (char)asciivalue;
                str.append(a);
            }else{
                char a = (char)asciivalue;
                str.append(a);
            }
        }
        return str.toString();
    }
}
