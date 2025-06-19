package org.practice.Arrays;

public class MoveZeros {
    public static int[] moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }

        for(int i=0; i <nums.length;i++){
            System.out.print(nums[i] + " ");
        }

        return nums;
    }
}
