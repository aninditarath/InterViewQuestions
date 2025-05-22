package org.practice.Dynamicproblem;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

    /*    Input: nums = [0,1]

        Output: 2

        Explanation:

        n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
        2 is the missing number in the range since it does not appear in nums.*/

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;

    }


}
