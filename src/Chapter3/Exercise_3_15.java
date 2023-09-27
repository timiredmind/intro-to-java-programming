package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_15 {
    public static void main(String[] args) {
        // Generate three-digit number
        final int lotteryNumber = (int) (Math.random() * 1000);

        int firstDigit = lotteryNumber / 100;
        int temp = lotteryNumber % 100;

        int secondDigit = temp / 10;
        temp %= 10;

        int thirdDigit = temp;

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three-digit number: ");
        int userGuess = scanner.nextInt();
        scanner.close();

        int userFirstDigit = userGuess / 100;
        userGuess %= 100;

        int userSecondDigit = userGuess / 10;
        userGuess %= 10;

        int userThirdDigit = userGuess;

        System.out.println("The lottery number is " + lotteryNumber);
        if (userGuess == lotteryNumber) {
            System.out.println("You are awarded $12,000");
        } else if (
                (firstDigit == userSecondDigit && secondDigit == userThirdDigit
                        && thirdDigit == userFirstDigit) ||
                (secondDigit == userThirdDigit && thirdDigit == userSecondDigit
                        && firstDigit == userFirstDigit) ||
                (firstDigit == userSecondDigit && secondDigit == userFirstDigit
                        && thirdDigit == userThirdDigit) ||
                (firstDigit == userThirdDigit && thirdDigit == userFirstDigit
                        && secondDigit == userSecondDigit) ||
                (firstDigit == userThirdDigit && secondDigit == userFirstDigit
                        && thirdDigit == userSecondDigit)
        ) {
            System.out.println("You are awarded $5,000");
            
        } else if (firstDigit == userSecondDigit || firstDigit == userThirdDigit || firstDigit == userFirstDigit
                || secondDigit == userFirstDigit || secondDigit == userThirdDigit || secondDigit == userSecondDigit
                || thirdDigit == userFirstDigit || thirdDigit == userSecondDigit || thirdDigit == userThirdDigit
        ) {
            System.out.println("You are awarded $2,000");

        } else {
            System.out.println("You lost out on the lottery");
        }
    }
}
