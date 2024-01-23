package practice_and_repetition.SOLID.SingleResponsibility.WrongWay;

public class Calculator {
    public static int sum(int first, int second) {
        return first + second;
    }

    public void printResult() { // method printResult violate the principle of single responsibility
                                // in this case our class called Calculator, which means that it should calculate
                                // but not printing.

        System.out.println(sum(1, 2));

    }
}
