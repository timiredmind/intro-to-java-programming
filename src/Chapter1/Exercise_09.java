package src.Chapter1;

/*
* Write a program that displays the area and perimeter of a rectangle
* with a width of 5.3 and height of 8.6 using the following formula:
* area = width * height
perimeter = 2 * (width + height)
*/

public class Exercise_09 {
    public static void main(String[] args) {
        final Double width = 5.3;
        final Double height = 8.6;

        final Double area = calculateAreaOfRectangle(width, height);
        final Double perimeter = calculatePerimeterOfRectangle(width, height);

        System.out.println("A rectangle with width [" + width + "] and height [" + height +
                                   "] has an area of [" + area + "] and a perimeter of ["
                                   + String.format("%.2f" ,perimeter) + "]");
    }

    private static Double calculateAreaOfRectangle(Double width, Double height) {
        return width * height;
    }

    private static Double calculatePerimeterOfRectangle(Double width, Double height) {
        return 2 * (width + height);
    }

}
