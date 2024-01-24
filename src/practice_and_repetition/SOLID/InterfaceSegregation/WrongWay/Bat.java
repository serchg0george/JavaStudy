package practice_and_repetition.SOLID.InterfaceSegregation.WrongWay;

public class Bat implements Mammal {
    @Override
    public void eat() {
        System.out.println("Eat something");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Bats doesn't make a sound");
    }
}
