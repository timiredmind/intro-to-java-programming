package src.Chapter5;

import java.util.Scanner;

public class Exercise_17 {
    /**
     * Write a program that prompts the user to enter an integer from
     * 1 to 15 and displays a pyramid,
     */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input < 1 || input > 15) {
            System.out.println("Enter the number of lines: ");
            input = scanner.nextInt();
        }

        for (int x = input; x >= 1; x--) {
            if (x == 1) {
                System.out.println(1);
                break;
            }

            for (int y = input; y >= 1; y--) {
                System.out.print(y + " ");
            }
            for (int z = 2 ;z <= input; z++) {
                System.out.print(z + " ");
            }
            System.out.println();
            input--;
        }
    }
}
