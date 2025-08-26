package devbrito.maratonajava.introducao;

public class Class04ConditionalStructures03 {
    public static void main(String[] args) {
        // Ternary operator

        // Simple ternary
        // condition ? value_if_true : value_if_false;

        // Nested ternary
        // condition ? value_if_true : condition ? value_if_true : value_if_false;

        // Simple ternary
        int number = 10;
        String result = (number % 2 == 0) ?  "Even" : "Odd";
        System.out.println(result);

        // Nested ternary
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >=80) ? "B" : (score >70) ? "C" : "F";
        System.out.println(grade);
    }
}
