package devbrito.marathonjava.javacore.finalmodifier.domain;

import java.util.List;

public class Car {
    private String name;
    public static final double LIMIT_SPEED;
    public final Client CLIENT = new Client();

    static{
        LIMIT_SPEED = 300;
    }

    public Car(String name){
        this.name = name;
    }

    public final void printer(){
        System.out.println(name);
    }

    public String getName(){
        return name;
    }

//    public double getLIMIT_SPEED(){
//        return LIMIT_SPEED;
//    }
}
