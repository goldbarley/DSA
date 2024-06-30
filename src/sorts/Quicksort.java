package sorts;

import java.util.Random;
import java.util.Arrays;

public class Quicksort 
{
    public static void main(String[] args) 
    {
        long startTime = System.nanoTime();

        notes.quicksort.printNotes();

        Random r = new Random();
        
        int size = 100;
        int array[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = r.nextInt(100) + 1;
        }
        System.out.println("Size of the array: " + size + "\n");

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(array));

        quicksort(array);

        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(array));

        long endTime = System.nanoTime();

        System.out.printf("\nTime of execution: %.4f seconds", (double) (endTime - startTime) / 1_000_000_000.0);
    }

    public static void quicksort(int[] array)
    {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int start, int end)
    {
        if (start >= end)
        {
            return;
        }

        int pivotIndex = new Random().nextInt(end - start) + start;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, end);
        
        int i = start - 1;

        for (int j = start; j < end; j++)
        {
            if (array[j] < pivot)
            {
                i++;
                swap(array, i, j);
            }
        }
        i++;

        swap(array, i, end);

        quicksort(array, start, i - 1);
        quicksort(array, i + 1, end);
    }

    private static void swap(int[] array, int index1, int index2)
    {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
