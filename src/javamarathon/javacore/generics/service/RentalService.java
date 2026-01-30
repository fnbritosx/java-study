package javamarathon.javacore.generics.service;

import javamarathon.javacore.generics.domain.Carro;
import javamarathon.javacore.generics.domain.Moto;

import java.util.List;
import java.util.Scanner;

public class RentalService<T> {
    public void returnAvailableVehicles(List<T> vehicle) {
        String typeName = vehicle.get(0).getClass().getSimpleName().toLowerCase();
        System.out.println("Há " + vehicle.size() + " " + typeName + "s" + " disponíveis para alugar: ");
        System.out.println(vehicle);

        System.out.println("Qual deseja alugar? Digite o número do veículo.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("R: ");
        String s = scanner.nextLine();

        int sInt = Integer.parseInt(s);
        T remove = vehicle.remove(sInt - 1);

        switch (remove){
            case Carro carro -> System.out.println("O carro " + remove + " foi alugado com sucesso");
            case Moto moto -> System.out.println("A moto " + remove + " foi alugada com sucesso");
            default -> System.out.println("Veículo desconhecido.");
        }
    }
}
