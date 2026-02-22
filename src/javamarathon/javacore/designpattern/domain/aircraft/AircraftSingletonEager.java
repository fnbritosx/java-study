package javamarathon.javacore.designpattern.domain.aircraft;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    private static final Set<String> availableSeats = new HashSet<>();
    private static AircraftSingletonEager INSTANCE = new AircraftSingletonEager("442");
    private final String name;

    static {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public static AircraftSingletonEager getInstance(){
        return INSTANCE;
    }

    public static boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
