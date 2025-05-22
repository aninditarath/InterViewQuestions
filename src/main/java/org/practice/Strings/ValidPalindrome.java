package org.practice.Strings;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {



        if(s.length()==0){
            return false;
        } else if (s.length()==1) {
            return true;

        }
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
        String newval= s.toLowerCase().trim().replaceAll("[^a-z0-9]", "");
        
        StringBuilder reverse = new StringBuilder();
        
        
        for(int i=newval.length()-1;i>=0;i--){
            
            reverse.append(newval.charAt(i));
            
        }

        if(!reverse.toString().equals(newval)){

            return false;

        }
     return true;
    }
}
