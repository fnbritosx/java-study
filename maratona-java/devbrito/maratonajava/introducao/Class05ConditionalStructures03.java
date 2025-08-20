package devbrito.maratonajava.introducao;

public class Class05ConditionalStructures03 {
    public static void main(String[] args) {
        // ternary operator

        //simple ternary
        // condition ? value_if_true : value_if_false;

        // nested ternary
        // condition ? value_if_true : condition ? value_if_true : value_if_false;

        // simple ternary
        int number = 10;
        String result = (number % 2 == 0) ?  "Even" : "Odd";
        System.out.println(result);

        // nested ternary
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >=80) ? "B" : (score >70) ? "C" : "F";
        System.out.println(grade);

        double salary = 36000;
        if (salary >= 0 && salary <= 34712){
            salary *= 0.903;
        } else if (salary >= 34713){

        }
    }
}
