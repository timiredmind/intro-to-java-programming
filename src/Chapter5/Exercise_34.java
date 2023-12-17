package src.Chapter5;

import java.util.Random;
import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {
        int computerCount = 0;
        int userCount = 0;
        final Random random = new Random();
        final Scanner scanner = new Scanner(System.in);

        while ((computerCount - userCount != 3) && (userCount - computerCount != 3)) {
            final int randomNumber = random.nextInt(0, 3);
            System.out.println("scissor (0), rock (1), paper (2): ");
            final int userInput = scanner.nextInt();

            Long winner = checkTheWinner(randomNumber, userInput);
            if (winner != null && winner == randomNumber) {
                System.out.println("Computer wins");
                computerCount++;
            } else if (winner != null && winner == userInput) {
                System.out.println("User wins");
                userCount++;
            } else {
                System.out.println("It is a draw.");
            }
        }
        scanner.close();

        int max = Math.max(computerCount, userCount);
        if (max == computerCount) {
            System.out.println("Computer wins");
        } else {
            System.out.println("User wins");
        }
    }

    private static Long checkTheWinner(long computerInput, long userInput) {
        if (computerInput == 0 && userInput == 2) {
            return computerInput;
        } else if (computerInput == 0 && userInput == 1) {
            return userInput;
        }

        if (computerInput == 1 && userInput == 0) {
            return computerInput;
        }
        if (computerInput == 1 && userInput == 2) {
            return userInput;
        }
        if (computerInput == 2 && userInput == 1) {
            return computerInput;
        }
        if (computerInput == 2 && userInput == 0) {
            return userInput;
        }

        return null;
    }
}
