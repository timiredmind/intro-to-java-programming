package src.Chapter3;

import java.util.Scanner;

/**
 * A shipping company uses the following function to calculate the
 * cost (in dollars) of shipping based on the weight of the package (in pounds)
 * **/

public class Exercise_3_18 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight of the package in pounds: ");
        final double weight = scanner.nextDouble();
        scanner.close();

        if (weight > 0 && weight <= 2) {
            System.out.println("Your shipping cost is $2.5");
        } else if (weight > 2 && weight <= 4) {
            System.out.println("Your shipping cost is $4.5");
        } else if (weight > 4 && weight <= 10) {
            System.out.println("Your shipping cost is $7.5");
        } else if (weight > 10 && weight <= 20) {
            System.out.println("Your shipping cost is $10.5");
        } else {
            System.out.println("The package cannot be shipped");
        }
    }
}
