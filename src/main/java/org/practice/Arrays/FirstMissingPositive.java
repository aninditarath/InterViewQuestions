package org.practice.Arrays;

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {

        //Arrays.sort(nums);
        int temp;
         int length = nums.length;
        for(int i=0; i < nums.length-1;i++){

            for(int j=0; j<nums.length-1;j++){
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }

        }

        for(int i=0; i <nums.length;i++){

            if(nums[i]!= i+1){
                return i+1;
            }


        }


        return length;
    }
}
