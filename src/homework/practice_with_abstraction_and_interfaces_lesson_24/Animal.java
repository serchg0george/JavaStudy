package homework.practice_with_abstraction_and_interfaces_lesson_24;

public abstract class Animal {
    String nameAnimal;

    Animal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public abstract void eatAnimal();

    public abstract void sleepAnimal();
}
