package javamarathon.exercises.exercise07;

import java.util.Scanner;
import java.time.Year;

public class BooleanEqualityChecker {
    public static void main(String[] args) {
        // This program reads two boolean inputs from the user
        // and checks whether both values are either TRUE or FALSE.

        Scanner scanner = new Scanner(System.in);
        int yearNow = Year.now().getValue();

        System.out.println("Enter your year of birth: ");
        int userBirthYear = scanner.nextInt();

        int userAge = yearNow - userBirthYear;
        boolean userAdult;

        if (userAge >= 18){
            userAdult = true;
        }else{
            userAdult = false;
        }

        System.out.println("Are you of legal age? ");
        boolean adulthoodAge = scanner.nextBoolean();

        System.out.println("Do you like pizza? ");
        boolean userPizza = scanner.nextBoolean();

        if (userAdult == adulthoodAge && userPizza) {
            System.out.println("Both answers are TRUE.");
        } else if (userAdult != adulthoodAge && !userPizza) {
            System.out.println("Both answers are FALSE.");
        } else {
            System.out.println("One of the answers is FALSE.");
        }
    }
}
