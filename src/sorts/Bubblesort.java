package sorts;

public class Bubblesort 
{
    public static void bubblesort(int[] array)
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
