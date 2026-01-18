package javamarathon.introduction;

public class Class05RepetitionStructure01Exercise {
    public static void main(String[] args) {
        //PRACTICE ONE
        //Print the even numbers in range the zero until one million

        int count = 1;

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.printf("Par %d: %d%n", count, i);
                count ++;
            }
        }

        // PRACTICE TWO
        //Print the twenty-five firsts numbers of a given value. For example: fifty
        int naxValue = 50;
        for (int i = 0; i <= naxValue; i++){
            if (i > 25){
                break;
            }
            System.out.println(i);
        }

        //PRACTICE THREE
        //Given value of car, discover in how man he can be in installments
        //Condition: valueInstallments >= 1000

        double valueCar = 42000;

        for (int installments = 1; installments <= valueCar; installments++){
            double valueInstallments = valueCar / (double) installments;
            if (valueInstallments >= 1000){
                System.out.printf("Installments: %d R$: %.2f%n", installments, valueInstallments);
            }
        }

        // Use of continue
        double valueCar2 = 42000;

        for (int installments2 = (int) valueCar2; installments2 >= 1; installments2--){
            double valueInstallments2 = valueCar2 / (double) installments2;
            if (valueInstallments2 < 1000){
                continue;
            }
            System.out.printf("Installments: %d R$: %.2f%n", installments2, valueInstallments2);
        }

    }
}
