package devbrito.marathonjava.javacore.throwable.exception.test;

public class ExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(4, 2));

        System.out.println("Finished code.");
    }

    /**
     *
     * @param a cannot be zero
     * @param b cannot be zero
     * @return
     * @throws IllegalArgumentException if args == 0.
     */

    public static int division(int a, int b) throws IllegalArgumentException{
        if (a == 0 || b == 0){
            throw new IllegalArgumentException ("Illegal argument, cannot be zero. ");
        }
        return a /b;
    }
}
