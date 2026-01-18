package javamarathon.javacore.utility_classes.date.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(); // current date and time
        date.setTime(date.getTime() + 3_600_000); // add one hour (in milliseconds)
        System.out.println(date); // print the updated date
    }
}

