package javamarathon.javacore.designpattern.test;

import javamarathon.javacore.designpattern.domain.aircraft.AircraftLazyEager;
import javamarathon.javacore.designpattern.domain.aircraft.AircraftSingletonEager;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftLazyEagerTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        AircraftLazyEager.bookSeat("1A");
        AircraftLazyEager.bookSeat("1A");


        System.out.println(AircraftLazyEager.getInstance());
        System.out.println(AircraftLazyEager.getInstance());


        Constructor<AircraftLazyEager> declaredConstructor = AircraftLazyEager.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        AircraftLazyEager aircraftLazyEager = declaredConstructor.newInstance("442");
        System.out.println(aircraftLazyEager);
// para resolver esse problema acima de modificação de acesso do construtor, utiliza-se ENUM.
    }
}
