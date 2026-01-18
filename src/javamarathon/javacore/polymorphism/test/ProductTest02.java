package javamarathon.javacore.polymorphism.test;

import javamarathon.javacore.polymorphism.domain.Computer;
import javamarathon.javacore.polymorphism.domain.Phone;
import javamarathon.javacore.polymorphism.domain.Product;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("PC Pichau", 7000);
        Product product1 = new Phone("Iphone 16 Pro Max", 8000);

        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.calculeTax());
        System.out.println(product.calculeTotalValue());

        System.out.println("-----------------------");

        System.out.println(product1.getName());
        System.out.println(product1.getValue());
        System.out.println(product1.calculeTax());
        System.out.println(product1.calculeTotalValue());

    }
}
