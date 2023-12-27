package src.Chapter5;

import java.util.Scanner;

/**
 *Longest common prefix) Write a program that prompts the user to enter two
 * strings and displays the largest common prefix of the two strings. Here are some
 * sample runs:
 **/


public class Exercise_51 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        scanner.close();

        int min = Math.min(firstString.length(), secondString.length());
        int length = 0;

        for (int i = 0; i < min; i++) {
            if (firstString.charAt(i) == secondString.charAt(i)) {
                length++;
            } else {
                break;
            }
        }

        if (length == 0) {
            System.out.println(firstString + " and " + secondString + " have no common prefix");
        } else {
            System.out.println("The common prefix is " + firstString.substring(0, length));
        }
    }
}
