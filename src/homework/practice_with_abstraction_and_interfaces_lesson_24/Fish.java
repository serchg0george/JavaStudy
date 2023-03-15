package homework.practice_with_abstraction_and_interfaces_lesson_24;

public abstract class Fish extends Animal {

    Fish(String nameAnimal) {
        super(nameAnimal);
        this.nameAnimal = nameAnimal;
    }

    public abstract void swimFish();

    @Override
    public void sleepAnimal() {
        System.out.println("It's always interesting to watch how the fish sleep");
    }
}
