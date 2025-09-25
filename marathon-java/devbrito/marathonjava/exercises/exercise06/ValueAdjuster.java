package devbrito.marathonjava.exercises.exercise06;

import java.util.Scanner;

public class ValueAdjuster {
    public static void main(String[] args) {
        // This algorithm reads any value from the user,
        // applies a 5% increase to the value,
        // and prints the adjusted value on the screen.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter to value: ");
        double valueUser = scanner.nextDouble();

        double valueUserAdjusted = valueUser + valueUser * 0.05;

        System.out.println("The value: " + valueUser);
        System.out.println("The value adjusted: " + valueUserAdjusted);

    }
}
