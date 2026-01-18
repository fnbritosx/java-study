package javamarathon.introduction;

public class Class07ArrayMultidimensional01 {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];

        numbers[0][0] = 19;
        numbers[0][1] = 14;
        numbers[0][2] = 4;

        numbers[1][0] = 35;
        numbers[1][1] = 3;
        numbers[1][2] = 6;

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}