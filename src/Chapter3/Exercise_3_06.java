package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_06 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        final double weight = scanner.nextDouble();
        System.out.println("Enter feet: ");
        final double feet = scanner.nextDouble();
        System.out.println("Enter inches: ");
        final double inches = scanner.nextDouble();
        scanner.close();

        final double heightInMeters = convertHeightToMeters(feet, inches);
        final double weightInKilogram = convertWeightToKilogram(weight);

        double bmi = weightInKilogram / (heightInMeters * heightInMeters);
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

    private static double convertHeightToMeters(final double feet, final double inches) {
        final double METERS_PER_INCH = 0.0254;
        double totalHeightInInches = (feet * 12) + inches;
        return METERS_PER_INCH * totalHeightInInches;
    }

    private static double convertWeightToKilogram(final double weight) {
        final double KILOGRAM_PER_POUND = 0.45359237;
        return  KILOGRAM_PER_POUND * weight;
    }
}
