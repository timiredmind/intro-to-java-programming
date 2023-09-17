package src.Chapter2;

import java.util.Scanner;

public class Exercise_2_22 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = scanner.nextInt();

        final int numberOfOneDollars = amount / 100;
        amount %= 100;

        final int numberOfQuarters = amount / 25;
        amount %= 25;

        final int numberOfDimes = amount / 10;
        amount %= 10;

        final int numberOfNickels = amount / 5;
        amount %= 5;

        final int numberOfPennies = amount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }}
