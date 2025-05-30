package org.practice.Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        //Input: nums = [100,4,200,1,3,2]
        //Output: 4

        Set<Integer> data = new TreeSet<>();

        for(int i: nums){
            data.add(i);
        }

        int longestStreak = 0;

        for (int num : data) {
            // Only start counting if it's the beginning of a sequence
            if (!data.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (data.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }


}
