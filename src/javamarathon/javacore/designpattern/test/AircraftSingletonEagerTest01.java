package javamarathon.javacore.designpattern.test;

import javamarathon.javacore.designpattern.domain.aircraft.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        boolean a = AircraftSingletonEager.bookSeat("1A");
        boolean b =AircraftSingletonEager.bookSeat("1A");
        boolean c =AircraftSingletonEager.bookSeat("1A");

        System.out.println(AircraftSingletonEager.getInstance());
        System.out.println(a);

        System.out.println(AircraftSingletonEager.getInstance());
        System.out.println(b);

        System.out.println(AircraftSingletonEager.getInstance());
        System.out.println(c);

    }
}
