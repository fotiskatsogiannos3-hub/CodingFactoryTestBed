package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Reads an integer from the user and prints its square.
 */
public class SquareApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;

        System.out.println("Enter an integer:");
        num = scanner.nextInt();
        result = square(num);

        System.out.println("The square of " + num + " is: " + result);
    }

    /**
     * Returns the square of the given integer.
     *
     * @param num the integer to square
     * @return num * num
     */
    public static int square(int num) {
        return num * num;
    }
}
