package src.Chapter4;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char userInput = scanner.next().charAt(0);
        scanner.close();

        System.out.printf("The Unicode for character %c is %d", userInput, (int) userInput);
    }
}
