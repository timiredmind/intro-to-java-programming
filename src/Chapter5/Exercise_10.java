package src.Chapter5;

/**
 * Write a program that displays all the numbers from 100 to 1,000, ten per line, that are divisible
 * by 3 and 4. Numbers are separated by exactly one space
 **/


public class Exercise_10 {
    public static void main(String[] args) {
        final int start = 100;
        final int end = 1_000;

        int numberPerPage = 0;
        for (int number = start; number <= end; number++) {
            if (number % 4 == 0 && number % 3 == 0) {
                numberPerPage++;
                System.out.print(number + " ");
                if (numberPerPage == 10) {
                    System.out.print("\n");
                    numberPerPage = 0;
                }
            }
        }
    }
}
