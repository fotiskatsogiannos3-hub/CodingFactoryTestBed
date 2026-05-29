package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Reads a number from the user and prints rows of stars increasing from 1 up to n.
 */
public class Stars1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Enter the number of stars:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
