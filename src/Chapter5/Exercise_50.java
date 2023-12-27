package src.Chapter5;

import java.util.Scanner;

/**
 * (Print multiplication table)
 * Write a program that uses for, while, and do-while loop
 * statements to display the multiplication table. H
 * **/

public class Exercise_50 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        scanner.nextLine();
        scanner.close();
        int i = 1;
        for (; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + j * i + "\t");
            }
            System.out.println();
        }

        while (i <= 6) {
            int x = 1;
            while (x <= 9) {
                System.out.print(x + " * " + i + " = " + x * i + "\t");
                x++;
            }
            System.out.println();
            i++;
        }

        do {
            int x = 1;
            while (x <= 9) {
                System.out.print(x + " * " + i + " = " + x * i + "\t");
                x++;
            }
            System.out.println();
            i++;
        } while (i <= 9);

    }
}
