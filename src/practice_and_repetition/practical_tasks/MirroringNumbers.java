package practice_and_repetition.practical_tasks;

public class MirroringNumbers {
    public static void main(String[] args) {
        int number = 12;
        int reversedNumber = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());

        System.out.println(reversedNumber);
    }
}
