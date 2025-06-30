package org.practice.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDissaperedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {


        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!seen.contains(i)) {
                result.add(i);
            }
        }

        for(int i=0; i <result.size();i++){
            System.out.println(result.get(i));
        }

        return result;
    }
}
