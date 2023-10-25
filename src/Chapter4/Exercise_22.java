package src.Chapter4;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter two strings, and
 * reports whether the second string is a substring of the first string.
 * **/
public class Exercise_22 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string s1: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter the string s2: ");
        String s2 = scanner.nextLine();
        scanner.close();

        int length = s2.length();
        boolean isSubString = false;

        for (int i = 0; i <= s1.length() - length; i++) {
            if (s1.substring(i, i+2).equals(s2)) {
                isSubString = true;
                break;
            }
        }

        if (isSubString) {
            System.out.printf("%s is a substring of %s", s2, s1);
        } else {
            System.out.printf("%s is not a substring of %s", s2, s1);
        }
    }
}
