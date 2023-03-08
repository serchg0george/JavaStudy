package homework.practice_encapsulation_lesson_22.encapsulation_with_inheritance;

public class DogEncapsulationWithInheritance extends PetEncapsulationWithInheritance {
    DogEncapsulationWithInheritance(StringBuilder dogName) {
        dogName = new StringBuilder("Joey");
        setPetName(dogName);
        System.out.println("I'm a dog and my name is: " + dogName);
    }

    public void showDogPlay() {
        System.out.println("Dog plays :)");
    }
}
