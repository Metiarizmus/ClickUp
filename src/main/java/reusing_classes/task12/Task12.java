package reusing_classes.task12;

/*
Create a class called Root that contains an instance of each of the classes (that you also create) named Component1, Component2, and Component3.
Derive a class Stem from Root that also contains an instance of each “component.”
All classes should have default constructors that print a message about that class
*/
//Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9
public class Task12 {
    public static void main(String[] args) {
        Stem stem = new Stem();

        try {

        } finally {
            stem.dispose();
        }
    }
}

class Component1 {
    Component1() {
        System.out.println("default comp1");
    }

    Component1(String s) {
        System.out.println("it's component1");
    }

    void dispose() {
        System.out.println("component1 dispose");
    }
}

class Component2 {
    Component2(String s) {
        System.out.println("it's component2");
    }

    Component2() {
        System.out.println("default comp2");
    }

    void dispose() {
        System.out.println("component2 dispose");
    }
}

class Component3 {
    Component3() {
        System.out.println("default comp1");
    }

    Component3(String s) {
        System.out.println("it's component3");
    }

    void dispose() {
        System.out.println("component3 dispose");
    }
}

class Root {
    private Component1 c1;
    private Component2 c2;
    private Component3 c3;

    Root() {
        System.out.println("default root");
    }


    Root(String s) {
        System.out.println("It's root");
        c1 = new Component1("1");
        c2 = new Component2("2");
        c3 = new Component3("3");
    }

    void dispose() {
        c1.dispose();
        c2.dispose();
        c3.dispose();
        System.out.println("root dispose");
    }
}

class Stem extends Root {
    private Component1 c1;
    private Component2 c2;
    private Component3 c3;

    Stem() {
        super("Hello root");
        System.out.println("It's stem");
        c1 = new Component1("1");
        c2 = new Component2("2");
        c3 = new Component3("3");
    }

    @Override
    void dispose() {
        super.dispose();
        System.out.println("stem dispose");
    }
}
