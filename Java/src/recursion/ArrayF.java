package recursion;

import java.util.NoSuchElementException;

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
        k--;
        if (array.length < 2 || k > array.length) {
            throw new NoSuchElementException();
        }

        if (k == array.length) {
            return Math.min(array[0], array[1]); 
        }

        return Math.max(array[k], kthLargestElement(k + 1, array));
    }

    public static int sumElements(int[] array) {
        if (array.length == 1) {
            return array[0];
        }

        
    }
}
