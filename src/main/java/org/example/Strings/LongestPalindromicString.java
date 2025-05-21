package org.example.Strings;

public class LongestPalindromicString {


    public static String findlongeststring(String s){

        //babad

        String substring = null;
        int n = s.length();
        if (n < 2) return s;

        int maxLen = 1;
        int start = 0;

        for (int i=0; i <s.length();i++) {
            int left = i, right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLen) {
                    start = left;
                    maxLen = right - left + 1;
                }
                left--;
                right++;
            }

            // Even-length palindrome
            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLen) {
                    start = left;
                    maxLen = right - left + 1;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLen);
    }
}
