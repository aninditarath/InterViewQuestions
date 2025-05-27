package org.practice.Strings;

import java.util.HashMap;

public class LongestpalindromFromAllCharacters {

    public static int longestPalindrome(String s) {

        HashMap<Character,Integer> mapp= new HashMap<>();
        int oddcount=0;
        int length=0;
        for(int i=0; i <s.length(); i++){

            if(!mapp.containsKey(s.charAt(i))){

                mapp.put(s.charAt(i),1);
            }
            else {

                mapp.put(s.charAt(i),mapp.get(s.charAt(i))+1);
            }
            if(mapp.get(s.charAt(i))%2!=0){
                oddcount++;
            }
            else {
                oddcount--;
            }


        }


        if (oddcount > 1)
            return s.length() - oddcount + 1;
        return s.length();

    }
}
