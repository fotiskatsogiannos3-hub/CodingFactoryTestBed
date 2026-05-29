package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Reads three integers from the user and prints the largest one.
 */
public class MaxApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int result = 0;

        System.out.println("Enter three integers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        result = findMax(num1, num2, num3);
        System.out.println("The largest of the three numbers is: " + result);
    }

    /**
     * Returns the largest of three integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @param num3 the third integer
     * @return the largest of the three
     */
    public static int findMax(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
