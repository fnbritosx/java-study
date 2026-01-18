package javamarathon.exercises.exercise02;

import java.util.Scanner;

public class NumberTypeChecker {
    public static void main(String[] args) {
        // This algorithm receives any number from the user,
        // then prints whether the number is even or odd,
        // and whether it is positive or negative.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int valueUser = scanner.nextInt();
        String check = "";

        if (valueUser < 0) {
            check = "less than zero";
        } else if (valueUser > 0) {
            check = "greater than zero";
        } else {
            check = "equal to zero";
        }

        if (valueUser % 2 == 0) {
            System.out.println("The value " + valueUser + " is even and is " + check);
        } else {
            System.out.println("The value " + valueUser + " is odd and is " + check);
        }
    }
}
