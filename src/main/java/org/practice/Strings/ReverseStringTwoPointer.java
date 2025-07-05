package org.practice.Strings;

public class ReverseStringTwoPointer {

    public static void reverseString(char[] s) {

        int start=0;
        int end =s.length-1;

        while (start<end){
            swapchar(s,start,end);
            start++;
            end--;
        }

        System.out.println(s);

    }

    public static void swapchar(char[]s,int start,int end){
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;


    }


}
