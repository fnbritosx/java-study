package devbrito.marathonjava.javacore.staticmodifier.test;

import devbrito.marathonjava.javacore.staticmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car("BMW", 280);
        Car car02 = new Car("Porsche", 300);
        Car car03 = new Car("GTR SUPRA", 400);

        Car.setLimitSpeed(150);

        car01.printCar();
        car02.printCar();
        car03.printCar();
    }
}
