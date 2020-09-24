package com.rsupak;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        number = (number > 0) ? number : -number;
        int originalNumber = number;
        int reverseNumber = 0;

        while (number > 0) {
            reverseNumber = (reverseNumber + number % 10);
            reverseNumber *= (number < 10 ? 1 : 10);
            number /= 10;
        }
        return reverseNumber == originalNumber;
    }
}
