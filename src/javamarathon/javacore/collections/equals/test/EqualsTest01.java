package javamarathon.javacore.collections.equals.test;

import javamarathon.javacore.collections.equals.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone01 = new Smartphone("1A2B", "Samsung");
        Smartphone smartphone02 = new Smartphone("1A2B", "Samsung");

        System.out.println(smartphone01.equals(smartphone02));

    }
}
