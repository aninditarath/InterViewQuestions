package org.practice.Arrays;

import java.util.Arrays;

public class MedianTwoSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a=nums1.length;
        int b=nums2.length;
        int c=a+b;
        int[]nums3=new int[c];
        for(int i=0;i<a;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0;i<b;i++){
            nums3[a+i]=nums2[i];
        }
        Arrays.sort(nums3);
        if(c%2==0){
            return(nums3[c / 2 - 1] + nums3[c / 2]) / 2.0;
        }
        if(c%2!=0){
            return(nums3[c/2]);
        }
        return 0.0;
    }


}
