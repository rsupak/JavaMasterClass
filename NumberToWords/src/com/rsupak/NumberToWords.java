package com.rsupak;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        else {
            String numberWord = "";
            int reversedNumber = reverse(number);
            int digitCount = getDigitCount(number);
            while (digitCount > 0) {
                int currentDigit = reversedNumber % 10;
                switch(currentDigit) {
                    case 0:
                        numberWord += " " + "Zero";
                        break;
                    case 1:
                        numberWord += " " + "One";
                        break;
                    case 2:
                        numberWord += " " + "Two";
                        break;
                    case 3:
                        numberWord += " " + "Three";
                        break;
                    case 4:
                        numberWord += " " + "Four";
                        break;
                    case 5:
                        numberWord += " " + "Five";
                        break;
                    case 6:
                        numberWord += " " + "Six";
                        break;
                    case 7:
                        numberWord += " " + "Seven";
                        break;
                    case 8:
                        numberWord += " " + "Eight";
                        break;
                    case 9:
                        numberWord += " " + "Nine";
                        break;
                    default:
                        numberWord = "Invalid Value";
                        break;
                }
                reversedNumber /= 10;
                digitCount--;
            }
            System.out.println(numberWord);
        }
    }

    public static int reverse(int number) {
        boolean isNegative = number < 0;
        number = isNegative ? -number : number;
        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }
        return isNegative ? -reverseNumber : reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count == 0 ? 1 : count;
    }
}
