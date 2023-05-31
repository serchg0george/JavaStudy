package practiceAndRepetition.practicalTasks;

public class MirroringString {
    public static void main(String[] args) {
        String string = "String";
        char[] reverseString = string.toCharArray();

        for (int i = reverseString.length - 1; i >= 0; i--) {
            System.out.print(reverseString[i]);
        }

    }
}
