package practiceAndRepetition.sortingPractice;

public class BubbleSorting {
    public static void bubbleSorting(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 4, 3, 2, 1, 7, 6, 5};

        bubbleSorting(array);

        for (int sortingArray :
                array) {
            System.out.print(sortingArray + " ");
        }
    }
}
