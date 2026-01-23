package javamarathon.javacore.collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionArrayToListTest01 {
    public static void main(String[] args) {
        List<Integer> listNumbs = new ArrayList<>();

        listNumbs.add(1);
        listNumbs.add(2);
        listNumbs.add(3);


        // colocar new Integer[0] é mais performático do que colocar new Integer(listNumbs.size).
        Integer[] arrayNumbs = listNumbs.toArray(new Integer[0]);

        System.out.println(listNumbs);
        System.out.println(Arrays.toString(arrayNumbs));

        System.out.println("-------------");

        Integer[] array = new Integer[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println(Arrays.toString(array));

        // cuidado pois o asList cria uma lista falsa. A lista fica setada para o tamanhodo array, você não consegue adicionar nem remover nada.]
        // toda modificação que você faz na nova list, afeta o array também.
//        List<Integer> arrayToList = Arrays.asList(array);
//
//        arrayToList.remove(3);

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        list.addAll(List.of(4, 5, 6));

        System.out.println(list);
    }
}
