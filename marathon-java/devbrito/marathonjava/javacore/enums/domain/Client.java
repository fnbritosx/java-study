package devbrito.marathonjava.javacore.enums.domain;

public class Client {
    private String name;
    private final InfoClient infoClient;
    private final PaymentType paymentType;
    private final double originalValue;
    private final double discountValue;

    public Client(String name, InfoClient description, PaymentType paymentType, double originalValue){
        this.name = name;
        this.infoClient = description;
        this.paymentType = paymentType;
        this.originalValue = originalValue;
        this.discountValue = paymentType.discount(originalValue);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", typeClient=" + infoClient.getClientDescription() +
                ", typeClientInt=" + infoClient.getClientId() +
                ", paymentType=" + paymentType +
                ", paymentTypeDiscount=" + discountValue+
                '}';
    }

    public String getNameClient(){
        return name;
    }

    public void setNameClient(String name){
        this.name = name;
    }
}
