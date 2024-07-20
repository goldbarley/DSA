package recursion;

public class ArrayF {
    public static void reverse(int[] array) {
        reverse(array, 0, array.length - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int tmp = array[start];
        array[start] = array[end];
        array[end] = tmp;

        reverse(array, start + 1, end - 1);
    }

    public static boolean palindrome(int[] array) {
        return palindrome(array, 0, array.length - 1);
    }

    private static boolean palindrome(int[] array, int start, int end) {
        if (start >= end) {
            return true;
        }

        return array[start] == array[end] ? palindrome(array, start + 1, end - 1) : false;
    }

    public static int maxElement(int[] array) {
        return maxElement(array, 0);
    }

    private static int maxElement(int[] array, int start) {
        return start == array.length - 1 ? array[start] : Math.max(array[start], maxElement(array, start + 1));
    }

    public static int kthLargestElement(int k, int[] array)
    {
        sorts.Quicksort.quicksort(array);

        return array[array.length - k];
    }

    public static int index(final int element, final int[] array) {
        return index(element, array, 0);
    }

    private static int index(final int element, final int[] array, int index) {
        if (index == array.length - 1) {
            return element == array[index] ? index : -1;
        }
        
        return element == array[index] ? index : index(element, array, index + 1);
    }

    public static boolean in(final int[] array, final int element) {
        return in(array, element, 0);
    }

    private static boolean in(final int[] array, final int element, int index) {
        if (index == array.length - 1) {
            return element == array[index];
        }

        return element == array[index] ? true : in(array, element, index + 1);
    }
}
