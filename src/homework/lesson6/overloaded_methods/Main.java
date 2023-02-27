package homework.lesson6.overloaded_methods;

public class Main {
    public static void main(String[] args) {
        OverloadedMethodsSum overloadedMethodsSum = new OverloadedMethodsSum();
        overloadedMethodsSum.sum();
        overloadedMethodsSum.sum(5);
        overloadedMethodsSum.sum(5, 10);
        overloadedMethodsSum.sum(5,10, 15);
        overloadedMethodsSum.sum(5,10, 15, 20);
    }
}
