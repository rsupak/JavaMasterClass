package com.rsupak;

public class Main {

    public static void main(String[] args) {
	    double firstDouble = 20.00;
	    double secondDouble = 80.00;
	    double sumDoubles = (firstDouble + secondDouble) * 100;
	    double remainder = sumDoubles % 40.00;

	    boolean isRemainderZero = remainder == 0;
        System.out.println(isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
        else {
            System.out.println("No remainder");
        }
    }
}
