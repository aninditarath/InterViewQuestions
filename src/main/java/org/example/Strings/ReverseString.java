package org.example.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

    public static void reverseString(char[] s) {

        List<Character>reverse = new ArrayList<>(s.length);
        char temp=0;
        int i=0; int j =s.length-1;

        while(i<j){

          temp= s[i];
          s[i]=s[j];
          s[j]=temp;
          i++;
          j--;
//
//          if(i==j){
//
//              break;
//          }

        }

        for(int o=0; o<s.length;o++){

            System.out.print("\"" +s[o] + "\""+ "," );
        }


        //System.out.println(Arrays.asList(reverse).toString());

    }
}
