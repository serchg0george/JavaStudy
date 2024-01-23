package practice_and_repetition.SOLID.OpenClosed.RightWay;

public class RectangleAreaCalculator implements Shape {
    Rectangle rectangle;

    @Override
    public int calculateArea() {
        return rectangle.weight * rectangle.height;
    }
}
