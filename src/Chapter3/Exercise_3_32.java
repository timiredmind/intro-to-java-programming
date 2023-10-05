package src.Chapter3;

import java.util.Scanner;

/**
 * Given a directed line from point p0(x0, y0) to p1(x1,
 * y1), you can use the following condition to decide whether a point p2(x2, y2) is on
 * the left of the line, on the right, or on the same line
 * */
public class Exercise_3_32 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates for p0 (x0, y0): ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();

        System.out.println("Enter the coordinates for p1 (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates for p2 (x2, y2)");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        scanner.close();

        double location = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        boolean limitForXInLineSegment = (x0 <= x2 && x2 <= x1) || (x0 >= x2 && x1 <= x2);
        boolean limitForYinLineSegment = (y0 <= y2 && y2 <= y1) || (y0 >= y2 && y1 <= y2);
        boolean limitForPoint = (limitForXInLineSegment && limitForYinLineSegment);



        if (location == 0 && limitForPoint) {
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from ("
                                       + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from ("
                                       + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
    }
}


