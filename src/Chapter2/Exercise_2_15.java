package src.Chapter2;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance.
 * **/

public class Exercise_2_15 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        scanner.close();

        // calculate distance
        final double x = (x2 - x1);
        final double y = (y2 - y1);

        final double distance = Math.sqrt((x * x) + (y * y));
        System.out.println("The distance between the two distances is : " + distance);
    }
}
