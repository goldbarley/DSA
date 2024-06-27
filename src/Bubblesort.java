import java.util.Random;

public class Bubblesort 
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

        bubblesort(size, array);

        System.out.println("\nAfter sorting:");
        System.out.println(java.util.Arrays.toString(array));
    }    

    private static void bubblesort(int size, int[] array)
    {
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

    private static void printNotes()
    {
        System.out.println("Bubble sort:");
        System.out.println("Upper-bound time complexity: O(n^2)");
        System.out.println("Lower-bound time complexity: Omega(n)");
        System.out.println("Space complexity: O(1)");
        System.out.println("Average time complexity: O(n^2)");
        System.out.println("----------------------------------\n");
    }
}
