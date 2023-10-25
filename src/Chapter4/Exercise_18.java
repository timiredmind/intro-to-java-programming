package src.Chapter4;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is number character 1, 2, 3, 4, which
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * the following characters are used to denote the majors:
 * I: Information Management
 * C: Computer Science
 * A: Accounting
 * */


public class Exercise_18 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String code = scanner.next();
        scanner.close();

        if (code.length() != 2) {
            System.out.println("You are expected to enter two charcters.");
            System.exit(0);
        }

        String major = "";
        char firstChar = code.charAt(0);
        if (firstChar == 'I') {
            major = "Information Management";
        } else if (firstChar == 'C') {
            major = "Computer Science";
        } else if (firstChar == 'A') {
            major = "Accounting";
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }

        char secondChar = code.charAt(1);
        String studentType = "";
        if (secondChar == '1') {
            studentType = "Freshman";
        } else if (secondChar == '2') {
            studentType = "Sophomore";
        } else if (secondChar == '3') {
            studentType = "Junior";
        } else if (secondChar == '4') {
            studentType = "Senior";
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.printf("%s %s", major, studentType);
    }
}
