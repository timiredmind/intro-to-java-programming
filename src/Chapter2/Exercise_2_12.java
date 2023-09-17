package src.Chapter2;

import java.util.Scanner;

/**
 * Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 * length = v2/ 2a
 *  Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s2),
 * , displays the minimum runway length
 * **/
public class Exercise_2_12 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        final double speed = scanner.nextDouble();
        final double acceleration = scanner.nextDouble();
        scanner.close();

        final double runwayLength = (speed * speed)/(2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + runwayLength);
    }
}
