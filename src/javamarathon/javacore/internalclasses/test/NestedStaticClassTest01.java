package javamarathon.javacore.internalclasses.test;

public class NestedStaticClassTest01 {
    private String name = "Fernando";

    static class NestedStatic {
        private String lastName = "Brito";

        private void print(){
            System.out.println(new NestedStaticClassTest01().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        NestedStatic nestedStatic = new NestedStatic();
        nestedStatic.print();
    }
}
