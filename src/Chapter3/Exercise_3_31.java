package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_31 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double rate = scanner.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convertChoice = scanner.nextInt();

        if (convertChoice == 0) {
            System.out.println("Enter the dollar amount: ");
        } else if (convertChoice == 1) {
            System.out.println("Enter the RMB amount: ");
        } else {
            System.out.println("Incorrect input");
        }

        if (convertChoice == 0 || convertChoice == 1) {
            double amount = scanner.nextDouble();
            scanner.close();
            double convertedAmount;
            if (convertChoice == 0) {
                convertedAmount = amount * rate;
            } else {
                convertedAmount = amount / rate;
            }
            if (convertChoice == 0) {
                System.out.println("$" + amount + " is " + convertedAmount + " yuan.");
            } else {
                System.out.println(amount + " yuan is $" + convertedAmount + ".");
            }
        }
    }
}
