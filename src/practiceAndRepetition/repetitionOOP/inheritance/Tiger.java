package practiceAndRepetition.repetitionOOP.inheritance;

public class Tiger extends Animal{

    public static void main(String[] args) {
       Tiger tiger = new Tiger();

       tiger.setPaws(4);
       tiger.setAnimalName("My favorite tiger ♥♥♥");

        System.out.println(tiger.getAnimalName() + " " + tiger.getPaws());

    }

}
