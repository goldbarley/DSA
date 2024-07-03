package search;

public class LinearSearch
{
    public static int linearSearch(int[] array, int targetElement)
    {   
        int size = array.length;
        int targetIndex = 0;
        while (targetIndex < size)
        {
            if (array[targetIndex] == targetElement)
            {
                return targetIndex;
            }

            targetIndex++;
        }

        return -1;
    }
}