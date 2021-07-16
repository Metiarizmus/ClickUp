package type_information.task10;

import java.util.Arrays;
import java.util.List;

/*
Exercise 10: (3) Write a program to determine whether an array of char is a primitive type or a true Object.
 */
public class Task10 {


    public static void main(String[] args) {

        char[] c = {'a','b','c'};

        System.out.println(c instanceof Object); //=true

        //An array in Java is an object.
    }

}
