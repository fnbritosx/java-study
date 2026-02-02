package javamarathon.javacore.behaviorparameterization.test;

import javamarathon.javacore.behaviorparameterization.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParametrizationTest01 {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("red", 2010), new Car("green", 2015), new Car("black", 1990));
        System.out.println(filtered(cars, car -> car.getColor().equals("black")));

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filtered(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filtered(List<T> objects , Predicate<T> condition){

        List<T> filteredT = new ArrayList<>();

       for (T object : objects){
           if (condition.test(object)){
               filteredT.add(object);
           }
       }

       return filteredT;
    }
}
