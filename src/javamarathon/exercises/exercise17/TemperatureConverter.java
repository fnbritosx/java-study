package javamarathon.exercises.exercise17;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // This program converts a temperature value from Fahrenheit to Celsius.
        // The formula used is: C = (5 * (F - 32)) / 9
        // It reads the Fahrenheit temperature from the user input,
        // calculates the equivalent in Celsius, and prints both values.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Fahrenheit: ");
        double temperatureFahrenheit = scanner.nextDouble();

        double temperatureCelsius = (5 * (temperatureFahrenheit - 32)) / 9;

        System.out.println("Temperature Celsius: " + temperatureCelsius + "ºC");

        scanner.close();
    }
}
