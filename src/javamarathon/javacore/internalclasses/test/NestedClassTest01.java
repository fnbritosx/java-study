package javamarathon.javacore.internalclasses.test;

public class NestedClassTest01 {
    private String name = "Fernando Brito";

    // Inner Class (Non-static nested class)
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);

            // referência da class interna
            System.out.println(this);

            // referência da classe externa
            System.out.println(NestedClassTest01.this);
        }
    }
    public static void main(String[] args) {
        // forma 01
        NestedClassTest01 nestedClassTest01 = new NestedClassTest01();
        Inner inner = nestedClassTest01.new Inner();

        // forma 2
        Inner inner2 = new NestedClassTest01().new Inner();

        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();

    }
}
