package javamarathon.javacore.collections.equals.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // 1. Reflexivo: x.equals(x) deve ser true
    // 2. Simétrico: se x.equals(y) == true, y.equals(x) deve ser true
    // 3. Transitivo: se x.equals(y) == true e y.equals(z) == true, x.equals(z) deve ser true
    // 4. Consistente: x.equals(y) deve retornar sempre o mesmo valor se os objetos não mudarem
    // 5. Null Treatment: x.equals(null) deve ser sempre false
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;

        Smartphone smartphone = (Smartphone) obj;

        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // 1. Se x.equals(y) == true, então x.hashCode() == y.hashCode()
    // 2. Se x.hashCode() == y.hashCode(), não necessariamente o equals será true
    // 3. O hashCode deve ser consistente: não pode mudar se o objeto não foi alterado
    @Override
    public int hashCode() {
        return this.serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
