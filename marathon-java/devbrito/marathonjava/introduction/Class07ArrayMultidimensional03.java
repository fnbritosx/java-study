package devbrito.marathonjava.introduction;

public class Class07ArrayMultidimensional03 {
    public static void main(String[] args) {
        String[] array = {"Yone", "Akali", "Kassadin"};

        String[][] arrayString = new String[3][];

        arrayString[0] = new String[]{"Irelia", "Yasuo"};
        arrayString[1] = array;
        arrayString[2] = new String[] {"Kayn", "Udyr", "Master Yi", "Lilia"};

        String[][] arrayString2 = {{"Irelia", "Yasuo"},{"Yone", "Akali", "Kassadin"},{"Kayn", "Udyr", "Master Yi", "Lilia"}};


        for (String[] arrayBase : arrayString){
            System.out.println("\n----------");
            for(String string : arrayBase){
                System.out.print(string + " ");
            }
            System.out.println(" ");
        }
        for (String[] arrayBase : arrayString2){
            System.out.println("\n----------");
            for(String string : arrayBase){
                System.out.print(string + " ");
            }
            System.out.println(" ");
        }
    }
}
