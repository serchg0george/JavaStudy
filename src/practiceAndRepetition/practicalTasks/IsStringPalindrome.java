package practiceAndRepetition.practicalTasks;

public class IsStringPalindrome {
    public static void main(String[] args) {
        String inputString = "anna";

        StringBuffer buffer = new StringBuffer(inputString);
        buffer.reverse();
        String dataBuffer = buffer.toString();

        if (inputString.equals(dataBuffer)) {
            System.out.println("This is palindrome! :O");
        } else {
            System.out.println("This isn't palindrome :c");
        }
    }
}
