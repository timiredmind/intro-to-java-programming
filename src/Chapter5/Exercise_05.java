package src.Chapter5;

import java.text.DecimalFormat;

public class Exercise_05 {
    public static void main(String[] args) {
        final DecimalFormat decimalFormat = new DecimalFormat("0.000");
        final int count = 50;
        int celsiusTemperature = 0;
        int fahrenheitTemperature = 20;

        System.out.println("Celsius Fahrenheit | Fahrenheit Celsius");

        for (int i = 0; i <= count; i++) {
            System.out.println(
                    String.format("%-7d %-15s | %-7d %-15s%n",
                                  celsiusTemperature,
                                  decimalFormat.format(
                                          convertCelsiusToFahrenheit(celsiusTemperature)),
                                  fahrenheitTemperature,
                                  decimalFormat.format(
                                          convertFahrenheitToCelsius(fahrenheitTemperature)))
                              );
            celsiusTemperature += 2;
            fahrenheitTemperature += 5;
        }

    }

    private static double convertCelsiusToFahrenheit(final int celsius) {
        return (celsius * 9 / 5.000) + 32.000;
    }

    private static double convertFahrenheitToCelsius(final int fahrenheit) {
        return (fahrenheit - 32.000) / 1.8;
    }
}
