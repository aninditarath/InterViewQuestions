package org.practice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    nums = [2,7,11,15], target = 9
//    Output: [0,1]

    public static int[] twoSum(int[] nums, int target) {

        int remain=0;


        Map<Integer,Integer> mapp= new HashMap<>();

        for(int i=0; i <nums.length; i++){

            mapp.put(nums[i],i);
        }


        for(int i=0; i < nums.length-1;i++){

            remain= target-nums[i];

            if(mapp.containsKey(remain) && mapp.get(remain)!=i){

                return new int[] {i,mapp.get(remain)};
            }
        }

        return new int[] {0,0};
    }
}
