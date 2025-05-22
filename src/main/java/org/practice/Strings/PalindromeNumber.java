package org.practice.Strings;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        Boolean data = true;
         int original=x;
        int reverse=0;
    while (x>0){

       int digit=  x % 10;
        reverse =reverse*10 +digit;
        x = x / 10;
    }


        return  original==reverse ;


    }
}
