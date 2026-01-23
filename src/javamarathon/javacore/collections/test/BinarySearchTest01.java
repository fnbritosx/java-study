package javamarathon.javacore.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(0);
        nums.add(4);
        nums.add(3);

        Collections.sort(nums);

        System.out.println(nums);

        // retorno é - (ponto de inserção) - 1
        System.out.println(Collections.binarySearch(nums, -2));

    }
}
