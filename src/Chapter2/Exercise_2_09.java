package src.Chapter2;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * then displays the average acceleration
 * **/
public class Exercise_2_09 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter v0, v1, and t:");
        final double startingVelocity = scanner.nextDouble();
        final double endingVelocity = scanner.nextDouble();
        final double time = scanner.nextDouble();
        scanner.close();

        final double acceleration = (endingVelocity - startingVelocity) / time;
        System.out.println("The average acceleration is " + acceleration);

    }
}
