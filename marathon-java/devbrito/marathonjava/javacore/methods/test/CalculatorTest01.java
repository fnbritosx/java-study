package devbrito.marathonjava.javacore.methods.test;

import devbrito.marathonjava.javacore.methods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();

        calculator.subtractTwoNumbers();

        calculator.multiplyTwoNumbers(2.5F, 3.2F);
    }
}
