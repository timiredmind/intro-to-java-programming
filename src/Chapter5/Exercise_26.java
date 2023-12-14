package src.Chapter5;

public class Exercise_26 {
    public static void main(String[] args) {
        int start = 10_000;
        int end = 100_000;
        for (int value = start; value <= end; value += 10_000) {
            double e = calcuateE(value);
            System.out.println("The value of e when i is " + value + " is " + e);
        }
    }

    private static double calculateFactorial(long value) {
        double factorial = 1;
        for (int x = 1; x <= value; x++) {
            factorial *= x;
        }
        return factorial;
    }

    private static double calcuateE(long value) {
        double e = 0.0;
        for (long i = value; i >= 1; i--) {
            e += (1 / calculateFactorial(i));
        }
        return e;
    }
}
