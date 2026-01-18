package javamarathon.javacore.dataentry;

import java.util.Random;
import java.util.Scanner;

public class ExerciseDataEntry {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        boolean result = random.nextBoolean();



        System.out.print("Enter your question: ");
        String response = input.nextLine();
        System.out.println(response);

        String yesOrNo = result ? "Yes" : "No";

        System.out.println("The response is: " + yesOrNo);

    }
}

