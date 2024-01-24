package practice_and_repetition.SOLID.InterfaceSegregation.RightWay;

public class Rabbit implements Eater, Sleeper {
    @Override
    public void eat() {
        System.out.println("Rabbit is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Rabbit is sleeping");
    }
}
