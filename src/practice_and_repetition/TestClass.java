package practice_and_repetition;

public class TestClass {
    public static int sum(int... numbers) {
        int sum = 0;

        for (int num :
                numbers) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
//        System.out.println(sum(1,2,3,4,5));
    }
}
