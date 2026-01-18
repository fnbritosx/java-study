package javamarathon.exercises.exercise14;

import java.util.Scanner;

public class ValueSwapper {
    public static void main(String[] args) {
        // This program receives two values, A and B,
        // swaps their values, and prints the result.
        // After the swap, A takes the value of B, and B takes the value of A.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value A: ");
        double valueA = scanner.nextDouble();

        System.out.print("Enter value B: ");
        double valueB = scanner.nextDouble();
        System.out.println("--------------------");

        System.out.println("Before exchange: ");
        System.out.println("Value A - " + valueA);
        System.out.println("Value B - " + valueB);

        System.out.println("--------------------");

        double temp = valueA;
        valueA = valueB;
        valueB = temp;

        System.out.println("After exchange: ");
        System.out.println("Value A - " + valueA);
        System.out.println("Value B - " + valueB);

        scanner.close();
    }
}
