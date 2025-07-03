package org.practice.Arrays;

import java.util.*;

public class IntersectionArrays {

    public static int[]  findcommon(int[]nums1,int[]nums2){

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        int[] output = new int[result.size()];
        int index = 0;
        for (int num : result) {
            output[index++] = num;
        }
  for(int k : output){
      System.out.println(k);
  }
        return output;
//import java.util.*;
//
//        public class IntersectionArrays {
//
//            public static void findCommon(int[] nums1, int[] nums2) {
//                Arrays.sort(nums1);
//                Arrays.sort(nums2);
//
//                int i = 0, j = 0;
//                Set<Integer> result = new HashSet<>();
//
//                while (i < nums1.length && j < nums2.length) {
//                    if (nums1[i] == nums2[j]) {
//                        result.add(nums1[i]);
//                        i++;
//                        j++;
//                    } else if (nums1[i] < nums2[j]) {
//                        i++;
//                    } else {
//                        j++;
//                    }
//                }
//
//                for (int val : result) {
//                    System.out.println(val);
//                }
//            }
//
//            public static void main(String[] args) {
//                int[] a = {1, 2, 2, 3, 4};
//                int[] b = {2, 2, 4, 6};
//
//                findCommon(a, b);
//            }
//        }

    }
}
