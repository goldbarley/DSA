package search;

import java.util.Arrays;
import sorts.*;

public class BinarySearch 
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();

        notes.binarysearch.printNotes();

        int[] array = {34, 7, 23, 32, 5, 62, 78, 45, 21, 17, 91, 54, 83, 29, 68};
        int targetElement = 17;

        Quicksort.quicksort(array);

        System.out.println("Sorted array:\n" + Arrays.toString(array) + "\n");

        int targetIndex = binarySearch(targetElement, array);
        if (targetIndex >= 0)
        {
            System.out.printf("Element '%d' found at index %d of the sorted array.\n", targetElement, targetIndex);
        }
        else
        {
            System.out.printf("Element '%d' not found.\n", targetElement);
        }

        long endTime = System.nanoTime();

        System.out.printf("\nTime of execution: %.4f seconds", (double) (endTime - startTime) / 1_000_000_000.0);
    }    

    public static int binarySearch(int targetElement, int[] array)
    {
        int lowIndex = 0, highIndex = array.length - 1;

        while (lowIndex <= highIndex)
        {
            int mid = (highIndex + lowIndex) / 2;
            if (array[mid] < targetElement)
            {
                lowIndex = mid + 1;
            }
            else if (array[mid] > targetElement)
            {
                highIndex = mid - 1;
            }
            else
            {
                return mid;
            }
        }

        return -1;
    }
}
