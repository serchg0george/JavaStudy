package practiceAndRepetition.sortingPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SelectionSorting {
    public static void selectionSorting(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 4, 3, 2, 1, 7, 6, 5};

        selectionSorting(array);

        for (int sortingArray :
                array) {
            System.out.print(sortingArray + " ");
        }
    }
}
