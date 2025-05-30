package org.practice.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {


        Set<Integer> sett= new HashSet<>();

        for(int p=0;p<nums.length;p++){

            if(!sett.contains(nums[p])){

                sett.add(nums[p]);
            }
            else {
                return true;
            }


        }
        return false;

    }




}
