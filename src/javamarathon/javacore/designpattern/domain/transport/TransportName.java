package javamarathon.javacore.designpattern.domain.transport;

public class TransportName {
    private Enum<TransportType> transportTypeEnum;

    private TransportName(Enum<TransportType> transportTypeEnum) {
        this.transportTypeEnum = transportTypeEnum;
    }

    @Override
    public String toString() {
        return "TransportName{" +
                "transportTypeEnum=" + transportTypeEnum +
                '}';
    }

    public Enum<TransportType> getTransportTypeEnum() {
        return transportTypeEnum;
    }

    public static class TransportBuilder{
        private Enum<TransportType> transportTypeEnum;

        public TransportBuilder transportType(Enum<TransportType> transportTypeEnum) {
            this.transportTypeEnum = transportTypeEnum;
            return this;
        }

        public TransportName builder() {
            return new TransportName(transportTypeEnum);
        }

        public Enum<TransportType> getTransportTypeEnum() {
            return transportTypeEnum;
        }
    }
}
