package src.Chapter1;

/**
 * You can use Cramer’s rule to solve the
 * following 2 * 2 system of linear equation provided that ad – bc is not 0:
 * **/

public class Exercise_13 {
    public static void main(String[] args) {
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + .55y = 5.9");

        double a = 3.4;
        double b = 50.2;
        double e = 44.5;

        double c = 2.1;
        double d = 0.55;
        double f = 5.9;



        final double x = ((e * d) + (b * f) )/ ((a * d) + (b - c));
        final double y = ((a * f) - (e * c)) / ((a * d) + (b - c));

        System.out.println("x = " + x + " y = " + y);
    }
}
