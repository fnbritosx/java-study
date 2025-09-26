package devbrito.marathonjava.exercises.exercise11;

import java.util.Scanner;

public class StudentPassFailCalculator {
    public static void main(String[] args) {
        // This program reads four grades from a student, calculates the average,
        // prints the student's name, and displays whether the student passed or failed.
        // To pass, the student's average must be greater than or equal to 7.

        Scanner scanner = new Scanner(System.in);
        String passedOrFailed;

        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter grade 1: ");
        double grade01 = scanner.nextDouble();

        System.out.print("Enter grade 2: ");
        double grade02 = scanner.nextDouble();

        System.out.print("Enter grade 3: ");
        double grade03 = scanner.nextDouble();

        System.out.print("Enter grade 4: ");
        double grade04 = scanner.nextDouble();

        double averageStudent = (grade01 + grade02 + grade03 + grade04) / 4;

        if (averageStudent >= 7) {
            passedOrFailed = "Passed.";
        } else {
            passedOrFailed = "Failed";
        }

        System.out.printf("Average: %.2f - %s%n", averageStudent, passedOrFailed);

        scanner.close();
    }
}
