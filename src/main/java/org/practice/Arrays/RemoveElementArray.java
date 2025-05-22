package org.practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementArray {

    public static int removeElement(int[] nums, int val) {

        List<Integer> newArray= new ArrayList<>();
        int count=0;
        for (int i = 0; i < nums.length; i++) {


            if (nums[i] != val) {
                newArray.add(nums[i]);
                count++;

            }
        }

        Arrays.sort(newArray.toArray());
        System.out.println(Arrays.toString(newArray.toArray()));

        return count;
    }



}
