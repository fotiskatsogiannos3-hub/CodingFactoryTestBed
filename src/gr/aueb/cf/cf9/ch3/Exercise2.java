package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Presents a menu with five options (Insert, Delete, Update, Search, Exit)
 * and prints a message based on the user's selection.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            if ((choice < 1) || (choice > 5)) {
                System.out.println("Invalid choice. Please select from the menu below:");
                continue;
            }

            if (choice == 1) {
                System.out.println("You selected Insert.");
            } else if (choice == 2) {
                System.out.println("You selected Delete.");
            } else if (choice == 3) {
                System.out.println("You selected Update.");
            } else if (choice == 4) {
                System.out.println("You selected Search.");
            } else {
                System.out.println("Exiting...");
            }
        } while (choice != 5);
    }
}