package src.Chapter5;

/**
 * Write a program that displays the p value for i = 10000, 20000, …, and 100000.
 **/

public class Exercise_25 {
    public static void main(String[] args) {
        int value = 10_000;
        while(value <= 100_000) {
            double piValue = calculatePIValue(value);
            System.out.println("The value of pi for the value " + value + " is " + piValue);
            value += 10_000;
        }
    }

    private static double calculatePIValue(long value) {
        double sum = 0;
        for (int i = 1; i <= value; i++) {
            sum += (Math.pow(-1, i + 1) / (2 * i - 1));
        }
        return sum * 4;
    }
}
