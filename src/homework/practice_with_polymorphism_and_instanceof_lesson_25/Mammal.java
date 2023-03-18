package homework.practice_with_polymorphism_and_instanceof_lesson_25;

public abstract class Mammal extends Animal implements Speakable {

    Mammal(String nameMammal) {
        super(nameMammal);
        nameAnimal = nameMammal;
    }

    public abstract void runMammal();

}
