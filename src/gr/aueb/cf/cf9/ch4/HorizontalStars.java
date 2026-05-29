package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Reads a number from the user and prints that many stars on a single line.
 */
public class HorizontalStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Enter the number of stars:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
