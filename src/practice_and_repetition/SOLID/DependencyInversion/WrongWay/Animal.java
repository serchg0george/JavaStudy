package practice_and_repetition.SOLID.DependencyInversion.WrongWay;

public class Animal {
    //Here we have example of violation of dependency inversion principle
    //Class that's represent an animal depends on concrete realization of concrete animal
    //In that case from realization of Dog class
    public void makeSound() {
        Dog dog = new Dog();
        dog.bark();
    }
}
