package javamarathon.introduction;

public class Class04ConditionalStructures02 {
    public static void main(String[] args) {
        // age < 15  → children's category
        // age >= 15 && age < 18 → youth category
        // agr >= 18 → adult category

        int age = 45;
        String category;

        if (age < 15){
            category = "Children's category!";
        } else if (age >= 15 && age < 18){
            category = "Youth category!";
        } else{
            category = "Adult category!";
        }
        System.out.println(category);
    }
}
