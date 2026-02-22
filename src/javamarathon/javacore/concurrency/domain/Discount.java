package javamarathon.javacore.concurrency.domain;

public enum Discount {
    BAIXO(0), MEDIO(5), ALTO(10);

    private final int percentage;


    Discount(int percentage) {
        this.percentage = percentage;
    }

    public int getPercentage() {
        return percentage;
    }
}
