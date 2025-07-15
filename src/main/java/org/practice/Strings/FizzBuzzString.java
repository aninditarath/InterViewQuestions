package org.practice.Strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzString {

    public static List<String> fizzBuzz(int n) {


        List<String> values= new ArrayList<>();

        for(int i =1;i<=n; i++){

            if (i % 3 == 0 && i % 5 == 0) {
                values.add("FizzBuzz");
            } else if (i % 3 == 0) {
                values.add("Fizz");
            } else if (i % 5 == 0) {
                values.add("Buzz");
            } else {
                values.add(String.valueOf(i));
            }
        }

        for (int i=0; i < values.size();i++){
            System.out.print(values.get(i)+ " ");
        }


        return values;
    }


}
