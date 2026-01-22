package javamarathon.javacore.collections.test;

import javamarathon.javacore.collections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = new Smartphone("22222", "Xiaomi");
        Smartphone s3 = new Smartphone("33333", "Samsung");
        Smartphone s4 = new Smartphone("33333", "sla");

        List<Smartphone> smartphones = new ArrayList<>();

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        smartphones.addFirst(s4);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        System.out.println(smartphones.contains(s4));

        Smartphone s5 = new Smartphone("3333320981238921", "sla");

        System.out.println(smartphones.indexOf(s5));

        Smartphone smartphone01 = new Smartphone("1A2B", "Samsung");
        Smartphone smartphone02 = new Smartphone("1A2B", "Samsung");

        System.out.println(smartphone01.equals(smartphone02));
    }
}