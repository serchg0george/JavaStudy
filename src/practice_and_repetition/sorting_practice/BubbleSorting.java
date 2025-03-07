package practice_and_repetition.sorting_practice;

public class BubbleSorting {
    public static void bubbleSorting(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {2, 18, 8, 26, 10, 22, 28, 1, 11, 21, 31, 3, 9, 27, 4, 14, 24, 5, 23, 6, 17, 29, 7, 19, 13, 15, 16, 20};

        bubbleSorting(array);

        for (int sortingArray :
                array) {
            System.out.print(sortingArray + " ");
        }
    }
}
