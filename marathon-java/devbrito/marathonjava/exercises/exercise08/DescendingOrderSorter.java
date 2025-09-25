package devbrito.marathonjava.exercises.exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrderSorter {
    public static void main(String[] args) {
        // This program reads three different integer values from the user
        // and prints them in descending order.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter to value A: ");
        int valueA = scanner.nextInt();

        System.out.print("Enter to value B: ");
        int valueB = scanner.nextInt();

        System.out.print("Enter to value C: ");
        int valueC = scanner.nextInt();

        int[] arr = {valueA, valueB, valueC};

        Arrays.sort(arr);

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
