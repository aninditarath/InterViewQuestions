package org.practice.Dynamicproblem;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

//    The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//
//    F(0) = 0, F(1) = 1
//    F(n) = F(n - 1) + F(n - 2), for n > 1.


    public static int fib(int n) {




        List<Integer> fibo= new ArrayList<>();
        fibo.add(0,0);
        fibo.add(1,1);

        if(n==1) return 1;

        for(int i =2; i <=30;i++ ){

            int val= fibo.get(i-1)+ fibo.get(i-2);
           fibo.add(val);


        }


        System.out.println(fibo);
        int sum=0;
        if(n<fibo.size() && n>0){

             sum= fibo.get(n-1)+fibo.get(n-2);
        }
   return sum;
    }

}
