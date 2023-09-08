package src.Chapter1;

/*
* Assume that a runner runs 24 miles in
* 1 hour, 40 minutes, and 35 seconds.
* Write a program that displays the average speed in kilometers per hour.
* (Note 1 mile is equal to 1.6 kilometers.)
* */

public class Exercise_12 {
    public static void main(String[] args) {
        final double kilometer = convertMileToKiloMetre(24);
        final double hours = convertTimeToHours(1, 40, 35);
        double result =  kilometer / hours;
        System.out.println(result);
    }

    private static Double convertMileToKiloMetre(final long miles) {
        return miles * 1.6;
    }

    private static Double convertTimeToHours(
            final long hour, final long minutes, final long seconds) {
        final long totalSeconds = (hour * 3600) + (minutes * 60) + seconds;
        return totalSeconds / 3600.0;
    }
}
