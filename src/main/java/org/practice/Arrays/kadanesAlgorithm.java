package org.practice.Arrays;

import java.util.Map;

public class kadanesAlgorithm {

    public static int findmaxsubarray(int[] arrvalue)  {



        int maxvalue=0;
        int k=0;
        int sum=0;
        for(int i=0;i < arrvalue.length;i++){
            sum=sum+ arrvalue[i];

            maxvalue= Math.max(sum,maxvalue);
            if (sum < 0) {
                sum = 0;  // reset the sum
            }


        }
        System.out.println(maxvalue);
        return maxvalue;

    }
}
