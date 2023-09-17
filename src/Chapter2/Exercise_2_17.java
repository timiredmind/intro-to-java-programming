package src.Chapter2;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class Exercise_2_17 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature;
        do {
            temperature = scanner.nextDouble();
        } while (!(temperature >= -58) || !(temperature <= 41));

        System.out.println("Enter the wind speed (> = 2) in miles per hour: ");
        double speed;
        do {
            speed = scanner.nextDouble();
        } while (speed < 2);

        scanner.close();

        double index = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(speed, 0.16)) +
                (0.4275 * temperature * Math.pow(speed, 0.16));
        System.out.println("The wind chill index is " + index);


    }
}
