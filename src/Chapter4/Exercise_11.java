package src.Chapter4;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter binary digits
 * and displays its corresponding decimal value
 * */

public class Exercise_11 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter binary digits (0000 to 1111): ");
        String digits = scanner.next();
        scanner.close();

        if (digits.length() != 4) {
            System.out.println("There should be 4 digits");
            System.exit(0);
        }

        for (int index = 0; index < digits.length(); index++) {
            if (!Character.isDigit(digits.charAt(index))) {
                System.out.println("All entries should be digits");
                System.exit(0);
            }
        }

        int decimalValue = 0;

        for (int index = 0; index < digits.length(); index++) {
            int digit = digits.charAt(index) - '0';
            decimalValue += digit *
                    Math.pow(2, digits.length() - 1 - index);
        }

        System.out.println("The decimal value is " + decimalValue);

    }
}
