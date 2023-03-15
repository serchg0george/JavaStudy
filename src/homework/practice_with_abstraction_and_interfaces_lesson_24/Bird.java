package homework.practice_with_abstraction_and_interfaces_lesson_24;

import java.util.logging.Logger;

public abstract class Bird extends Animal implements Speakable {

    Bird(String nameBird) {
        super(nameBird);
        this.nameAnimal = nameBird;
    }

    public abstract void flyBird();

    @Override
    public void speakSpeakable() {
        System.out.println(super.nameAnimal + " sings!");
    }
}
