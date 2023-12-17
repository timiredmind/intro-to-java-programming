package src.Chapter5;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {

        //Generate first digit
        final int firstDigit = (int) (Math.random() * 10);
        int secondDigit;
        do {
            secondDigit = (int) (Math.random() * 10);
        } while (firstDigit == secondDigit);

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = scanner.nextInt();
        scanner.close();

        final int guessDigit1 = guess / 10;
        final int guessDigit2 = guess % 10;
        final int lotteryNumber = (firstDigit * 10) + secondDigit;
        System.out.println("The lottery number is " + lotteryNumber);
        if (firstDigit == guessDigit1 && secondDigit == guessDigit2) {
            System.out.println("Exact match: you win $10,000");
        } else if (firstDigit == guessDigit2 && secondDigit == guessDigit1) {
            System.out.println("Match all digits: you win $3,000");
        } else if (
                firstDigit == guessDigit1 || secondDigit == guessDigit2
                        || firstDigit == guessDigit2 || secondDigit == guessDigit1) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry no match");
        }
    }
}
