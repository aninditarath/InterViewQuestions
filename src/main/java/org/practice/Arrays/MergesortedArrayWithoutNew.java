package org.practice.Arrays;

import java.util.Arrays;

public class MergesortedArrayWithoutNew {

//    nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
          int data = nums1.length-nums2.length;

        for(int i =0; i <n; i++ ){

            nums1[data]= nums2[i];

            data++;



        }

     Arrays.sort(nums1);

        for(int i: nums1){

            System.out.print(i+ "");
        }

        /*

        expected approach*/

//        if(n == 0)return;
//        int len1 = nums1.length;
//        int end_idx = len1-1;
//        while(n > 0 && m > 0){
//            if(nums2[n-1] >= nums1[m-1]){
//                nums1[end_idx] = nums2[n-1];
//                n--;
//            }else{
//                nums1[end_idx] = nums1[m-1];
//                m--;
//            }
//            end_idx--;
//        }
//        while (n > 0) {
//            nums1[end_idx] = nums2[n-1];
//            n--;
//            end_idx--;
//        }
//    }
    }

}


