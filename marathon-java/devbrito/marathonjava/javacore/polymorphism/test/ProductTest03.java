package devbrito.marathonjava.javacore.polymorphism.test;

import devbrito.marathonjava.javacore.polymorphism.domain.Computer;
import devbrito.marathonjava.javacore.polymorphism.domain.Phone;
import devbrito.marathonjava.javacore.polymorphism.domain.Product;
import devbrito.marathonjava.javacore.polymorphism.service.ReportTax;

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
