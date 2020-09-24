package com.rsupak;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        int largestPrime = -1;

        if (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }
        for (int i = 3; i <= number; i += 2) {
            if (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }
        return largestPrime;
    }
}
