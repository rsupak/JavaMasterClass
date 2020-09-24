package com.rsupak;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;

        int num1FirstDigit = (num1 / 10) % 10;
        int num1LastDigit = num1 % 10;
        int num2FirstDigit = (num2 / 10) % 10;
        int num2LastDigit = num2 % 10;

        if (num1FirstDigit == num2FirstDigit || num1FirstDigit == num2LastDigit) return true;
        if (num1LastDigit == num2FirstDigit || num1LastDigit == num2LastDigit) return true;

        return false;
    }
}
