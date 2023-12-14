package src.Chapter5;

public class Exercise_24 {
    public static void main(String[] args) {
        double start = 1.0;
        int end = 99;
        double sum = 0;
        for (double n = start; n <= end; n += 2) {
            sum += (n / (n + 2));
        }
        System.out.println("The sum of the series is " + sum);
    }
}
