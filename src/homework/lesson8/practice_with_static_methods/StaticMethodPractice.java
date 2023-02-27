package homework.lesson8.practice_with_static_methods;

public class StaticMethodPractice {
    public static double multiplyThirdNumbers(double firstNumber, double secondNumber, double thirdNumber) {
        double resultOfMultiplyThirdNumbers = firstNumber * secondNumber * thirdNumber;
        return resultOfMultiplyThirdNumbers;
    }

    public static void divisionTwoNumbers(double firstNumber, double secondNumber) {
        double resultOfDivisionTwoNumbers = firstNumber / secondNumber;
        System.out.println("Results of division: " + resultOfDivisionTwoNumbers);
    }
}
