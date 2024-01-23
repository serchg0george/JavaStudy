package practice_and_repetition.SOLID.SingleResponsibility.RightWay;

public class Calculator {

    //Here we can see the right way using of SRP,
    //the Calculator calculate and the PrintResult class printing results
    public static int sum(int first, int second) {
        return first + second;
    }

    public static int multiply(int first, int second) {
        return first * second;
    }

}
