import java.util.Random;
import java.util.Arrays;

public class SelectionSort 
{
    public static void main(String[] args) 
    {
        long startTime = System.nanoTime();

        notes.selectionsort.printNotes();

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

        selectionSort(array);

        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(array));

        long endTime = System.nanoTime();

        System.out.printf("Time of execution: %.4f seconds", (double) (endTime - startTime) / 1_000_000_000.0);
    }    

    protected static void selectionSort(int[] array)
    {
        int size = array.length;

        for (int i = 0; i < size - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < size - 1; j++)
            {
                if (array[minIndex] > array[j])
                {
                    minIndex = j;
                }
            }

            if (i != minIndex)
            {
                int tmp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = tmp;
            }
        }
    }
}
