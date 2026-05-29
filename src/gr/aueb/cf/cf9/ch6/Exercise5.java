package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Calculates the maximum number of cars parked at the same time in a parking lot.
 */
public class Exercise5 {
    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};
        int[][] transformed;

        transformed = transformArray(arr);
        sortByTime(transformed);

        System.out.println("Max cars parked at the same time: " + getMaxConcurrentCars(transformed));
    }

    /**
     * Transforms the input into a flat event list where each entry is [time, type]
     * (1 = arrival, 0 = departure).
     *
     * @param arr the original array with [arrival, departure] pairs per car
     * @return a new array of [time, eventType] entries
     */
    public static int[][] transformArray(int[][] arr) {
        int[][] transformed = new int[arr.length * 2][2];

        for (int i = 0; i < arr.length; i++) {
            transformed[i*2][0] = arr[i][0];
            transformed[i*2][1] = 1;
            transformed[i*2+1][0] = arr[i][1];
            transformed[i*2+1][1] = 0;
        }
        return transformed;
    }

    /**
     * Sorts the event array by time in ascending order.
     *
     * @param arr the event array to sort
     */
    public static void sortByTime(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing((int[] a) -> a[0]));
    }

    /**
     * Scans the sorted event list and returns the peak number of cars present at the same time.
     *
     * @param arr the sorted event array
     * @return the maximum number of cars parked concurrently
     */
    public static int getMaxConcurrentCars(int[][] arr) {
        int count = 0;
        int maxCount = 0;

        for (int[] ints : arr) {
            if (ints[1] == 1) {
                count++;
                if (count > maxCount) maxCount = count;
            } else {
                count--;
            }
        }
        return maxCount;
    }
}
