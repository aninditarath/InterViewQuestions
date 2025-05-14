package org.example.Arrays;

public class MaximumAverageSubarray {

    public static double  findmaxavaerage(int[] data, int val){

   //[1,3,4,-5,6,-9.8,10,11,12]
        int i=0, j=0;

        int sum=0;

        for( i=0; i <val; i++){

             sum += data[i];
        }
        int maxSum = sum;
        for(i=val ; i <data.length;i ++){

            sum= sum+ data[i];

            sum= sum - data[i-val];

            maxSum=Math.max(sum,maxSum);

        }

    return (double)maxSum/val;
    }
}
