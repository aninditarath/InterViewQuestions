package org.example.Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String common="";
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String val= strs[0];

        List<String> commons= new ArrayList<>();

        for(int i=1; i <strs.length; i++){

            for(int j=0; j <val.length();j++){

                if(strs[i].contains(String.valueOf(val.charAt(j)))){
                    if(!common.contains(String.valueOf(val.charAt(j)))){
                        common=common+val.charAt(j);
                    }



                }
                else{

                    break;
                }

            }

            commons.add(common);
            common="";
        }
       int data =Integer.MAX_VALUE;
        String value ="";

        if (commons.size()==0){
         return "";
        }
        for(int i=0; i <commons.size();i++){

            if(commons.get(i).length()<data){
                data=commons.get(i).length();
                value= commons.get(i);

            }

        }
        common=value;


        System.out.println(value);

        return common;
    }
}