package devbrito.marathonjava.javacore.enums.test;

import devbrito.marathonjava.javacore.enums.domain.Client;
import devbrito.marathonjava.javacore.enums.domain.InfoClient;

import devbrito.marathonjava.javacore.enums.domain.PaymentType;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client01 = new Client("Fernando", InfoClient.NATURAL_PERSON, PaymentType.PIX, 100);
        Client client02 = new Client("Marcella", InfoClient.LEGAL_ENTITY, PaymentType.DEBIT, 100);
        Client client03 = new Client("José", InfoClient.LEGAL_ENTITY, PaymentType.CREDIT, 100);

        System.out.println(client01);
        System.out.println(client02);
        System.out.println(client03);
        System.out.println("-----------");

        InfoClient info = InfoClient.fromDescription("Natural Person");

        if (info != null) {
            int id = info.getClientId();
            System.out.println("The id for the description is: " + id);
        } else {
            System.out.println("Description not found!");
        }
    }
}
