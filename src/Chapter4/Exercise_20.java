package src.Chapter4;

import java.util.Scanner;

/**
 * Write a program that prompts the user to
 * enter a string and displays its length and its last character
 * **/

public class Exercise_20 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = scanner.next();

        int length = userInput.length();
        char lastCharacter = userInput.charAt(length - 1);
        System.out.printf("The length of the character is %d with the last character being %s",
                          length, lastCharacter);

    }
}
