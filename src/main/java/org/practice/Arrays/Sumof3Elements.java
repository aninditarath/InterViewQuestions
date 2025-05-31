package org.practice.Arrays;

import java.util.*;

public class Sumof3Elements {

    public static List<List<Integer>> threeSum(int[] nums) {


        //int[] arr = {1, 2, 3, -1, 0, 4, -4, 5, -5, 10, 12, -22};
        int[] arr={-1,0,1,2,-1,-4};
        int target = 0;


        List<List<Integer>> listt = new ArrayList<>();

//
       Arrays.sort(arr);
//        int i = arr[0];


        for (int k = 0; k < arr.length; k++) {
            int start = 1;
            int end = arr.length - 1;
            while (start < end) {

                int sum = arr[start] + arr[end] + arr[k];

                if (sum > target) {
                    end--;
                } else if (sum < target) {
                    start++;
                } else if (sum == target) {

//                   // System.out.println(arr[start] + " and " + arr[end] +" and "+ arr[k]);
                    listt.add(Arrays.asList(nums[k], nums[start], nums[end]));

                    // Skip duplicates for start and end
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;

                    start++;
                    end--;

                    start++;
                    end--;
                } else {

                    System.out.println("no pairs ");
                }

            }
        }

        return listt;
    }

}
