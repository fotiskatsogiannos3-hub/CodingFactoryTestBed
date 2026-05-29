package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * A menu-driven app that lets the user choose how to print stars:
 * horizontally, vertically, in a grid, or in increasing/decreasing rows.
 */
public class StarsMenu {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        int n = 0;

        do {
            printMenu();
            choice = getChoice();

            if (!isChoiceValid(choice)) {
                System.out.println("Invalid choice!");
                continue;
            }

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Enter a number for stars:");
            n = getOneInt();

            if (n <= 0) {
                System.out.println("The number must be positive.");
                continue;
            }

            switch (choice) {
                case 1:
                    horizontalStars(n);
                    break;
                case 2:
                    verticalStars(n);
                    break;
                case 3:
                    arrayOfStars(n);
                    break;
                case 4:
                    nLinesWithStarsFrom1ToN(n);
                    break;
                case 5:
                    nLinesWithStarsFromNTo1(n);
                    break;
            }
            System.out.println();

        } while (choice != 6);
    }

    public static void horizontalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void verticalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void arrayOfStars(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStars(n);
            System.out.println();
        }
    }

    public static void nLinesWithStarsFrom1ToN(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStars(i);
            System.out.println();
        }
    }

    public static void nLinesWithStarsFromNTo1(int n) {
        for (int i = n; i >= 1; i--) {
            horizontalStars(i);
            System.out.println();
        }
    }

    public static void printMenu() {
        System.out.println("1. Print n stars horizontally");
        System.out.println("2. Print n stars vertically");
        System.out.println("3. Print an n x n grid of stars");
        System.out.println("4. Print n lines with stars from 1 to n");
        System.out.println("5. Print n lines with stars from n to 1");
        System.out.println("6. Exit");
        System.out.println("Enter your choice:");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1  && choice <= 6;
    }

    public static int getChoice() {
        return scanner.nextInt();
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }
}