package com.rsupak;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) System.out.println("Invalid Value");
        else {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (j == 0 || j == number - 1){
                        System.out.print("*");
                    }
                    else if (i == 0 || i == number - 1){
                        System.out.print("*");
                    }
                    else if (j == i || j == number - 1 - i) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}