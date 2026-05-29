package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Reads a number from the user and checks whether it is a prime number.
 */
public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter a number:");
        num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }

    /**
     * Checks whether the given number is prime.
     *
     * @param num the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
