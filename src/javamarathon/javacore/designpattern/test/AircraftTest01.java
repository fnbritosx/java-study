package javamarathon.javacore.designpattern.test;

import javamarathon.javacore.designpattern.domain.aircraft.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        boolean a = new Aircraft("442").bookSeat("1A");
        boolean b = new Aircraft("442").bookSeat("1A");

        System.out.println(a);
        System.out.println(b);
    }
}
