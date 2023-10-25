package src.Chapter4;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant. For a nonletter input, display
 * invalid input.
 * */

public class Exercise_13 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        final char letter = scanner.next().charAt(0);
        final char letterInUpperCase = Character.toUpperCase(letter);

        if (!Character.isAlphabetic(letter)) {
            System.out.println(letter + " is an invalid input");
            System.exit(0);
        }
        if (letterInUpperCase == 'A' || letterInUpperCase == 'E' || letterInUpperCase == 'I'
        || letterInUpperCase == 'O' || letterInUpperCase == 'U') {
            System.out.println(letter + " is a vowel");
        } else {
            System.out.println(letter + " is a consonant");
        }
    }
}
