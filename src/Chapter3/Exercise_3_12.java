package src.Chapter3;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer. An integer is palindrome
 * if it reads the same from right to left and from left to right. A negative integer is
 * treated the same as a positive integer
 * */

public class Exercise_3_12 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        final int value = scanner.nextInt();
        scanner.close();

        int temp = value;
        int firstDigit = temp / 100;
        temp %= 100;

        int secondDigit = temp / 10;
        temp %= 10;

        int thirdDigit = temp;

        if (firstDigit == thirdDigit) {
            System.out.println(value + " is a palindrome");
        } else {
            System.out.println(value + " is not a palindrome");
        }
    }
}
