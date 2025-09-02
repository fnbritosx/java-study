package devbrito.marathonjava.javacore.introduction.methods.test;

import devbrito.marathonjava.javacore.introduction.methods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int [] numbers = {1, 2, 3, 4, 5};

        // If you already have an array, use this method instead of VarArgs
        calculator.sumArray(numbers);
        // If you don't have an array, you can pass the values directly using VarArgs
        calculator.sumVarArgs(1,2,3,4,5);
    }
}
