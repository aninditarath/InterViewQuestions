package org.practice.Arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays {

    public static void findcommon(int[]nums1,int[]nums2){


        int n=nums1.length;
        int m=nums1.length;
        Set<Integer> data= new HashSet<>();
        int i,j=0;

        for( i=0;i<n;i++){

            while(i<n && j<m) {

                if (nums1[i] == nums2[j]) {

                    j++;
                    data.add(nums1[i]);
                }
                i++;
            }
        }

        for(int val:data){

            System.out.println(val);

        }
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
