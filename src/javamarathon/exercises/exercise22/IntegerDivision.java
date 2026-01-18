package javamarathon.exercises.exercise22;

import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        // This program reads two integers A and B and prints the quotient and remainder of their integer division

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value A: ");
        int valueA = scanner.nextInt();

        System.out.print("Enter value B: ");
        int valueB = scanner.nextInt();

        int quotient = valueA / valueB;
        int remainder = valueA % valueB;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        scanner.close();
    }
}
