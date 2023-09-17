package src.Chapter2;

import java.util.Scanner;

public class Exercise_2_23 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        final double distance = scanner.nextDouble();
        System.out.println("Enter miles per gallon: ");
        final double MILES_PER_GALLON = scanner.nextDouble();
        System.out.println("Enter price per gallon: ");
        final double PRICE_PER_GALLON = scanner.nextDouble();

        scanner.close();

        // calculate no of gallons used
        final double noOfGallons = distance / MILES_PER_GALLON;
        // calculate cost
        final double cost = noOfGallons * PRICE_PER_GALLON;
        System.out.println("The cost of driving is $" + cost);
    }
}
