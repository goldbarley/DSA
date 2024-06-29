import java.util.Random;
import java.util.Arrays;

public class InsertionSort 
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();

        notes.insertionsort.printNotes();

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

        insertionSort(array);

        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(array));

        long endTime = System.nanoTime();

        System.out.printf("Time of execution: %.4f seconds", (double) (endTime - startTime) / 1_000_000_000.0);
    }

    private static void insertionSort(int[] array)
    {
        int size = array.length;
        
        for (int i = 1; i < size; i++)
        {
            int currentElement = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > currentElement)
            {
                array[j + 1] = array[j];

                j--;
            }

            array[j + 1] = currentElement;
        }
    }
}
