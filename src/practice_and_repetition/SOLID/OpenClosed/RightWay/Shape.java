package practice_and_repetition.SOLID.OpenClosed.RightWay;

public interface Shape {

    // So, here we have an example of Open for extension, but Closed for modification principle
    // Let's take a look mor detailed. Instead of using 1 class AreaCalculator we use new class for each shape, that
    // we need to calculate area. And therefore we use an interface Shape with abstract calculateArea() method
    // within. Cause after these steps we can achieve closed for modification but open for extension principle.
    // Here we don't need to touch an interface Shape or exactly existing shapes to calculate those areas. We just need
    // to create another one shape class, then we need to create ShapeCalculatorClass and implement our interface.

    public int calculateArea();
}
