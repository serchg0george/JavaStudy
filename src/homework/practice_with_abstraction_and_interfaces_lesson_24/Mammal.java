package homework.practice_with_abstraction_and_interfaces_lesson_24;

public abstract class Mammal extends Animal implements Speakable {

    Mammal(String nameMammal) {
        super(nameMammal);
        nameAnimal = nameMammal;
    }

    public abstract void runMammal();

}
