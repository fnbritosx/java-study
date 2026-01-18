package javamarathon.javacore.polymorphism.domain;

public abstract class Product implements Tax {
    protected String name;
    protected double value;
    protected double totalValue;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

}
