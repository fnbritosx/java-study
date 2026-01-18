package javamarathon.javacore.throwable.exception.test;

import javamarathon.javacore.throwable.exception.domain.Read01;
import javamarathon.javacore.throwable.exception.domain.Read02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile01();
    }

    public static void readFile01() {
//        try (Reader reader = new BufferedReader(new FileReader("text.txt"))) {
        try (Read01 reader = new Read01();
             Read02 reader1 = new Read02()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile02() {
        Reader reader02 = null;
        try {
            reader02 = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader02 != null) {
                    reader02.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

