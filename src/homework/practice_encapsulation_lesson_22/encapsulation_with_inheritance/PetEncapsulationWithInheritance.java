package homework.practice_encapsulation_lesson_22.encapsulation_with_inheritance;

public class PetEncapsulationWithInheritance extends AnimalEncapsulationWithInheritance {
    final int petTail = 1;
    final int petPaws = 4;
    private StringBuilder petName;

    PetEncapsulationWithInheritance() {
        System.out.println("I'm a pet ");
        setAnimalEyes(2);
    }

    public void showPetRun() {
        System.out.println("Pet runs ");
    }

    public void showPetJump() {
        System.out.println("Pet jumps ");
    }

    public StringBuilder getPetName() {
        StringBuilder stringBuilder = new StringBuilder(petName);
        return stringBuilder;
    }

    public void setPetName(StringBuilder petName) {
        this.petName = petName;
    }
}
