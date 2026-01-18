package javamarathon.exercises.exercise18;

public class HeightComparison {
    public static void main(String[] args) {
        // This program calculates how many years it will take for Sara to become taller than Francisco.
        // Francisco starts at 1.50 meters and grows 2 centimeters per year.
        // Sara starts at 1.10 meters and grows 3 centimeters per year.
        // It uses a loop to simulate their growth year by year,
        // calculates when Sara's height surpasses Francisco's,
        // and prints the total number of years needed.

        int years = 0;
        double heightSara = 1.10;
        double heightFrancisco = 1.50;

        while (heightSara <= heightFrancisco){
            years += 1;
            heightSara += 0.03;
            heightFrancisco += 0.02;
        }

        System.out.println("Years until Sara is taller than Francisco: " + years);
    }
}
