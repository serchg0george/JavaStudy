package practice_and_repetition.SOLID.SingleResponsibility.RightWay;

import static practice_and_repetition.SOLID.SingleResponsibility.RightWay.Calculator.multiply;
import static practice_and_repetition.SOLID.SingleResponsibility.RightWay.Calculator.sum;

public class PrintResult {
    //Here we can see the right way using of SRP,
    //the Calculator calculate and the PrintResult class printing results

    public void printResult() {
        System.out.println(sum(1, 2));
        System.out.println(multiply(2, 4));
    }
}
