package devbrito.marathonjava.exercises.exercise09;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        // This program calculates a person's BMI (Body Mass Index)
        // Formula: BMI = weight / (height ^ 2)

        // BMI Condition Table:
        // Less than 18.5           | Underweight
        // Between 18.5 and 24.9    | Ideal weight (congratulations)
        // Between 25.0 and 29.9    | Slightly overweight
        // Between 30.0 and 34.9    | Obesity grade I
        // Between 35.0 and 39.9    | Obesity grade II (severe)
        // Greater than or equal to 40.0 | Obesity grade III (morbid)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight (kg): ");
        double weightUser = scanner.nextDouble();

        System.out.println("Enter your height (m): ");
        double heightUser = scanner.nextDouble();

        double bmiUser = weightUser / Math.pow(heightUser, 2);

        if (bmiUser < 18.5) {
            System.out.println("Underweight.");
        } else if (bmiUser >= 18.6 && bmiUser <= 24.9) {
            System.out.println("Ideal weight (congratulations).");
        } else if (bmiUser >= 25 && bmiUser <= 29.9) {
            System.out.println("Slightly overweight.");
        } else if (bmiUser >= 30 && bmiUser <= 34.9) {
            System.out.println("Obesity grade I.");
        } else if (bmiUser >= 35 && bmiUser <= 39.9) {
            System.out.println("Obesity grade II (severe).");
        } else {
            System.out.println("Obesity grade III (morbid).");
        }

        scanner.close();
    }
}
