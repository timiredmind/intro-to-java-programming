package src.Chapter5;

import java.util.Scanner;

/**
 * Write a program that prompts the user to
 * enter the year and first day of the year, then displays the first day of each month in
 * the year. For example, if the user entered the year 2013, and 2 for Tuesday, January
 * 1, 2013, your program should display the following output:
 * **/

public class Exercise_28 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year (Monday - 1, Tuesday - 2 ... Sunday - 7 ): ");
        int firstDayOfTheYear = scanner.nextInt();
        scanner.close();

        for (int monthInt = 1; monthInt <= 12; monthInt++) {
            if (monthInt == 9 || monthInt == 4 || monthInt == 6 || monthInt == 11) {
                firstDayOfTheYear = getFirstDayOfTheYear(year, firstDayOfTheYear, monthInt);
                firstDayOfTheYear += 30;
            }
            else if (monthInt == 2 && isYearALeapYear(year)) {
                firstDayOfTheYear = getFirstDayOfTheYear(year, firstDayOfTheYear, monthInt);
                firstDayOfTheYear += 29;
            } else if (monthInt == 2 && !isYearALeapYear(year)) {
                firstDayOfTheYear = getFirstDayOfTheYear(year, firstDayOfTheYear, monthInt);
                firstDayOfTheYear += 28;
            } else {
                firstDayOfTheYear = getFirstDayOfTheYear(year, firstDayOfTheYear, monthInt);
                firstDayOfTheYear += 31;
            }
        }

    }

    private static int getFirstDayOfTheYear(int year, int firstDayOfTheYear, int monthInt) {
        firstDayOfTheYear %= 7;
        String dayOfTheWeek = getDayOfTheWeek(firstDayOfTheYear);
        String month = getMonthOfTheYear(monthInt);
        System.out.println(month + " 1, " + year + " is " + dayOfTheWeek);
        return firstDayOfTheYear;
    }

    private static boolean isYearALeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        return year % 4 == 0 && year % 100 != 0;
    }

    private static String getDayOfTheWeek(int day) {
        switch (day) {
            case 0 -> {
                return "Sunday";
            }
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
        }
        return null;
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
