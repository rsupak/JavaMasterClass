package com.rsupak;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int minutesPerDay = 24 * 60;
            int minutesPerYear = 365 * minutesPerDay;
            long years = minutes / minutesPerYear;
            long remainingMinutes = minutes % minutesPerYear;
            long days = remainingMinutes / minutesPerDay;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }


    }
}
