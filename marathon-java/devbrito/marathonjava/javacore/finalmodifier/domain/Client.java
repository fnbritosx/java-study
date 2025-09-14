package devbrito.marathonjava.javacore.finalmodifier.domain;

public class Client  {
    private String name;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
