package javamarathon.javacore.collections.test;

import javamarathon.javacore.collections.domain.Consumidor;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class ComparatorById implements Comparator<Consumidor>{
    @Override
    public int compare(Consumidor o1, Consumidor o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<Consumidor, String> navigableMap = new TreeMap<>(new ComparatorById());

        Consumidor consumidor01 = new Consumidor("Fernando");
        Consumidor consumidor02 = new Consumidor("Miguel");

        navigableMap.put(consumidor01, "Irelia");
        navigableMap.put(consumidor02, "Yone");

        for (Map.Entry<Consumidor, String> entry : navigableMap.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue());
        }

        System.out.println(navigableMap.headMap(consumidor02));
    }
}
