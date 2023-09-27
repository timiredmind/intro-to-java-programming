
package src.Chapter3;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display
 * the future day of the week.
 * **/

public class Exercise_3_05 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today’s day: ");
        int today = scanner.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int daysAfter = scanner.nextInt();
        scanner.close();

        daysAfter = (daysAfter + today) % 7;

         String currentDayOfTheWeek = getDayOfWeek(today);
         String futureDayOfTheWeek = getDayOfWeek(daysAfter);

         System.out.println(
                 "Today is " +
                         currentDayOfTheWeek +
                         " the future day is " +
                         futureDayOfTheWeek);
    }

    private static String getDayOfWeek(final int day) {
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Saturday";
        };
    }

}
