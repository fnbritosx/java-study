package javamarathon.javacore.designpattern.domain.transport;

public interface Transport {
    void deliver();

}

class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Entregando por terra!");
    }
}

class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Entregando por mar!");
    }
}

