package com.rsupak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 digits to get the sum.");

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.print("Enter number #" + count + ": ");
            boolean hasNextInt = input.hasNextInt();
            if (hasNextInt) {
                sum += input.nextInt();
                count++;
            } else {
                System.out.println("Unable to parse number. Try again.");
            }
            input.nextLine();
        }
        System.out.println("Your total is " + sum);
        input.close();
    }
}
