package practiceAndRepetition.sortingPractice;

public class SelectionSorting {
    public static void selectionSorting(int[] array) {
        int arrayLength = array.length;

        for (int firstElement = 0; firstElement < arrayLength; firstElement++) {
            int minIndex = firstElement;

            for (int secondElement = firstElement + 1; secondElement < arrayLength; secondElement++) {
                if (array[secondElement] < array[minIndex]) {
                    minIndex = secondElement;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[firstElement];
            array[firstElement] = temp;
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
