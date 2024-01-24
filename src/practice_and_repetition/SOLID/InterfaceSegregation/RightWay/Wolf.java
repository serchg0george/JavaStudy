package practice_and_repetition.SOLID.InterfaceSegregation.RightWay;

public class Wolf implements Eater, Sleeper, SoundMaker {
    @Override
    public void eat() {
        System.out.println("Wolf is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Wolf is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Wolf is howling");
    }
}
