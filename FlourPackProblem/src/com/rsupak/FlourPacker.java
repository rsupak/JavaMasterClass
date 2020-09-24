package com.rsupak;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0) return false;
        int currentKilo = 0;

        // check if big bags help reach goal
        while (bigCount > 0 && currentKilo < goal) {
            currentKilo += 5;
            bigCount--;
            if (currentKilo == goal) return true;
        }

        // check if small bags help reach goal
        while (smallCount > 0) {
            currentKilo++;
            smallCount--;
            if (currentKilo == goal) return true;
        }

        // goal not met
        return false;
    }
}
