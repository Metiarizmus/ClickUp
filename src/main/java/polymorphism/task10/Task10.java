package polymorphism.task10;

/*
Exercise 10: (3) Create a base class with two methods. In the first method, call the second method.
Inherit a class and override the second method.
Create an object of the derived class, upcast it to the base type, and call the first method. Explain what happens
*/
public class Task10 {
    public static void main(String[] args) {

        B b = new B();

        A a = (B) b;

        a.one();

    }
}

class A {
    void one(){
        System.out.println("one in A");
        two();
    }
    void two(){
        System.out.println("two in A");
    }
}

class B extends A {
    @Override
    void two() {
        System.out.println("two in B");
    }
}
