package javamarathon.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> list = List.of("Fernando", "sla", "três");

        System.out.println(map(list, s -> s.length()));
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> arraySize = new ArrayList<>();

        for (T t : list) {
            R apply = function.apply(t);
            arraySize.add(apply);
        }

        return arraySize;
    }
}
