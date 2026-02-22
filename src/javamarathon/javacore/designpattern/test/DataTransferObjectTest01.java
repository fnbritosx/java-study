package javamarathon.javacore.designpattern.test;

import javamarathon.javacore.designpattern.domain.dto.ReportDto;
import javamarathon.javacore.designpattern.domain.person.Person;
import javamarathon.javacore.designpattern.domain.transport.TransportName;
import javamarathon.javacore.designpattern.domain.transport.TransportType;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        TransportName transportName = new TransportName.TransportBuilder()
                .transportType(TransportType.TRUCK)
                .builder();

        Person person = new Person.PersonBuilder()
                .firstName("Fernando")
                .lastName("Brito")
                .build();

        ReportDto builder = new ReportDto.ReportDtoBuilder()
                .transportName(transportName.getTransportTypeEnum())
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .builder();

        System.out.println(builder);
    }
}
