package org.practice.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {

        Set<Integer> sett= new TreeSet<>();

        for(int i :nums){
            sett.add(i);
        }
        int n=sett.size();
        List<Integer> list=new ArrayList<>(sett);
        if(n>=3)
            return list.get(n-3);
        else
            return list.get(n-1);


//
//        int n = nums.size();
//        long max1 = LONG_MIN, max2 = LONG_MIN, max3 = LONG_MIN;
//
//        for (int i = 0; i < n; i++) {
//            if (max1 < nums[i]) {
//                max3 = max2;
//                max2 = max1;
//                max1 = nums[i];
//            }
//            else if (max2 < nums[i] && nums[i] != max1) {
//                max3 = max2;
//                max2 = nums[i];
//            }
//            else if (max3 < nums[i] && nums[i] != max2 && nums[i] != max1) {
//                max3 = nums[i];
//            }
//        }
//
//        return max3 == LONG_MIN ? max1 : max3;
//
//    }

    }
}
