package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Reads six integers (1–49) from the user and checks whether the combination
 * passes five lottery-style filters.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.println("Enter six numbers from 1 to 49:");

        for (int i = 0; i < 6; i++) {
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Number " + (i + 1) + ":");
                int num = scanner.nextInt();

                if (num >= 1 && num <= 49) {
                    numbers[i] = num;
                    validInput = true;
                } else {
                    System.out.println("Number must be between 1 and 49.");
                }
            }
        }
        System.out.println("Numbers entered: " + Arrays.toString(numbers));
        System.out.println("\nFilter checks:");
        System.out.println("================");

        boolean filter1 = checkMaxEven(numbers);
        System.out.println("1. No more than 3 even numbers: " + (filter1 ? "PASS" : "FAIL"));

        boolean filter2 = checkMaxOdd(numbers);
        System.out.println("2. No more than 3 odd numbers: " + (filter2 ? "PASS" : "FAIL"));

        boolean filter3 = checkMaxConsecutive(numbers);
        System.out.println("3. No more than 3 consecutive numbers: " + (filter3 ? "PASS" : "FAIL"));

        boolean filter4 = checkMaxSameEnding(numbers);
        System.out.println("4. No more than 3 numbers with the same last digit: " + (filter4 ? "PASS" : "FAIL"));

        boolean filter5 = checkMaxSameDecade(numbers);
        System.out.println("5. No more than 3 numbers in the same decade: " + (filter5 ? "PASS" : "FAIL"));

        if (filter1 && filter2 && filter3 && filter4 && filter5) {
            System.out.println("\nThe combination passed all filters!");
        } else {
            System.out.println("\nThe combination did not pass all filters.");
        }
    }

    /**
     * Returns true if the array has no more than 3 even numbers.
     *
     * @param arr the input array
     * @return true if the condition holds, false otherwise
     */
    public static boolean checkMaxEven(int[] arr) {
        int evenCount = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                evenCount += 1;
            }
        }
        return evenCount <= 3;
    }

    /**
     * Returns true if the array has no more than 3 odd numbers.
     *
     * @param arr the input array
     * @return true if the condition holds, false otherwise
     */
    public static boolean checkMaxOdd(int[] arr) {
        int oddCount = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0 ) {
                oddCount += 1;
            }
        }
        return oddCount <= 3;
    }

    /**
     * Returns true if no run of consecutive numbers in the array exceeds 3.
     *
     * @param arr the input array
     * @return true if the condition holds, false otherwise
     */
    public static boolean checkMaxConsecutive(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int maxRun = 1;
        int currentRun = 1;

        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] == sorted[i - 1] + 1) {
                currentRun++;
                if (currentRun > maxRun) maxRun = currentRun;
            } else {
                currentRun = 1;
            }
        }
        return maxRun <= 3;
    }

    /**
     * Returns true if no more than 3 numbers share the same last digit.
     *
     * @param arr the input array
     * @return true if the condition holds, false otherwise
     */
    public static boolean checkMaxSameEnding(int[] arr) {
        int[] endingCount= new int[10];

        for (int num : arr) {
            int ending = num % 10;
            endingCount[ending]++;
            if (endingCount[ending] > 3) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns true if no more than 3 numbers fall in the same decade.
     *
     * @param arr the input array
     * @return true if the condition holds, false otherwise
     */
    public static boolean checkMaxSameDecade(int[] arr) {
        int[] decadeCount = new int[5];

        for (int num : arr) {
            int decade = num / 10;
            decadeCount[decade] += 1;
            if (decadeCount[decade] > 3) {
                return false;
            }
        }
        return true;
    }
}
