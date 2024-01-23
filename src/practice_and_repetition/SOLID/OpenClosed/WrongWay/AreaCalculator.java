package practice_and_repetition.SOLID.OpenClosed.WrongWay;

public class AreaCalculator {

    // In this case we have a violation of Open/Closed principle example
    // Whenever we need to calculate new shape area we need to change AreaCalculator class
    // And this is a great example of wrong approach
    // Instead of this we need to do the same things but in different way

    public int calculateRectangleArea(Rectangle rectangle){
        return rectangle.height * rectangle.weight;
    }

    public int calculateCircleArea(Circle circle) {
        return circle.radius * 3;
    }
}
