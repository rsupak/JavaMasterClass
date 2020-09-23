package com.rsupak;

public class Main {

    public static void main(String[] args) {
	    char letter = 'G';
	    switch (letter) {
            case 'A':
                System.out.println("A was Found");
                break;
            case 'B':
                System.out.println("B was Found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(letter + " was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }
    }
}
