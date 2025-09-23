package devbrito.marathonjava.javacore.throwable.runtime_exception.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        makesConnection();
    }
    public static void makesConnection(){
        try {
            System.out.println("Opening the file");
            System.out.println("Writing in the file");
            throw new RuntimeException();
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            System.out.println("Closing the file");
        }
    }
}
