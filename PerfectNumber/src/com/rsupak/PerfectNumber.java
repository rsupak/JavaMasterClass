package com.rsupak;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int factorSum = 0;
        int factor = 1;
        while (factor < number) {
            factorSum += (number % factor == 0) ? factor : 0;
            factor++;
        }
        return (factorSum == number);
    }
}
