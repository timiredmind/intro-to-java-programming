package src.Chapter5;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the number of students and each student’s name and
 * score, and finally displays the names of the students with the lowest and second-lowest scores
 **/

public class Exercise_09 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);


        // Prompt user to get number of students
        System.out.println("Enter the number of students");
        int numberOfStudents = scanner.nextInt();

        String[] namesOfStudents = new String[numberOfStudents];
        double[] scores = new double[numberOfStudents];

        for (int index = 0; index < numberOfStudents; index++) {
            System.out.println("Enter student's name and score: ");
            namesOfStudents[index] = scanner.next();
            scores[index] = scanner.nextDouble();
        }

        int lowestScoreIndex = getLowestScoreIndex(scores);

        int secondLowestScoreIndex = getSecondLowestScoreIndex(scores, lowestScoreIndex);

        System.out.println("The name of the student with the lowest score is " +
                                   namesOfStudents[lowestScoreIndex]);

        System.out.println("The name of the student with the second lowest score is " +
                                   namesOfStudents[secondLowestScoreIndex]);

    }

    private static int getLowestScoreIndex(double[] scoreOfStudents) {
        int lowestScoreIndex = 0;
        for (int index = 0; index < scoreOfStudents.length - 1; index++) {
            if (scoreOfStudents[index] < scoreOfStudents[lowestScoreIndex]) {
                lowestScoreIndex = index;
            }
        }
        return lowestScoreIndex;
    }

    private static int getSecondLowestScoreIndex(double[] scoreOfStudents, int lowestScoreIndex) {
        int secondLowestScoreIndex = lowestScoreIndex == 0 ? 1 : 0;
        for (int index = 0; index < scoreOfStudents.length ; index++) {
            if (index != lowestScoreIndex && scoreOfStudents[index] < scoreOfStudents[secondLowestScoreIndex]) {
                secondLowestScoreIndex = index;
            }
        }
        return secondLowestScoreIndex;
    }
}
