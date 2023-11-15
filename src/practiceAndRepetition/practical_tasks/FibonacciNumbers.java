package practiceAndRepetition.practical_tasks;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n0 = 1; //first number
        int n1 = 1; //second number
        int n2; //sum of numbers
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}
