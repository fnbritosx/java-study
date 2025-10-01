package devbrito.marathonjava.exercises.exercise23;

import java.util.Scanner;

public class TeacherSalaryCalculator {
    public static void main(String[] args) {
        // This class calculates the net salary of a teacher based on the hourly wage,
        // the number of classes taught in a month, and the INSS discount percentage.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter the number of classes taught in the month: ");
        int classesTaught = scanner.nextInt();

        System.out.print("Enter the INSS discount percentage: ");
        double inssPercentage = scanner.nextDouble();

        double grossSalary = hourlyWage * classesTaught;
        double netSalary = grossSalary - (grossSalary * (inssPercentage / 100));

        System.out.printf("The net salary is: %.2f\n", netSalary);

        scanner.close();
    }
}
