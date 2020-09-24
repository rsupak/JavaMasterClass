package com.rsupak;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int evenSum = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            evenSum += (currentDigit % 2 == 0) ? currentDigit : 0;
            number /= 10;
        }
        return evenSum;
    }
}
