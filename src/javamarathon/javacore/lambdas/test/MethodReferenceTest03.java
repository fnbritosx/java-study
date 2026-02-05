package javamarathon.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("Isabela", "Miguel", "Fernando"));

        strings.sort(String::compareTo);
        System.out.println(strings);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(strings, "sla"));
    }
}