package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstandLastPositionOfelement {

    public static int[] searchRange(int[] nums, int target) {

        List<Integer> position = new ArrayList<>();

        for(int i=0; i <nums.length;i++){

            if(nums[i]==target){

                position.add(i);
            }
        }
        int[] result = new int[position.size()];
        for (int i = 0; i < position.size(); i++) {
            result[i] = position.get(i);
        }



        if(result.length==0){

            return new int[]{-1,-1};
        }
        System.out.println(Arrays.toString(result));


        return result;


   // Alternate approch
//        int first = -1, last = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                if (first == -1) {
//                    first = i;
//                }
//                last = i;
//            }
//        }
//
//        return new int[]{first, last};


    }
}
