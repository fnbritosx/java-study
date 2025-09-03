package devbrito.marathonjava.javacore.introduction.methods.domain;

public class AverageSalaryEmployee {
    public void salariesAverage(float[] salaries) {
        float sum = 0;

        if (salaries != null && salaries.length != 0){
            for (int i = 0; i < salaries.length; i++) {
                sum += salaries[i];
            }
            float valueAverage = sum / salaries.length;
            System.out.printf("Average: %.2f%n", valueAverage);
        }else{
            System.out.println("Unable to calculate the average!");
        }
    }
}
