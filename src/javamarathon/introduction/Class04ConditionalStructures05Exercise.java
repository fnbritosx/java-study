package javamarathon.introduction;

public class Class04ConditionalStructures05Exercise {
    public static void main(String[] args) {
        // Using switch and given the values of 1 to 7, print if is business day or weekend
        // Considering 1 as sunday

        byte day = 3;

        switch (day){
            case 1:
            case 7:
                System.out.println("Weekend.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business day.");
                break;
            default:
                System.out.println("Invalid option.");
        }

    }
}
