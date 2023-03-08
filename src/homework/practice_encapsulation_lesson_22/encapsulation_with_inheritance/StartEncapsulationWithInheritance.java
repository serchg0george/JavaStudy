package homework.practice_encapsulation_lesson_22.encapsulation_with_inheritance;

public class StartEncapsulationWithInheritance {
    public static void main(String[] args) {
        DogEncapsulationWithInheritance dogPaws = new DogEncapsulationWithInheritance(new StringBuilder());
        System.out.println(dogPaws.petPaws);

        CatEncapsulationWithInheritance catSleeps = new CatEncapsulationWithInheritance(new StringBuilder());
        catSleeps.showCatSleep();
    }
}
