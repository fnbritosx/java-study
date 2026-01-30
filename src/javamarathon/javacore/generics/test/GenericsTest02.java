package javamarathon.javacore.generics.test;

import javamarathon.javacore.generics.domain.Carro;
import javamarathon.javacore.generics.domain.Moto;
import javamarathon.javacore.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest02 {
    public static void main(String[] args) {
        List<Carro> carroList = new ArrayList<>(List.of(new Carro("Toyota"), new Carro("Porshe")));
        List<Moto> motoList = new ArrayList<>(List.of(new Moto("Yamaha"), new Moto("Honda")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>();
        RentalService<Moto> rentalServiceMoto = new RentalService<>();

        rentalServiceCarro.returnAvailableVehicles(carroList);

        System.out.println("----------------");

        rentalServiceMoto.returnAvailableVehicles(motoList);
    }
}
