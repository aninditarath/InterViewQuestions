package org.practice.Arrays;

import java.util.*;

public class SingleNumber {

    public static int singleNumber(int[] nums) {


        HashMap<Integer,Integer> mapp= new HashMap<>();
        for(int i=0; i <nums.length; i++){

            if(!mapp.containsKey(nums[i])){
                mapp.put(nums[i],1);
            }
           else {
               mapp.put(nums[i], mapp.get(nums[i])+1);
            }


        }

       for( Map.Entry<Integer,Integer> entry : mapp.entrySet()){

           if(entry.getValue()==1){

              return entry.getKey();
           }
       }


        return 0;
    }

}
