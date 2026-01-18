package javamarathon.exercises.exercise01;

import java.util.Scanner;

public class SumComparison {
    public static void main(String[] args) {
        // This algorithm reads the values of A, B, and C,
        // then prints the sum of A and B,
        // and shows whether the sum is less than C.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Value A: ");
        float valueA = scanner.nextFloat();

        System.out.print("Value B: ");
        float valueB = scanner.nextFloat();

        System.out.print("Value C: ");
        float valueC = scanner.nextFloat();

        float sumAB = valueA + valueB;

        if (sumAB < valueC) {
            System.out.println("A + B = " + sumAB + " and is less than (<) " + valueC);
        }
        if (sumAB == valueC) {
            System.out.println("A + B = " + sumAB + " and is equal to " + valueC);
        } else {
            System.out.println("A + B = " + sumAB + " and is greater than (>) " + valueC);
        }
    }
}
