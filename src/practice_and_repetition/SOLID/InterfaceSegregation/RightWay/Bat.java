package practice_and_repetition.SOLID.InterfaceSegregation.RightWay;

public class Bat implements Eater, Sleeper {
    //Here we have a right way to use ISP, 'cause we have smaller interfaces with more concrete functionality.
    //That allow to us implement only needed methods
    @Override
    public void eat() {
        System.out.println("Bat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bat is sleeping");
    }
}
