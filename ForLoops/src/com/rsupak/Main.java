package com.rsupak;

public class Main {

    public static void main(String[] args) {
	    for (int i = 2; i <= 8; i++) {
	        System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i = 2; i <= (long)Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
