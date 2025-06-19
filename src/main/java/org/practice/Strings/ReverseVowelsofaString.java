package org.practice.Strings;

public class ReverseVowelsofaString {

//    Input: s = "IceCreAm"
//
//    Output: "AceCreIm"
    public static String reverseVowels(String s) {
        char[] str = s.toCharArray();

        int i = 0;
        int j = str.length - 1;

        while (i < j) {
            while (i < j && !checkVowel(str[i])) i++;
            while (i < j && !checkVowel(str[j])) j--;

            // swap

            char ch = str[i];
            str[i++] = str[j];
            str[j--] = ch;
        }

        return new String(str);
    }

    public static boolean checkVowel(char Char){
        return (Char == 'a' || Char == 'A')
                || (Char == 'e' || Char == 'E')
                || (Char == 'i' || Char == 'I')
                || (Char == 'o' || Char == 'O')
                || (Char == 'u' || Char == 'U');
    }
}
