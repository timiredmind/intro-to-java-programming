package src.Chapter4;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the year and the
 * first three letters of a month name (with the first letter in uppercase) and displays
 * the number of days in the month. If the input for month is incorrect, display a message
 * */

public class Exercise_17 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        final int year = scanner.nextInt();
        System.out.println("Enter the month: ");
        final String month = scanner.next();
        scanner.close();

        int daysInMonths = 0;

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May")
                || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
            daysInMonths = 31;
        } else if (month.equals("Sep") || month.equals("Apr") || month.equals("Jun")
                || month.equals("Nov")) {
            daysInMonths = 30;
        } else if (month.equals("Feb")) {
            if ((year % 100 == 0 && year % 400 == 0) || year % 4 == 0) {
                daysInMonths = 29;
            } else {
                 daysInMonths = 28;
            }
        } else {
            System.out.printf("%s is not a correct month name", month);
            System.exit(0);
        }

        System.out.printf("%s %s has %s days", month, year, daysInMonths);
    }
}
