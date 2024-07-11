package sorts;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int tmp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = tmp;
            }
        }
    }
}