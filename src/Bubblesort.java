import java.util.Random;
import java.util.Arrays;

public class Bubblesort 
{
    public static void main(String[] args) 
    {
        long startTime = System.nanoTime();

        notes.bubblesort.printNotes();

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

        bubblesort(array);

        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(array));

        long endTime = System.nanoTime();

        System.out.printf("Time of execution: %.4f seconds", (double) (endTime - startTime) / 1_000_000_000.0);
    }   

    protected static void bubblesort(int[] array)
    {
        int size = array.length;
        
        for (int i = 0; i < size - 1; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < size - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    swapped = true;

                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            if (!swapped)
            {
                break;
            }
        }
    }
}
