package src.Chapter2;

import java.util.Scanner;

public class Exercise_2_14 {
    public static void main(String[] args) {
        final double POUND_TO_KG = 0.45359237;
        final double INCH_TO_METER = 0.0254;

        // create scanner object
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        final double weightInPounds = scanner.nextDouble();

        System.out.println("Enter the height in inches: ");
        final double heightInInches = scanner.nextDouble();
        // close scanner to avoid memory leak
        scanner.close();

        // convert the weight in pounds to kilogram
        final double weightInKilo = weightInPounds * POUND_TO_KG;
        // convert height in inch to meters
        final double heightInMetres = heightInInches * INCH_TO_METER;
        // calculate BMI (body mass index)
        final double BMI = weightInKilo / (heightInMetres * heightInMetres);
        System.out.println("BMI is " + BMI);
    }
}
