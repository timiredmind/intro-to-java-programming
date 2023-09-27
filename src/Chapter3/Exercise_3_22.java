package src.Chapter3;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0) with
 * radius 10.
 * **/

public class Exercise_3_22 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        final double pointX = scanner.nextDouble();
        final double pointY = scanner.nextDouble();
        scanner.close();

        final double pointXY = Math.sqrt((pointX * pointX) + (pointY * pointY));
        if (pointXY <= 10) {
            System.out.println("Point (" + pointX + ", " + pointY + ") is in the circle.");
        } else {
            System.out.println("Point (" + pointX + ", " + pointY + ") is not in the circle.");
        }

    }
}
