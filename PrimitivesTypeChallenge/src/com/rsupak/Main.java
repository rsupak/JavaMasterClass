package com.rsupak;

public class Main {

    public static void main(String[] args) {
        byte myByte = 120;
        short myShort = 32002;
        int myInt = 234756441;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);
    }
}
