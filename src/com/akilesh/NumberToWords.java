package com.akilesh;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digitCount = getDigitCount(number);
        int count = 0;
        int reversedNumber = reverse(number);
        while (reversedNumber != 0) {
            count++;

            int currentLastDigit = reversedNumber % 10;

            switch (currentLastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reversedNumber /= 10;
        }

        while (digitCount > count) {
            count++;
            System.out.println("Zero");
        }
    }

    // Method for reversing the number
    public static int reverse(int number){
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }
        return reversedNumber;
    }

    // Method to return digit count.
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0){
            return 1;
        }
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
