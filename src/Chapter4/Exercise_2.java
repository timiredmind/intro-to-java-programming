package src.Chapter4;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        final double x1 = scanner.nextDouble();
        final double y1 = scanner.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        final double x2 = scanner.nextDouble();
        final double y2 = scanner.nextDouble();
        scanner.close();

        // d = EARTH_RADIUS * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        final double radius = 6371.01;
        final double x1Radian = Math.toRadians(x1);
        final double y1Radian = Math.toRadians(y1);
        final double x2Radian = Math.toRadians(x2);
        final double y2Radian = Math.toRadians(y2);
        final double distance = radius * Math.acos(
                Math.sin(x1Radian) * Math.sin(x2Radian) + Math.cos(x1Radian)  * Math.cos(x2Radian)
                * Math.cos(y1Radian - y2Radian));

        System.out.println("The distance between the two points is " + distance + " km");
    }
}
