package com.rsupak;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0) return -1;
        return (long)Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        System.out.println(milesPerHour >= 0 ?
                kilometersPerHour + " km/h = " + milesPerHour + " mi/h" :
                "Invalid Value");
    }
}
