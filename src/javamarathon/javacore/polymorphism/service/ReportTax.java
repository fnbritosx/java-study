package javamarathon.javacore.polymorphism.service;

import javamarathon.javacore.polymorphism.domain.Phone;
import javamarathon.javacore.polymorphism.domain.Product;

public class ReportTax {

    public void repotTax(Product product) {
        System.out.println("Nome: " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Tax: " + product.calculeTax());
        System.out.println("Total amount a be paid: " + product.calculeTotalValue());
        if (product instanceof Phone phone) {
            System.out.println("Delivery date: " + phone.getDeliveryDate());
        }
        System.out.println("--------------------");
    }
}
