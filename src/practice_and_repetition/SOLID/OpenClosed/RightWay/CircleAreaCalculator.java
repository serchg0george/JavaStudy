package practice_and_repetition.SOLID.OpenClosed.RightWay;

public class CircleAreaCalculator implements Shape {

    Circle circle;
    @Override
    public int calculateArea() {
        return circle.radius * 3;
    }
}
