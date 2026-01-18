package javamarathon.exercises.exercise21;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // This program displays a random number between 0 and 100
        Random random = new Random();

        int number = random.nextInt(0, 101);

        System.out.println(number);
    }
}
