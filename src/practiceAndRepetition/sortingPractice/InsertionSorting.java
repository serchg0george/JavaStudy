package practiceAndRepetition.sortingPractice;

public class InsertionSorting {

    public static void test(int[] array) {
        int arrayLength = array.length;

        for (int firstElement = 1; firstElement < arrayLength; firstElement++) {
            int key = array[firstElement];
            int secondElement = firstElement - 1;

            while (secondElement >= 0 && array[secondElement] > key) {
                array[secondElement + 1] = array[secondElement];
                secondElement--;
            }

            array[secondElement + 1] = key;
        }
    }


    public static void insertionSorting(int[] array) {
        int arrayLength = array.length;

        for (int i = 1; i < arrayLength; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 4, 3, 2, 1, 7, 6, 5};

        insertionSorting(array);

        for (int sortingArray :
                array) {
            System.out.print(sortingArray + " ");
        }
    }
}
