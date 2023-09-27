package src.Chapter3;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter
 * the month and year and displays the number of days in the month. For example, if
 * the user entered month 2 and year 2012, the program should display that February
 * 2012 has 29 days. If the user entered month 3 and year 2015, the program should
 * display that March 2015 has 31 days
 * **/

public class Exercise_3_11 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month in integers: ");
        int monthNumber = scanner.nextInt();
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        scanner.close();

        String month = null;

         switch (monthNumber) {
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
        }

        int days;

         if (monthNumber == 9 || monthNumber == 4 || monthNumber == 6 || monthNumber == 11) {
             days = 30;
         } else if (monthNumber == 2) {
             if (year % 400 == 0 && year % 100 == 0) {
                 days = 29;
             } else if (year % 4 == 0 && year % 400 != 0 && year % 100 != 0) {
                 days = 29;
             } else {
                 days = 28;
             }
         } else {
             days = 31;
         }

        System.out.println(month + " " + year + " has " + days + " days.");
    }
}
