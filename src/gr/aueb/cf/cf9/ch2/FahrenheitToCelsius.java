package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Reads a temperature in Fahrenheit from the user and converts it to Celsius.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Enter the temperature in Fahrenheit:");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d°F is equal to %d°C", fahrenheit, celsius);

    }
}
