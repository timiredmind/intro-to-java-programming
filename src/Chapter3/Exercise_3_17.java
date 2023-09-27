package src.Chapter3;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a program that plays the popular scissor–rock–
 * paper game. (A scissors can cut a paper, a rock can knock a scissors, and a paper can
 * wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
 * scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
 * 2 and displays a message indicating whether the user or the computer wins, loses,
 * or draws.
 * **/

public class Exercise_3_17 {
    public static void main(String[] args) {
        final Random random = new Random();
        final int randomNumber = random.nextInt(0, 3);

        final Scanner scanner = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");
        final int userInput = scanner.nextInt();
        scanner.close();

        String computerOption = null;
        if (randomNumber == 0) computerOption = "scissors";
        else if (randomNumber == 1) computerOption = "rock";
        else if (randomNumber == 2) computerOption = "paper";

        String userOption = null;
        if (userInput == 0) userOption = "scissors";
        else if (userInput == 1) userOption = "rock";
        else if (userInput == 2) userOption = "paper";

        if (randomNumber == userInput) {
            System.out.println( "The computer is " + computerOption + ". You are "
                                        + userOption + " too. It is a draw.");
        } else if (randomNumber == 0 && userInput == 1) {
            System.out.println("The computer is " + computerOption + ". You are "
                                       + userOption + ". You won.");
        } else if (randomNumber == 0 && userInput == 2) {
            System.out.println("The computer is " + computerOption + ". You are "
                                       + userOption + ". You lost.");
        } else if (randomNumber == 1 && userInput == 0) {
            System.out.println("The computer is " + computerOption + ". You are "
                                       + userOption + ". You lost.");
        } else if (randomNumber == 1 && userInput == 2) {
            System.out.println("The computer is " + computerOption + ". You are "
                                       + userOption + ". You won.");
        } else if (randomNumber == 2 && userInput == 0) {
            System.out.println("The computer is " + computerOption + ". You are "
                                       + userOption + ". You won.");
        } else if (randomNumber == 2 && userInput == 1) {
            System.out.println("The computer is " + computerOption + ". You are "
                                       + userOption + ". You lost.");
        }
    }
}
