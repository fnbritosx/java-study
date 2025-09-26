package devbrito.marathonjava.exercises.exercise15;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeInYearsMonthsDays {
    public static void main(String[] args) {
        // This program reads the birth year of a person,
        // calculates and prints how many years, months, and days the person has lived.
        // It assumes a year has 365 days and a month has 30 days.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Day of birth: ");
        int dayOfBirth = scanner.nextInt();

        System.out.print("Birth month: ");
        int monthBirth = scanner.nextInt();

        System.out.print("Year of birth: ");
        int yearOfBirth = scanner.nextInt();

        LocalDate currentDate = LocalDate.now();

        int dayNow = currentDate.getDayOfMonth();
        int monthNow = currentDate.getMonthValue();
        int yearNow = currentDate.getYear();

        int dayLiving = dayNow - dayOfBirth;
        int monthLiving = monthNow - monthBirth;
        int yearLiving = yearNow - yearOfBirth;

        System.out.println("You living: ");
        System.out.println(yearLiving + " years");
        System.out.println(monthLiving + " months");
        System.out.println(dayLiving + " days");
    }
}
