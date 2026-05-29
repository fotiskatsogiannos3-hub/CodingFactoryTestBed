package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Reads a year from the user and checks whether it is a leap year.
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        System.out.println("Enter a year:");

        year = scanner.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("The year %d is a leap year.", year);
        } else {
            System.out.printf("The year %d is not a leap year.", year);
        }
    }
}
