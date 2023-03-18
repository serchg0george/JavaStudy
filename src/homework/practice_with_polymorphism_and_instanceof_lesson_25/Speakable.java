package homework.practice_with_polymorphism_and_instanceof_lesson_25;

public interface Speakable {
    default void animalSpeaks() {
        System.out.println("Somebody speaks!");
    }
}
