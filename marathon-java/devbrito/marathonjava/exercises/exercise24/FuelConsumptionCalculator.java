package devbrito.marathonjava.exercises.exercise24;

import java.util.Scanner;

public class FuelConsumptionCalculator {
    public static void main(String[] args) {
        // This class calculates the fuel consumption for a car trip based on
        // the travel time and average speed. It displays the distance covered
        // and the amount of fuel used, assuming the car runs 12 km per liter.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the travel time: ");
        double travelTime = scanner.nextDouble();

        System.out.print("Enter the average speed: ");
        double averageSpeed = scanner.nextDouble();

        double distanceCovered = travelTime * averageSpeed;
        double fuel = distanceCovered / 12;

        System.out.println("Distance covered: " + distanceCovered);
        System.out.println("Average speed: " + averageSpeed);
        System.out.println("Travel time: " + travelTime);
        System.out.printf("Liters spent to complete the trip: %.2f%n", fuel);

        scanner.close();
    }
}
