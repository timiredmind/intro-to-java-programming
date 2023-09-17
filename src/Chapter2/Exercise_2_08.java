package src.Chapter2;

import java.util.Scanner;

/**
 *
 * **/
public class Exercise_2_08 {
    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT:");
        final long timeZone = scanner.nextLong();
        scanner.close();

        long timeZoneMinutes = timeZone * 60;
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = (totalSeconds / 60) + timeZoneMinutes;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        System.out.println(
                "The current time is " +
                        currentHour + ":" + currentMinute + ":" + currentSecond + " GMT " + timeZone);
    }
}
