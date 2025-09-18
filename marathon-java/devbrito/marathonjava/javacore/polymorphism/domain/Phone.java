package devbrito.marathonjava.javacore.polymorphism.domain;

public class Phone extends Product {
    protected static final double tax = 0.10;
    protected String deliveryDate;

    public Phone(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculeTax() {
        return value * tax;
    }

    @Override
    public double calculeTotalValue() {
        totalValue = value + value * tax;
        return totalValue;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
