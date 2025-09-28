package devbrito.marathonjava.exercises.exercise20;

import java.util.Scanner;

public class SingleMultiplicationTable {
    public static void main(String[] args) {
        // This program receives an integer value from user input
        // and prints its multiplication table from 1 to 10.
        // It uses a loop to calculate each result and displays
        // the full table in a clear format on the console.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number you want the multiplication table for: ");
        int userValue = scanner.nextInt();

        for (int i = 1; i < 11 ; i++) {
            int multiplication = userValue * i;
            System.out.printf("%d x %d = %d%n", userValue, i, multiplication);
        }

        scanner.close();
    }
}
