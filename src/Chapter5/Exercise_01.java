package src.Chapter5;

import java.util.Scanner;

/***
 * Write a program that prompts a student to enter a Java score. If the
 * score is greater or equal to 60, display “you pass the exam”; otherwise, display “you
 * don’t pass the exam”. Your program ends with input -1. Here is a sample run
 * **/

public class Exercise_01 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int score = 0;
        while (score != -1) {
            System.out.println("Enter your score: ");
            score = scanner.nextInt();

            String message;
            if (score >= 60) {
                message = "You passed the exam.";
            } else if (score == -1) {
                message = "No numbers are entered except 0";
            } else {
                message = "You don't pass the exam.";
            }
            System.out.println(message);
        }
    }
}
