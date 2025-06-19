package org.practice.Strings;

public class ScoreofParentheses {

   /* Example 1:

    Input: s = "()"
    Output: 1
    Example 2:

    Input: s = "(())"
    Output: 2*/
    public static int scoreOfParentheses(String s) {

        int start=0;
        int end =0;
        for(int i=0; i <s.length();i++){

            if(s.charAt(i)==')'){
                start++;
            }
            if(s.charAt(i)=='('){

                end++;
            }

        }

        if(start==end){
            return start;
        }

        return 0;

    }

}
