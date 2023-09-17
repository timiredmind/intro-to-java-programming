package src.Chapter2;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and remaining days for
 * the minutes. For simplicity, assume that a year has 365 days
 * **/

public class Exercise_2_07 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
         long noOfMinutes = scanner.nextLong();
        scanner.close();

        System.out.println("Enter the number of minutes: ");
        final long noOfYears = noOfMinutes / (365 * 24 * 60);
        noOfMinutes %= (365 * 24 * 60);
        final long noOfDays = noOfMinutes / (24 * 60);

        System.out.println(
                noOfMinutes + " minutes is approximately " +
                        noOfYears + " years and " + noOfDays + " days");
    }
}
