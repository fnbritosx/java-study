package devbrito.marathonjava.introduction;

public class Class06Arrays03 {
    public static void main(String[] args) {
        // Print all names in array
        String[] names = new String[3];
        names[0] = "Eren";
        names[1] = "Naruto";
        names[2] = "Luffy";

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
