package error_handling_with_exceptions.task1;

import java.util.Scanner;

/*
Exercise 1: (2) Create a class with a main( ) that throws an object of class Exception inside a try block.
Give the constructor for Exception a String argument. Catch the exception inside a catch clause and print the String argument.
Add a finally clause and print a message to prove you were there.
 */
public class Task1 {
    public static void main(String[] args) {

        Test t = new Test();
        try {
            t.f();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.err.println("all good i catch everything");
        }

    }
}

class Exception extends java.lang.Exception {
    public Exception() {}

    public Exception(String s) {
        super(s);
    }
}

class Test {
    public void f() throws Exception {
        System.out.println("its can be calling exception");
        throw new Exception("yes its do it");
    }
}
