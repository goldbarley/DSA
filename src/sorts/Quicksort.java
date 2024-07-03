package sorts;

public class Quicksort 
{
    public static void quicksort(int[] array)
    {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int start, int end)
    {
        if (start >= end)
        {
            return;
        }

        int pivotIndex = (int) (Math.random() * (end - start)) + start;
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
}
