package javamarathon.javacore.collections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {

        Map<Integer, String> sla = new HashMap<>();

        sla.put(1, "Sim");
        sla.put(2, "Não");
        sla.put(3, "Não sei");
        sla.putIfAbsent(3, "sla");

        for (Map.Entry<Integer, String> n : sla.entrySet()) {
            System.out.println(n.getKey() + " - " + n.getValue());
        }
    }
}
