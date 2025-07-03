package org.practice.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOftwoArrayReturnArray {

    public static int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer,Integer>mapp = new HashMap<>();

        for(int i=0; i < nums1.length; i++){

            if(mapp.containsKey(nums1[i])){
                mapp.put(nums1[i],mapp.get(nums1[i])+1);
            }
            else {
                mapp.put(nums1[i],1);
            }
        }

        for(int i=0; i < nums2.length; i++){

            if(mapp.containsKey(nums2[i])){
                mapp.put(nums2[i],mapp.get(nums2[i])+1);
            }
            else {
                mapp.put(nums2[i],1);
            }
        }

        List<Integer> integerlist= new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry: mapp.entrySet()){

            if(entry.getValue()>1){
                integerlist.add( entry.getKey());

            }

        }

        int[] intarrayvalues = new int[integerlist.size()];
        for (int i = 0; i < integerlist.size(); i++)
            intarrayvalues[i] = integerlist.get(i);
        System.out.println("Array elements:");
        for (int s : intarrayvalues) {
            System.out.println(s);
        }
         return  intarrayvalues;
    }
}
