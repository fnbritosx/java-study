package devbrito.marathonjava.javacore.polymorphism.test;

import devbrito.marathonjava.javacore.polymorphism.domain.Computer;
import devbrito.marathonjava.javacore.polymorphism.domain.Phone;
import devbrito.marathonjava.javacore.polymorphism.service.ReportTax;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("PC gamer", 20000);
        Phone phone = new Phone("Iphone 17 Pro Max", 16000);
        ReportTax reportTax = new ReportTax();

        reportTax.repotTax(phone);
        reportTax.repotTax(computer);
    }
}
