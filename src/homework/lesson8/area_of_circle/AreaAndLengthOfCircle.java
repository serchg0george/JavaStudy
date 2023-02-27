package homework.lesson8.area_of_circle;

public class AreaAndLengthOfCircle {
    static final double pi = 3.14;

    public static double lengthOfCircle(double radius) {
        double circleLength = 2 * pi * radius;
        return circleLength;
    }

    public double areaOfCircle(double radius) {
        double circleArea = pi * radius * radius;
        return circleArea;
    }

    public void showInfo(double radius) {
        radius = 15;
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + areaOfCircle(15));
        System.out.println("Circle length: " + lengthOfCircle(15));
    }
}
