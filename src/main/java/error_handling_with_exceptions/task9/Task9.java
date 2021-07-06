package error_handling_with_exceptions.task9;

import error_handling_with_exceptions.task9.myException.OneException;
import error_handling_with_exceptions.task9.myException.ThreeException;
import error_handling_with_exceptions.task9.myException.TwoException;

/*
Exercise 9: (2) Create three new types of exceptions. Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class Task9 {
    public static void main(String[] args) {

        Home h = new Home();
        try {
            h.build();
        } catch (Exception e) {

        }
    }
}

class Home {

    void build() throws OneException, TwoException, ThreeException {
        System.out.println("Very many count exception!");

    }
}
