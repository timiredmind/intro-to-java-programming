package src.Chapter3;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 * which represents head or tail. The program prompts the user to enter a guess, and
 * reports whether the guess is correct or incorrect.
 * */
public class Exercise_3_14 {
    public static void main(String[] args) {
        final Random random = new Random();
        final Scanner scanner = new Scanner(System.in);
        final int randomNumber = random.nextInt(0,2);

        System.out.println("Enter a guess: ");
        int guess = scanner.nextInt();
        scanner.close();

        if (guess == randomNumber) {
            if (randomNumber == 0) {
                System.out.println("Heads is correct");
            } else {
                System.out.println("Tails is correct");
            }
        } else if (guess == 1) {
            System.out.println("Tails is incorrect");
        } else if (guess == 0) {
            System.out.println("Heads is incorrect");
        }
    }
}
