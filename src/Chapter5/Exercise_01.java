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
        System.out.println("Enter your score: ");
        final int score = scanner.nextInt();

        if (score >= 60) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You don't pass the exam.");
        }
        System.exit(-1);
    }
}
