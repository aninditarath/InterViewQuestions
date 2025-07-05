package org.practice.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        String[] newpattern = s.split(" ");

        Map<Character, String> map1= new LinkedHashMap<>();

        Map<String,Character> map2= new LinkedHashMap<>();

        for (int i = 0; i < newpattern.length; i++) {
            char c = pattern.charAt(i);
            String word = newpattern[i];

            if (map1.containsKey(c)) {
                if (!map1.get(c).equals(word)) return false;
            } else {
                map1.put(c, word);
            }

            if (map2.containsKey(word)) {
                if (map2.get(word) != c) return false;
            } else {
                map2.put(word, c);
            }
        }

        return true;

    }
}
