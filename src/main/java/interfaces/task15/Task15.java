package interfaces.task15;

//Exercise 15: (2) Modify the previous exercise by creating an abstract class and inheriting that into the derived class.
/*
Exercise 14: (2) Create three interfaces, each with two methods.
Inherit a new interface that combines the three, adding a new method.
Create a class by implementing the new interface and also inheriting from a concrete class.
Now write four methods, each of which takes one of the four interfaces as an argument.
In main( ), create an object of your class and pass it to each of the methods.
*/
public class Task15 {

    static void one(A a) {
        a.name();
    }

    static void two(B b) {
        b.fly();
    }

    static void three(C c) {
        c.song();
    }

    static void four(D d) {
        d.stay();
    }

    public static void main(String[] args) {
        Vorobey v = new Vorobey();

        one(v);
        three(v);
        two(v);
        four(v);
    }
}

interface A {
    String name();

    boolean move();
}

interface B {
    void jump();

    void fly();
}

interface C {
    void song();

    void silence();
}

interface D extends A, B, C {
    void stay();
}

abstract class Bird {

}

class Vorobey extends Bird implements D {


    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public void jump() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void song() {

    }

    @Override
    public void silence() {

    }

    @Override
    public void stay() {

    }
}