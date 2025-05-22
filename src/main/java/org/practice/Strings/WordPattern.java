package org.practice.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        String[] newpattern = s.split(" ");

        Map<Character, String> map1= new LinkedHashMap<>();

        Map<String,Character> map2= new LinkedHashMap<>();

        for(int i=0; i <newpattern.length;i++){

            if(!map1.containsKey(pattern.charAt(i))){

                map1.put(pattern.charAt(i),newpattern[i]);
            }

            if(!map2.containsKey(newpattern[i])){

                map2.put(newpattern[i],pattern.charAt(i));
            }


            if(!map1.get(pattern.charAt(i)).equals(map2.get(newpattern[i])) && map2.get(newpattern[i]).equals(map1.get(pattern.charAt(i)))){

                return false;
            }
        }



        return true;

    }
}
