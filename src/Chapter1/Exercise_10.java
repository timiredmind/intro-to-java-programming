package src.Chapter1;

/*
Assume that a runner runs 15 kilometers in 50 minutes and 30 seconds.
Write a program that displays the average speed in miles per hour.*/

public class Exercise_10 {
    public static void main(String[] args) {
        final Double kilometre = 15.0;
        final Long minutes = 50L;
        final Long seconds = 30L;
        final Double miles = convertKiloMetreToMiles(kilometre);
        final Double hours = convertTimeToHours(minutes, seconds);

        final Double result = miles / hours;

        System.out.println(result);

    }
    private static Double convertKiloMetreToMiles(final Double value) {
        return value / 1.6;
    }

    private static Double convertTimeToHours(final Long minutes, final Long seconds) {
        final long total = minutes * 60 + seconds;
        return total / 3600.0;
    }
}
