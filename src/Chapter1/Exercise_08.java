package src.Chapter1;
/*
Write a program that displays the area and perimeter of a circle
that has a radius of 6.5 using the following formula:
p = 3.14159
perimeter = 2 * radius * p
area = radius * radius * p
*/


public class Exercise_08 {

    public static void main(String[] args) {
        final Double radius = 6.5;
        final Double area = calculateArea(radius);
        final Double perimeter = calculatePerimeter(radius);

        System.out.println("Circle of radius " + radius +
                                   " has an area of [" + area +
                                   "] and a perimeter of [" + perimeter + "]");
    }
    private static Double calculateArea(final Double radius) {
        return radius * radius * Math.PI;
    }

    private static Double calculatePerimeter(final Double radius) {
        return 2 * radius * Math.PI;
    }
}
