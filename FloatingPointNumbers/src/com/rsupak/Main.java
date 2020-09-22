package com.rsupak;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;

        System.out.println("Min Float: " + myMinFloatValue);
        System.out.println("Max Float: " + myMaxFloatValue);

        System.out.println("Min Double: " + myMinDoubleValue);
        System.out.println("Max Double: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyInt: " + myIntValue);
        System.out.println("MyFloat: " + myFloatValue);
        System.out.println("MyDouble: " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237;
        System.out.println(convertedKilograms);


    }
}
