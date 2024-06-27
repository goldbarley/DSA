import java.util.Random;

public class Quicksort 
{
    public static void main(String[] args) 
    {
        printNotes();

        Random r = new Random();
        
        int size = r.nextInt(100);
        int array[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = r.nextInt(100);
        }
        System.out.println("Size of the array: " + size + "\n");

        System.out.println("Before sorting:");
        System.out.println(java.util.Arrays.toString(array));

        quicksort(array, 0, size - 1);

        System.out.println("\nAfter sorting:");
        System.out.println(java.util.Arrays.toString(array));
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

    private static void printNotes()
    {
        System.out.println("Quicksort:");
        System.out.println("Upper-bound time complexity: O(n^2)");
        System.out.println("Lower-bound time complexity: Omega(n log n)");
        System.out.println("Space complexity: O(log n)");
        System.out.println("Average time complexity: O(n log n)");
        System.out.println("--------------------------------------\n");
    }
}
