package org.example.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] newarray= new int[m+n];
        int j=0;
        for(int i=0; i <m+n; i++){

            while( m<m+n){
                newarray [i]= nums1[i];
                m--;
            }
            while( n<m+n){
                newarray [i]= nums2[n];
                n--;
            }

        }

    }
}
