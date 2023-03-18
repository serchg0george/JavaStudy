package homework.practice_with_polymorphism_and_instanceof_lesson_25;

public abstract class Animal {
    String nameAnimal;

    Animal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public abstract void eatAnimal();

    public abstract void sleepAnimal();
}
