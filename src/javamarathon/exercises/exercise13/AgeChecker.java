package javamarathon.exercises.exercise13;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        // This program reads the name and age of a person,
        // and prints the name along with whether the person is of legal age (18 or older) or a minor.

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.print("What's your age? ");
        int age = scanner.nextInt();

        String legalAgeOrMinor = (age>=18) ? "Adult" : "Minor";

        System.out.println("Name: " + name);
        System.out.println("Age : " + age + " - " + legalAgeOrMinor);

        scanner.close();
    }
}
