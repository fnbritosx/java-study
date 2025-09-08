package devbrito.marathonjava.javacore.methods.domain;

public class AverageSalariesEmployee {
    public void salariesAverage(float[] salaries) {
        float count = 0;

        for (int i = 0; i < salaries.length; i++) {
            count += salaries[i];
        }
        float valueAverage = count / salaries.length;
        System.out.printf("Average: %.2f%n", valueAverage);
    }
}
