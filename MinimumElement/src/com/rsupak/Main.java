package com.rsupak;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] numbers = readIntegers(5);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Minimum number in array: " + getMin(numbers));
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " integers: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        return array;
    }

    private static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(array[i], min);
        }
        return min;
    }
}
