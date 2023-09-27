package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_25 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the points (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter the points (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Enter the points (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        System.out.println("Enter the points (x4, y4)");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        scanner.close();

//        (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
//        (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = x3 * (y3 - y4) - (x3 - x4) * y3;
        double a = y1 - y2;
        double d = x3 - x4;
        double b = x1 - x2;
        double c = y3 - y4;

        double numerator = (a * d) - (b * c);
        if (numerator == 0) {
            System.out.println("The two lines are parallel");
        } else {
            double x = ((e * d) - (b * f)) / numerator;
            double y = ((a * f) - (e * c)) / numerator;

            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }

    }
}
