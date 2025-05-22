package org.practice.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {



        int[] newarray= new int[m+n];

        int i = 0,j=0;

/*This is the expected way to solve the problem*/
        int k=0;

        while(i<m && j<n){

            if(nums1[i]<nums2[j]){
                newarray[k]=nums2[i];
                i++;
                k++;
            }
            else {
                newarray[k]=nums2[j];
                j++;
                k++;

            }

        }
        while (i<m){
            newarray[k]=nums1[i];
            i++;
            k++;

        }
        while (j<n){
            newarray[k]=nums2[j];
            i++;
            j++;

        }

       /* This is the normal way to solve the problem */


//        int j=0;
//        for(int i=0; i <m+n; i++){
//
//            while( i<m) {
//                newarray[i] = nums1[i];
//                i++;
//            }
//            while( i<m+n && i>=m){
//                newarray [i]= nums2[j];
//                j++;
//                i++;
//            }
//
//        }

        for(int p:newarray){

            System.out.print(p + " ");
        }

    }
}
