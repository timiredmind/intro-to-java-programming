package src.Chapter4;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a hex digit and
 * displays its corresponding binary number
 * */

public class Exercise_12 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        final char hexDigit = scanner.next().charAt(0);
        scanner.close();

        int digit = 0;

        if (hexDigit >= 'A' && hexDigit <= 'F') {
            digit = hexDigit - 'A' + 10;
        } else if (Character.isDigit(hexDigit)) {
            digit = hexDigit -'0';
        } else {
            System.out.println(hexDigit + " is an invalid input");
        }

        StringBuilder binaryDigits = new StringBuilder();
        while (digit != 0) {
            int remainder = digit % 2;
            digit /= 2;
            binaryDigits.insert(0, remainder);
        }

        System.out.println("The binary value is " + binaryDigits);

    }
}
