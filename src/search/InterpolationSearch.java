package search;

import java.util.Arrays;
import sorts.*;

public class InterpolationSearch
{          
    public static void main(String[] args)
    {
        long lowIndexTime = System.nanoTime();

        notes.interpolsearch.printNotes();

        int[] array = {34, 7, 23, 32, 5, 62, 78, 45, 21, 17, 91, 54, 83, 29, 68};
        int targetElement = 7;

        Quicksort.quicksort(array);

        System.out.println("Sorted array:\n" + Arrays.toString(array) + "\n");

        int targetIndex = interpolationSearch(targetElement, array);
        if (targetIndex >= 0)
        {
            System.out.printf("Element '%d' found at index %d of the sorted array.\n", targetElement, targetIndex);
        }
        else
        {
            System.out.printf("Element '%d' not found.\n", targetElement);
        }

        long highIndexTime = System.nanoTime();

        System.out.printf("\nTime of execution: %.4f seconds", (double) (highIndexTime - lowIndexTime) / 1_000_000_000.0);
    }    

    public static int interpolationSearch(int targetElement, int[] array)
    {
        int lowIndex = 0, highIndex = array.length - 1;

        while (lowIndex <= highIndex)
        {
            int position = lowIndex + ((targetElement - array[lowIndex]) / (array[highIndex] - array[lowIndex])) * (highIndex - lowIndex);
            if (array[position] < targetElement)
            {
                lowIndex = position + 1;
            }
            else if (array[position] > targetElement)
            {
                highIndex = position - 1;
            }
            else
            {
                return position;
            }
        }

        return -1;
    }   
}
