package homework.lesson6.overloaded_methods;

public class OverloadedMethodsSum {
    int sum() {
        int result = 0;
        System.out.println("Sum is " + result);
        return result;
    }

    int sum(int firstNumber) {
        int resultFirstNumber = firstNumber;
        System.out.println("Sum is " + resultFirstNumber);
        return resultFirstNumber;
    }

    int sum(int firstNumber, int secondNumber) {
        int resultSumOfTwoNumbers = firstNumber + secondNumber;
        System.out.println("Sum is " + resultSumOfTwoNumbers);
        return resultSumOfTwoNumbers;
    }

    int sum(int firstNumber, int secondNumber, int thirdNumber) {
        int resultSumOfThreeNumbers = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum is " + resultSumOfThreeNumbers);
        return resultSumOfThreeNumbers;
    }

    int sum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int resultSumOfFourNumbers = firstNumber + secondNumber + thirdNumber + fourthNumber;
        System.out.println("Sum is " + resultSumOfFourNumbers);
        return resultSumOfFourNumbers;
    }

}
