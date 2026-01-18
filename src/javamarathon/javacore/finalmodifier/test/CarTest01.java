package javamarathon.javacore.finalmodifier.test;

import javamarathon.javacore.finalmodifier.domain.Car;
import javamarathon.javacore.finalmodifier.domain.Client;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Client client = new Client();

        System.out.println(car.getName());
        System.out.println(Car.LIMIT_SPEED);

        System.out.println(car.CLIENT);
        car.CLIENT.setName("Fernando");
        System.out.println(car.CLIENT);

    }
}
