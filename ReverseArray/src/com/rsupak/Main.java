package com.rsupak;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
//        int count = scanner.nextInt();
//        scanner.nextLine();
//	    int[] array = readIntegers(count);
        int[] array = {1, 2, 3, 4, 5, 6};
        reverseArray(array);
        System.out.println(Arrays.toString(array));

    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static void reverseArray(int[] array) {
        int maxIndex = array.length - 1;
        int midPoint = array.length / 2;
        int temp;

        for (int i = 0; i < midPoint; i++) {
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
