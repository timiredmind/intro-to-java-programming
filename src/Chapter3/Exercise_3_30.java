package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_30 {
    public static void main(String[] args) {
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

        long newHour = (currentHour > 12) ? currentHour - 12 : currentHour;

        String timeOfDay = (currentHour < 12) ? " AM": " PM";



        System.out.println(
                "The current time is " +
                        newHour + ":" + currentMinute + ":"
                        + currentSecond + timeOfDay);
    }
}
