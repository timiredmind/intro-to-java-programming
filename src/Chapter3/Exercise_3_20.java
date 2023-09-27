package src.Chapter3;

import java.util.Scanner;

/**
 * Programming Exercise 2.17 gives a formula to
 * compute the wind-chill temperature. The formula is valid for temperatures in the
 * range between -58°F and 41°F and wind speed greater than or equal to 2. Write
 * a program that prompts the user to enter a temperature and a wind speed.
 * The program displays the wind-chill temperature if the input is valid; otherwise,
 * it displays a message indicating whether the temperature and/or wind speed is invalid
 * **/

public class Exercise_3_20 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        final double temperature = scanner.nextDouble();
        System.out.println("Enter the wind speed: ");
        final double windSpeed = scanner.nextDouble();

        if (temperature < -58 || temperature > 41 ) {
            System.out.println("The temperature is invalid, "
                                       + "it should be between the range -58 and 41");
        } else if (windSpeed < 2 ) {
            System.out.println("The wind speed is invalid, it should be greater than or equal 2");
        } else {
            final double windChillTemperature =
                    35.74 + (0.6215 * temperature) +
                            (35.75 * Math.pow(windSpeed, 0.16)) +
                            (0.4275 * temperature * Math.pow(windSpeed, 0.16));

            System.out.println("The wind-chill temperature is " + windChillTemperature);
        }
    }
}
