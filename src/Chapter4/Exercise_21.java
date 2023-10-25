package src.Chapter4;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * check whether the input is valid.
 * **/


public class Exercise_21 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        final String socialSecurityNumber = scanner.next();
        scanner.close();

        int length = socialSecurityNumber.length();
        boolean isValid = length == 11;
        for (int i = 0; i < socialSecurityNumber.length(); i++) {
            if (!isValid) break;
            if ((i == 3  && socialSecurityNumber.charAt(i) != '-') ||
                    (i == 6  && socialSecurityNumber.charAt(i) != '-')) {
                isValid = false;
            }
            else if (!Character.isDigit(socialSecurityNumber.charAt(i))) {
                isValid = false;
            }
        }

        if (isValid) System.out.printf("%s is a social security number", socialSecurityNumber);
        else System.out.printf("%s is a social security number", socialSecurityNumber);
    }
}
