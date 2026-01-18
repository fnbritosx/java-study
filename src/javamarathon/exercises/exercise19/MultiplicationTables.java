package javamarathon.exercises.exercise19;

public class MultiplicationTables {
    public static void main(String[] args) {
        // This program prints the multiplication tables from 1 to 10.
        // It uses nested loops to iterate through numbers 1 to 10,
        // calculates the multiplication results for each combination,
        // and prints the full tables to the console in a readable format.

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                int multiplication = i * j;
                System.out.printf("%d x %d = %d%n", i, j, multiplication);
            }
            System.out.println("--------------------");
        }
    }
}
