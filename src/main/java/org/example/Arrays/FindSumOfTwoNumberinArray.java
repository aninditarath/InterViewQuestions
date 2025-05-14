package org.example.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSumOfTwoNumberinArray {

    public static int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> Mapp = new HashMap<>();
        //{2,3,4};
        // Arrays.sort(nums);

//        for(int i=0; i <nums.length;i++){
//
//            int pair = target-nums[i];
//
//            if(Mapp.containsKey(pair)){
//
//                return new int[]{Mapp.get(pair),i};
//            }
//            Mapp.put(nums[i],i);
//        }

        for(int i=0; i < nums.length;i++){
            int data =nums[i];

            if(Mapp.containsKey(data)){
                return new int[]{Mapp.get(data),i};
            }
            Mapp.put(nums[i],i );
        }

        return new int[]{};
    }


}
