package homework.practice_encapsulation_lesson_22.encapsulation_with_inheritance;

public class AnimalEncapsulationWithInheritance {
     private int animalEyes;

    AnimalEncapsulationWithInheritance() {
        System.out.println("I am an animal ");
    }


    public void showAnimalEat() {
        System.out.println("Animal eats ");
    }

    public void showAnimalDrink() {
        System.out.println("Animal drinks ");
    }

    public int getAnimalEyes() {
        return animalEyes;
    }

    public void setAnimalEyes(int animalEyes) {
        this.animalEyes = animalEyes;
    }
}
