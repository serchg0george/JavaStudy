package homework.practice_with_abstraction_and_interfaces_lesson_24;

public class Penguin extends Bird {

    Penguin(String namePenguin) {
        super(namePenguin);
        this.nameAnimal = namePenguin;
    }

    @Override
    public void eatAnimal() {
        System.out.println("Penguins loves to eat fish!");
    }

    @Override
    public void sleepAnimal() {
        System.out.println("Penguins sleeps close to each other ^_^");
    }

    @Override
    public void flyBird() {
        System.out.println("Penguins aren't flying bird");
    }

    @Override
    public void speakSpeakable() {
        System.out.println("Penguins can't sing like nightingale");
    }
}
