package com.rsupak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int min = Integer.MIN_VALUE;
	    int max = Integer.MAX_VALUE;
	    while (true) {
            System.out.print("Enter number: ");
            boolean hasNextInt = input.hasNextInt();
            if (hasNextInt) {
                int number = input.nextInt();
                min = (min == Integer.MIN_VALUE || number < min) ? number : min;
                max = (max == Integer.MAX_VALUE || number > max) ? number : max;
            } else {
                break;
            }
        }
        System.out.println("Min: " + min + "|| Max: " + max);
    }
}
