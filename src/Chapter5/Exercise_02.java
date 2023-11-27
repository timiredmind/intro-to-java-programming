package src.Chapter5;

import java.util.Random;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        final Scanner scanner = new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS = 12;
        String output = "";
        int correctCount = 0;
        int count = 1;
        final Random random = new Random();
        while (count <= NUMBER_OF_QUESTIONS) {
            int number1 = random.nextInt(1, NUMBER_OF_QUESTIONS + 1);
            int number2 = random.nextInt(1, NUMBER_OF_QUESTIONS + 1);

            System.out.println("What is " + number1 + " * " + number2 + " ?");
            int answer = scanner.nextInt();

            if (answer == (number1 * number2)) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n"
                                           + number1 + " * " + number2 + " = " + number1 * number2);
            }

            count++;
            output += "\n" + number1 + " * " + number2 + " = " +
                    ((number1 * number2 == answer) ? "correct" : "wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
                                   "\nTest time is " + testTime / 1000 + " seconds\n" +
                                   output);

    }

}
