package homework.practice_with_abstraction_and_interfaces_lesson_24;

public class Swordtail extends Fish {

    Swordtail(String nameSwordtail) {
        super(nameSwordtail);
        this.nameAnimal = nameSwordtail;
    }

    @Override
    public void eatAnimal() {
        System.out.println("Swordtail isn't predatory fish, and he eats common fish food :)");
    }

    @Override
    public void swimFish() {
        System.out.println("Swordtail is a beautiful fish that swims fast!");
    }
}
