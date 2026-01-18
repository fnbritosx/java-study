package javamarathon.javacore.methods.test;

import javamarathon.javacore.methods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        // Primitive types are passed by value: the method gets a copy, so the original variable remains unchanged.
        // Non-primitive types are passed by reference: the method can modify the original object's internal state.
        Calculator calculatorThree = new Calculator();

        int num1 = 55;
        int num2 = 60;
        calculatorThree.alterTwoNumbers(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}

