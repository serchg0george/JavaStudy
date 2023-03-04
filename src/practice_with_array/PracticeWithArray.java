package practice_with_array;


import java.util.Arrays;

public class PracticeWithArray {
    public static void sortArray(int[] arrayForSort) {
        //Sorting array method
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arrayForSort.length; i++) {
                if (arrayForSort[i] < arrayForSort[i - 1]) {
                    int sortingArray = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[i - 1];
                    arrayForSort[i - 1] = sortingArray;
                    isSorted = false;
                }
            }
        }
        System.out.println("Sorted array from min to max: " + Arrays.toString(arrayForSort));
    }
}
