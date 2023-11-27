package src.Chapter5;

public class Exercise_03 {
    public static void main(String[] args) {
        System.out.println("Celsius \t Fahrenheit");
        for (int number = 0; number <= 100; number += 2) {
            System.out.println(number + "\t\t " + convertCelsiusToFahrenheit(number));
        }
    }

    private static double convertCelsiusToFahrenheit(final int value)  {
        return (value * 9.0/5) + 32;
    }
}
