package javamarathon.javacore.designpattern.domain.aircraft;

import java.util.HashSet;
import java.util.Set;

public class AircraftLazyEager {
    private static final Set<String> availableSeats = new HashSet<>();
    private static AircraftLazyEager INSTANCE;
    private final String name;

    static {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftLazyEager(String name) {
        this.name = name;
    }

    public static AircraftLazyEager getInstance(){
        if (INSTANCE == null){
            synchronized (AircraftLazyEager.class){
                if (INSTANCE == null){
                    INSTANCE = new AircraftLazyEager("442");
                }
            }
        }
        return INSTANCE;
    }

    public synchronized static boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
