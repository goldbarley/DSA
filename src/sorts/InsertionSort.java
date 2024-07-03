package sorts;

public class InsertionSort 
{
    public static void insertionSort(int[] array)
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
