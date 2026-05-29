package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *  A simple bank account simulation with deposit and withdrawal support
 */
public class SimpleBank {
    static double balance = 500;           // starting balance
    static Scanner in = new Scanner(System.in);

    /**
     * Runs a series of transactions to demonstrate deposit and withdraw
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println("Initial balance: " + balance + "€");

            deposit(100.0);
            System.out.println("After the 100€ deposit the balance is: " + balance + "€");

            withdraw(30.0);
            System.out.println("After the 30€ withdraw the balance is: " + balance + "€");

            withdraw(800);  // this will fail because 800 > current balance
        } catch (Exception e) {
            System.out.println("The transaction has failed: " + e.getMessage());
        }
    }

    /**
     * Adds the given amount to the account balance.
     *
     * @param amount the amount to deposit (must be greater than 0)
     * @throws Exception if the amount is zero or negative
     */
    public static void deposit(double amount) throws Exception {

        try {
            if (amount <= 0) {
                throw new Exception("The amount for deposit should be positive!");
            }

            balance += amount;  // add to the current balance
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());  // log with timestamp
            throw e;  // re-throw so the caller can handle it
        }
    }

    /**
     * Subtracts the given amount from the account balance.
     *
     * @param amount the amount to withdraw (must be greater than 0 and not exceed the balance)
     * @throws Exception if the amount is zero or negative, or if there are not enough funds
     */
    public static void withdraw(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("The amount for withdraw should be positive!");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance!");  // not enough funds
            }
            balance -= amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());  // log with timestamp
            throw e;  // re-throw so the caller can handle it
        }
    }
}
