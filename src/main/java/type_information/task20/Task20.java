package type_information.task20;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/*
Exercise 20: (5) Look up the interface for java.lang.Class in the JDK documentation from http://java.sun.com.
Write a program that takes the name of a class as a command-line argument, then uses
the Class methods to dump all the information available for that class.
Test your program with a standard library class and a class you create.
 */
public class Task20 {
    public static void main(String[] args) {

        Task20 t = new Task20();

        List list = new ArrayList();

        t.getFullInf(list);


    }

    void getFullInf(Object e) {
        Class<? extends Object> c = e.getClass();

        Field[] declaredFields = c.getDeclaredFields();
        for (Field q : declaredFields) {
            System.out.println("Field --->  " + q);
        }

        System.out.println();

        Method[] declaredMethod = c.getDeclaredMethods();
        for (Method q : declaredMethod) {
            System.out.println("Method --->  " + q);
        }

        Constructor[] decladerConstr = c.getConstructors();
        for (Constructor q : decladerConstr) {
            System.out.println("Constructors --->  " + q);
        }

        System.out.println("Superclass --->  " + e.getClass().getSuperclass());
    }
}
