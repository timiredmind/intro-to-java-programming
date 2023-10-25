package src.Chapter4;

public class Exercise_3 {
    final static double EARTH_RADIUS = 6371.01;

    public static void main(String[] args) {

        //Atlanta (lat, long)
        final double x1 = 33.7489954;
        final double y1 = -84.387982;

        // charlotte(lat, long)
        final double x2 = 35.2270869;
        final double y2 = -80.8431267;
        // savannah(lat, long)
        final double x3 = 32.0835407;
        final double y3 = -81.0998342;
        // orlando(lat, long)
        final double x4 = 28.5383355;
        final double y4 = -81.3792365;

        // calculate the distance between atlanta and charlotte
        final double d1 = calculateDistance(x1, y1, x2, y2);

        // calculate the distance between charlotte and savannah
        final double d2 = calculateDistance(x2, y2, x3, y3);

        // calculate the distance between atlanta and savannah
        final double d3 = calculateDistance(x1, y1, x3, y3);

        // calculate the distance between atlanta and orlando
        final double d4 = calculateDistance(x1, y1, x4, y4);

        // calculate the distance between orlando and savannah
        final double d5 = calculateDistance(x3, y3, x4, y4);

        // calculate area1
        final double area1 = calculateArea(d1, d2, d3);
        final double area2 = calculateArea(d3, d4, d5);

        final double totalArea = area1 + area2;

    }

    public static double calculateDistance(
            final double x1, final double y1, final double x2, final double y2) {
        final double x1Radian = Math.toRadians(x1);
        final double y1Radian = Math.toRadians(y1);
        final double x2Radian = Math.toRadians(x2);
        final double y2Radian = Math.toRadians(y2);

        return EARTH_RADIUS * Math.acos(
                Math.sin(x1Radian) * Math.sin(x2Radian) + Math.cos(x1Radian) * Math.cos(x2Radian)
                        * Math.cos(y1Radian - y2Radian));
    }

    public static double calculateArea(final double s1, final double s2, final double s3) {
        // calculate s
        final double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }
}
