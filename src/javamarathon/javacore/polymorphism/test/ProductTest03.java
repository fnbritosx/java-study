package javamarathon.javacore.polymorphism.test;

import javamarathon.javacore.polymorphism.domain.Computer;
import javamarathon.javacore.polymorphism.domain.Phone;
import javamarathon.javacore.polymorphism.domain.Product;
import javamarathon.javacore.polymorphism.service.ReportTax;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("PC Pichau", 7000);
        Phone phone = new Phone("Iphone 16 Pro Max", 8000);
        ReportTax reportTax = new ReportTax();

        phone.setDeliveryDate("10/12/2025");

        reportTax.repotTax(phone);
        reportTax.repotTax(product);

    }
}
