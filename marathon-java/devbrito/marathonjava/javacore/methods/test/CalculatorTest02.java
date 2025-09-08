package devbrito.marathonjava.javacore.methods.test;

import devbrito.marathonjava.javacore.methods.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator calculatorTwo = new Calculator();

        double result = calculator.divisionTwoNumbers(355, 113);
        System.out.println(result);

        calculatorTwo.printDivisionTwoNumbers(22, 7);
    }
}
