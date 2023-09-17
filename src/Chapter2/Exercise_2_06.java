package src.Chapter2;

import java.util.Scanner;

public class Exercise_2_06 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        scanner.close();
        System.out.println("Enter a number between 0 and 1000: ");

        final long result = multiplyAllDigits(value);
        System.out.println("The multiplication of all digits in " + value + " is " +result);


    }

    private static long multiplyAllDigits(Long value) {
        long firstDigit = value % 10;
        value = value / 10;
        long secondDigit;
        if (value % 10 == 0 && value / 10 != 0) {
            secondDigit = 0;
        } else if (value % 10 == 0 && value / 10 == 0) {
            secondDigit = 1;
        } else {
            secondDigit = value % 10;
        }
        value = value / 10;

        long thirdDigit;
        if (value == 0) {
            thirdDigit = 1;
        } else {
            thirdDigit = value;
        }

        return firstDigit * secondDigit * thirdDigit;
    }
}
