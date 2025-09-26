package devbrito.marathonjava.exercises.exercise10;

import java.util.Scanner;

public class StudentAverageCalculator {
    public static void main(String[] args) {
        // This program reads three grades from a student and calculates the average.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grade 1: ");
        double grade01 = scanner.nextDouble();

        System.out.println("Enter grade 2: ");
        double grade02 = scanner.nextDouble();

        System.out.println("Enter grade 3: ");
        double grade03 = scanner.nextDouble();

        double averageStudent = (grade01 + grade02 + grade03) / 3;

        System.out.printf("Student average: %.2f%n", averageStudent);

        scanner.close();
    }
}
