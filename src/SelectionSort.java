import java.util.Random;

public class SelectionSort 
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

        selectionSort(size, array);

        System.out.println("\nAfter sorting:");
        System.out.println(java.util.Arrays.toString(array));
    }    

    private static void selectionSort(int size, int[] array)
    {
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

    private static void printNotes()
    {
        System.out.println("Selection sort:");
        System.out.println("Upper-bound time complexity: O(n^2)");
        System.out.println("Lower-bound time complexity: Omega(n^2)");
        System.out.println("Space complexity: O(1)");
        System.out.println("Average time complexity: O(n^2)");
        System.out.println("------------------------------------\n");
    }
}
