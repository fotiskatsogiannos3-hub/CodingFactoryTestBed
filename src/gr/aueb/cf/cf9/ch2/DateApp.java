package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Reads a date (day, month, year) from the user and prints it in DD/MM/YY format.
 */
public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = 0;
        int month = 0;
        int year = 0;
        int shortYear = 0;

        System.out.println("Enter the day:");
        days = in.nextInt();

        System.out.println("Enter the month:");
        month = in.nextInt();

        System.out.println("Enter the year:");
        year = in.nextInt();

        shortYear = year % 100;

        System.out.printf("Date: %02d/%02d/%02d%n", days, month, shortYear);
    }
}
