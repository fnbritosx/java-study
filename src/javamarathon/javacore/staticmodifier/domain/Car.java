package javamarathon.javacore.staticmodifier.domain;

public class Car {
    private String name;
    private double maximumSpeed;
    public static double limitSpeed = 250;

    public Car(String name, double maximumSpeed) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
    }

    public void printCar(){
        System.out.println("---------------");
        System.out.println("Name: " + name);
        System.out.println("Maximum Speed: " + maximumSpeed);
        System.out.println("Limit Speed: " + limitSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public double getLimitSpeed() {
        return limitSpeed;
    }

    public static void setLimitSpeed(double limitSpeed) {
        Car.limitSpeed = limitSpeed;
    }
}
