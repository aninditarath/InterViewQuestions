package org.example.Strings;

public class FindIndexOfFirstOccur {

    public static int strStr(String haystack, String needle) {

        //Input: haystack = "sadbutsad", needle = "sad"}

        if(needle.length()>haystack.length()){
            return -1;
        }
        int count=0;
        for(int i=0; i <=haystack.length();i++){
            int j=0;
            for( j=0; j <needle.length();j++){

                if(i + j >= haystack.length()||haystack.charAt(i+j)!=needle.charAt(j)){
                    break;


                }
            }

            if(j==needle.length()){

                return i;
            }
        }


        return -1;
    }

}
