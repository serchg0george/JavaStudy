package homework.practice_with_polymorphism_and_instanceof_lesson_25;


public class StartPolymorphismInstanceOf {
    public static void main(String[] args) {

        Animal animalLion = new Lion("Simba");
        Animal animalSwordtail = new Swordtail("Swordtail fish heh");
        Animal animalPenguin = new Penguin("Penguin pingvin");

        Speakable speakLion = new Lion("Speakable lion");
        Speakable speakPenguin = new Penguin("Speakable penguin");
        Speakable [] speakable = {speakLion, speakPenguin};
        Animal[] animals = {animalLion, animalSwordtail, animalPenguin};

        for (Speakable speak :
                speakable) {
            if (speak instanceof Lion) {
                speak.animalSpeaks();
                ((Lion) speak).sleepAnimal();
                ((Lion) speak).eatAnimal();
                ((Lion) speak).runMammal();
            } else if (speak instanceof Penguin) {
                speak.animalSpeaks();
                ((Penguin) speak).eatAnimal();
                ((Penguin) speak).sleepAnimal();
                ((Penguin) speak).flyBird();
            } else {
                System.out.println("Something goes wrong");
            }
            System.out.println("----------------------------------");
        }
        for (Animal animal :
                animals) {
            if (animal instanceof Lion){
                Lion lion = (Lion) animal;
                System.out.println(lion.nameAnimal);
                lion.sleepAnimal();
                lion.eatAnimal();
                lion.animalSpeaks();
                lion.runMammal();
            } else if (animal instanceof Swordtail) {
                Swordtail swordtail = (Swordtail) animal;
                System.out.println(swordtail.nameAnimal);
                swordtail.swimFish();
                swordtail.sleepAnimal();
                swordtail.eatAnimal();
            } else if (animal instanceof Penguin) {
                Penguin penguin = (Penguin) animal;
                System.out.println(penguin.nameAnimal);
                penguin.flyBird();
                penguin.eatAnimal();
                penguin.animalSpeaks();
                penguin.sleepAnimal();
            } else {
                System.out.println("Oops, something went wrong!");
            }
            System.out.println("-----------------------------------");
        }
    }
}
