package org.example.Strings;

import java.util.*;

public class LengthOfLongestSubstringWithoutRepeting {

    public static int lengthOfLongestSubstring( String s ){
        //abcabcbb
        //pwwkew
        //dvdf
        //ppwkewabcde
        String value="";
        int left=0; int right=0;
        int maxlength=0;
        int length=0;
        Map<Character,Integer> mapp= new LinkedHashMap<>();

 while (right<s.length()){

            if(!mapp.containsKey(s.charAt(right))){

                mapp.put(s.charAt(right), right);

                 length = right-left+1;

                maxlength=Math.max(length,maxlength);
                right++;
            }
            else{

                int prevIndex = mapp.get(s.charAt(right));
                while (left <= prevIndex) {
                    mapp.remove(s.charAt(left));
                    left++;
                }

            }


    }


        System.out.println(mapp.keySet());
        System.out.println(mapp);





        return maxlength;




















//
//         HashSet<Character> seen = new HashSet<>();
//        int left = 0, right = 0;
//        int maxLength = 0;
//        int startIndexOfMax = 0;
//
//        while (right < s.length()) {
//            char current = s.charAt(right);
//
//            if (!seen.contains(current)) {
//                seen.add(current);
//                if(right-left+1>maxLength){
//                    maxLength=right-left+1;
//                    startIndexOfMax = left;
//                }
//                right++;
//            } else {
//                seen.remove(s.charAt(left));
//                left++;
//            }
//        }
//
//
//        System.out.println(s.substring(startIndexOfMax, startIndexOfMax + maxLength));
//        return maxLength;

  }

}
