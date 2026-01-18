package javamarathon.exercises.exercise03;

import java.util.Scanner;

public class ConditionalSumOrMultiplication {
    public static void main(String[] args) {
        // This algorithm reads two integer values A and B.
        // If A and B are equal, it sums them.
        // Otherwise, it multiplies A by B.
        // The result of the operation is stored in a variable C,
        // and its value is printed on the screen.

        Scanner scanner = new Scanner(System.in);
        int variableC;
        String sumOrMultiplication;

        System.out.print("Enter the value A: ");
        int valueA = scanner.nextInt();

        System.out.print("Enter the value B: ");
        int valueB = scanner.nextInt();

        if (valueA == valueB) {
            variableC = valueA + valueB;
            sumOrMultiplication = "The sum " + valueA + " + " + valueB + " = ";
        } else {
            variableC = valueA * valueB;
            sumOrMultiplication = "The multiplication " + valueA + " x " + valueB + " = ";
        }

        System.out.println(sumOrMultiplication + variableC);


    }
}
