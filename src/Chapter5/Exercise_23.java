package src.Chapter5;

public class Exercise_23 {
    public static void main(String[] args) {
        int n = 50000;
        double sumFromLeftToRight = 0;
        double sumFromRightToLeft = 0;
        System.out.println("From left to right");

        for (int i = 1; i <= n; i++) {
            sumFromLeftToRight += 1.0/i;
        }
        System.out.println("The summation from left to right is " + sumFromLeftToRight);

        System.out.println("From right to left");
        for (int y = n; y >= 1; y--) {
            sumFromRightToLeft += 1.0/y;
        }

        System.out.println("The summation from right to left is " + sumFromRightToLeft);

    }
}
