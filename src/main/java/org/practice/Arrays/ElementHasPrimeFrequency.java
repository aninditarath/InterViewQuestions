package org.practice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ElementHasPrimeFrequency {

    public static boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();


        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }


        for (int freq : freqMap.values()) {
            if (isPrime(freq)) {
                return true;
            }
        }

        return false;
    }


    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }

}
