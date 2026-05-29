package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Reads a temperature in Celsius and converts it to Fahrenheit.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0.0;
        double result = 0.0;

        System.out.println("Enter the temperature in Celsius:");
        celsius = scanner.nextDouble();
        result = celsiusToFahrenheit(celsius);

        System.out.printf("%.2f°C is equal to %.2f°F", celsius, result);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit.
     *
     * @param celsius the temperature in Celsius
     * @return the equivalent temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
}
