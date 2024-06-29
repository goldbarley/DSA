import java.util.Random;
import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();

        notes.mergesort.printNotes();

        Random r = new Random();
        
        int size = r.nextInt(100);
        int array[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = r.nextInt(100);
        }

        System.out.println("Size of the array: " + size + "\n");

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(array));

        mergeSort(array);

        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(array));

        long endTime = System.nanoTime();

        System.out.printf("Time of execution: %.4f", (double) (endTime - startTime) / 1_000_000_000.0);
    }

    private static void mergeSort(int[] array)
    {
        int size = array.length;

        if (size == 1)
        {
            return;
        }

        int mid = size / 2;
        
        int[] leftArray = new int[mid];
        int[] rightArray = new int[size - mid];

        int leftArrayIndex = 0;
        int rightArrayIndex = 0;

        while (leftArrayIndex < size)
        {
            if (leftArrayIndex < mid)
            {
                leftArray[leftArrayIndex] = array[leftArrayIndex];
            }
            else
            {
                rightArray[rightArrayIndex] = array[leftArrayIndex];
                rightArrayIndex++;
            }

            leftArrayIndex++;
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array)
    {
        int sizeOfLeft = array.length / 2;
        int sizeOfRight = array.length - sizeOfLeft;

        int arrayIndex = 0, leftArrayIndex = 0, rightArrayIndex = 0;

        while (leftArrayIndex < sizeOfLeft && rightArrayIndex < sizeOfRight)
        {
            if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex])
            {
                array[arrayIndex] = leftArray[leftArrayIndex];

                arrayIndex++;
                leftArrayIndex++;
            }
            else
            {
                array[arrayIndex] = rightArray[rightArrayIndex];

                arrayIndex++;
                rightArrayIndex++;
            }
        }

        while (leftArrayIndex < sizeOfLeft)
        {
            array[arrayIndex] = leftArray[leftArrayIndex];
            
            arrayIndex++;
            leftArrayIndex++;
        }

        while (rightArrayIndex < sizeOfRight)
        {
            array[arrayIndex] = rightArray[rightArrayIndex];

            arrayIndex++;
            rightArrayIndex++;
        }
    }
}