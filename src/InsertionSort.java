import java.util.Random;

public class InsertionSort 
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

        insertionSort(size, array);

        System.out.println("\nAfter sorting:");
        System.out.println(java.util.Arrays.toString(array));
    }

    private static void insertionSort(int size, int[] array)
    {
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

    private static void printNotes()
    {
        System.out.println("Insertion sort:");
        System.out.println("Upper-bound time complexity: O(n^2)");
        System.out.println("Lower-bound time complexity: Omega(n)");
        System.out.println("Space complexity: O(1)");
        System.out.println("Average time complexity: O(n^2)");
        System.out.println("------------------------------------\n");
    }
}
