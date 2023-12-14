package src.Chapter5;

public class Exercise_20 {
    public static void main(String[] args) {
        int start = 2;
        int end = 1200;
        int NUMBER_PER_LINE = 0;
        for (int number = start; number <= end ; number++) {
            if (isPrimeNumber(number)) {
                System.out.print(number + " ");
                NUMBER_PER_LINE++;
                if (NUMBER_PER_LINE == 8) {
                    NUMBER_PER_LINE = 0;
                    System.out.print("\n");
                }
            }

        }
    }

    private static boolean isPrimeNumber(long number) {
        for (int divisor = 2; divisor <= number/2 ; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
