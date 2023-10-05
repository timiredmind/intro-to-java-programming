package src.Chapter3;

import java.util.Scanner;
/**
 * Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of each package and displays the one with the
 * better price.
 * */
public class Exercise_3_33 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight and price for package 1: ");
        double packageOneWeight = scanner.nextDouble();
        double packageOnePrice = scanner.nextDouble();

        System.out.println("Enter weight and price for package 2: ");
        double packageTwoWeight = scanner.nextDouble();
        double packageTwoPrice = scanner.nextDouble();

        scanner.close();
        double weightPerPrice1 = packageOneWeight / packageOnePrice;
        double weightPerPrice2 = packageTwoWeight / packageTwoPrice;

        if (weightPerPrice1 > weightPerPrice2) {
            System.out.println("Package 1 has a better price");
        } else if (weightPerPrice2 > weightPerPrice1) {
            System.out.println("Package 2 has a better price");
        } else {
            System.out.println("Both packages have the same price");
        }
    }
}
