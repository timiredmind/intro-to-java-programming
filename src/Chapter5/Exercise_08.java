package src.Chapter5;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally displays the name of
 * the student with the highest score. Use the next() method in the Scanner class
 * to read a name, rather than using the nextLine() method
 * **/
public class Exercise_08 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        String nameOfStudent = "";
        int highestScore = 0;

        for (int number = 1; number <= numberOfStudents; number++) {
            System.out.println("Enter student's name and score: ");
            String studentName = scanner.next();
            int studentScore = scanner.nextInt();

            if (studentScore > highestScore) {
                nameOfStudent = studentName;
                highestScore = studentScore;
            }
        }

        System.out.println("The student with the highest score is " + nameOfStudent);

    }
}
