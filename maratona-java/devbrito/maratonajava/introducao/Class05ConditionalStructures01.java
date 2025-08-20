package devbrito.maratonajava.introducao;

public class Class05ConditionalStructures01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAllowedToBuyAlcohol = age >= 18;

        if (isAllowedToBuyAlcohol){
            System.out.println("Allowed to buy alcohol!");
        } else{
            System.out.println("Not allowed to buy alcohol!");
        }
    }
}
