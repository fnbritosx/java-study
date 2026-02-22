package javamarathon.javacore.designpattern.test;

import javamarathon.javacore.designpattern.domain.aircraft.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        boolean a = AircraftSingletonEnum.INSTANCE.bookSeat("1A");
        boolean b = AircraftSingletonEnum.INSTANCE.bookSeat("1A");

        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        System.out.println(a);
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        System.out.println(b);
    }
}
