package error_handling_with_exceptions.task10;

import error_handling_with_exceptions.task9.myException.OneException;
import error_handling_with_exceptions.task9.myException.TwoException;

/*
Exercise 10: (2) Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define.
In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you define).
Test your code in main( ).
 */
public class Task10 {
    public static void main(String[] args) {

        Test t = new Test();
        t.f();

    }
}

class Test {

    void f() {

        try {
            try {
                g();
            } catch(OneException ge) {
                ge.printStackTrace();
                throw new TwoException();
            }
        } catch(TwoException he) {
            he.printStackTrace(System.out);
        }

    }

    void g() throws OneException {

    }
}