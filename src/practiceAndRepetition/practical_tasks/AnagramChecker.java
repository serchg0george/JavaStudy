package practiceAndRepetition.practical_tasks;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String firstWord = "Silent";
        String secondWord = "Listen";

        char[] firstWordLetters = firstWord.toLowerCase().toCharArray();
        char[] secondWordLetters = secondWord.toLowerCase().toCharArray();

        Arrays.sort(firstWordLetters);
        Arrays.sort(secondWordLetters);

        if (Arrays.equals(firstWordLetters, secondWordLetters)) {
            System.out.println("This is anagram!");
        } else {
            System.out.println("This isn't anagram");
        }
    }
}
