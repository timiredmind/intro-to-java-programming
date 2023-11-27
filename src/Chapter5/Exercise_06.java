package src.Chapter5;
//Write a program that displays the following
//two tables side by side (note that 1 ping = 3.305 square meters)

import java.text.DecimalFormat;

public class Exercise_06 {
    private static final double PING_PER_SQUARE_METER = 3.305;

    public static void main(String[] args) {
        final int MAX_COUNT = 14;
        final DecimalFormat decimalFormat = new DecimalFormat("0.000");
        int ping = 10;
        int squareMeter = 30;
        System.out.println("Ping    Square meter | Square meter     Ping");

        for (int i = 0; i <= MAX_COUNT; i++) {
            System.out.println(
                    String.format("%s %7s  | %s %7s",
                                  ping,
                                  decimalFormat.format(
                                          convertPingToSquareMeter(ping)),
                                  squareMeter,
                                  decimalFormat.format(
                                          convertSquareMetersToPing(squareMeter))
                                 ));

            ping += 5;
            squareMeter += 5;
        }

    }

    public static double convertPingToSquareMeter(final int ping) {
        return ping * PING_PER_SQUARE_METER;
    }

    public static double convertSquareMetersToPing(final int squareMeters) {
        return squareMeters / PING_PER_SQUARE_METER;
    }
}
