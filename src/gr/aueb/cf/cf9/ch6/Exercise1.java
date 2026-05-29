package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

/**
 * Given an array, finds and prints the index of the maximum element
 * and the second smallest element.
 */
public class Exercise1 {

    public static void main(String[] args) {
        int[] arr = {10, 55, 43, 108, 77};
        int low = 0;
        int high = 4;
        int maxPos = 0;
        int secondSmallest = 0;

        maxPos = getMaxPosition(arr, low, high);
        System.out.println("The maximum element is at index: " + maxPos);

        secondSmallest = secondSmallest(arr, low, high);
        System.out.println("The second smallest element is: " + secondSmallest);
    }

    /**
     * Returns the index of the maximum element in the given range.
     *
     * @param arr  the input array
     * @param low  the starting index
     * @param high the ending index
     * @return the index of the maximum element
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int max = arr[low];

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    /**
     * Finds and returns the second smallest element in the given range.
     *
     * @param arr  the input array
     * @param low  the starting index
     * @param high the ending index
     * @return the second smallest element
     */
    public static int secondSmallest(int[] arr, int low, int high) {
        int min = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = low; i <= high; i++) {
            if (arr[i] > min && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
