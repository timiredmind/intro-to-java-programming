package src.Chapter3;

import java.util.Scanner;

/**
 * randomly generates
 * a subtraction question. Revise the program to randomly generate a multiplication
 * question with two integers less than 1000
 * **/

public class Exercise_3_10 {
    public static void main(String[] args) {
        // Generate two random integers

        int number1 = (int) (Math.random() * 1000);
        int number2 = (int) (Math.random() * 1000);
        System.out.println("What is " + number1 + " * " + number2 + "? ");
        final Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        scanner.close();

        if (number2 * number1 == answer) {
            System.out.println("Your answer is correct");
        } else {
            System.out.println("The answer to " +
                                       number1 + " * " + number2 +
                                       " = " + number1 * number2
                              );
        }
    }
}
