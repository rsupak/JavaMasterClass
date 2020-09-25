package com.rsupak;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        long average = 0L;
        int numberOfInputs = 0;

        while (true) {
            System.out.println("Enter a number: ");
            boolean hasNextInt = input.hasNextInt();
            if (hasNextInt) {
                int number = input.nextInt();
                numberOfInputs++;
                sum += number;
            } else {
                if (numberOfInputs > 0){
                    average = Math.round((double)sum / (double)numberOfInputs);
                    break;
                }
                break;
            }
            input.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
