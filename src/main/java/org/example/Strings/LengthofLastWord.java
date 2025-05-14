package org.example.Strings;

public class LengthofLastWord {

//    Input: s = "   fly me   to   the moon  "
//    Output: 4
//    Explanation: The last word is "moon" with length 4.

    public static int lengthofword(String sentence){

        if(sentence==null){

            return 0;

        } else if (sentence.length()==1) {
            return 1;
        }

        String [] newsentence= sentence.trim().split(" ");
         int length =0;
        for(int i =0; i < newsentence.length;i++){

            if(i==newsentence.length-1){
                length = newsentence[i].length();

            }
        }

        return length;
    }
}
