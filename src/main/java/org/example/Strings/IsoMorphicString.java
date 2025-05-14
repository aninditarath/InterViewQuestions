package org.example.Strings;

import java.util.*;
import java.util.stream.Collectors;

public class IsoMorphicString {

    public static boolean isIsomorphic(String s, String t) {


        int l1= s.length();
        int l2= t.length();

        Map<Character,Character> map1= new HashMap<Character,Character>();
        Map<Character,Character> map2= new HashMap<Character,Character>();


   // String s="badc";String t= "baba";
        if(l1!=l2){

            return false;
        }

        for(int i=0; i <s.length();i++){

            if(map1.containsKey(s.charAt(i))) {


                if (map1.get(s.charAt(i)) != t.charAt(i)) {

                    return false;

                }
            }
            map1.put(s.charAt(i),t.charAt(i));

        }

        for(int i=0; i <t.length();i++){

            if(map2.containsKey(t.charAt(i))) {


                if (map2.get(t.charAt(i)) != s.charAt(i)) {

                    return false;

                }
            }
            map2.put(t.charAt(i),s.charAt(i));

        }



//        for(int i=0; i <l1; i++){
//
//            if(mapp.containsKey(s.charAt(i))){
//                if(mapp.get(s.charAt(i))!=(t.charAt(i))){
//                    return false;
//                }
//            }
//
//            else{
//               // char c= mapp.get(s.charAt(i));
//                if(mapp.get(s.charAt(i))!=(t.charAt(i))){
//                    return false;
//                }
//
//
//            }
//            mapp.put(s.charAt(i),t.charAt(i));

      //  }
        return true;
//        //boolean isIsomorph=false;
//        HashMap<Integer,Character> map1= new HashMap<>();
//        HashMap<Integer,Character> map2= new HashMap<>();
//        if(l1!=l2){
//            return false;
//        }
//        for(int i=0; i <l1; i++){
//
//
//            map1.put(i,s.charAt(i));
//            map2.put(i,t.charAt(i));
//        }
//
//        for(int i=1;i<l1;i++){
//            char ch1=s.charAt(i);
//            char ch2=t.charAt(i);
//
//            boolean flag1=false;
//            boolean flag2=false;
//
//            if(ch1==s.charAt(i-1)){
//                flag1=true;
//            }else{
//                flag1=false;
//            }
//            if(ch2==t.charAt(i-1)){
//                flag2=true;
//            }else{
//                flag2=false;
//            }
//
//            if(flag1==flag2){
//                continue;
//            }else{
//                return false;
//            }
//        }
//
//
//
//        //return true;
//
//
//        HashMap<Character,Integer> map3= new HashMap<>();
//        for(int i=0; i <l2; i++){
//
//            if(map3.containsKey(s.charAt(i))){
//                map3.put(s.charAt(i), map3.get(s.charAt(i))+1);
//            }else {
//                map3.put(s.charAt(i), 1);
//            }
//        }
//        HashMap<Character,Integer> map4= new HashMap<>();
//        for(int i=0; i <l2; i++){
//
//            if(map4.containsKey(t.charAt(i))){
//                map4.put(t.charAt(i), map4.get(t.charAt(i))+1);
//            }else {
//                map4.put(t.charAt(i), 1);
//            }
//        }
//        System.out.println(map3.values());
//        System.out.println(map4.values());
//        List<Integer>c1=new ArrayList<>(map3.values());
//        List<Integer>c2=new ArrayList<>(map4.values());
//       /* if(Collections.sort(new ArrayList<Integer>(map3.values())).equals(Collections.sort(new ArrayList<Integer>(map4.values())))){
//            return true;
//        }*/
//
//        Collections.sort(c1);
//        Collections.sort(c2);
//
//        System.out.println(c1);
//        System.out.println(c2);
//
//        if(c1.equals(c2)){
//            return true;
//        }
//        return false;




    }


}
