public class LinearSearch
{
    public static void main(String[] args)
    {   
        long startTime = System.nanoTime();

        int[] array = {34, 7, 23, 32, 5, 62, 78, 45, 21, 17, 91, 54, 83, 29, 68};
        int targetElement = 7;

        int targetIndex = linearSearch(targetElement, array);
        if (targetIndex >= 0)
        {
            System.out.printf("Element '%d' found at index %d\n", targetElement, targetIndex);
        }
        else
        {
            System.out.printf("Element '%d' not found.\n", targetElement);
        }

        long endTime = System.nanoTime();

        System.out.printf("\nTime of execution: %.4f seconds", (double) (endTime - startTime) / 1_000_000_000.0);
    }

    protected static int linearSearch(int targetElement, int[] array)
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