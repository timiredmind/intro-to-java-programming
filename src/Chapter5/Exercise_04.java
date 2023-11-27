package src.Chapter5;

//Write a program that displays the following
//table (note that 1 inch is 2.54 centimeters):

public class Exercise_04 {
    public static void main(String[] args) {
        System.out.println("Inches \t Centimeter");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t\t " + convertInchToCentimeters(i));
        }

    }

    private static double convertInchToCentimeters(final int inch) {
        return inch * 2.54;
    }
}
