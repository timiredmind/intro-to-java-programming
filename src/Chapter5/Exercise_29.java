package src.Chapter5;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the year and
 * first day of the year and displays the calendar table for the year on the console. For
 * example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
 * your program should display the calendar for each month in the year
 * **/

class Exercise_29 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print(
                "Enter the first day of the year (Monday - 1, Tuesday - 2 ... Sunday - 7 ): ");
        int firstDayOfTheYear = scanner.nextInt();
        scanner.close();

        for (int monthInt = 1; monthInt <= 12; monthInt++) {
            String month = getMonthOfTheYear(monthInt);
            System.out.println("\t\t"+ month + " " + year );
            System.out.println("__".repeat(30));
            System.out.println("Sun \t Mon \t Tue \t Wed \t Thur \t Fri \t Sat \t");
            System.out.println();

        }

    }
    private static String getMonthOfTheYear(int month) {
        switch (month) {
            case 1 -> {
                return "January";
            }
            case 2 -> {
                return "February";
            }
            case 3 -> {
                return "March";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "May";
            }
            case 6 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
        }
        return null;
    }
}