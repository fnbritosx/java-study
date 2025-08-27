package devbrito.marathonjava.introduction;

public class Class05RepetitionStructure01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println("While: " + ++count);
        }

        count = 12;
        do {
            System.out.println("Do: " + count++);
        } while (count < 10);

        for (int i = 0; i < 10; i++){
            System.out.println("For: " + i);
        }
    }
}
