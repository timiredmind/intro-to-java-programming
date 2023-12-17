package src.Chapter5;

/**
 * A positive integer is called a perfect number if it is equal to the
 * sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect
 * number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There
 * are four perfect numbers 6 10,000. Write a program to find all these four numbers
 * **/

public class Exercise_33 {
    public static void main(String[] args) {
        for (int number = 2; number <= 10_000; number++) {
            if(isPerfectNumber(number)) {
                System.out.println(number);
            }
        }
    }
    private static boolean isPerfectNumber(long number) {
        long sum = 1;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum+= i;
            }
        }
        return number == sum;
    }
}
