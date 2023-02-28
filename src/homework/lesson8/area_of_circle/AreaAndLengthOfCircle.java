package homework.lesson8.area_of_circle;

public class AreaAndLengthOfCircle {
    static final double PI = 3.14;
    

    public static double calculateLengthOfCircle(double radiusForLength) {
        double circleLength = 2 * PI * radiusForLength;
        return circleLength;
    }

    public double calculateAreaOfCircle(double radiusForArea) {
        double circleArea = PI * radiusForArea * radiusForArea;
        return circleArea;
    }

    public void showInfo(double radius) {
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + calculateAreaOfCircle(15));
        System.out.println("Circle length: " + calculateLengthOfCircle(15));
    }
}
