package homework.lesson8.area_of_circle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Circle length " + AreaAndLengthOfCircle.lengthOfCircle(15));

        AreaAndLengthOfCircle areaAndLengthOfCircle = new AreaAndLengthOfCircle();
        System.out.println("Circle area " + areaAndLengthOfCircle.areaOfCircle(15));
        areaAndLengthOfCircle.showInfo(15);
    }
}
