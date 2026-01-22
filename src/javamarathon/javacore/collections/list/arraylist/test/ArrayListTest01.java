package javamarathon.javacore.collections.list.arraylist.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<String> name2 = new ArrayList<>();

        name.add("Fernando");
        name.add("Brito");
        name.add("Neto");

         name2.add("Eren");
        name2.add("Yeager");
        name2.add("Ackerman");

        name.addAll(name2);
        name.remove(0);
        name.remove("Eren");

        for(int i = 0; i < name.size(); i++){
            System.out.println(name.get(i));
        }


    }
}
