package org.practice.LeetCodeChallange;

public class GenerateTagForVideo {
//
//    Input: caption = "Leetcode daily streak achieved"
//
//    Output: "#leetcodeDailyStreakAchieved"


    public static String generatetag(String caption){


        //String removespaces= tag.replace(" ","");

        if (caption == null || caption.trim().isEmpty()) return "#";

        String[] words = caption.trim().split("\\s+");
        StringBuilder builderstring = new StringBuilder("#");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            if (word.isEmpty()) continue;

            String transformed;
            if (i == 0) {
                transformed = word; // fully lowercase
            } else {
                transformed = Character.toUpperCase(word.charAt(0)) +
                        (word.length() > 1 ? word.substring(1) : "");
            }

            // Enforce 100-character limit including #
            if (builderstring.length() + transformed.length() > 100) {
                int remaining = 100 - builderstring.length();
                builderstring.append(transformed.substring(0, Math.max(0, remaining)));
                break;
            } else {
                builderstring.append(transformed);
            }
        }

        return builderstring.toString();
    }

}
