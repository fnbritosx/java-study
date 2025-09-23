package devbrito.marathonjava.javacore.throwable.runtime_exception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Inside the IllegalArgumentException | ArrayIndexOutOfBoundsException | NullPointerException");
        }  catch (RuntimeException e) {
            System.out.println("Inside the RuntimeException");
        }

//        try{
//            newExceptionTest();
//        }catch (SQLException e){
//            System.out.println("Inside the SQLException");
//        }catch (FileNotFoundException e){
//            System.out.println("FileNotFoundException");
//        }
        try{
            newExceptionTest();
        }catch (Exception e){
            System.out.println("Handling both exceptions together");
        }
    }

    public static void newExceptionTest() throws SQLException, FileNotFoundException {

    }
}
