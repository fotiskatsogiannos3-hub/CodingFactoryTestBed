package gr.aueb.cf.cf9.ch6;

/**
 * Given an integer array, this program demonstrates: searching for an element's index,
 * filtering even numbers, doubling each element, checking for at least one positive value,
 * and verifying all elements are positive.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = {10, 30, 200 , 1, 9, 44, 105, 6};

        int element = 1;
        System.out.println("The element is at index: " + elementPosition(arr, element));

        System.out.print("Even numbers in the array: ");
        evenFiltering(arr);

        int[] doubled = doubleElement(arr);
        System.out.println("Doubled values of the array:");
        for (int el : doubled) {
            System.out.println(el);
        }

        System.out.println("Has at least one positive number: " + hasPositiveElement(arr));

        System.out.println("All numbers are positive: " + isArrayPositive(arr));
    }

    /**
     * Returns the index of the first occurrence of the given element, or -1 if not found.
     *
     * @param arr     the input array
     * @param element the value to search for
     * @return the index of the element, or -1 if not found
     */
    public static int elementPosition(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Prints all even numbers from the array.
     *
     * @param arr the input array
     */
    public static void evenFiltering(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]);
            }
        }
    }

    /**
     * Returns a new array where each element is double the value of the original.
     *
     * @param arr the input array
     * @return a new array with each element doubled
     */
    public static int[] doubleElement(int[] arr) {
        int[] duplicate = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            duplicate[i] = arr[i] * 2;
        }
        return duplicate;
    }

    /**
     * Checks if the array contains at least one positive number.
     *
     * @param arr the input array
     * @return true if at least one element is positive, false otherwise
     */
    public static boolean hasPositiveElement(int[] arr) {
        for (int num : arr) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if all elements in the array are positive.
     *
     * @param arr the input array
     * @return true if all elements are positive, false otherwise
     */
    public static boolean isArrayPositive(int[] arr) {
        for (int num : arr) {
            if (num <= 0) {
                return false;
            }
        }
        return true;
    }
}
