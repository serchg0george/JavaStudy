package homework.practice_with_polymorphism_and_instanceof_lesson_25;

public abstract class Bird extends Animal implements Speakable {

    Bird(String nameBird) {
        super(nameBird);
        this.nameAnimal = nameBird;
    }

    public abstract void flyBird();

    @Override
    public void animalSpeaks() {
        System.out.println(super.nameAnimal + " sings!");
    }
}
