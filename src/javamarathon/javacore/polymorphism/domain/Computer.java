package javamarathon.javacore.polymorphism.domain;

public class Computer extends Product {
    protected static final double tax = 0.20;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculeTax() {
        return value * tax ;
    }

    @Override
    public double calculeTotalValue() {
        totalValue = value + value * tax;
        return totalValue;
    }

}
