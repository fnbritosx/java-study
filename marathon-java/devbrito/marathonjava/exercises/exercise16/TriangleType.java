package devbrito.marathonjava.exercises.exercise16;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        // This program reads three values representing the sides of a triangle,
        // checks if the sides form a valid triangle,
        // and determines whether the triangle is equilateral, isosceles, or scalene.

        Scanner scanner = new Scanner(System.in);
        String side = "";

        System.out.print("Enter value A: ");
        int valueA = scanner.nextInt();

        System.out.print("Enter value B: ");
        int valueB = scanner.nextInt();

        System.out.print("Enter value C: ");
        int valueC = scanner.nextInt();

        if (valueA + valueB > valueC && valueA + valueC > valueB && valueB + valueC > valueA) {
            System.out.println("Value A: " + valueA);
            System.out.println("Value B: " + valueB);
            System.out.println("Value C: " + valueC);

            System.out.println("--------------------");

            System.out.println(valueA + " + " + valueB + " > " + valueC);
            System.out.println(valueA + " + " + valueC + " > " + valueB);
            System.out.println(valueB + " + " + valueC + " > " + valueA);

            System.out.println("--------------------");

            System.out.println("Triangle Valid!");
            if (valueA == valueB && valueA == valueC) {
                System.out.println("Triangle Equilateral.");
            } else if (valueA == valueB || valueA == valueC || valueB == valueC) {
                System.out.println("Triangle Isosceles.");
            } else {
                System.out.println("Triangle Scalene.");
            }
        } else {
            if (valueA + valueB < valueC) {
                side = valueA + " + " + valueB + " < " + valueC;
            }
            if (valueA + valueB == valueC) {
                side = valueA + " + " + valueB + " = " + valueC;
            }
            if (valueA + valueC < valueB) {
                side = valueA + " + " + valueC + " < " + valueB;
            }
            if (valueA + valueC == valueB) {
                side = valueA + " + " + valueC + " = " + valueB;
            }
            if (valueB + valueC < valueA) {
                side = valueB + " + " + valueC + " < " + valueA;
            }
            if (valueB + valueC == valueA) {
                side = valueB + " + " + valueC + " = " + valueA;
            }

            System.out.println("Triangle Invalid!");
            System.out.println(side);
        }
        scanner.close();
    }
}
