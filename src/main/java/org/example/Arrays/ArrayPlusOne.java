package org.example.Arrays;

import java.math.BigInteger;

public class ArrayPlusOne {

    public static int[] plusOne(int[] digits) {

        //int[] data = new int[Integer.MAX_VALUE];;


        StringBuilder temp = new StringBuilder();

        for(int i=0; i <digits.length;i++){

            temp = temp.append(digits[i]) ;

        }
        BigInteger number = new BigInteger(temp.toString());
        number = number.add(BigInteger.ONE);

        String str = number.toString();

        int [] finaldata = new int[str.length()];
        for(int i=0; i <str.length();i++){
            char ch = str.charAt(i);
            finaldata[i]=  ch - '0';
            System.out.print(finaldata[i]);
        }

        //System.out.println(Integer.parseInt(String.valueOf(temp))+1);

        return finaldata;
    }
}
