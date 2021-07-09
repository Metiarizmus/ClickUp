package error_handling_with_exceptions.task25;

import error_handling_with_exceptions.task25.exceptions.OneExc;
import error_handling_with_exceptions.task25.exceptions.ThreeExc;
import error_handling_with_exceptions.task25.exceptions.TwoExc;

/*
Exercise 25: (2) Create a three-level hierarchy of exceptions. Now create a base-class A with a method that throws an exception at
the base of your hierarchy. Inherit B from A and override the method so it throws an exception at level two of your hierarchy.
Repeat by inheriting class C from B. In main( ), create a C and upcast it to A, then call the method.
 */
public class Task25 {
    public static void main(String[] args) {

        C c = (C) new A();
        try {
            c.throwOne();
        } catch (ThreeExc threeExc) {
            threeExc.printStackTrace();
        }
    }
}

class A {
    void throwOne() throws OneExc {

    }
}

class B extends A {
    @Override
    void throwOne() throws TwoExc {

    }
}

class C extends B {
    @Override
    void throwOne() throws ThreeExc {

    }
}