package src.Chapter2;

import java.util.Scanner;

/**
 * Write a program that calculates the energy needed
 * to heat water from an initial temperature to a final temperature. Your program
 * should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water
 * ***/
public class Exercise_2_10 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        final double weightOfWater = scanner.nextDouble();
        System.out.println("Enter the initial temperature: ");
        final double initialTemperature = scanner.nextDouble();
        System.out.println("Enter the final temperature: ");
        final double finalTemperature = scanner.nextDouble();
        scanner.close();

        final double energy = weightOfWater * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}
