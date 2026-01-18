package javamarathon.javacore.classes.test;

import javamarathon.javacore.classes.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car();

        car01.name = "BMW X1 SUV";
        car01.model = "BMW";
        car01.year = 2023;

        car02.name = "Nissan GT-R";
        car02.model = "Nissan";
        car02.year = 2025;

        System.out.printf("Name: %s%nModel: %s%nYear: %d%n", car01.name, car01.model, car01.year);

        System.out.println("------------");

        System.out.printf("Name: %s%nModel: %s%nYear: %d%n", car02.name, car02.model, car02.year);


    }
}
