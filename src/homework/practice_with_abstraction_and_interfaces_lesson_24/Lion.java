package homework.practice_with_abstraction_and_interfaces_lesson_24;

public class Lion extends Mammal {
    Lion(String nameLion) {
        super(nameLion);
        this.nameAnimal = nameLion;
    }

    @Override
    public void eatAnimal() {
        System.out.println("Lion, like all predators, likes meat.");
    }

    @Override
    public void sleepAnimal() {
        System.out.println("Most of the day lions sleeps.");
    }

    @Override
    public void runMammal() {
        System.out.println("Lions are not the fastest cats.");
    }
}
