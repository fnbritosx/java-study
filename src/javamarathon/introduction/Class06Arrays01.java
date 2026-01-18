package javamarathon.introduction;

public class Class06Arrays01 {
    public static void main(String[] args) {
        // In arrays, primitive data types become references.
        // syntax to create an array:
        // data_type[] variableName = new data_type[memorySize];

        int[] ages = new int[3];

        ages[0] = 19;
        ages[1] = 14;
        ages[2] = 4;

        System.out.println(ages[0]);
    }
}
