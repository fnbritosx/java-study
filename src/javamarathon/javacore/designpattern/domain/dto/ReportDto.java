package javamarathon.javacore.designpattern.domain.dto;

import javamarathon.javacore.designpattern.domain.transport.TransportName;
import javamarathon.javacore.designpattern.domain.transport.TransportType;

public class ReportDto {
    private Enum<TransportType> transportName;
    private String firstName;
    private String lastName;

    private ReportDto(Enum<TransportType> transportName, String firstName, String lastName) {
        this.transportName = transportName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "transportName=" + transportName +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class ReportDtoBuilder{
        private Enum<TransportType> transportName;
        private String firstName;
        private String lastName;


        public ReportDtoBuilder transportName(Enum<TransportType> transportName){
            this.transportName = transportName;
            return this;
        }

        public ReportDtoBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public ReportDtoBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public ReportDto builder(){
            return new ReportDto(transportName, firstName, lastName);
        }
    }
}
