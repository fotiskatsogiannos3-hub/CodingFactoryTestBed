package gr.aueb.cf.cf9.ch4;

/**
 * Calculates and prints the sum of all integers from 1 to 50.
 */
public class Sum1To50 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to 50: " + sum);
    }
}
