package javamarathon.exercises.exercise04;

import java.util.Scanner;

public class PredecessorAndSuccessor {
    public static void main(String[] args) {
        // This algorithm receives an integer number from the user,
        // then prints its predecessor and successor on the screen.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter to value: ");
        int valueUser = scanner.nextInt();

        System.out.println("value: " + valueUser);
        System.out.println("Predecessor: " + (valueUser - 1));
        System.out.println("Successor: " + (valueUser + 1));

    }
}

