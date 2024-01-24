package practice_and_repetition.SOLID.InterfaceSegregation.WrongWay;

public class Rabbit implements Mammal {
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
        System.out.println("Rabbit don't make a sound :)");
    }
}
