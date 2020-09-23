package com.rsupak;

public class SumOddRange {
    public static boolean isOdd(int num) {
        if (num < 0) return false;
        return (num % 2 == 1);
    }

    public static int sumOdd(int start, int finish) {
        if (start < 0 || finish < 0 || finish < start) return -1;

        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (isOdd(i)) sum += i;
        }
        return sum;
    }
}
