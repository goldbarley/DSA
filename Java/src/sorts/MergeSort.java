package sorts;

public class MergeSort {
    public static void mergeSort(int[] array) {
        int size = array.length;

        if (size == 1) {
            return;
        }

        int mid = size / 2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[size - mid];

        int leftArrayIndex = 0;
        int rightArrayIndex = 0;

        while (leftArrayIndex < size) {
            if (leftArrayIndex < mid) {
                leftArray[leftArrayIndex] = array[leftArrayIndex];
            } else {
                rightArray[rightArrayIndex] = array[leftArrayIndex];
                rightArrayIndex++;
            }

            leftArrayIndex++;
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int sizeOfLeft = array.length / 2;
        int sizeOfRight = array.length - sizeOfLeft;

        int arrayIndex = 0, leftArrayIndex = 0, rightArrayIndex = 0;

        while (leftArrayIndex < sizeOfLeft && rightArrayIndex < sizeOfRight) {
            if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex]) {
                array[arrayIndex] = leftArray[leftArrayIndex];

                arrayIndex++;
                leftArrayIndex++;
            } else {
                array[arrayIndex] = rightArray[rightArrayIndex];

                arrayIndex++;
                rightArrayIndex++;
            }
        }

        while (leftArrayIndex < sizeOfLeft) {
            array[arrayIndex] = leftArray[leftArrayIndex];

            arrayIndex++;
            leftArrayIndex++;
        }

        while (rightArrayIndex < sizeOfRight) {
            array[arrayIndex] = rightArray[rightArrayIndex];

            arrayIndex++;
            rightArrayIndex++;
        }
    }
}