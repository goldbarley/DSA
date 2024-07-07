package search;

public class BinarySearch {
    public static int binarySearch(int[] array, int targetElement) {
        int lowIndex = 0, highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            int mid = (highIndex + lowIndex) / 2;

            if (array[mid] < targetElement) {
                lowIndex = mid + 1;

            } else if (array[mid] > targetElement) {
                highIndex = mid - 1;

            } else {
                return mid;
            }
        }

        return -1;
    }
}