package practice_and_repetition.SOLID.DependencyInversion.RightWay;

public class AnimalService {
    //Here we have an example of right using of dependency inversion principle
    //Our service depends on Animal interface, which is an abstraction
    //And in method performAction() we using Animal, which doesn't depend on concrete realization
    private Animal animal;

    public AnimalService(Animal animal) {
        this.animal = animal;
    }

    public void performAction() {
        animal.makeSound();
    }
}
