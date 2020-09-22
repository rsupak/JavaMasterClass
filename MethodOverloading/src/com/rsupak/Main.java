package com.rsupak;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Rich", 500);
        calculateScore(300);
        calculateScore();
        System.out.println("New score is " + newScore);
        int feet = 0;
        int inches = 1;
        System.out.println("There are " +
                calcFeetAndInchesToCentimeters(feet, inches) +
                " centimeters in " +
                feet + " feet and " + inches + " inches");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No players scored points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) return -1;
        return calcFeetAndInchesToCentimeters(feet * 12 + inches);
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) return -1;
        return inches * 2.54;
    }
}
