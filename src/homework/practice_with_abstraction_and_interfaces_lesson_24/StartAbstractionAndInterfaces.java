package homework.practice_with_abstraction_and_interfaces_lesson_24;

public class StartAbstractionAndInterfaces {
    public static void main(String[] args) {
        Swordtail swordtail = new Swordtail("Swordtail name 1");
        System.out.println(swordtail.nameAnimal);
        swordtail.eatAnimal();
        swordtail.swimFish();
        swordtail.sleepAnimal();

        Speakable penguin = new Penguin("Penguin name 1");
        penguin.speakSpeakable();

        Animal lion = new Lion("Lion name 1");
        System.out.println(lion.nameAnimal);
        lion.eatAnimal();
        lion.sleepAnimal();

        Mammal mammal = new Lion("Lion name 2");
        System.out.println(mammal.nameAnimal);
        mammal.eatAnimal();
        mammal.sleepAnimal();
        mammal.speakSpeakable();
        mammal.runMammal();

    }
}
