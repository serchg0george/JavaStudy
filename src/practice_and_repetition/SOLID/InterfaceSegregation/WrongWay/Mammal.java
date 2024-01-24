package practice_and_repetition.SOLID.InterfaceSegregation.WrongWay;

public interface Mammal {
    //Here we have an example of violation of ISP, because, as you can see, we have method makeSound which can't allowed
    //by, for example, bats. Bats are silent :)
    //Instead of use this Mammal interface we should separate it to three different interfaces
    void eat();

    void sleep();

    void makeSound();
}
