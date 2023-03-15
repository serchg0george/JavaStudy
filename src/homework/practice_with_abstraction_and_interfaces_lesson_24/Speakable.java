package homework.practice_with_abstraction_and_interfaces_lesson_24;

import java.util.logging.Logger;

public interface Speakable {
    default void speakSpeakable() {
        System.out.println("Somebody speaks!");
    }
}
