package homework.practice_encapsulation_lesson_22.encapsulation_with_inheritance;

public class CatEncapsulationWithInheritance extends PetEncapsulationWithInheritance{
    CatEncapsulationWithInheritance(StringBuilder catName){
        catName = new StringBuilder("Bella♥");
        setPetName(catName);
        System.out.println("I'm a cat and my name is: " + catName);
    }

    public void showCatSleep() {
        System.out.println("Cat sleeps ♥♥♥");
    }
}
