package javamarathon.javacore.designpattern.domain.transport;

import static javamarathon.javacore.designpattern.domain.transport.TransportType.SHIP;
import static javamarathon.javacore.designpattern.domain.transport.TransportType.TRUCK;

public class TransportFactory {
    public static Transport createTransport(TransportName type) {
        switch (type.getTransportTypeEnum()) {
            case TRUCK:
                return new Truck();
            case SHIP:
                return new Ship();
            default:
                throw new IllegalArgumentException("Not is possible localize your transport.");
        }
    }
}
