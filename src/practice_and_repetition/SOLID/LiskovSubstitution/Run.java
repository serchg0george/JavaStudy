package practice_and_repetition.SOLID.LiskovSubstitution;

public class Run {

    //There is a Liskov's Substitution Principle in action.
    //We can see that we have a method makeBirdFly() which uses Bird class as a parameter
    //but, as expected, we can use child classes of Bird instead of Bird object here.
    //This was made possible thanks to LSP.

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        makeBirdFly(sparrow);
        makeBirdFly(penguin);
    }

    static void makeBirdFly(Bird bird) {
        bird.fly();
    }
}
