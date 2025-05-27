package org.practice.Dynamicproblem;

public class AddnumberasStrings {

    public static String addStrings(String num1, String num2) {

       /* Input: num1 = "11", num2 = "123"
        Output: "134"*/
//
//        int sum=0;
//
//        sum = Integer.parseInt(num1)+Integer.parseInt(num2);
//
//        return String.valueOf(sum);

        StringBuilder sb = new StringBuilder();
        int i=num1.length()-1;

        int j= num2.length()-1;

        int carry=0;

        while (i>=0 || j>=0 || carry > 0){

            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1+digit2+carry;
            carry = sum / 10;
            sb.append(sum%10);

            i--;
            j--;


        }
     return sb.reverse().toString();
    }
}
