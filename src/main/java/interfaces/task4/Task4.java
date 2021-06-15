package interfaces.task4;

/*
Exercise 4: (3) Create an abstract class with no methods. Derive a class and add a method.
Create a static method that takes a reference to the base class, downcasts it to the derived class, and calls the method.
In main( ), demonstrate that it works. Now put the abstract declaration for the method in the base class,
 thus eliminating the need for the downcast.
 */
public class Task4 {
    public static void main(String[] args) {

        B.g();
    }
}

abstract class A {
    abstract void f();
}

class B extends A {
    void f() {
        System.out.println("its f in b");
    }

    static void g() {
        A a = new B();
        //((B) a).f();
        a.f();
    }
}
