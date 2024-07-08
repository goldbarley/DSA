package search;

public class InterpolationSearch {
    public static int interpolationSearch(int[] array, int targetElement) {
        int lowIndex = 0, highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            int position = lowIndex + ((targetElement - array[lowIndex]) / (array[highIndex] - array[lowIndex])) * (highIndex - lowIndex);
            
            if (array[position] < targetElement) {
                lowIndex = position + 1;
            } else if (array[position] > targetElement) {
                highIndex = position - 1;
            } else {
                return position;
            }
        }

        return -1;
    }
}