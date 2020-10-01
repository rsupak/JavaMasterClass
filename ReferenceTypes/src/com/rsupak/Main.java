package com.rsupak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 10;
	    int anotherIntValue = myIntValue;

        System.out.println("MyIntValue : " + myIntValue);
        System.out.println("AnotherIntValue : " + anotherIntValue);

        anotherIntValue++;

        System.out.println("MyIntValue : " + myIntValue);
        System.out.println("AnotherIntValue : " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("MyIntArray : " + Arrays.toString(myIntArray));
        System.out.println("AnotherArray : " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("MyIntArray after modify : " + Arrays.toString(myIntArray));
        System.out.println("AnotherArray after modify : " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println("MyIntArray after change : " + Arrays.toString(myIntArray));
        System.out.println("AnotherArray after change : " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
