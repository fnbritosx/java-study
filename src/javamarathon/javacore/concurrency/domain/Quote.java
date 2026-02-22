package javamarathon.javacore.concurrency.domain;

//storeName:price:discountCode
public class Quote {
    private final String storeName;
    private final double price;
    private final Discount discount;


    private Quote(String storeName, double price, Discount discount) {
        this.storeName = storeName;
        this.price = price;
        this.discount = discount;
    }

    public String getStoreName() {
        return storeName;
    }

    public double getPrice() {
        return price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public static Quote newQuote(String value){
        String[] values = value.split(":");

        return new Quote(values[0], Double.parseDouble(values[1]), Discount.valueOf(values[2]));
    }
}
