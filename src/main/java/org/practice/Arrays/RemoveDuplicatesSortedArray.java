package org.practice.Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSortedArray {

    // [1,2,2,3,3,3,4,4,5,5,5,6]

    public static int removeduplicate(int[] nums){


        Set<Integer> dataset= new LinkedHashSet<>();
        for(int i=0; i < nums.length; i++){

            dataset.add(nums[i]);

        }

        System.out.println(dataset.size());

        int inc =0;
        for( int i : dataset){

            nums[inc++]=i;
            while(inc >=dataset.size() && inc<nums.length){

                nums[inc++]=0;
            }
        }

        for(int i: nums){
            System.out.print(i + ",");
        }

        return dataset.size();
    }

}
