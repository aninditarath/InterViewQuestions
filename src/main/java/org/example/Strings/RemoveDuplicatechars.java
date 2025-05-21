package org.example.Strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatechars {
    public static String removeDuplicateLetters(String s) {

        Set<Character> sett= new HashSet<>();

        for(int i=0;i <s.length();i++){

            if (!sett.contains(s.charAt(i))){
                sett.add(s.charAt(i));
            }
            else {

                sett.add('_');
            }
        }

        StringBuilder str= new StringBuilder();
        for(char c: sett){

            if(c!='_'){
                str.append(c);
            }
        }
return str.toString();
    }
}
