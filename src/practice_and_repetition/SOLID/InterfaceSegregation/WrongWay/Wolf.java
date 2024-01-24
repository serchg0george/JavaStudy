package practice_and_repetition.SOLID.InterfaceSegregation.WrongWay;

public class Wolf implements Mammal {
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
        System.out.println("Wof wof");
    }
}
