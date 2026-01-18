package javamarathon.exercises.exercise15;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeInYearsMonthsDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Day of birth: ");
        int dayOfBirth = scanner.nextInt();

        System.out.print("Month of birth: ");
        int monthOfBirth = scanner.nextInt();

        System.out.print("Year of birth: ");
        int yearOfBirth = scanner.nextInt();

        LocalDate currentDate = LocalDate.now();
        int currentDay = currentDate.getDayOfMonth();
        int currentMonth = currentDate.getMonthValue();
        int currentYear = currentDate.getYear();

        int years = currentYear - yearOfBirth;
        int months = currentMonth - monthOfBirth;
        int days = currentDay - dayOfBirth;

        if (days < 0) {
            days += 30;
            months -= 1;
        }

        if (months < 0) {
            months += 12;
            years -= 1;
        }

        System.out.println("\nYou have lived:");
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");

        scanner.close();
    }
}
