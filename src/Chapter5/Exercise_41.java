package src.Chapter5;

import java.util.Scanner;

public class Exercise_41 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int max = 0;
        int count = 0;

        System.out.print("Enter numbers: ");
        int number;
        do {
            number = scanner.nextInt();
            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        } while (number != 0);

        scanner.close();
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
