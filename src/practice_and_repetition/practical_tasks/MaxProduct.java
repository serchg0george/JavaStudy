package practice_and_repetition.practical_tasks;

import java.util.Scanner;

public class MaxProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] numbers = input.split(" ");
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println(sum);
    }

}
