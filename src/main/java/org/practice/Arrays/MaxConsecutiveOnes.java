package org.practice.Arrays;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max=0;
        int maxvalue=0;

        for(int i=0; i <nums.length;i++){


            if(nums[i]==1){
                maxvalue++;
                max = Math.max(max, maxvalue);
            }
            else {
                maxvalue=0;
            }
        }

        return max;
    }



}
