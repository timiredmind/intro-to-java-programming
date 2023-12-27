package src.Chapter5;

import java.util.Scanner;

/**
 * (Reverse a string) Write a program that prompts the user to enter a string and
 * displays the string in reverse order.
 * **/

public class Exercise_46 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.next();
        scanner.close();
        StringBuilder reverseString = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString.append(string.charAt(i));
        }

        System.out.println("The reverse string is " + reverseString);

    }
}
