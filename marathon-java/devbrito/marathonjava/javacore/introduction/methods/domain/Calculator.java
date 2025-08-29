package devbrito.marathonjava.javacore.introduction.methods.domain;

public class Calculator {
    public void sumTwoNumbers(){
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers(){
        System.out.println(10 - 17);
    }

    public void multiplyTwoNumbers(float numberOne, float numberTwo){
        System.out.println(numberOne * numberTwo);
    }

    public double divisionTwoNumbers(double numberOne, double numberTwo){
        if (numberOne == 0 || numberTwo == 0){
            return 0;
        }
        return numberOne / numberTwo;
    }

    public void printDivisionTwoNumbers (double numberOne, double numberTwo){
        if (numberOne == 0 || numberTwo == 0){
            System.out.println("The number zero is invalid.");
        } else{
            System.out.println(numberOne / numberTwo);
        }
    }

    public void alterTwoNumbers (int numberOne, int numberTwo){
        numberOne = 10;
        numberTwo = 20;
        System.out.println("The new numberOne is: " + numberOne);
        System.out.println("The new numberTwo is: " + numberTwo);
    }
}