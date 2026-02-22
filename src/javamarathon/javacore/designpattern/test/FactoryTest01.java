package javamarathon.javacore.designpattern.test;


import javamarathon.javacore.designpattern.domain.transport.TransportFactory;
import javamarathon.javacore.designpattern.domain.transport.TransportName;
import javamarathon.javacore.designpattern.domain.transport.TransportType;

public class FactoryTest01 {
    public static void main(String[] args) {

        TransportFactory.createTransport(new TransportName.TransportBuilder()
                .transportType(TransportType.TRUCK)
                .builder())
                .deliver();

        TransportFactory.createTransport(new TransportName.TransportBuilder()
                .transportType(TransportType.SHIP)
                .builder())
                .deliver();

    }
}