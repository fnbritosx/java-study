package javamarathon.exercises.exercise05;

import java.util.Scanner;

public class MinimumWageCalculator {
    public static void main(String[] args) {
        // This algorithm reads the value of the minimum wage
        // and the user's salary.
        // It calculates how many minimum wages the user earns
        // and prints the result on the screen.
        // (Minimum wage base: R$ 1,293.20)

        Scanner scanner = new Scanner(System.in);
        double minimumWage = 1293.20;

        System.out.print("Enter your salary: ");
        double wageUser = scanner.nextFloat();

        double minimumWageUser = wageUser / minimumWage;

        System.out.printf("The user receive %.2f minimum wage(s).", minimumWageUser);
    }
}
