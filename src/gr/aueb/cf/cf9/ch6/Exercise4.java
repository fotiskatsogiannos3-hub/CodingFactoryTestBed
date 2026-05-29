package gr.aueb.cf.cf9.ch6;

/**
 * Given a sorted array, finds the first and last index at which a given value appears.
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

        int[] indexes = getLowAndHighIndexOf(arr, key);
        System.out.println("Low index: " + indexes[0]);
        System.out.println("High index: " + indexes[1]);
    }

    /**
     * Returns a 2-element array with the lowest and highest index where the key appears.
     *
     * @param arr the array to search (assumed sorted)
     * @param key the value to look for
     * @return an array {firstIndex, lastIndex}, or {-1, -1} if not found
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] result = {-1, -1};

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                if (result[0] == -1) {
                    result[0] = i;
                }
                result[1] = i;
            }
        }
        return result;
    }
}
