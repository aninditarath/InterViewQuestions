package org.example.Strings;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {


        int MAX_CHAR=26;

        if(s.length()==0 || t.length()==0){

            return false;
        }
        int[] freq = new int[MAX_CHAR];

        // Count frequency of each character in string s1
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;

        // Count frequency of each character in string s2
        for (int i = 0; i < t.length(); i++)
            freq[t.charAt(i) - 'a']--;

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }
}
