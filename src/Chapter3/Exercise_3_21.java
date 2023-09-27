package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_21 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: (e.g. 2012): ");
        int year = scanner.nextInt();
        System.out.println("Enter month: 1-12 : ");
        int month = scanner.nextInt();
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }
        System.out.println("Enter the day of the month: 1-31: ");
        final int q = scanner.nextInt();
        scanner.close();

        final int m = month;
        final int j = year / 100;
        final int k = year % 100;

        int h = (q + (26*(m + 1))/10 + k + (k/4) + (j/4) + (5*j)) % 7;
        String dayOfTheWeek;
        if (h == 0) {
            dayOfTheWeek = "Saturday";
        } else if (h == 1) {
            dayOfTheWeek = "Sunday";
        } else if (h == 2) {
            dayOfTheWeek = "Monday";
        } else if (h == 3) {
            dayOfTheWeek = "Tuesday";
        } else if (h == 4) {
            dayOfTheWeek = "Wednesday";
        } else if (h == 5) {
            dayOfTheWeek = "Thursday";
        } else  {
            dayOfTheWeek = "Friday";
        }

        System.out.println("The Day of the week is " + dayOfTheWeek);
    }
}
