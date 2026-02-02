package javamarathon.javacore.internalclasses.test;

public class LocalClassTest02 {
    private String name = "Eren";

    void print(String param){
        String lastName = "Yeager";

        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        LocalClassTest02 localClassTest02 = new LocalClassTest02();

        localClassTest02.print("Hi!");
    }
}
