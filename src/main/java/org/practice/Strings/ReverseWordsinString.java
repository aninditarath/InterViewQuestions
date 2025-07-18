package org.practice.Strings;

public class ReverseWordsinString {

    public static String reverseWords(String s) {

        String newstring= s.trim();
        String [] newstrarray= newstring.split("\\s+");


        StringBuilder sbr= new StringBuilder();



        for(int i= newstrarray.length-1; i>=0;i--){
            if(newstrarray[i]!=""){
            StringBuilder sbrn= new StringBuilder(newstrarray[i]);

            sbr= sbr.append(sbrn).append(" ");

            }
        }

        System.out.println(sbr);

        return sbr.toString().trim();
    }
}
