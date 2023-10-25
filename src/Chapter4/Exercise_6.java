package src.Chapter4;

public class Exercise_6 {
    public static void main(String[] args) {
        final double RADIUS = 40;
        // Generate random angles in radian between 0 and 2*PI
        final double angle1 = Math.random() * (Math.PI * 2);
        final double angle2 = Math.random() * (Math.PI * 2);
        final double angle3 = Math.random() * (Math.PI * 2);

        // Calculate the positions
        final double x1 = RADIUS * Math.cos(angle1);
        final double y1 = RADIUS * Math.sin(angle1);

        final double x2 = RADIUS * Math.cos(angle2);
        final double y2 = RADIUS * Math.sin(angle2);

        final double x3 = RADIUS * Math.cos(angle3);
        final double y3 = RADIUS * Math.sin(angle3);

        // calculate the distances between the three points
        final double sideA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        final double sideB = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        final double sideC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        final double angleA = Math.toDegrees(
                Math.acos(
                        (Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2))
                        / (2 * sideB * sideC)));

        final double angleB = Math.toDegrees(
                Math.acos(
                        (Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2))
                        / (2 * sideA * sideC)));

        final double angleC = Math.toDegrees(
                Math.acos(
                        (Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2))
                                / (2 * sideA * sideB)));

        System.out.println("The three angles are " +
                                   Math.round(angleA) + ", " +
                                   Math.round(angleB) + ", " +
                                   Math.round(angleC));
    }
}
