package practice_and_repetition.SOLID.DependencyInversion.RightWay;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof-woof!");
    }
}
